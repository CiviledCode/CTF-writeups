package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




























































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\0004\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\t\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\b\032J\020\000\032\0020\0012\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\032L\020\000\032\0020\0012\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\017\032\0020\t2\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\032\032\020\020\032\0020\0012\b\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H\001\032J\020\020\032\0020\0012\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\032L\020\020\032\0020\0012\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\017\032\0020\t2\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\032$\020\021\032\0020\f2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\0320\020\022\032\0020\f*\0020\0012\006\020\023\032\0020\0072\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\0328\020\022\032\0020\f*\0020\0012\006\020\023\032\0020\0072\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\0320\020\022\032\0020\f*\0020\0012\006\020\024\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\0328\020\022\032\0020\f*\0020\0012\006\020\024\032\0020\t2\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\0328\020\025\032\0020\f*\0020\0012\006\020\023\032\0020\0072\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b\0328\020\025\032\0020\f*\0020\0012\006\020\024\032\0020\t2\006\020\b\032\0020\t2\031\b\004\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016H\b¨\006\026"}, d2={"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", "period", "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", "time", "delay", "scheduleAtFixedRate", "kotlin-stdlib"})
@JvmName(name="TimersKt")
public final class TimersKt
{
  @PublishedApi
  @NotNull
  public static final Timer timer(@Nullable String name, boolean daemon)
  {
    return name == null ? new Timer(daemon) : new Timer(name, daemon);
  }
  
  @InlineOnly
  private static final TimerTask schedule(@NotNull Timer $receiver, long delay, Function1<? super TimerTask, Unit> action)
  {
    ;
    TimerTask task = (TimerTask)new TimerTask()
    {































































      public void run()
      {






























































        $action.invoke(this);
      }
    };
    































































































































    $receiver.schedule(task, delay);return task;
  }
  
  @InlineOnly
  private static final TimerTask schedule(@NotNull Timer $receiver, Date time, Function1<? super TimerTask, Unit> action)
  {
    ;
    TimerTask task = (TimerTask)new TimerTask()
    {


























































      public void run()
      {

























































        $action.invoke(this);
      }
    };
    





















































































































    $receiver.schedule(task, time);return task;
  }
  
  @InlineOnly
  private static final TimerTask schedule(@NotNull Timer $receiver, long delay, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    TimerTask task = (TimerTask)new TimerTask()
    {




















































      public void run()
      {



















































        $action.invoke(this);
      }
    };
    









































































































    $receiver.schedule(task, delay, period);return task;
  }
  
  @InlineOnly
  private static final TimerTask schedule(@NotNull Timer $receiver, Date time, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    TimerTask task = (TimerTask)new TimerTask()
    {














































      public void run()
      {














































        $action.invoke(this);
      }
    };
    






























































































    $receiver.schedule(task, time, period);return task;
  }
  
  @InlineOnly
  private static final TimerTask scheduleAtFixedRate(@NotNull Timer $receiver, long delay, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    TimerTask task = (TimerTask)new TimerTask()
    {








































      public void run()
      {








































        $action.invoke(this);
      }
    };
    


















































































    $receiver.scheduleAtFixedRate(task, delay, period);return task;
  }
  
  @InlineOnly
  private static final TimerTask scheduleAtFixedRate(@NotNull Timer $receiver, Date time, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    TimerTask task = (TimerTask)new TimerTask()
    {



































      public void run()
      {


































        $action.invoke(this);
      }
    };
    







































































    $receiver.scheduleAtFixedRate(task, time, period);return task;
  }
  
  @InlineOnly
  private static final Timer timer(String name, boolean daemon, long initialDelay, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    Timer timer = timer(name, daemon);
    Timer localTimer1 = timer;TimerTask localTimerTask = (TimerTask)new TimerTask()
    {
























      public void run()
      {
























        $action.invoke(this);
      }
    };
    



















































    localTimer1.schedule(localTimerTask, initialDelay, period);return timer;
  }
  
  @InlineOnly
  private static final Timer timer(String name, boolean daemon, Date startAt, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    Timer timer = timer(name, daemon);
    Timer localTimer1 = timer;TimerTask localTimerTask = (TimerTask)new TimerTask()
    {

















      public void run()
      {

















        $action.invoke(this);
      }
    };
    





































    localTimer1.schedule(localTimerTask, startAt, period);return timer;
  }
  
  @InlineOnly
  private static final Timer fixedRateTimer(String name, boolean daemon, long initialDelay, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    Timer timer = timer(name, daemon);
    Timer localTimer1 = timer;TimerTask localTimerTask = (TimerTask)new TimerTask()
    {










      public void run()
      {









        $action.invoke(this);
      }
    };
    






















    localTimer1.scheduleAtFixedRate(localTimerTask, initialDelay, period);return timer;
  }
  
  @InlineOnly
  private static final Timer fixedRateTimer(String name, boolean daemon, Date startAt, long period, Function1<? super TimerTask, Unit> action)
  {
    ;
    Timer timer = timer(name, daemon);
    Timer localTimer1 = timer;TimerTask localTimerTask = (TimerTask)new TimerTask()
    {



      public void run()
      {


        $action.invoke(this);
      }
    };
    








    localTimer1.scheduleAtFixedRate(localTimerTask, startAt, period);return timer; } @InlineOnly
  private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) { ; (TimerTask)new TimerTask()
    {
      public void run()
      {
        $action.invoke(this);
      }
    };
  }
}