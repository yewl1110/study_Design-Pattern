package composite;

import component.Quackable;
import observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> it = quackers.iterator();

        while(it.hasNext()) {
            Quackable quacker = it.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> it = quackers.iterator();

        while(it.hasNext()) {
            Quackable quacker = it.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // 오리 개별 객체에서 notifyObservers를 호출하므로 구현할 필요 없음
    }
}
