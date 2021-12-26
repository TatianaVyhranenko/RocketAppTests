package interfaces.iOS;

import interfaces.app.CuisinePage;
import interfaces.app.MainPage;

public class IOSMainPage implements MainPage {
    @Override
    public CuisinePage selectCuisine() {
        return new IOSCuisinePage();
    }
}
