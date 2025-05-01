package com.efs.sdk.base.core.c;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.b.h;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public int f10306a;

    /* renamed from: b  reason: collision with root package name */
    public c f10307b;

    /* renamed from: c  reason: collision with root package name */
    private c f10308c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f10309d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicInteger f10310e;

    /* renamed from: f  reason: collision with root package name */
    private com.efs.sdk.base.core.b.f f10311f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final d f10312a = new d((byte) 0);
    }

    /* synthetic */ d(byte b5) {
        this();
    }

    public static d a() {
        return a.f10312a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar;
        com.efs.sdk.base.core.b.a aVar;
        List<File> list;
        com.efs.sdk.base.core.f.f fVar2;
        super.handleMessage(message);
        fVar = f.a.f10320a;
        if (fVar.a()) {
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    return;
                }
                Object obj = message.obj;
                if (obj != null) {
                    this.f10309d.remove(obj.toString());
                }
                int incrementAndGet = message.arg1 != 0 ? this.f10310e.incrementAndGet() : 0;
                if (this.f10309d.isEmpty()) {
                    if (incrementAndGet < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.f10310e.set(0);
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendDelayMills());
                    Log.i("efs.send_log", "request error cnt gt 5, next request delay 10s");
                    return;
                }
                return;
            }
            String netStatus = GlobalInfoManager.getInstance().getNetStatus();
            if (!NetworkUtil.NETWORK_CLASS_DENIED.equalsIgnoreCase(netStatus) && !NetworkUtil.NETWORK_CLASS_DISCONNECTED.equalsIgnoreCase(netStatus)) {
                List<com.efs.sdk.base.core.d.b> emptyList = Collections.emptyList();
                try {
                    aVar = a.b.f10289a;
                    int i5 = this.f10306a;
                    com.efs.sdk.base.core.b.f fVar3 = this.f10311f;
                    aVar.a();
                    aVar.a();
                    File f5 = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
                    if (!f5.exists()) {
                        list = Collections.emptyList();
                    } else {
                        List<File> d5 = com.efs.sdk.base.core.util.b.d(f5);
                        if (aVar.f10286b) {
                            fVar2 = f.a.f10411a;
                            int size = d5.size();
                            if (fVar2.f10408b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                                com.efs.sdk.base.core.f.b bVar = new com.efs.sdk.base.core.f.b("efs_core", "log_lag", fVar2.f10407a.f10401c);
                                bVar.put("cnt", Integer.valueOf(size));
                                fVar2.f10408b.send(bVar);
                            }
                            aVar.f10286b = false;
                        }
                        Collections.sort(d5, aVar.f10288d);
                        ArrayList arrayList = new ArrayList(i5);
                        for (int size2 = d5.size() - 1; size2 >= 0 && arrayList.size() < i5; size2--) {
                            File file = d5.get(size2);
                            if (file.exists() && (fVar3 == null || !fVar3.a(file))) {
                                arrayList.add(file);
                            }
                        }
                        list = arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList(i5);
                    for (File file2 : list) {
                        com.efs.sdk.base.core.d.b a5 = aVar.a(file2);
                        if (a5 == null) {
                            Log.w("efs.cache", "file upload error, name is " + file2.getName());
                        } else {
                            arrayList2.add(a5);
                        }
                    }
                    emptyList = arrayList2;
                } catch (Throwable unused) {
                }
                for (com.efs.sdk.base.core.d.b bVar2 : emptyList) {
                    if ("wa".equals(bVar2.f10380a.f10373a) || b.a().a(bVar2.f10380a.f10373a, bVar2.a())) {
                        c cVar = this.f10307b;
                        if ("wa".equals(bVar2.f10380a.f10373a)) {
                            cVar = this.f10308c;
                        }
                        String uuid = UUID.randomUUID().toString();
                        this.f10309d.add(uuid);
                        if (WorkThreadUtil.submit(new e(bVar2, cVar, uuid)) == null) {
                            a(uuid, -1);
                        }
                    }
                }
                if (this.f10309d.size() <= 0) {
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
                    return;
                }
                return;
            }
            Log.i("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(netStatus)));
            sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
        }
    }

    private d() {
        super(com.efs.sdk.base.core.util.concurrent.a.f10436a.getLooper());
        this.f10306a = 5;
        this.f10309d = new ArrayList();
        this.f10310e = new AtomicInteger(0);
        this.f10307b = new com.efs.sdk.base.core.c.a();
        this.f10308c = new com.efs.sdk.base.core.f.e();
        this.f10311f = new h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj, int i4) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        obtain.arg1 = i4;
        sendMessage(obtain);
    }
}
