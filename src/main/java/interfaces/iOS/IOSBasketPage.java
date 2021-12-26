package interfaces.iOS;

import interfaces.app.BasketPage;

public class IOSBasketPage implements BasketPage {


    @Override
    public void checkTheOrder() {
        System.out.println("CHECK ORDER");
    }
}
