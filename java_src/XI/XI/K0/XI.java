package XI.XI.K0;

import XI.K0.XI.XI;
import XI.xo.XI.XI.CA;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class XI {
    public static boolean K0;

    /* renamed from: XI  reason: collision with root package name */
    public static boolean f16XI;

    public static Context CA(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    public static String K0(Context context) {
        XI.CA.XI.K0 XI2 = XI.CA.XI.K0.XI(context);
        if (XI2 == null) {
            return null;
        }
        String str = XI.CA.XI.K0.WI;
        if (str != null) {
            return str;
        }
        XI2.XI(0, null);
        if (XI.CA.XI.K0.kM == null) {
            XI.CA.XI.K0.XI(XI.CA.XI.K0.f6XI, 0, null);
        }
        return XI.CA.XI.K0.WI;
    }

    public static String XI(Context context, String str) {
        XI.CA.XI.K0 XI2 = XI.CA.XI.K0.XI(context);
        if (XI2 == null) {
            return null;
        }
        String str2 = XI.CA.XI.K0.cs;
        if (str2 != null) {
            return str2;
        }
        XI2.XI(2, str);
        if (XI.CA.XI.K0.CA == null && XI.CA.XI.K0.cs != null) {
            XI.CA.XI.K0.XI(XI.CA.XI.K0.f6XI, 2, str);
        }
        return XI.CA.XI.K0.cs;
    }

    public static final boolean XI() {
        Context context = null;
        try {
            Method method = Class.forName(InstrumentationProxy.f64868d).getMethod("currentApplication", new Class[0]);
            method.setAccessible(true);
            context = (Context) method.invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.toString();
        }
        if (context == null) {
            return false;
        }
        return CA.XI().XI(context, false);
    }

    public static String kM(Context context) {
        XI.CA.XI.K0 XI2 = XI.CA.XI.K0.XI(context);
        if (XI2 == null || Build.VERSION.SDK_INT == 28) {
            return null;
        }
        String str = XI.CA.XI.K0.bs;
        if (str != null) {
            return str;
        }
        String packageName = XI.CA.XI.K0.f6XI.getPackageName();
        XI2.XI(1, packageName);
        if (XI.CA.XI.K0.xo == null && XI.CA.XI.K0.bs != null) {
            XI.CA.XI.K0.XI(XI.CA.XI.K0.f6XI, 1, packageName);
        }
        return XI.CA.XI.K0.bs;
    }

    public static void xo(Context context) {
        if (f16XI) {
            return;
        }
        XI.K0 k02 = XI.K0.C0000K0.f10XI;
        Context CA = CA(context);
        k02.getClass();
        boolean z4 = false;
        try {
            PackageInfo packageInfo = CA.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (packageInfo != null) {
                if (packageInfo.versionCode >= 1) {
                    z4 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        K0 = z4;
        f16XI = true;
    }

    public static String K0(Context context, String str) {
        XI.CA.XI.K0 XI2 = XI.CA.XI.K0.XI(context);
        if (XI2 == null) {
            return null;
        }
        String str2 = XI.CA.XI.K0.bs;
        if (str2 != null) {
            return str2;
        }
        XI2.XI(1, str);
        if (XI.CA.XI.K0.xo == null && XI.CA.XI.K0.bs != null) {
            XI.CA.XI.K0.XI(XI.CA.XI.K0.f6XI, 1, str);
        }
        return XI.CA.XI.K0.bs;
    }

    public static String XI(Context context) {
        XI.CA.XI.K0 XI2 = XI.CA.XI.K0.XI(context);
        if (XI2 == null || Build.VERSION.SDK_INT == 28) {
            return null;
        }
        String str = XI.CA.XI.K0.cs;
        if (str != null) {
            return str;
        }
        String packageName = XI.CA.XI.K0.f6XI.getPackageName();
        XI2.XI(2, packageName);
        if (XI.CA.XI.K0.CA == null && XI.CA.XI.K0.cs != null) {
            XI.CA.XI.K0.XI(XI.CA.XI.K0.f6XI, 2, packageName);
        }
        return XI.CA.XI.K0.cs;
    }
}
