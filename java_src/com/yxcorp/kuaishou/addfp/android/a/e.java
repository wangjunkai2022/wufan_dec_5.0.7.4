package com.yxcorp.kuaishou.addfp.android.a;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f68584a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences.Editor f68585b;

    public e(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("kscfg_outdfp", 0);
            this.f68584a = sharedPreferences;
            this.f68585b = sharedPreferences.edit();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(String str) {
        this.f68585b.putString("kwtk", str);
        this.f68585b.commit();
    }

    public boolean a() {
        return this.f68584a.getBoolean("xytk", true);
    }

    public String b() {
        return this.f68584a.getString("kwtk", "");
    }
}
