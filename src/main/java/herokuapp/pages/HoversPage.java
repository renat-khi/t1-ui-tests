package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class HoversPage {

    String image = ".//div[@class='figure'][%s]";

    public void hoverOnImageAndPrintAdditionalInformation(int numberOfImage) {
        SelenideElement imageSelenideElement = $x(format(image, numberOfImage));
        imageSelenideElement.hover();
        String additionalInformation = imageSelenideElement.innerText();
        System.out.println(additionalInformation);
    }

}