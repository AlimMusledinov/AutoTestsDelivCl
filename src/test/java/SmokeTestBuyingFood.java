import org.junit.jupiter.api.Test;

public class SmokeTestBuyingFood extends BrowserSettings{

    @Test
    public void buyingFood(){

        mainPage.open();
        mainPage.inputAddressLocation("Варшавское шоссе 11");
        mainPage.searchByText("Subway");
        mainPage.clickLogoSubway();
        //Assertions.assertEquals("Subway", subwayPage.getTextTitleSubwayPage());
        subwayPage.selectHotItalianSandwich15Cm();

    }

}
