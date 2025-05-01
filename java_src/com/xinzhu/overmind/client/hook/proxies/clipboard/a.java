package com.xinzhu.overmind.client.hook.proxies.clipboard;

import android.content.ClipboardManager;
import android.os.IInterface;
import com.xinzhu.haunted.android.content.d;
import com.xinzhu.haunted.android.content.i;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Method;
/* compiled from: ClipboardStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {
    public a() {
        super(s.i("clipboard"));
    }

    private static IInterface c() {
        d dVar = new d((ClipboardManager) Overmind.getContext().getSystemService("clipboard"));
        if (dVar.a()) {
            return dVar.c();
        }
        if (d.b()) {
            return d.d();
        }
        return null;
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        d dVar = new d((ClipboardManager) Overmind.getContext().getSystemService("clipboard"));
        return (dVar.a() && dVar.c() != getProxyInvocation()) || s.i("clipboard") != this;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return i.a.a(s.i("clipboard"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        d dVar = new d((ClipboardManager) Overmind.getContext().getSystemService("clipboard"));
        if (dVar.a()) {
            dVar.e((IInterface) getProxyInvocation());
        } else if (d.b()) {
            d.f((IInterface) getProxyInvocation());
        }
        replaceSystemService("clipboard");
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        if (e.k()) {
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("addPrimaryClipChangedListener", com.xinzhu.overmind.client.hook.common.d.f67577f, 3));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getPrimaryClipDescription", com.xinzhu.overmind.client.hook.common.d.f67577f, 2));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("removePrimaryClipChangedListener", com.xinzhu.overmind.client.hook.common.d.f67577f, 3));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("hasClipboardText", com.xinzhu.overmind.client.hook.common.d.f67577f, 2));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getPrimaryClip", com.xinzhu.overmind.client.hook.common.d.f67577f, 2));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setPrimaryClip", com.xinzhu.overmind.client.hook.common.d.f67577f, 3));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("clearPrimaryClip", com.xinzhu.overmind.client.hook.common.d.f67577f, 2));
            return;
        }
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("addPrimaryClipChangedListener", com.xinzhu.overmind.client.hook.common.d.f67577f, e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getPrimaryClipDescription", com.xinzhu.overmind.client.hook.common.d.f67577f, e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("removePrimaryClipChangedListener", com.xinzhu.overmind.client.hook.common.d.f67577f, e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("hasClipboardText", com.xinzhu.overmind.client.hook.common.d.f67577f, e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getPrimaryClip", com.xinzhu.overmind.client.hook.common.d.f67577f, e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setPrimaryClip", com.xinzhu.overmind.client.hook.common.d.f67577f, e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("clearPrimaryClip", com.xinzhu.overmind.client.hook.common.d.f67577f, e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
    }
}
