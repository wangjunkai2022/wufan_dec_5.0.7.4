package com.xinzhu.overmind.client.hook.proxies.role;

import com.xinzhu.haunted.android.app.role.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
/* compiled from: RoleManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67718b = "role";

    public a() {
        super(s.i(f67718b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0692a.a(s.i(f67718b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67718b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new d("isRoleHeld", d.f67577f, d.f67576e));
        addMethodHook(new d("getRoleHoldersAsUser", d.f67576e, 1));
        addMethodHook(new d("addRoleHolderAsUser", d.f67577f, 3));
        addMethodHook(new d("removeRoleHolderAsUser", d.f67577f, 3));
        addMethodHook(new d("clearRoleHoldersAsUser", d.f67576e, 2));
        addMethodHook(new d("addOnRoleHoldersChangedListenerAsUser", d.f67576e, 1));
        addMethodHook(new d("removeOnRoleHoldersChangedListenerAsUser", d.f67576e, 1));
        addMethodHook(new d("addRoleHolderFromController", d.f67577f, d.f67576e));
        addMethodHook(new d("removeRoleHolderFromController", d.f67577f, d.f67576e));
        addMethodHook(new d("getHeldRolesFromController", d.f67577f, d.f67576e));
        addMethodHook(new d("getDefaultSmsPackage", d.f67576e, 0));
    }
}
