package com.xinzhu.overmind.client.hook.proxies.net;

import com.xinzhu.haunted.android.net.b;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
/* compiled from: NetworkScoreStub.java */
/* loaded from: classes.dex */
public class c extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67689b = "network_score";

    public c() {
        super(s.i(f67689b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return b.a.a(s.i(f67689b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67689b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getActiveScorerPackage", null));
    }
}
