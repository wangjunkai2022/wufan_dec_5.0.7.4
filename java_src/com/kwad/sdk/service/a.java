package com.kwad.sdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ksad.annotation.invoker.InvokeBy;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.api.proxy.app.DownloadService;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class a extends com.kwad.sdk.l.a {
    private com.kwad.sdk.c aOT;
    private Service aOV;
    private final Map<String, Integer> aOU = new ConcurrentHashMap();
    private final HandlerC0542a aOW = new HandlerC0542a(this);

    /* renamed from: com.kwad.sdk.service.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class HandlerC0542a extends Handler {
        final WeakReference<a> aOX;

        public HandlerC0542a(a aVar) {
            this.aOX = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a aVar = this.aOX.get();
            if (aVar != null && message.what == 1) {
                if (aVar.aOT != null && aVar.aOT.yw()) {
                    aVar.aOV.stopSelf();
                } else {
                    sendEmptyMessageDelayed(1, 30000L);
                }
            }
        }
    }

    private void g(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            int intExtra = intent.getIntExtra("download_service_type_tag", 0);
            String stringExtra = intent.getStringExtra("download_service_id_tag");
            DownloadTask.DownloadRequest downloadRequest = (DownloadTask.DownloadRequest) intent.getSerializableExtra("download_service_args_tag");
            Integer num = TextUtils.isEmpty(stringExtra) ? null : this.aOU.get(stringExtra);
            int intValue = num != null ? num.intValue() : 0;
            if (intExtra == 1) {
                this.aOU.put(stringExtra, Integer.valueOf(this.aOT.a(downloadRequest, (com.kwad.sdk.a) null)));
            } else if (intExtra == 2) {
                this.aOT.pause(intValue);
            } else if (intExtra == 3) {
                this.aOT.resume(intValue);
            } else if (intExtra != 4) {
            } else {
                if (intValue != 0) {
                    this.aOT.cancel(intValue);
                    return;
                }
                String stringExtra2 = intent.getStringExtra("download_service_path");
                if (stringExtra2 != null) {
                    com.kwad.sdk.c.bW(stringExtra2);
                }
            }
        } catch (Exception unused) {
        }
    }

    @InvokeBy(invokerClass = b.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
        b.a(DownloadService.class, a.class);
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onCreate(Service service) {
        if (service == null) {
            return;
        }
        this.aOV = service;
        this.aOT = com.kwad.sdk.c.yq();
        this.aOW.sendEmptyMessageDelayed(1, 30000L);
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public int onStartCommand(Service service, Intent intent, int i4, int i5) {
        g(intent);
        return super.onStartCommand(service, intent, i4, i5);
    }
}
