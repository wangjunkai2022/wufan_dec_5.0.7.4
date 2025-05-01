package com.aggmoread.sdk.z.c.a.a.d.b.m;

import android.view.View;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.e;
/* loaded from: classes2.dex */
public class b implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private static String f3467a = "AMGTAG";

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        e.b(f3467a, "attach a");
        Object[] objArr = l.f3461a.get(view);
        if (objArr != null) {
            objArr[2] = Boolean.TRUE;
        } else {
            e.b(f3467a, "attach a tag == null");
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        e.b(f3467a, "dettach a");
        Object[] objArr = l.f3461a.get(view);
        if (objArr != null) {
            objArr[2] = Boolean.FALSE;
        } else {
            e.b(f3467a, "dettach a tag == null");
        }
    }
}
