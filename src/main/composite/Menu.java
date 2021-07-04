package main.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private final String menuName;
    private final List<MenuComponent> components = new ArrayList<>();

    public Menu(String newMenuName) {
        menuName = newMenuName;
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public void printInfo() {
        for (MenuComponent component : components) {
            component.printInfo();
        }
    }
}
