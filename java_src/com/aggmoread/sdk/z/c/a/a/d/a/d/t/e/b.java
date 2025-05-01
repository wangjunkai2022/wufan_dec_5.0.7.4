package com.aggmoread.sdk.z.c.a.a.d.a.d.t.e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.d;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.e.f;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.comm.util.AdError;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class b extends com.aggmoread.sdk.z.c.a.a.d.a.d.a {

    /* renamed from: n  reason: collision with root package name */
    private UnifiedBannerView f3103n;

    /* loaded from: classes2.dex */
    class a implements a.InterfaceC0125a {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void a() {
            b.this.C();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void b() {
            b.this.z();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void onADClicked() {
            b.this.y();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void onADCloseOverlay() {
            b.this.A();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void onADExposure() {
            b.this.B();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void onADLeftApplication() {
            b.this.E();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void onADOpenOverlay() {
            b.this.D();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a.InterfaceC0125a
        public void onNoAD(AdError adError) {
            b.this.a(adError);
        }
    }

    public b(d dVar, e eVar) {
        super(dVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        a(new View[0]);
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (o()) {
            int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f3103n);
            if (com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f3245d, a5)) {
                a(a5, 0);
                return;
            }
            b(a5);
        }
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f3243b, this.f3103n, this.f3245d);
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        u();
    }

    private void F() {
        UnifiedBannerView unifiedBannerView;
        if (this.f2814i && (unifiedBannerView = this.f3103n) != null && unifiedBannerView.getParent() == null && this.f2816k.compareAndSet(false, true)) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3103n, k());
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f2818m.get();
            if (aVar != null) {
                aVar.addView(this.f3103n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdError adError) {
        b(new i(adError.getErrorCode(), adError.getErrorMsg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        r();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.m.a
    public void a(ViewGroup viewGroup) {
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f3244c.f3260d);
        this.f2818m = new WeakReference<>(aVar);
        aVar.addOnAttachStateChangeListener(new com.aggmoread.sdk.z.c.a.a.d.b.m.b());
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(aVar);
            }
            viewGroup.addView(aVar, new ViewGroup.LayoutParams(-1, -2));
        }
        F();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.a, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
        this.f3246e = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.m.a
    public void b() {
        a(this.f3244c.f3266j);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3103n, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3103n, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.m.a
    public void destroy() {
        UnifiedBannerView unifiedBannerView = this.f3103n;
        if (unifiedBannerView != null) {
            unifiedBannerView.destroy();
            this.f3103n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a().a(this.f3244c);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        Context context = this.f3244c.f3260d;
        f fVar = this.f3245d.f3309c;
        Object obj = e.c.X;
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(context, fVar.a(obj, ""));
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a().a(this.f3245d, this.f3244c);
        UnifiedBannerView unifiedBannerView = (UnifiedBannerView) com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3244c.f3260d, this.f3245d.f3309c.c(obj), this.f3245d.f3309c.c(e.c.T), d.e.BANNER, this.f3247f, new com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a(new a()).a(), new Object[0]);
        this.f3103n = unifiedBannerView;
        this.f2814i = false;
        com.aggmoread.sdk.z.c.a.a.d.b.d dVar = this.f3244c;
        if (dVar.f3268l) {
            unifiedBannerView.setRefresh(0);
        } else {
            unifiedBannerView.setRefresh(dVar.f3271o);
        }
        new k(this.f3244c, this.f3245d).a(0).b();
        this.f3103n.loadAD();
    }
}
