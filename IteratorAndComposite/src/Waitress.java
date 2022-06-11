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
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        System.out.println("----아침 메뉴----");
        for(int i = 0; i < breakfastItems.size(); i++) {
            System.out.println(breakfastItems.get(i));
        }
        System.out.println("\n----점심 메뉴----");
        for(int i = 0; i < lunchItems.length; i++) {
            System.out.println(lunchItems[i]);
        }
    }
}
