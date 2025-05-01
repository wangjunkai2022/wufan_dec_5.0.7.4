package com.xinzhu.overmind.client.hook.proxies.am;

import com.xinzhu.haunted.android.app.f;
import com.xinzhu.haunted.android.app.n;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.proxies.am.d;
import com.xinzhu.overmind.utils.e;
/* compiled from: ActivityTaskManagerStub.java */
/* loaded from: classes.dex */
public class c extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67646b = "ActivityTaskManager";

    public c() {
        super(s.i("activity_task"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return n.a.a(s.i("activity_task"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("activity_task");
        new com.xinzhu.haunted.android.util.b(f.d()).e(obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        addMethodHook(new d.o());
        addMethodHook(new d.n());
        addMethodHook(new d.a());
        addMethodHook(new d.b());
        addMethodHook(new d.c());
        addMethodHook(new d.C0727d());
        addMethodHook(new d.f());
        addMethodHook(new d.g());
        addMethodHook(new d.s());
        addMethodHook(new d.p());
        addMethodHook(new d.r());
        addMethodHook(new d.t());
        addMethodHook(new d.q());
        addMethodHook(new d.l());
        addMethodHook(new d.e());
        addMethodHook(new d.k());
        addMethodHook(new d.h());
        addMethodHook(new d.i());
        addMethodHook(new d.j());
        addMethodHook(new d.m());
        if (e.t()) {
            addMethodHook(new com.xinzhu.overmind.client.hook.common.b("startAppLockService"));
        }
    }
}
