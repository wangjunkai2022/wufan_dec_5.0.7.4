package com.sdk.w;

import android.content.Context;
import com.sdk.Unicorn.base.module.manager.SDKManager;
import com.sdk.f.c;
import com.sdk.f.g;
import com.sdk.g.b;
/* loaded from: classes5.dex */
public class a<T> extends b<T> {
    public a(Context context, com.sdk.e.a<T> aVar, c cVar) {
        super(context, aVar, cVar);
        if (!g.f60053d) {
            this.f60067i = g.a.f60056b.a();
            g.a.f60055a.a();
            return;
        }
        String str = SDKManager.testHost;
        if (!com.sdk.o.b.b(SDKManager.statisticalTestHost).booleanValue()) {
            g.a.f60055a.a();
        }
        this.f60067i = com.sdk.o.b.b(str).booleanValue() ? str : g.a.f60056b.a();
    }
}
