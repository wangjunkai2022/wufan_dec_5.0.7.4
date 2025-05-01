package com.xinzhu.overmind.client.hook.proxies.pm;

import com.xinzhu.haunted.android.content.pm.d;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: LauncherAppsStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {
    public b() {
        super(s.i("launcherapps"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return d.a.a(s.i("launcherapps"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("launcherapps");
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
    }
}
