package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
/* loaded from: classes5.dex */
public class wv {
    public static int i(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.p.ky().getResources().getIdentifier(str, "style", com.ss.android.socialbase.downloader.downloader.p.ky().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int m(String str) {
        return vv(com.ss.android.socialbase.downloader.downloader.p.ky(), str);
    }

    public static int o(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.p.ky().getResources().getIdentifier(str, "id", com.ss.android.socialbase.downloader.downloader.p.ky().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int p(String str) {
        try {
            return vv(str, com.ss.android.socialbase.downloader.downloader.p.ky().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int u(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.p.ky().getResources().getIdentifier(str, TypedValues.Custom.S_COLOR, com.ss.android.socialbase.downloader.downloader.p.ky().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int vv(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.p.ky().getResources().getIdentifier(str, "layout", com.ss.android.socialbase.downloader.downloader.p.ky().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int m(String str, String str2) {
        try {
            return com.ss.android.socialbase.downloader.downloader.p.ky().getResources().getIdentifier(str, "attr", str2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int vv(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int vv(String str, String str2) {
        try {
            return com.ss.android.socialbase.downloader.downloader.p.ky().getResources().getIdentifier(str, "drawable", str2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }
}
