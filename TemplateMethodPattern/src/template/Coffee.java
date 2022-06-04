package template;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (Exception e) {
            System.out.println("IO 오류");
        }
        if(answer == null) {
            return "no";
        }
        return answer;
    }
}
