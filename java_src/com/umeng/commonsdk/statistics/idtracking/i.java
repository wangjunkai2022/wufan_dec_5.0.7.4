package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.aw;
import com.umeng.commonsdk.config.FieldManager;
/* compiled from: OaidTracking.java */
/* loaded from: classes6.dex */
public class i extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f64446a = aw.b().b(aw.f63381l);

    /* renamed from: b  reason: collision with root package name */
    public static final String f64447b = "key_umeng_sp_oaid";

    /* renamed from: c  reason: collision with root package name */
    public static final String f64448c = "key_umeng_sp_oaid_required_time";

    /* renamed from: d  reason: collision with root package name */
    private static final String f64449d = "oaid";

    /* renamed from: e  reason: collision with root package name */
    private Context f64450e;

    public i(Context context) {
        super(f64449d);
        this.f64450e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            try {
                SharedPreferences sharedPreferences = this.f64450e.getSharedPreferences(f64446a, 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(f64447b, "");
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
