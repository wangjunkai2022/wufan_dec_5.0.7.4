package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
/* compiled from: Exceptions.common.kt */
/* loaded from: classes6.dex */
public final class CoroutinesInternalError extends Error {
    public CoroutinesInternalError(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
    }
}
