package observer;

public class QuackAudience implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("관람객:" + duck + "가 방금 소리냈다.");
    }
}
