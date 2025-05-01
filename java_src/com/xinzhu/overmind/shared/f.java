package com.xinzhu.overmind.shared;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: OemUtils.kt */
/* loaded from: classes6.dex */
public final class f {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final f f68286a = new f();

    private f() {
    }

    private final void a(Context context) {
        try {
            u(context, "com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity");
        } catch (Exception unused) {
            u(context, "com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity");
        }
    }

    private final void b(Context context) {
        u(context, "com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity");
    }

    private final void c(Context context) {
        v(this, context, "com.meizu.safe", null, 4, null);
    }

    private final void d(Context context) {
        try {
            try {
                try {
                    v(this, context, "com.coloros.phonemanager", null, 4, null);
                } catch (Exception unused) {
                    v(this, context, "com.oppo.safe", null, 4, null);
                }
            } catch (Exception unused2) {
                v(this, context, "com.coloros.oppoguardelf", null, 4, null);
            }
        } catch (Exception unused3) {
            v(this, context, "com.coloros.safecenter", null, 4, null);
        }
    }

    private final void f(Context context) {
        try {
            v(this, context, "com.samsung.android.sm_cn", null, 4, null);
        } catch (Exception unused) {
            v(this, context, "com.samsung.android.sm", null, 4, null);
        }
    }

    private final void g(Context context) {
        v(this, context, "com.smartisanos.security", null, 4, null);
    }

    private final void h(Context context) {
        v(this, context, "com.iqoo.secure", null, 4, null);
    }

    private final void i(Context context) {
        u(context, "com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
    }

    private static final void s(Context context, ActivityResultLauncher<Intent> activityResultLauncher, String str, String str2) {
        if (!(str2 == null || str2.length() == 0)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, str2));
            intent.addFlags(268435456);
            activityResultLauncher.launch(intent);
            return;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            activityResultLauncher.launch(launchIntentForPackage);
        }
    }

    static /* synthetic */ void t(Context context, ActivityResultLauncher activityResultLauncher, String str, String str2, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            str2 = null;
        }
        s(context, activityResultLauncher, str, str2);
    }

    private final void u(Context context, String str, String str2) {
        if (!(str2 == null || str2.length() == 0)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, str2));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
        }
    }

    static /* synthetic */ void v(f fVar, Context context, String str, String str2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        fVar.u(context, str, str2);
    }

    public final void e(@NotNull Context context, @NotNull ActivityResultContract<Void, Boolean> activityResultContract) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityResultContract, "activityResultContract");
        if (j()) {
            a(context);
        } else if (q()) {
            i(context);
        } else if (m()) {
            d(context);
        } else if (p()) {
            h(context);
        } else if (l()) {
            c(context);
        } else if (n()) {
            f(context);
        } else if (k()) {
            b(context);
        } else if (o()) {
            g(context);
        }
    }

    public final boolean j() {
        String BRAND = Build.BRAND;
        if (BRAND == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = BRAND.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!Intrinsics.areEqual(lowerCase, "huawei")) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
            String lowerCase2 = BRAND.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (!Intrinsics.areEqual(lowerCase2, "honor")) {
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        String BRAND = Build.BRAND;
        if (BRAND != null) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "letv")) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        String BRAND = Build.BRAND;
        if (BRAND != null) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "meizu")) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        String BRAND = Build.BRAND;
        if (BRAND != null) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "oppo")) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        String BRAND = Build.BRAND;
        if (BRAND != null) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "samsung")) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        String BRAND = Build.BRAND;
        if (BRAND != null) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "smartisan")) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        String BRAND = Build.BRAND;
        if (BRAND != null) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "vivo")) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        String BRAND = Build.BRAND;
        if (BRAND != null) {
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "xiaomi")) {
                return true;
            }
        }
        return false;
    }

    public final void r(@NotNull Context context, @NotNull ActivityResultLauncher<Intent> launcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        if (j()) {
            try {
                s(context, launcher, "com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity");
            } catch (Exception unused) {
                s(context, launcher, "com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity");
            }
        } else if (q()) {
            s(context, launcher, "com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
        } else if (m()) {
            try {
                try {
                    try {
                        t(context, launcher, "com.coloros.phonemanager", null, 8, null);
                    } catch (Exception unused2) {
                        t(context, launcher, "com.coloros.oppoguardelf", null, 8, null);
                    }
                } catch (Exception unused3) {
                    t(context, launcher, "com.coloros.safecenter", null, 8, null);
                }
            } catch (Exception unused4) {
                t(context, launcher, "com.oppo.safe", null, 8, null);
            }
        } else if (p()) {
            t(context, launcher, "com.iqoo.secure", null, 8, null);
        } else if (l()) {
            t(context, launcher, "com.meizu.safe", null, 8, null);
        } else if (n()) {
            try {
                t(context, launcher, "com.samsung.android.sm_cn", null, 8, null);
            } catch (Exception unused5) {
                t(context, launcher, "com.samsung.android.sm", null, 8, null);
            }
        } else if (k()) {
            s(context, launcher, "com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity");
        } else if (o()) {
            t(context, launcher, "com.smartisanos.security", null, 8, null);
        } else if (Build.VERSION.SDK_INT >= 23) {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            launcher.launch(intent);
        }
    }
}
