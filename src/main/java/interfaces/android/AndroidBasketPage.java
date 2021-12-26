package interfaces.android;


import interfaces.app.BasketPage;

public class AndroidBasketPage implements BasketPage {

    @Override
    public void checkTheOrder() {
        System.out.println("CHECK ORDER");
    }
}
