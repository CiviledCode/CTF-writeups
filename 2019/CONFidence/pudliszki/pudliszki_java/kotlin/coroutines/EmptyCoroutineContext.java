package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\020\000\n\000\n\002\020\016\n\000\bÇ\002\030\0002\0020\0012\0060\002j\002`\003B\007\b\002¢\006\002\020\004J5\020\007\032\002H\b\"\004\b\000\020\b2\006\020\t\032\002H\b2\030\020\n\032\024\022\004\022\002H\b\022\004\022\0020\f\022\004\022\002H\b0\013H\026¢\006\002\020\rJ(\020\016\032\004\030\001H\017\"\b\b\000\020\017*\0020\f2\f\020\020\032\b\022\004\022\002H\0170\021H\002¢\006\002\020\022J\b\020\023\032\0020\024H\026J\024\020\025\032\0020\0012\n\020\020\032\006\022\002\b\0030\021H\026J\021\020\026\032\0020\0012\006\020\027\032\0020\001H\002J\b\020\030\032\0020\031H\002J\b\020\032\032\0020\033H\026R\016\020\005\032\0020\006XT¢\006\002\n\000¨\006\034"}, d2={"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "plus", "context", "readResolve", "", "toString", "", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public final class EmptyCoroutineContext
  implements CoroutineContext, Serializable
{
  private static final long serialVersionUID = 0L;
  public static final EmptyCoroutineContext INSTANCE;
  
  static
  {
    EmptyCoroutineContext localEmptyCoroutineContext = new EmptyCoroutineContext();INSTANCE = localEmptyCoroutineContext; }
  
  private final Object readResolve() { return INSTANCE; }
  @Nullable
  public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) { Intrinsics.checkParameterIsNotNull(key, "key");return null; }
  public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) { Intrinsics.checkParameterIsNotNull(operation, "operation");return initial; } @NotNull
  public CoroutineContext plus(@NotNull CoroutineContext context) { Intrinsics.checkParameterIsNotNull(context, "context");return context; } @NotNull
  public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) { Intrinsics.checkParameterIsNotNull(key, "key");return (CoroutineContext)this; }
  public int hashCode() { return 0; } @NotNull
  public String toString() { return "EmptyCoroutineContext"; }
  
  private EmptyCoroutineContext() {}
}
