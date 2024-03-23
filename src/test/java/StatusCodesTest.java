import org.junit.jupiter.api.Test;

public class StatusCodesTest extends BaseUITestHerokuApp {

    @Test
    public void checkTextStatusCodes200() {
        herokuApp.mainPage.clickOnLinkByName("Status Codes");
        herokuApp.statusCodesPage.clickOnLinkByName("200");
        herokuApp.statusCodesPage.printTextInBlockStatusCodes();
    }

    @Test
    public void checkTextStatusCodes301() {
        herokuApp.mainPage.clickOnLinkByName("Status Codes");
        herokuApp.statusCodesPage.clickOnLinkByName("301");
        herokuApp.statusCodesPage.printTextInBlockStatusCodes();
    }

    @Test
    public void checkTextStatusCodes404() {
        herokuApp.mainPage.clickOnLinkByName("Status Codes");
        herokuApp.statusCodesPage.clickOnLinkByName("404");
        herokuApp.statusCodesPage.printTextInBlockStatusCodes();
    }

    @Test
    public void checkTextStatusCodes500() {
        herokuApp.mainPage.clickOnLinkByName("Status Codes");
        herokuApp.statusCodesPage.clickOnLinkByName("500");
        herokuApp.statusCodesPage.printTextInBlockStatusCodes();
    }

}