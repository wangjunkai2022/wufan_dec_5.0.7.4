package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
/* compiled from: OpenDeviceId.java */
/* loaded from: classes6.dex */
public class ay {

    /* renamed from: a  reason: collision with root package name */
    private static ax f63397a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f63398b;

    /* renamed from: c  reason: collision with root package name */
    private static String f63399c;

    /* renamed from: d  reason: collision with root package name */
    private static ax f63400d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f63401e;

    /* renamed from: f  reason: collision with root package name */
    private static String f63402f;

    public static synchronized String a(Context context) {
        synchronized (ay.class) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** real call OpenDeviceId.getOaid()");
            if (context == null) {
                return null;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return null;
            }
            a();
            ax axVar = f63397a;
            if (axVar != null) {
                try {
                    String a5 = axVar.a(context);
                    f63399c = a5;
                    return a5;
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }

    public static synchronized String b(Context context) {
        synchronized (ay.class) {
            String str = f63399c;
            if (str != null && !TextUtils.isEmpty(str)) {
                return f63399c;
            }
            return a(context);
        }
    }

    public static synchronized String c(Context context) {
        synchronized (ay.class) {
            if (context == null) {
                return null;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return null;
            }
            if (bk.c()) {
                b();
                ax axVar = f63400d;
                if (axVar != null) {
                    try {
                        String a5 = axVar.a(context);
                        f63402f = a5;
                        return a5;
                    } catch (Throwable unused) {
                    }
                }
            }
            return null;
        }
    }

    public static synchronized String d(Context context) {
        synchronized (ay.class) {
            String str = f63402f;
            if (str != null && !TextUtils.isEmpty(str)) {
                return f63402f;
            }
            return c(context);
        }
    }

    private static void b() {
        if (f63400d != null || f63401e) {
            return;
        }
        synchronized (ay.class) {
            if (f63400d == null && !f63401e) {
                f63400d = ba.b();
                f63401e = true;
            }
        }
    }

    private static void a() {
        if (f63397a != null || f63398b) {
            return;
        }
        synchronized (ay.class) {
            if (f63397a == null && !f63398b) {
                f63397a = ba.a();
                f63398b = true;
            }
        }
    }
}
