package com.xinzhu.overmind.client.hook.proxies.vm;

import android.os.IInterface;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.android.view.c;
import com.xinzhu.haunted.android.view.d;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import java.lang.reflect.Method;
/* compiled from: WindowManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67734b = "WindowManagerStub";

    /* compiled from: WindowManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.vm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0745a extends e {
        C0745a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "openSession";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            b bVar = new b((IInterface) method.invoke(obj, objArr));
            bVar.injectHook();
            return bVar.getProxyInvocation();
        }
    }

    public a() {
        super(s.i("window"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return c.a.a(s.i("window"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("window");
        d.f(null);
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
        addMethodHook(new C0745a());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setForcedDisplayDensityForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("clearForcedDisplayDensityForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("disableKeyguard", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("reenableKeyguard", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isKeyguardSecure", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("refreshScreenCaptureDisabled", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
    }
}
