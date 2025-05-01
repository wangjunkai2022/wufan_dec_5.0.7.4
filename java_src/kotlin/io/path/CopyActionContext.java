package kotlin.io.path;

import java.nio.file.Path;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
/* compiled from: CopyActionContext.kt */
@SinceKotlin(version = "1.8")
@ExperimentalPathApi
/* loaded from: classes6.dex */
public interface CopyActionContext {
    @NotNull
    CopyActionResult copyToIgnoringExistingDirectory(@NotNull Path path, @NotNull Path path2, boolean z4);
}
