package com.xinzhu.overmind.server;

import android.app.Service;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.IBinder;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.stub.record.StubServiceRecord;
import com.xinzhu.overmind.entity.UnbindRecord;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ClientServiceManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f67943c = "ClientServiceManager";

    /* renamed from: d  reason: collision with root package name */
    private static b f67944d = new b();

    /* renamed from: a  reason: collision with root package name */
    private Map<Intent.FilterComparison, com.xinzhu.overmind.client.service.a> f67945a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Service f67946b;

    private com.xinzhu.overmind.client.service.a a(Intent intent) {
        return this.f67945a.get(new Intent.FilterComparison(intent));
    }

    public static b b() {
        return f67944d;
    }

    private Service c(Intent intent, ServiceInfo serviceInfo, boolean z4) {
        com.xinzhu.overmind.client.service.a a5 = a(intent);
        if (a5 == null || a5.g() == null) {
            if (z4) {
                Service createService = com.xinzhu.overmind.client.e.getClient().createService(serviceInfo);
                com.xinzhu.overmind.client.service.a aVar = new com.xinzhu.overmind.client.service.a();
                aVar.n(createService);
                this.f67945a.put(new Intent.FilterComparison(intent), aVar);
                return createService;
            }
            return null;
        }
        return a5.g();
    }

    private void l(Intent intent) {
        this.f67945a.remove(new Intent.FilterComparison(intent));
    }

    public IBinder d(Intent intent) {
        StubServiceRecord create = StubServiceRecord.create(intent);
        Intent intent2 = create.mServiceIntent;
        ServiceInfo serviceInfo = create.mServiceInfo;
        int i4 = create.mFlags;
        if (intent2 != null && serviceInfo != null) {
            if (com.xinzhu.overmind.client.e.getClientConfig() == null) {
                com.xinzhu.overmind.b.a(f67943c, "restarting service " + intent2);
                return null;
            }
            com.xinzhu.overmind.b.a(f67943c, "onBind: " + serviceInfo.toString());
            Service c5 = c(intent2, serviceInfo, (i4 & 1) != 0);
            if (c5 == null) {
                com.xinzhu.overmind.b.a(f67943c, "bind without bind_auto_create flag, ignore: " + intent2);
                return null;
            }
            intent2.setExtrasClassLoader(c5.getClassLoader());
            com.xinzhu.overmind.client.service.a a5 = a(intent2);
            a5.k(intent2);
            if (a5.j(intent2)) {
                if (a5.l()) {
                    c5.onRebind(intent2);
                    a5.m(false);
                }
                return a5.e(intent2);
            }
            try {
                IBinder onBind = c5.onBind(intent2);
                a5.b(intent2, onBind);
                return onBind;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public void e(Configuration configuration) {
        if (this.f67945a.size() > 0) {
            for (com.xinzhu.overmind.client.service.a aVar : this.f67945a.values()) {
                try {
                    aVar.g().onConfigurationChanged(configuration);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void f() {
        if (this.f67945a.size() > 0) {
            for (com.xinzhu.overmind.client.service.a aVar : this.f67945a.values()) {
                try {
                    aVar.g().onDestroy();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        this.f67945a.clear();
    }

    public void g() {
        if (this.f67945a.size() > 0) {
            for (com.xinzhu.overmind.client.service.a aVar : this.f67945a.values()) {
                try {
                    aVar.g().onLowMemory();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public int h(Intent intent, int i4, int i5) {
        StubServiceRecord create = StubServiceRecord.create(intent);
        if (create.mServiceIntent != null && create.mServiceInfo != null && com.xinzhu.overmind.client.e.getClientConfig() != null) {
            Service c5 = c(create.mServiceIntent, create.mServiceInfo, true);
            if (c5 == null) {
                com.xinzhu.overmind.b.c(f67943c, "onStartCommand unexpected behavior");
                return 2;
            }
            create.mServiceIntent.setExtrasClassLoader(c5.getClassLoader());
            com.xinzhu.overmind.client.service.a a5 = a(create.mServiceIntent);
            String stringExtra = intent.getStringExtra("operation");
            if (stringExtra != null && !stringExtra.equals("start_service")) {
                if (stringExtra.equals("stop_service")) {
                    stopService(create.mServiceIntent);
                    Overmind.getMindActivityManager().q(intent, create.mUserId);
                    return 2;
                }
                com.xinzhu.overmind.b.c(f67943c, "get unexpected <operation> " + stringExtra);
            } else {
                a5.o(create.mStartId);
                try {
                    int onStartCommand = c5.onStartCommand(create.mServiceIntent, i4, create.mStartId);
                    Overmind.getMindActivityManager().s(intent, create.mUserId);
                    return onStartCommand;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return 2;
    }

    public void i(int i4) {
        if (this.f67945a.size() > 0) {
            for (com.xinzhu.overmind.client.service.a aVar : this.f67945a.values()) {
                try {
                    aVar.g().onTrimMemory(i4);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        com.xinzhu.overmind.b.a(f67943c, "onTrimMemory");
    }

    public boolean j(Intent intent) {
        Service c5;
        StubServiceRecord create = StubServiceRecord.create(intent);
        if (create.mServiceIntent != null && create.mServiceInfo != null && com.xinzhu.overmind.client.e.getClientConfig() != null) {
            Intent intent2 = create.mServiceIntent;
            try {
                UnbindRecord r4 = Overmind.getMindActivityManager().r(intent, com.xinzhu.overmind.client.e.getUserId());
                if (r4 == null || (c5 = c(create.mServiceIntent, create.mServiceInfo, false)) == null) {
                    return false;
                }
                create.mServiceIntent.setExtrasClassLoader(c5.getClassLoader());
                com.xinzhu.overmind.client.service.a a5 = a(intent2);
                boolean z4 = r4.d() == 0;
                if (z4 || a5.c(intent2)) {
                    c5.onUnbind(intent2);
                    if (z4) {
                        c5.onDestroy();
                        Overmind.getMindActivityManager().q(intent, com.xinzhu.overmind.client.e.getUserId());
                        l(intent2);
                        if (this.f67945a.isEmpty()) {
                            this.f67946b.stopSelf();
                        }
                    } else {
                        a5.m(true);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public IBinder k(Intent intent) {
        com.xinzhu.overmind.client.service.a a5 = a(intent);
        if (a5 == null) {
            return null;
        }
        return a5.e(intent);
    }

    public void stopService(Intent intent) {
        if (intent == null) {
            return;
        }
        com.xinzhu.overmind.b.a(f67943c, "stopService：" + intent.toString());
        com.xinzhu.overmind.client.service.a a5 = a(intent);
        if (a5 == null || a5.g() == null || a5.i() > 0) {
            return;
        }
        if (a5.h() > 0) {
            try {
                com.xinzhu.overmind.b.a(f67943c, "stopService real destroy：" + intent.toString());
                a5.g().onDestroy();
                l(intent);
                if (this.f67945a.isEmpty()) {
                    com.xinzhu.overmind.b.a(f67943c, "stopService stubservice");
                    this.f67946b.stopSelf();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
