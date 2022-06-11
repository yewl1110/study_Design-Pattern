import menu.CafeMenu;
import menu.DinerMenu;
import menu.PancakeHouseMenu;

public class Main {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
