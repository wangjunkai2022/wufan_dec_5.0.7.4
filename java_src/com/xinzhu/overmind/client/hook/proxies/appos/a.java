package com.xinzhu.overmind.client.hook.proxies.appos;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.AttributionSource;
import android.os.IInterface;
import com.xinzhu.haunted.android.app.h;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.app.a;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.c;
import com.xinzhu.overmind.client.hook.common.d;
import com.xinzhu.overmind.client.hook.fixer.ContextFixer;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Method;
/* compiled from: AppOpsManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* compiled from: AppOpsManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.appos.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0731a extends c {
        C0731a(String str, Object obj) {
            super(str, obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.c, com.xinzhu.overmind.client.hook.e
        @SuppressLint({"NewApi"})
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int a5;
            if (e.h() && (a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, AttributionSource.class)) >= 0) {
                AttributionSource attributionSource = (AttributionSource) objArr[a5];
                ContextFixer.fixAttributionSource(attributionSource);
                objArr[a5] = attributionSource;
                return method.invoke(obj, objArr);
            }
            return super.d(obj, method, objArr);
        }
    }

    public a() {
        super(s.i("appops"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0710a.a(s.i("appops"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        new h((AppOpsManager) Overmind.getContext().getSystemService("appops")).c((IInterface) getProxyInvocation());
        replaceSystemService("appops");
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.d(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("checkOperation", 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("noteOperation", 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("startOperation", 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("finishOperation", 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("checkAudioOperation", 2));
        addMethodHook(new C0731a("noteProxyOperation", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("checkPackage", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("getOpsForPackage", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("getHistoricalOps", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("getHistoricalOpsFromDiskRaw", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("getUidOps", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("setUidMode", 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("setMode", 1));
        addMethodHook(new d("resetAllModes", d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("setAudioRestriction", 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("isOperationActive", 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("checkOperationRaw", 1));
    }
}
