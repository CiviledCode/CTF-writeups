package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;






















































































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\024\020\000\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\004\032\n\020\005\032\0020\001*\0020\002\032\n\020\006\032\0020\001*\0020\002¨\006\007"}, d2={"walk", "Lkotlin/io/FileTreeWalk;", "Ljava/io/File;", "direction", "Lkotlin/io/FileWalkDirection;", "walkBottomUp", "walkTopDown", "kotlin-stdlib"}, xs="kotlin/io/FilesKt")
class FilesKt__FileTreeWalkKt
  extends FilesKt__FileReadWriteKt
{
  @NotNull
  public static final FileTreeWalk walk(@NotNull File $receiver, @NotNull FileWalkDirection direction)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(direction, "direction");return new FileTreeWalk($receiver, direction);
  }
  
  @NotNull
  public static final FileTreeWalk walkTopDown(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return FilesKt.walk($receiver, FileWalkDirection.TOP_DOWN);
  }
  
  @NotNull
  public static final FileTreeWalk walkBottomUp(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return FilesKt.walk($receiver, FileWalkDirection.BOTTOM_UP);
  }
  
  public FilesKt__FileTreeWalkKt() {}
}
