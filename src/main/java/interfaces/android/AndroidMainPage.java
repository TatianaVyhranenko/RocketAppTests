package interfaces.android;


import interfaces.app.MainPage;

public class AndroidMainPage implements MainPage {

    @Override
    public AndroidCuisinePage selectCuisine() {
        return new AndroidCuisinePage();
    }
}
