package State;

/**
 * Created by Lighters_c on 2017/5/7.
 */
public class WinnerState implements State{
    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine)
    {
        this.gumballMachine=gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please waiting for your two gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you can't do this");
    }

    @Override
    public void turnCrank() {
        System.out.println("You have done this, no more");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()==0)
        {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else
        {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount()>0)
            {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            else
            {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
