package com.bytedance.pangle.util;

import android.content.SharedPreferences;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import java.util.Locale;
/* loaded from: classes2.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    private static volatile l f8629b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f8630a = Zeus.getAppApplication().getSharedPreferences("pangle_meta_data_sp", 0);

    private l() {
    }

    public static l a() {
        if (f8629b == null) {
            synchronized (l.class) {
                if (f8629b == null) {
                    f8629b = new l();
                }
            }
        }
        return f8629b;
    }

    public final String b(String str) {
        String string = this.f8630a.getString("HOST_IDENTITY_".concat(String.valueOf(str)), "");
        ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils getHostIdentity pluginPKg = " + str + ", hostIdentity = " + string);
        return string;
    }

    public final void c(String str, int i4, boolean z4) {
        SharedPreferences.Editor edit = this.f8630a.edit();
        edit.putBoolean("dex_remove_state_" + str + "_" + i4, z4);
        edit.apply();
    }

    public final void b(String str, int i4, boolean z4) {
        SharedPreferences.Editor edit = this.f8630a.edit();
        edit.putBoolean("dex_opt_state_" + str + "_" + i4, z4);
        edit.apply();
    }

    public final int a(String str) {
        int i4 = this.f8630a.getInt("PLUGIN_API_VERSION_".concat(String.valueOf(str)), 0);
        ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils getPluginApiVersion pluginPKg = " + str + ", pluginApiVersion = " + i4);
        return i4;
    }

    public final int b(String str, int i4) {
        return this.f8630a.getInt("remove_entry_flag_" + str + "_" + i4, 0);
    }

    public final void a(String str, int i4, boolean z4) {
        SharedPreferences.Editor edit = this.f8630a.edit();
        String str2 = "INSTALLED_" + str + "-" + i4;
        if (z4) {
            edit.putBoolean(str2, true);
        } else {
            edit.remove(str2);
        }
        edit.apply();
    }

    public final int b(String str, int i4, String str2) {
        return this.f8630a.getInt(str2 + "_failed_count_when_rm_entry_" + str + "_" + i4, 0);
    }

    public final boolean a(String str, int i4) {
        return this.f8630a.getBoolean(String.format(Locale.getDefault(), "INSTALLED_%s-%d", str, Integer.valueOf(i4)), false);
    }

    public final void a(String str, int i4, String str2) {
        int b5 = b(str, i4, str2);
        SharedPreferences.Editor edit = this.f8630a.edit();
        edit.putInt(str2 + "_failed_count_when_rm_entry_" + str + "_" + i4, b5 + 1);
        edit.apply();
    }
}
