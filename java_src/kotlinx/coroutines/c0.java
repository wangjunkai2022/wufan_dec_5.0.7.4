package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes6.dex */
final class c0 {
    @JvmField
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Object f69665a;
    @JvmField
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final n f69666b;
    @JvmField
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Function1<Throwable, Unit> f69667c;
    @JvmField
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Object f69668d;
    @JvmField
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f69669e;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@Nullable Object obj, @Nullable n nVar, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        this.f69665a = obj;
        this.f69666b = nVar;
        this.f69667c = function1;
        this.f69668d = obj2;
        this.f69669e = th;
    }

    public static /* synthetic */ c0 g(c0 c0Var, Object obj, n nVar, Function1 function1, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = c0Var.f69665a;
        }
        if ((i4 & 2) != 0) {
            nVar = c0Var.f69666b;
        }
        n nVar2 = nVar;
        Function1<Throwable, Unit> function12 = function1;
        if ((i4 & 4) != 0) {
            function12 = c0Var.f69667c;
        }
        Function1 function13 = function12;
        if ((i4 & 8) != 0) {
            obj2 = c0Var.f69668d;
        }
        Object obj4 = obj2;
        if ((i4 & 16) != 0) {
            th = c0Var.f69669e;
        }
        return c0Var.f(obj, nVar2, function13, obj4, th);
    }

    @Nullable
    public final Object a() {
        return this.f69665a;
    }

    @Nullable
    public final n b() {
        return this.f69666b;
    }

    @Nullable
    public final Function1<Throwable, Unit> c() {
        return this.f69667c;
    }

    @Nullable
    public final Object d() {
        return this.f69668d;
    }

    @Nullable
    public final Throwable e() {
        return this.f69669e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return Intrinsics.areEqual(this.f69665a, c0Var.f69665a) && Intrinsics.areEqual(this.f69666b, c0Var.f69666b) && Intrinsics.areEqual(this.f69667c, c0Var.f69667c) && Intrinsics.areEqual(this.f69668d, c0Var.f69668d) && Intrinsics.areEqual(this.f69669e, c0Var.f69669e);
        }
        return false;
    }

    @NotNull
    public final c0 f(@Nullable Object obj, @Nullable n nVar, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        return new c0(obj, nVar, function1, obj2, th);
    }

    public final boolean h() {
        return this.f69669e != null;
    }

    public int hashCode() {
        Object obj = this.f69665a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        n nVar = this.f69666b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.f69667c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f69668d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f69669e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void i(@NotNull q<?> qVar, @NotNull Throwable th) {
        n nVar = this.f69666b;
        if (nVar != null) {
            qVar.o(nVar, th);
        }
        Function1<Throwable, Unit> function1 = this.f69667c;
        if (function1 == null) {
            return;
        }
        qVar.q(function1, th);
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f69665a + ", cancelHandler=" + this.f69666b + ", onCancellation=" + this.f69667c + ", idempotentResume=" + this.f69668d + ", cancelCause=" + this.f69669e + ')';
    }

    public /* synthetic */ c0(Object obj, n nVar, Function1 function1, Object obj2, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i4 & 2) != 0 ? null : nVar, (i4 & 4) != 0 ? null : function1, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }
}
