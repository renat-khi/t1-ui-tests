package herokuapp.steps;

import com.codeborne.selenide.SelenideElement;
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

    @Step("Получить элемент по тексту '{text}'")
    default SelenideElement getElementByText(String text) {
        return $(withText(text));
    }

    @Step("Проверить что текст '{text}' отображается на странице")
    default void checkTextIsVisibleOnPage(String text) {
        getElementByText(text).shouldBe(visible);
    }

}