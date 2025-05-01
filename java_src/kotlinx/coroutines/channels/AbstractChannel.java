package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes.dex */
public abstract class AbstractChannel<E> extends kotlinx.coroutines.channels.b<E> implements k<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes.dex */
    public static final class a<E> implements ChannelIterator<E> {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final AbstractChannel<E> f69671a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private Object f69672b = kotlinx.coroutines.channels.a.f69944f;

        public a(@NotNull AbstractChannel<E> abstractChannel) {
            this.f69671a = abstractChannel;
        }

        private final boolean e(Object obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (pVar.f69995e == null) {
                    return false;
                }
                throw n0.p(pVar.l0());
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object f(Continuation<? super Boolean> continuation) {
            Continuation intercepted;
            Object coroutine_suspended;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            kotlinx.coroutines.q b5 = kotlinx.coroutines.s.b(intercepted);
            d dVar = new d(this, b5);
            while (true) {
                if (this.f69671a.a0(dVar)) {
                    this.f69671a.p0(b5, dVar);
                    break;
                }
                Object l02 = this.f69671a.l0();
                setResult(l02);
                if (l02 instanceof p) {
                    p pVar = (p) l02;
                    if (pVar.f69995e == null) {
                        Result.Companion companion = Result.Companion;
                        b5.resumeWith(Result.m35constructorimpl(Boxing.boxBoolean(false)));
                    } else {
                        Result.Companion companion2 = Result.Companion;
                        b5.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(pVar.l0())));
                    }
                } else if (l02 != kotlinx.coroutines.channels.a.f69944f) {
                    Boolean boxBoolean = Boxing.boxBoolean(true);
                    Function1<E, Unit> function1 = this.f69671a.f69948b;
                    b5.s(boxBoolean, function1 == null ? null : OnUndeliveredElementKt.a(function1, l02, b5.getContext()));
                }
            }
            Object y2 = b5.y();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (y2 == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return y2;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @JvmName(name = "next")
        public /* synthetic */ Object a(Continuation continuation) {
            return ChannelIterator.DefaultImpls.a(this, continuation);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Nullable
        public Object b(@NotNull Continuation<? super Boolean> continuation) {
            Object d5 = d();
            o0 o0Var = kotlinx.coroutines.channels.a.f69944f;
            if (d5 != o0Var) {
                return Boxing.boxBoolean(e(d()));
            }
            setResult(this.f69671a.l0());
            return d() != o0Var ? Boxing.boxBoolean(e(d())) : f(continuation);
        }

        @Nullable
        public final Object d() {
            return this.f69672b;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            E e5 = (E) this.f69672b;
            if (!(e5 instanceof p)) {
                o0 o0Var = kotlinx.coroutines.channels.a.f69944f;
                if (e5 != o0Var) {
                    this.f69672b = o0Var;
                    return e5;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw n0.p(((p) e5).l0());
        }

        public final void setResult(@Nullable Object obj) {
            this.f69672b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static class b<E> extends x<E> {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final kotlinx.coroutines.p<Object> f69673e;
        @JvmField

        /* renamed from: f  reason: collision with root package name */
        public final int f69674f;

        public b(@NotNull kotlinx.coroutines.p<Object> pVar, int i4) {
            this.f69673e = pVar;
            this.f69674f = i4;
        }

        @Override // kotlinx.coroutines.channels.x
        public void g0(@NotNull p<?> pVar) {
            if (this.f69674f == 1) {
                kotlinx.coroutines.p<Object> pVar2 = this.f69673e;
                Result.Companion companion = Result.Companion;
                pVar2.resumeWith(Result.m35constructorimpl(n.b(n.f69990b.a(pVar.f69995e))));
                return;
            }
            kotlinx.coroutines.p<Object> pVar3 = this.f69673e;
            Result.Companion companion2 = Result.Companion;
            pVar3.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(pVar.l0())));
        }

        @Nullable
        public final Object h0(E e5) {
            return this.f69674f == 1 ? n.b(n.f69990b.c(e5)) : e5;
        }

        @Override // kotlinx.coroutines.channels.y
        public void j(E e5) {
            this.f69673e.Y(kotlinx.coroutines.r.f71241d);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "ReceiveElement@" + t0.b(this) + "[receiveMode=" + this.f69674f + ']';
        }

        @Override // kotlinx.coroutines.channels.y
        @Nullable
        public o0 v(E e5, @Nullable LockFreeLinkedListNode.d dVar) {
            Object N = this.f69673e.N(h0(e5), dVar == null ? null : dVar.f71080c, f0(e5));
            if (N == null) {
                return null;
            }
            if (s0.b()) {
                if (!(N == kotlinx.coroutines.r.f71241d)) {
                    throw new AssertionError();
                }
            }
            if (dVar != null) {
                dVar.d();
            }
            return kotlinx.coroutines.r.f71241d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class c<E> extends b<E> {
        @JvmField
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public final Function1<E, Unit> f69675g;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull kotlinx.coroutines.p<Object> pVar, int i4, @NotNull Function1<? super E, Unit> function1) {
            super(pVar, i4);
            this.f69675g = function1;
        }

        @Override // kotlinx.coroutines.channels.x
        @Nullable
        public Function1<Throwable, Unit> f0(E e5) {
            return OnUndeliveredElementKt.a(this.f69675g, e5, this.f69673e.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static class d<E> extends x<E> {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final a<E> f69676e;
        @JvmField
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public final kotlinx.coroutines.p<Boolean> f69677f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull a<E> aVar, @NotNull kotlinx.coroutines.p<? super Boolean> pVar) {
            this.f69676e = aVar;
            this.f69677f = pVar;
        }

        @Override // kotlinx.coroutines.channels.x
        @Nullable
        public Function1<Throwable, Unit> f0(E e5) {
            Function1<E, Unit> function1 = this.f69676e.f69671a.f69948b;
            if (function1 == null) {
                return null;
            }
            return OnUndeliveredElementKt.a(function1, e5, this.f69677f.getContext());
        }

        @Override // kotlinx.coroutines.channels.x
        public void g0(@NotNull p<?> pVar) {
            Object m4;
            if (pVar.f69995e == null) {
                m4 = p.a.b(this.f69677f, Boolean.FALSE, null, 2, null);
            } else {
                m4 = this.f69677f.m(pVar.l0());
            }
            if (m4 != null) {
                this.f69676e.setResult(pVar);
                this.f69677f.Y(m4);
            }
        }

        @Override // kotlinx.coroutines.channels.y
        public void j(E e5) {
            this.f69676e.setResult(e5);
            this.f69677f.Y(kotlinx.coroutines.r.f71241d);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return Intrinsics.stringPlus("ReceiveHasNext@", t0.b(this));
        }

        @Override // kotlinx.coroutines.channels.y
        @Nullable
        public o0 v(E e5, @Nullable LockFreeLinkedListNode.d dVar) {
            Object N = this.f69677f.N(Boolean.TRUE, dVar == null ? null : dVar.f71080c, f0(e5));
            if (N == null) {
                return null;
            }
            if (s0.b()) {
                if (!(N == kotlinx.coroutines.r.f71241d)) {
                    throw new AssertionError();
                }
            }
            if (dVar != null) {
                dVar.d();
            }
            return kotlinx.coroutines.r.f71241d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class e<R, E> extends x<E> implements g1 {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final AbstractChannel<E> f69678e;
        @JvmField
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public final kotlinx.coroutines.selects.f<R> f69679f;
        @JvmField
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public final Function2<Object, Continuation<? super R>, Object> f69680g;
        @JvmField

        /* renamed from: h  reason: collision with root package name */
        public final int f69681h;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@NotNull AbstractChannel<E> abstractChannel, @NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i4) {
            this.f69678e = abstractChannel;
            this.f69679f = fVar;
            this.f69680g = function2;
            this.f69681h = i4;
        }

        @Override // kotlinx.coroutines.g1
        public void dispose() {
            if (W()) {
                this.f69678e.j0();
            }
        }

        @Override // kotlinx.coroutines.channels.x
        @Nullable
        public Function1<Throwable, Unit> f0(E e5) {
            Function1<E, Unit> function1 = this.f69678e.f69948b;
            if (function1 == null) {
                return null;
            }
            return OnUndeliveredElementKt.a(function1, e5, this.f69679f.r().getContext());
        }

        @Override // kotlinx.coroutines.channels.x
        public void g0(@NotNull p<?> pVar) {
            if (this.f69679f.q()) {
                int i4 = this.f69681h;
                if (i4 == 0) {
                    this.f69679f.t(pVar.l0());
                } else if (i4 != 1) {
                } else {
                    s3.a.f(this.f69680g, n.b(n.f69990b.a(pVar.f69995e)), this.f69679f.r(), null, 4, null);
                }
            }
        }

        @Override // kotlinx.coroutines.channels.y
        public void j(E e5) {
            s3.a.e(this.f69680g, this.f69681h == 1 ? n.b(n.f69990b.c(e5)) : e5, this.f69679f.r(), f0(e5));
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "ReceiveSelect@" + t0.b(this) + '[' + this.f69679f + ",receiveMode=" + this.f69681h + ']';
        }

        @Override // kotlinx.coroutines.channels.y
        @Nullable
        public o0 v(E e5, @Nullable LockFreeLinkedListNode.d dVar) {
            return (o0) this.f69679f.o(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public final class f extends kotlinx.coroutines.f {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private final x<?> f69682b;

        public f(@NotNull x<?> xVar) {
            this.f69682b = xVar;
        }

        @Override // kotlinx.coroutines.o
        public void a(@Nullable Throwable th) {
            if (this.f69682b.W()) {
                AbstractChannel.this.j0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }

        @NotNull
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f69682b + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class g<E> extends LockFreeLinkedListNode.e<a0> {
        public g(@NotNull kotlinx.coroutines.internal.v vVar) {
            super(vVar);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.e, kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected Object e(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof p) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof a0) {
                return null;
            }
            return kotlinx.coroutines.channels.a.f69944f;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        public Object j(@NotNull LockFreeLinkedListNode.d dVar) {
            o0 h02 = ((a0) dVar.f71078a).h0(dVar);
            if (h02 == null) {
                return kotlinx.coroutines.internal.x.f71156a;
            }
            Object obj = kotlinx.coroutines.internal.c.f71101b;
            if (h02 == obj) {
                return obj;
            }
            if (s0.b()) {
                if (h02 == kotlinx.coroutines.r.f71241d) {
                    return null;
                }
                throw new AssertionError();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public void k(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            ((a0) lockFreeLinkedListNode).i0();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static final class h extends LockFreeLinkedListNode.c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LockFreeLinkedListNode f69684d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AbstractChannel f69685e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f69684d = lockFreeLinkedListNode;
            this.f69685e = abstractChannel;
        }

        @Override // kotlinx.coroutines.internal.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f69685e.f0()) {
                return null;
            }
            return kotlinx.coroutines.internal.w.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class i implements kotlinx.coroutines.selects.d<E> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractChannel<E> f69686b;

        i(AbstractChannel<E> abstractChannel) {
            this.f69686b = abstractChannel;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void e(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f69686b.o0(fVar, 0, function2);
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class j implements kotlinx.coroutines.selects.d<n<? extends E>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractChannel<E> f69687b;

        j(AbstractChannel<E> abstractChannel) {
            this.f69687b = abstractChannel;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void e(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<? super n<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f69687b.o0(fVar, 1, function2);
        }
    }

    public AbstractChannel(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0(x<? super E> xVar) {
        boolean b02 = b0(xVar);
        if (b02) {
            k0();
        }
        return b02;
    }

    private final <R> boolean c0(kotlinx.coroutines.selects.f<? super R> fVar, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i4) {
        e eVar = new e(this, fVar, function2, i4);
        boolean a02 = a0(eVar);
        if (a02) {
            fVar.l(eVar);
        }
        return a02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.channels.AbstractChannel$b] */
    public final <R> Object n0(int i4, Continuation<? super R> continuation) {
        Continuation intercepted;
        c cVar;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        kotlinx.coroutines.q b5 = kotlinx.coroutines.s.b(intercepted);
        if (this.f69948b == null) {
            cVar = new b(b5, i4);
        } else {
            cVar = new c(b5, i4, this.f69948b);
        }
        while (true) {
            if (a0(cVar)) {
                p0(b5, cVar);
                break;
            }
            Object l02 = l0();
            if (l02 instanceof p) {
                cVar.g0((p) l02);
                break;
            } else if (l02 != kotlinx.coroutines.channels.a.f69944f) {
                b5.s(cVar.h0(l02), cVar.f0(l02));
                break;
            }
        }
        Object y2 = b5.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void o0(kotlinx.coroutines.selects.f<? super R> fVar, int i4, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!fVar.h()) {
            if (g0()) {
                if (c0(fVar, function2, i4)) {
                    return;
                }
            } else {
                Object m02 = m0(fVar);
                if (m02 == kotlinx.coroutines.selects.g.d()) {
                    return;
                }
                if (m02 != kotlinx.coroutines.channels.a.f69944f && m02 != kotlinx.coroutines.internal.c.f71101b) {
                    q0(function2, fVar, i4, m02);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(kotlinx.coroutines.p<?> pVar, x<?> xVar) {
        pVar.k(new f(xVar));
    }

    private final <R> void q0(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, kotlinx.coroutines.selects.f<? super R> fVar, int i4, Object obj) {
        boolean z4 = obj instanceof p;
        if (!z4) {
            if (i4 == 1) {
                n.b bVar = n.f69990b;
                s3.b.d(function2, n.b(z4 ? bVar.a(((p) obj).f69995e) : bVar.c(obj)), fVar.r());
                return;
            }
            s3.b.d(function2, obj, fVar.r());
        } else if (i4 != 0) {
            if (i4 == 1 && fVar.q()) {
                s3.b.d(function2, n.b(n.f69990b.a(((p) obj).f69995e)), fVar.r());
            }
        } else {
            throw n0.p(((p) obj).l0());
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public final kotlinx.coroutines.selects.d<E> F() {
        return new i(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public final kotlinx.coroutines.selects.d<n<E>> G() {
        return new j(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public kotlinx.coroutines.selects.d<E> H() {
        return k.a.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public final Object I() {
        Object l02 = l0();
        return l02 == kotlinx.coroutines.channels.a.f69944f ? n.f69990b.b() : l02 instanceof p ? n.f69990b.a(((p) l02).f69995e) : n.f69990b.c(l02);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object L(@NotNull Continuation<? super E> continuation) {
        return k.a.e(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.n<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.f69690d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69690d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f69688b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f69690d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.l0()
            kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.channels.a.f69944f
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.p
            if (r0 == 0) goto L4b
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.f69990b
            kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
            java.lang.Throwable r5 = r5.f69995e
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.f69990b
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.f69690d = r3
            java.lang.Object r5 = r4.n0(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r5 = r5.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.M(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @Nullable
    public y<E> O() {
        y<E> O = super.O();
        if (O != null && !(O instanceof p)) {
            j0();
        }
        return O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public final Object Q(@NotNull Continuation<? super E> continuation) {
        Object l02 = l0();
        return (l02 == kotlinx.coroutines.channels.a.f69944f || (l02 instanceof p)) ? n0(0, continuation) : l02;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: Y */
    public final boolean a(@Nullable Throwable th) {
        boolean R = R(th);
        h0(R);
        return R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final g<E> Z() {
        return new g<>(p());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void b(@Nullable CancellationException cancellationException) {
        if (f()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(Intrinsics.stringPlus(t0.a(this), " was cancelled"));
        }
        a(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b0(@NotNull x<? super E> xVar) {
        int c02;
        LockFreeLinkedListNode Q;
        if (e0()) {
            LockFreeLinkedListNode p4 = p();
            do {
                Q = p4.Q();
                if (!(!(Q instanceof a0))) {
                    return false;
                }
            } while (!Q.E(xVar, p4));
        } else {
            LockFreeLinkedListNode p5 = p();
            h hVar = new h(xVar, this);
            do {
                LockFreeLinkedListNode Q2 = p5.Q();
                if (!(!(Q2 instanceof a0))) {
                    return false;
                }
                c02 = Q2.c0(xVar, p5, hVar);
                if (c02 != 1) {
                }
            } while (c02 != 2);
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d0() {
        return p().M() instanceof y;
    }

    protected abstract boolean e0();

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean f() {
        return m() != null && f0();
    }

    protected abstract boolean f0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g0() {
        return !(p().M() instanceof a0) && f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h0(boolean z4) {
        p<?> n4 = n();
        if (n4 != null) {
            Object c5 = kotlinx.coroutines.internal.p.c(null, 1, null);
            while (true) {
                LockFreeLinkedListNode Q = n4.Q();
                if (Q instanceof kotlinx.coroutines.internal.v) {
                    i0(c5, n4);
                    return;
                } else if (s0.b() && !(Q instanceof a0)) {
                    throw new AssertionError();
                } else {
                    if (!Q.W()) {
                        Q.R();
                    } else {
                        c5 = kotlinx.coroutines.internal.p.h(c5, (a0) Q);
                    }
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    protected void i0(@NotNull Object obj, @NotNull p<?> pVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((a0) obj).g0(pVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            ((a0) arrayList.get(size)).g0(pVar);
            if (i4 < 0) {
                return;
            }
            size = i4;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return g0();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public final ChannelIterator<E> iterator() {
        return new a(this);
    }

    protected void j0() {
    }

    protected void k0() {
    }

    @Nullable
    protected Object l0() {
        while (true) {
            a0 P = P();
            if (P == null) {
                return kotlinx.coroutines.channels.a.f69944f;
            }
            o0 h02 = P.h0(null);
            if (h02 != null) {
                if (s0.b()) {
                    if (!(h02 == kotlinx.coroutines.r.f71241d)) {
                        throw new AssertionError();
                    }
                }
                P.e0();
                return P.f0();
            }
            P.i0();
        }
    }

    @Nullable
    protected Object m0(@NotNull kotlinx.coroutines.selects.f<?> fVar) {
        g<E> Z = Z();
        Object u4 = fVar.u(Z);
        if (u4 != null) {
            return u4;
        }
        Z.o().e0();
        return Z.o().f0();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return (E) k.a.d(this);
    }
}
