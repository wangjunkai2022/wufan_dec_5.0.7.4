package com.aggmoread.sdk.z.c.a.a.d.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.join.mgps.service.CommonService_;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public abstract class j extends com.aggmoread.sdk.z.c.a.a.d.b.a implements com.aggmoread.sdk.z.c.a.a.c.s.a {

    /* renamed from: s  reason: collision with root package name */
    private static String f2887s = "AMSTAG";

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f2888i;

    /* renamed from: j  reason: collision with root package name */
    private View f2889j;

    /* renamed from: k  reason: collision with root package name */
    public Object[] f2890k;

    /* renamed from: l  reason: collision with root package name */
    public WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> f2891l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2892m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f2893n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f2894o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2895p;

    /* renamed from: q  reason: collision with root package name */
    private AtomicBoolean f2896q;

    /* renamed from: r  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.c.s.c f2897r;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f2898b;

        a(List list) {
            this.f2898b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((com.aggmoread.sdk.z.c.a.a.c.s.b) j.this.f3244c.f3263g).onAdLoaded(this.f2898b);
        }
    }

    public j(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2891l = null;
        this.f2892m = false;
        this.f2893n = true;
        this.f2894o = false;
        this.f2895p = false;
        this.f2896q = new AtomicBoolean();
        this.f2890k = com.aggmoread.sdk.z.c.a.a.b.b();
    }

    private void a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, Context context) {
        View view;
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "cs enter");
        if (this.f2888i == null) {
            this.f2888i = new FrameLayout(context);
        }
        if (dVar != null && (view = dVar.f3267k) != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "cs 1");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            this.f2889j = view;
            this.f2888i.addView(view);
        }
        if (this.f2889j == null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "cs 2");
            com.aggmoread.sdk.z.c.a.a.d.b.m.d dVar2 = new com.aggmoread.sdk.z.c.a.a.d.b.m.d(context);
            this.f2889j = dVar2;
            this.f2888i.addView(dVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewGroup a(com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar, ViewGroup viewGroup, boolean z4) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "wac enter ");
        aVar.f3466e = true;
        com.aggmoread.sdk.z.c.a.a.d.b.l.a(aVar, this.f2890k);
        aVar.addOnAttachStateChangeListener(new com.aggmoread.sdk.z.c.a.a.d.b.m.b());
        aVar.setBackgroundColor(0);
        viewGroup.addView(aVar, -1, -1);
        com.aggmoread.sdk.z.c.a.a.d.b.m.c cVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.c(viewGroup.getContext());
        cVar.setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundColor(0);
        cVar.addView(frameLayout, -1, -1);
        aVar.addView(cVar, -1, -1);
        if (z4) {
            cVar.a(this.f2888i);
            this.f2892m = true;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "wac exist ");
        return frameLayout;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(int i4) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f3245d)) {
            c(i4);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(int i4, int i5, String str) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f3245d)) {
            b(i4, i5, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j4) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f2887s, "onAdTick %s", Long.valueOf(j4));
        View view = this.f2889j;
        if (view instanceof TextView) {
            ((TextView) view).setText(String.format("跳过 %d", Integer.valueOf((int) (j4 / 1000))));
        }
        com.aggmoread.sdk.z.c.a.a.c.s.c cVar = this.f2897r;
        if (cVar != null) {
            cVar.onAdTick(j4);
        }
        if (j4 <= 600) {
            this.f2894o = false;
        }
    }

    protected abstract void a(View view);

    @Override // com.aggmoread.sdk.z.c.a.a.c.s.a
    public void a(ViewGroup viewGroup) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, CommonService_.i0.f54387c);
        try {
            if (this.f2896q.compareAndSet(false, true)) {
                com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f3244c.f3260d);
                ViewGroup a5 = a(aVar, viewGroup, this.f2893n);
                a(aVar);
                b(a5);
                this.f2891l = new WeakReference<>(aVar);
            }
        } catch (Exception e5) {
            String str = f2887s;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "err " + e5);
            String message = e5.getMessage();
            b(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002008, "广告展示失败! ErrMsg :" + message, e5));
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.s.a
    public void a(com.aggmoread.sdk.z.c.a.a.c.s.c cVar) {
        this.f2897r = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        this.f3246e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "rs enter");
        ViewGroup viewGroup = this.f2888i;
        a(aVar, (viewGroup == null || !this.f2892m) ? new View[0] : new View[]{viewGroup});
    }

    protected void a(com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar, View[] viewArr) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "rs enter");
        String str = f2887s;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "sk  " + this.f2888i + ", h " + this.f2892m);
        com.aggmoread.sdk.z.c.a.a.d.b.l.a(this.f3244c.f3258b, this.f2890k, com.aggmoread.sdk.z.c.a.a.c.i.SPLASH, aVar, viewArr);
        com.aggmoread.sdk.z.c.a.a.d.b.l.a((Object) this.f2890k, true, true);
        com.aggmoread.sdk.z.c.a.a.d.b.l.b(this.f3244c.f3258b, this.f3245d.e(), this.f3245d.b());
        int[] d5 = this.f3244c.d();
        if (d5 != null) {
            com.aggmoread.sdk.z.c.a.a.d.b.l.a(this.f3244c.f3258b, d5);
        } else {
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMSTAG", "save null");
        }
        byte[] b5 = this.f3244c.f3274r.b();
        String str2 = f2887s;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "rs edata = " + b5);
        if (b5 != null) {
            com.aggmoread.sdk.z.c.a.a.d.b.l.a(this.f3244c.f3258b, b5);
        }
        com.aggmoread.sdk.z.c.a.a.d.b.l.a(this.f2890k, this.f3245d);
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "rs exist");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.s.a
    public final void b() {
        ViewGroup viewGroup = this.f3244c.f3266j;
        if (viewGroup != null) {
            a(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
    }

    protected abstract void b(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
        com.aggmoread.sdk.z.c.a.a.c.f fVar;
        com.aggmoread.sdk.z.c.a.a.e.e.a(f2887s, "onAdError %s", iVar);
        this.f3248g.a();
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(8).a(iVar).b();
        if (this.f2895p) {
            fVar = this.f2897r;
            if (fVar == null) {
                return;
            }
        } else if (this.f3245d.l()) {
            return;
        } else {
            fVar = this.f3244c.f3263g;
        }
        fVar.a(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.s.a
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(List<com.aggmoread.sdk.z.c.a.a.c.s.a> list) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "onAdLoaded");
        this.f3248g.a();
        this.f2895p = true;
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(3).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3244c, this.f3245d, this.f3243b)).b();
        if (this.f3244c.f3263g instanceof com.aggmoread.sdk.z.c.a.a.c.s.b) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new a(list));
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public String getID() {
        return this.f3244c.f3259c;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public Map<String, Object> h() {
        return com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3243b);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public final void l() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "handle");
        com.aggmoread.sdk.z.c.a.a.d.b.d dVar = this.f3244c;
        a(dVar, dVar.f3260d);
        a((View) this.f2888i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        com.aggmoread.sdk.z.c.a.a.c.s.c cVar;
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "onAdClicked");
        this.f2894o = false;
        com.aggmoread.sdk.z.c.a.a.d.b.k kVar = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d);
        com.aggmoread.sdk.z.c.a.a.d.b.e eVar = this.f3245d;
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f2891l;
        boolean a5 = kVar.a(eVar, weakReference == null ? null : weakReference.get(), 0L, this.f2890k);
        kVar.b();
        if (!a5 || (cVar = this.f2897r) == null) {
            return;
        }
        cVar.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "onAdClosed");
        if (this.f2894o) {
            t();
        }
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(4).b();
        com.aggmoread.sdk.z.c.a.a.c.s.c cVar = this.f2897r;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2887s, "onAdExposure");
        a((com.aggmoread.sdk.z.c.a.a.c.e) this.f2897r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        com.aggmoread.sdk.z.c.a.a.c.s.c cVar = this.f2897r;
        if (cVar != null) {
            cVar.d();
        }
    }
}
