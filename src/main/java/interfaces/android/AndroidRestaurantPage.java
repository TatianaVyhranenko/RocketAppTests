package interfaces.android;


import interfaces.app.RestaurantPage;

public class AndroidRestaurantPage implements RestaurantPage {

    @Override
    public AndroidDishPage selectDish() {
        return new AndroidDishPage();
    }

    @Override
    public void viewBasket() {

    }
}
