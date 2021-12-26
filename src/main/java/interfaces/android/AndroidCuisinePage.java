package interfaces.android;

import interfaces.app.CuisinePage;

public class AndroidCuisinePage implements CuisinePage {

    @Override
    public AndroidRestaurantPage selectRestaurant() {
        return new AndroidRestaurantPage();
    }
}
