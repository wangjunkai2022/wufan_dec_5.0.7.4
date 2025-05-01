package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes6.dex */
public abstract class a<S extends c<?>> {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private S[] f71003b;

    /* renamed from: c  reason: collision with root package name */
    private int f71004c;

    /* renamed from: d  reason: collision with root package name */
    private int f71005d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private o f71006e;

    public static final /* synthetic */ int g(a aVar) {
        return aVar.f71004c;
    }

    public static final /* synthetic */ c[] h(a aVar) {
        return aVar.f71003b;
    }

    protected static /* synthetic */ void p() {
    }

    @NotNull
    public final u<Integer> d() {
        o oVar;
        synchronized (this) {
            oVar = this.f71006e;
            if (oVar == null) {
                oVar = new o(n());
                this.f71006e = oVar;
            }
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final S i() {
        S s4;
        o oVar;
        synchronized (this) {
            S[] o4 = o();
            if (o4 == null) {
                o4 = k(2);
                this.f71003b = o4;
            } else if (n() >= o4.length) {
                Object[] copyOf = Arrays.copyOf(o4, o4.length * 2);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f71003b = (S[]) ((c[]) copyOf);
                o4 = (S[]) ((c[]) copyOf);
            }
            int i4 = this.f71005d;
            do {
                s4 = o4[i4];
                if (s4 == null) {
                    s4 = j();
                    o4[i4] = s4;
                }
                i4++;
                if (i4 >= o4.length) {
                    i4 = 0;
                }
            } while (!s4.a(this));
            this.f71005d = i4;
            this.f71004c = n() + 1;
            oVar = this.f71006e;
        }
        if (oVar != null) {
            oVar.f0(1);
        }
        return s4;
    }

    @NotNull
    protected abstract S j();

    @NotNull
    protected abstract S[] k(int i4);

    protected final void l(@NotNull Function1<? super S, Unit> function1) {
        c[] cVarArr;
        if (this.f71004c == 0 || (cVarArr = this.f71003b) == null) {
            return;
        }
        int i4 = 0;
        int length = cVarArr.length;
        while (i4 < length) {
            c cVar = cVarArr[i4];
            i4++;
            if (cVar != null) {
                function1.invoke(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(@NotNull S s4) {
        o oVar;
        int i4;
        Continuation<Unit>[] b5;
        synchronized (this) {
            this.f71004c = n() - 1;
            oVar = this.f71006e;
            i4 = 0;
            if (n() == 0) {
                this.f71005d = 0;
            }
            b5 = s4.b(this);
        }
        int length = b5.length;
        while (i4 < length) {
            Continuation<Unit> continuation = b5[i4];
            i4++;
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
            }
        }
        if (oVar == null) {
            return;
        }
        oVar.f0(-1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int n() {
        return this.f71004c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final S[] o() {
        return this.f71003b;
    }
}
