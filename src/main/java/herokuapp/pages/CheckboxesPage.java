package herokuapp.pages;

import herokuapp.utils.CheckboxUtil;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CheckboxesPage {

    String checkbox = ".//input[%s]";

    public void clickOnCheckboxByNumber(int numberCheckbox) {
        $x(format(checkbox, numberCheckbox)).click();
    }

    public void printStatusCheckboxByNumber(int numberCheckbox) {
        CheckboxUtil.printStatusCheckbox($x(format(checkbox, numberCheckbox)));
    }

}