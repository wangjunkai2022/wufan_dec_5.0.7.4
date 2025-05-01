package com.beizi.fusion;

import android.content.Context;
import com.beizi.fusion.d.i;
/* loaded from: classes2.dex */
public class DrawAd {

    /* renamed from: a  reason: collision with root package name */
    private i f6486a;

    public DrawAd(Context context, String str, DrawAdListener drawAdListener, long j4) {
        this.f6486a = new i(context, str, drawAdListener, j4);
    }

    public void destroy() {
        i iVar = this.f6486a;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void loadAd() {
        i iVar = this.f6486a;
        if (iVar != null) {
            iVar.b();
        }
    }
}
