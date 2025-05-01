package com.xinzhu.overmind.client.hook.proxies.context.providers;

import android.annotation.SuppressLint;
import android.content.AttributionSource;
import android.os.IInterface;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.fixer.ContextFixer;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Method;
/* compiled from: ContentProviderStub.java */
/* loaded from: classes.dex */
public class a extends com.xinzhu.overmind.client.hook.b implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final String f67667c = "ContentProviderStub";

    /* renamed from: b  reason: collision with root package name */
    private IInterface f67668b;

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.proxies.context.providers.d
    public IInterface b(IInterface iInterface, String str) {
        this.f67668b = iInterface;
        injectHook();
        return (IInterface) getProxyInvocation();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return this.f67668b;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    @SuppressLint({"NewApi"})
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if ("asBinder".equals(method.getName())) {
            return method.invoke(this.f67668b, objArr);
        }
        if (objArr != null && objArr.length > 0) {
            if (objArr[0] instanceof String) {
                String str = (String) objArr[0];
                objArr[0] = Overmind.getHostPkg();
            }
            if (e.h()) {
                try {
                    int a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, AttributionSource.class);
                    if (a5 >= 0) {
                        ContextFixer.fixAttributionSource((AttributionSource) objArr[a5]);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        try {
            return method.invoke(this.f67668b, objArr);
        } catch (Throwable th2) {
            throw th2.getCause();
        }
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void onBindMethod() {
    }
}
