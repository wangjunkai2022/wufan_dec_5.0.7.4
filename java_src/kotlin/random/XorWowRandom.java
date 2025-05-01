package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
/* compiled from: XorWowRandom.kt */
@SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes6.dex */
public final class XorWowRandom extends Random implements Serializable {
    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v  reason: collision with root package name */
    private int f69588v;

    /* renamed from: w  reason: collision with root package name */
    private int f69589w;

    /* renamed from: x  reason: collision with root package name */
    private int f69590x;

    /* renamed from: y  reason: collision with root package name */
    private int f69591y;

    /* renamed from: z  reason: collision with root package name */
    private int f69592z;

    /* compiled from: XorWowRandom.kt */
    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public XorWowRandom(int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f69590x = i4;
        this.f69591y = i5;
        this.f69592z = i6;
        this.f69589w = i7;
        this.f69588v = i8;
        this.addend = i9;
        int i10 = i4 | i5 | i6 | i7 | i8;
        if (!(i10 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i11 = 0; i11 < 64; i11++) {
            nextInt();
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int i4) {
        return RandomKt.takeUpperBits(nextInt(), i4);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i4 = this.f69590x;
        int i5 = i4 ^ (i4 >>> 2);
        this.f69590x = this.f69591y;
        this.f69591y = this.f69592z;
        this.f69592z = this.f69589w;
        int i6 = this.f69588v;
        this.f69589w = i6;
        int i7 = ((i5 ^ (i5 << 1)) ^ i6) ^ (i6 << 4);
        this.f69588v = i7;
        int i8 = this.addend + 362437;
        this.addend = i8;
        return i7 + i8;
    }

    public XorWowRandom(int i4, int i5) {
        this(i4, i5, 0, 0, i4 ^ (-1), (i4 << 10) ^ (i5 >>> 4));
    }
}
