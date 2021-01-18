import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckingFiltersAndSearchMainPage extends BrowserSettings{

    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка фильтров и поиска на главной странице")
    @Description("Открываем главную страницу,нажимаем на кнопку Фильтры,сликаем на все чек-боксы.Проверяем что все чек-боксы выбраны")
    @Test
    public void  filterByCheckboxes(){
        mainPage.open();
        mainPage.clickFiltersPanelButton();
        mainPage.selectCheckBoxesFilter();
        mainPage.pressButtonCheckBoxesFilter();
        Assertions.assertTrue(mainPage.isSelectedCheckBoxesFilter());

    }
    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка кнопок-фильтров на главной странице")
    @Description("Открываем главную страницу,нажимаем на все кнопки-фильтры.Проверяем что все кнопки-фильтры выбраны")
    @Test
    public void filterWithButtons(){
        mainPage.open();
        mainPage.selectButtonFilters();
        Assertions.assertTrue(mainPage.isSelectedButtonFilters());
    }

    @Epic("Тестирование главной страницы сайта https://www.delivery-club.ru/moscow")
    @Feature("Проверка формы поиска по введенному тексту на главной странице")
    @Description("Открываем главную страницу,вводим в форму поиска Пивбум.Проверяем что Пивбум найден")
    @Test
    public void searchByText(){
        mainPage.open();
        mainPage.searchByText("Пивбум");
        Assertions.assertEquals("Пивбум", mainPage.getTextLogoPivbum());
    }
}
