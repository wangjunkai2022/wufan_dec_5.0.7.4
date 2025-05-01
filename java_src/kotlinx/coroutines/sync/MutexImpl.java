package kotlinx.coroutines.sync;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.selects.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Mutex.kt */
/* loaded from: classes7.dex */
public final class MutexImpl implements kotlinx.coroutines.sync.c, kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f71368b = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    @NotNull
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* loaded from: classes7.dex */
    public final class LockCont extends a {
        @NotNull

        /* renamed from: h  reason: collision with root package name */
        private final p<Unit> f71369h;

        /* JADX WARN: Multi-variable type inference failed */
        public LockCont(@Nullable Object obj, @NotNull p<? super Unit> pVar) {
            super(obj);
            this.f71369h = pVar;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public void e0() {
            this.f71369h.Y(r.f71241d);
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public boolean g0() {
            if (f0()) {
                p<Unit> pVar = this.f71369h;
                Unit unit = Unit.INSTANCE;
                final MutexImpl mutexImpl = MutexImpl.this;
                return pVar.N(unit, null, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        MutexImpl.this.d(this.f71379e);
                    }
                }) != null;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "LockCont[" + this.f71379e + ", " + this.f71369h + "] for " + MutexImpl.this;
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes7.dex */
    private final class LockSelect<R> extends a {
        @JvmField
        @NotNull

        /* renamed from: h  reason: collision with root package name */
        public final f<R> f71373h;
        @JvmField
        @NotNull

        /* renamed from: i  reason: collision with root package name */
        public final Function2<kotlinx.coroutines.sync.c, Continuation<? super R>, Object> f71374i;

        /* JADX WARN: Multi-variable type inference failed */
        public LockSelect(@Nullable Object obj, @NotNull f<? super R> fVar, @NotNull Function2<? super kotlinx.coroutines.sync.c, ? super Continuation<? super R>, ? extends Object> function2) {
            super(obj);
            this.f71373h = fVar;
            this.f71374i = function2;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public void e0() {
            Function2<kotlinx.coroutines.sync.c, Continuation<? super R>, Object> function2 = this.f71374i;
            MutexImpl mutexImpl = MutexImpl.this;
            Continuation<R> r4 = this.f71373h.r();
            final MutexImpl mutexImpl2 = MutexImpl.this;
            s3.a.e(function2, mutexImpl, r4, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    MutexImpl.this.d(this.f71379e);
                }
            });
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public boolean g0() {
            return f0() && this.f71373h.q();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "LockSelect[" + this.f71379e + ", " + this.f71373h + "] for " + MutexImpl.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* loaded from: classes7.dex */
    public abstract class a extends LockFreeLinkedListNode implements g1 {

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f71378g = AtomicIntegerFieldUpdater.newUpdater(a.class, "isTaken");
        @JvmField
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public final Object f71379e;
        @NotNull
        private volatile /* synthetic */ int isTaken = 0;

        public a(@Nullable Object obj) {
            this.f71379e = obj;
        }

        @Override // kotlinx.coroutines.g1
        public final void dispose() {
            W();
        }

        public abstract void e0();

        public final boolean f0() {
            return f71378g.compareAndSet(this, 0, 1);
        }

        public abstract boolean g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* loaded from: classes7.dex */
    public static final class b extends v {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public Object f71381e;

        public b(@NotNull Object obj) {
            this.f71381e = obj;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "LockedQueue[" + this.f71381e + ']';
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes7.dex */
    private static final class c extends kotlinx.coroutines.internal.b {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final MutexImpl f71382b;
        @JvmField
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final Object f71383c;

        /* compiled from: Mutex.kt */
        /* loaded from: classes7.dex */
        private final class a extends g0 {
            @NotNull

            /* renamed from: a  reason: collision with root package name */
            private final kotlinx.coroutines.internal.d<?> f71384a;

            public a(@NotNull kotlinx.coroutines.internal.d<?> dVar) {
                this.f71384a = dVar;
            }

            @Override // kotlinx.coroutines.internal.g0
            @NotNull
            public kotlinx.coroutines.internal.d<?> a() {
                return this.f71384a;
            }

            @Override // kotlinx.coroutines.internal.g0
            @Nullable
            public Object c(@Nullable Object obj) {
                Object a5 = a().h() ? MutexKt.f71394f : a();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                MutexImpl.f71368b.compareAndSet((MutexImpl) obj, this, a5);
                return null;
            }
        }

        public c(@NotNull MutexImpl mutexImpl, @Nullable Object obj) {
            this.f71382b = mutexImpl;
            this.f71383c = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        public void a(@NotNull kotlinx.coroutines.internal.d<?> dVar, @Nullable Object obj) {
            kotlinx.coroutines.sync.b bVar;
            if (obj != null) {
                bVar = MutexKt.f71394f;
            } else {
                Object obj2 = this.f71383c;
                bVar = obj2 == null ? MutexKt.f71393e : new kotlinx.coroutines.sync.b(obj2);
            }
            MutexImpl.f71368b.compareAndSet(this.f71382b, dVar, bVar);
        }

        @Override // kotlinx.coroutines.internal.b
        @Nullable
        public Object c(@NotNull kotlinx.coroutines.internal.d<?> dVar) {
            kotlinx.coroutines.sync.b bVar;
            o0 o0Var;
            a aVar = new a(dVar);
            MutexImpl mutexImpl = this.f71382b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f71368b;
            bVar = MutexKt.f71394f;
            if (!atomicReferenceFieldUpdater.compareAndSet(mutexImpl, bVar, aVar)) {
                o0Var = MutexKt.f71389a;
                return o0Var;
            }
            return aVar.c(this.f71382b);
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes7.dex */
    private static final class d extends kotlinx.coroutines.internal.d<MutexImpl> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final b f71386b;

        public d(@NotNull b bVar) {
            this.f71386b = bVar;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j */
        public void d(@NotNull MutexImpl mutexImpl, @Nullable Object obj) {
            MutexImpl.f71368b.compareAndSet(mutexImpl, this, obj == null ? MutexKt.f71394f : this.f71386b);
        }

        @Override // kotlinx.coroutines.internal.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull MutexImpl mutexImpl) {
            o0 o0Var;
            if (this.f71386b.f0()) {
                return null;
            }
            o0Var = MutexKt.f71390b;
            return o0Var;
        }
    }

    public MutexImpl(boolean z4) {
        this._state = z4 ? MutexKt.f71393e : MutexKt.f71394f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        kotlinx.coroutines.s.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(final java.lang.Object r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            kotlinx.coroutines.q r0 = kotlinx.coroutines.s.b(r0)
            kotlinx.coroutines.sync.MutexImpl$LockCont r1 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.b
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.b r3 = (kotlinx.coroutines.sync.b) r3
            java.lang.Object r4 = r3.f71420a
            kotlinx.coroutines.internal.o0 r5 = kotlinx.coroutines.sync.MutexKt.g()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.f71368b
            kotlinx.coroutines.sync.MutexImpl$b r5 = new kotlinx.coroutines.sync.MutexImpl$b
            java.lang.Object r3 = r3.f71420a
            r5.<init>(r3)
            r4.compareAndSet(r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.b r3 = kotlinx.coroutines.sync.MutexKt.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.b r3 = new kotlinx.coroutines.sync.b
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.f71368b
            boolean r2 = r4.compareAndSet(r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1 r2 = new kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
            r2.<init>()
            r0.s(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.MutexImpl.b
            if (r3 == 0) goto L98
            r3 = r2
            kotlinx.coroutines.sync.MutexImpl$b r3 = (kotlinx.coroutines.sync.MutexImpl.b) r3
            java.lang.Object r4 = r3.f71381e
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.A(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.f0()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.MutexImpl$LockCont r1 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.s.c(r0, r1)
        L71:
            java.lang.Object r7 = r0.y()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r0) goto L7e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L7e:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto L85
            return r7
        L85:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L88:
            java.lang.String r8 = "Already locked by "
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r7)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L98:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.g0
            if (r3 == 0) goto La3
            kotlinx.coroutines.internal.g0 r2 = (kotlinx.coroutines.internal.g0) r2
            r2.c(r6)
            goto Ld
        La3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Illegal state "
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            goto Lb4
        Lb3:
            throw r7
        Lb4:
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.i(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.e
    public <R> void A(@NotNull f<? super R> fVar, @Nullable Object obj, @NotNull Function2<? super kotlinx.coroutines.sync.c, ? super Continuation<? super R>, ? extends Object> function2) {
        o0 o0Var;
        o0 o0Var2;
        while (!fVar.h()) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj2;
                Object obj3 = bVar.f71420a;
                o0Var = MutexKt.f71392d;
                if (obj3 != o0Var) {
                    f71368b.compareAndSet(this, obj2, new b(bVar.f71420a));
                } else {
                    Object u4 = fVar.u(new c(this, obj));
                    if (u4 == null) {
                        s3.b.d(function2, this, fVar.r());
                        return;
                    } else if (u4 == g.d()) {
                        return;
                    } else {
                        o0Var2 = MutexKt.f71389a;
                        if (u4 != o0Var2 && u4 != kotlinx.coroutines.internal.c.f71101b) {
                            throw new IllegalStateException(Intrinsics.stringPlus("performAtomicTrySelect(TryLockDesc) returned ", u4).toString());
                        }
                    }
                }
            } else if (obj2 instanceof b) {
                b bVar2 = (b) obj2;
                if (bVar2.f71381e != obj) {
                    LockSelect lockSelect = new LockSelect(obj, fVar, function2);
                    bVar2.A(lockSelect);
                    if (this._state == obj2 || !lockSelect.f0()) {
                        fVar.l(lockSelect);
                        return;
                    }
                } else {
                    throw new IllegalStateException(Intrinsics.stringPlus("Already locked by ", obj).toString());
                }
            } else if (!(obj2 instanceof g0)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj2).toString());
            } else {
                ((g0) obj2).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean a(@Nullable Object obj) {
        o0 o0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                Object obj3 = ((kotlinx.coroutines.sync.b) obj2).f71420a;
                o0Var = MutexKt.f71392d;
                if (obj3 != o0Var) {
                    return false;
                }
                if (f71368b.compareAndSet(this, obj2, obj == null ? MutexKt.f71393e : new kotlinx.coroutines.sync.b(obj))) {
                    return true;
                }
            } else if (obj2 instanceof b) {
                if (((b) obj2).f71381e != obj) {
                    return false;
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Already locked by ", obj).toString());
            } else if (!(obj2 instanceof g0)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj2).toString());
            } else {
                ((g0) obj2).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean b() {
        o0 o0Var;
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                Object obj2 = ((kotlinx.coroutines.sync.b) obj).f71420a;
                o0Var = MutexKt.f71392d;
                return obj2 != o0Var;
            } else if (obj instanceof b) {
                return true;
            } else {
                if (!(obj instanceof g0)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj).toString());
                }
                ((g0) obj).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    @Nullable
    public Object c(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (a(obj)) {
            return Unit.INSTANCE;
        }
        Object i4 = i(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return i4 == coroutine_suspended ? i4 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.c
    public void d(@Nullable Object obj) {
        kotlinx.coroutines.sync.b bVar;
        o0 o0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                if (obj == null) {
                    Object obj3 = ((kotlinx.coroutines.sync.b) obj2).f71420a;
                    o0Var = MutexKt.f71392d;
                    if (!(obj3 != o0Var)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar2 = (kotlinx.coroutines.sync.b) obj2;
                    if (!(bVar2.f71420a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar2.f71420a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71368b;
                bVar = MutexKt.f71394f;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                    return;
                }
            } else if (obj2 instanceof g0) {
                ((g0) obj2).c(this);
            } else if (obj2 instanceof b) {
                if (obj != null) {
                    b bVar3 = (b) obj2;
                    if (!(bVar3.f71381e == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar3.f71381e + " but expected " + obj).toString());
                    }
                }
                b bVar4 = (b) obj2;
                LockFreeLinkedListNode Z = bVar4.Z();
                if (Z == null) {
                    d dVar = new d(bVar4);
                    if (f71368b.compareAndSet(this, obj2, dVar) && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    a aVar = (a) Z;
                    if (aVar.g0()) {
                        Object obj4 = aVar.f71379e;
                        if (obj4 == null) {
                            obj4 = MutexKt.f71391c;
                        }
                        bVar4.f71381e = obj4;
                        aVar.e0();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj2).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean e(@NotNull Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof kotlinx.coroutines.sync.b) {
            if (((kotlinx.coroutines.sync.b) obj2).f71420a == obj) {
                return true;
            }
        } else if ((obj2 instanceof b) && ((b) obj2).f71381e == obj) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.c
    @NotNull
    public kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> f() {
        return this;
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof b) && ((b) obj).f0();
    }

    @NotNull
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return "Mutex[" + ((kotlinx.coroutines.sync.b) obj).f71420a + ']';
            } else if (!(obj instanceof g0)) {
                if (obj instanceof b) {
                    return "Mutex[" + ((b) obj).f71381e + ']';
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj).toString());
            } else {
                ((g0) obj).c(this);
            }
        }
    }
}
