package interfaces.iOS;

import interfaces.app.CuisinePage;
import interfaces.app.RestaurantPage;

public class IOSCuisinePage implements CuisinePage {
    @Override
    public RestaurantPage selectRestaurant() {
        return new IOSRestaurantPage();
    }
}
