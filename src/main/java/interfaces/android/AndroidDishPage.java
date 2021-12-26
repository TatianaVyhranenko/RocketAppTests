package interfaces.android;


import interfaces.app.DishPage;

public class AndroidDishPage implements DishPage {
    @Override
    public void clickAddToBasket() {
        System.out.println("Click to Add to Basket");
    }
}
