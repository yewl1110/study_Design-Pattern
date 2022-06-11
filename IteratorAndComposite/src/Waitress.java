import menu.CafeMenu;
import menu.DinerMenu;
import menu.PancakeHouseMenu;
import menuitem.MenuItem;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    CafeMenu cafeMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("----아침 메뉴----");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n----점심 메뉴----");
        printMenu(dinerMenuIterator);
        System.out.println("\n----저녁 메뉴----");
        printMenu(cafeMenuIterator);
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
