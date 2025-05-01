package com.tencent.stat.common;

import android.content.Context;
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static long f62955a = -1;

    static long a(Context context, String str) {
        return p.a(context, str, f62955a);
    }

    static void a(Context context, String str, long j4) {
        p.b(context, str, j4);
    }

    public static synchronized boolean a(Context context) {
        boolean z4;
        synchronized (f.class) {
            long a5 = a(context, "1.6.2_begin_protection");
            long a6 = a(context, "1.6.2_end__protection");
            if (a5 <= 0 || a6 != f62955a) {
                if (a5 == f62955a) {
                    a(context, "1.6.2_begin_protection", System.currentTimeMillis());
                }
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public static synchronized void b(Context context) {
        synchronized (f.class) {
            if (a(context, "1.6.2_end__protection") == f62955a) {
                a(context, "1.6.2_end__protection", System.currentTimeMillis());
            }
        }
    }
}
