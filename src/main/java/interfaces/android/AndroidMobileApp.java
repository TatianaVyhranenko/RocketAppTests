package interfaces.android;

import interfaces.app.MobileApp;

public class AndroidMobileApp implements MobileApp {

    @Override
    public AndroidBasketPage basketPage() {
        return new AndroidBasketPage();
    }

    @Override
    public AndroidCuisinePage cuisinePage() {
        return new AndroidCuisinePage();
    }

    @Override
    public AndroidDishPage dishPage() {
        return new AndroidDishPage();
    }

    @Override
    public AndroidRestaurantPage restaurantPage() {
        return new AndroidRestaurantPage();
    }

    @Override
    public AndroidMainPage mainPage() {
        return new AndroidMainPage();
    }
}
