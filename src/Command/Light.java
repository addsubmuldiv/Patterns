package Command;

/**
 * Created by Lighters_c on 2017/5/3.
 */
public class Light {
    String room;
    Light(String room)
    {
        this.room=room;
    }
    void on()
    {
        System.out.println("Light is on");
    }
    void off()
    {
        System.out.println("Light is off");
    }
}
