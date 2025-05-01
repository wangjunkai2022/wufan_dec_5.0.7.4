package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SharedFlow.kt */
/* loaded from: classes6.dex */
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.a<p> implements i<T>, kotlinx.coroutines.flow.a<T>, kotlinx.coroutines.flow.internal.i<T> {

    /* renamed from: f  reason: collision with root package name */
    private final int f70805f;

    /* renamed from: g  reason: collision with root package name */
    private final int f70806g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final BufferOverflow f70807h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Object[] f70808i;

    /* renamed from: j  reason: collision with root package name */
    private long f70809j;

    /* renamed from: k  reason: collision with root package name */
    private long f70810k;

    /* renamed from: l  reason: collision with root package name */
    private int f70811l;

    /* renamed from: m  reason: collision with root package name */
    private int f70812m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    /* loaded from: classes6.dex */
    public static final class a implements g1 {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final SharedFlowImpl<?> f70813b;
        @JvmField

        /* renamed from: c  reason: collision with root package name */
        public long f70814c;
        @JvmField
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public final Object f70815d;
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final Continuation<Unit> f70816e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j4, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.f70813b = sharedFlowImpl;
            this.f70814c = j4;
            this.f70815d = obj;
            this.f70816e = continuation;
        }

        @Override // kotlinx.coroutines.g1
        public void dispose() {
            this.f70813b.D(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes6.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SharedFlowImpl(int i4, int i5, @NotNull BufferOverflow bufferOverflow) {
        this.f70805f = i4;
        this.f70806g = i5;
        this.f70807h = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(p pVar, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Unit unit;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(intercepted, 1);
        qVar.P();
        synchronized (this) {
            if (Z(pVar) < 0) {
                pVar.f71026b = qVar;
                pVar.f71026b = qVar;
            } else {
                Result.Companion companion = Result.Companion;
                qVar.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
            }
            unit = Unit.INSTANCE;
        }
        Object y2 = qVar.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return y2 == coroutine_suspended2 ? y2 : unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(a aVar) {
        synchronized (this) {
            if (aVar.f70814c < P()) {
                return;
            }
            Object[] objArr = this.f70808i;
            Intrinsics.checkNotNull(objArr);
            if (o.c(objArr, aVar.f70814c) != aVar) {
                return;
            }
            o.d(objArr, aVar.f70814c, o.f71024a);
            E();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void E() {
        if (this.f70806g != 0 || this.f70812m > 1) {
            Object[] objArr = this.f70808i;
            Intrinsics.checkNotNull(objArr);
            while (this.f70812m > 0 && o.c(objArr, (P() + V()) - 1) == o.f71024a) {
                this.f70812m--;
                o.d(objArr, P() + V(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:42|43))(1:44)|12|13|14|15|(3:16|(4:26|(1:28)(1:34)|29|(2:31|32)(1:33))(3:18|19|(2:21|22)(1:24))|25))(4:45|46|47|48)|38|39)(5:54|55|56|(2:58|(1:60))|62)|49|50|15|(3:16|(0)(0)|25)))|65|6|(0)(0)|49|50|15|(3:16|(0)(0)|25)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object F(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.f r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.F(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void G(long j4) {
        kotlinx.coroutines.flow.internal.c[] h4;
        if (kotlinx.coroutines.flow.internal.a.g(this) != 0 && (h4 = kotlinx.coroutines.flow.internal.a.h(this)) != null) {
            int i4 = 0;
            int length = h4.length;
            while (i4 < length) {
                kotlinx.coroutines.flow.internal.c cVar = h4[i4];
                i4++;
                if (cVar != null) {
                    p pVar = (p) cVar;
                    long j5 = pVar.f71025a;
                    if (j5 >= 0 && j5 < j4) {
                        pVar.f71025a = j4;
                    }
                }
            }
        }
        this.f70810k = j4;
    }

    private final void J() {
        Object[] objArr = this.f70808i;
        Intrinsics.checkNotNull(objArr);
        o.d(objArr, P(), null);
        this.f70811l--;
        long P = P() + 1;
        if (this.f70809j < P) {
            this.f70809j = P;
        }
        if (this.f70810k < P) {
            G(P);
        }
        if (s0.b()) {
            if (!(P() == P)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ Object K(SharedFlowImpl sharedFlowImpl, Object obj, Continuation continuation) {
        Object coroutine_suspended;
        if (sharedFlowImpl.b(obj)) {
            return Unit.INSTANCE;
        }
        Object L = sharedFlowImpl.L(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return L == coroutine_suspended ? L : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(T t4, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Continuation<Unit>[] continuationArr;
        a aVar;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(intercepted, 1);
        qVar.P();
        Continuation<Unit>[] continuationArr2 = kotlinx.coroutines.flow.internal.b.f71007a;
        synchronized (this) {
            if (X(t4)) {
                Result.Companion companion = Result.Companion;
                qVar.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
                continuationArr = N(continuationArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, V() + P(), t4, qVar);
                M(aVar2);
                this.f70812m++;
                if (this.f70806g == 0) {
                    continuationArr2 = N(continuationArr2);
                }
                continuationArr = continuationArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.s.a(qVar, aVar);
        }
        int i4 = 0;
        int length = continuationArr.length;
        while (i4 < length) {
            Continuation<Unit> continuation2 = continuationArr[i4];
            i4++;
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
            }
        }
        Object y2 = qVar.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return y2 == coroutine_suspended2 ? y2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Object obj) {
        int V = V();
        Object[] objArr = this.f70808i;
        if (objArr == null) {
            objArr = W(null, 0, 2);
        } else if (V >= objArr.length) {
            objArr = W(objArr, V, objArr.length * 2);
        }
        o.d(objArr, P() + V, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final Continuation<Unit>[] N(Continuation<Unit>[] continuationArr) {
        kotlinx.coroutines.flow.internal.c[] h4;
        p pVar;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        if (kotlinx.coroutines.flow.internal.a.g(this) != 0 && (h4 = kotlinx.coroutines.flow.internal.a.h(this)) != null) {
            int i4 = 0;
            int length2 = h4.length;
            while (i4 < length2) {
                kotlinx.coroutines.flow.internal.c cVar = h4[i4];
                i4++;
                if (cVar != null && (continuation = (pVar = (p) cVar).f71026b) != null && Z(pVar) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    pVar.f71026b = null;
                    length++;
                }
            }
        }
        return continuationArr;
    }

    private final long O() {
        return P() + this.f70811l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long P() {
        return Math.min(this.f70810k, this.f70809j);
    }

    protected static /* synthetic */ void R() {
    }

    private final Object S(long j4) {
        Object[] objArr = this.f70808i;
        Intrinsics.checkNotNull(objArr);
        Object c5 = o.c(objArr, j4);
        return c5 instanceof a ? ((a) c5).f70815d : c5;
    }

    private final long T() {
        return P() + this.f70811l + this.f70812m;
    }

    private final int U() {
        return (int) ((P() + this.f70811l) - this.f70809j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V() {
        return this.f70811l + this.f70812m;
    }

    private final Object[] W(Object[] objArr, int i4, int i5) {
        if (i5 > 0) {
            Object[] objArr2 = new Object[i5];
            this.f70808i = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long P = P();
            for (int i6 = 0; i6 < i4; i6++) {
                long j4 = i6 + P;
                o.d(objArr2, j4, o.c(objArr, j4));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X(T t4) {
        if (n() == 0) {
            return Y(t4);
        }
        if (this.f70811l >= this.f70806g && this.f70810k <= this.f70809j) {
            int i4 = b.$EnumSwitchMapping$0[this.f70807h.ordinal()];
            if (i4 == 1) {
                return false;
            }
            if (i4 == 2) {
                return true;
            }
        }
        M(t4);
        int i5 = this.f70811l + 1;
        this.f70811l = i5;
        if (i5 > this.f70806g) {
            J();
        }
        if (U() > this.f70805f) {
            b0(this.f70809j + 1, this.f70810k, O(), T());
        }
        return true;
    }

    private final boolean Y(T t4) {
        if (s0.b()) {
            if (!(n() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f70805f == 0) {
            return true;
        }
        M(t4);
        int i4 = this.f70811l + 1;
        this.f70811l = i4;
        if (i4 > this.f70805f) {
            J();
        }
        this.f70810k = P() + this.f70811l;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Z(p pVar) {
        long j4 = pVar.f71025a;
        if (j4 < O()) {
            return j4;
        }
        if (this.f70806g <= 0 && j4 <= P() && this.f70812m != 0) {
            return j4;
        }
        return -1L;
    }

    private final Object a0(p pVar) {
        Object obj;
        Continuation<Unit>[] continuationArr = kotlinx.coroutines.flow.internal.b.f71007a;
        synchronized (this) {
            long Z = Z(pVar);
            if (Z < 0) {
                obj = o.f71024a;
            } else {
                long j4 = pVar.f71025a;
                Object S = S(Z);
                pVar.f71025a = Z + 1;
                continuationArr = c0(j4);
                obj = S;
            }
        }
        int i4 = 0;
        int length = continuationArr.length;
        while (i4 < length) {
            Continuation<Unit> continuation = continuationArr[i4];
            i4++;
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    private final void b0(long j4, long j5, long j6, long j7) {
        long min = Math.min(j5, j4);
        if (s0.b()) {
            if (!(min >= P())) {
                throw new AssertionError();
            }
        }
        for (long P = P(); P < min; P = 1 + P) {
            Object[] objArr = this.f70808i;
            Intrinsics.checkNotNull(objArr);
            o.d(objArr, P, null);
        }
        this.f70809j = j4;
        this.f70810k = j5;
        this.f70811l = (int) (j6 - min);
        this.f70812m = (int) (j7 - j6);
        if (s0.b()) {
            if (!(this.f70811l >= 0)) {
                throw new AssertionError();
            }
        }
        if (s0.b()) {
            if (!(this.f70812m >= 0)) {
                throw new AssertionError();
            }
        }
        if (s0.b()) {
            if (!(this.f70809j <= P() + ((long) this.f70811l))) {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @NotNull
    /* renamed from: H */
    public p j() {
        return new p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @NotNull
    /* renamed from: I */
    public p[] k(int i4) {
        return new p[i4];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T Q() {
        Object[] objArr = this.f70808i;
        Intrinsics.checkNotNull(objArr);
        return (T) o.c(objArr, (this.f70809j + U()) - 1);
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super T> fVar, @NotNull Continuation<?> continuation) {
        return F(this, fVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.i
    public boolean b(T t4) {
        int i4;
        boolean z4;
        Continuation<Unit>[] continuationArr = kotlinx.coroutines.flow.internal.b.f71007a;
        synchronized (this) {
            i4 = 0;
            if (X(t4)) {
                continuationArr = N(continuationArr);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        int length = continuationArr.length;
        while (i4 < length) {
            Continuation<Unit> continuation = continuationArr[i4];
            i4++;
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
            }
        }
        return z4;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @NotNull
    public e<T> c(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return o.e(this, coroutineContext, i4, bufferOverflow);
    }

    @NotNull
    public final Continuation<Unit>[] c0(long j4) {
        int i4;
        long j5;
        kotlinx.coroutines.flow.internal.c[] h4;
        if (s0.b()) {
            if (!(j4 >= this.f70810k)) {
                throw new AssertionError();
            }
        }
        if (j4 > this.f70810k) {
            return kotlinx.coroutines.flow.internal.b.f71007a;
        }
        long P = P();
        long j6 = this.f70811l + P;
        long j7 = 1;
        if (this.f70806g == 0 && this.f70812m > 0) {
            j6++;
        }
        if (kotlinx.coroutines.flow.internal.a.g(this) != 0 && (h4 = kotlinx.coroutines.flow.internal.a.h(this)) != null) {
            int length = h4.length;
            int i5 = 0;
            while (i5 < length) {
                kotlinx.coroutines.flow.internal.c cVar = h4[i5];
                i5++;
                if (cVar != null) {
                    long j8 = ((p) cVar).f71025a;
                    if (j8 >= 0 && j8 < j6) {
                        j6 = j8;
                    }
                }
            }
        }
        if (s0.b()) {
            if (!(j6 >= this.f70810k)) {
                throw new AssertionError();
            }
        }
        if (j6 <= this.f70810k) {
            return kotlinx.coroutines.flow.internal.b.f71007a;
        }
        long O = O();
        if (n() > 0) {
            i4 = Math.min(this.f70812m, this.f70806g - ((int) (O - j6)));
        } else {
            i4 = this.f70812m;
        }
        Continuation<Unit>[] continuationArr = kotlinx.coroutines.flow.internal.b.f71007a;
        long j9 = this.f70812m + O;
        if (i4 > 0) {
            continuationArr = new Continuation[i4];
            Object[] objArr = this.f70808i;
            Intrinsics.checkNotNull(objArr);
            long j10 = O;
            int i6 = 0;
            while (true) {
                if (O >= j9) {
                    j5 = j6;
                    break;
                }
                long j11 = O + j7;
                Object c5 = o.c(objArr, O);
                o0 o0Var = o.f71024a;
                if (c5 != o0Var) {
                    j5 = j6;
                    Objects.requireNonNull(c5, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c5;
                    int i7 = i6 + 1;
                    continuationArr[i6] = aVar.f70816e;
                    o.d(objArr, O, o0Var);
                    o.d(objArr, j10, aVar.f70815d);
                    j10++;
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = i7;
                    O = j11;
                    j6 = j5;
                } else {
                    O = j11;
                }
                j7 = 1;
            }
            O = j10;
        } else {
            j5 = j6;
        }
        int i8 = (int) (O - P);
        long j12 = n() == 0 ? O : j5;
        long max = Math.max(this.f70809j, O - Math.min(this.f70805f, i8));
        if (this.f70806g == 0 && max < j9) {
            Object[] objArr2 = this.f70808i;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(o.c(objArr2, max), o.f71024a)) {
                O++;
                max++;
            }
        }
        b0(max, j12, O, j9);
        E();
        return true ^ (continuationArr.length == 0) ? N(continuationArr) : continuationArr;
    }

    public final long d0() {
        long j4 = this.f70809j;
        if (j4 < this.f70810k) {
            this.f70810k = j4;
        }
        return j4;
    }

    @Override // kotlinx.coroutines.flow.n
    @NotNull
    public List<T> e() {
        List<T> emptyList;
        synchronized (this) {
            int U = U();
            if (U == 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(U);
            Object[] objArr = this.f70808i;
            Intrinsics.checkNotNull(objArr);
            int i4 = 0;
            while (i4 < U) {
                int i5 = i4 + 1;
                arrayList.add(o.c(objArr, this.f70809j + i4));
                i4 = i5;
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t4, @NotNull Continuation<? super Unit> continuation) {
        return K(this, t4, continuation);
    }

    @Override // kotlinx.coroutines.flow.i
    public void f() {
        synchronized (this) {
            b0(O(), this.f70810k, O(), T());
            Unit unit = Unit.INSTANCE;
        }
    }
}
