package com.beizi.fusion;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.beizi.fusion.d.l;
/* loaded from: classes2.dex */
public class InterstitialAd {

    /* renamed from: a  reason: collision with root package name */
    private l f6488a;

    public InterstitialAd(Context context, String str, InterstitialAdListener interstitialAdListener, long j4) {
        this.f6488a = new l(context, str, interstitialAdListener, j4, 0);
    }

    public void destroy() {
        l lVar = this.f6488a;
        if (lVar != null) {
            lVar.B();
        }
    }

    public int getECPM() {
        l lVar = this.f6488a;
        if (lVar != null) {
            return lVar.A();
        }
        return -1;
    }

    public boolean isLoaded() {
        l lVar = this.f6488a;
        if (lVar != null) {
            return lVar.b();
        }
        return false;
    }

    public void loadAd() {
        l lVar = this.f6488a;
        if (lVar != null) {
            lVar.c();
        }
    }

    public void setAdVersion(int i4) {
        l lVar = this.f6488a;
        if (lVar != null) {
            lVar.b(i4);
        }
    }

    public void showAd(@NonNull Activity activity) {
        l lVar = this.f6488a;
        if (lVar != null) {
            lVar.a(activity);
        }
    }

    public InterstitialAd(Context context, String str, InterstitialAdListener interstitialAdListener, long j4, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(" request InterstitialAd adUnitId:");
        sb.append(str);
        this.f6488a = new l(context, str, interstitialAdListener, j4, i4);
    }
}
