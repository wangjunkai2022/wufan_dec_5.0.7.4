package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletionState.kt */
/* loaded from: classes6.dex */
public final class e0 {
    @JvmField
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Object f70116a;
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Function1<Throwable, Unit> f70117b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@Nullable Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        this.f70116a = obj;
        this.f70117b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e0 d(e0 e0Var, Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = e0Var.f70116a;
        }
        if ((i4 & 2) != 0) {
            function1 = e0Var.f70117b;
        }
        return e0Var.c(obj, function1);
    }

    @Nullable
    public final Object a() {
        return this.f70116a;
    }

    @NotNull
    public final Function1<Throwable, Unit> b() {
        return this.f70117b;
    }

    @NotNull
    public final e0 c(@Nullable Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        return new e0(obj, function1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return Intrinsics.areEqual(this.f70116a, e0Var.f70116a) && Intrinsics.areEqual(this.f70117b, e0Var.f70117b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f70116a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f70117b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f70116a + ", onCancellation=" + this.f70117b + ')';
    }
}
