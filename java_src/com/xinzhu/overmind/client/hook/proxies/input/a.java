package com.xinzhu.overmind.client.hook.proxies.input;

import android.os.IInterface;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.view.a;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Method;
/* compiled from: InputMethodManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67683b = "input_method";

    public a() {
        super(s.i(f67683b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0717a.a(s.i(f67683b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        com.xinzhu.haunted.android.inputmethod.a aVar = new com.xinzhu.haunted.android.inputmethod.a((InputMethodManager) Overmind.getContext().getSystemService(f67683b));
        if (aVar.a()) {
            aVar.c((IInterface) obj2);
        }
        if (e.k() && com.xinzhu.haunted.android.view.inputmethod.a.a()) {
            com.xinzhu.haunted.android.view.inputmethod.a.c(obj2);
        }
        replaceSystemService(f67683b);
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 instanceof EditorInfo) {
                    ((EditorInfo) obj2).packageName = Overmind.getHostPkg();
                }
            }
        }
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new d("getInputMethodList", d.f67576e, 0));
        addMethodHook(new d("getEnabledInputMethodList", d.f67576e, 0));
        if (e.k()) {
            addMethodHook(new d("startInputOrWindowGainedFocus", d.f67576e, 10));
            addMethodHook(new d("isStylusHandwritingAvailableAsUser", d.f67576e, 0));
            addMethodHook(new d("getCurrentInputMethodInfoAsUser", d.f67576e, 0));
            addMethodHook(new d("getEnabledInputMethodSubtypeList", d.f67576e, d.f67578g));
            addMethodHook(new d("acceptStylusHandwritingDelegation", d.f67577f, 1));
            addMethodHook(new d("prepareStylusHandwritingDelegation", d.f67577f, 1));
            addMethodHook(new d("prepareStylusHandwritingDelegation", d.f67577f, 1));
            addMethodHook(new d("getCurrentInputMethodSubtype", d.f67576e, 0));
            addMethodHook(new d("setAdditionalInputMethodSubtypes", d.f67576e, d.f67578g));
            addMethodHook(new d("setExplicitlyEnabledInputMethodSubtypes", d.f67576e, d.f67578g));
            addMethodHook(new d("getLastInputMethodSubtype", d.f67576e, 0));
        }
    }
}
