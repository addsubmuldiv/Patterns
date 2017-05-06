package State;

/**
 * Created by Lighters_c on 2017/5/7.
 */
public class GumballMachine {
    private State soldOutState;
    private State hasQuarterState;
    private State noQuarterState;
    private State soldState;
    private State winnerState;

    private State state=soldOutState;
    private int count=0;

    public GumballMachine(int numberGumballs)
    {
        soldOutState=new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState=new HasQuarterState(this);
        soldState=new SoldState(this);
        this.count=numberGumballs;
        if(numberGumballs>0)
            state=noQuarterState;
    }

    public void insertQuarter()
    {
        state.insertQuarter();
    }
    public void ejectQuarter()
    {
        state.ejectQuarter();
    }
    public void turnCrank()
    {
        state.turnCrank();
        state.dispense();
    }
    void setState(State state)
    {
        this.state=state;
    }
    void releaseBall()
    {
        System.out.println("A gumball comes rolling out the solt...");
        if(count!=0)
        {
            count--;
        }
    }
    public State getSoldOutState()
    {
        return soldOutState;
    }
    public State getHasQuarterState()
    {
        return hasQuarterState;
    }
    public State getNoQuarterState()
    {
        return noQuarterState;
    }
    public State getSoldState()
    {
        return soldState;
    }
    public State getState()
    {
        return state;
    }
    public State getWinnerState()
    {
        return winnerState;
    }
    public int getCount()
    {
        return count;
    }
    public String toString()
    {
        return "Inventory: "+count+" gumballs";
    }
}
