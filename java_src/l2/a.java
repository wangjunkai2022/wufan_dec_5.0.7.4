package l2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseResp.kt */
/* loaded from: classes5.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f71479a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final String f71480b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final T f71481c;

    public a(int i4, @Nullable String str, @Nullable T t4) {
        this.f71479a = i4;
        this.f71480b = str;
        this.f71481c = t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a e(a aVar, int i4, String str, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = aVar.f71479a;
        }
        if ((i5 & 2) != 0) {
            str = aVar.f71480b;
        }
        if ((i5 & 4) != 0) {
            obj = aVar.f71481c;
        }
        return aVar.d(i4, str, obj);
    }

    public final int a() {
        return this.f71479a;
    }

    @Nullable
    public final String b() {
        return this.f71480b;
    }

    @Nullable
    public final T c() {
        return this.f71481c;
    }

    @NotNull
    public final a<T> d(int i4, @Nullable String str, @Nullable T t4) {
        return new a<>(i4, str, t4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f71479a == aVar.f71479a && Intrinsics.areEqual(this.f71480b, aVar.f71480b) && Intrinsics.areEqual(this.f71481c, aVar.f71481c);
        }
        return false;
    }

    @Nullable
    public final T f() {
        return this.f71481c;
    }

    @Nullable
    public final String g() {
        return this.f71480b;
    }

    public final int h() {
        return this.f71479a;
    }

    public int hashCode() {
        int i4 = this.f71479a * 31;
        String str = this.f71480b;
        int hashCode = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        T t4 = this.f71481c;
        return hashCode + (t4 != null ? t4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseResp(status=" + this.f71479a + ", message=" + this.f71480b + ", data=" + this.f71481c + ')';
    }
}
