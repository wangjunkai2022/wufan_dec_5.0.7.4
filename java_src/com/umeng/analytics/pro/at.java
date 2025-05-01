package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: SpWrapper.java */
/* loaded from: classes6.dex */
public class at {

    /* renamed from: a  reason: collision with root package name */
    public static final String f63358a = "cl_count";

    /* renamed from: b  reason: collision with root package name */
    public static final String f63359b = "interval_";

    /* renamed from: c  reason: collision with root package name */
    public static final String f63360c = "config_ts";

    /* renamed from: d  reason: collision with root package name */
    public static final String f63361d = "iucc_s1";

    /* renamed from: e  reason: collision with root package name */
    public static final String f63362e = "iucc_s2";

    /* renamed from: f  reason: collision with root package name */
    public static final String f63363f = "sdk_type_ver";

    /* renamed from: g  reason: collision with root package name */
    public static final String f63364g = "should_fetch";

    /* renamed from: h  reason: collision with root package name */
    private static final String f63365h = "ccg_sp_config_file";

    private at() {
    }

    public static SharedPreferences a(Context context) {
        if (context != null) {
            try {
                return context.getSharedPreferences(f63365h, 0);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
