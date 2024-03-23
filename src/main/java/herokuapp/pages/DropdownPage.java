package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DropdownPage {

    SelenideElement dropdown = $x(".//select[@id='dropdown']");

    public void selectDropdownByText(String text) {
        dropdown.selectOption(text);
    }

    public void printSelectedTextInDropdown() {
        String selectedText = dropdown.getSelectedOptionText();
        System.out.println("текущий текст в выпадающем списке: " + selectedText);
    }

}