package main.composite;

public class Waitress {

    MenuComponent component;

    public Waitress(MenuComponent newComponent){
        component = newComponent;
    }

    public void showMenus(){
        component.printInfo();
    }
}
