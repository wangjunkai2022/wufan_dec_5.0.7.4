package com.xinzhu.overmind.client.hook.proxies.app;

import android.os.IInterface;
import com.xinzhu.haunted.android.app.v;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.server.DaemonService;
import java.lang.reflect.Method;
/* compiled from: NotificationManagerStub.java */
/* loaded from: classes.dex */
public class d extends BinderInvocationStub {

    /* compiled from: NotificationManagerStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.common.d {
        a(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.client.frameworks.f.a().d(com.xinzhu.overmind.client.e.getVPackageName(), com.xinzhu.overmind.client.e.getUserId());
            com.xinzhu.overmind.b.c(BinderInvocationStub.TAG, "cancelAllNotifications succeed");
            return null;
        }
    }

    /* compiled from: NotificationManagerStub.java */
    /* loaded from: classes.dex */
    class b extends com.xinzhu.overmind.client.hook.common.d {
        b(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String c5 = com.xinzhu.overmind.client.frameworks.f.a().c(com.xinzhu.overmind.client.e.getVPackageName(), com.xinzhu.overmind.client.e.getUserId(), ((Integer) objArr[com.xinzhu.overmind.utils.helpers.c.a(objArr, Integer.class)]).intValue(), (String) objArr[2]);
            if (c5 != null) {
                objArr[2] = c5;
                return super.d(obj, method, objArr);
            }
            throw new RuntimeException(c() + " solve tag get null");
        }
    }

    /* compiled from: NotificationManagerStub.java */
    /* loaded from: classes.dex */
    class c extends com.xinzhu.overmind.client.hook.common.d {
        c(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            char c5 = com.xinzhu.overmind.utils.e.g() ? (char) 3 : (char) 2;
            char c6 = com.xinzhu.overmind.utils.e.g() ? (char) 2 : (char) 1;
            objArr[c6] = com.xinzhu.overmind.client.frameworks.f.a().e(com.xinzhu.overmind.client.e.getVPackageName(), com.xinzhu.overmind.client.e.getUserId(), ((Integer) objArr[c5]).intValue(), (String) objArr[c6]);
            return super.d(obj, method, objArr);
        }
    }

    /* compiled from: NotificationManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0730d extends com.xinzhu.overmind.client.hook.common.d {
        C0730d(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr == null || objArr.length < 2 || !objArr[1].equals(DaemonService.f67834d)) {
                try {
                    return method.invoke(obj, objArr);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: NotificationManagerStub.java */
    /* loaded from: classes.dex */
    class e extends com.xinzhu.overmind.client.hook.common.e {
        e(String str, int i4) {
            super(str, i4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.e, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Boolean.TRUE;
        }
    }

    public d() {
        super(v.c().asBinder());
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return v.c();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        v.e((IInterface) getProxyInvocation());
        replaceSystemService("notification");
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.c(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a("cancelAllNotifications", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new b("enqueueNotificationWithTag", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new c("cancelNotificationWithTag", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new C0730d("deleteNotificationChannel", com.xinzhu.overmind.client.hook.common.d.f67577f, com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getNotificationChannel", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.utils.e.f() ? 1 : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getConversationNotificationChannel", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getNotificationChannels", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.utils.e.f() ? com.xinzhu.overmind.client.hook.common.d.f67578g : com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getBlockedAppCount", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getNotificationChannelsBypassingDnd", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("registerListener", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("unregisterListener", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isNotificationListenerAccessGrantedForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setNotificationListenerAccessGrantedForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setNotificationAssistantAccessGrantedForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getEnabledNotificationListeners", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getAllowedNotificationAssistantForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("setNotificationPolicyAccessGrantedForUser", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getAppActiveNotifications", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("canNotifyAsPackage", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("removeEdgeNotification", com.xinzhu.overmind.client.hook.common.d.f67576e, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new e("hasPackageBeenManaged", com.xinzhu.overmind.client.hook.common.d.f67578g));
    }
}
