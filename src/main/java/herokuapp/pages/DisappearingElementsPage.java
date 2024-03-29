package herokuapp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$x;

public class DisappearingElementsPage {

    ElementsCollection elements = $$x(".//li");

    public void refreshPageAndCheckThatFiveElementsArePresent() {
        Selenide.refresh();
        elements.shouldHave(size(5));
    }

}