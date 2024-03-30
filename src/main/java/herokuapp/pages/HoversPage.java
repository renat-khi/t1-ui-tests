package herokuapp.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class HoversPage {

    String image = ".//div[@class='figure'][%s]";

    @Step("Навести курсор на картинку с индексом '{index}'")
    public void hoverOnImage(String index) {
        $x(format(image, index)).hover();
    }

    @Step("Проверить что заголовок и ссылка отображаются у картинки с индексом '{index}'")
    public void checkThatTitleAndLinkByImageIsVisible(String index) {
        $x(format(image, index)).$x(".//h5").shouldBe(visible);
        $x(format(image, index)).$x(".//a").shouldBe(visible);
    }

}