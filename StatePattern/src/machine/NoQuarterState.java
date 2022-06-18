package machine;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣었습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("반환할 동전이 없습니다..");

    }

    @Override
    public void turnCrank() {
        System.out.println("레버 돌릴라면 동전을 넣어야합니다.");
    }

    @Override
    public void dispense() {
    }
}
