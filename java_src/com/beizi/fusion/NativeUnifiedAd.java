package com.beizi.fusion;

import android.content.Context;
import com.beizi.fusion.d.r;
/* loaded from: classes2.dex */
public class NativeUnifiedAd {

    /* renamed from: a  reason: collision with root package name */
    private r f6492a;

    public NativeUnifiedAd(Context context, String str, NativeUnifiedAdListener nativeUnifiedAdListener, long j4, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(" request NativeUnifiedAd adUnitId:");
        sb.append(str);
        this.f6492a = new r(context, str, nativeUnifiedAdListener, j4, i4);
    }

    public void destroy() {
        r rVar = this.f6492a;
        if (rVar != null) {
            rVar.B();
        }
    }

    public int getECPM() {
        r rVar = this.f6492a;
        if (rVar != null) {
            return rVar.A();
        }
        return -1;
    }

    public boolean isLoaded() {
        r rVar = this.f6492a;
        if (rVar != null) {
            return rVar.c();
        }
        return false;
    }

    public void loadAd() {
        r rVar = this.f6492a;
        if (rVar != null) {
            rVar.b();
        }
    }

    public void resume() {
        r rVar = this.f6492a;
        if (rVar != null) {
            rVar.C();
        }
    }
}
