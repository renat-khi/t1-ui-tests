import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InfiniteScrollTest extends BaseUITestHerokuApp {

    @ParameterizedTest
    @ValueSource(strings = {"Et", "Eius"})
    public void checkScrollToText(String expectedText) {
        herokuApp.mainPage.clickOnLinkByName("Infinite Scroll");
        herokuApp.infiniteScrollPage.scrollTextBlocksToExpectedText(expectedText, 50, 1);
        herokuApp.infiniteScrollPage.checkTextIsVisibleOnPage(expectedText);
    }

}