package com.xinzhu.overmind.client.hook.proxies.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.IBinder;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import com.xinzhu.haunted.android.app.b;
import com.xinzhu.haunted.android.app.g;
import com.xinzhu.haunted.android.app.m;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.stub.record.StubActivityRecord;
import com.xinzhu.overmind.server.pm.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: HCallbackStub.java */
/* loaded from: classes.dex */
public class b implements com.xinzhu.overmind.client.hook.d, Handler.Callback {

    /* renamed from: d  reason: collision with root package name */
    public static final String f67649d = "HCallbackStub";

    /* renamed from: b  reason: collision with root package name */
    private Handler.Callback f67650b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f67651c = new AtomicBoolean(false);

    private Handler b() {
        return new g(Overmind.mainThread()).V();
    }

    private Handler.Callback c() {
        return new com.xinzhu.haunted.android.os.e(b()).b();
    }

    private Object d(Object obj) {
        for (Object obj2 : new com.xinzhu.haunted.android.app.servertransaction.a(obj).d()) {
            if (com.xinzhu.haunted.android.app.servertransaction.b.f66101c.getName().equals(obj2.getClass().getCanonicalName())) {
                return obj2;
            }
        }
        return null;
    }

    private boolean e(Object obj) {
        Intent j4;
        IBinder l4;
        StubActivityRecord create;
        ActivityInfo activityInfo;
        Object d5 = com.xinzhu.overmind.utils.e.y() ? d(obj) : obj;
        if (d5 == null) {
            return false;
        }
        com.xinzhu.haunted.android.app.servertransaction.b bVar = null;
        if (com.xinzhu.overmind.utils.e.y()) {
            bVar = new com.xinzhu.haunted.android.app.servertransaction.b(d5);
            j4 = bVar.f();
            l4 = new com.xinzhu.haunted.android.app.servertransaction.a(obj).e();
        } else {
            g.a aVar = new g.a(d5);
            j4 = aVar.j();
            l4 = aVar.l();
        }
        if (j4 != null && (activityInfo = (create = StubActivityRecord.create(j4)).mActivityInfo) != null) {
            if (com.xinzhu.overmind.client.e.getClientConfig() == null) {
                Overmind.getMindActivityManager().v(activityInfo.packageName, activityInfo.processName, create.mUserId);
                return true;
            } else if (!com.xinzhu.overmind.client.e.getClient().isInit()) {
                com.xinzhu.overmind.client.e.getClient().bindApplication(activityInfo.packageName, activityInfo.processName);
                return true;
            } else {
                activityInfo.applicationInfo = j.b(activityInfo.applicationInfo);
                Overmind.getMindActivityManager().l(!com.xinzhu.overmind.utils.e.k() ? new m(com.xinzhu.haunted.android.app.d.c()).k(l4, false) : 0, l4, create.mActivityRecord);
                if (com.xinzhu.overmind.utils.e.y()) {
                    bVar.i(create.mTarget);
                    bVar.h(activityInfo);
                    g gVar = new g(Overmind.mainThread());
                    if (com.xinzhu.overmind.utils.e.h()) {
                        if (!com.xinzhu.overmind.utils.e.j()) {
                            if (gVar.s(l4)) {
                                Object N = gVar.N(l4);
                                if (N != null) {
                                    g.a aVar2 = new g.a(N);
                                    Object O = gVar.O(activityInfo.applicationInfo, aVar2.i());
                                    aVar2.p(create.mTarget);
                                    aVar2.n(activityInfo);
                                    aVar2.q(O);
                                }
                            } else {
                                throw new RuntimeException("break circle");
                            }
                        }
                        if (bVar.a()) {
                            if (bVar.d() != null) {
                                new b.a(com.xinzhu.haunted.android.app.b.d()).c(com.xinzhu.overmind.client.hook.proxies.am.a.f67640b);
                            }
                        } else {
                            throw new RuntimeException("break circle");
                        }
                    }
                } else {
                    g.a aVar3 = new g.a(d5);
                    aVar3.p(create.mTarget);
                    aVar3.n(activityInfo);
                }
            }
        }
        return false;
    }

