package com.xinzhu.overmind.client.hook.proxies.os;

import android.os.Bundle;
import com.xinzhu.haunted.android.os.l;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: SystemUpdateManagerStub.java */
/* loaded from: classes.dex */
public class h extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67703b = "system_update";

    /* compiled from: SystemUpdateManagerStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.e {

        /* renamed from: b  reason: collision with root package name */
        public static final String f67704b = "status";

        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "retrieveSystemUpdateInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Bundle bundle = new Bundle();
            bundle.putInt("status", 0);
            return bundle;
        }
    }

    public h() {
        super(s.i(f67703b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return l.a.a(s.i(f67703b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67703b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("updateSystemUpdateInfo", null));
    }
}
