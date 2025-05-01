package com.efs.sdk.base.core.controller;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.config.a.c;
import com.efs.sdk.base.core.controller.a.a;
import com.efs.sdk.base.core.d.b;
import com.efs.sdk.base.core.e.d;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class ControllerCenter implements Handler.Callback {

    /* renamed from: h  reason: collision with root package name */
    private static GlobalEnvStruct f10362h;

    /* renamed from: a  reason: collision with root package name */
    private int f10363a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f10364b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f10365c = 1;

    /* renamed from: d  reason: collision with root package name */
    private final int f10366d = 2;

    /* renamed from: e  reason: collision with root package name */
    private final int f10367e = 3;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f10368f = false;

    /* renamed from: g  reason: collision with root package name */
    private a f10369g;

    /* renamed from: i  reason: collision with root package name */
    private Handler f10370i;

    public ControllerCenter(EfsReporter.Builder builder) {
        f10362h = builder.getGlobalEnvStruct();
        Handler handler = new Handler(com.efs.sdk.base.core.util.concurrent.a.f10436a.getLooper(), this);
        this.f10370i = handler;
        handler.sendEmptyMessage(0);
    }

    private void a() {
        if (this.f10369g == null) {
            this.f10369g = new a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f10362h.mAppContext.registerReceiver(this.f10369g, intentFilter);
        } catch (Throwable th) {
            Log.w("efs.base", "register network change receiver error", th);
            int i4 = this.f10363a + 1;
            this.f10363a = i4;
            if (i4 < 3) {
                this.f10370i.sendEmptyMessageDelayed(3, 6000L);
            }
        }
    }

    private void b(final ILogProtocol iLogProtocol) {
        if (iLogProtocol == null) {
            return;
        }
        WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.controller.ControllerCenter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    iLogProtocol.insertGlobal(GlobalInfoManager.getInstance().getGlobalInfo());
                    if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                        ControllerCenter.a(iLogProtocol);
                    }
                    if (ControllerCenter.getGlobalEnvStruct().isEnableSendLog()) {
                        final b a5 = b.a(iLogProtocol);
                        final d a6 = d.a.a();
                        WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.e.d.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a6.f10390a.a(a5);
                            }
                        });
                    }
                } catch (Throwable th) {
                    Log.e("efs.base", "log send error", th);
                }
            }
        });
    }

    @NonNull
    public static GlobalEnvStruct getGlobalEnvStruct() {
        return f10362h;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            GlobalInfoManager.getInstance().initGlobalInfo();
            f.a.a();
            c.a().b();
            a();
            com.efs.sdk.base.core.f.f a5 = f.a.a();
            boolean isIntl = f10362h.isIntl();
            com.efs.sdk.base.core.f.c cVar = a5.f10407a;
            if (isIntl) {
                cVar.f10399a = "https://errnewlogos.umeng.com/api/crashsdk/logcollect";
                cVar.f10400b = "4ea4e41a3993";
            } else {
                cVar.f10399a = "https://errnewlog.umeng.com/api/crashsdk/logcollect";
                cVar.f10400b = "28ef1713347d";
            }
            a5.f10408b = this;
            a5.f10409c.f10394a = this;
            a5.f10410d.f10394a = this;
            this.f10368f = true;
            com.efs.sdk.base.core.c.d.a().sendEmptyMessageDelayed(0, f10362h.getLogSendDelayMills());
            com.efs.sdk.base.core.f.f a6 = f.a.a();
            if (a6.f10408b != null && getGlobalEnvStruct().isEnableWaStat()) {
                a6.f10408b.send(new com.efs.sdk.base.core.f.b("efs_core", "pvuv", a6.f10407a.f10401c));
            }
        } else if (i4 == 1) {
            Object obj = message.obj;
            if (obj != null && (obj instanceof ILogProtocol)) {
                b((ILogProtocol) obj);
            }
        } else if (i4 == 3) {
            a();
        }
        return true;
    }

    public void send(ILogProtocol iLogProtocol) {
        if (!this.f10368f) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = iLogProtocol;
            this.f10370i.sendMessage(obtain);
            return;
        }
        b(iLogProtocol);
    }

    @Nullable
    public HttpResponse sendSyncImmediately(String str, int i4, String str2, boolean z4, File file) {
        b bVar = new b(str, (byte) 2);
        bVar.b(1);
        bVar.f10383d = file;
        bVar.a(str2);
        bVar.a(i4);
        bVar.f10381b.f10385b = z4;
        bVar.c();
        d.a.a().f10390a.a(bVar);
        return bVar.f10381b.f10386c;
    }

    static /* synthetic */ void a(ILogProtocol iLogProtocol) {
        for (ValueCallback<Pair<Message, Message>> valueCallback : getGlobalEnvStruct().getCallback(9)) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("log_type", iLogProtocol.getLogType());
            hashMap.put("log_data", iLogProtocol.generateString());
            hashMap.put("link_key", iLogProtocol.getLinkKey());
            hashMap.put("link_id", iLogProtocol.getLinkId());
            Message obtain = Message.obtain(null, 9, hashMap);
            Message obtain2 = Message.obtain();
            valueCallback.onReceiveValue(new Pair<>(obtain, obtain2));
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
