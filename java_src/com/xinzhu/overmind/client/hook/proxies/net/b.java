package com.xinzhu.overmind.client.hook.proxies.net;

import com.xinzhu.haunted.android.os.i;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import java.lang.reflect.Method;
/* compiled from: NetworkManagementStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67688b = "network_management";

    /* compiled from: NetworkManagementStub.java */
    /* loaded from: classes.dex */
    static class a extends e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getNetworkStatsUidDetail";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            b.d(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: NetworkManagementStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.net.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0736b extends e {
        C0736b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setUidCleartextNetworkPolicy";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            b.d(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: NetworkManagementStub.java */
    /* loaded from: classes.dex */
    static class c extends e {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setUidMeteredNetworkBlacklist";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            b.d(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: NetworkManagementStub.java */
    /* loaded from: classes.dex */
    static class d extends e {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setUidMeteredNetworkWhitelist";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            b.d(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    public b() {
        super(s.i(f67688b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object[] objArr, int i4) {
        if (objArr != null && (objArr[i4] instanceof Integer)) {
            if (((Integer) objArr[i4]).intValue() == com.xinzhu.overmind.client.e.getVUid() || ((Integer) objArr[i4]).intValue() == com.xinzhu.overmind.client.e.getBaseVUid()) {
                objArr[i4] = Integer.valueOf(Overmind.getHostUid());
            }
        }
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return i.a.a(s.i(f67688b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67688b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new C0736b());
        addMethodHook(new c());
        addMethodHook(new d());
        addMethodHook(new a());
    }
}
