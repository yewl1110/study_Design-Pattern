package machine;

import java.io.Serial;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    @Serial
    private static final long serialVersionUID = 2L;

    private final State soldState;
    private final State soldOutState;
    private final State hasQuarterState;
    private final State noQuarterState;
    private final State winnerState;

    private State state;
    private int count;
    private String location;

    public GumballMachine(String location, int count) throws RemoteException {
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        this.location = location;
        if(this.count == 0) {
            state = this.soldOutState;
        } else {
            state = this.noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("캡슐을 내보냅니다.");
        if(count > 0) {
            count--;
        }
    }

    public void refill() {
        count++;
        System.out.println("캡슐을 채웁니다.");
        state.refill();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "count=" + count +
                '}';
    }
}
