package kotlinx.coroutines.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: TestCoroutineContext.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @ReplaceWith(expression = "TestCoroutineScope", imports = {"kotlin.coroutines.test"}))
/* loaded from: classes.dex */
public final class a implements CoroutineContext {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final String f71425b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final List<Throwable> f71426c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final C0783a f71427d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final l0 f71428e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final w0<c> f71429f;

    /* renamed from: g  reason: collision with root package name */
    private long f71430g;

    /* renamed from: h  reason: collision with root package name */
    private long f71431h;

    /* compiled from: TestCoroutineContext.kt */
    /* renamed from: kotlinx.coroutines.test.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private final class C0783a extends k1 implements y0 {

        /* compiled from: TestCoroutineContext.kt */
        /* renamed from: kotlinx.coroutines.test.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C0784a implements g1 {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f71433b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f71434c;

            C0784a(a aVar, c cVar) {
                this.f71433b = aVar;
                this.f71434c = cVar;
            }

            @Override // kotlinx.coroutines.g1
            public void dispose() {
                this.f71433b.f71429f.j(this.f71434c);
            }
        }

        /* compiled from: Runnable.kt */
        /* renamed from: kotlinx.coroutines.test.a$a$b */
        /* loaded from: classes7.dex */
        public static final class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f71435b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C0783a f71436c;

            public b(p pVar, C0783a c0783a) {
                this.f71435b = pVar;
                this.f71436c = c0783a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f71435b.O(this.f71436c, Unit.INSTANCE);
            }
        }

        public C0783a() {
            k1.e0(this, false, 1, null);
        }

        @Override // kotlinx.coroutines.y0
        @NotNull
        public g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return new C0784a(a.this, a.this.P(runnable, j4));
        }

        @Override // kotlinx.coroutines.y0
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public Object S(long j4, @NotNull Continuation<? super Unit> continuation) {
            return y0.a.a(this, j4, continuation);
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
            a.this.L(runnable);
        }

        @Override // kotlinx.coroutines.k1
        public long j0() {
            return a.this.Q();
        }

        @Override // kotlinx.coroutines.y0
        public void k(long j4, @NotNull p<? super Unit> pVar) {
            a.this.P(new b(pVar, this), j4);
        }

        @Override // kotlinx.coroutines.k1
        public boolean l0() {
            return true;
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        @NotNull
        public String toString() {
            return "Dispatcher(" + a.this + ')';
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractCoroutineContextElement implements l0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f71437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.b bVar, a aVar) {
            super(bVar);
            this.f71437b = aVar;
        }

        @Override // kotlinx.coroutines.l0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
            this.f71437b.f71426c.add(th);
        }
    }

    public a() {
        this(null, 1, null);
    }

    public a(@Nullable String str) {
        this.f71425b = str;
        this.f71426c = new ArrayList();
        this.f71427d = new C0783a();
        this.f71428e = new b(l0.f71199f1, this);
        this.f71429f = new w0<>();
    }

    public static /* synthetic */ void F(a aVar, String str, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        aVar.A(str, function1);
    }

    public static /* synthetic */ void H(a aVar, String str, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        aVar.G(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Runnable runnable) {
        w0<c> w0Var = this.f71429f;
        long j4 = this.f71430g;
        this.f71430g = 1 + j4;
        w0Var.b(new c(runnable, j4, 0L, 4, null));
    }

    public static /* synthetic */ long O(a aVar, TimeUnit timeUnit, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return aVar.N(timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c P(Runnable runnable, long j4) {
        long j5 = this.f71430g;
        this.f71430g = 1 + j5;
        c cVar = new c(runnable, j5, this.f71431h + TimeUnit.MILLISECONDS.toNanos(j4));
        this.f71429f.b(cVar);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Q() {
        c h4 = this.f71429f.h();
        if (h4 != null) {
            S(h4.f71440d);
        }
        return this.f71429f.g() ? Long.MAX_VALUE : 0L;
    }

    private final void S(long j4) {
        c cVar;
        while (true) {
            w0<c> w0Var = this.f71429f;
            synchronized (w0Var) {
                c e5 = w0Var.e();
                if (e5 != null) {
                    cVar = (e5.f71440d > j4 ? 1 : (e5.f71440d == j4 ? 0 : -1)) <= 0 ? w0Var.k(0) : null;
                }
            }
            c cVar2 = cVar;
            if (cVar2 == null) {
                return;
            }
            long j5 = cVar2.f71440d;
            if (j5 != 0) {
                this.f71431h = j5;
            }
            cVar2.run();
        }
    }

    public static /* synthetic */ long n(a aVar, long j4, TimeUnit timeUnit, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return aVar.m(j4, timeUnit);
    }

    public static /* synthetic */ void q(a aVar, long j4, TimeUnit timeUnit, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        aVar.o(j4, timeUnit);
    }

    public static /* synthetic */ void u(a aVar, String str, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        aVar.s(str, function1);
    }

    public static /* synthetic */ void x(a aVar, String str, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        aVar.w(str, function1);
    }

    public final void A(@NotNull String str, @NotNull Function1<? super List<? extends Throwable>, Boolean> function1) {
        if (function1.invoke(this.f71426c).booleanValue()) {
            this.f71426c.clear();
            return;
        }
        throw new AssertionError(str);
    }

    public final void G(@NotNull String str, @NotNull Function1<? super Throwable, Boolean> function1) {
        if (this.f71426c.size() == 1 && function1.invoke(this.f71426c.get(0)).booleanValue()) {
            this.f71426c.clear();
            return;
        }
        throw new AssertionError(str);
    }

    public final void I() {
        if (this.f71429f.g()) {
            return;
        }
        this.f71429f.d();
    }

    @NotNull
    public final List<Throwable> M() {
        return this.f71426c;
    }

    public final long N(@NotNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f71431h, TimeUnit.NANOSECONDS);
    }

    public final void R() {
        S(this.f71431h);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke((R) function2.invoke(r4, this.f71427d), this.f71428e);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        if (key == ContinuationInterceptor.Key) {
            return this.f71427d;
        }
        if (key == l0.f71199f1) {
            return this.f71428e;
        }
        return null;
    }

    public final long m(long j4, @NotNull TimeUnit timeUnit) {
        long j5 = this.f71431h;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        o(timeUnit.toNanos(j4) + j5, timeUnit2);
        return timeUnit.convert(this.f71431h - j5, timeUnit2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return key == ContinuationInterceptor.Key ? this.f71428e : key == l0.f71199f1 ? this.f71427d : this;
    }

    public final void o(long j4, @NotNull TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        S(nanos);
        if (nanos > this.f71431h) {
            this.f71431h = nanos;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(@NotNull String str, @NotNull Function1<? super Throwable, Boolean> function1) {
        List<Throwable> list = this.f71426c;
        boolean z4 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!function1.invoke(it2.next()).booleanValue()) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4) {
            this.f71426c.clear();
            return;
        }
        throw new AssertionError(str);
    }

    @NotNull
    public String toString() {
        String str = this.f71425b;
        return str == null ? Intrinsics.stringPlus("TestCoroutineContext@", t0.b(this)) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(@NotNull String str, @NotNull Function1<? super Throwable, Boolean> function1) {
        List<Throwable> list = this.f71426c;
        boolean z4 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (function1.invoke(it2.next()).booleanValue()) {
                    z4 = true;
                    break;
                }
            }
        }
        if (z4) {
            this.f71426c.clear();
            return;
        }
        throw new AssertionError(str);
    }

    public /* synthetic */ a(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str);
    }
}
