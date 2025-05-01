package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Task.java */
/* loaded from: classes2.dex */
public class h<TResult> {

    /* renamed from: l  reason: collision with root package name */
    private static volatile q f279l;

    /* renamed from: b  reason: collision with root package name */
    private boolean f285b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f286c;

    /* renamed from: d  reason: collision with root package name */
    private TResult f287d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f288e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f289f;

    /* renamed from: g  reason: collision with root package name */
    private bolts.j f290g;

    /* renamed from: i  reason: collision with root package name */
    public static final ExecutorService f276i = bolts.b.a();

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f277j = bolts.b.b();

    /* renamed from: k  reason: collision with root package name */
    public static final Executor f278k = bolts.a.d();

    /* renamed from: m  reason: collision with root package name */
    private static h<?> f280m = new h<>((Object) null);

    /* renamed from: n  reason: collision with root package name */
    private static h<Boolean> f281n = new h<>(Boolean.TRUE);

    /* renamed from: o  reason: collision with root package name */
    private static h<Boolean> f282o = new h<>(Boolean.FALSE);

    /* renamed from: p  reason: collision with root package name */
    private static h<?> f283p = new h<>(true);

    /* renamed from: a  reason: collision with root package name */
    private final Object f284a = new Object();

    /* renamed from: h  reason: collision with root package name */
    private List<bolts.g<TResult, Void>> f291h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public class a implements bolts.g<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bolts.i f292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.g f293b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f294c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ bolts.c f295d;

