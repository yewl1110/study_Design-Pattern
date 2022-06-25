import machine.GumballMachine;
import monitor.GumballMonitor;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        gumballMachineMonitorTest(args);
    }

    static void gumballMachineTest(Optional<GumballMachine> machine) {
        GumballMachine gumballMachine = machine.orElse(new GumballMachine("", 5));

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMachine.refill();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.refill();
        gumballMachine.refill();
        gumballMachine.refill();
        gumballMachine.refill();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

    static void gumballMachineMonitorTest(String[] args) {
        int count = 0;

        if(args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();

        gumballMachineTest(Optional.of(gumballMachine));

        monitor.report();
    }
}
