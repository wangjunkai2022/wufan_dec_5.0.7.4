package com.xinzhu.overmind.client.hook.proxies.os;

import android.os.IInterface;
import android.os.UserManager;
import com.umeng.analytics.pro.aw;
import com.xinzhu.haunted.android.content.pm.p;
import com.xinzhu.haunted.android.os.m;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.android.os.x;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.util.Collections;
import java.util.Objects;
/* compiled from: UserManagerStub.java */
/* loaded from: classes.dex */
public class j extends BinderInvocationStub {
    public j() {
        super(s.i(aw.f63382m));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return m.a.a(s.i(aw.f63382m));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        x xVar = new x((UserManager) Overmind.getContext().getSystemService(aw.f63382m));
        if (xVar.a()) {
            xVar.c((IInterface) getProxyInvocation());
        }
        replaceSystemService(aw.f63382m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isProfile", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isManagedProfile", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isUserUnlocked", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isUserUnlockingOrUnlocked", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getProfileParent", null));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getProfileType", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        p c5 = p.c(0, "Admin", p.d());
        Objects.requireNonNull(c5);
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getUsers", Collections.singletonList(c5.f66594a)));
        p c6 = p.c(0, "Admin", p.d());
        Objects.requireNonNull(c6);
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getUserInfo", c6.f66594a));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getApplicationRestrictions", 0, com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setApplicationRestrictions", 0, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getApplicationRestrictionsForUser", 0, com.xinzhu.overmind.client.hook.common.d.f67578g));
    }
}
