import org.junit.jupiter.api.Test;

public class CheckboxesTest extends BaseUITestHerokuApp {

    @Test
    public void checkStatusCheckboxes() {
        herokuApp.mainPage.clickOnLinkByName("Checkboxes");
        herokuApp.checkboxesPage.clickOnCheckboxByNumber(1);
        herokuApp.checkboxesPage.clickOnCheckboxByNumber(2);
        herokuApp.checkboxesPage.printStatusCheckboxByNumber(1);
        herokuApp.checkboxesPage.printStatusCheckboxByNumber(2);
    }

}