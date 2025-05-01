package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.channels.h;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ConflatedBroadcastChannel.kt */
@ObsoleteCoroutinesApi
/* loaded from: classes.dex */
public final class q<E> implements h<E> {

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f69997c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f69998d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f69999e;
    @Deprecated
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private static final o0 f70001g;
    @Deprecated
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final c<Object> f70002h;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull
    private volatile /* synthetic */ int _updating;
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final b f69996b = new b(null);
    @Deprecated
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final a f70000f = new a(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConflatedBroadcastChannel.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        @JvmField
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f70003a;

        public a(@Nullable Throwable th) {
            this.f70003a = th;
        }

        @NotNull
        public final Throwable a() {
            Throwable th = this.f70003a;
            return th == null ? new ClosedSendChannelException(o.f69994a) : th;
        }

        @NotNull
        public final Throwable b() {
            Throwable th = this.f70003a;
            return th == null ? new IllegalStateException(o.f69994a) : th;
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    /* loaded from: classes6.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConflatedBroadcastChannel.kt */
    /* loaded from: classes6.dex */
    public static final class c<E> {
        @JvmField
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final Object f70004a;
        @JvmField
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final d<E>[] f70005b;

        public c(@Nullable Object obj, @Nullable d<E>[] dVarArr) {
            this.f70004a = obj;
            this.f70005b = dVarArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConflatedBroadcastChannel.kt */
    /* loaded from: classes6.dex */
    public static final class d<E> extends r<E> implements ReceiveChannel<E> {
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        private final q<E> f70006g;

        public d(@NotNull q<E> qVar) {
            super(null);
            this.f70006g = qVar;
        }

        @Override // kotlinx.coroutines.channels.r, kotlinx.coroutines.channels.b
        @NotNull
        public Object C(E e5) {
            return super.C(e5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.coroutines.channels.r, kotlinx.coroutines.channels.AbstractChannel
        public void h0(boolean z4) {
            if (z4) {
                this.f70006g.f(this);
            }
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    /* loaded from: classes6.dex */
    public static final class e implements kotlinx.coroutines.selects.e<E, b0<? super E>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<E> f70007b;

        e(q<E> qVar) {
            this.f70007b = qVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void A(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, E e5, @NotNull Function2<? super b0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f70007b.l(fVar, e5, function2);
        }
    }

    static {
        o0 o0Var = new o0("UNDEFINED");
        f70001g = o0Var;
        f70002h = new c<>(o0Var, null);
        f69997c = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
        f69998d = AtomicIntegerFieldUpdater.newUpdater(q.class, "_updating");
        f69999e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "onCloseHandler");
    }

    public q() {
        this._state = f70002h;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    private final d<E>[] e(d<E>[] dVarArr, d<E> dVar) {
        if (dVarArr == null) {
            d<E>[] dVarArr2 = new d[1];
            for (int i4 = 0; i4 < 1; i4++) {
                dVarArr2[i4] = dVar;
            }
            return dVarArr2;
        }
        return (d[]) ArraysKt.plus(dVarArr, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(d<E> dVar) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                obj2 = cVar.f70004a;
                dVarArr = cVar.f70005b;
                Intrinsics.checkNotNull(dVarArr);
            } else {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
            }
        } while (!f69997c.compareAndSet(this, obj, new c(obj2, m(dVarArr, dVar))));
    }

    public static /* synthetic */ void h() {
    }

    private final void j(Throwable th) {
        o0 o0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (o0Var = kotlinx.coroutines.channels.a.f69946h) || !f69999e.compareAndSet(this, obj, o0Var)) {
            return;
        }
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(th);
    }

    private final a k(E e5) {
        Object obj;
        if (f69998d.compareAndSet(this, 0, 1)) {
            do {
                try {
                    obj = this._state;
                    if (obj instanceof a) {
                        return (a) obj;
                    }
                    if (obj instanceof c) {
                    } else {
                        throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
                    }
                } finally {
                    this._updating = 0;
                }
            } while (!f69997c.compareAndSet(this, obj, new c(e5, ((c) obj).f70005b)));
            d<E>[] dVarArr = ((c) obj).f70005b;
            if (dVarArr != null) {
                int length = dVarArr.length;
                int i4 = 0;
                while (i4 < length) {
                    d<E> dVar = dVarArr[i4];
                    i4++;
                    dVar.C(e5);
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void l(kotlinx.coroutines.selects.f<? super R> fVar, E e5, Function2<? super b0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
        if (fVar.q()) {
            a k4 = k(e5);
            if (k4 == null) {
                s3.b.d(function2, this, fVar.r());
            } else {
                fVar.t(k4.a());
            }
        }
    }

    private final d<E>[] m(d<E>[] dVarArr, d<E> dVar) {
        int indexOf;
        int length = dVarArr.length;
        indexOf = ArraysKt___ArraysKt.indexOf(dVarArr, dVar);
        if (s0.b()) {
            if (!(indexOf >= 0)) {
                throw new AssertionError();
            }
        }
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr2 = new d[length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(dVarArr, dVarArr2, 0, 0, indexOf, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(dVarArr, dVarArr2, indexOf, indexOf + 1, 0, 8, (Object) null);
        return dVarArr2;
    }

    @Override // kotlinx.coroutines.channels.h
    /* renamed from: R */
    public boolean a(@Nullable Throwable th) {
        Object obj;
        int i4;
        do {
            obj = this._state;
            i4 = 0;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
            }
        } while (!f69997c.compareAndSet(this, obj, th == null ? f70000f : new a(th)));
        d<E>[] dVarArr = ((c) obj).f70005b;
        if (dVarArr != null) {
            int length = dVarArr.length;
            while (i4 < length) {
                d<E> dVar = dVarArr[i4];
                i4++;
                dVar.R(th);
            }
        }
        j(th);
        return true;
    }

    @Override // kotlinx.coroutines.channels.b0
    @Nullable
    public Object S(E e5, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        a k4 = k(e5);
        if (k4 == null) {
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended == null) {
                return null;
            }
            return Unit.INSTANCE;
        }
        throw k4.a();
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean U() {
        return this._state instanceof a;
    }

    @Override // kotlinx.coroutines.channels.h
    public void b(@Nullable CancellationException cancellationException) {
        a(cancellationException);
    }

    public final E g() {
        Object obj = this._state;
        if (!(obj instanceof a)) {
            if (obj instanceof c) {
                E e5 = (E) ((c) obj).f70004a;
                if (e5 != f70001g) {
                    return e5;
                }
                throw new IllegalStateException("No value");
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
        }
        throw ((a) obj).b();
    }

    @Nullable
    public final E i() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (obj instanceof c) {
            o0 o0Var = f70001g;
            E e5 = (E) ((c) obj).f70004a;
            if (e5 == o0Var) {
                return null;
            }
            return e5;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public kotlinx.coroutines.selects.e<E, b0<E>> o() {
        return new e(this);
    }

    @Override // kotlinx.coroutines.channels.b0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        return h.a.c(this, e5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.h
    @NotNull
    public ReceiveChannel<E> q() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.R(((a) obj).f70003a);
                return dVar;
            } else if (obj instanceof c) {
                cVar = (c) obj;
                Object obj2 = cVar.f70004a;
                if (obj2 != f70001g) {
                    dVar.C(obj2);
                }
            } else {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid state ", obj).toString());
            }
        } while (!f69997c.compareAndSet(this, obj, new c(cVar.f70004a, e(cVar.f70005b, dVar))));
        return dVar;
    }

    @Override // kotlinx.coroutines.channels.b0
    public void w(@NotNull Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69999e;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == kotlinx.coroutines.channels.a.f69946h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Another handler was already registered: ", obj));
        }
        Object obj2 = this._state;
        if ((obj2 instanceof a) && atomicReferenceFieldUpdater.compareAndSet(this, function1, kotlinx.coroutines.channels.a.f69946h)) {
            function1.invoke(((a) obj2).f70003a);
        }
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public Object x(E e5) {
        a k4 = k(e5);
        if (k4 == null) {
            return n.f69990b.c(Unit.INSTANCE);
        }
        return n.f69990b.a(k4.a());
    }

    public q(E e5) {
        this();
        f69997c.lazySet(this, new c(e5, null));
    }
}
