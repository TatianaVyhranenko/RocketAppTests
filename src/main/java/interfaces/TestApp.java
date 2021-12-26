package interfaces;

import interfaces.android.AndroidMobileApp;
import interfaces.app.MobileApp;
import interfaces.iOS.IOSMobileApp;

public class TestApp {

    public static void main(String[] args) {

        System.out.println("Enter to app");
        MobileApp app = getApp();

        System.out.println("Click cuisine");
        app.mainPage().selectCuisine();

        System.out.println("Select restaurant");
        app.cuisinePage().selectRestaurant();

        System.out.println("Select dish");
        app.restaurantPage().selectDish();

        System.out.println("Add dish to the basket");
        app.dishPage().clickAddToBasket();

        System.out.println("View basket");
        app.restaurantPage().viewBasket();

        System.out.println("Verify dish in the basket");
        app.basketPage().checkTheOrder();
    }

    //Uncomment when fix the IOS
    private static MobileApp getApp() {
        return System.getenv("platform").equals("IOS") ? new IOSMobileApp() : new AndroidMobileApp();
    }
}
