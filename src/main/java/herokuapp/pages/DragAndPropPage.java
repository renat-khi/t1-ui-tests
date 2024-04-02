package herokuapp.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import herokuapp.steps.GeneralSteps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.$;

public class DragAndPropPage implements GeneralSteps {

    SelenideElement firstColumn = $(By.id("column-a"));
    SelenideElement secondColumn = $(By.id("column-b"));

    @Step("Перетащить элемент c заголовком '{sourceHeader}' к элементу с заголовком '{targetHeader}'")
    public void dragAndDropByHeader(String sourceHeader, String targetHeader) {
        getElementByText(sourceHeader).dragAndDrop(to(getElementByText(targetHeader)));
    }

    @Step("Кликнуть на элемент c заголовком '{sourceHeader}' и передвинуть его к элементу c заголовком '{targetHeader}'")
    public void clickOnSourceAndMoveToElementByHeader(String sourceHeader, String targetHeader) {
        Selenide.actions()
                .clickAndHold(getElementByText(sourceHeader))
                .moveToElement(getElementByText(targetHeader))
                .release()
                .perform();
    }

    @Step("Проверить что столб с номером '{columnNumber}' содержит заголовок '{header}'")
    public void checkThatColumnContainsHeader(int columnNumber, String header) {
        switch (columnNumber) {
            case 1 -> firstColumn.shouldHave(text(header)).shouldBe(visible);
            case 2 -> secondColumn.shouldHave(text(header)).shouldBe(visible);
            default -> throw new AssertionError("Incorrect column number: " + columnNumber);
        }
    }

}