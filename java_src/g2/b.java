package g2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* compiled from: PackageUtils.java */
/* loaded from: classes5.dex */
public class b {
    public static PackageInfo a(PackageManager packageManager, String str, int i4) {
        try {
            return packageManager.getPackageArchiveInfo(str, i4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int b(Context context, String str) {
        try {
            PackageInfo a5 = a(context.getPackageManager(), str, 0);
            if (a5 == null) {
                return -1;
            }
            return a5.versionCode;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int c(PackageManager packageManager, String str) {
        try {
            PackageInfo a5 = a(packageManager, str, 0);
            if (a5 == null) {
                return -1;
            }
            return a5.versionCode;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String d(Context context, String str) {
        try {
            PackageInfo a5 = a(context.getPackageManager(), str, 0);
            return a5 == null ? "0" : a5.versionName;
        } catch (Exception unused) {
            return "0";
        }
    }

    public static String e(PackageManager packageManager, String str) {
        try {
            PackageInfo a5 = a(packageManager, str, 0);
            return a5 == null ? "0" : a5.versionName;
        } catch (Exception unused) {
            return "0";
        }
    }
}
