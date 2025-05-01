package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CoroutineName.kt */
/* loaded from: classes6.dex */
public final class p0 extends AbstractCoroutineContextElement {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final a f71228c = new a(null);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final String f71229b;

    /* compiled from: CoroutineName.kt */
    /* loaded from: classes6.dex */
    public static final class a implements CoroutineContext.Key<p0> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public p0(@NotNull String str) {
        super(f71228c);
        this.f71229b = str;
    }

    public static /* synthetic */ p0 a0(p0 p0Var, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = p0Var.f71229b;
        }
        return p0Var.Z(str);
    }

    @NotNull
    public final String Y() {
        return this.f71229b;
    }

    @NotNull
    public final p0 Z(@NotNull String str) {
        return new p0(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.areEqual(this.f71229b, ((p0) obj).f71229b);
    }

    @NotNull
    public final String getName() {
        return this.f71229b;
    }

    public int hashCode() {
        return this.f71229b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoroutineName(" + this.f71229b + ')';
    }
}
