package machine;

import java.io.Serial;
import java.util.Date;
import java.util.Random;

public class HasQuarterState implements State {
    @Serial
    private static final long serialVersionUID = 2L;
    Random random;
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        random = new Random(new Date().getTime());
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("이미 동전이 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환합니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌립니다.");
        int winner = random.nextInt(10);
        if(winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {

    }

    @Override
    public void refill() {

    }
    @Override
    public String toString() {
        return "state : 동전 넣음";
    }
}
