package herokuapp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$$x;

public class DisappearingElementsPage {

    ElementsCollection elements = $$x(".//li");

    public int updatePageAndGetNumberOfElements(int countOfUpdates) {
        int numberOfElements = 0;
        for (int i = 0; i < countOfUpdates; i++) {
            numberOfElements = elements.size();
            if (numberOfElements == 5) {
                return numberOfElements;
            }
            Selenide.refresh();
        }
        return numberOfElements;
    }

}