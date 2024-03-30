import org.junit.jupiter.api.RepeatedTest;

public class NotificationMessagesTest extends BaseUITestHerokuApp {

    @RepeatedTest(5)
    public void checkNotificationMessage() {
        herokuApp.mainPage.clickOnLinkByName("Notification Messages");
        herokuApp.notificationMessage.clickOnLinkByName("×");
        herokuApp.notificationMessage.clickOnLinkByName("Click here");
        herokuApp.notificationMessage.checkNotificationIsSuccessful();
    }

}