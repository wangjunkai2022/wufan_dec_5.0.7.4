package com.beizi.ad;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.RequiresPermission;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.o;
import com.kuaishou.weapon.p0.g;
import java.util.List;
/* loaded from: classes2.dex */
public final class NativeAd implements AdLifeControl {

    /* renamed from: a  reason: collision with root package name */
    private int f5184a;

    /* renamed from: b  reason: collision with root package name */
    private int f5185b;

    /* renamed from: c  reason: collision with root package name */
    private String f5186c;

    /* renamed from: d  reason: collision with root package name */
    private int f5187d;

    /* renamed from: e  reason: collision with root package name */
    private String f5188e;

    /* renamed from: f  reason: collision with root package name */
    private List<Pair<String, Integer>> f5189f;

    /* renamed from: g  reason: collision with root package name */
    private final com.beizi.ad.internal.nativead.b f5190g;

    /* renamed from: h  reason: collision with root package name */
    private View f5191h;

    @RequiresPermission(g.f55581a)
    public NativeAd(Context context, String str, int i4, NativeAdListener nativeAdListener) {
        com.beizi.ad.internal.nativead.b bVar = new com.beizi.ad.internal.nativead.b(context, str, i4);
        this.f5190g = bVar;
        bVar.a(nativeAdListener);
    }

    @Override // com.beizi.ad.AdLifeControl
    public void cancel() {
        com.beizi.ad.internal.nativead.b bVar = this.f5190g;
        if (bVar != null) {
            bVar.f6021a.a();
            this.f5190g.cancel(true);
        }
    }

    public String getAdId() {
        com.beizi.ad.internal.nativead.b bVar = this.f5190g;
        if (bVar == null) {
            return null;
        }
        return bVar.e();
    }

    public NativeAdListener getAdListener() {
        return this.f5190g.f();
    }

    public int getAdOptimizePercent() {
        return this.f5184a;
    }

    public int getAdOptimizeSize() {
        return this.f5185b;
    }

    public String getAdUnitId() {
        return this.f5190g.c();
    }

    public String getDirection() {
        return this.f5188e;
    }

    public List<Pair<String, Integer>> getOrderOptimizeList() {
        return this.f5189f;
    }

    public String getPrice() {
        com.beizi.ad.internal.nativead.b bVar = this.f5190g;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public String getScrollDistance() {
        return this.f5186c;
    }

    public int getScrollDistancePercent() {
        return this.f5187d;
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
            com.beizi.ad.internal.nativead.b r0 = r6.f5190g
            r1 = -1
            if (r0 == 0) goto L39
            java.lang.String r0 = r0.i()
            if (r0 == 0) goto L39
            com.beizi.ad.internal.nativead.b r0 = r6.f5190g
            java.lang.String r0 = r0.i()
            java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> r2 = r6.f5189f
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
            int r3 = r6.f5184a
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.NativeAd.getValidOptimizePercent():int");
    }

    public void loadAd() {
        this.f5190g.a((a.C0179a) null);
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onDestoryLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onResumeLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStopLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void openAdInNativeBrowser(boolean z4) {
        this.f5190g.a(z4);
    }

    public void optimizeClickArea(int i4, View view, View view2, String str) {
        int validOptimizePercent = getValidOptimizePercent();
        boolean a5 = o.a(validOptimizePercent);
        l.c("BeiZisAd", "percent = " + validOptimizePercent + ",isPass = " + a5);
        if (a5) {
            this.f5191h = com.beizi.ad.lance.a.g.a(i4, view, view2, str);
        }
    }

    public void setAdOptimizePercent(int i4) {
        this.f5184a = i4;
    }

    public void setAdOptimizeSize(int i4) {
        this.f5185b = i4;
    }

    public void setAdUnitId(String str) {
        this.f5190g.a(str);
    }

    public void setCloseMarketDialog(boolean z4) {
        com.beizi.ad.internal.nativead.b bVar = this.f5190g;
        if (bVar != null) {
            bVar.b(z4);
        }
    }

    public void setDirection(String str) {
        this.f5188e = str;
    }

    public void setOrderOptimizeList(List<Pair<String, Integer>> list) {
        this.f5189f = list;
    }

    public void setScrollDistance(String str) {
        this.f5186c = str;
    }

    public void setScrollDistancePercent(int i4) {
        this.f5187d = i4;
    }

    public void setTouchAreaNormal() {
        View view = this.f5191h;
        if (view != null) {
            ViewUtil.removeChildFromParent(view);
        }
    }

    @Deprecated
    public void shouldLoadIcon(boolean z4) {
        this.f5190g.d(z4);
    }

    @Deprecated
    public void shouldLoadImage(boolean z4) {
        this.f5190g.c(z4);
    }
}
