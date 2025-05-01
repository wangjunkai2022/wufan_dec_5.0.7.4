package com.ss.android.socialbase.downloader.p;

import android.text.TextUtils;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: m  reason: collision with root package name */
    private static AbstractC0652vv f61326m = null;
    private static int vv = 4;

    /* renamed from: com.ss.android.socialbase.downloader.p.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0652vv {
    }

    public static void i(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (vv <= 5) {
            m(str);
        }
        if (f61326m != null) {
            m(str);
        }
    }

    public static String m(String str) {
        return !TextUtils.isEmpty(str) ? "Downloader-".concat(String.valueOf(str)) : "DownloaderLogger";
    }

    public static void o(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (vv <= 6) {
            m(str);
        }
        if (f61326m != null) {
            m(str);
        }
    }

    public static void p(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (vv <= 4) {
            m(str);
        }
        if (f61326m != null) {
            m(str);
        }
    }

    public static void vv(int i4) {
        vv = i4;
    }

    public static boolean vv() {
        return vv <= 3;
    }

    public static void m(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (vv <= 3) {
            m(str);
        }
        if (f61326m != null) {
            m(str);
        }
    }

    public static void vv(String str, String str2) {
        if (str2 == null || f61326m == null) {
            return;
        }
        m(str);
    }

    public static void p(String str) {
        i("DownloaderLogger", str);
    }

    public static void vv(String str) {
        m("DownloaderLogger", str);
    }

    public static void vv(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (vv <= 3) {
            m(str);
        }
        if (f61326m != null) {
            m(str);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (vv <= 6) {
            m(str);
        }
        if (f61326m != null) {
            m(str);
        }
    }
}
