package Iterator;

/**
 * Created by Lighters_c on 2017/5/4.
 */
public class IteratorPlatform<E> {
    private E[] items;

    public IteratorPlatform(E[] items)
    {
        this.items=items;
    }

    public Iterator createIterator()
    {
        return new IteratorArray<E>(items);
    }
}
