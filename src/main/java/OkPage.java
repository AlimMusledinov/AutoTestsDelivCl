import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OkPage {
    WebDriver driver;

    public OkPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[text()='Delivery Club — доставка еды']")
    private WebElement okPageName;

    public String getTextOkPageName(){
        String value7 = okPageName.getText();
        return value7;
    }
}
