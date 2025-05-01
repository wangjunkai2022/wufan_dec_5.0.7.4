package com.ss.android.socialbase.appdownloader.u.vv;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class o {
    private static PackageInfo m(@NonNull Context context, @NonNull File file, int i4) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            vv("unzip_getpackagearchiveinfo", "packageManager == null");
            return null;
        }
        try {
            return packageManager.getPackageArchiveInfo(file.getPath(), i4);
        } catch (Throwable th) {
            vv("unzip_getpackagearchiveinfo", "pm.getPackageArchiveInfo failed: " + th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        r13 = r1.getInputStream(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        r4 = r1;
        r5 = r2;
        r1 = null;
        r13 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.pm.PackageInfo vv(@androidx.annotation.NonNull java.io.File r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.u.vv.o.vv(java.io.File):android.content.pm.PackageInfo");
    }

    private static String vv(int i4) {
        return (i4 >>> 24) == 1 ? "android:" : "";
    }

    public static PackageInfo vv(@NonNull Context context, @NonNull File file, int i4) {
        int i5;
        if (com.ss.android.socialbase.downloader.wv.vv.vv(268435456) && (i5 = Build.VERSION.SDK_INT) >= 21 && i5 < 26) {
            try {
                return vv(file);
            } catch (Throwable th) {
                vv("getPackageInfo::unzip_getpackagearchiveinfo", th.getMessage());
            }
        }
        return m(context, file, i4);
    }

    private static void vv(@NonNull String str, @NonNull String str2) {
        if (com.ss.android.socialbase.downloader.downloader.p.n() == null) {
            return;
        }
        try {
            new JSONObject().put("message", str2);
        } catch (JSONException unused) {
        }
    }

    private static String vv(vv vvVar, int i4) {
        int m4 = vvVar.m(i4);
        int p4 = vvVar.p(i4);
        if (m4 == 3) {
            return vvVar.i(i4);
        }
        return m4 == 2 ? String.format("?%s%08X", vv(p4), Integer.valueOf(p4)) : (m4 < 16 || m4 > 31) ? String.format("<0x%X, type 0x%02X>", Integer.valueOf(p4), Integer.valueOf(m4)) : String.valueOf(p4);
    }

    public static String vv(Context context, PackageInfo packageInfo, String str) {
        ApplicationInfo applicationInfo;
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
            return null;
        }
        applicationInfo.sourceDir = str;
        applicationInfo.publicSourceDir = str;
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (OutOfMemoryError e5) {
            vv("getPackageInfo::fail_load_label", e5.getMessage());
            return null;
        }
    }
}
