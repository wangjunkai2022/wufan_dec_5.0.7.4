package com.xinzhu.overmind.client.hook.proxies.net;

import com.xinzhu.haunted.android.net.c;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import com.xinzhu.overmind.utils.t;
import java.lang.reflect.Method;
/* compiled from: TetheringConnectorStub.java */
/* loaded from: classes.dex */
public class d extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67690b = "tethering";

    /* renamed from: c  reason: collision with root package name */
    public static final int f67691c = 3;

    /* compiled from: TetheringConnectorStub.java */
    /* loaded from: classes.dex */
    static class a extends e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "isTetheringSupported";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                t.m(objArr[2].getClass()).k("onResult", Integer.TYPE).call("onResult", 3);
                return null;
            } catch (Throwable unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    public d() {
        super(s.i(f67690b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return c.a.a(s.i(f67690b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67690b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a());
    }
}
