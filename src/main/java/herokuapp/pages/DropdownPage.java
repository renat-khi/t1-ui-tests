package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$x;

public class DropdownPage {

    SelenideElement dropdown = $x(".//select[@id='dropdown']");

    @Step("В выпадающем списке выбрать значение '{value}'")
    public void selectInDropdown(String value) {
        dropdown.selectOption(value);
    }

    @Step("Проверить что в выпадающем списке отображается значение '{value}'")
    public void checkActualValueInDropdown(String value) {
        dropdown.$(withText(value)).shouldBe(selected);
    }

}