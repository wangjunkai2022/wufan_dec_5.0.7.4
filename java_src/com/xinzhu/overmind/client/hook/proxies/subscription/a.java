package com.xinzhu.overmind.client.hook.proxies.subscription;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.telephony.d;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.utils.helpers.c;
import java.lang.reflect.Method;
/* compiled from: SubscriptionManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67720b = "isub";

    public a() {
        super(s.i(f67720b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return d.a.a(s.i(f67720b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67720b);
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        c.d(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
    }
}
