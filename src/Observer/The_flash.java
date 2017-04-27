package Observer;

import java.util.ArrayList;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public class The_flash implements USTVseries {
    ArrayList<Fans> fansArrayList;
    public The_flash()
    {
        fansArrayList=new ArrayList<Fans>();
        System.out.println("The flash is broadcasting!");
        System.out.println("-------------------------------");
    }
    @Override
    public void addFans(Fans a) {
        fansArrayList.add(a);
    }

    @Override
    public void removeFans(Fans a) {
        fansArrayList.remove(a);
    }

    @Override
    public void notifyFans() {
        for(Fans a:fansArrayList)
        {
            a.WatchSeries(this);
        }
    }
}
