package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
/* compiled from: UTDIdTracker.java */
/* loaded from: classes6.dex */
public class k extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64452a = "utdid";

    /* renamed from: b  reason: collision with root package name */
    private Context f64453b;

    public k(Context context) {
        super("utdid");
        this.f64453b = context;
    }

    private String g() {
        try {
            return this.f64453b.getSharedPreferences("Alvin2", 0).getString("UTDID2", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private String h() {
        try {
            return this.f64453b.getSharedPreferences("um_push_ut", 0).getString("d_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.f64619u)) {
                String h4 = h();
                return TextUtils.isEmpty(h4) ? g() : h4;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
