package herokuapp.pages;

import com.codeborne.selenide.ElementsCollection;
import herokuapp.steps.GeneralSteps;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.$$x;

public class AddRemoveElementsPage implements GeneralSteps {

    ElementsCollection allDeleteButtons = $$x(".//button[text()='Delete']");

    @Step("Нажать на кнопку Add '{numberOfClicks}' раз")
    public void clickAddButton(int numberOfClicks) {
        for (int i = 0; i < numberOfClicks; i++) {
            clickOnButtonByName("Add Element");
        }
    }

    @Step("Нажать на кнопку Delete '{numberOfClicks}' раз")
    public void clickDeleteButton(int numberOfClicks) {
        allDeleteButtons.shouldHave(sizeGreaterThanOrEqual(numberOfClicks));
        for (int i = 0; i < numberOfClicks; i++) {
            allDeleteButtons.first().click();
        }
    }

}