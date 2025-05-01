package com.ss.android.socialbase.downloader.constants;

import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class o {

    /* renamed from: i  reason: collision with root package name */
    public static long f60945i = 512000;

    /* renamed from: m  reason: collision with root package name */
    public static volatile String f60946m = "";

    /* renamed from: n  reason: collision with root package name */
    public static long f60947n = 31457280;

    /* renamed from: o  reason: collision with root package name */
    public static long f60948o = 50;

    /* renamed from: p  reason: collision with root package name */
    public static volatile String f60949p = "";
    public static long qv = 10485760;

    /* renamed from: u  reason: collision with root package name */
    public static long f60950u = 5242880;
    public static volatile String vv = "";
    public static final JSONObject wv = new JSONObject();

    public static void vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vv = str;
    }
}
