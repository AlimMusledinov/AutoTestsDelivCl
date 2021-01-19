import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstPage {
    public InstPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    WebDriver driver;

    @FindBy(xpath = "//h2[text()='delivery_club']")
    private WebElement instPageName;

    public String getTextInstPageName(){
        String value = instPageName.getText();
        return value;
    }
}
