package herokuapp.pages;

import com.codeborne.selenide.Condition;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CheckboxesPage {

    String checkbox = ".//input[%s]";

    public void clickAndCheckCorrectStatusOfCheckboxes(String orderOfClick) {
        String[] indexesOfCheckboxes = orderOfClick.split(":");
        Arrays.stream(indexesOfCheckboxes).forEach(index -> {
            $x(format(checkbox, index)).click();
            checkCorrectStatusCheckboxByIndex(index);
        });
    }

    private void checkCorrectStatusCheckboxByIndex(String index) {
        switch (index) {
            case "1" -> $x(format(checkbox, index)).shouldBe(Condition.checked);
            case "2" -> $x(format(checkbox, index)).shouldNotBe(Condition.checked);
            default -> System.out.println("Incorrect checkbox index");
        }
    }

}