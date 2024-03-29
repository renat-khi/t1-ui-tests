import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DropdownTest extends BaseUITestHerokuApp {

    @ParameterizedTest(name = "Select value in dropdown #{index}")
    @ValueSource(strings = {"Option 1", "Option 2"})
    public void checkDropdownSelection(String value) {
        herokuApp.mainPage.clickOnLinkByName("Dropdown");
        herokuApp.dropdownPage.selectInDropdown(value);
        String actualValueInDropdown = herokuApp.dropdownPage.getValueInDropdown();
        Assertions.assertEquals(value, actualValueInDropdown, "expected value is not selected in the drop-down");
    }

}