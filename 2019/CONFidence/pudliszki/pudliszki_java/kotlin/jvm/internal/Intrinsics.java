package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;







public class Intrinsics
{
  private Intrinsics() {}
  
  public static String stringPlus(String self, Object other)
  {
    return self + other;
  }
  
  public static void checkNotNull(Object object) {
    if (object == null) {
      throwNpe();
    }
  }
  
  public static void checkNotNull(Object object, String message) {
    if (object == null) {
      throwNpe(message);
    }
  }
  
  public static void throwNpe() {
    throw ((KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException()));
  }
  
  public static void throwNpe(String message) {
    throw ((KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException(message)));
  }
  
  public static void throwUninitializedProperty(String message) {
    throw ((UninitializedPropertyAccessException)sanitizeStackTrace(new UninitializedPropertyAccessException(message)));
  }
  
  public static void throwUninitializedPropertyAccessException(String propertyName) {
    throwUninitializedProperty("lateinit property " + propertyName + " has not been initialized");
  }
  
  public static void throwAssert() {
    throw ((AssertionError)sanitizeStackTrace(new AssertionError()));
  }
  
  public static void throwAssert(String message) {
    throw ((AssertionError)sanitizeStackTrace(new AssertionError(message)));
  }
  
  public static void throwIllegalArgument() {
    throw ((IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException()));
  }
  
  public static void throwIllegalArgument(String message) {
    throw ((IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException(message)));
  }
  
  public static void throwIllegalState() {
    throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException()));
  }
  
  public static void throwIllegalState(String message) {
    throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException(message)));
  }
  
  public static void checkExpressionValueIsNotNull(Object value, String expression) {
    if (value == null) {
      throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException(expression + " must not be null")));
    }
  }
  
  public static void checkNotNullExpressionValue(Object value, String message) {
    if (value == null) {
      throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException(message)));
    }
  }
  
  public static void checkReturnedValueIsNotNull(Object value, String className, String methodName) {
    if (value == null) {
      throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException("Method specified as non-null returned null: " + className + "." + methodName)));
    }
  }
  

  public static void checkReturnedValueIsNotNull(Object value, String message)
  {
    if (value == null) {
      throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException(message)));
    }
  }
  
  public static void checkFieldIsNotNull(Object value, String className, String fieldName) {
    if (value == null) {
      throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + className + "." + fieldName)));
    }
  }
  
  public static void checkFieldIsNotNull(Object value, String message) {
    if (value == null) {
      throw ((IllegalStateException)sanitizeStackTrace(new IllegalStateException(message)));
    }
  }
  
  public static void checkParameterIsNotNull(Object value, String paramName) {
    if (value == null) {
      throwParameterIsNullException(paramName);
    }
  }
  
  public static void checkNotNullParameter(Object value, String message) {
    if (value == null) {
      throw ((IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException(message)));
    }
  }
  
  private static void throwParameterIsNullException(String paramName) {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    




    StackTraceElement caller = stackTraceElements[3];
    String className = caller.getClassName();
    String methodName = caller.getMethodName();
    
    IllegalArgumentException exception = new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + paramName);
    


    throw ((IllegalArgumentException)sanitizeStackTrace(exception));
  }
  
  public static int compare(long thisVal, long anotherVal) {
    return thisVal == anotherVal ? 0 : thisVal < anotherVal ? -1 : 1;
  }
  
  public static int compare(int thisVal, int anotherVal) {
    return thisVal == anotherVal ? 0 : thisVal < anotherVal ? -1 : 1;
  }
  
  public static boolean areEqual(Object first, Object second) {
    return first == null ? false : second == null ? true : first.equals(second);
  }
  
  @SinceKotlin(version="1.1")
  public static boolean areEqual(Double first, Double second) {
    return second == null;
  }
  
  @SinceKotlin(version="1.1")
  public static boolean areEqual(Double first, double second) {
    return (first != null) && (first.doubleValue() == second);
  }
  
  @SinceKotlin(version="1.1")
  public static boolean areEqual(double first, Double second) {
    return (second != null) && (first == second.doubleValue());
  }
  
  @SinceKotlin(version="1.1")
  public static boolean areEqual(Float first, Float second) {
    return second == null;
  }
  
  @SinceKotlin(version="1.1")
  public static boolean areEqual(Float first, float second) {
    return (first != null) && (first.floatValue() == second);
  }
  
  @SinceKotlin(version="1.1")
  public static boolean areEqual(float first, Float second) {
    return (second != null) && (first == second.floatValue());
  }
  
  public static void throwUndefinedForReified() {
    throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
  }
  

  public static void throwUndefinedForReified(String message)
  {
    throw new UnsupportedOperationException(message);
  }
  

  public static void reifiedOperationMarker(int id, String typeParameterIdentifier) {}
  
  public static void reifiedOperationMarker(int id, String typeParameterIdentifier, String message)
  {
    throwUndefinedForReified(message);
  }
  

  public static void needClassReification() {}
  
  public static void needClassReification(String message)
  {
    throwUndefinedForReified(message);
  }
  
  public static void checkHasClass(String internalName) throws ClassNotFoundException {
    String fqName = internalName.replace('/', '.');
    try {
      Class.forName(fqName);
    }
    catch (ClassNotFoundException e) {
      throw ((ClassNotFoundException)sanitizeStackTrace(new ClassNotFoundException("Class " + fqName + " is not found. Please update the Kotlin runtime to the latest version", e)));
    }
  }
  
  public static void checkHasClass(String internalName, String requiredVersion)
    throws ClassNotFoundException
  {
    String fqName = internalName.replace('/', '.');
    try {
      Class.forName(fqName);
    }
    catch (ClassNotFoundException e) {
      throw ((ClassNotFoundException)sanitizeStackTrace(new ClassNotFoundException("Class " + fqName + " is not found: this code requires the Kotlin runtime of version at least " + requiredVersion, e)));
    }
  }
  

  private static <T extends Throwable> T sanitizeStackTrace(T throwable)
  {
    return sanitizeStackTrace(throwable, Intrinsics.class.getName());
  }
  
  static <T extends Throwable> T sanitizeStackTrace(T throwable, String classNameToDrop) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    int size = stackTrace.length;
    
    int lastIntrinsic = -1;
    for (int i = 0; i < size; i++) {
      if (classNameToDrop.equals(stackTrace[i].getClassName())) {
        lastIntrinsic = i;
      }
    }
    
    List<StackTraceElement> list = Arrays.asList(stackTrace).subList(lastIntrinsic + 1, size);
    throwable.setStackTrace((StackTraceElement[])list.toArray(new StackTraceElement[list.size()]));
    return throwable;
  }
}
