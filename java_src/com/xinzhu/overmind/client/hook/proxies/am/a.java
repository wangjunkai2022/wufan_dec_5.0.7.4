package com.xinzhu.overmind.client.hook.proxies.am;

import android.os.IInterface;
import com.xinzhu.haunted.android.app.b;
import com.xinzhu.overmind.client.hook.proxies.am.d;
import com.xinzhu.overmind.utils.e;
/* compiled from: ActivityClientControllerStub.java */
/* loaded from: classes.dex */
public class a extends com.xinzhu.overmind.client.hook.b {

    /* renamed from: b  reason: collision with root package name */
    public static IInterface f67640b;

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return com.xinzhu.haunted.android.app.b.c();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        if (com.xinzhu.haunted.android.app.b.a()) {
            new com.xinzhu.haunted.android.util.b(com.xinzhu.haunted.android.app.b.d()).e(obj2);
            b.a aVar = new b.a(com.xinzhu.haunted.android.app.b.d());
            if (aVar.a()) {
                aVar.c((IInterface) obj2);
            }
            f67640b = (IInterface) obj2;
        }
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void onBindMethod() {
        addMethodHook(new d.a());
        addMethodHook(new d.b());
        addMethodHook(new d.c());
        addMethodHook(new d.C0727d());
        addMethodHook(new d.o());
        addMethodHook(new d.n());
        addMethodHook(new d.f());
        addMethodHook(new d.g());
        addMethodHook(new d.l());
        addMethodHook(new d.e());
        addMethodHook(new d.k());
        addMethodHook(new d.m());
        if (e.t()) {
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("startAppLockService", 0));
        }
    }
}
