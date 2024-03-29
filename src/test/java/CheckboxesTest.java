import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckboxesTest extends BaseUITestHerokuApp {

    @ParameterizedTest(name = "Order Of click on checkboxes #{index}")
    @ValueSource(strings = {"1:2", "2:1"})
    public void checkWorkCheckboxes(String orderOfClick) {
        herokuApp.mainPage.clickOnLinkByName("Checkboxes");
        herokuApp.checkboxesPage.clickAndCheckCorrectStatusOfCheckboxes(orderOfClick);
    }

}