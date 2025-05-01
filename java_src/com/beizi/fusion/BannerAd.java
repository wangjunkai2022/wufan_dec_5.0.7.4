package com.beizi.fusion;

import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.d.d;
/* loaded from: classes2.dex */
public class BannerAd {

    /* renamed from: a  reason: collision with root package name */
    private d f6479a;

    public BannerAd(Context context, String str, BannerAdListener bannerAdListener, long j4) {
        StringBuilder sb = new StringBuilder();
        sb.append(" request BannerAd adUnitId:");
        sb.append(str);
        this.f6479a = new d(context, str, bannerAdListener, j4);
    }

    public void destroy() {
        d dVar = this.f6479a;
        if (dVar != null) {
            dVar.c();
        }
    }

    public int getECPM() {
        d dVar = this.f6479a;
        if (dVar != null) {
            return dVar.b();
        }
        return -1;
    }

    public void loadAd(float f5, float f6, ViewGroup viewGroup) {
        d dVar = this.f6479a;
        if (dVar != null) {
            dVar.a(f5, f6, viewGroup);
        }
    }
}
