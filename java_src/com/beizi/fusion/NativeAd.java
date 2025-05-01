package com.beizi.fusion;

import android.content.Context;
import com.beizi.fusion.d.o;
/* loaded from: classes2.dex */
public class NativeAd {

    /* renamed from: a  reason: collision with root package name */
    private o f6489a;

    public NativeAd(Context context, String str, NativeAdListener nativeAdListener, long j4, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(" request NativeAd adUnitId:");
        sb.append(str);
        this.f6489a = new o(context, str, nativeAdListener, j4, i4);
    }

    public void destroy() {
        o oVar = this.f6489a;
        if (oVar != null) {
            oVar.c();
        }
    }

    public int getECPM() {
        o oVar = this.f6489a;
        if (oVar != null) {
            return oVar.b();
        }
        return -1;
    }

    public void loadAd(float f5, float f6) {
        o oVar = this.f6489a;
        if (oVar != null) {
            oVar.a(f5, f6);
        }
    }

    public void resume() {
        o oVar = this.f6489a;
        if (oVar != null) {
            oVar.A();
        }
    }
}
