package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;

public class InputsPage {

    SelenideElement input = $x(".//input[@type='number']");

    public void setInputNumberByRandomValue() {
        String randomNumber = String.valueOf(new Random().nextInt(10000) + 1);
        input.setValue(randomNumber);
    }

    public void printValueInputNumber() {
        String randomNumber = input.getValue();
        System.out.println("поле ввода Number заполнено значением: " + randomNumber);
    }

}