package machine;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("뽑기캡슐이 없습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("뽑기캡슐이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("뽑기캡슐이 없습니다.");
    }

    @Override
    public void dispense() {
    }
}
