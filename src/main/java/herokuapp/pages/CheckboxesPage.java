package herokuapp.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CheckboxesPage {

    String checkbox = ".//input[%s]";

    @Step("Нажать на чекбокс по индексу '{index}'")
    public void clickOnCheckbox(String index) {
        $x(format(checkbox, index)).click();
    }

    @Step("Проверить корректный статус чекбокса по индексу '{index}'")
    public void checkCorrectStatusCheckbox(String index) {
        switch (index) {
            case "1" -> $x(format(checkbox, index)).shouldBe(Condition.checked);
            case "2" -> $x(format(checkbox, index)).shouldNotBe(Condition.checked);
            default -> System.out.println("Incorrect checkbox index");
        }
    }

}