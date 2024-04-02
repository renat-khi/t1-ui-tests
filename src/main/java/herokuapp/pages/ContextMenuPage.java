package herokuapp.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContextMenuPage {

    SelenideElement box = $(By.id("hot-spot"));

    @Step("Кликнуть провой кнопкой мыши на рамку")
    public void contextClickInBox() {
        box.contextClick();
    }

    @Step("Получить тест всплывающего уведомления")
    public String getAlertText() {
        return Selenide.switchTo().alert().getText();
    }

}