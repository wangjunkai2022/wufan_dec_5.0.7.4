package com.kwad.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public final class bl {
    public static void a(long j4, int i4, @Nullable Context context) {
        if (j4 == 0 || context == null || i4 <= 0 || i4 > 100) {
            return;
        }
        long currentTimeMillis = j4 - System.currentTimeMillis();
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ksadsdk_pref", 0);
            if (sharedPreferences == null) {
                return;
            }
            if (Math.abs(currentTimeMillis) / com.kuaishou.weapon.p0.bi.f55326s > i4) {
                sharedPreferences.edit().putLong("key_time_diff_s2c", currentTimeMillis).apply();
            } else {
                sharedPreferences.edit().remove("key_time_diff_s2c").apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static long v(@Nullable Context context, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z4) {
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("ksadsdk_pref", 0);
                if (sharedPreferences == null) {
                    return Math.abs(currentTimeMillis);
                }
                long j4 = sharedPreferences.getLong("key_time_diff_s2c", 0L);
                if (j4 != 0) {
                    return currentTimeMillis + j4;
                }
            }
            return Math.abs(currentTimeMillis);
        }
        return currentTimeMillis;
    }
}
