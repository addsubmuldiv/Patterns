package CompositeWithOutterIterator;
import java.util.Iterator;
/**
 * Created by Lighters_c on 2017/5/6.
 */
public class NullIterator implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
