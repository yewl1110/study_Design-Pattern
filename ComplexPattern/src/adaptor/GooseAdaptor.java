package adaptor;

import component.Goose;
import component.Quackable;
import observer.Observable;
import observer.Observer;

public class GooseAdaptor implements Quackable {
    private Observable observable;
    private Goose goose;

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.hock();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
