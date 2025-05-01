package com.xinzhu.overmind.client.hook.proxies.os;

import com.xinzhu.haunted.android.os.k;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: StatsManagerServiceStub.java */
/* loaded from: classes.dex */
public class g extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67702b = "statsmanager";

    public g() {
        super(s.i(f67702b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return k.a.a(s.i(f67702b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67702b);
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("asBinder")) {
            return super.invoke(obj, method, objArr);
        }
        return com.xinzhu.overmind.utils.helpers.f.a(method.getReturnType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
    }
}
