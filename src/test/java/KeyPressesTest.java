import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class KeyPressesTest extends BaseUITestHerokuApp {

    @ParameterizedTest
    @ValueSource(strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "ENTER", "CONTROL", "ALT", "TAB"})
    public void checkKeyPresses(String key) {
        herokuApp.mainPage.clickOnLinkByName("Key Presses");
        herokuApp.keyPressesPage.pressKeyOnKeyboard(key);
        herokuApp.keyPressesPage.checkThatTextWithKeyIsVisibleInBlockYouEntered(key);
    }

}