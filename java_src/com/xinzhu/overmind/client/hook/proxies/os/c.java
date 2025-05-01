package com.xinzhu.overmind.client.hook.proxies.os;

import com.xinzhu.haunted.android.os.h;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: DeviceIdleControllerStub.java */
/* loaded from: classes.dex */
public class c extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67695b = "deviceidle";

    public c() {
        super(s.i(f67695b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return h.a.a(s.i(f67695b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67695b);
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.d(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("addPowerSaveTempWhitelistApp", com.xinzhu.overmind.client.hook.common.d.f67576e, 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("addPowerSaveTempWhitelistAppForMms", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("addPowerSaveTempWhitelistAppForSms", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("whitelistAppTemporarily", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
    }
}
