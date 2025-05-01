package com.umeng.ccg;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;
/* compiled from: Dispatch.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f64034a = 101;

    /* renamed from: b  reason: collision with root package name */
    public static final int f64035b = 102;

    /* renamed from: c  reason: collision with root package name */
    public static final int f64036c = 103;

    /* renamed from: d  reason: collision with root package name */
    public static final int f64037d = 104;

    /* renamed from: e  reason: collision with root package name */
    public static final int f64038e = 105;

    /* renamed from: f  reason: collision with root package name */
    public static final int f64039f = 106;

    /* renamed from: g  reason: collision with root package name */
    public static final int f64040g = 107;

    /* renamed from: h  reason: collision with root package name */
    public static final int f64041h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f64042i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f64043j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f64044k = 201;

    /* renamed from: l  reason: collision with root package name */
    public static final int f64045l = 202;

    /* renamed from: m  reason: collision with root package name */
    public static final int f64046m = 203;

    /* renamed from: n  reason: collision with root package name */
    public static final int f64047n = 301;

    /* renamed from: o  reason: collision with root package name */
    public static final int f64048o = 302;

    /* renamed from: p  reason: collision with root package name */
    public static final int f64049p = 303;

    /* renamed from: q  reason: collision with root package name */
    private static HandlerThread f64050q = null;

    /* renamed from: r  reason: collision with root package name */
    private static Handler f64051r = null;

    /* renamed from: s  reason: collision with root package name */
    private static HashMap<Integer, a> f64052s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final int f64053t = 256;

    /* compiled from: Dispatch.java */
    /* loaded from: classes6.dex */
    public interface a {
        void a(Object obj, int i4);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        int i4 = message.arg1;
        Object obj = message.obj;
        Integer valueOf = Integer.valueOf(i4 / 100);
        HashMap<Integer, a> hashMap = f64052s;
        if (hashMap == null) {
            return;
        }
        a aVar = hashMap.containsKey(valueOf) ? f64052s.get(valueOf) : null;
        if (aVar != null) {
            aVar.a(obj, i4);
        }
    }

    public static void a(Context context, int i4, int i5, a aVar, Object obj, long j4) {
        if (context == null || aVar == null) {
            return;
        }
        if (f64052s == null) {
            f64052s = new HashMap<>();
        }
        Integer valueOf = Integer.valueOf(i5 / 100);
        if (!f64052s.containsKey(valueOf)) {
            f64052s.put(valueOf, aVar);
        }
        if (f64050q == null || f64051r == null) {
            a();
        }
        try {
            Handler handler = f64051r;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i4;
                obtainMessage.arg1 = i5;
                obtainMessage.obj = obj;
                f64051r.sendMessageDelayed(obtainMessage, j4);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i4, a aVar, Object obj) {
        a(context, 256, i4, aVar, obj, 0L);
    }

    public static void a(Context context, int i4, a aVar, Object obj, long j4) {
        a(context, 256, i4, aVar, obj, j4);
    }

    private static synchronized void a() {
        synchronized (c.class) {
            try {
                if (f64050q == null) {
                    HandlerThread handlerThread = new HandlerThread("ccg_dispatch");
                    f64050q = handlerThread;
                    handlerThread.start();
                    if (f64051r == null) {
                        f64051r = new Handler(f64050q.getLooper()) { // from class: com.umeng.ccg.c.1
                            @Override // android.os.Handler
                            public void handleMessage(Message message) {
                                if (message.what != 256) {
                                    return;
                                }
                                c.b(message);
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
