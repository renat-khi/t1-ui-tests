package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$x;

public class InputsPage {

    SelenideElement input = $x(".//input[@type='number']");

    public void enterValueAndCheckInput(String value) {
        input.clear();
        input.sendKeys(value);
        input.shouldHave(value(value));
    }

}