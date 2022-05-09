package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>(); 
    public void prepare() {
        System.out.println("재료준비하기:"+name);
        System.out.println("도우 돌리는중");
        System.out.println("소스 뿌리는중");
        System.out.print("토핑 올리는중:");
        for(String topping : toppings) {
            System.out.print(" " + topping);
        }
        System.out.println("");
    }
    public void bake() {
        System.out.println("175도에서 25분 굽기");
    }
    public void cut() {
        System.out.println("사선으로 자르기");
    }
    public void box() {
        System.out.println("포장하기\n");
    }

}
