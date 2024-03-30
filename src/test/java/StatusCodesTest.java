import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StatusCodesTest extends BaseUITestHerokuApp {

    @ParameterizedTest(name = "Check that page contains status code #{index}")
    @ValueSource(strings = {"200", "301", "404", "500"})
    public void checkStatusCodes(String statusCode) {
        herokuApp.mainPage.clickOnLinkByName("Status Codes");
        herokuApp.statusCodesPage.clickOnLinkByName(statusCode);
        herokuApp.statusCodesPage.checkThatOnPageContainsText(statusCode);
    }

}