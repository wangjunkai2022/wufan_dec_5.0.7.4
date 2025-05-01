package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Await.kt */
/* loaded from: classes6.dex */
public final class e<T> {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f70109b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final w0<T>[] f70110a;
    @NotNull
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Await.kt */
    /* loaded from: classes6.dex */
    public final class a extends f2 {
        @NotNull
        private volatile /* synthetic */ Object _disposer = null;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final p<List<? extends T>> f70111f;

        /* renamed from: g  reason: collision with root package name */
        public g1 f70112g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull p<? super List<? extends T>> pVar) {
            this.f70111f = pVar;
        }

        @Override // kotlinx.coroutines.f0
        public void e0(@Nullable Throwable th) {
            if (th != null) {
                Object m4 = this.f70111f.m(th);
                if (m4 != null) {
                    this.f70111f.Y(m4);
                    e<T>.b h02 = h0();
                    if (h02 == null) {
                        return;
                    }
                    h02.b();
                    return;
                }
                return;
            }
            if (e.f70109b.decrementAndGet(e.this) == 0) {
                p<List<? extends T>> pVar = this.f70111f;
                Result.Companion companion = Result.Companion;
                w0[] w0VarArr = ((e) e.this).f70110a;
                ArrayList arrayList = new ArrayList(w0VarArr.length);
                int i4 = 0;
                int length = w0VarArr.length;
                while (i4 < length) {
                    w0 w0Var = w0VarArr[i4];
                    i4++;
                    arrayList.add(w0Var.g());
                }
                pVar.resumeWith(Result.m35constructorimpl(arrayList));
            }
        }

        @Nullable
        public final e<T>.b h0() {
            return (b) this._disposer;
        }

        @NotNull
        public final g1 i0() {
            g1 g1Var = this.f70112g;
            if (g1Var != null) {
                return g1Var;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            e0(th);
            return Unit.INSTANCE;
        }

        public final void j0(@Nullable e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void k0(@NotNull g1 g1Var) {
            this.f70112g = g1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Await.kt */
    /* loaded from: classes6.dex */
    public final class b extends n {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private final e<T>.a[] f70114b;

        public b(@NotNull e<T>.a[] aVarArr) {
            this.f70114b = aVarArr;
        }

        @Override // kotlinx.coroutines.o
        public void a(@Nullable Throwable th) {
            b();
        }

        public final void b() {
            e<T>.a[] aVarArr = this.f70114b;
            int length = aVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                e<T>.a aVar = aVarArr[i4];
                i4++;
                aVar.i0().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f70114b + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull w0<? extends T>[] w0VarArr) {
        this.f70110a = w0VarArr;
        this.notCompletedCount = w0VarArr.length;
    }

    @Nullable
    public final Object b(@NotNull Continuation<? super List<? extends T>> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        q qVar = new q(intercepted, 1);
        qVar.P();
        int length = this.f70110a.length;
        a[] aVarArr = new a[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            w0 w0Var = this.f70110a[i5];
            w0Var.start();
            a aVar = new a(qVar);
            aVar.k0(w0Var.z(aVar));
            Unit unit = Unit.INSTANCE;
            aVarArr[i5] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        while (i4 < length) {
            a aVar2 = aVarArr[i4];
            i4++;
            aVar2.j0(bVar);
        }
        if (qVar.isCompleted()) {
            bVar.b();
        } else {
            qVar.k(bVar);
        }
        Object y2 = qVar.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y2;
    }
}
