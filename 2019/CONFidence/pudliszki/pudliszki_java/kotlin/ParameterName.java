package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.MustBeDocumented;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.TYPE})
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\002\b\002\b\002\030\0002\0020\001B\b\022\006\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2={"Lkotlin/ParameterName;", "", "name", "", "()Ljava/lang/String;", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public @interface ParameterName
{
  String name();
}