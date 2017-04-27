package Observer;



/**
 * Created by Lighters_c on 2017/4/27.
 */
public abstract class Fans {
    public abstract void WatchSeries(USTVseries series);
}

class The_flash_fans extends Fans
{
    String name;
    public The_flash_fans(String name)
    {
        this.name=name;
    }
    @Override
    public void WatchSeries(USTVseries series) {
        System.out.println(this.name+" is Watching "+series.getClass().getName());
    }
}


