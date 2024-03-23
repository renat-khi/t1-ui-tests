package herokuapp.pages;

import com.codeborne.selenide.ElementsCollection;
import herokuapp.pages.elements.GeneralElements;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$$x;

public class AddRemoveElementsPage implements GeneralElements {

    ElementsCollection allButtonsDelete = $$x(".//button[text()='Delete']");

    public void clickButtonNTimesAndPrintTextOfElementThatAppears(String buttonName, int numberOfTimesClickButton) {
        for (int i = 0; i < numberOfTimesClickButton; i++) {
            clickOnButtonByName(buttonName);
            String lastButtonDelete = allButtonsDelete.last().getText();
            System.out.println("после нажатия кнопки " + buttonName + " появился новый элемент с текстом " + lastButtonDelete);
        }
    }

    public void clickRandomButtonsDeleteNTimesAndPrintCountRemainingButtonAndText(int numberOfTimesClickRandomButtonsDelete) {
        for (int i = 0; i < numberOfTimesClickRandomButtonsDelete; i++) {
            int random = new Random().nextInt(allButtonsDelete.size());
            allButtonsDelete.get(random).click();
        }
        System.out.println("Оставшееся количество кнопок Delete равно: " + allButtonsDelete.size());
        allButtonsDelete.forEach(deleteButton -> System.out.println("кнопка Delete c текстом: " + deleteButton.getText()));
    }

}