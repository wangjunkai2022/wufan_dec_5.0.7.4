package com.ss.android.socialbase.appdownloader;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.papa91.common.BaseAppConfig;
import com.ss.android.socialbase.appdownloader.p.k;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import net.lingala.zip4j.util.e;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p {

    /* renamed from: m  reason: collision with root package name */
    private static NotificationChannel f60842m;
    private static int vv;

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(Context context, int i4, boolean z4) {
        if (com.ss.android.socialbase.downloader.n.vv.vv(i4).m("notification_opt_2") == 1) {
            com.ss.android.socialbase.downloader.notification.m.vv().u(i4);
        }
        vv((Activity) qv.vv().m());
        if (com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("install_queue_enable", 0) == 1) {
            return qv.vv().vv(context, i4, z4);
        }
        return m(context, i4, z4);
    }

    public static String m(long j4) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j4 < 1) {
            return "0 " + strArr[4];
        }
        for (int i4 = 0; i4 < 5; i4++) {
            long j5 = jArr[i4];
            if (j4 >= j5) {
                return vv(j4, j5, strArr[i4]);
            }
        }
        return null;
    }

    public static boolean p(Context context, DownloadInfo downloadInfo) {
        if (context == null || downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return false;
        }
        return m(context, downloadInfo, vv(context, downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName()));
    }

    private static String vv(long j4, long j5, String str, boolean z4) {
        double d5 = j4;
        if (j5 > 1) {
            double d6 = j5;
            Double.isNaN(d5);
            Double.isNaN(d6);
            d5 /= d6;
        }
        if (!z4 && !"GB".equals(str) && !"TB".equals(str)) {
            return new DecimalFormat("#").format(d5) + " " + str;
        }
        return new DecimalFormat("#.##").format(d5) + " " + str;
    }

    public static boolean p(String str) {
        return !TextUtils.isEmpty(str) && str.equals("application/vnd.android.package-archive");
    }

    public static List<String> p() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("application/vnd.android.package-archive");
        arrayList.add("application/ttpatch");
        return arrayList;
    }

    public static String vv(long j4) {
        return vv(j4, true);
    }

    private static JSONObject i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int m(final Context context, final int i4, final boolean z4) {
        final DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i4);
        if (downloadInfo != null && "application/vnd.android.package-archive".equals(downloadInfo.getMimeType()) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            final File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file.exists()) {
                com.ss.android.socialbase.downloader.downloader.p.m(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.p.2
                    @Override // java.lang.Runnable
                    public void run() {
                        i.k().b();
                        int vv2 = p.vv(context, i4, z4, downloadInfo, file);
                        if (vv2 == 1 && i.k().d() != null) {
                            i.k().d().vv(downloadInfo, null);
                        }
                        p.m(downloadInfo, z4, vv2);
                    }
                });
                return 1;
            }
        }
        m(downloadInfo, z4, 2);
        return 2;
    }

    public static String vv(long j4, boolean z4) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j4 < 1) {
            return "0 " + strArr[4];
        }
        for (int i4 = 0; i4 < 5; i4++) {
            long j5 = jArr[i4];
            if (j4 >= j5) {
                return vv(j4, j5, strArr[i4], z4);
            }
        }
        return null;
    }

    private static String vv(long j4, long j5, String str) {
        double d5 = j4;
        if (j5 > 1) {
            double d6 = j5;
            Double.isNaN(d5);
            Double.isNaN(d6);
            d5 /= d6;
        }
        if ("MB".equals(str)) {
            return new DecimalFormat("#").format(d5) + str;
        }
        return new DecimalFormat("#.##").format(d5) + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(DownloadInfo downloadInfo, boolean z4, int i4) {
        if (downloadInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("by_user", z4 ? 1 : 2);
            jSONObject.put("view_result", i4);
            jSONObject.put("real_package_name", downloadInfo.getFilePackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.p.ds().vv(downloadInfo.getId(), "install_view_result", jSONObject);
    }

    public static int vv(final Context context, final int i4, final boolean z4) {
        k n4 = i.k().n();
        if (n4 == null) {
            return i(context, i4, z4);
        }
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i4);
        vv = 1;
        n4.vv(downloadInfo, new com.ss.android.socialbase.appdownloader.p.wv() { // from class: com.ss.android.socialbase.appdownloader.p.1
            @Override // com.ss.android.socialbase.appdownloader.p.wv
            public void vv() {
                int unused = p.vv = p.i(context, i4, z4);
            }
        });
        return vv;
    }

    public static boolean m(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo) {
        return vv(context, downloadInfo, packageInfo, false);
    }

    public static int m(Context context, DownloadInfo downloadInfo) {
        if (context != null && downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            int appVersionCode = downloadInfo.getAppVersionCode();
            if (appVersionCode > 0) {
                return appVersionCode;
            }
            try {
                PackageInfo vv2 = vv(context, downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
                if (vv2 != null) {
                    int i4 = vv2.versionCode;
                    downloadInfo.setAppVersionCode(i4);
                    return i4;
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static int vv(Context context, int i4, boolean z4, DownloadInfo downloadInfo, File file) {
        PackageInfo packageInfo;
        Intent vv2;
        Process process;
        if (file.getPath().startsWith(Environment.getDataDirectory().getAbsolutePath())) {
            try {
                process = Runtime.getRuntime().exec("chmod 555 " + file.getAbsolutePath());
                try {
                    process.waitFor();
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                    } finally {
                        if (process != null) {
                            process.destroy();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                process = null;
            }
        }
        try {
            packageInfo = vv(downloadInfo, file);
            if (packageInfo != null) {
                try {
                    downloadInfo.setFilePackageName(packageInfo.packageName);
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            th = null;
        } catch (Throwable th4) {
            th = th4;
            packageInfo = null;
        }
        if (i.k().p() != null) {
            if (packageInfo == null) {
                BaseException baseException = new BaseException(2001, th);
                i.k().p().vv(downloadInfo, baseException, baseException.getErrorCode());
            } else {
                i.k().p().vv(downloadInfo, null, 11);
            }
        }
        if (vv(context, downloadInfo, packageInfo)) {
            return 2;
        }
        if (packageInfo != null && com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("install_callback_error")) {
            downloadInfo.getTempCacheData().put("extra_apk_package_name", packageInfo.packageName);
            downloadInfo.getTempCacheData().put("extra_apk_version_code", Integer.valueOf(packageInfo.versionCode));
        }
        int[] iArr = new int[1];
        if (m(context, downloadInfo, packageInfo)) {
            vv2 = context.getPackageManager().getLaunchIntentForPackage(packageInfo.packageName);
        } else if (!z4 && vv(context, i4, file)) {
            downloadInfo.getTempCacheData().put("extra_silent_install_succeed", Boolean.TRUE);
            return 1;
        } else {
            vv2 = vv(context, downloadInfo, file, z4, iArr);
        }
        if (vv2 == null) {
            return iArr[0] == 1 ? 2 : 0;
        }
        vv2.addFlags(268435456);
        if (downloadInfo.getLinkMode() > 0 && com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("app_install_return_result", 0) == 1) {
            vv2.putExtra("android.intent.extra.RETURN_RESULT", true);
        }
        if (iArr[0] == 0 && m.vv(context, downloadInfo, vv2, z4)) {
            return 1;
        }
        return vv(context, vv2);
    }

    public static String m() {
        return com.ss.android.socialbase.downloader.wv.u.o();
    }

    public static boolean m(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        if (!jSONObject.optBoolean("bind_app", false)) {
            if (jSONObject.optBoolean("auto_install_with_notification", true)) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(26)
    public static String m(@NonNull Context context) {
        try {
            if (f60842m == null) {
                NotificationChannel notificationChannel = new NotificationChannel("111111", "channel_appdownloader", 3);
                f60842m = notificationChannel;
                notificationChannel.setSound(null, null);
                f60842m.setShowBadge(false);
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(f60842m);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "111111";
    }

    public static int vv(Context context, Intent intent) {
        try {
            if (i.k().j() != null) {
                if (i.k().j().vv(intent)) {
                    return 1;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            context.startActivity(intent);
            return 1;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    public static boolean vv(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.packageName.equals(downloadInfo.getPackageName())) {
            return false;
        }
        com.ss.android.socialbase.appdownloader.p.i m4 = i.k().m();
        if (m4 != null) {
            m4.vv(downloadInfo.getId(), 8, downloadInfo.getPackageName(), packageInfo.packageName, "");
            if (m4.vv()) {
                return true;
            }
        }
        vu downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
        if (downloadNotificationEventListener != null) {
            downloadNotificationEventListener.vv(8, downloadInfo, packageInfo.packageName, "");
            com.ss.android.socialbase.appdownloader.p.p vv2 = i.k().vv();
            return (vv2 instanceof com.ss.android.socialbase.appdownloader.p.vv) && ((com.ss.android.socialbase.appdownloader.p.vv) vv2).p();
        }
        return false;
    }

    public static boolean vv(Context context, int i4, File file) {
        if (com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("back_miui_silent_install", 1) == 1) {
            return false;
        }
        if ((com.ss.android.socialbase.appdownloader.u.o.r() || com.ss.android.socialbase.appdownloader.u.o.t()) && com.ss.android.socialbase.downloader.wv.k.vv(context, "com.miui.securitycore", "com.miui.enterprise.service.EntInstallService")) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.miui.securitycore", "com.miui.enterprise.service.EntInstallService"));
            Bundle bundle = new Bundle();
            bundle.putInt("userId", 0);
            bundle.putInt("flag", 256);
            bundle.putString(BaseAppConfig.KEY_APK_PATH, file.getPath());
            bundle.putString("installerPkg", "com.miui.securitycore");
            intent.putExtras(bundle);
            try {
                context.startService(intent);
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    public static int vv() {
        return i.k().u() ? 16384 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri vv(int r1, com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider r2, android.content.Context r3, java.lang.String r4, java.io.File r5) {
        /*
            if (r2 == 0) goto Lb
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r1 = r2.getUriForFile(r4, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        Lb:
            com.ss.android.socialbase.appdownloader.i r2 = com.ss.android.socialbase.appdownloader.i.k()
            com.ss.android.socialbase.appdownloader.p.u r2 = r2.o()
            if (r2 == 0) goto L1e
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r1 = r2.vv(r1, r4, r0)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 != 0) goto L3b
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L37
            r0 = 24
            if (r2 < r0) goto L32
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L32
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r3, r4, r5)     // Catch: java.lang.Throwable -> L37
            goto L3b
        L32:
            android.net.Uri r1 = android.net.Uri.fromFile(r5)     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r2 = move-exception
            r2.printStackTrace()
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.p.vv(int, com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider, android.content.Context, java.lang.String, java.io.File):android.net.Uri");
    }

    private static Intent vv(Context context, DownloadInfo downloadInfo, @NonNull File file, boolean z4, int[] iArr) {
        Uri vv2 = vv(downloadInfo.getId(), Downloader.getInstance(context).getDownloadFileUriProvider(downloadInfo.getId()), context, i.k().i(), file);
        if (vv2 == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
        }
        intent.setDataAndType(vv2, "application/vnd.android.package-archive");
        com.ss.android.socialbase.appdownloader.p.i m4 = i.k().m();
        boolean vv3 = m4 != null ? m4.vv(downloadInfo.getId(), z4) : 0;
        vu downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
        int i4 = vv3;
        if (downloadNotificationEventListener != null) {
            i4 = downloadNotificationEventListener.vv(z4);
        }
        iArr[0] = i4;
        if (i4 != 0) {
            return null;
        }
        return intent;
    }

    public static boolean vv(DownloadInfo downloadInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(downloadInfo.getPackageName()) || !str.equals(downloadInfo.getPackageName())) {
            return !TextUtils.isEmpty(downloadInfo.getName()) && vv(com.ss.android.socialbase.downloader.downloader.p.ky(), downloadInfo, str);
        }
        return true;
    }

    public static boolean vv(Context context, DownloadInfo downloadInfo, String str) {
        if (context == null) {
            return false;
        }
        try {
            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            PackageInfo packageInfo = null;
            if (file.exists()) {
                StringBuilder sb = new StringBuilder("isPackageNameEqualsWithApk fileName:");
                sb.append(downloadInfo.getName());
                sb.append(" apkFileSize：");
                sb.append(file.length());
                sb.append(" fileUrl：");
                sb.append(downloadInfo.getUrl());
                PackageInfo vv2 = vv(downloadInfo, file);
                if (vv2 == null || !vv2.packageName.equals(str)) {
                    return false;
                }
                int i4 = vv2.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, vv());
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageInfo == null || i4 != packageInfo.versionCode) {
                    return false;
                }
            } else if (!com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("install_callback_error")) {
                return false;
            } else {
                String vv3 = com.ss.android.socialbase.downloader.wv.u.vv(downloadInfo.getTempCacheData().get("extra_apk_package_name"), (String) null);
                int vv4 = com.ss.android.socialbase.downloader.wv.u.vv(downloadInfo.getTempCacheData().get("extra_apk_version_code"), 0);
                if (vv3 == null || TextUtils.isEmpty(vv3) || !vv3.equals(str)) {
                    return false;
                }
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, vv());
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo == null || vv4 != packageInfo.versionCode) {
                    return false;
                }
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean vv(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo, boolean z4) {
        PackageInfo packageInfo2;
        if (packageInfo == null) {
            return false;
        }
        String str = packageInfo.packageName;
        int i4 = packageInfo.versionCode;
        if (downloadInfo != null) {
            downloadInfo.setAppVersionCode(i4);
        }
        try {
            packageInfo2 = context.getPackageManager().getPackageInfo(str, vv());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo2 = null;
        }
        if (packageInfo2 == null) {
            return false;
        }
        int i5 = packageInfo2.versionCode;
        return z4 ? i4 < i5 : (downloadInfo == null || com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("install_with_same_version_code", 0) != 1) ? i4 <= i5 : i4 < i5;
    }

    public static boolean vv(Context context, DownloadInfo downloadInfo) {
        return vv(context, downloadInfo, true);
    }

    public static boolean vv(Context context, DownloadInfo downloadInfo, boolean z4) {
        if (downloadInfo == null) {
            return false;
        }
        String packageName = downloadInfo.getPackageName();
        int appVersionCode = downloadInfo.getAppVersionCode();
        if (appVersionCode <= 0 && z4) {
            return p(context, downloadInfo);
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, vv());
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return false;
        }
        return com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("install_with_same_version_code", 0) == 1 ? appVersionCode < packageInfo.versionCode : appVersionCode <= packageInfo.versionCode;
    }

    public static PackageInfo vv(Context context, DownloadInfo downloadInfo, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder("isApkInstalled apkFileSize：fileName:");
            sb.append(file.getPath());
            sb.append(" apkFileSize");
            sb.append(file.length());
            return vv(downloadInfo, file);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String vv(java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = "default.apk"
            java.lang.String r2 = ".."
            if (r6 == 0) goto L34
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L5a
            java.lang.String r4 = r3.getLastPathSegment()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L32
            java.lang.String r4 = r3.getLastPathSegment()
            boolean r4 = r4.contains(r2)
            if (r4 != 0) goto L32
            java.lang.String r4 = r3.getLastPathSegment()
            goto L5a
        L32:
            r4 = r0
            goto L5a
        L34:
            java.lang.String r6 = r3.getLastPathSegment()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L4c
            java.lang.String r6 = r3.getLastPathSegment()
            boolean r6 = r6.contains(r2)
            if (r6 != 0) goto L4c
            java.lang.String r1 = r3.getLastPathSegment()
        L4c:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L59
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L32
            goto L5a
        L59:
            r4 = r1
        L5a:
            boolean r3 = p(r5)
            if (r3 == 0) goto L77
            java.lang.String r3 = ".apk"
            boolean r5 = r4.endsWith(r3)
            if (r5 != 0) goto L77
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.p.vv(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static String vv(String str, com.ss.android.socialbase.downloader.n.vv vvVar) {
        JSONObject i4;
        String format;
        if (vvVar == null || (i4 = vvVar.i("download_dir")) == null) {
            return "";
        }
        String optString = i4.optString("dir_name");
        if (!TextUtils.isEmpty(optString) && optString.startsWith(e.F0)) {
            optString = optString.substring(1);
        }
        if (TextUtils.isEmpty(optString)) {
            return optString;
        }
        if (!optString.contains("%s")) {
            format = optString + str;
        } else {
            try {
                format = String.format(optString, str);
            } catch (Throwable unused) {
            }
        }
        optString = format;
        return optString.length() > 255 ? optString.substring(optString.length() - 255) : optString;
    }

    public static boolean vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return new JSONObject(str).optBoolean("bind_app", false);
    }

    public static int vv(int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (i4 == -2) {
            return 2;
        }
        if (i4 == 1) {
            return 4;
        }
        if (DownloadStatus.isDownloading(i4) || i4 == 11) {
            return 1;
        }
        return DownloadStatus.isDownloadOver(i4) ? 3 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r0 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean vv(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 20
            if (r0 <= r2) goto L40
            if (r6 != 0) goto La
            goto L40
        La:
            r0 = 0
            int r2 = com.ss.android.socialbase.appdownloader.o.m()     // Catch: java.lang.Throwable -> L3d
            android.content.res.Resources r3 = r6.getResources()     // Catch: java.lang.Throwable -> L3d
            int r2 = r3.getColor(r2)     // Catch: java.lang.Throwable -> L3d
            int r3 = com.ss.android.socialbase.appdownloader.o.p()     // Catch: java.lang.Throwable -> L3d
            int r4 = com.ss.android.socialbase.appdownloader.o.i()     // Catch: java.lang.Throwable -> L3d
            r5 = 2
            int[] r5 = new int[r5]     // Catch: java.lang.Throwable -> L3d
            r5[r1] = r3     // Catch: java.lang.Throwable -> L3d
            r3 = 1
            r5[r3] = r4     // Catch: java.lang.Throwable -> L3d
            int r4 = com.ss.android.socialbase.appdownloader.o.o()     // Catch: java.lang.Throwable -> L3d
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r4, r5)     // Catch: java.lang.Throwable -> L3d
            int r6 = r0.getColor(r1, r1)     // Catch: java.lang.Throwable -> L3d
            if (r2 != r6) goto L39
            r0.recycle()     // Catch: java.lang.Throwable -> L38
        L38:
            return r3
        L39:
            r0.recycle()     // Catch: java.lang.Throwable -> L40
            goto L40
        L3d:
            if (r0 == 0) goto L40
            goto L39
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.p.vv(android.content.Context):boolean");
    }

    public static void vv(DownloadInfo downloadInfo, boolean z4, boolean z5) {
        i.k().vv(new u(com.ss.android.socialbase.downloader.downloader.p.ky(), downloadInfo.getUrl()).vv(downloadInfo.getTitle()).m(downloadInfo.getName()).p(downloadInfo.getSavePath()).vv(downloadInfo.isShowNotification()).m(downloadInfo.isAutoInstallWithoutNotification()).p(downloadInfo.isOnlyWifi() || z5).o(downloadInfo.getExtra()).u(downloadInfo.getMimeType()).vv(downloadInfo.getExtraHeaders()).o(true).m(downloadInfo.getRetryCount()).p(downloadInfo.getBackUpUrlRetryCount()).m(downloadInfo.getBackUpUrls()).i(downloadInfo.getMinProgressTimeMsInterval()).o(downloadInfo.getMaxProgressCount()).u(z4).i(downloadInfo.isNeedHttpsToHttpRetry()).n(downloadInfo.getPackageName()).qv(downloadInfo.getMd5()).vv(downloadInfo.getExpectFileLength()).wv(downloadInfo.isNeedDefaultHttpServiceBackUp()).k(downloadInfo.isNeedReuseFirstConnection()).jh(downloadInfo.isNeedIndependentProcess()).vv(downloadInfo.getEnqueueType()).t(downloadInfo.isForce()).r(downloadInfo.isHeadConnectionAvailable()).n(downloadInfo.isNeedRetryDelay()).wv(downloadInfo.getRetryDelayTimeArray()).vv(i(downloadInfo.getDownloadSettingString())).b(downloadInfo.getIconUrl()).u(downloadInfo.getExecutorGroup()).j(downloadInfo.isAutoInstall()));
    }

    public static void vv(Activity activity) {
        if (activity != null) {
            try {
                if (activity.isFinishing()) {
                    return;
                }
                activity.finish();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static PackageInfo vv(DownloadInfo downloadInfo, File file) {
        if (downloadInfo == null) {
            return com.ss.android.socialbase.appdownloader.u.vv.o.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), file, vv());
        }
        PackageInfo packageInfo = downloadInfo.getPackageInfo();
        if (packageInfo == null) {
            PackageInfo vv2 = com.ss.android.socialbase.appdownloader.u.vv.o.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), file, vv());
            downloadInfo.setPackageInfo(vv2);
            return vv2;
        }
        return packageInfo;
    }

    public static int vv(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
