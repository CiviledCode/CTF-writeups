package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.FunctionBase;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\021\n\002\020\000\n\002\b\002\bg\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003J&\020\b\032\0028\0002\026\020\t\032\f\022\b\b\001\022\004\030\0010\0130\n\"\004\030\0010\013H¦\002¢\006\002\020\fR\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007¨\006\r"}, d2={"Lkotlin/jvm/functions/FunctionN;", "R", "Lkotlin/Function;", "Lkotlin/jvm/internal/FunctionBase;", "arity", "", "getArity", "()I", "invoke", "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract interface FunctionN<R>
  extends Function<R>, FunctionBase<R>
{
  public abstract R invoke(@NotNull Object... paramVarArgs);
  
  public abstract int getArity();
}
