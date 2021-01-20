import org.openqa.selenium.By;
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

    @FindBy(xpath = "//span[text()='С сыром']")
    private WebElement withCheese;

    @FindBy(xpath = "//span[text()='Оливки']")
    private WebElement olives;

    @FindBy(xpath = "//span[text()='Зерновой']")
    private WebElement grainBread;

    @FindBy(xpath = "(//label[@class ='label--def ingredients-list__label']//span[text()='Майонез'])[1]")
    private WebElement mayonnaise;

    @FindBy(xpath = "(//label[@class ='label--def ingredients-list__label']//span[text()='Барбекю'])[2]")
    private WebElement barbecue;

    @FindBy(xpath = "(//label[@class ='label--def ingredients-list__label']//span[text()='Кетчуп'])[3]")
    private WebElement ketchup;

    @FindBy(xpath = "//span[text()='Да']")
    private WebElement notToastedSandwich;

    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> allIngredients;


    //Выбор сэндвичей с дополнениями

    public void selectParametersHotItalianSandwich15Cm() {
        withCheese.click();
        olives.click();
        grainBread.click();
        mayonnaise.click();
        barbecue.click();
        ketchup.click();
        notToastedSandwich.click();
    }

    public void selectSllIngredients() {
        for (WebElement checkBoxes : allIngredients) {
            checkBoxes.click();
        }
    }

    public void selectHotItalianSandwich15Cm() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hotItalianSandwich15Cm.click();

    }
}
