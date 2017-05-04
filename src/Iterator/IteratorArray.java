package Iterator;

/**
 * Created by Lighters_c on 2017/5/4.
 */
public class IteratorArray<E> implements Iterator{
    private E[] items;
    private int position=0;
    public IteratorArray(E[] items)
    {
        this.items=items;
    }

    public E next()
    {
        E item=items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        if(position<=0)
            throw new IllegalStateException("You can't remove an item until you've done at" +
                    " least one next()");
        if(items[position-1]!=null)
        {
            for(int i=position-1;i<(items.length-1);i++)
            {
                items[i]=items[i+1];
            }
            items[items.length-1]=null;
        }
    }

    public boolean hasnext()
    {
        return !(position >= items.length || items[position] == null);
    }
}
