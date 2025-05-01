package com.kwad.sdk.collector.b;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ksad.annotation.invoker.InvokeBy;
import com.kwad.sdk.api.proxy.app.ServiceProxyRemote;
import com.kwad.sdk.collector.AppStatusRules;
import com.kwad.sdk.collector.d;
import com.kwad.sdk.collector.model.b;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.SystemUtil;
import com.kwad.sdk.utils.ar;
import com.kwad.sdk.utils.f;
import com.kwad.sdk.utils.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
/* loaded from: classes5.dex */
public class a extends com.kwad.sdk.l.a {
    private static AtomicBoolean aoM = new AtomicBoolean(false);
    public static volatile Message aoN;
    private HandlerC0510a aoK = new HandlerC0510a((byte) 0);
    private Messenger aoL = new Messenger(this.aoK);

    /* renamed from: com.kwad.sdk.collector.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class HandlerC0510a extends Handler {
        private WeakReference<Service> aoP;

        private HandlerC0510a() {
        }

        public final void a(@Nullable Service service) {
            if (service != null) {
                this.aoP = new WeakReference<>(service);
            } else {
                this.aoP = null;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            c.d("RemoteService", "handleMessage");
            WeakReference<Service> weakReference = this.aoP;
            Service service = weakReference != null ? weakReference.get() : null;
            if (service == null) {
                return;
            }
            if (!a.Bn().get()) {
                c.d("RemoteService", "save buffered message");
                a.aoN = Message.obtain(message);
                return;
            }
            final Messenger messenger = message.replyTo;
            int i4 = message.what;
            c.d("RemoteService", "handleMessage what: " + i4);
            if (i4 != 100) {
                return;
            }
            final Bundle bundle = new Bundle();
            f.a(service, new f.b() { // from class: com.kwad.sdk.collector.b.a.a.1
                @Override // com.kwad.sdk.utils.f.b
                public final void u(List<b> list) {
                    c.d("RemoteService", "RemoteService: onAppStatusResult list: " + list);
                    if (list != null && !list.isEmpty()) {
                        c.d("RemoteService", "RemoteService: onAppStatusResult: " + list.size());
                        JSONArray L = f.a.L(list);
                        String jSONArray = L != null ? L.toString() : null;
                        c.d("RemoteService", "resultJson :" + jSONArray);
                        if (jSONArray != null) {
                            AppStatusRules Lz = f.Lz();
                            ArrayList<AppStatusRules.Strategy> allStrategy = Lz != null ? Lz.getAllStrategy() : null;
                            String jSONArray2 = allStrategy != null ? t.O(allStrategy).toString() : null;
                            bundle.putString("resultJson", jSONArray);
                            bundle.putString("allStrategyJson", jSONArray2);
                        }
                    }
                    try {
                        Message obtain = Message.obtain();
                        obtain.what = 101;
                        obtain.setData(bundle);
                        messenger.send(obtain);
                    } catch (RemoteException unused) {
                    }
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    for (b bVar : list) {
                        bVar.destroy();
                    }
                }
            });
        }

        /* synthetic */ HandlerC0510a(byte b5) {
            this();
        }
    }

    public static AtomicBoolean Bn() {
        return aoM;
    }

    public static void b(@NonNull Context context, ServiceConnection serviceConnection) {
        c.d("RemoteService", "unbindASService");
        try {
            context.unbindService(serviceConnection);
        } catch (Exception e5) {
            c.printStackTrace(e5);
        }
    }

    private static boolean bb(Context context) {
        String processName = ar.getProcessName(context);
        return (processName == null || context.getPackageName().equals(processName)) ? false : true;
    }

    @InvokeBy(invokerClass = com.kwad.sdk.service.b.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
        try {
            com.kwad.sdk.service.b.a(Class.forName("com.kwad.sdk.api.proxy.app.ServiceProxyRemote"), a.class);
        } catch (Throwable unused) {
        }
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public IBinder onBind(@NonNull Service service, Intent intent) {
        return this.aoL.getBinder();
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onCreate(Service service) {
        super.onCreate(service);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WebView.setDataDirectorySuffix(ar.getProcessName(service.getApplicationContext()));
            } catch (Exception e5) {
                c.d("RemoteService", "WebView has already been initialized " + e5.getMessage());
            }
        }
        c.d("RemoteService", "onCreate processName:" + ar.getProcessName(service));
        if (!SystemUtil.isInMainProcess(service)) {
            d.a(service, new d.a() { // from class: com.kwad.sdk.collector.b.a.1
                @Override // com.kwad.sdk.collector.d.a
                public final void cv(String str) {
                    c.e("RemoteService", "onLoadError: " + str);
                    a.aoM.set(false);
                }

                @Override // com.kwad.sdk.collector.d.a
                public final void onLoaded() {
                    c.d("RemoteService", "onLoaded");
                    a.aoM.set(true);
                    if (a.aoN != null) {
                        a.this.aoK.handleMessage(a.aoN);
                        a.aoN = null;
                    }
                }
            });
        } else {
            aoM.set(true);
        }
        this.aoK.a(service);
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onDestroy(@NonNull Service service) {
        super.onDestroy(service);
        c.d("RemoteService", "onDestroy");
        this.aoK.a(null);
        if (bb(service)) {
            c.d("RemoteService", "goto kill myself");
            Process.killProcess(Process.myPid());
        }
    }

    public static void a(@NonNull Context context, ServiceConnection serviceConnection) {
        c.d("RemoteService", "bindASService");
        context.bindService(new Intent(context, ServiceProxyRemote.class), serviceConnection, 1);
    }
}
