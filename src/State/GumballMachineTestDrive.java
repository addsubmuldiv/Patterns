package State;


/**
 * Created by Lighters_c on 2017/5/7.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args)
    {
        GumballMachine gumballMachine=new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
    }
}
