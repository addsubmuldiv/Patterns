package State;

/**
 * Created by Lighters_c on 2017/5/7.
 */
public class SoldOutState implements State{
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine)
    {
        this.gumballMachine=gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("We has sold out, please eject your money");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting your money...");
    }

    @Override
    public void turnCrank() {
        System.out.println("This makes nonsense");
    }

    @Override
    public void dispense() {
        System.out.println("This makes nonsense");
    }
}
