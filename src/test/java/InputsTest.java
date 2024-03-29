import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InputsTest extends BaseUITestHerokuApp {

    @TestFactory
    List<DynamicTest> checkWorkNumberInput() {
        herokuApp.mainPage.clickOnLinkByName("Inputs");
        List<DynamicTest> result = new ArrayList<>();

        List<String> dataPositiveTest = getDataPositiveTest(5);
        for (int i = 0; i < dataPositiveTest.size(); i++) {
            final int index = i;
            result.add(DynamicTest.dynamicTest("Dynamic positive test #" + i,
                    () -> herokuApp.inputsPage.enterValueAndCheckInput(dataPositiveTest.get(index))));
        }

        List<String> dataNegativeTest = getDataNegativeTest();
        for (int i = 0; i < dataNegativeTest.size(); i++) {
            final int index = i;
            result.add(DynamicTest.dynamicTest("Dynamic negative test #" + i,
                    () -> herokuApp.inputsPage.enterValueAndCheckInput(dataNegativeTest.get(index))));
        }

        return result;
    }

    private List<String> getDataPositiveTest(int size) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(String.valueOf(new Random().nextInt(1000)));
        }
        return result;
    }

    private List<String> getDataNegativeTest() {
        List<String> result = new ArrayList<>();
        result.add("hello world");
        result.add("123 654");
        result.add("123 ");
        result.add(" 321");
        result.add("(*‿*)");
        return result;
    }

}