package herokuapp.pages;

import com.codeborne.selenide.ElementsCollection;
import herokuapp.steps.GeneralSteps;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$x;

public class DisappearingElementsPage implements GeneralSteps {

    ElementsCollection elements = $$x(".//li");

    @Step("Проверить что отображаются пять элементов")
    public void checkThatFiveElementsArePresent() {
        elements.shouldHave(size(5));
    }

}