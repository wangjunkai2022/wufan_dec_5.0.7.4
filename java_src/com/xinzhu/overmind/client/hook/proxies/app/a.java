package com.xinzhu.overmind.client.hook.proxies.app;

import android.os.WorkSource;
import androidx.core.app.NotificationCompat;
import com.xinzhu.haunted.android.app.o;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: AlarmManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* compiled from: AlarmManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0728a extends com.xinzhu.overmind.client.hook.common.d {
        C0728a(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int l4 = com.xinzhu.overmind.utils.d.l(objArr, WorkSource.class);
            if (l4 >= 0) {
                objArr[l4] = null;
            }
            return super.d(obj, method, objArr);
        }
    }

    public a() {
        super(s.i(NotificationCompat.CATEGORY_ALARM));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return o.a.a(s.i(NotificationCompat.CATEGORY_ALARM));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new C0728a("set", com.xinzhu.overmind.client.hook.common.d.f67577f, com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getNextAlarmClock", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
    }
}
