import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
    WebDriver driver;

    public FacebookPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

@FindBy(xpath = "//div[@class='_3oba']")
private WebElement logoFacebook;

   public String getTextPagelogoFaсebook(){
        String value = logoFacebook.getText();
        return value;
   }
}
