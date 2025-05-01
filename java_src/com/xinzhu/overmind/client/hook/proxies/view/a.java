package com.xinzhu.overmind.client.hook.proxies.view;

import android.content.ComponentName;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.android.view.a;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.e;
import com.xinzhu.overmind.client.f;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
import java.lang.reflect.Method;
/* compiled from: AutofillManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67731b = "AutofillManagerStub";

    /* compiled from: AutofillManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0744a extends d {
        C0744a(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.d(objArr);
            return super.d(obj, method, objArr);
        }
    }

    /* compiled from: AutofillManagerStub.java */
    /* loaded from: classes.dex */
    class b extends d {
        b(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.d(objArr);
            return super.d(obj, method, objArr);
        }
    }

    public a() {
        super(s.i("autofill"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object[] objArr) {
        if (objArr != null) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                if (objArr[i4] != null && (objArr[i4] instanceof ComponentName)) {
                    objArr[i4] = new ComponentName(e.getClientConfig().f67770j ? Overmind.getPluginPkg() : Overmind.getHostPkg(), f.e(e.getVPid()));
                }
            }
        }
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0707a.a(s.i("autofill"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("autofill");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new C0744a("addClient", d.f67576e, com.xinzhu.overmind.utils.e.f() ? 2 : d.f67578g));
        addMethodHook(new d("removeClient", d.f67576e, d.f67578g));
        addMethodHook(new b("startSession", d.f67576e, 5));
        addMethodHook(new d("updateSession", d.f67576e, d.f67578g));
        addMethodHook(new d("setAutofillFailure", d.f67576e, d.f67578g));
        addMethodHook(new d("finishSession", d.f67576e, d.f67578g));
        addMethodHook(new d("cancelSession", d.f67576e, d.f67578g));
        addMethodHook(new d("setAuthenticationResult", d.f67576e, d.f67578g));
        addMethodHook(new d("setHasCallback", d.f67576e, 1));
        addMethodHook(new d("disableOwnedAutofillServices", d.f67576e, 0));
        addMethodHook(new d("isServiceSupported", d.f67576e, 0));
        addMethodHook(new d("isServiceEnabled", d.f67577f, 0));
    }
}
