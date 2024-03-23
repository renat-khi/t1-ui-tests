import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DisappearingElementsTest extends BaseUITestHerokuApp {

    @Test
    public void checkingDisplayOfElements() {
        herokuApp.mainPage.clickOnLinkByName("Disappearing Elements");
        int numberOfElements = herokuApp.disappearingElementsPage.updatePageAndGetNumberOfElements(10);
        Assertions.assertEquals(5, numberOfElements, "количество элементов на странице не соответствует тест-кейсу");
        System.out.println("На странице отображается " + numberOfElements + " элементов");
    }

}