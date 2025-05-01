package com.aggmoread.sdk.z.c.a.a.d.a.d.p.e;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.aggmoread.sdk.z.c.a.a.c.i;
import com.aggmoread.sdk.z.c.a.a.d.a.d.p.c;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.baidu.mobads.sdk.api.ExpressResponse;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class c extends com.aggmoread.sdk.z.c.a.a.d.a.d.c {

    /* renamed from: o  reason: collision with root package name */
    private String f2963o;

    /* renamed from: p  reason: collision with root package name */
    private ExpressResponse f2964p;

    /* renamed from: q  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.d.b.m.a f2965q;

    /* renamed from: r  reason: collision with root package name */
    private View f2966r;

    /* renamed from: s  reason: collision with root package name */
    private AtomicBoolean f2967s;

    /* renamed from: t  reason: collision with root package name */
    private AtomicBoolean f2968t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ExpressResponse.ExpressInteractionListener {
        a() {
        }

        public void onAdClick() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "onAdClick");
            c.this.s();
        }

        public void onAdExposed() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "onAdExposed");
            c.this.t();
        }

        public void onAdRenderFail(View view, String str, int i4) {
            String str2 = c.this.f2963o;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "onAdRenderFail " + str + ", code " + i4);
            c.this.u();
        }

        public void onAdRenderSuccess(View view, float f5, float f6) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "onAdRenderSuccess");
            c.this.v();
        }

        public void onAdUnionClick() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "onAdUnionClick");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements c.g {
        b() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.g
        public void a() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "onDislikeWindowShow");
            c.this.y();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.g
        public void b() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "onDislikeWindowClose");
            c.this.x();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.g
        public void c() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "onDislikeItemClick");
            c.this.w();
        }
    }

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.e.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0109c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0109c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewParent parent = c.this.f2965q.getParent();
            if (parent instanceof ViewGroup) {
                Context context = ((ViewGroup) parent).getContext();
                String str = c.this.f2963o;
                com.aggmoread.sdk.z.c.a.a.e.e.b(str, "getView onGlobalLayout " + context);
                if ((context instanceof Activity) && c.this.f2968t.compareAndSet(false, true)) {
                    com.aggmoread.sdk.z.c.a.a.e.e.b(c.this.f2963o, "getView bindInteractionActivity ");
                    c.this.f2964p.bindInteractionActivity((Activity) context);
                    c.this.f2965q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    public c(ExpressResponse expressResponse, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f2963o = "AMEPTAGBD";
        this.f2967s = new AtomicBoolean();
        this.f2968t = new AtomicBoolean();
        this.f2964p = expressResponse;
        q();
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b(this.f2831l, com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a((Object) expressResponse), eVar);
        this.f2966r = expressResponse.getExpressAdView();
        this.f2965q = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(dVar.f3260d);
    }

    private void q() {
        this.f2964p.setInteractionListener(new a());
        this.f2964p.setAdDislikeListener(com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.a().a(new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.f2801g = System.currentTimeMillis();
        l.a((Object) this.f2804j, true, true);
        if (r()) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.a
    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        String str = this.f2963o;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "ac " + this.f2965q);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f2965q;
        return aVar != null ? aVar : super.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    public void b(int i4) {
        super.b(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2964p, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2964p, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void destroy() {
        if (this.f2964p != null) {
            this.f2964p = null;
            this.f2966r = null;
            this.f2965q = null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    protected String getTitle() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a().a(this.f2964p);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public View getView() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2963o, "getView");
        if (this.f2966r == null) {
            this.f2966r = this.f2964p.getExpressAdView();
        }
        if (this.f2966r == null) {
            return null;
        }
        if (this.f2965q == null) {
            this.f2965q = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f2798d.f3260d);
        }
        String str = this.f2963o;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "getView " + this.f2965q);
        if (!this.f2968t.get()) {
            this.f2965q.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0109c());
        }
        return this.f2965q;
    }

    public boolean r() {
        return this.f2967s.compareAndSet(false, true);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void render() {
        ExpressResponse expressResponse;
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2963o, "render");
        if (this.f2966r == null || (expressResponse = this.f2964p) == null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2963o, "render failed");
            return;
        }
        expressResponse.render();
        if (this.f2966r.getParent() != null || this.f2965q == null) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2963o, "render enter ");
        View[] viewArr = new View[0];
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f2965q;
        if (aVar != null) {
            aVar.addView(this.f2966r, new FrameLayout.LayoutParams(-1, -2));
        }
        l.a(this.f2965q, this.f2804j);
        l.a(this.f2798d.f3258b, this.f2804j, i.INFORMATION_FLOW, this.f2965q, viewArr, new WeakReference(this.f2965q), null);
        l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
        byte[] b5 = this.f2798d.f3274r.b();
        if (b5 != null) {
            l.a(this.f2798d.f3258b, b5);
        }
        l.a(this.f2804j, this.f2799e);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void renderActivity(Activity activity) {
        render();
    }
}
