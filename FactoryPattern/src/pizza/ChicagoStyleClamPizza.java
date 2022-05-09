package pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "시카고 스타일 치즈피자";
        dough = "두꺼운 크러스트 도우";
        sauce = "토마토 소스";
        toppings.add("모짜렐라 치즈");
        toppings.add("조개");
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 자르기");
    }
}
