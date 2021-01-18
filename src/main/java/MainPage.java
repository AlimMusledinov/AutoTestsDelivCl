
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    WebDriver driver;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Форма поиска по тексту
    @FindBy(xpath = "//input[@class='vendors-suggests__input']")
    public WebElement theSearchForm;

    @FindBy(xpath = "(//div[@class='vendor-item-products__title'])[1]")
    public WebElement logoPivbum;

    // Поиск по тексту
    public void searchByText(String text){
        theSearchForm.sendKeys(text);
        theSearchForm.sendKeys(Keys.ENTER);
    }
    public String getTextLogoPivbum(){
        String value = logoPivbum.getText();
        return value;
    }


    // ФИЛЬТРЫ ( чекбоксы)
    @FindBy(xpath = "//button[@class='filters-panel__show-btn']")
    public WebElement filtersPanel;
    @FindBy(xpath = "//li[@class='filters-popup__filter-item']")
    public List<WebElement> checkBoxesFilter;
    @FindBy(xpath = "//button[@class='green-btn filters-popup__btn']")
    public WebElement buttonCheckBoxesListFilter;

    // ФИЛЬТРЫ (кнопочные)
    @FindBy(xpath = "//a[@class='cuisines-panel__slide-btn']")
    public List<WebElement>  buttonFilters;


    //Выбрать фильты (чекбоксы)
    public void selectCheckBoxesFilter() {                // все чекбоксы
        for (WebElement checkbox : checkBoxesFilter) {
            checkbox.click();
        }
    }
        public boolean isSelectedCheckBoxesFilter() {           // проверка выбора
            for (WebElement checkbox : checkBoxesFilter) {
                checkbox.isSelected();
            }
            return true;
        }

    public void pressButtonCheckBoxesFilter(){
        buttonCheckBoxesListFilter.click();
    }

    //Выбрать фильты (кнопочные)
    public void selectButtonFilters() {                // все кнопки
        for (WebElement button : buttonFilters) {
            button.click();
        }
    }
    public boolean isSelectedButtonFilters() {           // проверка выбора
        for (WebElement checkbox : buttonFilters) {
            checkbox.isSelected();
        }
        return true;
    }

    // ССЫЛКИ
    @FindBy(xpath = "(//a[@class='footer-links__menu-link link'])[1]")
    private  WebElement linkForRestaurants;
    @FindBy(xpath = "(//a[@class='footer-links__menu-link link'])[2]")
    private WebElement linkCouier;
    @FindBy(xpath = "(//a[@class='footer-links__menu-link link'])[3]")
    private WebElement linkPressCenter;
    @FindBy(xpath = "(//a[@class='footer-links__menu-link link'])[4]")
    private WebElement linkPromo;
    @FindBy(xpath = "(//a[@class='footer-links__menu-link link'])[5]")
    private WebElement linkContacts;



    public void open(){ driver.get("https://www.delivery-club.ru/moscow");}

    public void clickFiltersPanelButton(){ filtersPanel.click(); }

    //  ПЕРЕХОДЫ ПО ССЫЛКАМ
    public void clickLinkForRestaurants(){ linkForRestaurants.click(); }
    public void clickLinkCouier(){ linkCouier.click(); }
    public void clickLinkPressCenter(){
        linkPressCenter.click();
    }
    public void clickLinkPromo(){
        linkPromo.click();
    }
    public void clickLinkContacts(){
        linkContacts.click();
    }


}