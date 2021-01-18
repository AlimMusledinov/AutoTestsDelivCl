import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobCourierPage {

    WebDriver driver;

    public JobCourierPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='popup__title']")
    private WebElement pressCity;

    @FindBy(xpath = "//span[text()='Стань курьером или сборщиком заказов']")
    private WebElement jobCourierTitle;



    public String getTextPressCity(){
        String value = pressCity.getText();
        return value;
    }




}
