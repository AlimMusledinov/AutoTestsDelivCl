import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSettings {

    public WebDriver driver;
    public MainPage mainPage;
    public PartnersPage partnersPage;
    public JobCourierPage jobCourierPage;
    public PressCenterPage pressCenterPage;
    public PromoPage promoPage;
    public ContactPage contactPage;
    public OkPage okPage;
    public FacebookPage faсebookPage;
    public VkPage vkPage;
    public InstPage instPage;
    public SubwayPage subwayPage;
    public CheckoutPage checkoutPage;


    @BeforeEach
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        partnersPage = new PartnersPage(driver);
        jobCourierPage = new JobCourierPage(driver);
        pressCenterPage = new PressCenterPage(driver);
        promoPage = new PromoPage(driver);
        contactPage = new ContactPage(driver);
        okPage = new OkPage(driver);
        faсebookPage = new FacebookPage(driver);
        vkPage = new VkPage(driver);
        instPage = new InstPage(driver);
        subwayPage = new SubwayPage(driver);
        checkoutPage = new CheckoutPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}
