package monitor;

import machine.GumballMachineRemote;

// RMI Client
public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("뽑기 기계 위치 = " + gumballMachine.getLocation());
            System.out.println("현재 재고 = " + gumballMachine.getCount());
            System.out.println("현재 상태 = " + gumballMachine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
