package herokuapp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import herokuapp.steps.GeneralSteps;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;

public class InfiniteScrollPage implements GeneralSteps {

    ElementsCollection textBlocks = $$x(".//*[@class='jscroll-added']");

    @Step("Скролить блоки с текстом до ожидаемого текста '{expectedText}'")
    public void scrollTextBlocksToExpectedText(String expectedText, int maxChecksTextBlocks, int timeoutOfSeconds) {
        Selenide.sleep(5000);
        for (SelenideElement textBlock : textBlocks.asDynamicIterable()) {
            textBlock.scrollIntoView(false);
            if (textBlock.is(textCaseSensitive(expectedText))) {
                return;
            }
            if (textBlocks.size() > maxChecksTextBlocks) {
                throw new AssertionError("Текст не найден. Превышено максимальное количество проверок текстовых блоков: " + maxChecksTextBlocks);
            }
            Selenide.sleep(1000L * timeoutOfSeconds);
        }
        throw new AssertionError("Необходимо увеличить таймаут: " + timeoutOfSeconds);
    }

}