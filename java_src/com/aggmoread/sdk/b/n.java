package com.aggmoread.sdk.b;

import android.view.ViewGroup;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.splash.AMSplashAd;
import com.aggmoread.sdk.client.splash.AMSplashInteractionListener;
import com.aggmoread.sdk.t;
import java.util.Map;
/* loaded from: classes2.dex */
public class n extends c implements AMSplashAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.s.a f1986b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.s.c f1987c;

    /* renamed from: d  reason: collision with root package name */
    private AMSplashInteractionListener f1988d;

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.s.c {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void a() {
            String str = t.SDK_TAG;
            if (n.this.f1988d != null) {
                n.this.f1988d.onAdClosed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            if (n.this.f1988d != null) {
                n.this.f1988d.onAdError(new AMError(dVar.a(), dVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.s.c
        public void d() {
            String str = t.SDK_TAG;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdClicked() {
            String str = t.SDK_TAG;
            if (n.this.f1988d != null) {
                n.this.f1988d.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdExposed() {
            String str = t.SDK_TAG;
            if (n.this.f1988d != null) {
                n.this.f1988d.onAdExposed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.s.c
        public void onAdTick(long j4) {
            String str = t.SDK_TAG;
            if (n.this.f1988d != null) {
                n.this.f1988d.onAdTick(j4);
            }
        }
    }

    public n(d dVar, com.aggmoread.sdk.z.c.a.a.c.s.a aVar) {
        super(aVar, dVar);
        this.f1986b = aVar;
        this.f1987c = new a();
    }

    @Override // com.aggmoread.sdk.b.c
    public Map<String, Object> a() {
        return this.f1986b.h();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1988d = null;
        this.f1987c = null;
        com.aggmoread.sdk.z.c.a.a.c.s.a aVar = this.f1986b;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // com.aggmoread.sdk.client.splash.AMSplashAd
    public void show(AMSplashInteractionListener aMSplashInteractionListener) {
        this.f1988d = aMSplashInteractionListener;
        this.f1986b.a(this.f1987c);
        this.f1986b.b();
    }

    @Override // com.aggmoread.sdk.client.splash.AMSplashAd
    public void showViewGroup(ViewGroup viewGroup, AMSplashInteractionListener aMSplashInteractionListener) {
        this.f1988d = aMSplashInteractionListener;
        this.f1986b.a(this.f1987c);
        this.f1986b.a(viewGroup);
    }
}
