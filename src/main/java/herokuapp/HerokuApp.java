package herokuapp;

import herokuapp.pages.*;

public class HerokuApp {

    public MainPage mainPage;
    public CheckboxesPage checkboxesPage;
    public DropdownPage dropdownPage;
    public DisappearingElementsPage disappearingElementsPage;
    public InputsPage inputsPage;
    public HoversPage hoversPage;
    public NotificationMessagesPage notificationMessage;
    public AddRemoveElementsPage addRemoveElementsPage;
    public StatusCodesPage statusCodesPage;

    public HerokuApp() {
        mainPage = new MainPage();
        checkboxesPage = new CheckboxesPage();
        dropdownPage = new DropdownPage();
        disappearingElementsPage = new DisappearingElementsPage();
        inputsPage = new InputsPage();
        hoversPage = new HoversPage();
        notificationMessage = new NotificationMessagesPage();
        addRemoveElementsPage = new AddRemoveElementsPage();
        statusCodesPage = new StatusCodesPage();
    }

}