import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnersPage {
    WebDriver driver;

    public PartnersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(xpath = "(//div[@class='partners-navigation__item'])[1]")
    WebElement infForPartButton;




    public String getTextInfForPartButton(){
        String text1 = infForPartButton.getText();
        return text1;
    }

}
