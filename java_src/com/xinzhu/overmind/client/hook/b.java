package com.xinzhu.overmind.client.hook;

import com.xinzhu.overmind.utils.helpers.g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ClassInvocationStub.java */
/* loaded from: classes.dex */
public abstract class b implements InvocationHandler, d {
    public static final String TAG = b.class.getSimpleName();
    private Object mBase;
    private Map<String, e> mMethodHookMap = new HashMap();
    private Object mProxyInvocation;

    private void log(Method method, Object[] objArr, Object obj, String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addMethodHook(e eVar) {
        this.mMethodHookMap.put(eVar.c(), eVar);
    }

    protected boolean enableLog() {
        return false;
    }

    protected Object getBase() {
        return this.mBase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object getProxyInvocation() {
        return this.mProxyInvocation;
    }

    protected abstract Object getWho();

    protected abstract void inject(Object obj, Object obj2);

    @Override // com.xinzhu.overmind.client.hook.d
    public void injectHook() {
        Object who = getWho();
        this.mBase = who;
        if (who == null) {
            String str = TAG;
            com.xinzhu.overmind.b.c(str, "injectHook failed " + this);
            return;
        }
        Object newProxyInstance = Proxy.newProxyInstance(who.getClass().getClassLoader(), g.a(this.mBase.getClass()), this);
        this.mProxyInvocation = newProxyInstance;
        inject(this.mBase, newProxyInstance);
        onBindMethod();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        e eVar = this.mMethodHookMap.get(method.getName());
        if (eVar != null && method.getName().equals(eVar.c())) {
            log(method, objArr, null, "beforeHook");
            Object b5 = eVar.b(this.mBase, method, objArr);
            if (b5 != null) {
                return b5;
            }
            Object a5 = eVar.a(eVar.d(this.mBase, method, objArr));
            log(method, objArr, a5, "afterHook");
            return a5;
        }
        try {
            log(method, objArr, null, "beforeHook");
            Object invoke = method.invoke(this.mBase, objArr);
            log(method, objArr, invoke, "afterHook");
            return invoke;
        } catch (Throwable th) {
            throw th.getCause();
        }
    }

    protected abstract void onBindMethod();
}
