package com.aggmoread.sdk.z.c.a.a.d.a.d.u.e;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.kwad.sdk.api.KsDrawAd;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class b extends com.aggmoread.sdk.z.c.a.a.d.a.d.b {

    /* renamed from: p  reason: collision with root package name */
    private String f3175p;

    /* renamed from: q  reason: collision with root package name */
    private KsDrawAd f3176q;

    /* renamed from: r  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.d.b.m.a f3177r;

    /* renamed from: s  reason: collision with root package name */
    private View f3178s;

    /* renamed from: t  reason: collision with root package name */
    private AtomicBoolean f3179t;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.e.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class C0134b implements InvocationHandler {
        private C0134b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if ("onAdClicked".equals(name)) {
                b.this.l();
                return null;
            } else if ("onAdShow".equals(name)) {
                b.this.m();
                return null;
            } else if ("onVideoPlayStart".equals(name)) {
                b.this.r();
                return null;
            } else if ("onVideoPlayPause".equals(name)) {
                b.this.p();
                return null;
            } else if ("onVideoPlayResume".equals(name)) {
                b.this.q();
                return null;
            } else if ("onVideoPlayEnd".equals(name)) {
                b.this.n();
                return null;
            } else if ("onVideoPlayError".equals(name)) {
                b.this.o();
                return null;
            } else {
                return null;
            }
        }
    }

    public b(KsDrawAd ksDrawAd, d dVar, e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f3175p = "AMDRAWTAGKS";
        this.f3179t = new AtomicBoolean();
        this.f3176q = ksDrawAd;
        this.f3176q.setAdInteractionListener((KsDrawAd.AdInteractionListener) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{KsDrawAd.AdInteractionListener.class}, new C0134b()));
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f2821l, com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a((Object) ksDrawAd), eVar);
    }

    private void k() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.a
    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        String str = this.f3175p;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "ac " + this.f3177r);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f3177r;
        return aVar != null ? aVar : super.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    public void b(int i4) {
        super.b(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f3176q, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3176q, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void destroy() {
        if (this.f3176q != null) {
            this.f3176q = null;
            this.f3178s = null;
            this.f3177r = null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    protected String getTitle() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a().a(this.f3176q);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public View getView() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3175p, "getView");
        if (this.f3178s == null) {
            this.f3178s = this.f3176q.getDrawView(this.f2798d.f3260d.getApplicationContext());
        }
        if (this.f3178s == null) {
            return null;
        }
        if (this.f3177r == null) {
            this.f3177r = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f2798d.f3260d.getApplicationContext());
        }
        String str = this.f3175p;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "getView " + this.f3177r);
        return this.f3177r;
    }

    public boolean j() {
        return this.f3179t.compareAndSet(false, true);
    }

    public void l() {
        com.aggmoread.sdk.z.c.a.a.c.n.b bVar;
        k kVar = new k(this.f2798d, this.f2799e);
        boolean a5 = kVar.a(k.b.f3448n, this.f2796b).a(this.f2799e, a(), this.f2801g, this.f2804j);
        kVar.b();
        l.a((Object) this.f2804j, false, true);
        if (!a5 || (bVar = this.f2823n) == null) {
            return;
        }
        bVar.onAdClicked();
    }

    public void m() {
        this.f2801g = System.currentTimeMillis();
        l.a((Object) this.f2804j, true, true);
        if (j()) {
            d();
        }
    }

    public void n() {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoComplete();
        }
    }

    public void o() {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.a(new i(-1000, "ks:视频素材播放失败！"));
        }
    }

    public void p() {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoPause();
        }
    }

    public void q() {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoStart();
        }
    }

    public void r() {
        com.aggmoread.sdk.z.c.a.a.c.n.d dVar = this.f2822m;
        if (dVar != null) {
            dVar.onVideoStart();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void render() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3175p, "render");
        View view = this.f3178s;
        if (view == null || this.f3176q == null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3175p, "render failed");
        } else if (view.getParent() != null || this.f3177r == null) {
        } else {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3175p, "render enter ");
            k();
            View[] viewArr = new View[0];
            if (this.f3177r != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                this.f3177r.addView(this.f3178s, layoutParams);
                com.aggmoread.sdk.z.c.a.a.c.n.b bVar = this.f2823n;
                if (bVar != null) {
                    bVar.onRenderSuccess();
                }
            }
            l.a(this.f3177r, this.f2804j);
            l.a(this.f2798d.f3258b, this.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, this.f3177r, viewArr, new WeakReference(this.f3177r), null, Integer.valueOf(this.f2799e.f()));
            l.b(this.f2798d.f3258b, this.f2799e.e(), this.f2799e.b());
            byte[] b5 = this.f2798d.f3274r.b();
            if (b5 != null) {
                l.a(this.f2798d.f3258b, b5);
            }
            l.a(this.f2804j, this.f2799e);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void renderActivity(Activity activity) {
        render();
    }
}
