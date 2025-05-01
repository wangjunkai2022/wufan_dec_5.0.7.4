package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
/* compiled from: LocalAtomics.common.kt */
/* loaded from: classes6.dex */
public final class u {
    public static final int a(@NotNull AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void b(@NotNull AtomicInteger atomicInteger, int i4) {
        atomicInteger.set(i4);
    }
}
