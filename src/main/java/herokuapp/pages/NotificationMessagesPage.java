package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;
import herokuapp.pages.elements.GeneralElements;

import static com.codeborne.selenide.Selenide.$x;

public class NotificationMessagesPage implements GeneralElements {

    SelenideElement popupNotification = $x(".//div[@id='flash']");

    public void clickLinkAndClosePopupWithUnexpectedNotification(String linkName, String expectedNotificationMessage, int maximumNumberOfClicks) {
        int iterationCount = 0;
        String actualNotificationMessage;
        do {
            clickOnLinkByName("×");
            clickOnLinkByName(linkName);
            actualNotificationMessage = popupNotification.text();
            iterationCount++;
        } while (!actualNotificationMessage.contains(expectedNotificationMessage) && iterationCount < maximumNumberOfClicks);
        System.out.println("ссылка " + linkName + " нажата " + iterationCount + " раз");
    }

}