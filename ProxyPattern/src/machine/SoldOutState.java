package machine;

import java.io.Serial;

public class SoldOutState implements State{
    @Serial
    private static final long serialVersionUID = 2L;

    transient GumballMachine gumballMachine;

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

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
