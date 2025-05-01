package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.g;
import com.facebook.common.internal.h;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.a;
import com.facebook.drawee.gestures.a;
import com.facebook.infer.annotation.ReturnsOwnership;
import com.umeng.analytics.pro.f;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: AbstractDraweeController.java */
@NotThreadSafe
/* loaded from: classes.dex */
public abstract class a<T, INFO> implements o0.a, a.b, a.InterfaceC0261a {

    /* renamed from: v  reason: collision with root package name */
    private static final Class<?> f11108v = a.class;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.drawee.components.a f11110b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11111c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.drawee.components.b f11112d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.drawee.gestures.a f11113e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private d f11114f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    protected c<INFO> f11115g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private o0.c f11116h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Drawable f11117i;

    /* renamed from: j  reason: collision with root package name */
    private String f11118j;

    /* renamed from: k  reason: collision with root package name */
    private Object f11119k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11120l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11121m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11122n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11123o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11124p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private String f11125q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private com.facebook.datasource.c<T> f11126r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private T f11127s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private Drawable f11128t;

    /* renamed from: a  reason: collision with root package name */
    private final DraweeEventTracker f11109a = DraweeEventTracker.b();

    /* renamed from: u  reason: collision with root package name */
    private boolean f11129u = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractDraweeController.java */
    /* renamed from: com.facebook.drawee.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0259a extends com.facebook.datasource.b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11131b;

        C0259a(String str, boolean z4) {
            this.f11130a = str;
            this.f11131b = z4;
        }

        @Override // com.facebook.datasource.b, com.facebook.datasource.e
        public void d(com.facebook.datasource.c<T> cVar) {
            boolean c5 = cVar.c();
            a.this.F(this.f11130a, cVar, cVar.getProgress(), c5);
        }

        @Override // com.facebook.datasource.b
        public void e(com.facebook.datasource.c<T> cVar) {
            a.this.C(this.f11130a, cVar, cVar.d(), true);
        }

        @Override // com.facebook.datasource.b
        public void f(com.facebook.datasource.c<T> cVar) {
            boolean c5 = cVar.c();
            boolean f5 = cVar.f();
            float progress = cVar.getProgress();
            T g4 = cVar.g();
            if (g4 != null) {
                a.this.E(this.f11130a, cVar, g4, progress, c5, this.f11131b, f5);
            } else if (c5) {
                a.this.C(this.f11130a, cVar, new NullPointerException(), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractDraweeController.java */
    /* loaded from: classes2.dex */
    public static class b<INFO> extends e<INFO> {
        private b() {
        }

