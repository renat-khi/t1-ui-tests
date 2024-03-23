import org.junit.jupiter.api.Test;

public class HoversTest extends BaseUITestHerokuApp {

    @Test
    public void checkHover() {
        herokuApp.mainPage.clickOnLinkByName("Hovers");
        herokuApp.hoversPage.hoverOnImageAndPrintAdditionalInformation(1);
        herokuApp.hoversPage.hoverOnImageAndPrintAdditionalInformation(2);
        herokuApp.hoversPage.hoverOnImageAndPrintAdditionalInformation(3);
    }

}