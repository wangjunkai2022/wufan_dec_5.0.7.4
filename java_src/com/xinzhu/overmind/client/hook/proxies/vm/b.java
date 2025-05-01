package com.xinzhu.overmind.client.hook.proxies.vm;

import android.annotation.SuppressLint;
import android.os.IInterface;
import android.view.WindowManager;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import com.xinzhu.overmind.utils.helpers.c;
import java.lang.reflect.Method;
/* compiled from: WindowSessionStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* renamed from: c  reason: collision with root package name */
    public static final String f67735c = "WindowSessionStub";

    /* renamed from: b  reason: collision with root package name */
    private IInterface f67736b;

    /* compiled from: WindowSessionStub.java */
    /* loaded from: classes6.dex */
    public static class a extends e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addToDisplay";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    if (obj2 != null && (obj2 instanceof WindowManager.LayoutParams)) {
                        ((WindowManager.LayoutParams) obj2).packageName = Overmind.getHostPkg();
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: WindowSessionStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.vm.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0746b extends a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.vm.b.a, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addToDisplayAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.vm.b.a, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int i4;
            if (com.xinzhu.overmind.utils.e.h()) {
                i4 = 4;
            } else {
                i4 = com.xinzhu.overmind.utils.e.g() ? 5 : -1;
            }
            e(objArr, i4);
            return super.d(obj, method, objArr);
        }
    }

    public b(IInterface iInterface) {
        super(iInterface.asBinder());
        this.f67736b = iInterface;
    }

    @SuppressLint({"InlinedApi"})
    public static void c(WindowManager.LayoutParams layoutParams) {
        int i4 = layoutParams.type;
        if ((i4 == 2002 || i4 == 2003 || i4 == 2006 || i4 == 2007 || i4 == 2010 || i4 == 2038) && com.xinzhu.overmind.utils.e.w()) {
            layoutParams.type = 2038;
        }
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    public Object getProxyInvocation() {
        return super.getProxyInvocation();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return this.f67736b;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        int a5;
        if (objArr != null && objArr.length != 0 && (a5 = c.a(objArr, WindowManager.LayoutParams.class)) > 0) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) objArr[a5];
            c(layoutParams);
            objArr[a5] = layoutParams;
        }
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a());
        addMethodHook(new C0746b());
    }
}
