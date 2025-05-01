package com.join.mgps.Util;

import android.content.Context;
import android.os.Environment;
import java.io.File;
/* compiled from: Constants.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f28101a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final long f28102b = 83886080;

    /* renamed from: c  reason: collision with root package name */
    public static final long f28103c = 104857600;

    /* renamed from: d  reason: collision with root package name */
    public static String f28104d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f28105e = f28104d + "/wufan91/";

    /* renamed from: f  reason: collision with root package name */
    public static String f28106f = f28104d + "/wufan91/";

    /* renamed from: g  reason: collision with root package name */
    public static String f28107g = f28104d + "/wufan91/";

    /* renamed from: h  reason: collision with root package name */
    public static String f28108h = f28104d + "/wufan91/cloudRecord/cloud";

    /* renamed from: i  reason: collision with root package name */
    public static String f28109i = f28104d + "/wufan91/cloudRecord/marcket";

    /* renamed from: j  reason: collision with root package name */
    public static String f28110j = f28104d + "/wufan91/cloudRecord/endgame";

    /* renamed from: k  reason: collision with root package name */
    public static String f28111k = f28104d + "/wufan91/Image/";

    /* renamed from: l  reason: collision with root package name */
    public static String f28112l = f28104d + "/wufan91/.cache/";

    /* renamed from: m  reason: collision with root package name */
    public static String f28113m = f28112l + "avatar/";

    /* renamed from: n  reason: collision with root package name */
    public static String f28114n = f28112l + "crop/";

    /* renamed from: o  reason: collision with root package name */
    public static String f28115o = f28112l + "homePopupAd/";

    /* renamed from: p  reason: collision with root package name */
    public static String f28116p = f28104d + "/Android/obb";

    /* renamed from: q  reason: collision with root package name */
    public static String f28117q = f28104d + "/Android/data";

    /* renamed from: r  reason: collision with root package name */
    public static String f28118r = f28104d + "/Android";

    /* renamed from: s  reason: collision with root package name */
    public static String f28119s = "x-cos-meta-md5,etag";

    /* renamed from: t  reason: collision with root package name */
    public static String f28120t = "com.papa91.arc.base";

    /* renamed from: u  reason: collision with root package name */
    public static boolean f28121u = true;

    /* renamed from: v  reason: collision with root package name */
    public static final String f28122v = "10";

    public static File a() {
        return new File(f28114n, "temp_cropped.jpg");
    }

    public static File b(Context context) {
        File d5 = s1.d(context, null);
        if (d5 == null) {
            return new File(f28115o);
        }
        return new File(d5, "homePopupAd");
    }

    public static File c() {
        return new File(f28113m + "avatar.jpg");
    }

    public static File d(Context context) {
        File d5 = s1.d(context, null);
        if (d5 == null) {
            return new File(f28111k);
        }
        return new File(d5, "SplashImage");
    }

    public static void e(Context context) {
        if (context.getSharedPreferences("PrefDef", 4).getBoolean("firstShowUserPermiss", true)) {
            return;
        }
        if (context.getExternalFilesDir("") == null) {
            f28104d = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            f28104d = context.getExternalFilesDir("").getAbsolutePath();
        }
        f28105e = f28104d + "/wufan91/";
        f28106f = f28104d + "/wufan91/";
        f28107g = f28104d + "/wufan91/";
        f28108h = f28104d + "/wufan91/cloudRecord/cloud";
        f28109i = f28104d + "/wufan91/cloudRecord/marcket";
        f28110j = f28104d + "/wufan91/cloudRecord/endgame";
        f28111k = f28104d + "/wufan91/Image/";
        f28112l = f28104d + "/wufan91/.cache/";
        f28113m = f28112l + "avatar/";
        f28114n = f28112l + "crop/";
        f28115o = f28112l + "homePopupAd/";
        f28116p = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb";
        f28117q = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data";
    }
}
