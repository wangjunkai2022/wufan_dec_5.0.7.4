package com.xinzhu.overmind.client.hook.proxies.display;

import android.os.IInterface;
import com.xinzhu.overmind.client.hook.b;
import com.xinzhu.overmind.client.hook.e;
import com.xinzhu.overmind.utils.helpers.c;
import java.lang.reflect.Method;
/* compiled from: DisplayManagerStub.java */
/* loaded from: classes.dex */
public class a extends b {

    /* compiled from: DisplayManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.display.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0733a extends e {
        C0733a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "createVirtualDisplay";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            c.d(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return new com.xinzhu.haunted.android.hardware.display.a(com.xinzhu.haunted.android.hardware.display.a.c()).d() != getProxyInvocation();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return new com.xinzhu.haunted.android.hardware.display.a(com.xinzhu.haunted.android.hardware.display.a.c()).d();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        new com.xinzhu.haunted.android.hardware.display.a(com.xinzhu.haunted.android.hardware.display.a.c()).e((IInterface) getProxyInvocation());
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void onBindMethod() {
        addMethodHook(new C0733a());
    }
}
