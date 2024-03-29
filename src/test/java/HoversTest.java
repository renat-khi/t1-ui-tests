import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HoversTest extends BaseUITestHerokuApp {

    @ParameterizedTest(name = "Hover on image #{index}")
    @ValueSource(strings = {"1", "2", "3"})
    public void checkHover(String index) {
        herokuApp.mainPage.clickOnLinkByName("Hovers");
        herokuApp.hoversPage.checkThatTitleAndLinkByImageIsNotVisible(index);
        herokuApp.hoversPage.hoverOnImage(index);
        herokuApp.hoversPage.checkThatTitleAndLinkByImageIsVisible(index);
    }

}