package herokuapp.utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.checked;

public class CheckboxUtil {
    public static void printStatusCheckbox(SelenideElement checkboxes) {
        boolean isChecked = checkboxes.is(checked);
        System.out.println("чекбокс " + checkboxes + (isChecked ? " активирован" : " не активирован"));
    }

}