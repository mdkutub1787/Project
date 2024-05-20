package resturant;

import java.util.HashMap;

public class Resturant {

    private HashMap<String, MenuItem> menu;

    public Resturant() {
        menu = new HashMap<>();
    }

    public void addMenuItem(String name, String description, double price) {
        MenuItem item = new MenuItem(name, description, price);
        menu.put(name, item);
    }

    public MenuItem getMenuItem(String name) {
        return menu.get(name);
    }

    public Order createOrder() {
        return new Order();
    }
}
