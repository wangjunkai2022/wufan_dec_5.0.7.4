package com.aggmoread.sdk.b;

import android.app.Activity;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.interstitial.AMInterstitialAd;
import com.aggmoread.sdk.client.interstitial.AMInterstitialAdInteractionListener;
import java.util.Map;
/* loaded from: classes2.dex */
public class j extends c implements AMInterstitialAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.q.b f1971b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.q.a f1972c;

    /* renamed from: d  reason: collision with root package name */
    private AMInterstitialAdInteractionListener f1973d;

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.q.a {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void a() {
            if (j.this.f1973d != null) {
                j.this.f1973d.onAdClosed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            if (j.this.f1973d != null) {
                j.this.f1973d.onAdError(new AMError(dVar.a(), dVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.q.a
        public void onADLeftApplication() {
            if (j.this.f1973d != null) {
                j.this.f1973d.onADLeftApplication();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdClicked() {
            if (j.this.f1973d != null) {
                j.this.f1973d.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdExposed() {
            if (j.this.f1973d != null) {
                j.this.f1973d.onAdExposed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.q.a
        public void onAdShow() {
        }
    }

    public j(com.aggmoread.sdk.z.c.a.a.c.q.b bVar, d dVar) {
        super(bVar, dVar);
        this.f1971b = bVar;
        this.f1972c = new a();
    }

    @Override // com.aggmoread.sdk.b.c
    protected Map<String, Object> a() {
        return this.f1971b.h();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1971b.destroy();
        this.f1973d = null;
        this.f1972c = null;
    }

    @Override // com.aggmoread.sdk.client.interstitial.AMInterstitialAd
    public void show(Activity activity, AMInterstitialAdInteractionListener aMInterstitialAdInteractionListener) {
        this.f1973d = aMInterstitialAdInteractionListener;
        this.f1971b.a(this.f1972c);
        this.f1971b.a(activity);
    }

    @Override // com.aggmoread.sdk.client.interstitial.AMInterstitialAd
    public void show(AMInterstitialAdInteractionListener aMInterstitialAdInteractionListener) {
        this.f1973d = aMInterstitialAdInteractionListener;
        this.f1971b.a(this.f1972c);
        this.f1971b.b();
    }
}
