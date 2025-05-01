package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes6.dex */
public final class UndeliveredElementException extends RuntimeException {
    public UndeliveredElementException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
    }
}
