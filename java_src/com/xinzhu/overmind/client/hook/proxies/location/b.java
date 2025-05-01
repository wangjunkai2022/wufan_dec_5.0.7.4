package com.xinzhu.overmind.client.hook.proxies.location;

import android.location.LocationManager;
import com.xinzhu.haunted.android.location.b;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import java.lang.reflect.Method;
/* compiled from: LocationManagerStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* compiled from: LocationManagerStub.java */
    /* loaded from: classes.dex */
    static class a extends e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getFromLocation";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, com.xinzhu.haunted.android.location.a.f66732c);
            if (a5 >= 0) {
                com.xinzhu.haunted.android.location.a aVar = new com.xinzhu.haunted.android.location.a(objArr[a5]);
                aVar.k(Overmind.getHostPkg());
                aVar.l(Overmind.getHostUid());
                objArr[a5] = aVar.f66741a;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: LocationManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.location.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0735b extends e {
        C0735b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getFromLocationName";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, com.xinzhu.haunted.android.location.a.f66732c);
            if (a5 >= 0) {
                com.xinzhu.haunted.android.location.a aVar = new com.xinzhu.haunted.android.location.a(objArr[a5]);
                aVar.k(Overmind.getHostPkg());
                aVar.l(Overmind.getHostUid());
                objArr[a5] = aVar.f66741a;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: LocationManagerStub.java */
    /* loaded from: classes.dex */
    static class c extends e {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "isProviderEnabledForUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public b() {
        super(s.i("location"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return s.i("location") != this;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return b.a.a(s.i("location"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        new com.xinzhu.haunted.com.android.location.a((LocationManager) Overmind.getContext().getSystemService("location")).c(obj2);
        replaceSystemService("location");
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.e(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new c());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("setExtraLocationControllerPackageEnabled", null));
        addMethodHook(new a());
        addMethodHook(new C0735b());
    }
}
