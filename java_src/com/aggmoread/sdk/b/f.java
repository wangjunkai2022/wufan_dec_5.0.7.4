package com.aggmoread.sdk.b;

import android.view.ViewGroup;
import com.aggmoread.sdk.client.banner.AMBannerAd;
import com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener;
import java.util.Map;
/* loaded from: classes2.dex */
public class f extends c implements AMBannerAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.m.a f1953b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.m.c f1954c;

    /* renamed from: d  reason: collision with root package name */
    private AMBannerAdInteractionListener f1955d;

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.m.c {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void a() {
            if (f.this.f1955d != null) {
                f.this.f1955d.onAdClosed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.m.c
        public void onADCloseOverlay() {
            if (f.this.f1955d != null) {
                f.this.f1955d.onADCloseOverlay();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.m.c
        public void onADLeftApplication() {
            if (f.this.f1955d != null) {
                f.this.f1955d.onADLeftApplication();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.m.c
        public void onADOpenOverlay() {
            if (f.this.f1955d != null) {
                f.this.f1955d.onADOpenOverlay();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdClicked() {
            if (f.this.f1955d != null) {
                f.this.f1955d.onAdClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.e
        public void onAdExposed() {
            if (f.this.f1955d != null) {
                f.this.f1955d.onAdExposed();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.m.c
        public void onAdShow() {
        }
    }

    public f(com.aggmoread.sdk.z.c.a.a.c.m.a aVar, d dVar) {
        super(aVar, dVar);
        this.f1953b = aVar;
        this.f1954c = new a();
    }

    @Override // com.aggmoread.sdk.b.c
    protected Map<String, Object> a() {
        return this.f1953b.h();
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1953b.destroy();
    }

    @Override // com.aggmoread.sdk.client.banner.AMBannerAd
    public void show(AMBannerAdInteractionListener aMBannerAdInteractionListener) {
        this.f1955d = aMBannerAdInteractionListener;
        this.f1953b.a(this.f1954c);
        this.f1953b.b();
    }

    @Override // com.aggmoread.sdk.client.banner.AMBannerAd
    public void showInContainer(ViewGroup viewGroup, AMBannerAdInteractionListener aMBannerAdInteractionListener) {
        this.f1955d = aMBannerAdInteractionListener;
        this.f1953b.a(this.f1954c);
        this.f1953b.a(viewGroup);
    }
}
