package com.xinzhu.overmind.client.hook.proxies.media;

import com.xinzhu.haunted.android.media.b;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
/* compiled from: MediaRouterServiceStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67687b = "media_router";

    public a() {
        super(s.i(f67687b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return b.a.a(s.i(f67687b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67687b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new d("registerClientAsUser", d.f67577f, d.f67578g));
        addMethodHook(new d("registerRouter2", d.f67577f, d.f67576e));
        addMethodHook(new d("registerManager", d.f67577f, d.f67576e));
    }
}
