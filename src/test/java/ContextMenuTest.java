import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends BaseUITestHerokuApp {

    @Test
    public void checkAlertText() {
        herokuApp.mainPage.clickOnLinkByName("Context Menu");
        herokuApp.contextMenuPage.contextClickInBox();
        String actualAlertText = herokuApp.contextMenuPage.getAlertText();
        Assertions.assertEquals("You selected a context menu", actualAlertText, "Текст предупреждения не совпадает с ожидаемым");
    }

}