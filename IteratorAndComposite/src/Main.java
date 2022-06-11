import menu.DinerMenu;
import menu.PancakeHouseMenu;

public class Main {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
