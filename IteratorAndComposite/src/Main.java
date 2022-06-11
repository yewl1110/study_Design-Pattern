import menu.CafeMenu;
import menu.DinerMenu;
import menu.PancakeHouseMenu;
import menuComponent.Menu;
import menuComponent.MenuComponent;
import menuComponent.MenuItem;
import menuComponent.Waitress;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        test();
        compositePatternTest();
    }

    static void test() {
        List<menu.Menu> menuList = List.of(new DinerMenu(), new PancakeHouseMenu(), new CafeMenu());
        menu.Waitress waitress = new menu.Waitress(menuList);
        waitress.printMenu();
    }

    static void compositePatternTest() {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        pancakeHouseMenu.add(new MenuItem("기본 팬케이크", "토핑이 없다", true, 1.99));
        pancakeHouseMenu.add(new MenuItem("과일 팬케이크", "과일이 올라가있다", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("소세지 팬케이크", "소세지를 같이 준다", false, 2.49));
        pancakeHouseMenu.add(new MenuItem("치즈 팬케이크", "치즈를 얹어준다", false, 2.49));

        MenuComponent dinerMenu = new Menu("식당 메뉴", "점심 메뉴");
        dinerMenu.add(new MenuItem("샌드위치", "기본 샌드위치", true, 2.49));
        dinerMenu.add(new MenuItem("BLT", "베이컨,상추,토마토", false, 2.99));
        dinerMenu.add(new MenuItem("오늘의 스프", "감자샐러드도 같이 줌", false, 3.29));
        dinerMenu.add(new MenuItem("핫도그", "사워크라우트", false, 3.05));

        MenuComponent cafeMenu = new Menu("카페", "저녁 메뉴");
        cafeMenu.add(new MenuItem("후라이드치킨", "튀김옷 바삭한 후라이드 치킨", false, 1.89));
        cafeMenu.add(new MenuItem("양념치킨", "옛날 양념 치킨", false, 2.09));
        cafeMenu.add(new MenuItem("뿌링클", "뿌링클!", false, 2.39));


        MenuComponent dessertMenu = new Menu("디저트", "디저트 메뉴");
        dessertMenu.add(new MenuItem("아이스크림", "민트초코 아이스크림", false, 0.59));
        dessertMenu.add(new MenuItem("커피", "아메리카노", true, 0.29));
        dessertMenu.add(new MenuItem("과자", "홈런볼", false, 0.19));

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
