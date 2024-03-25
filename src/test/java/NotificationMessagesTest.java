import org.junit.jupiter.api.Test;

public class NotificationMessagesTest extends BaseUITestHerokuApp {

    @Test
    public void checkNotificationMessage() {
        herokuApp.mainPage.clickOnLinkByName("Notification Messages");
        herokuApp.notificationMessage.clickLinkAndClosePopupWithUnexpectedNotification("Click here",
                "Action successful", 10);
    }

}