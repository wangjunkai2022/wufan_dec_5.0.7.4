package w2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ResponseMain.kt */
/* loaded from: classes5.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f73402a;

    /* renamed from: b  reason: collision with root package name */
    private final int f73403b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final String f73404c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private T f73405d;

    public a(int i4, int i5, @Nullable String str) {
        this.f73402a = i4;
        this.f73403b = i5;
        this.f73404c = str;
    }

    public static /* synthetic */ a e(a aVar, int i4, int i5, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = aVar.f73402a;
        }
        if ((i6 & 2) != 0) {
            i5 = aVar.f73403b;
        }
        if ((i6 & 4) != 0) {
            str = aVar.f73404c;
        }
        return aVar.d(i4, i5, str);
    }

    public final int a() {
        return this.f73402a;
    }

    public final int b() {
        return this.f73403b;
    }

    @Nullable
    public final String c() {
        return this.f73404c;
    }

    @NotNull
    public final a<T> d(int i4, int i5, @Nullable String str) {
        return new a<>(i4, i5, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f73402a == aVar.f73402a && this.f73403b == aVar.f73403b && Intrinsics.areEqual(this.f73404c, aVar.f73404c);
        }
        return false;
    }

    public final int f() {
        return this.f73402a;
    }

    @Nullable
    public final T g() {
        return this.f73405d;
    }

    public final int h() {
        return this.f73403b;
    }

    public int hashCode() {
        int i4 = ((this.f73402a * 31) + this.f73403b) * 31;
        String str = this.f73404c;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    @Nullable
    public final String i() {
        return this.f73404c;
    }

    public final void j(@Nullable T t4) {
        this.f73405d = t4;
    }

    @NotNull
    public String toString() {
        return "ResponseMain(code=" + this.f73402a + ", error=" + this.f73403b + ", message=" + this.f73404c + ')';
    }
}
