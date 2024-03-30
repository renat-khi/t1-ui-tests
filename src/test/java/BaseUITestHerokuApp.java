import com.codeborne.selenide.logevents.SelenideLogger;
import herokuapp.HerokuApp;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

class BaseUITestHerokuApp {
    protected HerokuApp herokuApp;

    @BeforeEach
    public void setUp() {
        herokuApp = new HerokuApp();
        open("https://the-internet.herokuapp.com");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));

    }

    @AfterEach
    public void tearDown() {
        closeWindow();
    }

}