        a(bolts.i iVar, bolts.g gVar, Executor executor, bolts.c cVar) {
            this.f292a = iVar;
            this.f293b = gVar;
            this.f294c = executor;
            this.f295d = cVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(h<TResult> hVar) {
            h.h(this.f292a, this.f293b, hVar, this.f294c, this.f295d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public class b implements bolts.g<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bolts.i f297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.g f298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f299c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ bolts.c f300d;

        b(bolts.i iVar, bolts.g gVar, Executor executor, bolts.c cVar) {
            this.f297a = iVar;
            this.f298b = gVar;
            this.f299c = executor;
            this.f300d = cVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(h<TResult> hVar) {
            h.g(this.f297a, this.f298b, hVar, this.f299c, this.f300d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public class c<TContinuationResult> implements bolts.g<TResult, h<TContinuationResult>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bolts.c f302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.g f303b;

        c(bolts.c cVar, bolts.g gVar) {
            this.f302a = cVar;
            this.f303b = gVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public h<TContinuationResult> a(h<TResult> hVar) {
            bolts.c cVar = this.f302a;
            if (cVar != null && cVar.a()) {
                return h.e();
            }
            if (hVar.F()) {
                return h.y(hVar.A());
            }
            if (hVar.D()) {
                return h.e();
            }
            return hVar.m(this.f303b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public class d<TContinuationResult> implements bolts.g<TResult, h<TContinuationResult>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bolts.c f305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.g f306b;

        d(bolts.c cVar, bolts.g gVar) {
            this.f305a = cVar;
            this.f306b = gVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public h<TContinuationResult> a(h<TResult> hVar) {
            bolts.c cVar = this.f305a;
            if (cVar != null && cVar.a()) {
                return h.e();
            }
            if (hVar.F()) {
                return h.y(hVar.A());
            }
            if (hVar.D()) {
                return h.e();
            }
            return hVar.q(this.f306b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public static class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.c f308b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bolts.i f309c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ bolts.g f310d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f311e;

        e(bolts.c cVar, bolts.i iVar, bolts.g gVar, h hVar) {
            this.f308b = cVar;
            this.f309c = iVar;
            this.f310d = gVar;
            this.f311e = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f308b;
            if (cVar != null && cVar.a()) {
                this.f309c.b();
                return;
            }
            try {
                this.f309c.setResult(this.f310d.a(this.f311e));
            } catch (CancellationException unused) {
                this.f309c.b();
            } catch (Exception e5) {
                this.f309c.c(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public static class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.c f312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bolts.i f313c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ bolts.g f314d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f315e;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* compiled from: Task.java */
        /* loaded from: classes2.dex */
        class a<TContinuationResult> implements bolts.g<TContinuationResult, Void> {
            a() {
            }

            @Override // bolts.g
            /* renamed from: b */
            public Void a(h<TContinuationResult> hVar) {
                bolts.c cVar = f.this.f312b;
                if (cVar != null && cVar.a()) {
                    f.this.f313c.b();
                    return null;
                }
                if (hVar.D()) {
                    f.this.f313c.b();
                } else if (hVar.F()) {
                    f.this.f313c.c(hVar.A());
                } else {
                    f.this.f313c.setResult(hVar.B());
                }
                return null;
            }
        }

        f(bolts.c cVar, bolts.i iVar, bolts.g gVar, h hVar) {
            this.f312b = cVar;
            this.f313c = iVar;
            this.f314d = gVar;
            this.f315e = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f312b;
            if (cVar != null && cVar.a()) {
                this.f313c.b();
                return;
            }
            try {
                h hVar = (h) this.f314d.a(this.f315e);
                if (hVar == null) {
                    this.f313c.setResult(null);
                } else {
                    hVar.m(new a());
                }
            } catch (CancellationException unused) {
                this.f313c.b();
            } catch (Exception e5) {
                this.f313c.c(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public static class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.i f317b;

        g(bolts.i iVar) {
            this.f317b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f317b.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* renamed from: bolts.h$h  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0013h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bolts.i f319c;

        RunnableC0013h(ScheduledFuture scheduledFuture, bolts.i iVar) {
            this.f318b = scheduledFuture;
            this.f319c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f318b.cancel(true);
            this.f319c.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public class i implements bolts.g<TResult, h<Void>> {
        i() {
        }

        @Override // bolts.g
        /* renamed from: b */
        public h<Void> a(h<TResult> hVar) throws Exception {
            if (hVar.D()) {
                return h.e();
            }
            if (hVar.F()) {
                return h.y(hVar.A());
            }
            return h.z(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public static class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.c f321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bolts.i f322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callable f323d;

        j(bolts.c cVar, bolts.i iVar, Callable callable) {
            this.f321b = cVar;
            this.f322c = iVar;
            this.f323d = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f321b;
            if (cVar != null && cVar.a()) {
                this.f322c.b();
                return;
            }
            try {
                this.f322c.setResult(this.f323d.call());
            } catch (CancellationException unused) {
                this.f322c.b();
            } catch (Exception e5) {
                this.f322c.c(e5);
            }
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    static class k implements bolts.g<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.i f325b;

        k(AtomicBoolean atomicBoolean, bolts.i iVar) {
            this.f324a = atomicBoolean;
            this.f325b = iVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(h<TResult> hVar) {
            if (this.f324a.compareAndSet(false, true)) {
                this.f325b.setResult(hVar);
                return null;
            }
            hVar.A();
            return null;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    static class l implements bolts.g<Object, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bolts.i f327b;

        l(AtomicBoolean atomicBoolean, bolts.i iVar) {
            this.f326a = atomicBoolean;
            this.f327b = iVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(h<Object> hVar) {
            if (this.f326a.compareAndSet(false, true)) {
                this.f327b.setResult(hVar);
                return null;
            }
            hVar.A();
            return null;
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    static class m implements bolts.g<Void, List<TResult>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f328a;

        m(Collection collection) {
            this.f328a = collection;
        }

        @Override // bolts.g
        /* renamed from: b */
        public List<TResult> a(h<Void> hVar) throws Exception {
            if (this.f328a.size() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (h hVar2 : this.f328a) {
                arrayList.add(hVar2.B());
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public static class n implements bolts.g<Object, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AtomicInteger f332d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ bolts.i f333e;

        n(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, bolts.i iVar) {
            this.f329a = obj;
            this.f330b = arrayList;
            this.f331c = atomicBoolean;
            this.f332d = atomicInteger;
            this.f333e = iVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(h<Object> hVar) {
            if (hVar.F()) {
                synchronized (this.f329a) {
                    this.f330b.add(hVar.A());
                }
            }
            if (hVar.D()) {
                this.f331c.set(true);
            }
            if (this.f332d.decrementAndGet() == 0) {
                if (this.f330b.size() != 0) {
                    if (this.f330b.size() == 1) {
                        this.f333e.c((Exception) this.f330b.get(0));
                    } else {
                        this.f333e.c(new AggregateException(String.format("There were %d exceptions.", Integer.valueOf(this.f330b.size())), this.f330b));
                    }
                } else if (this.f331c.get()) {
                    this.f333e.b();
                } else {
                    this.f333e.setResult(null);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public class o implements bolts.g<Void, h<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bolts.c f334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bolts.g f336c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Executor f337d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ bolts.f f338e;

        o(bolts.c cVar, Callable callable, bolts.g gVar, Executor executor, bolts.f fVar) {
            this.f334a = cVar;
            this.f335b = callable;
            this.f336c = gVar;
            this.f337d = executor;
            this.f338e = fVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public h<Void> a(h<Void> hVar) throws Exception {
            bolts.c cVar = this.f334a;
            if (cVar != null && cVar.a()) {
                return h.e();
            }
            if (((Boolean) this.f335b.call()).booleanValue()) {
                return h.z(null).N(this.f336c, this.f337d).N((bolts.g) this.f338e.a(), this.f337d);
            }
            return h.z(null);
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public class p extends bolts.i<TResult> {
        p() {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes2.dex */
    public interface q {
        void a(h<?> hVar, UnobservedTaskException unobservedTaskException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
    }

    public static q C() {
        return f279l;
    }

    private void P() {
        synchronized (this.f284a) {
            for (bolts.g<TResult, Void> gVar : this.f291h) {
                try {
                    gVar.a(this);
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception e6) {
                    throw new RuntimeException(e6);
                }
            }
            this.f291h = null;
        }
    }

    public static void Q(q qVar) {
        f279l = qVar;
    }

    public static h<Void> W(Collection<? extends h<?>> collection) {
        if (collection.size() == 0) {
            return z(null);
        }
        bolts.i iVar = new bolts.i();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (h<?> hVar : collection) {
            hVar.m(new n(obj, arrayList, atomicBoolean, atomicInteger, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<List<TResult>> X(Collection<? extends h<TResult>> collection) {
        return (h<List<TResult>>) W(collection).H(new m(collection));
    }

    public static h<h<?>> Y(Collection<? extends h<?>> collection) {
        if (collection.size() == 0) {
            return z(null);
        }
        bolts.i iVar = new bolts.i();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (h<?> hVar : collection) {
            hVar.m(new l(atomicBoolean, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<h<TResult>> Z(Collection<? extends h<TResult>> collection) {
        if (collection.size() == 0) {
            return z(null);
        }
        bolts.i iVar = new bolts.i();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (h<TResult> hVar : collection) {
            hVar.m(new k(atomicBoolean, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> c(Callable<TResult> callable) {
        return call(callable, f276i, null);
    }

    public static <TResult> h<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    public static <TResult> h<TResult> d(Callable<TResult> callable, bolts.c cVar) {
        return call(callable, f276i, cVar);
    }

    public static <TResult> h<TResult> e() {
        return (h<TResult>) f283p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void g(bolts.i<TContinuationResult> iVar, bolts.g<TResult, h<TContinuationResult>> gVar, h<TResult> hVar, Executor executor, bolts.c cVar) {
        try {
            executor.execute(new f(cVar, iVar, gVar, hVar));
        } catch (Exception e5) {
            iVar.c(new ExecutorException(e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void h(bolts.i<TContinuationResult> iVar, bolts.g<TResult, TContinuationResult> gVar, h<TResult> hVar, Executor executor, bolts.c cVar) {
        try {
            executor.execute(new e(cVar, iVar, gVar, hVar));
        } catch (Exception e5) {
            iVar.c(new ExecutorException(e5));
        }
    }

    public static <TResult> h<TResult>.p u() {
        return new p();
    }

    public static h<Void> v(long j4) {
        return x(j4, bolts.b.d(), null);
    }

    public static h<Void> w(long j4, bolts.c cVar) {
        return x(j4, bolts.b.d(), cVar);
    }

    static h<Void> x(long j4, ScheduledExecutorService scheduledExecutorService, bolts.c cVar) {
        if (cVar == null || !cVar.a()) {
            if (j4 <= 0) {
                return z(null);
            }
            bolts.i iVar = new bolts.i();
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new g(iVar), j4, TimeUnit.MILLISECONDS);
            if (cVar != null) {
                cVar.b(new RunnableC0013h(schedule, iVar));
            }
            return iVar.a();
        }
        return e();
    }

    public static <TResult> h<TResult> y(Exception exc) {
        bolts.i iVar = new bolts.i();
        iVar.c(exc);
        return iVar.a();
    }

    public static <TResult> h<TResult> z(TResult tresult) {
        if (tresult == null) {
            return (h<TResult>) f280m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (h<TResult>) f281n : (h<TResult>) f282o;
        }
        bolts.i iVar = new bolts.i();
        iVar.setResult(tresult);
        return iVar.a();
    }

    public Exception A() {
        Exception exc;
        synchronized (this.f284a) {
            if (this.f288e != null) {
                this.f289f = true;
                bolts.j jVar = this.f290g;
                if (jVar != null) {
                    jVar.a();
                    this.f290g = null;
                }
            }
            exc = this.f288e;
        }
        return exc;
    }

    public TResult B() {
        TResult tresult;
        synchronized (this.f284a) {
            tresult = this.f287d;
        }
        return tresult;
    }

    public boolean D() {
        boolean z4;
        synchronized (this.f284a) {
            z4 = this.f286c;
        }
        return z4;
    }

    public boolean E() {
        boolean z4;
        synchronized (this.f284a) {
            z4 = this.f285b;
        }
        return z4;
    }

    public boolean F() {
        boolean z4;
        synchronized (this.f284a) {
            z4 = A() != null;
        }
        return z4;
    }

    public h<Void> G() {
        return q(new i());
    }

    public <TContinuationResult> h<TContinuationResult> H(bolts.g<TResult, TContinuationResult> gVar) {
        return K(gVar, f277j, null);
    }

    public <TContinuationResult> h<TContinuationResult> I(bolts.g<TResult, TContinuationResult> gVar, bolts.c cVar) {
        return K(gVar, f277j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> J(bolts.g<TResult, TContinuationResult> gVar, Executor executor) {
        return K(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> K(bolts.g<TResult, TContinuationResult> gVar, Executor executor, bolts.c cVar) {
        return s(new c(cVar, gVar), executor);
    }

    public <TContinuationResult> h<TContinuationResult> L(bolts.g<TResult, h<TContinuationResult>> gVar) {
        return N(gVar, f277j);
    }

    public <TContinuationResult> h<TContinuationResult> M(bolts.g<TResult, h<TContinuationResult>> gVar, bolts.c cVar) {
        return O(gVar, f277j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> N(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor) {
        return O(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> O(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor, bolts.c cVar) {
        return s(new d(cVar, gVar), executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R() {
        synchronized (this.f284a) {
            if (this.f285b) {
                return false;
            }
            this.f285b = true;
            this.f286c = true;
            this.f284a.notifyAll();
            P();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean S(Exception exc) {
        synchronized (this.f284a) {
            if (this.f285b) {
                return false;
            }
            this.f285b = true;
            this.f288e = exc;
            this.f289f = false;
            this.f284a.notifyAll();
            P();
            if (!this.f289f && C() != null) {
                this.f290g = new bolts.j(this);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean T(TResult tresult) {
        synchronized (this.f284a) {
            if (this.f285b) {
                return false;
            }
            this.f285b = true;
            this.f287d = tresult;
            this.f284a.notifyAll();
            P();
            return true;
        }
    }

    public void U() throws InterruptedException {
        synchronized (this.f284a) {
            if (!E()) {
                this.f284a.wait();
            }
        }
    }

    public boolean V(long j4, TimeUnit timeUnit) throws InterruptedException {
        boolean E;
        synchronized (this.f284a) {
            if (!E()) {
                this.f284a.wait(timeUnit.toMillis(j4));
            }
            E = E();
        }
        return E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> h<TOut> f() {
        return this;
    }

    public h<Void> i(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar) {
        return l(callable, gVar, f277j, null);
    }

    public h<Void> j(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, bolts.c cVar) {
        return l(callable, gVar, f277j, cVar);
    }

    public h<Void> k(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, Executor executor) {
        return l(callable, gVar, executor, null);
    }

    public h<Void> l(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, Executor executor, bolts.c cVar) {
        bolts.f fVar = new bolts.f();
        fVar.b(new o(cVar, callable, gVar, executor, fVar));
        return G().s((bolts.g) fVar.a(), executor);
    }

    public <TContinuationResult> h<TContinuationResult> m(bolts.g<TResult, TContinuationResult> gVar) {
        return p(gVar, f277j, null);
    }

    public <TContinuationResult> h<TContinuationResult> n(bolts.g<TResult, TContinuationResult> gVar, bolts.c cVar) {
        return p(gVar, f277j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> o(bolts.g<TResult, TContinuationResult> gVar, Executor executor) {
        return p(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> p(bolts.g<TResult, TContinuationResult> gVar, Executor executor, bolts.c cVar) {
        boolean E;
        bolts.i iVar = new bolts.i();
        synchronized (this.f284a) {
            E = E();
            if (!E) {
                this.f291h.add(new a(iVar, gVar, executor, cVar));
            }
        }
        if (E) {
            h(iVar, gVar, this, executor, cVar);
        }
        return iVar.a();
    }

    public <TContinuationResult> h<TContinuationResult> q(bolts.g<TResult, h<TContinuationResult>> gVar) {
        return t(gVar, f277j, null);
    }

    public <TContinuationResult> h<TContinuationResult> r(bolts.g<TResult, h<TContinuationResult>> gVar, bolts.c cVar) {
        return t(gVar, f277j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> s(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor) {
        return t(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> t(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor, bolts.c cVar) {
        boolean E;
        bolts.i iVar = new bolts.i();
        synchronized (this.f284a) {
            E = E();
            if (!E) {
                this.f291h.add(new b(iVar, gVar, executor, cVar));
            }
        }
        if (E) {
            g(iVar, gVar, this, executor, cVar);
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> call(Callable<TResult> callable, Executor executor, bolts.c cVar) {
        bolts.i iVar = new bolts.i();
        try {
            executor.execute(new j(cVar, iVar, callable));
        } catch (Exception e5) {
            iVar.c(new ExecutorException(e5));
        }
        return iVar.a();
    }

    private h(TResult tresult) {
        T(tresult);
    }

    public static <TResult> h<TResult> call(Callable<TResult> callable) {
        return call(callable, f277j, null);
    }

    public static <TResult> h<TResult> call(Callable<TResult> callable, bolts.c cVar) {
        return call(callable, f277j, cVar);
    }

    private h(boolean z4) {
        if (z4) {
            R();
        } else {
            T(null);
        }
    }
}
