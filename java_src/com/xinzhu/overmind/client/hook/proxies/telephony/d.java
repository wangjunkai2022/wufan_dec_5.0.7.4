package com.xinzhu.overmind.client.hook.proxies.telephony;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.telephony.e;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.proxies.telephony.a;
import java.lang.reflect.Method;
/* compiled from: TelephonyManagerStub.java */
/* loaded from: classes.dex */
public class d extends BinderInvocationStub {
    public d() {
        super(s.i("phone"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return e.a.a(s.i("phone"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("phone");
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.c(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a.d());
        addMethodHook(new a.C0741a());
        addMethodHook(new a.b());
        addMethodHook(new a.c());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("IsUserDataEnabled", Boolean.TRUE));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("setDataEnabled", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getDataEnabled", Boolean.FALSE));
    }
}
