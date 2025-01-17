package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;





public class SpreadBuilder
{
  private final ArrayList<Object> list;
  
  public SpreadBuilder(int size)
  {
    list = new ArrayList(size);
  }
  
  public void addSpread(Object container)
  {
    if (container == null) { return;
    }
    if ((container instanceof Object[])) {
      Object[] array = (Object[])container;
      if (array.length > 0) {
        list.ensureCapacity(list.size() + array.length);
        Collections.addAll(list, array);
      }
    }
    else if ((container instanceof Collection)) {
      list.addAll((Collection)container);
    }
    else if ((container instanceof Iterable)) {
      for (Object element : (Iterable)container)
        list.add(element);
    } else {
      Iterator iterator;
      if ((container instanceof Iterator)) {
        for (iterator = (Iterator)container; iterator.hasNext();) {
          list.add(iterator.next());
        }
        
      } else
        throw new UnsupportedOperationException("Don't know how to spread " + container.getClass());
    }
  }
  
  public int size() {
    return list.size();
  }
  
  public void add(Object element) {
    list.add(element);
  }
  
  public Object[] toArray(Object[] a) {
    return list.toArray(a);
  }
}
