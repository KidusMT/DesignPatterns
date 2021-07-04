package main.composite;

public class RestaurantTest {

    public static void main(String[] args) {

        // creating restaurant menu (ALL)
        Menu vereItalieRestaurantMenu = new Menu("Vere Italie Restaurant");

        // creating different types of menus
        Menu breakFastMenu = new Menu("Break Fast Menu");
        Menu lunchMenu = new Menu("Lunch Menu");
        Menu dinnerMenu = new Menu("Dinner Menu");

        // including the different menus in the main restaurant's menu
        vereItalieRestaurantMenu.add(breakFastMenu);
        vereItalieRestaurantMenu.add(lunchMenu);
        vereItalieRestaurantMenu.add(dinnerMenu);

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

        // showing the menu items
        Waitress waitress = new Waitress(vereItalieRestaurantMenu);
        waitress.showMenus();
    }
}
