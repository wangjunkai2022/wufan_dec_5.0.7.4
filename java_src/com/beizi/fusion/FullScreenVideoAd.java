package com.beizi.fusion;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.beizi.fusion.d.j;
/* loaded from: classes2.dex */
public class FullScreenVideoAd {

    /* renamed from: a  reason: collision with root package name */
    private j f6487a;

    public FullScreenVideoAd(Context context, String str, FullScreenVideoAdListener fullScreenVideoAdListener, long j4) {
        StringBuilder sb = new StringBuilder();
        sb.append(" request FullScreenVideoAd adUnitId:");
        sb.append(str);
        this.f6487a = new j(context, str, fullScreenVideoAdListener, j4);
    }

    public void destroy() {
        j jVar = this.f6487a;
        if (jVar != null) {
            jVar.B();
        }
    }

    public int getECPM() {
        j jVar = this.f6487a;
        if (jVar != null) {
            return jVar.A();
        }
        return -1;
    }

    public boolean isLoaded() {
        j jVar = this.f6487a;
        if (jVar != null) {
            return jVar.b();
        }
        return false;
    }

    public void loadAd() {
        j jVar = this.f6487a;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void setAdVersion(int i4) {
        j jVar = this.f6487a;
        if (jVar != null) {
            jVar.b(i4);
        }
    }

    public void showAd(@NonNull Activity activity) {
        j jVar = this.f6487a;
        if (jVar != null) {
            jVar.a(activity);
        }
    }
}
