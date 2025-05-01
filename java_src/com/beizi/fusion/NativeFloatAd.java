package com.beizi.fusion;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.RequiresPermission;
import com.beizi.fusion.d.p;
import com.join.mgps.data.c;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public class NativeFloatAd {

    /* renamed from: a  reason: collision with root package name */
    private p f6490a;

    @RequiresPermission(g.f55581a)
    public NativeFloatAd(Context context, String str, NativeFloatAdListener nativeFloatAdListener) {
        p pVar = new p(context, str, nativeFloatAdListener, c.f49010a);
        this.f6490a = pVar;
        pVar.a((ViewGroup) null);
    }

    public void destroy() {
        p pVar = this.f6490a;
        if (pVar != null) {
            pVar.m();
        }
    }

    @RequiresPermission(g.f55581a)
    public NativeFloatAd(Context context, String str, NativeFloatAdListener nativeFloatAdListener, long j4) {
        p pVar = new p(context, str, nativeFloatAdListener, j4);
        this.f6490a = pVar;
        pVar.a((ViewGroup) null);
    }
}
