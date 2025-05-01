package com.xinzhu.overmind.client.hook.proxies.appwidget;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.appwidget.a;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.utils.helpers.f;
import java.lang.reflect.Method;
/* compiled from: AppWidgetManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {
    public a() {
        super(s.i("appwidget"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0711a.a(s.i("appwidget"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("appwidget");
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("asBinder")) {
            return super.invoke(obj, method, objArr);
        }
        return f.a(method.getReturnType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
    }
}
