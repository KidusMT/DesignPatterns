package main.composite;

public class MenuItem extends MenuComponent {
    private int price;
    private String menuName;

    public MenuItem(int price, String menuName) {
        this.price = price;
        this.menuName = menuName;
    }

    @Override
    public String getMenuItemName() {
        return menuName;
    }

    @Override
    public int getMenuItemPrice() {
        return price;
    }

    @Override
    public void printInfo() {
        System.out.printf("MenuItem Name: %s  -- MenuItem Price: %s\n", menuName, price);
    }
}
