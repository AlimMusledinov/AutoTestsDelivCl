import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoPage {

    WebDriver driver;

    public PromoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1[@class='promo-rules__title']")
    private WebElement titlePromo;

    public String getTextTitlePromo(){
        String value = titlePromo.getText();
        return value;
    }

}
