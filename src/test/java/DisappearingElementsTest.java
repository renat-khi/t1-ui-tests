import org.junit.jupiter.api.RepeatedTest;

public class DisappearingElementsTest extends BaseUITestHerokuApp {

    @RepeatedTest(5)
    public void checkElementsOnPage() {
        herokuApp.mainPage.clickOnLinkByName("Disappearing Elements");
        herokuApp.disappearingElementsPage.refreshPageAndCheckThatFiveElementsArePresent();
    }

}