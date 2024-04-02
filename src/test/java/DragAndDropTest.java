import org.junit.jupiter.api.Test;

public class DragAndDropTest extends BaseUITestHerokuApp {

    @Test
    public void dragAndDropElement() {
        herokuApp.mainPage.clickOnLinkByName("Drag and Drop");
        herokuApp.dragAndPropPage.dragAndDropByHeader("A", "B");
        herokuApp.dragAndPropPage.checkThatColumnContainsHeader(1, "B");
        herokuApp.dragAndPropPage.checkThatColumnContainsHeader(2, "A");
    }

    @Test
    public void moveElement() {
        herokuApp.mainPage.clickOnLinkByName("Drag and Drop");
        herokuApp.dragAndPropPage.clickOnSourceAndMoveToElementByHeader("A", "B");
        herokuApp.dragAndPropPage.checkThatColumnContainsHeader(1, "B");
        herokuApp.dragAndPropPage.checkThatColumnContainsHeader(2, "A");
    }

}