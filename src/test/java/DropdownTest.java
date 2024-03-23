import org.junit.jupiter.api.Test;

public class DropdownTest extends BaseUITestHerokuApp {

    @Test
    public void checkSelectionDropdown() {
        herokuApp.mainPage.clickOnLinkByName("Dropdown");
        herokuApp.dropdownPage.selectDropdownByText("Option 1");
        herokuApp.dropdownPage.printSelectedTextInDropdown();
        herokuApp.dropdownPage.selectDropdownByText("Option 2");
        herokuApp.dropdownPage.printSelectedTextInDropdown();
    }

}