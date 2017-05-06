package CompositeWithInnerIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lighters_c on 2017/5/5.
 */
public class Menu extends MenuComponent{
    private ArrayList menuComponents=new ArrayList();
    String name;
    String description;

    public Menu(String name,String description)
    {
        this.name=name;
        this.description=description;
    }

    public void add(MenuComponent menuComponent)
    {
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent)
    {
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i)
    {
        return (MenuComponent)menuComponents.get(i);
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public void print()
    {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("--------------------");

        Iterator iterator=menuComponents.iterator();        //使用内部AllayList的迭代器
        while(iterator.hasNext())                           //有下一个，就递归调用继承下
        {                                                   //来的print()方法
            MenuComponent menuComponent=
                    (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
