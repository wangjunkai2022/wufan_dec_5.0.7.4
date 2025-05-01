package com.beizi.fusion;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.beizi.fusion.d.v;
/* loaded from: classes2.dex */
public class UnifiedCustomAd {

    /* renamed from: a  reason: collision with root package name */
    private v f6500a;

    public UnifiedCustomAd(Context context, String str, NativeAdListener nativeAdListener, long j4, int i4) {
        this.f6500a = new v(context, str, nativeAdListener, j4, i4);
    }

    public void destroy() {
        v vVar = this.f6500a;
        if (vVar != null) {
            vVar.A();
        }
    }

    public boolean isLoaded() {
        v vVar = this.f6500a;
        if (vVar != null) {
            return vVar.c();
        }
        return false;
    }

    public void loadAd() {
        v vVar = this.f6500a;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void resume() {
        v vVar = this.f6500a;
        if (vVar != null) {
            vVar.B();
        }
    }

    public void showAd(@NonNull Activity activity) {
        v vVar = this.f6500a;
        if (vVar != null) {
            vVar.a(activity);
        }
    }
}
