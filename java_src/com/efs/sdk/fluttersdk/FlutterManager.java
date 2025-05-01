package com.efs.sdk.fluttersdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import java.util.Map;
/* loaded from: classes2.dex */
public class FlutterManager {
    public static final String TAG = "FlutterManager";

    /* renamed from: a  reason: collision with root package name */
    private static EfsReporter f10452a = null;

    /* renamed from: b  reason: collision with root package name */
    private static FlutterConfigManager f10453b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Context f10454c = null;
    public static boolean isDebug = true;

    public static Map<String, Object> getCloudConfig() {
        FlutterConfigManager flutterConfigManager = f10453b;
        if (flutterConfigManager != null) {
            return flutterConfigManager.getCloudConfig();
        }
        return null;
    }

    public static FlutterConfigManager getFlutterConfigManager() {
        return f10453b;
    }

    public static long getLongValue(String str) {
        Context context = f10454c;
        if (context == null) {
            Log.e(TAG, "Flutter Manager not init!");
            return 0L;
        }
        try {
            return context.getSharedPreferences("efs_flutter_bridge", 0).getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static Map<String, Object> getNativeParams() {
        FlutterConfigManager flutterConfigManager = f10453b;
        if (flutterConfigManager != null) {
            return flutterConfigManager.getNativeParams();
        }
        return null;
    }

    public static EfsReporter getReporter() {
        return f10452a;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            Log.e(TAG, "init Flutter manager error! parameter is null!");
            return;
        }
        f10454c = context;
        f10452a = efsReporter;
        f10453b = new FlutterConfigManager(context, efsReporter);
    }

    public static boolean putLongValue(String str, long j4) {
        Context context = f10454c;
        if (context == null) {
            Log.e(TAG, "Flutter Manager not init!");
            return false;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("efs_flutter_bridge", 0).edit();
            edit.putLong(str, j4);
            edit.apply();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
