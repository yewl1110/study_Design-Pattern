import iterator.Iterator;
import menu.DinerMenu;
import menu.PancakeHouseMenu;
import menuitem.MenuItem;

import java.util.List;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("----아침 메뉴----");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n----점심 메뉴----");
        printMenu(dinerMenuIterator);
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
