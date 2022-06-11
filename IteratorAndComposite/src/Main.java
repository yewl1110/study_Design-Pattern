import menu.CafeMenu;
import menu.DinerMenu;
import menu.Menu;
import menu.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        List<Menu> menuList = List.of(new DinerMenu(), new PancakeHouseMenu(), new CafeMenu());
        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }
}
