package com.xinzhu.overmind.client.hook.proxies.os;

import com.xinzhu.haunted.android.os.n;
import com.xinzhu.haunted.android.os.o;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: VibratorServiceStub.java */
/* loaded from: classes.dex */
public class k extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67707b;

    static {
        f67707b = com.xinzhu.overmind.utils.e.h() ? "vibrator_manager" : "vibrator";
    }

    public k() {
        super(s.i(f67707b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return com.xinzhu.overmind.utils.e.h() ? n.a.a(s.i(f67707b)) : o.a.a(s.i(f67707b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67707b);
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.c(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("vibrate", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("vibratePattern", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("vibrateMagnitude", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("vibratePatternMagnitude", 0));
    }
}
