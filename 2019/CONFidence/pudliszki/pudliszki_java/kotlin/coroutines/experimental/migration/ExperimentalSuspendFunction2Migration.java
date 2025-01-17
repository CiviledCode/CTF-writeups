package kotlin.coroutines.experimental.migration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



























































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\036\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\t\b\002\030\000*\004\b\000\020\001*\004\b\001\020\002*\004\b\002\020\0032\"\022\004\022\002H\001\022\004\022\002H\002\022\n\022\b\022\004\022\002H\0030\005\022\006\022\004\030\0010\0060\004B-\022&\020\007\032\"\022\004\022\0028\000\022\004\022\0028\001\022\n\022\b\022\004\022\0028\0020\b\022\006\022\004\030\0010\0060\004¢\006\002\020\tJ.\020\f\032\004\030\0010\0062\006\020\r\032\0028\0002\006\020\016\032\0028\0012\f\020\017\032\b\022\004\022\0028\0020\005H\002¢\006\002\020\020R1\020\007\032\"\022\004\022\0028\000\022\004\022\0028\001\022\n\022\b\022\004\022\0028\0020\b\022\006\022\004\030\0010\0060\004¢\006\b\n\000\032\004\b\n\020\013¨\006\021"}, d2={"Lkotlin/coroutines/experimental/migration/ExperimentalSuspendFunction2Migration;", "T1", "T2", "R", "Lkotlin/Function3;", "Lkotlin/coroutines/experimental/Continuation;", "", "function", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function3;)V", "getFunction", "()Lkotlin/jvm/functions/Function3;", "invoke", "t1", "t2", "continuation", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "kotlin-stdlib_coroutinesExperimental"})
final class ExperimentalSuspendFunction2Migration<T1, T2, R>
  implements Function3<T1, T2, kotlin.coroutines.experimental.Continuation<? super R>, Object>
{
  @NotNull
  private final Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, Object> function;
  
  public ExperimentalSuspendFunction2Migration(@NotNull Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends Object> function) { this.function = function; } @NotNull
  public final Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, Object> getFunction() { return function; }
  
  @Nullable
  public Object invoke(T1 t1, T2 t2, @NotNull kotlin.coroutines.experimental.Continuation<? super R> continuation) { Intrinsics.checkParameterIsNotNull(continuation, "continuation");return function.invoke(t1, t2, CoroutinesMigrationKt.toContinuation(continuation));
  }
}
