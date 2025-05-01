package com.beizi.ad.internal;

import android.app.Activity;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.R;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.view.AdViewImpl;
import com.beizi.ad.internal.view.AdWebView;
import com.beizi.ad.internal.view.BannerAdViewImpl;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: AdViewRequestManagerImpl.java */
/* loaded from: classes2.dex */
class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final SoftReference<AdViewImpl> f5876a;

    /* renamed from: b  reason: collision with root package name */
    private com.beizi.ad.internal.a.b f5877b;

    /* renamed from: c  reason: collision with root package name */
    private com.beizi.ad.internal.network.a f5878c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(AdViewImpl adViewImpl) {
        this.f5876a = new SoftReference<>(adViewImpl);
    }

    @Override // com.beizi.ad.internal.e
    public d c() {
        AdViewImpl adViewImpl = this.f5876a.get();
        if (adViewImpl != null) {
            return adViewImpl.getAdParameters();
        }
        return null;
    }

    @Override // com.beizi.ad.internal.e
    public com.beizi.ad.b.a d() {
        a.C0179a f5 = f();
        if (f5 != null) {
            return f5.e();
        }
        return null;
    }

    @Override // com.beizi.ad.internal.l
    public void e() {
        com.beizi.ad.internal.network.a aVar = this.f5878c;
        if (aVar != null) {
            aVar.cancel(true);
            this.f5878c = null;
        }
        a((LinkedList<com.beizi.ad.internal.a.a>) null);
        com.beizi.ad.internal.a.b bVar = this.f5877b;
        if (bVar != null) {
            bVar.a(true);
            this.f5877b = null;
        }
    }

    protected a.C0179a f() {
        if (this.f5876a.get() != null) {
            return this.f5876a.get().getAdRequest();
        }
        return null;
    }

    @Override // com.beizi.ad.internal.e
    public void a() {
        if (f() == null) {
            HaoboLog.e(HaoboLog.baseLogTag, "Before execute request manager, you should set ad request!");
            return;
        }
        this.f5878c = new com.beizi.ad.internal.network.a(f());
        g();
        try {
            this.f5878c.a(this);
            this.f5878c.executeOnExecutor(com.beizi.ad.lance.a.c.b().c(), new Void[0]);
            AdViewImpl adViewImpl = this.f5876a.get();
            if (adViewImpl != null) {
                adViewImpl.getAdDispatcher().e();
            }
        } catch (IllegalStateException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("ignored:");
            sb.append(e5.getMessage());
        } catch (RejectedExecutionException e6) {
            String str = HaoboLog.baseLogTag;
            HaoboLog.e(str, "Concurrent Thread Exception while firing new ad request: " + e6.getMessage());
        }
    }

    @Override // com.beizi.ad.internal.e
    public void a(int i4) {
        h();
        AdViewImpl adViewImpl = this.f5876a.get();
        if (adViewImpl != null) {
            adViewImpl.getAdDispatcher().a(i4);
        }
    }

    @Override // com.beizi.ad.internal.e
    public void a(final ServerResponse serverResponse) {
        final AdViewImpl adViewImpl = this.f5876a.get();
        if (adViewImpl != null) {
            adViewImpl.getMyHandler().post(new Runnable() { // from class: com.beizi.ad.internal.f.1
                @Override // java.lang.Runnable
                public void run() {
                    ServerResponse serverResponse2;
                    ServerResponse serverResponse3 = serverResponse;
                    boolean z4 = false;
                    boolean z5 = serverResponse3 != null && serverResponse3.containsAds();
                    if (f.this.b() != null && !f.this.b().isEmpty()) {
                        z4 = true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(z5);
                    sb.append("=====");
                    sb.append(z4);
                    if (!z5 && !z4) {
                        HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.response_no_ads));
                        adViewImpl.getAdDispatcher().a(3);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getMediaType:");
                    sb2.append(adViewImpl.getMediaType());
                    j mediaType = adViewImpl.getMediaType();
                    j jVar = j.BANNER;
                    if (mediaType.equals(jVar)) {
                        ((BannerAdViewImpl) adViewImpl).resetContainerIfNeeded();
                    }
                    if (z5) {
                        f.this.a(serverResponse.getMediationAds());
                    }
                    if (f.this.b() != null && !f.this.b().isEmpty()) {
                        com.beizi.ad.internal.a.a i4 = f.this.i();
                        if (i4 != null && (serverResponse2 = serverResponse) != null) {
                            i4.a(serverResponse2.getExtras());
                        }
                        if (adViewImpl.getMediaType().equals(j.SPLASH)) {
                            f.this.f5877b = com.beizi.ad.internal.a.h.a((Activity) adViewImpl.getContext(), f.this, i4, adViewImpl.getAdDispatcher(), adViewImpl.getSplashParent(), serverResponse);
                        } else if (adViewImpl.getMediaType().equals(jVar)) {
                            f.this.f5877b = com.beizi.ad.internal.a.c.a((Activity) adViewImpl.getContext(), f.this, i4, adViewImpl.getAdDispatcher(), serverResponse);
                        } else if (adViewImpl.getMediaType().equals(j.INTERSTITIAL)) {
                            f.this.f5877b = com.beizi.ad.internal.a.f.a((Activity) adViewImpl.getContext(), f.this, i4, adViewImpl.getAdDispatcher(), serverResponse);
                        } else {
                            HaoboLog.e(HaoboLog.baseLogTag, "Request type can not be identified.");
                            adViewImpl.getAdDispatcher().a(1);
                        }
                    } else if (serverResponse != null) {
                        f.this.a(adViewImpl, serverResponse);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AdViewImpl adViewImpl, final ServerResponse serverResponse) {
        try {
            adViewImpl.getAdParameters().a(false);
            final AdWebView adWebView = new AdWebView(adViewImpl);
            if (adViewImpl.getMediaType().equals(j.SPLASH) || adViewImpl.getMediaType().equals(j.BANNER)) {
                adWebView.loadAd(serverResponse);
            }
            adViewImpl.createAdLogo(serverResponse.getAdUrl(), serverResponse.getLogoUrl());
            if (adViewImpl.getMediaType().equals(j.BANNER)) {
                adViewImpl.addBannerCloseBtn();
                BannerAdViewImpl bannerAdViewImpl = (BannerAdViewImpl) adViewImpl;
                if (bannerAdViewImpl.getExpandsToFitScreenWidth()) {
                    bannerAdViewImpl.expandToFitScreenWidth(serverResponse.getWidth(), serverResponse.getHeight(), adWebView);
                }
            }
            adViewImpl.serverResponse = serverResponse;
            a(new com.beizi.ad.internal.network.b() { // from class: com.beizi.ad.internal.f.2
                @Override // com.beizi.ad.internal.network.b
                public j a() {
                    return adViewImpl.getMediaType();
                }

                @Override // com.beizi.ad.internal.network.b
                public boolean b() {
                    return false;
                }

                @Override // com.beizi.ad.internal.network.b
                public com.beizi.ad.internal.view.c c() {
                    if (adViewImpl.getMediaType() != j.INTERSTITIAL && adViewImpl.getMediaType() != j.REWARDEDVIDEO) {
                        return adWebView.getRealDisplayable();
                    }
                    return adWebView;
                }

                @Override // com.beizi.ad.internal.network.b
                public NativeAdResponse d() {
                    return null;
                }

                @Override // com.beizi.ad.internal.network.b
                public String e() {
                    return serverResponse.getAdExtInfo();
                }

                @Override // com.beizi.ad.internal.network.b
                public String f() {
                    return serverResponse.getPrice();
                }

                @Override // com.beizi.ad.internal.network.b
                public String g() {
                    return serverResponse.getAdId();
                }

                @Override // com.beizi.ad.internal.network.b
                public void h() {
                    adWebView.destroy();
                }
            });
        } catch (Exception e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("========Exception=========:");
            sb.append(e5);
            String str = HaoboLog.baseLogTag;
            HaoboLog.e(str, "Exception initializing the view: " + e5.getMessage());
            a(0);
        }
    }

    public void a(com.beizi.ad.internal.network.b bVar) {
        h();
        if (this.f5877b != null) {
            this.f5877b = null;
        }
        AdViewImpl adViewImpl = this.f5876a.get();
        if (adViewImpl != null) {
            adViewImpl.getAdDispatcher().a(bVar);
        } else {
            bVar.h();
        }
    }
}
