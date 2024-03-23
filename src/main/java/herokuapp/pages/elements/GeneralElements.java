package herokuapp.pages.elements;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public interface GeneralElements {

    default void clickOnLinkByName(String linkName) {
        $x(format(".//a[text()='%s']", linkName)).click();
    }

    default void clickOnButtonByName(String buttonName) {
        $x(format(".//button[text()='%s']", buttonName)).click();
    }

}