package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;
import org.jetbrains.annotations.NotNull;
/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes6.dex */
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current()");
        return current;
    }

    @Override // kotlin.random.Random
    public double nextDouble(double d5) {
        return ThreadLocalRandom.current().nextDouble(d5);
    }

    @Override // kotlin.random.Random
    public int nextInt(int i4, int i5) {
        return ThreadLocalRandom.current().nextInt(i4, i5);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j4) {
        return ThreadLocalRandom.current().nextLong(j4);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j4, long j5) {
        return ThreadLocalRandom.current().nextLong(j4, j5);
    }
}
