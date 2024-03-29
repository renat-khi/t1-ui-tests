package herokuapp.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class HoversPage {

    String image = ".//div[@class='figure'][%s]";

    String imageTitle = ".//div[@class='figure'][%s]//h5";

    String imageLink = ".//div[@class='figure'][%s]//a";

    public void hoverOnImage(String index) {
        $x(format(image, index)).hover();
    }

    public void checkThatTitleAndLinkByImageIsVisible(String index) {
        $x(format(imageTitle, index)).shouldBe(visible);
        $x(format(imageLink, index)).shouldBe(visible);
    }

    public void checkThatTitleAndLinkByImageIsNotVisible(String index) {
        $x(format(imageTitle, index)).shouldNotBe(visible);
        $x(format(imageLink, index)).shouldNotBe(visible);
    }

}