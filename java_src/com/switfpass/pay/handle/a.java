package com.switfpass.pay.handle;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f61748a = "com.switfpass.pay.handle.a";

    /* renamed from: b  reason: collision with root package name */
    public static HashMap f61749b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final int f61750c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f61751d = 6;

    /* renamed from: e  reason: collision with root package name */
    public static final int f61752e = 7;

    /* renamed from: f  reason: collision with root package name */
    public static final int f61753f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final int f61754g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f61755h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f61756i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f61757j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f61758k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f61759l = 5;

    /* renamed from: m  reason: collision with root package name */
    public static final int f61760m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f61761n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f61762o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f61763p = 9;

    public static void a(int i4, int i5) {
        if (f61749b == null) {
            f61749b = new HashMap();
        }
        synchronized (f61749b) {
            ArrayList arrayList = (ArrayList) f61749b.get(Integer.valueOf(i4));
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Handler handler = (Handler) it2.next();
                    if (handler != null) {
                        handler.sendEmptyMessage(i5);
                    }
                }
            }
        }
    }

    public static void b(int i4, int i5, Object obj) {
        if (f61749b == null) {
            f61749b = new HashMap();
        }
        synchronized (f61749b) {
            ArrayList arrayList = (ArrayList) f61749b.get(Integer.valueOf(i4));
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Handler handler = (Handler) it2.next();
                    if (handler != null) {
                        handler.sendMessage(handler.obtainMessage(i5, obj));
                    }
                }
            }
        }
    }

    public static void c(int i4, Message message) {
        if (f61749b == null) {
            f61749b = new HashMap();
        }
        synchronized (f61749b) {
            ArrayList arrayList = (ArrayList) f61749b.get(Integer.valueOf(i4));
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Handler handler = (Handler) it2.next();
                    if (handler != null) {
                        try {
                            handler.sendMessage(handler.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
                        } catch (Exception e5) {
                            e5.toString();
                        }
                    }
                }
            }
        }
    }

    public static void d(int i4, Handler handler) {
        if (f61749b == null) {
            f61749b = new HashMap();
        }
        ArrayList arrayList = (ArrayList) f61749b.get(Integer.valueOf(i4));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(handler);
        f61749b.put(Integer.valueOf(i4), arrayList);
    }

    public static void e(int i4, Handler handler) {
        if (f61749b == null) {
            f61749b = new HashMap();
        }
        ArrayList arrayList = (ArrayList) f61749b.get(Integer.valueOf(i4));
        if (arrayList != null) {
            arrayList.remove(handler);
            if (arrayList.size() <= 0) {
                f61749b.remove(Integer.valueOf(i4));
            }
        }
    }
}
