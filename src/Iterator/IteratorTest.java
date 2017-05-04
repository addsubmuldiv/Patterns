package Iterator;

/**
 * Created by Lighters_c on 2017/5/4.
 */
public class IteratorTest {
    public static void main(String[] args)
    {
        Integer[] a={1,2,3,4};
        IteratorPlatform<Integer> b=new IteratorPlatform<Integer>(a);
        Iterator c=b.createIterator();
        while(c.hasnext())
        {
            if(c.next().equals(2))
                c.remove();
        }
        Iterator d=b.createIterator();
        while(d.hasnext())
        {
            System.out.println(d.next());
        }
    }
}
