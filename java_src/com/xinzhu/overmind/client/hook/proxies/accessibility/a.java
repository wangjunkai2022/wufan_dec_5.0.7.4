package com.xinzhu.overmind.client.hook.proxies.accessibility;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.android.view.accessibility.a;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
import com.xinzhu.overmind.utils.e;
/* compiled from: AccessibilityManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {
    public a() {
        super(s.i("accessibility"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0708a.a(s.i("accessibility"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new d("interrupt", d.f67576e, d.f67578g));
        addMethodHook(new d("sendAccessibilityEvent", d.f67576e, d.f67578g));
        addMethodHook(new d("addClient", d.f67576e, d.f67578g));
        addMethodHook(new d("getInstalledAccessibilityServiceList", d.f67576e, d.f67578g));
        addMethodHook(new d("getEnabledAccessibilityServiceList", d.f67576e, d.f67578g));
        addMethodHook(new d("addAccessibilityInteractionConnection", d.f67576e, d.f67578g));
        addMethodHook(new d("getWindowToken", d.f67576e, d.f67578g));
        addMethodHook(new d("removeClient", d.f67576e, d.f67578g));
        if (e.k()) {
            addMethodHook(new d("setAccessibilityWindowAttributes", d.f67576e, 2));
        }
    }
}
