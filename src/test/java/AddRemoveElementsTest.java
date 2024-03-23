import org.junit.jupiter.api.Test;

public class AddRemoveElementsTest extends BaseUITestHerokuApp {

    @Test
    public void checkAddRemoveElements() {
        herokuApp.mainPage.clickOnLinkByName("Add/Remove Elements");
        herokuApp.addRemoveElementsPage.clickButtonNTimesAndPrintTextOfElementThatAppears("Add Element", 5);
        herokuApp.addRemoveElementsPage.clickRandomButtonsDeleteNTimesAndPrintCountRemainingButtonAndText(3);
    }

}