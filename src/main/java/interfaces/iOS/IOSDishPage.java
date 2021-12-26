package interfaces.iOS;

import interfaces.app.DishPage;

public class IOSDishPage implements DishPage {
    @Override
    public void clickAddToBasket() {
        System.out.println("Click to Add to Basket");
    }
}
