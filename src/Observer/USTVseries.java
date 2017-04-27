package Observer;

import java.util.ArrayList;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public interface USTVseries {
    public void addFans(Fans a);
    public void removeFans(Fans a);
    public void notifyFans();
}
