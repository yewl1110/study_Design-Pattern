import machine.GumballMachine;
import machine.GumballMachineRemote;
import monitor.GumballMonitor;

import java.rmi.Naming;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        gumballMachineServiceTest(args);
    }

    // RMI 서버 코드 테스트
    static void gumballMachineServiceTest(String[] args) {
        try {
            GumballMachineRemote gumballMachine = null;
            int count = 0;

            if(args.length < 2) {
                System.out.println("GumballMachine <name> <inventory>");
                System.exit(1);
            }

            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//127.0.0.1/"+args[0]+"/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    static void gumballMachineTest(Optional<GumballMachine> machine) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void gumballMachineMonitorTest(String[] args) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
