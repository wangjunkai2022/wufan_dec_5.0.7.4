package com.xinzhu.overmind.client.hook.proxies.os;

import android.os.DropBoxManager;
import android.os.IInterface;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.os.a;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: DropBoxManagerStub.java */
/* loaded from: classes.dex */
public class e extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67698b = "dropbox";

    public e() {
        super(s.i(f67698b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0713a.a(s.i(f67698b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        com.xinzhu.haunted.android.os.b bVar = new com.xinzhu.haunted.android.os.b((DropBoxManager) Overmind.getContext().getSystemService(f67698b));
        if (bVar.a()) {
            bVar.c((IInterface) obj2);
        }
        replaceSystemService(f67698b);
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("asBinder")) {
            return super.invoke(obj, method, objArr);
        }
        return com.xinzhu.overmind.utils.helpers.f.a(method.getReturnType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
    }
}
