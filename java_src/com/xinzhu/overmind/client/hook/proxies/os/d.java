package com.xinzhu.overmind.client.hook.proxies.os;

import android.content.ComponentName;
import com.xinzhu.haunted.android.app.admin.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: DevicePolicyManagerStub.java */
/* loaded from: classes.dex */
public class d extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67696b = "device_policy";

    /* compiled from: DevicePolicyManagerStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getDeviceOwnerComponent";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return new ComponentName(com.xinzhu.overmind.client.e.getVPackageName(), "");
        }
    }

    public d() {
        super(s.i(f67696b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0689a.a(s.i(f67696b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67696b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getStorageEncryptionStatus", com.xinzhu.overmind.client.hook.common.d.f67577f, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new a());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getProfileOwnerName", ""));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getDeviceOwnerName", ""));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("isDeviceProvisioned", Boolean.TRUE));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getFactoryResetProtectionPolicy", null));
    }
}
