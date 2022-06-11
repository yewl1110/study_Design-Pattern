package menuComponent;

import menu.CafeMenu;
import menu.DinerMenu;
import menu.Menu;
import menu.PancakeHouseMenu;
import menuitem.MenuItem;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
