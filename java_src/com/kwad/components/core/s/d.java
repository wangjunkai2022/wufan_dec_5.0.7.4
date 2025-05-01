package com.kwad.components.core.s;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.s;
import com.uc.crashsdk.export.LogType;
/* loaded from: classes5.dex */
public final class d {
    public static void a(@NonNull Activity activity, int i4, boolean z4) {
        a(activity, 0, true, true);
    }

    private static void b(@NonNull Activity activity, int i4, boolean z4) {
        Window window = activity.getWindow();
        int i5 = Build.VERSION.SDK_INT;
        int i6 = LogType.UNEXP_ANR;
        if (i5 < 21) {
            if (i5 >= 19) {
                window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
                return;
            }
            return;
        }
        if (z4 && i5 >= 23) {
            i6 = 9472;
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.addFlags(Integer.MIN_VALUE);
            if (au.MQ()) {
                a(activity, true);
            } else if (au.MR()) {
                k.b(activity, true);
            }
        }
        window.getDecorView().setSystemUiVisibility(i6);
        window.setStatusBarColor(i4);
        window.setNavigationBarColor(window.getNavigationBarColor());
    }

    public static boolean rG() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static void a(@NonNull Activity activity, int i4, boolean z4, boolean z5) {
        if (rG()) {
            b(activity, i4, z4);
            if (z5) {
                return;
            }
            activity.findViewById(16908290).setPadding(0, com.kwad.sdk.c.a.a.getStatusBarHeight(activity), 0, 0);
        }
    }

    private static boolean a(@NonNull Activity activity, boolean z4) {
        try {
            int intValue = ((Integer) s.ap("android.view.MiuiWindowManager$LayoutParams", "EXTRA_FLAG_STATUS_BAR_DARK_MODE")).intValue();
            s.callMethod(activity.getWindow(), "setExtraFlags", Integer.valueOf(intValue), Integer.valueOf(intValue));
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
