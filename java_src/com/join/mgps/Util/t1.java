package com.join.mgps.Util;

import android.text.TextUtils;
/* compiled from: SafeMethods.java */
/* loaded from: classes3.dex */
public final class t1 {
    public static void a(Thread thread, int i4) {
        if (thread == null || i4 < 0) {
            return;
        }
        try {
            thread.join(i4);
        } catch (InterruptedException unused) {
        }
    }

    public static void b(int i4) {
        try {
            Thread.sleep(i4);
        } catch (InterruptedException unused) {
        }
    }

    public static boolean c(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            return z4;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z4;
        }
    }
}
