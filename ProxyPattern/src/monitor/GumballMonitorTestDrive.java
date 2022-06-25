package monitor;

import machine.GumballMachineRemote;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {
                "rmi://127.0.0.1/a/gumballmachine",
                "rmi://127.0.0.1/b/gumballmachine",
                "rmi://127.0.0.1/c/gumballmachine"
        };

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for(int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
                monitors[i].report();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
