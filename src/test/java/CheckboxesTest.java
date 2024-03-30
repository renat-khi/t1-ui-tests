import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckboxesTest extends BaseUITestHerokuApp {

    @ParameterizedTest(name = "Test with checkboxes #{index}")
    @ValueSource(strings = {"1:2", "2:1"})
    public void checkWorkCheckboxes(String orderOfClick) {
        herokuApp.mainPage.clickOnLinkByName("Checkboxes");
        String[] indexesWithOrderOfClick = orderOfClick.split(":");
        String firstIndex = indexesWithOrderOfClick[0];
        String secondIndex = indexesWithOrderOfClick[1];
        herokuApp.checkboxesPage.clickOnCheckbox(firstIndex);
        herokuApp.checkboxesPage.checkCorrectStatusCheckbox(firstIndex);
        herokuApp.checkboxesPage.clickOnCheckbox(secondIndex);
        herokuApp.checkboxesPage.checkCorrectStatusCheckbox(secondIndex);
    }

}