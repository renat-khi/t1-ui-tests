import io.qameta.allure.Step;
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

        List<String> dataPositiveTest = getDataPositiveTests(5);
        for (int i = 0; i < dataPositiveTest.size(); i++) {
            final int index = i;
            String value = dataPositiveTest.get(index);
            result.add(DynamicTest.dynamicTest("Dynamic positive test #" + i,
                    () -> {
                        herokuApp.inputsPage.enterValue(value);
                        herokuApp.inputsPage.checkThatValueIsEntered(value);
                    }));
        }

        List<String> dataNegativeTest = getDataNegativeTests();
        for (int i = 0; i < dataNegativeTest.size(); i++) {
            final int index = i;
            String value = dataNegativeTest.get(index);
            result.add(DynamicTest.dynamicTest("Dynamic negative test #" + i,
                    () -> {
                        herokuApp.inputsPage.enterValue(value);
                        herokuApp.inputsPage.checkThatValueIsEntered(value);
                    }));
        }

        return result;
    }

    @Step("Получить данные для позитивных тестов в количестве '{size}'")
    private List<String> getDataPositiveTests(int size) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(String.valueOf(new Random().nextInt(1000)));
        }
        return result;
    }

    @Step("Получить данные для негативных тестов")
    private List<String> getDataNegativeTests() {
        List<String> result = new ArrayList<>();
        result.add("hello world");
        result.add("123 654");
        result.add("123 ");
        result.add(" 321");
        result.add("*");
        return result;
    }

}