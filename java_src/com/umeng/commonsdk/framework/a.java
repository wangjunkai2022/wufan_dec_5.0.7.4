package com.umeng.commonsdk.framework;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.kuaishou.weapon.p0.g;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: UMNetWorkSender.java */
/* loaded from: classes6.dex */
public class a implements UMImprintChangeCallback {

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f64204a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f64205b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f64206c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final int f64207d = 200;

    /* renamed from: e  reason: collision with root package name */
    private static final int f64208e = 273;

    /* renamed from: f  reason: collision with root package name */
    private static final int f64209f = 274;

    /* renamed from: g  reason: collision with root package name */
    private static final int f64210g = 512;

    /* renamed from: h  reason: collision with root package name */
    private static final int f64211h = 769;

    /* renamed from: i  reason: collision with root package name */
    private static FileObserverC0672a f64212i = null;

    /* renamed from: j  reason: collision with root package name */
    private static ConnectivityManager f64213j = null;

    /* renamed from: k  reason: collision with root package name */
    private static IntentFilter f64214k = null;

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f64215l = false;

    /* renamed from: m  reason: collision with root package name */
    private static ArrayList<UMSenderStateNotify> f64216m = null;

    /* renamed from: p  reason: collision with root package name */
    private static final String f64219p = "report_policy";

    /* renamed from: q  reason: collision with root package name */
    private static final String f64220q = "report_interval";

    /* renamed from: s  reason: collision with root package name */
    private static final int f64222s = 15;

    /* renamed from: t  reason: collision with root package name */
    private static final int f64223t = 3;

    /* renamed from: u  reason: collision with root package name */
    private static final int f64224u = 90;

    /* renamed from: x  reason: collision with root package name */
    private static BroadcastReceiver f64227x;

    /* renamed from: n  reason: collision with root package name */
    private static Object f64217n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static ReentrantLock f64218o = new ReentrantLock();

    /* renamed from: r  reason: collision with root package name */
    private static boolean f64221r = false;

    /* renamed from: v  reason: collision with root package name */
    private static int f64225v = 15;

    /* renamed from: w  reason: collision with root package name */
    private static Object f64226w = new Object();

