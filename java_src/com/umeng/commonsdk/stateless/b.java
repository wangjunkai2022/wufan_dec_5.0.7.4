package com.umeng.commonsdk.stateless;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.util.LinkedList;
/* compiled from: UMSLNetWorkSender.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f64335a = 273;

    /* renamed from: b  reason: collision with root package name */
    private static Context f64336b = null;

    /* renamed from: c  reason: collision with root package name */
    private static HandlerThread f64337c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Handler f64338d = null;

    /* renamed from: f  reason: collision with root package name */
    private static final int f64340f = 274;

    /* renamed from: g  reason: collision with root package name */
    private static final int f64341g = 275;

    /* renamed from: h  reason: collision with root package name */
    private static final int f64342h = 512;

    /* renamed from: i  reason: collision with root package name */
    private static a f64343i;

    /* renamed from: j  reason: collision with root package name */
    private static IntentFilter f64344j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile boolean f64345k;

    /* renamed from: e  reason: collision with root package name */
    private static Object f64339e = new Object();

    /* renamed from: l  reason: collision with root package name */
    private static LinkedList<String> f64346l = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UMSLNetWorkSender.java */
    /* loaded from: classes6.dex */
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i4, String str) {
            if ((i4 & 8) != 8) {
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            b.a(274);
        }
    }

    public b(Context context) {
        synchronized (f64339e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f64336b = applicationContext;
                    if (applicationContext != null && f64337c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f64337c = handlerThread;
                        handlerThread.start();
                        if (f64343i == null) {
                            String str = f64336b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f64329f;
                            File file = new File(str);
                            if (!file.exists()) {
                                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            a aVar = new a(str);
                            f64343i = aVar;
                            aVar.startWatching();
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (f64338d == null) {
                            f64338d = new Handler(f64337c.getLooper()) { // from class: com.umeng.commonsdk.stateless.b.1
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i4 = message.what;
                                    if (i4 != 512) {
                                        switch (i4) {
                                            case 273:
                                                b.l();
                                                return;
                                            case 274:
                                                b.n();
                                                return;
                                            case b.f64341g /* 275 */:
                                                b.p();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    b.q();
                                }
                            };
                        }
                    }
                }
            }
        }
    }

    public static void a(boolean z4) {
        f64345k = z4;
        if (z4) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
            b(274);
            return;
        }
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
    }

    public static void b(int i4) {
        Handler handler;
        try {
            if (!f64345k || (handler = f64338d) == null || handler.hasMessages(i4)) {
                return;
            }
            Message obtainMessage = f64338d.obtainMessage();
            obtainMessage.what = i4;
            f64338d.sendMessage(obtainMessage);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f64336b, th);
        }
    }

    public static void c() {
        b(f64341g);
    }

    public static void d() {
        b(512);
    }

    private static void i() {
        File[] c5 = d.c(f64336b);
        if (c5 != null) {
            if (f64346l.size() > 0) {
                f64346l.clear();
            }
            for (File file : c5) {
                f64346l.add(file.getAbsolutePath());
            }
        }
    }

    private static String j() {
        String str = null;
        try {
            String peek = f64346l.peek();
            if (peek != null) {
                try {
                    f64346l.removeFirst();
                    return peek;
                } catch (Throwable unused) {
                    str = peek;
                    return str;
                }
            }
            return peek;
        } catch (Throwable unused2) {
        }
    }

    @TargetApi(9)
    private static void k() {
        String j4;
        if (f64346l.size() <= 0) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            if (Build.VERSION.SDK_INT >= 9) {
                j4 = f64346l.pollFirst();
            } else {
                j4 = j();
            }
            if (!TextUtils.isEmpty(j4)) {
                File file = new File(j4);
                if (!file.exists()) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                    continue;
                } else {
                    c cVar = new c(f64336b);
                    byte[] bArr = null;
                    try {
                        bArr = d.a(j4);
                    } catch (Exception unused) {
                    }
                    String name = file.getName();
                    String substring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : "u";
                    String c5 = d.c(d.d(name));
                    if (cVar.a(bArr, c5, com.umeng.commonsdk.vchannel.a.f64627c.equalsIgnoreCase(c5) ? com.umeng.commonsdk.vchannel.a.f64625a : "", substring) && !file.delete()) {
                        file.delete();
                        continue;
                    }
                }
            }
        } while (j4 != null);
        f64346l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        File a5;
        if (!f64345k || f64336b == null) {
            return;
        }
        do {
            try {
                a5 = d.a(f64336b);
                if (a5 != null && a5.getParentFile() != null && !TextUtils.isEmpty(a5.getParentFile().getName())) {
                    c cVar = new c(f64336b);
                    String str = new String(Base64.decode(a5.getParentFile().getName(), 0));
                    if (!com.umeng.commonsdk.internal.a.f64230a.equalsIgnoreCase(str) && !com.umeng.commonsdk.internal.a.f64231b.equalsIgnoreCase(str) && !com.umeng.commonsdk.internal.a.H.equalsIgnoreCase(str)) {
                        ULog.i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        byte[] bArr = null;
                        try {
                            bArr = d.a(a5.getAbsolutePath());
                        } catch (Exception unused) {
                        }
                        String str2 = com.umeng.commonsdk.vchannel.a.f64627c.equalsIgnoreCase(str) ? com.umeng.commonsdk.vchannel.a.f64625a : "";
                        String str3 = UMServerURL.PATH_SHARE.equalsIgnoreCase(str) ? "s" : "u";
                        if (cVar.a(bArr, str, str2, (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) ? "p" : "p")) {
                            ULog.i("walle", "[stateless] Send envelope file success, delete it.");
                            File file = new File(a5.getAbsolutePath());
                            if (file.delete()) {
                                continue;
                            } else {
                                ULog.i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                                file.delete();
                                continue;
                            }
                        } else {
                            ULog.i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                    }
                    new File(a5.getAbsolutePath()).delete();
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f64336b, th);
            }
        } while (a5 != null);
        m();
    }

    private static void m() {
        try {
            File file = new File(f64336b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f64328e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                d.a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        if (!f64345k || f64336b == null) {
            return;
        }
        i();
        k();
        c();
    }

    private static void o() {
        try {
            File file = new File(f64336b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f64328e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                b(273);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p() {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q() {
    }

    public static boolean a() {
        synchronized (f64339e) {
            return f64343i != null;
        }
    }

    public static void b() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        b(274);
    }

    public static void a(int i4) {
        Handler handler;
        if (!f64345k || (handler = f64338d) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i4;
        f64338d.sendMessage(obtainMessage);
    }
}
