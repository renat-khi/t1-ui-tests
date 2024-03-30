import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveElementsTest extends BaseUITestHerokuApp {

    @TestFactory
    List<DynamicTest> checkAddAndRemoveElements() {
        herokuApp.mainPage.clickOnLinkByName("Add/Remove Elements");
        List<DynamicTest> result = new ArrayList<>();
        List<String> numberOfAdditionsAndDeletions = getNumberOfAdditionsAndDeletions();
        for (int i = 0; i < numberOfAdditionsAndDeletions.size(); i++) {
            final int index = i;
            String[] s = numberOfAdditionsAndDeletions.get(i).split(":");
            int numberOfAdditions = Integer.parseInt(s[0]);
            int numberOfDeletions = Integer.parseInt(s[1]);
            result.add(DynamicTest.dynamicTest("Dynamic test #" + i,
                    () -> {
                        herokuApp.addRemoveElementsPage.clickAddButton(numberOfAdditions);
                        herokuApp.addRemoveElementsPage.clickDeleteButton(numberOfDeletions);
                        herokuApp.addRemoveElementsPage.refreshPage();
                    }));
        }
        return result;
    }

    private List<String> getNumberOfAdditionsAndDeletions() {
        List<String> result = new ArrayList<>();
        result.add("2:1");
        result.add("5:2");
        result.add("1:3");
        return result;
    }

}