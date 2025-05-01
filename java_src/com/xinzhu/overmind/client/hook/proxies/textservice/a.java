package com.xinzhu.overmind.client.hook.proxies.textservice;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.textservice.a;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
import com.xinzhu.overmind.utils.e;
/* compiled from: TextServicesManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67730b = "textservices";

    public a() {
        super(s.i(f67730b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0716a.a(s.i(f67730b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67730b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        if (e.f()) {
            addMethodHook(new d("getCurrentSpellChecker", d.f67576e, 0));
            addMethodHook(new d("getCurrentSpellCheckerSubtype", d.f67576e, 0));
            addMethodHook(new d("getSpellCheckerService", d.f67576e, 0));
            addMethodHook(new d("finishSpellCheckerService", d.f67576e, 0));
            addMethodHook(new d("isSpellCheckerEnabled", d.f67576e, 0));
            addMethodHook(new d("getEnabledSpellCheckers", d.f67576e, 0));
        }
    }
}
