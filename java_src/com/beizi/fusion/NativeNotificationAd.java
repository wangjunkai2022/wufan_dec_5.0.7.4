package com.beizi.fusion;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.RequiresPermission;
import com.beizi.fusion.d.q;
import com.join.mgps.data.c;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public class NativeNotificationAd {

    /* renamed from: a  reason: collision with root package name */
    private q f6491a;

    @RequiresPermission(g.f55581a)
    public NativeNotificationAd(Context context, String str, NativeNotificationAdListener nativeNotificationAdListener) {
        q qVar = new q(context, str, nativeNotificationAdListener, c.f49010a);
        this.f6491a = qVar;
        qVar.a((ViewGroup) null);
    }

    public void destroy() {
        q qVar = this.f6491a;
        if (qVar != null) {
            qVar.m();
        }
    }

    @RequiresPermission(g.f55581a)
    public NativeNotificationAd(Context context, String str, NativeNotificationAdListener nativeNotificationAdListener, long j4) {
        q qVar = new q(context, str, nativeNotificationAdListener, j4);
        this.f6491a = qVar;
        qVar.a((ViewGroup) null);
    }
}
