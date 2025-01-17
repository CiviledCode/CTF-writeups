package kotlin.jvm.internal;

import kotlin.Metadata;







@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\004\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000¨\006\b"}, d2={"Lkotlin/jvm/internal/IntCompanionObject;", "", "()V", "MAX_VALUE", "", "MIN_VALUE", "SIZE_BITS", "SIZE_BYTES", "kotlin-stdlib"})
public final class IntCompanionObject
{
  public static final int MIN_VALUE = Integer.MIN_VALUE;
  public static final int MAX_VALUE = Integer.MAX_VALUE;
  public static final int SIZE_BYTES = 4;
  public static final int SIZE_BITS = 32;
  public static final IntCompanionObject INSTANCE;
  
  private IntCompanionObject() {}
  
  static
  {
    IntCompanionObject localIntCompanionObject = new IntCompanionObject();INSTANCE = localIntCompanionObject;
  }
}
