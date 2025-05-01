package com.xinzhu.overmind.client.hook.proxies.location;

import com.xinzhu.haunted.android.hardware.location.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.c;
import com.xinzhu.overmind.utils.e;
/* compiled from: ContextHubStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67686b;

    static {
        f67686b = e.w() ? "contexthub" : "contexthub_service";
    }

    public a() {
        super(s.i(f67686b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0697a.a(s.i(f67686b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67686b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new c("getContextHubHandles", new int[0]));
        addMethodHook(new c("getContextHubInfo", null));
        addMethodHook(new c("loadNanoApp", 0));
        addMethodHook(new c("unloadNanoApp", 0));
        addMethodHook(new c("getNanoAppInstanceInfo", null));
        addMethodHook(new c("findNanoAppOnHub", new int[0]));
        addMethodHook(new c("sendMessage", 0));
        addMethodHook(new c("getContextHubs", null));
        addMethodHook(new c("loadNanoAppOnHub", null));
        addMethodHook(new c("unloadNanoAppFromHub", null));
        addMethodHook(new c("enableNanoApp", null));
        addMethodHook(new c("disableNanoApp", null));
        addMethodHook(new c("queryNanoApps", null));
        addMethodHook(new c("createClient", null));
        addMethodHook(new c("createPendingIntentClient", null));
        addMethodHook(new c("registerCallback", 0));
    }
}
