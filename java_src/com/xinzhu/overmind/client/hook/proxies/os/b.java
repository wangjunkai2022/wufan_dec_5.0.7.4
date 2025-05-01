package com.xinzhu.overmind.client.hook.proxies.os;

import com.xinzhu.haunted.android.os.g;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.utils.p;
import java.lang.reflect.Method;
/* compiled from: DeviceIdentifiersPolicyStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* compiled from: DeviceIdentifiersPolicyStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getSerialForPackage";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return p.d(Overmind.getHostPkg());
        }
    }

    public b() {
        super(s.i("device_identifiers"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return g.a.a(s.i("device_identifiers"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("device_identifiers");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a());
    }
}
