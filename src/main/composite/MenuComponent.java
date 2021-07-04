package main.composite;

public abstract class MenuComponent {

    public String getMenuItemName(){
        throw new UnsupportedOperationException();
    }

    public int getMenuItemPrice(){
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public void printInfo(){
        throw new UnsupportedOperationException();
    }
}
