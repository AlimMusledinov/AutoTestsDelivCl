import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckingLinksMainPage extends BrowserSettings {

    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка ссылок на главной странице")
    @Description("Открываем главную страницу,кликаем на ссылку 'Для ресторанов'.Проверяем переход на страницу 'Для ресторанов' ")
    @Test
  public void openLinkForRestaurants() {
        mainPage.open();
        mainPage.clickLinkForRestaurants();
        Assertions.assertEquals("Информация для партнеров", partnersPage.getTextInfForPartButton());
    }
    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка ссылок на главной странице")
    @Description("Открываем главную страницу,кликаем на ссылку 'Курьерам'.Проверяем переход на страницу 'Курьерам' ")
    @Test
    public void openLinkCouier(){
        mainPage.open();
        mainPage.clickLinkCouier();
        Assertions.assertEquals("Выберите город", jobCourierPage.getTextPressCity());
    }
    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка ссылок на главной странице")
    @Description("Открываем главную страницу,кликаем на ссылку 'Пресс-центр'.Проверяем переход на страницу 'Пресс-центр' ")
    @Test
    public void openLinkPressCenter(){
        mainPage.open();
        mainPage.clickLinkPressCenter();
        Assertions.assertEquals("Пресс-центр", pressCenterPage.getTextTitlePressCenter());
    }
    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка ссылок на главной странице")
    @Description("Открываем главную страницу,кликаем на ссылку 'Условия акций'.Проверяем переход на страницу 'Условия акций' ")
    @Test
    public void openLinkPromoPage(){
        mainPage.open();
        mainPage.clickLinkPromo();
        Assertions.assertEquals("Условия проведения акций", promoPage.getTextTitlePromo());
    }
    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка ссылок на главной странице")
    @Description("Открываем главную страницу,кликаем на ссылку 'Контакты'.Проверяем переход на страницу 'Контакты' ")
    @Test
    public void openLinkContacts(){
        mainPage.open();
        mainPage.clickLinkContacts();
        Assertions.assertEquals("Контакты", contactPage.getTextContactsTitle());
    }
}