package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.aw;
import com.umeng.commonsdk.config.FieldManager;
/* compiled from: HonorOaidTracker.java */
/* loaded from: classes6.dex */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f64422a = aw.b().b(aw.f63381l);

    /* renamed from: b  reason: collision with root package name */
    public static final String f64423b = "key_umeng_sp_honor_oaid";

    /* renamed from: c  reason: collision with root package name */
    private static final String f64424c = "honor_oaid";

    /* renamed from: d  reason: collision with root package name */
    private Context f64425d;

    public c(Context context) {
        super(f64424c);
        this.f64425d = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            try {
                SharedPreferences sharedPreferences = this.f64425d.getSharedPreferences(f64422a, 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(f64423b, "");
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
