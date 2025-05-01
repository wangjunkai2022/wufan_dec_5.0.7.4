package com.aggmoread.sdk.z.c.a.a.d.a.d.u.f;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.aggmoread.sdk.z.c.a.a.c.i;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsFeedAd;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class c extends com.aggmoread.sdk.z.c.a.a.d.a.d.c {

    /* renamed from: o  reason: collision with root package name */
    private String f3182o;

    /* renamed from: p  reason: collision with root package name */
    private KsFeedAd f3183p;

    /* renamed from: q  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.d.b.m.a f3184q;

    /* renamed from: r  reason: collision with root package name */
    private View f3185r;

    /* renamed from: s  reason: collision with root package name */
    private AtomicBoolean f3186s;

    /* loaded from: classes2.dex */
    private class b implements InvocationHandler {
        private b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if ("onAdClicked".equals(name)) {
                c.this.s();
                return null;
            } else if ("onAdShow".equals(name)) {
                c.this.t();
                return null;
            } else if ("onDislikeClicked".equals(name)) {
                c.this.u();
                return null;
            } else if ("onDownloadTipsDialogShow".equals(name)) {
                c.this.w();
                return null;
            } else if ("onDownloadTipsDialogDismiss".equals(name)) {
                c.this.v();
                return null;
            } else {
                return null;
            }
        }
    }

    public c(KsFeedAd ksFeedAd, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f3182o = "AMEPTAGKS";
        this.f3186s = new AtomicBoolean();
        this.f3183p = ksFeedAd;
        KsAdVideoPlayConfig ksAdVideoPlayConfig = null;
        this.f3183p.setAdInteractionListener((KsFeedAd.AdInteractionListener) Proxy.newProxyInstance(c.class.getClassLoader(), new Class[]{KsFeedAd.AdInteractionListener.class}, new b()));
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = dVar.f3275s;
        if (bVar != null) {
            KsAdVideoPlayConfig.Builder builder = new KsAdVideoPlayConfig.Builder();
            builder.videoSoundEnable(!bVar.d());
            builder.dataFlowAutoStart(bVar.a() == 1);
            ksAdVideoPlayConfig = builder.build();
        }
        this.f3183p.setVideoPlayConfig(ksAdVideoPlayConfig);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f2831l, com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a((Object) ksFeedAd), eVar);
    }

    private void r() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.a
    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        String str = this.f3182o;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "ac " + this.f3184q);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f3184q;
        return aVar != null ? aVar : super.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    public void b(int i4) {
        super.b(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f3183p, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3183p, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void destroy() {
        if (this.f3183p != null) {
            this.f3183p = null;
            this.f3185r = null;
            this.f3184q = null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    protected String getTitle() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a().a(this.f3183p);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public View getView() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3182o, "getView");
        if (this.f3185r == null) {
            this.f3185r = this.f3183p.getFeedView(this.f2798d.f3260d.getApplicationContext());
        }
        if (this.f3185r == null) {
            return null;
        }
        if (this.f3184q == null) {
            this.f3184q = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f2798d.f3260d.getApplicationContext());
        }
        String str = this.f3182o;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "getView " + this.f3184q);
        return this.f3184q;
    }

    public boolean q() {
        return this.f3186s.compareAndSet(false, true);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void render() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3182o, "render");
        View view = this.f3185r;
        if (view == null || this.f3183p == null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3182o, "render failed");
        } else if (view.getParent() != null || this.f3184q == null) {
        } else {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3182o, "render enter ");
            r();
            View[] viewArr = new View[0];
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f3184q;
            if (aVar != null) {
                aVar.addView(this.f3185r, new FrameLayout.LayoutParams(-1, -2));
            }
            l.a(this.f3184q, this.f2804j);
            l.a(this.f2798d.f3258b, this.f2804j, i.INFORMATION_FLOW, this.f3184q, viewArr, new WeakReference(this.f3184q), null, Integer.valueOf(this.f2799e.f()));
            l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
            byte[] b5 = this.f2798d.f3274r.b();
            if (b5 != null) {
                l.a(this.f2798d.f3258b, b5);
            }
            l.a(this.f2804j, this.f2799e);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void renderActivity(Activity activity) {
        render();
    }

    public void s() {
        i();
    }

    public void t() {
        this.f2801g = System.currentTimeMillis();
        l.a((Object) this.f2804j, true, true);
        if (q()) {
            k();
        }
    }

    public void u() {
        j();
    }

    public void v() {
    }

    public void w() {
    }
}
