package com.xinzhu.overmind.client.hook.proxies.telephony;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.telephony.b;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.server.os.MindDeviceInfo;
import java.lang.reflect.Method;
/* compiled from: PhoneSubInfoStub.java */
/* loaded from: classes.dex */
public class c extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67728b = "iphonesubinfo";

    /* compiled from: PhoneSubInfoStub.java */
    /* loaded from: classes.dex */
    public static class a extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getDeviceId";
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

    /* compiled from: PhoneSubInfoStub.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.telephony.c.a, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getDeviceIdForPhone";
        }
    }

    /* compiled from: PhoneSubInfoStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.telephony.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0743c extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getIccSerialNumber";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            MindDeviceInfo b5 = com.xinzhu.overmind.client.frameworks.c.a().b(com.xinzhu.overmind.client.e.getUserId());
            if (b5 != null && b5.f68007b) {
                return b5.f68010e;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: PhoneSubInfoStub.java */
    /* loaded from: classes.dex */
    public static class d extends C0743c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.telephony.c.C0743c, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getIccSerialNumberForSubscriber";
        }
    }

    /* compiled from: PhoneSubInfoStub.java */
    /* loaded from: classes.dex */
    public static class e extends a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.telephony.c.a, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getImeiForSubscriber";
        }
    }

    public c() {
        super(s.i(f67728b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return b.a.a(s.i(f67728b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67728b);
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
        addMethodHook(new b());
        addMethodHook(new d());
        addMethodHook(new e());
        addMethodHook(new C0743c());
        addMethodHook(new d());
    }
}
