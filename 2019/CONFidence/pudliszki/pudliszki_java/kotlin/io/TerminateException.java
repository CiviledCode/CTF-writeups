package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;























































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2={"Lkotlin/io/TerminateException;", "Lkotlin/io/FileSystemException;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"})
final class TerminateException
  extends FileSystemException
{
  public TerminateException(@NotNull File file)
  {
    super(file, null, null, 6, null);
  }
}