package Observer;

import java.util.Timer;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public class ObserverTest {
    public static void main(String[] args)
    {
        The_flash_fans a=new The_flash_fans("李雷");
        The_flash_fans b=new The_flash_fans("小明");
        The_flash the_flash=new The_flash();
        the_flash.addFans(a);
        the_flash.addFans(b);
        while(true)
        {
            try {
                Thread.sleep(7000);
                the_flash.notifyFans();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
