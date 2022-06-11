package menu;

import menuitem.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("후라이드치킨", "튀김옷 바삭한 후라이드 치킨", false, 1.89);
        addItem("양념치킨", "옛날 양념 치킨", false, 2.09);
        addItem("뿌링클", "뿌링클!", false, 2.39);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
