package main.composite;

public class RestaurantTest {

    public static void main(String[] args) {
        Menu breakFastMenu = new Menu("Break Fast Menu");
        Menu lunchMenu = new Menu("Lunch Menu");
        Menu dinnerMenu = new Menu("Dinner Menu");

        MenuItem chechebsa = new MenuItem(20, "Chchebsa");
        MenuItem malawa = new MenuItem(15, "Malawa");
        breakFastMenu.add(chechebsa);
        breakFastMenu.add(malawa);

        MenuItem dorowet = new MenuItem(25, "Dorowet Combo");
        MenuItem lazagna = new MenuItem(26, "Lazagna Pasta");
        lunchMenu.add(dorowet);
        lunchMenu.add(lazagna);

        MenuItem chckenGrill = new MenuItem(30, "Chicken Grill");
        dinnerMenu.add(chckenGrill);

        Menu vereItalieRestaurantMenu = new Menu("Vere Italie Restaurant");
        vereItalieRestaurantMenu.add(breakFastMenu);
        vereItalieRestaurantMenu.add(lunchMenu);
        vereItalieRestaurantMenu.add(dinnerMenu);

        vereItalieRestaurantMenu.printInfo();
    }
}
