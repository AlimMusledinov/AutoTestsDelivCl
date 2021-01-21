import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;


public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[text()='Оформление заказа']")
    private WebElement titleCheckoutPage;

    public String getTextTitleCheckoutPage(){
        String value = titleCheckoutPage.getText();
        return value;
    }



    @FindBy(xpath = "//div[@class='basket-product__name']")
   private WebElement hotItalianSandwich15CmInTheBasket;

    public String getTexthotItalianSandwich15CmInTheBasket(){
        String value = hotItalianSandwich15CmInTheBasket.getText();
        return value;
    }


    @FindBy(xpath = "//li[@class='basket-ingredients__title']")
    List<WebElement> sandwichIngredientsInTheBasket;

    public boolean checkingTheSandwichIngredientsInTheBasket() {
        for (WebElement ingredientsTitle : sandwichIngredientsInTheBasket) {
            ingredientsTitle.getText().contains("Салат");
            ingredientsTitle.getText().contains("Соль");
            ingredientsTitle.getText().contains("Перец болгарский");
            ingredientsTitle.getText().contains("Нет");
            ingredientsTitle.getText().contains("Перец халапеньо");
            ingredientsTitle.getText().contains("Винный уксус");
            ingredientsTitle.getText().contains("Сыр чеддер 12");
            ingredientsTitle.getText().contains("Лук красный");
            ingredientsTitle.getText().contains("Маринованные огурцы");
            ingredientsTitle.getText().contains("Свежие огурцы");
            ingredientsTitle.getText().contains("Чипотл (острый)");
            ingredientsTitle.getText().contains("Бекон 24 г");
            ingredientsTitle.getText().contains("Салями 25 г");
            ingredientsTitle.getText().contains("Пепперони 25 г");
            ingredientsTitle.getText().contains("Хэшбрауны 120г");
            ingredientsTitle.getText().contains("Омлет 86 г");
            ingredientsTitle.getText().contains("Жареный лук 10г");
            ingredientsTitle.getText().contains("Сыр 10г");
            ingredientsTitle.getText().contains("Крем чиз 40г");
            ingredientsTitle.getText().contains("Грибы 60г");
            ingredientsTitle.getText().contains("Острый Итальянский 50г");
        }
        return true;
    }

}



