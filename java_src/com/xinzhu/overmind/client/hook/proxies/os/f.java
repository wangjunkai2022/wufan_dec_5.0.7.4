package com.xinzhu.overmind.client.hook.proxies.os;

import android.os.WorkSource;
import com.xinzhu.haunted.android.os.j;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PowerManagerStub.java */
/* loaded from: classes.dex */
public class f extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    static final String f67699b = "power";

    /* compiled from: PowerManagerStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.common.d {
        a(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int l4 = com.xinzhu.overmind.utils.d.l(objArr, WorkSource.class);
            if (l4 >= 0) {
                objArr[l4] = null;
            }
            try {
                return super.d(obj, method, objArr);
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    /* compiled from: PowerManagerStub.java */
    /* loaded from: classes.dex */
    class b extends com.xinzhu.overmind.client.hook.common.d {
        b(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int l4 = com.xinzhu.overmind.utils.d.l(objArr, WorkSource.class);
            if (l4 >= 0) {
                objArr[l4] = null;
            }
            int intValue = ((Integer) objArr[objArr.length - 1]).intValue();
            if (intValue == com.xinzhu.overmind.client.e.getBaseVUid() || intValue == com.xinzhu.overmind.client.e.getVUid()) {
                objArr[objArr.length - 1] = Integer.valueOf(Overmind.getHostUid());
            }
            try {
                return super.d(obj, method, objArr);
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    public f() {
        super(s.i(f67699b));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return j.a.a(s.i(f67699b));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67699b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a("acquireWakeLock", 3, com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new b("acquireWakeLockWithUid", 3, com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("updateWakeLockWorkSource", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("wakeUp", com.xinzhu.overmind.client.hook.common.d.f67578g, com.xinzhu.overmind.client.hook.common.d.f67576e));
    }
}
