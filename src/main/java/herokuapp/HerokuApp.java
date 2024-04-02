package herokuapp;

import herokuapp.pages.*;

public class HerokuApp {

    public MainPage mainPage;
    public DragAndPropPage dragAndPropPage;
    public ContextMenuPage contextMenuPage;
    public InfiniteScrollPage infiniteScrollPage;
    public KeyPressesPage keyPressesPage;

    public HerokuApp() {
        keyPressesPage = new KeyPressesPage();
        infiniteScrollPage = new InfiniteScrollPage();
        contextMenuPage= new ContextMenuPage();
        dragAndPropPage = new DragAndPropPage();
        mainPage = new MainPage();

    }

}