    /* compiled from: UMNetWorkSender.java */
    /* renamed from: com.umeng.commonsdk.framework.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static class FileObserverC0672a extends FileObserver {
        public FileObserverC0672a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i4, String str) {
            if ((i4 & 8) != 8) {
                return;
            }
            ULog.d("--->>> envelope file created >>> " + str);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            a.c(273);
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f64213j = (ConnectivityManager) appContext.getSystemService("connectivity");
        }
        f64227x = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.a.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.E, b.a(context).a(), null);
                }
            }
        };
    }

    public a(Context context, Handler handler) {
        if (f64213j == null) {
            Context appContext = UMGlobalContext.getAppContext();
            if (f64213j != null) {
                f64213j = (ConnectivityManager) appContext.getSystemService("connectivity");
            }
        }
        f64206c = handler;
        try {
            if (f64204a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f64204a = handlerThread;
                handlerThread.start();
                if (f64212i == null) {
                    FileObserverC0672a fileObserverC0672a = new FileObserverC0672a(UMFrUtils.getEnvelopeDirPath(context));
                    f64212i = fileObserverC0672a;
                    fileObserverC0672a.startWatching();
                    ULog.d("--->>> FileMonitor has already started!");
                }
                j();
                if (f64205b == null) {
                    f64205b = new Handler(f64204a.getLooper()) { // from class: com.umeng.commonsdk.framework.a.3
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i4 = message.what;
                            if (i4 == 273) {
                                ULog.d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                try {
                                    a.f64218o.tryLock(1L, TimeUnit.SECONDS);
                                    try {
                                        a.n();
                                    } catch (Throwable unused) {
                                    }
                                    a.f64218o.unlock();
                                } catch (Throwable unused2) {
                                }
                            } else if (i4 == 274) {
                                a.l();
                            } else if (i4 != 512) {
                            } else {
                                a.m();
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f64219p, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f64220q, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static int b() {
        int i4;
        synchronized (f64226w) {
            i4 = f64225v;
        }
        return i4;
    }

    public static void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i4) {
        Handler handler;
        if (!f64215l || (handler = f64205b) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i4;
        f64205b.sendMessage(obtainMessage);
    }

    public static void d() {
        if (f64218o.tryLock()) {
            try {
                b(273);
            } finally {
                f64218o.unlock();
            }
        }
    }

    public static void e() {
        a(274, 3000);
    }

    private void j() {
        synchronized (f64226w) {
            if ("11".equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f64219p, ""))) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f64221r = true;
                f64225v = 15;
                int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f64220q, "15")).intValue();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 3 && intValue <= 90) {
                    f64225v = intValue * 1000;
                }
                f64225v = 15;
            } else {
                f64221r = false;
            }
        }
    }

    private static void k() {
        if (f64204a != null) {
            f64204a = null;
        }
        if (f64205b != null) {
            f64205b = null;
        }
        if (f64206c != null) {
            f64206c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        int size;
        synchronized (f64217n) {
            ArrayList<UMSenderStateNotify> arrayList = f64216m;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    f64216m.get(i4).onSenderIdle();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        ULog.d("--->>> handleProcessNext: Enter...");
        if (f64215l) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        ULog.d("--->>> Ready to send envelope file [" + path + "].");
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                        if (new c(appContext).a(envelopeFile)) {
                            ULog.d("--->>> Send envelope file success, delete it.");
                            if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                                ULog.d("--->>> Failed to delete already processed file. We try again after delete failed.");
                                UMFrUtils.removeEnvelopeFile(envelopeFile);
                            }
                            c(273);
                            return;
                        }
                        ULog.d("--->>> Send envelope file failed, abandon and wait next trigger!");
                        return;
                    }
                }
                e();
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f64226w) {
            if (f64219p.equals(str)) {
                if ("11".equals(str2)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f64221r = true;
                } else {
                    f64221r = false;
                }
            }
            if (f64220q.equals(str)) {
                int intValue = Integer.valueOf(str2).intValue();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 3 && intValue <= 90) {
                    f64225v = intValue * 1000;
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f64225v);
                }
                f64225v = com.join.mgps.socket.entity.b.f54676c;
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f64225v);
            }
        }
    }

    public static void a(Context context) {
        if (f64213j != null || context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        f64213j = connectivityManager;
        if (connectivityManager != null) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> createCMIfNeeded:注册网络状态监听器。");
            b(context);
        }
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    public static void b(Context context) {
        if (context == null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> registerNetReceiver: context is null, registerNetReceiver failed.");
        } else if (Build.VERSION.SDK_INT >= 33) {
            if (DeviceConfig.checkPermission(context, g.f55582b)) {
                NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build();
                if (f64213j != null) {
                    final Context applicationContext = context.getApplicationContext();
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 注册网络状态监听器:registerNetworkCallback");
                    f64213j.registerNetworkCallback(build, new ConnectivityManager.NetworkCallback() { // from class: com.umeng.commonsdk.framework.a.1
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onAvailable(Network network) {
                            Context context2 = applicationContext;
                            UMWorkDispatch.sendEvent(context2, com.umeng.commonsdk.internal.a.E, b.a(context2).a(), null);
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                            super.onCapabilitiesChanged(network, networkCapabilities);
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLost(Network network) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onLost");
                            Context context2 = applicationContext;
                            UMWorkDispatch.sendEvent(context2, com.umeng.commonsdk.internal.a.E, b.a(context2).a(), null, 2000L);
                        }
                    });
                    return;
                }
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> ACCESS_NETWORK_STATE permission access denied.");
        } else if (DeviceConfig.checkPermission(context, g.f55582b)) {
            if (f64213j == null || f64214k != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            f64214k = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (f64227x != null) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 注册网络状态监听器:registerReceiver");
                context.registerReceiver(f64227x, f64214k);
            }
        } else {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> ACCESS_NETWORK_STATE permission access denied.");
        }
    }

    public static void a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f64217n) {
            if (f64216m == null) {
                f64216m = new ArrayList<>();
            }
            if (uMSenderStateNotify != null) {
                for (int i4 = 0; i4 < f64216m.size(); i4++) {
                    if (uMSenderStateNotify == f64216m.get(i4)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                        return;
                    }
                }
                f64216m.add(uMSenderStateNotify);
            }
        }
    }

    public static boolean a() {
        boolean z4;
        synchronized (f64226w) {
            z4 = f64221r;
        }
        return z4;
    }

    public static void a(boolean z4) {
        int size;
        f64215l = z4;
        if (z4) {
            synchronized (f64217n) {
                ArrayList<UMSenderStateNotify> arrayList = f64216m;
                if (arrayList != null && (size = arrayList.size()) > 0) {
                    for (int i4 = 0; i4 < size; i4++) {
                        f64216m.get(i4).onConnectionAvailable();
                    }
                }
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
            d();
            return;
        }
        ULog.i("--->>> network disconnected.");
        f64215l = false;
    }

    private static void b(int i4) {
        Handler handler;
        if (!f64215l || (handler = f64205b) == null || handler.hasMessages(i4)) {
            return;
        }
        Message obtainMessage = f64205b.obtainMessage();
        obtainMessage.what = i4;
        f64205b.sendMessage(obtainMessage);
    }

    private static void a(int i4, long j4) {
        Handler handler;
        if (!f64215l || (handler = f64205b) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i4;
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j4);
        f64205b.sendMessageDelayed(obtainMessage, j4);
    }

    private static void a(int i4, int i5) {
        Handler handler;
        if (!f64215l || (handler = f64205b) == null) {
            return;
        }
        handler.removeMessages(i4);
        Message obtainMessage = f64205b.obtainMessage();
        obtainMessage.what = i4;
        f64205b.sendMessageDelayed(obtainMessage, i5);
    }
}
