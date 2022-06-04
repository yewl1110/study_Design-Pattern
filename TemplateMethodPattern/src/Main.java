import component.Duck;
import component.MyStringList;
import template.CaffeineBeverage;
import template.Coffee;
import template.Tea;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        test1();

//        test2();

        test3();

    }

    static void test1() {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();
        System.out.println("\n커피 만들기");
        coffee.prepareRecipe();
        System.out.println("\n홍차 만들기");
        tea.prepareRecipe();
    }

    static void test2() {
        Duck[] ducks = {
                new Duck("도날드", 10),
                new Duck("치즈", 3),
                new Duck("루이", 2),
                new Duck("Daffy", 5)
        };

        System.out.println("\n정렬 전");
        display(ducks);

        System.out.println("\n정렬 후");
        Arrays.sort(ducks);
        display(ducks);
        
    }

    static void display(Duck[] ducks) {
        for(Duck d : ducks) {
            System.out.println(d);
        }
    }

    static void test3() {
        String[] testList = {"JAVA", "TypeScript", "Go", "PHP", "JavaScript", "C++"};
        MyStringList myStringList = new MyStringList(testList);
        myStringList.set(2, "C#");
        System.out.println(myStringList.subList(2,6));
    }
}
