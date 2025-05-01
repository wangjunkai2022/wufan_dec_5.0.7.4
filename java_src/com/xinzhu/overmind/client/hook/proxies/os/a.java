package com.xinzhu.overmind.client.hook.proxies.os;

import android.os.Build;
import android.os.IInterface;
import android.os.health.SystemHealthManager;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.com.android.internal.app.b;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
/* compiled from: BatteryStatsStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67693b = "batterystats";

    public a() {
        super(s.i(f67693b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return b.a.a(s.i(f67693b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 24) {
            com.xinzhu.haunted.android.os.health.a aVar = new com.xinzhu.haunted.android.os.health.a((SystemHealthManager) Overmind.getContext().getSystemService("systemhealth"));
            if (aVar.a()) {
                aVar.c((IInterface) obj2);
            }
        }
        replaceSystemService(f67693b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("takeUidSnapshot", 0));
    }
}
