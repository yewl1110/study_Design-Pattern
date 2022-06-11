package menu;

import iterator.PancakeHouseMenuIterator;
import menuitem.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("기본 팬케이크", "토핑이 없다", true, 1.99);
        addItem("과일 팬케이크", "과일이 올라가있다", true, 2.99);
        addItem("소세지 팬케이크", "소세지를 같이 준다", false, 2.49);
        addItem("치즈 팬케이크", "치즈를 얹어준다", false, 2.49);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
