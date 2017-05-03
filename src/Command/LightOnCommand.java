package Command;

/**
 * Created by Lighters_c on 2017/5/3.
 */
public class LightOnCommand implements Command{
    Light light;
    public LightOnCommand(Light light)
    {
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
