package interfaces.iOS;

import interfaces.app.DishPage;
import interfaces.app.RestaurantPage;

public class IOSRestaurantPage implements RestaurantPage {
    @Override
    public DishPage selectDish() {
        return new IOSDishPage();
    }

    @Override
    public void viewBasket() {

    }
}
