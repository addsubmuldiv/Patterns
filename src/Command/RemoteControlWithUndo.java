package Command;

/**
 * Created by Lighters_c on 2017/5/3.
 */
public class RemoteControlWithUndo {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo()
    {
        onCommands=new Command[7];
        offCommands=new Command[7];

        Command noCommand=new NoCommand();

        for(int i=0;i<7;i++)
        {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand)
    {
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPushed()
    {
        undoCommand.undo();
    }

    public String toString()
    {
        StringBuilder s= new StringBuilder();
        for(int i=0;i<7;i++)
        {
            s.append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");

        }
        return s.toString();
    }
}
