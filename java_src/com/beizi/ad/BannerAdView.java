package com.beizi.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.RequiresPermission;
import com.beizi.ad.internal.animation.TransitionDirection;
import com.beizi.ad.internal.animation.TransitionType;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.o;
import com.kuaishou.weapon.p0.g;
import java.util.List;
/* loaded from: classes2.dex */
public final class BannerAdView extends b {

    /* renamed from: b  reason: collision with root package name */
    private int f5158b;

    /* renamed from: c  reason: collision with root package name */
    private int f5159c;

    /* renamed from: d  reason: collision with root package name */
    private String f5160d;

    /* renamed from: e  reason: collision with root package name */
    private int f5161e;

    /* renamed from: f  reason: collision with root package name */
    private String f5162f;

    /* renamed from: g  reason: collision with root package name */
    private List<Pair<String, Integer>> f5163g;

    /* renamed from: h  reason: collision with root package name */
    private View f5164h;

    public BannerAdView(Context context) {
        super(context, j.BANNER);
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ AdListener getAdListener() {
        return super.getAdListener();
    }

    public int getAdOptimizePercent() {
        return this.f5158b;
    }

    public int getAdOptimizeSize() {
        return this.f5159c;
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ a getAdSize() {
        return super.getAdSize();
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    public String getDirection() {
        return this.f5162f;
    }

    public List<Pair<String, Integer>> getOrderOptimizeList() {
        return this.f5163g;
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ String getPrice() {
        return super.getPrice();
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ boolean getResizeAdToFitContainer() {
        return super.getResizeAdToFitContainer();
    }

    public String getScrollDistance() {
        return this.f5160d;
    }

    public int getScrollDistancePercent() {
        return this.f5161e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getValidOptimizePercent() {
        /*
            r6 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r6.f5346a
            r1 = -1
            if (r0 == 0) goto L39
            java.lang.String r0 = r0.getLandingPageUrl()
            if (r0 == 0) goto L39
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r6.f5346a
            java.lang.String r0 = r0.getLandingPageUrl()
            java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> r2 = r6.f5163g
            if (r2 == 0) goto L39
            java.util.Iterator r2 = r2.iterator()
            r3 = -1
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r5 = r4.first
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L1a
            java.lang.Object r3 = r4.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L1a
        L39:
            r3 = -1
        L3a:
            if (r3 != r1) goto L3e
            int r3 = r6.f5158b
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.BannerAdView.getValidOptimizePercent():int");
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void isAutoRefresh() {
        super.isAutoRefresh();
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ boolean isLoading() {
        return super.isLoading();
    }

    @Override // com.beizi.ad.b
    @RequiresPermission(g.f55581a)
    public /* bridge */ /* synthetic */ void loadAd(AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void onCreateLifeCycle() {
        super.onCreateLifeCycle();
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void onDestoryLifeCycle() {
        super.onDestoryLifeCycle();
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void onPauseLifeCycle() {
        super.onPauseLifeCycle();
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void onRestartLifeCycle() {
        super.onRestartLifeCycle();
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void onResumeLifeCycle() {
        super.onResumeLifeCycle();
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void onStartLifeCycle() {
        super.onStartLifeCycle();
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void onStopLifeCycle() {
        super.onStopLifeCycle();
    }

    @Override // com.beizi.ad.b, com.beizi.ad.AdLifeControl
    public /* bridge */ /* synthetic */ void openAdInNativeBrowser(boolean z4) {
        super.openAdInNativeBrowser(z4);
    }

    public void optimizeClickArea(int i4, View view, View view2, String str) {
        int validOptimizePercent = getValidOptimizePercent();
        boolean a5 = o.a(validOptimizePercent);
        l.c("BeiZisAd", "percent = " + validOptimizePercent + ",isPass = " + a5);
        if (a5) {
            this.f5164h = com.beizi.ad.lance.a.g.a(i4, view, view2, str);
        }
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void resume() {
        super.resume();
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setAdListener(AdListener adListener) {
        super.setAdListener(adListener);
    }

    public void setAdOptimizePercent(int i4) {
        this.f5158b = i4;
    }

    public void setAdOptimizeSize(int i4) {
        this.f5159c = i4;
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setAutoRefresh(boolean z4) {
        super.setAutoRefresh(z4);
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setCloseMarketDialog(boolean z4) {
        super.setCloseMarketDialog(z4);
    }

    public void setDirection(String str) {
        this.f5162f = str;
    }

    public void setOrderOptimizeList(List<Pair<String, Integer>> list) {
        this.f5163g = list;
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setResizeAdToFitContainer(boolean z4) {
        super.setResizeAdToFitContainer(z4);
    }

    public void setScrollDistance(String str) {
        this.f5160d = str;
    }

    public void setScrollDistancePercent(int i4) {
        this.f5161e = i4;
    }

    public void setTouchAreaNormal() {
        View view = this.f5164h;
        if (view != null) {
            ViewUtil.removeChildFromParent(view);
        }
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setTransitionDerection(TransitionDirection transitionDirection) {
        super.setTransitionDerection(transitionDirection);
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setTransitionDuration(int i4) {
        super.setTransitionDuration(i4);
    }

    @Override // com.beizi.ad.b
    public /* bridge */ /* synthetic */ void setTransitionType(TransitionType transitionType) {
        super.setTransitionType(transitionType);
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, j.BANNER);
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4, j.BANNER);
    }
}
