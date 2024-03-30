package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$x;

public class InputsPage {

    SelenideElement input = $x(".//input[@type='number']");

    @Step("Ввести значение '{value}'")
    public void enterValue(String value) {
        input.clear();
        input.sendKeys(value);
    }

    @Step("Проверить что введено значение '{value}'")
    public void checkThatValueIsEntered(String value) {
        input.shouldHave(value(value));
    }

}