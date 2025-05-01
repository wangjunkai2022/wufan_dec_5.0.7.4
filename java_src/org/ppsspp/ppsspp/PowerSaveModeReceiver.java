package org.ppsspp.ppsspp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import com.tencent.bugly.Bugly;
/* loaded from: classes7.dex */
public class PowerSaveModeReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f72915a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f72916b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final String f72917c = "PowerSaveModeReceiver";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class a extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f72918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Handler handler, Activity activity) {
            super(handler);
            this.f72918a = activity;
        }

        @Override // android.database.ContentObserver
        @TargetApi(16)
        public void onChange(boolean z4, Uri uri) {
            super.onChange(z4, uri);
            String path = uri.getPath();
            if (path == null) {
                return;
            }
            String substring = path.substring(path.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1, path.length());
            if (substring.equals("user_powersaver_enable") || substring.equals("psm_switch") || substring.equals("powersaving_switch")) {
                PowerSaveModeReceiver.f(this.f72918a);
            }
        }
    }

    private static boolean b(Context context, String str) {
        String string = Settings.System.getString(context.getContentResolver(), str);
        return string != null && string.equals("1");
    }

    private static boolean c(Context context) {
        if (b(context, "user_powersaver_enable")) {
            return true;
        }
        String string = Settings.System.getString(context.getContentResolver(), "powersaving_switch");
        return (!(string != null && !string.equals("")) && b(context, "psm_switch")) || b(context, "powersaving_switch");
    }

    @TargetApi(21)
    private static boolean d(Context context) {
        return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
    }

    public static void e(Activity activity) {
        f(activity);
        if (Build.VERSION.SDK_INT >= 16) {
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, new a(null, activity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            f72915a = d(context);
        } else {
            f72915a = c(context);
        }
        if (PpssppActivity.libraryLoaded) {
            try {
                if (!f72916b && !f72915a) {
                    NativeApp.sendMessage("core_powerSaving", Bugly.SDK_IS_DEV);
                }
                NativeApp.sendMessage("core_powerSaving", "true");
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in sendPowerSaving: ");
                sb.append(e5.toString());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.BATTERY_LOW")) {
            f72916b = true;
        } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
            f72916b = false;
        }
        f(context);
    }
}
