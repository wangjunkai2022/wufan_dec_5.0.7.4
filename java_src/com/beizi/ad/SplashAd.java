package com.beizi.ad;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresPermission;
import com.beizi.ad.AdRequest;
import com.beizi.ad.c.c;
import com.beizi.ad.internal.view.BannerAdViewImpl;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public final class SplashAd implements AdLifeControl {

    /* renamed from: a  reason: collision with root package name */
    private final BannerAdViewImpl f5201a;

    @RequiresPermission(g.f55581a)
    public SplashAd(Context context, ViewGroup viewGroup, View view, AdListener adListener, String str) {
        viewGroup.setPadding(0, 0, 0, 0);
        BannerAdViewImpl bannerAdViewImpl = new BannerAdViewImpl(context, viewGroup, view);
        this.f5201a = bannerAdViewImpl;
        bannerAdViewImpl.setAdListener(adListener);
        bannerAdViewImpl.setAdUnitId(str);
        bannerAdViewImpl.loadAd(new AdRequest.Builder().build().impl());
    }

    public void adClick() {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.clickArea();
        }
    }

    @Override // com.beizi.ad.AdLifeControl
    public void cancel() {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.cancel();
        }
    }

    public void closeAd() {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.closeAd();
        }
    }

    public void disableFullClick(View.OnTouchListener onTouchListener) {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl == null || onTouchListener == null) {
            return;
        }
        bannerAdViewImpl.disableFullClick(onTouchListener);
    }

    public String getAdId() {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl == null) {
            return null;
        }
        return bannerAdViewImpl.getAdId();
    }

    public AdListener getAdListener() {
        return this.f5201a.getAdListener();
    }

    public String getAdUnitId() {
        return this.f5201a.getAdUnitId();
    }

    public String getPrice() {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl == null) {
            return null;
        }
        return bannerAdViewImpl.getPrice();
    }

    public boolean isLoaded() {
        return this.f5201a.isLoaded();
    }

    public boolean isLoading() {
        return this.f5201a.isLoading();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onCreateLifeCycle() {
        this.f5201a.onCreateLifeCycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onDestoryLifeCycle() {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.onDestoryLifeCycle();
        }
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onPauseLifeCycle() {
        this.f5201a.onPauseLifeCycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onRestartLifeCycle() {
        this.f5201a.onRestartLifeCycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onResumeLifeCycle() {
        this.f5201a.onResumeLifeCycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStartLifeCycle() {
        this.f5201a.onStartLifeCycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStopLifeCycle() {
        this.f5201a.onStopLifeCycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void openAdInNativeBrowser(boolean z4) {
        this.f5201a.openAdInNativeBrowser(z4);
    }

    public void setAdUnitId(String str) {
        this.f5201a.setAdUnitId(str);
    }

    public void setCloseButtonPadding(int i4, int i5, int i6, int i7) {
        this.f5201a.setCloseButtonPadding(i4, i5, i6, i7);
    }

    public void setCloseMarketDialog(boolean z4) {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.setCloseMarketDialog(z4);
        }
    }

    public void setScrollClick(View.OnTouchListener onTouchListener) {
        BannerAdViewImpl bannerAdViewImpl = this.f5201a;
        if (bannerAdViewImpl == null || onTouchListener == null) {
            return;
        }
        bannerAdViewImpl.setScrollClick(onTouchListener);
    }

    public void showAd() {
        this.f5201a.showAd();
    }

    public void adClick(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4) {
        if (this.f5201a != null) {
            c cVar = new c();
            if (!TextUtils.isEmpty(str)) {
                cVar.a(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.b(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                cVar.c(str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                cVar.d(str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                cVar.e(str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                cVar.f(str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                cVar.g(str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                cVar.h(str8);
            }
            this.f5201a.clickArea(cVar, i4);
        }
    }
}
