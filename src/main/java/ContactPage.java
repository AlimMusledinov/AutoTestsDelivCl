import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    WebDriver driver;

    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//h1[@class='left-column__title contacts__title']")
    private WebElement contactsTitle;

    public String getTextContactsTitle(){
        String value4 = contactsTitle.getText();
        return value4;
    }



}
