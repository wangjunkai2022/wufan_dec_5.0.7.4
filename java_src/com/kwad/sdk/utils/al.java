package com.kwad.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.kwad.sdk.api.core.fragment.FileProvider;
import com.kwad.sdk.service.ServiceProvider;
import java.io.File;
/* loaded from: classes5.dex */
public final class al {

    /* loaded from: classes5.dex */
    public interface a {
        void d(Throwable th);

        void oK();
    }

    public static boolean a(@Nullable String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Context context = ServiceProvider.getContext();
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.addFlags(3);
            Uri uriForFile = Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(context, context.getPackageName() + ".adFileProvider", file) : Uri.fromFile(file);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                context.grantUriPermission(resolveInfo.activityInfo.packageName, uriForFile, 3);
            }
            context.startActivity(intent);
            if (aVar != null) {
                aVar.oK();
                return true;
            }
            return true;
        } catch (Throwable th) {
            if (aVar != null) {
                aVar.d(th);
            }
            return false;
        }
    }

    public static boolean an(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int ao(@Nullable Context context, String str) {
        if (context == null || str == null || c.bS(context)) {
            return -1;
        }
        try {
            if (context.getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55589i) != 0) {
                    return -1;
                }
                String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                File file = new File(absolutePath + "/Android/data/" + str);
                return (file.exists() && file.isDirectory()) ? 1 : 0;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean ap(@Nullable Context context, @Nullable String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            com.kwad.sdk.core.e.c.d("PackageUtil", "openApp context: " + context);
            launchIntentForPackage.setFlags(337641472);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void at(String str, String str2) {
        com.kwad.sdk.core.e.c.w("PackageUtil", "saveDownloadFile " + str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            if (!file.exists()) {
                com.kwad.sdk.core.e.c.w("PackageUtil", "cannot save package, download apk is not exists.");
                return;
            }
            Context context = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext();
            if (context == null) {
                return;
            }
            y.f(context, str2, file.length());
            try {
                y.g(context, str2, com.kwad.sdk.utils.a.getFileMD5(file));
                return;
            } catch (Exception e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
                return;
            }
        }
        com.kwad.sdk.core.e.c.w("PackageUtil", "cannot save package, has no download apk info.");
    }

    public static int au(String str, String str2) {
        ApplicationInfo applicationInfo;
        com.kwad.sdk.core.e.c.w("PackageUtil", "isPackageChanged " + str + " packageName " + str2);
        Context context = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext();
        if (context == null) {
            return 0;
        }
        long V = y.V(context, str);
        String W = y.W(context, str);
        if (!TextUtils.isEmpty(W) && V > 0) {
            try {
                PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(str2, 0);
                if (!TextUtils.isEmpty(str2) && packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && !TextUtils.isEmpty(applicationInfo.publicSourceDir)) {
                    File file = new File(packageInfo.applicationInfo.publicSourceDir);
                    if (!file.exists()) {
                        com.kwad.sdk.core.e.c.w("PackageUtil", "cannot judge package, insgtalled apk is not exists.");
                        return 0;
                    } else if (V != file.length()) {
                        return 1;
                    } else {
                        if (TextUtils.isEmpty(W)) {
                            com.kwad.sdk.core.e.c.w("PackageUtil", "cannot judge package, cannot calculate md5 of download file.");
                            return 0;
                        }
                        String fileMD5 = com.kwad.sdk.utils.a.getFileMD5(file);
                        if (!TextUtils.isEmpty(fileMD5)) {
                            return W.equalsIgnoreCase(fileMD5) ? 2 : 1;
                        }
                        com.kwad.sdk.core.e.c.w("PackageUtil", "cannot judge package, cannot calculate md5 of installed file.");
                        return 0;
                    }
                }
                com.kwad.sdk.core.e.c.w("PackageUtil", "cannot judge package, cannot get installed apk info.");
                return 0;
            } catch (PackageManager.NameNotFoundException e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
                return 0;
            }
        }
        com.kwad.sdk.core.e.c.w("PackageUtil", "cannot judge package, has no download apk info.");
        return 0;
    }

    public static boolean gO(@Nullable String str) {
        return a(str, null);
    }

    public static String gP(String str) {
        PackageInfo packageArchiveInfo;
        if (!new File(str).exists()) {
            com.kwad.sdk.core.e.c.w("PackageUtil", "cannot save package, download apk is not exists.");
            return null;
        }
        Context context = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext();
        if (context == null || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1)) == null) {
            return null;
        }
        return packageArchiveInfo.applicationInfo.packageName;
    }
}