        public static <INFO> b<INFO> h(c<? super INFO> cVar, c<? super INFO> cVar2) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.a(cVar);
            bVar.a(cVar2);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return bVar;
        }
    }

    public a(com.facebook.drawee.components.a aVar, Executor executor, String str, Object obj) {
        this.f11110b = aVar;
        this.f11111c = executor;
        x(str, obj);
    }

    private void A(String str, Throwable th) {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.Y(f11108v, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f11118j, str, th);
        }
    }

    private void B(String str, T t4) {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.a0(f11108v, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f11118j, str, t(t4), Integer.valueOf(u(t4)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(String str, com.facebook.datasource.c<T> cVar, Throwable th, boolean z4) {
        Drawable drawable;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!z(str, cVar)) {
            A("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
                return;
            }
            return;
        }
        this.f11109a.c(z4 ? DraweeEventTracker.Event.ON_DATASOURCE_FAILURE : DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT);
        if (z4) {
            A("final_failed @ onFailure", th);
            this.f11126r = null;
            this.f11123o = true;
            if (this.f11124p && (drawable = this.f11128t) != null) {
                this.f11116h.d(drawable, 1.0f, true);
            } else if (P()) {
                this.f11116h.a(th);
            } else {
                this.f11116h.setFailure(th);
            }
            o().onFailure(this.f11118j, th);
        } else {
            A("intermediate_failed @ onFailure", th);
            o().onIntermediateImageFailed(this.f11118j, th);
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str, com.facebook.datasource.c<T> cVar, @Nullable T t4, float f5, boolean z4, boolean z5, boolean z6) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!z(str, cVar)) {
                B("ignore_old_datasource @ onNewResult", t4);
                I(t4);
                cVar.close();
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                    return;
                }
                return;
            }
            this.f11109a.c(z4 ? DraweeEventTracker.Event.ON_DATASOURCE_RESULT : DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable l4 = l(t4);
                T t5 = this.f11127s;
                Drawable drawable = this.f11128t;
                this.f11127s = t4;
                this.f11128t = l4;
                if (z4) {
                    B("set_final_result @ onNewResult", t4);
                    this.f11126r = null;
                    this.f11116h.d(l4, 1.0f, z5);
                    o().onFinalImageSet(str, v(t4), f());
                } else if (z6) {
                    B("set_temporary_result @ onNewResult", t4);
                    this.f11116h.d(l4, 1.0f, z5);
                    o().onFinalImageSet(str, v(t4), f());
                } else {
                    B("set_intermediate_result @ onNewResult", t4);
                    this.f11116h.d(l4, f5, z5);
                    o().onIntermediateImageSet(str, v(t4));
                }
                if (drawable != null && drawable != l4) {
                    G(drawable);
                }
                if (t5 != null && t5 != t4) {
                    B("release_previous_result @ onNewResult", t5);
                    I(t5);
                }
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            } catch (Exception e5) {
                B("drawable_failed @ onNewResult", t4);
                I(t4);
                C(str, cVar, e5, z4);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
        } catch (Throwable th) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(String str, com.facebook.datasource.c<T> cVar, float f5, boolean z4) {
        if (!z(str, cVar)) {
            A("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else if (z4) {
        } else {
            this.f11116h.b(f5, false);
        }
    }

    private void H() {
        boolean z4 = this.f11121m;
        this.f11121m = false;
        this.f11123o = false;
        com.facebook.datasource.c<T> cVar = this.f11126r;
        if (cVar != null) {
            cVar.close();
            this.f11126r = null;
        }
        Drawable drawable = this.f11128t;
        if (drawable != null) {
            G(drawable);
        }
        if (this.f11125q != null) {
            this.f11125q = null;
        }
        this.f11128t = null;
        T t4 = this.f11127s;
        if (t4 != null) {
            B("release", t4);
            I(this.f11127s);
            this.f11127s = null;
        }
        if (z4) {
            o().onRelease(this.f11118j);
        }
    }

    private boolean P() {
        com.facebook.drawee.components.b bVar;
        return this.f11123o && (bVar = this.f11112d) != null && bVar.h();
    }

    private synchronized void x(String str, Object obj) {
        com.facebook.drawee.components.a aVar;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#init");
        }
        this.f11109a.c(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
        if (!this.f11129u && (aVar = this.f11110b) != null) {
            aVar.c(this);
        }
        this.f11120l = false;
        this.f11122n = false;
        H();
        this.f11124p = false;
        com.facebook.drawee.components.b bVar = this.f11112d;
        if (bVar != null) {
            bVar.a();
        }
        com.facebook.drawee.gestures.a aVar2 = this.f11113e;
        if (aVar2 != null) {
            aVar2.a();
            this.f11113e.f(this);
        }
        c<INFO> cVar = this.f11115g;
        if (cVar instanceof b) {
            ((b) cVar).b();
        } else {
            this.f11115g = null;
        }
        this.f11114f = null;
        o0.c cVar2 = this.f11116h;
        if (cVar2 != null) {
            cVar2.reset();
            this.f11116h.e(null);
            this.f11116h = null;
        }
        this.f11117i = null;
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.X(f11108v, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f11118j, str);
        }
        this.f11118j = str;
        this.f11119k = obj;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    private boolean z(String str, com.facebook.datasource.c<T> cVar) {
        if (cVar == null && this.f11126r == null) {
            return true;
        }
        return str.equals(this.f11118j) && cVar == this.f11126r && this.f11121m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(String str, T t4) {
    }

    protected abstract void G(@Nullable Drawable drawable);

    protected abstract void I(@Nullable T t4);

    public void J(c<? super INFO> cVar) {
        h.i(cVar);
        c<INFO> cVar2 = this.f11115g;
        if (cVar2 instanceof b) {
            ((b) cVar2).g(cVar);
        } else if (cVar2 == cVar) {
            this.f11115g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(@Nullable Drawable drawable) {
        this.f11117i = drawable;
        o0.c cVar = this.f11116h;
        if (cVar != null) {
            cVar.e(drawable);
        }
    }

    public void L(@Nullable d dVar) {
        this.f11114f = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(@Nullable com.facebook.drawee.gestures.a aVar) {
        this.f11113e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N(boolean z4) {
        this.f11124p = z4;
    }

    protected boolean O() {
        return P();
    }

    protected void Q() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#submitRequest");
        }
        T m4 = m();
        if (m4 != null) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f11126r = null;
            this.f11121m = true;
            this.f11123o = false;
            this.f11109a.c(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
            o().onSubmit(this.f11118j, this.f11119k);
            D(this.f11118j, m4);
            E(this.f11118j, this.f11126r, m4, 1.0f, true, true, true);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
                return;
            }
            return;
        }
        this.f11109a.c(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
        o().onSubmit(this.f11118j, this.f11119k);
        this.f11116h.b(0.0f, true);
        this.f11121m = true;
        this.f11123o = false;
        this.f11126r = q();
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.X(f11108v, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f11118j, Integer.valueOf(System.identityHashCode(this.f11126r)));
        }
        this.f11126r.e(new C0259a(this.f11118j, this.f11126r.b()), this.f11111c);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @Override // o0.a
    public void a(@Nullable o0.b bVar) {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.X(f11108v, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f11118j, bVar);
        }
        this.f11109a.c(bVar != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.f11121m) {
            this.f11110b.c(this);
            release();
        }
        o0.c cVar = this.f11116h;
        if (cVar != null) {
            cVar.e(null);
            this.f11116h = null;
        }
        if (bVar != null) {
            h.d(bVar instanceof o0.c);
            o0.c cVar2 = (o0.c) bVar;
            this.f11116h = cVar2;
            cVar2.e(this.f11117i);
        }
    }

    @Override // o0.a
    public void c() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#onAttach");
        }
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.X(f11108v, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f11118j, this.f11121m ? "request already submitted" : "request needs submit");
        }
        this.f11109a.c(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        h.i(this.f11116h);
        this.f11110b.c(this);
        this.f11120l = true;
        if (!this.f11121m) {
            Q();
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @Override // o0.a
    public void d(@Nullable String str) {
        this.f11125q = str;
    }

    @Override // o0.a
    @Nullable
    public o0.b e() {
        return this.f11116h;
    }

    @Override // o0.a
    @Nullable
    public Animatable f() {
        Drawable drawable = this.f11128t;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    @Override // o0.a
    public void g(boolean z4) {
        d dVar = this.f11114f;
        if (dVar != null) {
            if (z4 && !this.f11122n) {
                dVar.b(this.f11118j);
            } else if (!z4 && this.f11122n) {
                dVar.a(this.f11118j);
            }
        }
        this.f11122n = z4;
    }

    @Override // o0.a
    @Nullable
    public String getContentDescription() {
        return this.f11125q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(c<? super INFO> cVar) {
        h.i(cVar);
        c<INFO> cVar2 = this.f11115g;
        if (cVar2 instanceof b) {
            ((b) cVar2).a(cVar);
        } else if (cVar2 != null) {
            this.f11115g = b.h(cVar2, cVar);
        } else {
            this.f11115g = cVar;
        }
    }

    protected abstract Drawable l(T t4);

    @Nullable
    protected T m() {
        return null;
    }

    public Object n() {
        return this.f11119k;
    }

    protected c<INFO> o() {
        c<INFO> cVar = this.f11115g;
        return cVar == null ? com.facebook.drawee.controller.b.a() : cVar;
    }

    @Override // com.facebook.drawee.gestures.a.InterfaceC0261a
    public boolean onClick() {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.W(f11108v, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f11118j);
        }
        if (P()) {
            this.f11112d.d();
            this.f11116h.reset();
            Q();
            return true;
        }
        return false;
    }

    @Override // o0.a
    public void onDetach() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractDraweeController#onDetach");
        }
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.W(f11108v, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f11118j);
        }
        this.f11109a.c(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.f11120l = false;
        this.f11110b.f(this);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @Override // o0.a
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.X(f11108v, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f11118j, motionEvent);
        }
        com.facebook.drawee.gestures.a aVar = this.f11113e;
        if (aVar == null) {
            return false;
        }
        if (aVar.b() || O()) {
            this.f11113e.d(motionEvent);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public Drawable p() {
        return this.f11117i;
    }

    protected abstract com.facebook.datasource.c<T> q();

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public com.facebook.drawee.gestures.a r() {
        return this.f11113e;
    }

    @Override // com.facebook.drawee.components.a.b
    public void release() {
        this.f11109a.c(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        com.facebook.drawee.components.b bVar = this.f11112d;
        if (bVar != null) {
            bVar.e();
        }
        com.facebook.drawee.gestures.a aVar = this.f11113e;
        if (aVar != null) {
            aVar.e();
        }
        o0.c cVar = this.f11116h;
        if (cVar != null) {
            cVar.reset();
        }
        H();
    }

    public String s() {
        return this.f11118j;
    }

    protected String t(@Nullable T t4) {
        return t4 != null ? t4.getClass().getSimpleName() : "<null>";
    }

    public String toString() {
        return g.f(this).g("isAttached", this.f11120l).g("isRequestSubmitted", this.f11121m).g("hasFetchFailed", this.f11123o).d("fetchedImage", u(this.f11127s)).f(f.ax, this.f11109a.toString()).toString();
    }

    protected int u(@Nullable T t4) {
        return System.identityHashCode(t4);
    }

    @Nullable
    protected abstract INFO v(T t4);

    /* JADX INFO: Access modifiers changed from: protected */
    @ReturnsOwnership
    public com.facebook.drawee.components.b w() {
        if (this.f11112d == null) {
            this.f11112d = new com.facebook.drawee.components.b();
        }
        return this.f11112d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(String str, Object obj) {
        x(str, obj);
        this.f11129u = false;
    }
}
