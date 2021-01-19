import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VkPage {
    public VkPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    WebDriver driver;

    @FindBy(xpath = "//h1[@class='page_name']")
    private WebElement pageNameVk;

    public String getTextOkPageName(){ String value= pageNameVk.getText(); return value; }


}
