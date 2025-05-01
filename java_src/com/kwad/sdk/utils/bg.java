package com.kwad.sdk.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.kwad.sdk.service.ServiceProvider;
import java.util.Map;
import java.util.Set;
@Deprecated
/* loaded from: classes5.dex */
public class bg {
    static final String TAG = "bg";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, int i4) {
        SharedPreferences gY = gY(str);
        if (gY == null) {
            return;
        }
        gY.edit().putInt(str2, i4).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void aw(String str, String str2) {
        SharedPreferences gY = gY(str);
        if (gY == null) {
            return;
        }
        gY.edit().remove(str2).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(String str, String str2, int i4) {
        SharedPreferences gY = gY(str);
        return gY == null ? i4 : gY.getInt(str2, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(String str, String str2, String str3) {
        a(str, str2, str3, false);
    }

    @Nullable
    public static SharedPreferences gY(String str) {
        try {
            return ServiceProvider.Lw().getSharedPreferences(str, 0);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(String str, String str2, String str3) {
        String string;
        try {
            SharedPreferences gY = gY(str);
            if (gY != null && (string = gY.getString(str2, str3)) != null && !TextUtils.isEmpty(string)) {
                return (TextUtils.equals(string, str3) || !com.kwad.sdk.core.a.c.dT(string)) ? string : com.kwad.sdk.core.a.c.dS(string);
            }
            return str3;
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(String str, String str2, String str3) {
        if (com.kwad.sdk.core.a.c.dT(str)) {
            return;
        }
        g(str2, str3, com.kwad.sdk.core.a.c.dR(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(String str, String str2, boolean z4) {
        SharedPreferences gY = gY(str);
        if (gY == null) {
            return;
        }
        gY.edit().putBoolean(str2, z4).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(String str, String str2, boolean z4) {
        SharedPreferences gY = gY(str);
        return gY == null ? z4 : gY.getBoolean(str2, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, long j4) {
        SharedPreferences gY = gY(str);
        if (gY == null) {
            return;
        }
        gY.edit().putLong(str2, j4).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(String str, String str2, long j4) {
        SharedPreferences gY = gY(str);
        return gY == null ? j4 : gY.getLong(str2, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, String str3, boolean z4) {
        try {
            SharedPreferences gY = gY(str);
            if (gY == null) {
                return;
            }
            if (z4 && !com.kwad.sdk.core.a.c.dT(str3)) {
                gY.edit().putString(str2, com.kwad.sdk.core.a.c.dR(str3)).apply();
                return;
            }
            gY.edit().putString(str2, str3).apply();
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(String str, Map<String, T> map) {
        SharedPreferences gY = gY(str);
        if (gY == null) {
            return;
        }
        SharedPreferences.Editor edit = gY.edit();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            try {
                a(edit, entry.getKey(), entry.getValue());
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.e(TAG, Log.getStackTraceString(th));
            }
        }
        edit.apply();
    }

    private static void a(SharedPreferences.Editor editor, String str, Object obj) {
        if (str != null) {
            if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else if (obj instanceof String) {
                editor.putString(str, String.valueOf(obj));
            }
        }
    }
}
