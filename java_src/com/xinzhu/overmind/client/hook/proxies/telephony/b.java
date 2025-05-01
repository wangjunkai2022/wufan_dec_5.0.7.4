package com.xinzhu.overmind.client.hook.proxies.telephony;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.telephony.a;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.server.os.MindDeviceInfo;
import java.lang.reflect.Method;
/* compiled from: HwTelephonyStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67723b = "phone_huawei";

    /* compiled from: HwTelephonyStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getDeviceId";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return "";
        }
    }

    /* compiled from: HwTelephonyStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.telephony.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0742b extends com.xinzhu.overmind.client.hook.e {
        C0742b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getDeviceIdWithFeature";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            MindDeviceInfo b5 = com.xinzhu.overmind.client.frameworks.c.a().b(com.xinzhu.overmind.client.e.getUserId());
            if (b5 != null && b5.f68007b) {
                return b5.f68009d;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: HwTelephonyStub.java */
    /* loaded from: classes.dex */
    class c extends com.xinzhu.overmind.client.hook.e {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getImeiForSlot";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            MindDeviceInfo b5 = com.xinzhu.overmind.client.frameworks.c.a().b(com.xinzhu.overmind.client.e.getUserId());
            if (b5 != null && b5.f68007b) {
                return b5.f68009d;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: HwTelephonyStub.java */
    /* loaded from: classes.dex */
    class d extends com.xinzhu.overmind.client.hook.e {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getUniqueDeviceId";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            MindDeviceInfo b5 = com.xinzhu.overmind.client.frameworks.c.a().b(com.xinzhu.overmind.client.e.getUserId());
            if (b5 != null && b5.f68007b) {
                return b5.f68009d;
            }
            return method.invoke(obj, objArr);
        }
    }

    public b() {
        super(s.i(f67723b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0715a.a(s.i(f67723b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67723b);
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
        addMethodHook(new a());
        addMethodHook(new C0742b());
        addMethodHook(new c());
        addMethodHook(new d());
    }
}
