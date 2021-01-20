import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmokeTestBuyingFood extends BrowserSettings{

    @Test
    public void buyingFood(){

        mainPage.open();
        mainPage.inputAddressLocation("Варшавское шоссе 11");
        mainPage.searchByText("Subway");
        Assertions.assertEquals("Subway", subwayPage.getTextTitleSubwayPage());
        subwayPage.selectHotItalianSandwich15Cm();
        subwayPage.selectallIngredients();
        subwayPage.pressToIncreaseTheQuantity();
        subwayPage.pressAddButton();
        subwayPage.pressBuyButton();
    }

}
