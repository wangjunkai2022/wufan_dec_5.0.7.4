package com.xinzhu.overmind.client.hook.proxies.pm;

import android.content.Intent;
import com.xinzhu.haunted.android.content.pm.f;
import com.xinzhu.haunted.android.content.pm.k;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Method;
/* compiled from: ShortcutManagerStub.java */
/* loaded from: classes.dex */
public class d extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ boolean f67717b = false;

    public d() {
        super(s.i("shortcut"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return f.a.a(s.i("shortcut"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("shortcut");
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
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("updateShortcuts", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("requestPinShortcut", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("disableShortcuts", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("enableShortcuts", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("removeDynamicShortcuts", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("removeAllDynamicShortcuts", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("removeLongLivedShortcuts", 0));
        if (e.h() && !e.j()) {
            com.xinzhu.haunted.com.android.internal.infra.a e5 = com.xinzhu.haunted.com.android.internal.infra.a.e();
            e5.d(Boolean.FALSE);
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("requestPinShortcut", e5.f67301a));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("setDynamicShortcuts", e5.f67301a));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("addDynamicShortcuts", e5.f67301a));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("pushDynamicShortcut", e5.f67301a));
            com.xinzhu.haunted.com.android.internal.infra.a e6 = com.xinzhu.haunted.com.android.internal.infra.a.e();
            e6.d(new Intent());
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("createShortcutResultIntent", e6.f67301a));
        } else {
            Boolean bool = Boolean.TRUE;
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("addDynamicShortcuts", bool));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("setDynamicShortcuts", bool));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("requestPinShortcut", bool));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("pushDynamicShortcut", bool));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("createShortcutResultIntent", new Intent()));
        }
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getShortcuts", k.e()));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getShareTargets", k.e()));
        Boolean bool2 = Boolean.FALSE;
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("hasShareTargets", bool2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getMaxShortcutCountPerActivity", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getRemainingCallCount", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getRateLimitResetTime", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getIconMaxDimensions", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("reportShortcutUsed", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("isRequestPinItemSupported", bool2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("onApplicationActive", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getBackupPayload", null));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("applyRestore", 0));
    }
}
