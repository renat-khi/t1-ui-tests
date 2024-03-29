package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DropdownPage {

    SelenideElement dropdown = $x(".//select[@id='dropdown']");

    public void selectInDropdown(String value) {
        dropdown.selectOption(value);
    }

    public String getValueInDropdown() {
        return dropdown.getSelectedOptionText();
    }

}