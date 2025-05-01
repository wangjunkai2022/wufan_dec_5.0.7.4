package kotlin.random;

import external.org.apache.commons.lang3.d;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
/* compiled from: Random.kt */
@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes.dex */
public abstract class Random {
    @NotNull
    public static final Default Default = new Default(null);
    @NotNull
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    /* compiled from: Random.kt */
    /* loaded from: classes.dex */
    public static final class Default extends Random implements Serializable {

        /* compiled from: Random.kt */
        /* loaded from: classes6.dex */
        private static final class Serialized implements Serializable {
            @NotNull
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i4) {
            return Random.defaultRandom.nextBits(i4);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(int i4) {
            return Random.defaultRandom.nextBytes(i4);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d5) {
            return Random.defaultRandom.nextDouble(d5);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i4) {
            return Random.defaultRandom.nextInt(i4);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j4) {
            return Random.defaultRandom.nextLong(j4);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array, int i4, int i5) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array, i4, i5);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d5, double d6) {
            return Random.defaultRandom.nextDouble(d5, d6);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i4, int i5) {
            return Random.defaultRandom.nextInt(i4, i5);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j4, long j5) {
            return Random.defaultRandom.nextLong(j4, j5);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return random.nextBytes(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i4);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!(new IntRange(0, array.length).contains(i4) && new IntRange(0, array.length).contains(i5))) {
            throw new IllegalArgumentException(("fromIndex (" + i4 + ") or toIndex (" + i5 + ") are out of range: 0.." + array.length + d.f68897a).toString());
        }
        if (i4 <= i5) {
            int i6 = (i5 - i4) / 4;
            for (int i7 = 0; i7 < i6; i7++) {
                int nextInt = nextInt();
                array[i4] = (byte) nextInt;
                array[i4 + 1] = (byte) (nextInt >>> 8);
                array[i4 + 2] = (byte) (nextInt >>> 16);
                array[i4 + 3] = (byte) (nextInt >>> 24);
                i4 += 4;
            }
            int i8 = i5 - i4;
            int nextBits = nextBits(i8 * 8);
            for (int i9 = 0; i9 < i8; i9++) {
                array[i4 + i9] = (byte) (nextBits >>> (i9 * 8));
            }
            return array;
        }
        throw new IllegalArgumentException(("fromIndex (" + i4 + ") must be not greater than toIndex (" + i5 + ").").toString());
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double d5) {
        return nextDouble(0.0d, d5);
    }

    public int nextInt(int i4) {
        return nextInt(0, i4);
    }

    public long nextLong(long j4) {
        return nextLong(0L, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            kotlin.random.RandomKt.checkRangeBounds(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L44
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L44
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L44
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r4 = r9 / r2
            java.lang.Double.isNaN(r2)
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L4b
        L44:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L4b:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L55
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L55:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public int nextInt(int i4, int i5) {
        int nextInt;
        int i6;
        int i7;
        int nextInt2;
        boolean z4;
        RandomKt.checkRangeBounds(i4, i5);
        int i8 = i5 - i4;
        if (i8 > 0 || i8 == Integer.MIN_VALUE) {
            if (((-i8) & i8) == i8) {
                i7 = nextBits(RandomKt.fastLog2(i8));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i6 = nextInt % i8;
                } while ((nextInt - i6) + (i8 - 1) < 0);
                i7 = i6;
            }
            return i4 + i7;
        }
        do {
            nextInt2 = nextInt();
            z4 = false;
            if (i4 <= nextInt2 && nextInt2 < i5) {
                z4 = true;
                continue;
            }
        } while (!z4);
        return nextInt2;
    }

    public long nextLong(long j4, long j5) {
        long nextLong;
        boolean z4;
        long nextLong2;
        long j6;
        long j7;
        int nextInt;
        RandomKt.checkRangeBounds(j4, j5);
        long j8 = j5 - j4;
        if (j8 <= 0) {
            do {
                nextLong = nextLong();
                z4 = false;
                if (j4 <= nextLong && nextLong < j5) {
                    z4 = true;
                    continue;
                }
            } while (!z4);
            return nextLong;
        }
        if (((-j8) & j8) == j8) {
            int i4 = (int) j8;
            int i5 = (int) (j8 >>> 32);
            if (i4 != 0) {
                nextInt = nextBits(RandomKt.fastLog2(i4));
            } else if (i5 == 1) {
                nextInt = nextInt();
            } else {
                j7 = (nextBits(RandomKt.fastLog2(i5)) << 32) + (nextInt() & 4294967295L);
            }
            j7 = nextInt & 4294967295L;
        } else {
            do {
                nextLong2 = nextLong() >>> 1;
                j6 = nextLong2 % j8;
            } while ((nextLong2 - j6) + (j8 - 1) < 0);
            j7 = j6;
        }
        return j4 + j7;
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    @NotNull
    public byte[] nextBytes(int i4) {
        return nextBytes(new byte[i4]);
    }
}