    @SuppressLint({"BlockedPrivateApi"})
    private void f() {
        if (com.xinzhu.overmind.utils.e.h()) {
            try {
                Method declaredMethod = Class.forName(InstrumentationProxy.f64868d).getDeclaredMethod("getLaunchingActivity", IBinder.class);
                Field declaredField = Class.forName("android.app.servertransaction.LaunchActivityItem").getDeclaredField("mActivityClientController");
                com.xinzhu.overmind.b.c(f67649d, "reflectTrickForAndroid12 get " + declaredMethod + " " + declaredField);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        Handler.Callback c5 = c();
        return (c5 == null || c5 == this) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0018, B:10:0x0025, B:15:0x002f, B:17:0x0035, B:19:0x003b, B:22:0x0043, B:24:0x004b, B:26:0x0053, B:34:0x0080, B:36:0x0084, B:29:0x0064, B:31:0x006c, B:33:0x0074), top: B:45:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[DONT_GENERATE] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(@androidx.annotation.NonNull android.os.Message r6) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f67651c
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            r2 = 0
            if (r0 != 0) goto L9b
            boolean r0 = com.xinzhu.overmind.utils.e.y()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L64
            int r0 = r6.what     // Catch: java.lang.Throwable -> L94
            int r3 = com.xinzhu.haunted.android.app.g.d.d()     // Catch: java.lang.Throwable -> L94
            if (r0 != r3) goto L80
            com.xinzhu.haunted.android.app.servertransaction.a r0 = new com.xinzhu.haunted.android.app.servertransaction.a     // Catch: java.lang.Throwable -> L94
            java.lang.Object r3 = r6.obj     // Catch: java.lang.Throwable -> L94
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L94
            boolean r3 = com.xinzhu.overmind.utils.e.k()     // Catch: java.lang.Throwable -> L94
            if (r3 != 0) goto L2e
            android.os.IBinder r3 = r0.e()     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L2c
            goto L2e
        L2c:
            r3 = 0
            goto L2f
        L2e:
            r3 = 1
        L2f:
            java.util.List r0 = r0.d()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L80
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L94
            if (r4 != 0) goto L80
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L80
            if (r3 == 0) goto L80
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L94
            java.lang.Class<?> r3 = com.xinzhu.haunted.android.app.servertransaction.b.f66101c     // Catch: java.lang.Throwable -> L94
            if (r0 != r3) goto L80
            java.lang.Object r0 = r6.obj     // Catch: java.lang.Throwable -> L94
            boolean r0 = r5.e(r0)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L80
            android.os.Handler r0 = r5.b()     // Catch: java.lang.Throwable -> L94
            android.os.Message r6 = android.os.Message.obtain(r6)     // Catch: java.lang.Throwable -> L94
            r0.sendMessageAtFrontOfQueue(r6)     // Catch: java.lang.Throwable -> L94
        L5e:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f67651c
            r6.set(r2)
            return r1
        L64:
            int r0 = r6.what     // Catch: java.lang.Throwable -> L94
            int r3 = com.xinzhu.haunted.android.app.g.d.e()     // Catch: java.lang.Throwable -> L94
            if (r0 != r3) goto L80
            java.lang.Object r0 = r6.obj     // Catch: java.lang.Throwable -> L94
            boolean r0 = r5.e(r0)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L80
            android.os.Handler r0 = r5.b()     // Catch: java.lang.Throwable -> L94
            android.os.Message r6 = android.os.Message.obtain(r6)     // Catch: java.lang.Throwable -> L94
            r0.sendMessageAtFrontOfQueue(r6)     // Catch: java.lang.Throwable -> L94
            goto L5e
        L80:
            android.os.Handler$Callback r0 = r5.f67650b     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L8e
            boolean r6 = r0.handleMessage(r6)     // Catch: java.lang.Throwable -> L94
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f67651c
            r0.set(r2)
            return r6
        L8e:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f67651c
            r6.set(r2)
            return r2
        L94:
            r6 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f67651c
            r0.set(r2)
            throw r6
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.client.hook.proxies.app.b.handleMessage(android.os.Message):boolean");
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public void injectHook() {
        Handler.Callback c5 = c();
        this.f67650b = c5;
        if (c5 != null && (c5 == this || c5.getClass().getName().equals(getClass().getName()))) {
            this.f67650b = null;
        }
        new com.xinzhu.haunted.android.os.e(b()).c(this);
    }
}
