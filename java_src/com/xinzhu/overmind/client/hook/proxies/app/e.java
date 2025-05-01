package com.xinzhu.overmind.client.hook.proxies.app;

import com.xinzhu.haunted.android.app.s;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
/* compiled from: UriGrantsManagerStub.java */
/* loaded from: classes.dex */
public class e extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67662b = "uri_grants";

    public e() {
        super(s.i(f67662b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return s.a.a(com.xinzhu.haunted.android.os.s.i(f67662b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67662b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("takePersistableUriPermission", 2, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("releasePersistableUriPermission", 2, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getGrantedUriPermissions", 0, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("clearGrantedUriPermissions", 0, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getUriPermissions", 0, com.xinzhu.overmind.client.hook.common.d.f67576e));
    }
}
