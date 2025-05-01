package com.xinzhu.overmind.client.hook.proxies.net.wifi;

import android.os.WorkSource;
import com.xinzhu.haunted.android.net.wifi.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.utils.e;
import com.xinzhu.overmind.utils.helpers.c;
import java.lang.reflect.Method;
/* compiled from: WifiManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67692b = "wifi";

    public a() {
        super(s.i("wifi"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        if (e.k()) {
            return false;
        }
        try {
            if (new com.xinzhu.haunted.com.android.net.wifi.a(Overmind.getContext().getSystemService("wifi")).b() != getProxyInvocation()) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return s.i("wifi") != this;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0701a.a(s.i("wifi"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        if (e.k()) {
            return;
        }
        try {
            new com.xinzhu.haunted.com.android.net.wifi.a(Overmind.getContext().getSystemService("wifi")).c(obj2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        replaceSystemService("wifi");
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        c.c(objArr);
        if (objArr != null) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                if (objArr[i4] != null && objArr[i4].getClass() == WorkSource.class) {
                    objArr[i4] = null;
                }
            }
        }
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
    }
}
