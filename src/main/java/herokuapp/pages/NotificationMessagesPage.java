package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;
import herokuapp.steps.GeneralSteps;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class NotificationMessagesPage implements GeneralSteps {

    SelenideElement popupNotification = $x(".//div[@id='flash']");

    @Step("Проверить что отображается уведомление 'Action successful'")
    public void checkNotificationIsSuccessful() {
        popupNotification.shouldHave(text("Action successful")).shouldBe(visible);
    }

}