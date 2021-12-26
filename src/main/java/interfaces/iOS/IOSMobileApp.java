package interfaces.iOS;

import interfaces.app.*;

public class IOSMobileApp implements MobileApp {
    @Override
    public BasketPage basketPage() {
        return new IOSBasketPage();
    }

    @Override
    public CuisinePage cuisinePage() {
        return new IOSCuisinePage();
    }

    @Override
    public DishPage dishPage() {
        return new IOSDishPage();
    }

    @Override
    public RestaurantPage restaurantPage() {
        return new IOSRestaurantPage();
    }

    @Override
    public MainPage mainPage() {
        return new IOSMainPage();
    }
}
