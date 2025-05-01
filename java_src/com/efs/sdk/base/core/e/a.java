package com.efs.sdk.base.core.e;

import com.efs.sdk.base.core.util.Log;
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private com.efs.sdk.base.core.e.a.a f10387a;

    public abstract com.efs.sdk.base.core.e.a.a a();

    public final void a(com.efs.sdk.base.core.d.b bVar) {
        try {
            if (this.f10387a == null) {
                synchronized (this) {
                    if (this.f10387a == null) {
                        com.efs.sdk.base.core.e.a.a a5 = a();
                        this.f10387a = a5;
                        if (a5 == null) {
                            return;
                        }
                    }
                }
            }
            this.f10387a.a(bVar);
        } catch (Throwable th) {
            Log.e("efs.processor", "log handle error", th);
        }
    }
}
