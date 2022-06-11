package menu;

import iterator.DinerMenuIterator;
import menuitem.MenuItem;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("샌드위치", "기본 샌드위치", true, 2.49);
        addItem("BLT", "베이컨,상추,토마토", false, 2.99);
        addItem("오늘의 스프", "감자샐러드도 같이 줌", false, 3.29);
        addItem("핫도그", "사워크라우트", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) {
            System.out.println("더이상 추가할 수 없다");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
