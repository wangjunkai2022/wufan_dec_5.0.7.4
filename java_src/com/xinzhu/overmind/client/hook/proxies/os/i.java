package com.xinzhu.overmind.client.hook.proxies.os;

import com.xinzhu.haunted.android.app.usage.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: UsageStatsManagerStub.java */
/* loaded from: classes.dex */
public class i extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67706b = "usagestats";

    public i() {
        super(s.i(f67706b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0695a.a(s.i(f67706b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67706b);
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
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("queryEventsForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("queryEventsForPackageForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setAppInactive", com.xinzhu.overmind.client.hook.common.d.f67576e, 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isAppInactive", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("reportChooserSelection", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getAppStandbyBucket", com.xinzhu.overmind.client.hook.common.d.f67576e, 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setAppStandbyBucket", com.xinzhu.overmind.client.hook.common.d.f67576e, 2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getAppStandbyBuckets", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setAppStandbyBuckets", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("registerAppUsageObserver", null));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("unregisterAppUsageObserver", null));
    }
}
