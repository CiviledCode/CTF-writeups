package kotlin.jvm.internal;

import kotlin.Metadata;






























@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\f\n\002\b\b\n\002\020\b\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000R\016\020\b\032\0020\004XT¢\006\002\n\000R\016\020\t\032\0020\004XT¢\006\002\n\000R\016\020\n\032\0020\004XT¢\006\002\n\000R\016\020\013\032\0020\004XT¢\006\002\n\000R\016\020\f\032\0020\rXT¢\006\002\n\000R\016\020\016\032\0020\rXT¢\006\002\n\000¨\006\017"}, d2={"Lkotlin/jvm/internal/CharCompanionObject;", "", "()V", "MAX_HIGH_SURROGATE", "", "MAX_LOW_SURROGATE", "MAX_SURROGATE", "MAX_VALUE", "MIN_HIGH_SURROGATE", "MIN_LOW_SURROGATE", "MIN_SURROGATE", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"})
public final class CharCompanionObject
{
  public static final char MIN_VALUE = '\000';
  public static final char MAX_VALUE = '￿';
  public static final char MIN_HIGH_SURROGATE = '?';
  public static final char MAX_HIGH_SURROGATE = '?';
  public static final char MIN_LOW_SURROGATE = '?';
  public static final char MAX_LOW_SURROGATE = '?';
  public static final char MIN_SURROGATE = '?';
  public static final char MAX_SURROGATE = '?';
  public static final int SIZE_BYTES = 2;
  public static final int SIZE_BITS = 16;
  public static final CharCompanionObject INSTANCE;
  
  private CharCompanionObject() {}
  
  static
  {
    CharCompanionObject localCharCompanionObject = new CharCompanionObject();INSTANCE = localCharCompanionObject;
  }
}
