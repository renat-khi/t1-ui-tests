package herokuapp.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class KeyPressesPage {

    SelenideElement blockYouEntered = $(By.id("result"));

    @Step("Нажать клавишу '{key}'")
    public void pressKeyOnKeyboard(String key) {
        if (key.length() == 1) {
            Selenide.actions().sendKeys(key).perform();
        } else {
            Selenide.actions().sendKeys(Keys.valueOf(key)).perform();
        }
    }

    @Step("Проверить что текст с соответствующей клавишей '{key}' отображается в блоке 'YouEntered'")
    public void checkThatTextWithKeyIsVisibleInBlockYouEntered(String key) {
        blockYouEntered.shouldHave(text(key)).shouldBe(visible);
    }

}