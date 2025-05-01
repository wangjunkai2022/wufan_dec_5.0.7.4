package com.aggmoread.sdk.z.c.a.a.d.a.d.t.k;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.c.a.a.d.a.d.j;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.b;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.d;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.f;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.qq.e.ads.splash.SplashAD;
import com.qq.e.ads.splash.SplashADListener;
import com.qq.e.comm.util.AdError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends j implements SplashADListener {

    /* renamed from: t  reason: collision with root package name */
    private String f3159t;

    /* renamed from: u  reason: collision with root package name */
    private SplashAD f3160u;

    /* renamed from: v  reason: collision with root package name */
    private AtomicBoolean f3161v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3162w;

    /* renamed from: x  reason: collision with root package name */
    private int f3163x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f3164y;

    /* renamed from: z  reason: collision with root package name */
    private long f3165z;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0132a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f3166b;

        RunnableC0132a(ArrayList arrayList) {
            this.f3166b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.e(this.f3166b);
        }
    }

    public a(d dVar, e eVar) {
        super(dVar, eVar);
        this.f3159t = "AMSTAGGDT";
        this.f3161v = new AtomicBoolean();
        this.f3162w = false;
        this.f3163x = -1;
        this.f3164y = false;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    public void a(View view) {
        Context context = this.f3244c.f3260d;
        f fVar = this.f3245d.f3309c;
        Object obj = e.c.X;
        b.a(context, fVar.a(obj, ""));
        String str = this.f3159t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "s = " + view + ",f = " + this.f3244c.f3270n);
        this.f3243b.put(MediationConstant.KEY_ECPM, this.f3245d.f3308b.a(e.c.f3330f, "-1"));
        boolean z4 = true;
        this.f3160u = (SplashAD) com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3244c.f3260d, this.f3245d.f3309c.a(obj, ""), this.f3245d.f3309c.a(e.c.T, ""), d.e.SPLASH, this.f3247f, this, view, Integer.valueOf(this.f3244c.f3270n));
        int a5 = this.f3245d.f3310d.a(e.c.f3349w, 0);
        if (a5 > 0) {
            this.f3164y = true;
            if (a5 > 1) {
                l.a(this.f3244c, 9);
            }
            boolean a6 = m.a("4.360");
            String str2 = this.f3159t;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "ccd " + a6 + ", " + a5);
            l.a(this.f3244c, this.f3245d, (!a6 || a5 <= 2) ? false : false);
        }
        if (m.a("4.470")) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.b(this.f3160u, this.f3244c, this.f3245d);
        }
        this.f3165z = System.currentTimeMillis();
        this.f3160u.fetchAdOnly();
        new k(this.f3244c, this.f3245d).a(0).b();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.c.s.a
    public void a(ViewGroup viewGroup) {
        String str = this.f3159t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "showInContainer gdt container " + viewGroup + ",request activity " + this.f3244c.f3260d);
        if (viewGroup != null) {
            String str2 = this.f3159t;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "container visible = " + viewGroup.getVisibility() + ", context = " + viewGroup.getContext());
        }
        if (this.f3161v.compareAndSet(false, true)) {
            if (l.b(this.f3244c) == 91) {
                b(new i(1001006001, "GDT ad blocked"));
                return;
            }
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(viewGroup.getContext());
            this.f2891l = new WeakReference<>(aVar);
            ViewGroup a5 = a(aVar, viewGroup, !m.a("4.370"));
            a(aVar);
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3160u, k());
            String str3 = this.f3159t;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str3, "gdtContainer = " + a5 + ", visibile = " + a5.getVisibility() + ", context = " + a5.getContext());
            this.f3160u.showAd(a5);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3160u, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    public void b(ViewGroup viewGroup) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3160u, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return b.a().a(this.f3244c);
    }

    @Override // com.qq.e.ads.splash.SplashADListener
    public void onADClicked() {
        q();
    }

    @Override // com.qq.e.ads.splash.SplashADListener
    public void onADDismissed() {
        r();
    }

    @Override // com.qq.e.ads.splash.SplashADListener
    public void onADExposure() {
        s();
    }

    @Override // com.qq.e.ads.splash.SplashADListener
    public void onADLoaded(long j4) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3159t, "onADLoaded");
        if (o()) {
            int a5 = b.a(this.f3160u);
            if (b.a(this.f3245d, a5)) {
                a(a5, 0);
                return;
            }
            b(a5);
        }
        i();
        if (this.f3164y) {
            int b5 = l.b(this.f3244c);
            String str = this.f3159t;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "bt " + b5);
            String a6 = this.f3245d.f3309c.a(e.c.T, "");
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3159t, "lbt");
            int a7 = l.a(a6);
            this.f3163x = a7;
            if (a7 != -1) {
                String str2 = this.f3159t;
                com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "lbt = " + a7);
                b5 = a7;
            }
            if (b5 == 9) {
                b(new i(1001006000, "广告素材被屏敝"));
                return;
            }
        }
        b.a(this.f3243b, this.f3160u, this.f3245d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        int a8 = this.f3245d.f3310d.a(e.c.f3347u, 0);
        long currentTimeMillis = 500 - (System.currentTimeMillis() - this.f3165z);
        if (a8 <= 0 || currentTimeMillis <= 0) {
            String str3 = this.f3159t;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str3, "run  " + a8);
            e(arrayList);
            return;
        }
        String str4 = this.f3159t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str4, "del  " + currentTimeMillis);
        n.a(new RunnableC0132a(arrayList), currentTimeMillis);
    }

    @Override // com.qq.e.ads.splash.SplashADListener
    public void onADPresent() {
    }

    @Override // com.qq.e.ads.splash.SplashADListener
    public void onADTick(long j4) {
        if (!this.f2892m && !this.f3162w) {
            l.a(this.f2890k);
            this.f3162w = true;
        }
        a(j4);
    }

    @Override // com.qq.e.ads.splash.SplashADListener
    public void onNoAD(AdError adError) {
        b(new i(adError.getErrorCode(), adError.getErrorMsg()));
    }
}
