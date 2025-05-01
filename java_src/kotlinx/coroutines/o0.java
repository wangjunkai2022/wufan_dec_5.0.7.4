package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CoroutineContext.kt */
@IgnoreJRERequirement
/* loaded from: classes6.dex */
public final class o0 extends AbstractCoroutineContextElement implements b3<String> {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final a f71218c = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final long f71219b;

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes6.dex */
    public static final class a implements CoroutineContext.Key<o0> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public o0(long j4) {
        super(f71218c);
        this.f71219b = j4;
    }

    public static /* synthetic */ o0 a0(o0 o0Var, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = o0Var.f71219b;
        }
        return o0Var.Z(j4);
    }

    public final long Y() {
        return this.f71219b;
    }

    @NotNull
    public final o0 Z(long j4) {
        return new o0(j4);
    }

    public final long b0() {
        return this.f71219b;
    }

    @Override // kotlinx.coroutines.b3
    /* renamed from: c0 */
    public void C(@NotNull CoroutineContext coroutineContext, @NotNull String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.b3
    @NotNull
    /* renamed from: d0 */
    public String V(@NotNull CoroutineContext coroutineContext) {
        int lastIndexOf$default;
        String name;
        p0 p0Var = (p0) coroutineContext.get(p0.f71228c);
        String str = "coroutine";
        if (p0Var != null && (name = p0Var.getName()) != null) {
            str = name;
        }
        Thread currentThread = Thread.currentThread();
        String name2 = currentThread.getName();
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name2, " @", 0, false, 6, (Object) null);
        if (lastIndexOf$default < 0) {
            lastIndexOf$default = name2.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + lastIndexOf$default + 10);
        String substring = name2.substring(0, lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(b0());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f71219b == ((o0) obj).f71219b;
    }

    public int hashCode() {
        return com.join.kotlin.ui.modleregin.modle.a.a(this.f71219b);
    }

    @NotNull
    public String toString() {
        return "CoroutineId(" + this.f71219b + ')';
    }
}
