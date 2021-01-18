import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PressCenterPage {

    public PressCenterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    WebDriver driver;

    @FindBy(xpath = "//div[@field='tn_text_1568887516902']")
    private WebElement titlePressCenter;

    public String getTextTitlePressCenter(){
        String value3 = titlePressCenter.getText();
        return value3;
    }


}
