package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import java.lang.reflect.Proxy;
/* loaded from: classes2.dex */
public final class v extends g {

    /* renamed from: a  reason: collision with root package name */
    Context f4608a;

    public v(Context context) {
        this.f4608a = context;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final <T> T a(Class<T> cls, l lVar) {
        h hVar = new h(new w(this, lVar));
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new i(hVar.f4575a, cls, hVar.f4576b));
    }
}
