package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;




@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020!\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\n\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\035\020\n\032\0020\0132\006\020\f\032\0020\0072\006\020\r\032\0028\000H\026¢\006\002\020\016J\b\020\017\032\0020\013H\026J\026\020\020\032\0028\0002\006\020\f\032\0020\007H\002¢\006\002\020\021J\025\020\022\032\0028\0002\006\020\f\032\0020\007H\026¢\006\002\020\021J\036\020\023\032\0028\0002\006\020\f\032\0020\0072\006\020\r\032\0028\000H\002¢\006\002\020\024R\024\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\002\n\000R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\t¨\006\025"}, d2={"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
final class ReversedList<T>
  extends AbstractMutableList<T>
{
  private final List<T> delegate;
  
  public ReversedList(@NotNull List<T> delegate) { this.delegate = delegate; }
  public int getSize() { return delegate.size(); }
  public T get(int index) { return delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index)); }
  
  public void clear() { delegate.clear(); }
  public T removeAt(int index) { return delegate.remove(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index)); }
  
  public T set(int index, T element) { return delegate.set(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index), element); }
  
  public void add(int index, T element) { delegate.add(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(this, index), element); }
}
