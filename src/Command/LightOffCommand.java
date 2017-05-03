package Command;

/**
 * Created by Lighters_c on 2017/5/3.
 */
public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light)
    {
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
