import org.junit.jupiter.api.Test;

public class InputsTest extends BaseUITestHerokuApp {

    @Test
    public void checkingValueInput() {
        herokuApp.mainPage.clickOnLinkByName("Inputs");
        herokuApp.inputsPage.setInputNumberByRandomValue();
        herokuApp.inputsPage.printValueInputNumber();
    }

}