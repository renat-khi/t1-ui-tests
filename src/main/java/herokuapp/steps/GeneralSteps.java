package herokuapp.steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public interface GeneralSteps {

    @Step("Нажать на ссылку '{linkName}'")
    default void clickOnLinkByName(String linkName) {
        $x(format(".//a[text()='%s']", linkName)).click();
    }

    @Step("Нажать на кнопку '{buttonName'")
    default void clickOnButtonByName(String buttonName) {
        $x(format(".//button[text()='%s']", buttonName)).click();
    }

    @Step("Обновить страницу")
    default void refreshPage() {
        Selenide.refresh();
    }

    @Step("Проверить что на странице содержится текст '{text}'")
    default void checkThatOnPageContainsText(String text) {
        $(withText(text)).shouldBe(visible);
    }

}