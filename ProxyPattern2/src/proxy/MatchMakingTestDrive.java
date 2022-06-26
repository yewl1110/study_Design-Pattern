package proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchMakingTestDrive {
    Map<String, Person> database;

    public static void main(String[] args) {
        MatchMakingTestDrive drive = new MatchMakingTestDrive();
        drive.drive();
    }

    MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        Person sin = getPersonFromDatabase("sin");
        Person proxy = getOwnerProxy(sin);
        System.out.println("이름: "+proxy.getName());
        proxy.setInterests("새로운 취미: 여행");
        try {
            proxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("내 계정을 내가 평가할 수 없습니다.");
        }
        System.out.println("취미:"+proxy.getInterests());
        System.out.println("점수:"+proxy.getGeekRating());
        System.out.println();


        Person bae = getPersonFromDatabase("bae");
        proxy = getNonOwnerProxy(bae);
        System.out.println("이름: "+proxy.getName());
        proxy.setGeekRating(12);
        try {
            proxy.setInterests("새로운 취미: 여행");
        } catch (Exception e) {
            System.out.println("다른 사람의 프로필을 수정할 수 없습니다.");
        }
        System.out.println("취미:"+proxy.getInterests());
        System.out.println("점수:"+proxy.getGeekRating());
    }

    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }


    void initializeDatabase() {
        database = new HashMap<>();
        
        Person person = new PersonImpl();
        person.setGender("f");
        person.setName("kim");
        person.setInterests("축구, 요리");
        database.put(person.getName(), person);


        Person person1 = new PersonImpl();
        person1.setGender("m");
        person1.setName("sin");
        person1.setInterests("게임, 영화");
        database.put(person1.getName(), person1);

        Person person2 = new PersonImpl();
        person2.setGender("f");
        person2.setName("bae");
        person2.setInterests("책읽기");
        database.put(person2.getName(), person2);
    }

    Person getPersonFromDatabase(String name) {
        return database.get(name);
    }
}
