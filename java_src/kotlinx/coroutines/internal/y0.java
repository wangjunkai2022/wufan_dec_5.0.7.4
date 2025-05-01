package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadContext.kt */
/* loaded from: classes6.dex */
public final class y0 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f71158a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f71159b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final b3<Object>[] f71160c;

    /* renamed from: d  reason: collision with root package name */
    private int f71161d;

    public y0(@NotNull CoroutineContext coroutineContext, int i4) {
        this.f71158a = coroutineContext;
        this.f71159b = new Object[i4];
        this.f71160c = new b3[i4];
    }

    public final void a(@NotNull b3<?> b3Var, @Nullable Object obj) {
        Object[] objArr = this.f71159b;
        int i4 = this.f71161d;
        objArr[i4] = obj;
        b3<Object>[] b3VarArr = this.f71160c;
        this.f71161d = i4 + 1;
        b3VarArr[i4] = b3Var;
    }

    public final void b(@NotNull CoroutineContext coroutineContext) {
        int length = this.f71160c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = length - 1;
            b3<Object> b3Var = this.f71160c[length];
            Intrinsics.checkNotNull(b3Var);
            b3Var.C(coroutineContext, this.f71159b[length]);
            if (i4 < 0) {
                return;
            }
            length = i4;
        }
    }
}
