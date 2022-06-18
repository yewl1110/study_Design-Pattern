package machine;

public class GumballMachine {
    private State soldState;
    private State soldOutState;
    private State hasQuarterState;
    private State noQuarterState;

    private State state;
    private int count;

    public GumballMachine(int count) {
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        this.count = count;
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
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

    @Override
    public String toString() {
        return "GumballMachine{" +
                "count=" + count +
                '}';
    }
}
