import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SubwayPage {
    public SubwayPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    WebDriver driver;


    @FindBy(xpath = "//h1[text()='Subway']")
    private WebElement titleSubwayPage;


    public String getTextTitleSubwayPage() {
        String value = titleSubwayPage.getText();
        return value;
    }


    // МЕНЮ СЭНДВИЧИ

    @FindBy(xpath = "(//div[@class='menu-product__title'])[2]")
    private WebElement hotItalianSandwich15Cm;

    @FindBy(xpath = "//div[text()='Сэндвич \"БМТ\" 15 см")
    private WebElement btmSandwich15Cm;


    // СЭНДВИЧИ - опции

    @FindBy(xpath = "//span[text()='Зерновой']")
    private WebElement grainBread;

    @FindBy(xpath = "(//label[@class ='label--def ingredients-list__label']//span[text()='Майонез'])[1]")
    private WebElement mayonnaise;

    @FindBy(xpath = "(//label[@class ='label--def ingredients-list__label']//span[text()='Барбекю'])[2]")
    private WebElement barbecue;

    @FindBy(xpath = "(//label[@class ='label--def ingredients-list__label']//span[text()='Кетчуп'])[3]")
    private WebElement ketchup;

    @FindBy(xpath = "//span[text()='Нет']")
    private WebElement notToastedSandwich;

    @FindBy(xpath = "//span[@class='ingredients-list__ingredient-name']")
    private List<WebElement> allIngredients;

    @FindBy(xpath = "//button[@class='product-quantity-controls__plus btn-light-gray--plus']")
    private WebElement theAddButton;

    @FindBy(xpath = "//button[@class='product-quantity-controls__plus btn-light-gray--plus']")
    private WebElement toIncreaseTheQuantity;

    @FindBy(xpath = "//button[@class='green-btn--md product-popup__add']")
    private WebElement addButton;

    @FindBy(xpath = "//button[@class='green-btn--md btn--with-right-block basket-button-submit__btn']")
    private WebElement buyButton;

    //Выбор сэндвичей с дополнениями

    public void selectHotItalianSandwich15Cm() {
        //driver.switchTo().activeElement().click();
        hotItalianSandwich15Cm.click();
    }

//  driver.switchTo().activeElement().sendKeys(adress);
    public void selectallIngredients() {
        for (WebElement checkBoxes : allIngredients) {
            checkBoxes.click();
        }
    }

    public void pressToIncreaseTheQuantityBy4(){
        toIncreaseTheQuantity.click();
        toIncreaseTheQuantity.click();
        toIncreaseTheQuantity.click();
    }
    public void pressAddButton(){
        addButton.click();
    }

    public void pressBuyButton(){
        buyButton.click();
    }

}
