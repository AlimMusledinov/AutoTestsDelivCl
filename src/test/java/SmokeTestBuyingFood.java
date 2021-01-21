import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmokeTestBuyingFood extends BrowserSettings{

    @Epic("Smoke test сайта https://www.delivery-club.ru/moscow")
    @Feature("Оформление заказа в ресторе Subway до корзины (далее тест не возможет из-за отсуетсвия тестовых данных")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Открываем главную страницу,выбираем локацию,находим в форме поиска ресторан Subway ," +
                  "переходим на страницу ресторана, выбираем сэндвич,ингридиенты,указываем количество -4шт.," +
                  "нажимаем на кнопку 'добавить',нажимаем на кнопку 'заказать',в появившемся окне " +
                  "'Оформление заказа' в корзине проверяем наличие всего ранее выбранного." )
    @Test
    public void buyingFood(){

        mainPage.open();
        mainPage.inputAddressLocation("Варшавское шоссе 11");
        mainPage.searchByText("Subway");
        Assertions.assertEquals("Subway", subwayPage.getTextTitleSubwayPage());
        subwayPage.selectHotItalianSandwich15Cm();
        subwayPage.selectallIngredients();
        subwayPage.pressToIncreaseTheQuantityBy4();
        subwayPage.pressAddButton();
        subwayPage.pressBuyButton();
        Assertions.assertEquals("Оформление заказа", checkoutPage.getTextTitleCheckoutPage());
        Assertions.assertEquals("Сэндвич \"Острый итальянский\" 15 см",checkoutPage.getTexthotItalianSandwich15CmInTheBasket());
        Assertions.assertTrue(checkoutPage.checkingTheSandwichIngredientsInTheBasket());
    }
}
