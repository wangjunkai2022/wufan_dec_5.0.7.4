package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Semaphore.kt */
/* loaded from: classes7.dex */
public interface d {
    int a();

    boolean b();

    @Nullable
    Object c(@NotNull Continuation<? super Unit> continuation);

    void release();
}
