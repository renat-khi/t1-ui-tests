package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;
import herokuapp.pages.elements.GeneralElements;

import static com.codeborne.selenide.Selenide.$x;

public class StatusCodesPage implements GeneralElements {

    SelenideElement blockStatusCodes = $x(".//div[@class='example']");

    public void printTextInBlockStatusCodes() {
        String textInBlockStatusCodes = blockStatusCodes.innerText();
        System.out.println(textInBlockStatusCodes);
    }

}