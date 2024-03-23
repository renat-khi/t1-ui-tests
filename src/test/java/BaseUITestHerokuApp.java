import herokuapp.HerokuApp;
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
    }

    @AfterEach
    public void tearDown() {
        closeWindow();
    }

}