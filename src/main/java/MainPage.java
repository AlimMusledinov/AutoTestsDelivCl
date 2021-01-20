import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.print.DocFlavor;
import java.util.List;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void open(){ driver.get("https://www.delivery-club.ru/moscow");}

    // указать адрес доставки для подбора доступных ресторанов

    @FindBy(xpath = "//span[@class='icon__container address-input__icon']")
    public WebElement addressLocation;
    @FindBy(xpath = "//span[@class='address-input__location']")
    public WebElement selectAddressLocation;


    public void inputAddressLocation(String adress){
        addressLocation.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().activeElement().sendKeys(adress);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





    // Форма поиска по тексту
    @FindBy(xpath = "//input[@class='vendors-suggests__input']")
    public WebElement theSearchForm;

    @FindBy(xpath = "//span[@class='vendors-suggest-item__title']")
    public WebElement selectRez;

    @FindBy(xpath = "(//div[@class='vendor-item-products__title'])[1]")
    public WebElement logoPivbum;

    // Поиск по тексту
    public void searchByText(String text){
        theSearchForm.sendKeys(text);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectRez.click();
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


    //Выбрать фильты (чекбоксы)
    public void clickFiltersPanelButton(){ filtersPanel.click(); }
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



    // ФИЛЬТРЫ (кнопочные)
    @FindBy(xpath = "//a[@class='cuisines-panel__slide-btn']")
    public List<WebElement>  buttonFilters;

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


    // ССЫЛКИ на страницы сайта
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

    //  ПЕРЕХОДЫ ПО ССЫЛКАМ на страницы сайта
    public void clickLinkForRestaurants(){ linkForRestaurants.click(); }
    public void clickLinkCouier(){ linkCouier.click(); }
    public void clickLinkPressCenter(){
        linkPressCenter.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickLinkPromo(){
        linkPromo.click();
    }
    public void clickLinkContacts(){
        linkContacts.click();
    }


    //СCЫЛКИ НА РЕСТОРАНЫ

    @FindBy(xpath = "(//a[@href='/srv/Subway_micluho'])[1]")
    private WebElement logoSubway;

    //Переход на НА СТАРНИЦЫ РЕСТОРАНОВ


    public void clickLogoSubway(){
        logoSubway.click();
    }




    // ССЫЛКИ на социальные сети
    @FindBy(xpath = "//a[@class='footer-links__social-link footer-links__social-ok']")
    private WebElement linkOk;


    @FindBy(xpath = "//a[@class='footer-links__social-link footer-links__social-vk']")
    private WebElement linkVk;


    @FindBy(xpath = "//a[@class='footer-links__social-link footer-links__social-fb']")
    private WebElement linkFasebook;

    @FindBy(xpath = "//a[@class='footer-links__social-link footer-links__social-ig']")
    private WebElement linkInst;



    //  ПЕРЕХОДЫ на страницы на социальных сетей

    public void clickLinkOk(){ linkOk.click();for ( String windowHandle : driver.getWindowHandles()){
        driver.switchTo().window(windowHandle);
    } }

    public void clickLinkVk(){ linkVk.click(); for ( String windowHandle : driver.getWindowHandles()){
        driver.switchTo().window(windowHandle); } }

    public void clickLinkFacebook() {
        linkFasebook.click();
        for ( String windowHandle : driver.getWindowHandles()){ driver.switchTo().window(windowHandle); } }

    public void clickLinkInst() {
        linkInst.click();
        for ( String windowHandle : driver.getWindowHandles()){ driver.switchTo().window(windowHandle); } }
    }
