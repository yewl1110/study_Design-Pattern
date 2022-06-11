import menu.CafeMenu;
import menu.DinerMenu;
import menu.Menu;
import menu.PancakeHouseMenu;
import menuitem.MenuItem;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();

        while(menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
