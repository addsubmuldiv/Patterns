package CompositeWithInnerIterator;

/**
 * Created by Lighters_c on 2017/5/5.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus)
    {
        this.allMenus=allMenus;
    }

    public void printMenu()
    {
        allMenus.print();
    }
}
