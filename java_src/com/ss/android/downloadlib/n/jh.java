package com.ss.android.downloadlib.n;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.config.q;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class jh {

    /* renamed from: m  reason: collision with root package name */
    private static Object[] f60664m = new Object[0];

    /* renamed from: p  reason: collision with root package name */
    private static Object[] f60665p = new Object[73];
    static final char[] vv = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: i  reason: collision with root package name */
    private static String f60663i = null;

    public static Drawable i(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return packageManager.getApplicationInfo(str, 0).loadIcon(packageManager);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    public static File k(Context context, String str) {
        File parentFile = context.getExternalFilesDir(null).getParentFile();
        String parent = parentFile != null ? parentFile.getParent() : null;
        File file = new File(parent + File.separator + str);
        StringBuilder sb = new StringBuilder("getExtDir: file.toString()-->");
        sb.append(file.toString());
        com.ss.android.socialbase.downloader.p.vv.m("ToolUtils", sb.toString());
        return file;
    }

    public static boolean m(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static Intent n(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean o(Context context, String str) {
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.b.getContext();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String p(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static Signature[] qv(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                return packageInfo.signatures;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean u(Context context, String str) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        if (context == null || str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists() || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0)) == null) {
                return false;
            }
            String str2 = packageArchiveInfo.packageName;
            int i4 = packageArchiveInfo.versionCode;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo == null) {
                return false;
            }
            return i4 <= packageInfo.versionCode;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static Signature[] wv(Context context, String str) {
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 64);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.signatures;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int m(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static long vv(JSONObject jSONObject, String str) {
        return com.ss.android.download.api.p.m.vv(jSONObject, str);
    }

    @WorkerThread
    public static boolean p(String str) {
        File file;
        Context context = com.ss.android.downloadlib.addownload.b.getContext();
        if (!TextUtils.isEmpty(str) && o(context, str)) {
            int i4 = context.getApplicationInfo().targetSdkVersion;
            if (com.ss.android.downloadlib.addownload.b.wv().optInt("get_ext_dir_mode") != 0 || Build.VERSION.SDK_INT < 29 || ((i4 != 29 || Environment.isExternalStorageLegacy()) && i4 <= 29)) {
                try {
                    if (Build.VERSION.SDK_INT >= 29 && context.getApplicationInfo().targetSdkVersion >= 29 && com.ss.android.downloadlib.addownload.b.wv().optInt("get_ext_dir_mode") == 1) {
                        file = k(context, str);
                    } else {
                        file = new File(Environment.getExternalStorageDirectory().getPath(), "android/data/".concat(String.valueOf(str)));
                    }
                    if (file.exists()) {
                        long vv2 = n.vv(file);
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                        if (packageInfo != null) {
                            if (packageInfo.lastUpdateTime < vv2) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static JSONObject vv(JSONObject jSONObject, JSONObject jSONObject2) {
        return com.ss.android.download.api.p.m.vv(jSONObject, jSONObject2);
    }

    @NonNull
    public static JSONObject vv(JSONObject jSONObject) {
        return com.ss.android.download.api.p.m.vv(jSONObject);
    }

    @NonNull
    public static JSONObject vv(JSONObject... jSONObjectArr) {
        return com.ss.android.download.api.p.m.vv(jSONObjectArr);
    }

    public static boolean m(com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar == null) {
            return false;
        }
        return vv(mVar.o(), mVar.f(), mVar.ot()).vv();
    }

    public static boolean vv(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                if (!queryIntentActivities.isEmpty()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean m(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.b.getContext();
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static String vv(long j4) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (j4 >= 1073741824) {
            return (j4 / 1073741824) + "G";
        } else if (j4 >= 1048576) {
            return (j4 / 1048576) + "M";
        } else {
            return decimalFormat.format(((float) j4) / 1048576.0f) + "M";
        }
    }

    public static long m(long j4) {
        try {
            return vv(Environment.getExternalStorageDirectory(), j4);
        } catch (Exception e5) {
            e5.printStackTrace();
            return j4;
        }
    }

    public static boolean m() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static PackageInfo vv(com.ss.android.downloadad.api.vv.m mVar) {
        DownloadInfo downloadInfo;
        if (mVar == null || (downloadInfo = Downloader.getInstance(com.ss.android.downloadlib.addownload.b.getContext()).getDownloadInfo(mVar.la())) == null) {
            return null;
        }
        try {
            return com.ss.android.socialbase.appdownloader.p.vv(com.ss.android.downloadlib.addownload.b.getContext(), downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    public static HashMap<String, String> m(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
                return hashMap;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return hashMap;
    }

    public static Drawable vv(Context context, String str) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        if (context != null && !TextUtils.isEmpty(str) && (packageArchiveInfo = (packageManager = context.getPackageManager()).getPackageArchiveInfo(str, 0)) != null) {
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            try {
                return applicationInfo.loadIcon(packageManager);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static void p() {
        try {
            if (com.ss.android.downloadlib.addownload.b.o().vv(com.ss.android.downloadlib.addownload.b.getContext(), "android.permission.REORDER_TASKS")) {
                ActivityManager activityManager = (ActivityManager) com.ss.android.downloadlib.addownload.b.getContext().getSystemService(TTDownloadField.TT_ACTIVITY);
                for (ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(20)) {
                    if (com.ss.android.downloadlib.addownload.b.getContext().getPackageName().equals(runningTaskInfo.topActivity.getPackageName())) {
                        activityManager.moveTaskToFront(runningTaskInfo.id, 1);
                        return;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static com.ss.android.downloadlib.addownload.m.p vv(String str, int i4, String str2) {
        com.ss.android.downloadlib.addownload.m.p pVar = new com.ss.android.downloadlib.addownload.m.p();
        if (TextUtils.isEmpty(str)) {
            return pVar;
        }
        try {
            PackageInfo packageInfo = com.ss.android.downloadlib.addownload.b.getContext().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                pVar.m(packageInfo.versionCode);
                pVar.vv(com.ss.android.downloadlib.addownload.m.p.f60513m);
                q n4 = com.ss.android.downloadlib.addownload.b.n();
                if (n4 != null && n4.vv() && !vv(packageInfo.versionCode, i4, packageInfo.versionName, str2)) {
                    pVar.vv(com.ss.android.downloadlib.addownload.m.p.f60514p);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return pVar;
    }

    private static boolean vv(int i4, int i5, String str, String str2) {
        if (i5 == 0 && TextUtils.isEmpty(str2)) {
            return true;
        }
        return (i5 > 0 && i4 >= i5) || vv(str, str2) >= 0;
    }

    public static boolean vv(DownloadModel downloadModel) {
        if (downloadModel == null) {
            return false;
        }
        return vv(downloadModel.getPackageName(), downloadModel.getVersionCode(), downloadModel.getVersionName()).vv();
    }

    public static boolean vv(Context context, String str, String str2) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists() && (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0)) != null && packageArchiveInfo.packageName.equals(str2)) {
                int i4 = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo == null) {
                    return false;
                }
                return i4 == packageInfo.versionCode;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean vv(Signature[] signatureArr, Signature[] signatureArr2) {
        if (signatureArr == signatureArr2) {
            return true;
        }
        if (signatureArr == null || signatureArr2 == null || signatureArr.length != signatureArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < signatureArr.length; i4++) {
            if ((signatureArr[i4] == null && signatureArr2[i4] != null) || (signatureArr[i4] != null && !signatureArr[i4].equals(signatureArr2[i4]))) {
                return false;
            }
        }
        return true;
    }

    public static int vv(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String vv(String str, int i4) {
        return i4 == 0 ? "" : (TextUtils.isEmpty(str) || str.length() <= i4) ? str : str.substring(0, i4);
    }

    public static int vv(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (str.equals(str2)) {
                    return 0;
                }
                String[] split = str.split("\\.");
                String[] split2 = str2.split("\\.");
                int min = Math.min(split.length, split2.length);
                int i4 = 0;
                int i5 = 0;
                while (i4 < min) {
                    i5 = Integer.parseInt(split[i4]) - Integer.parseInt(split2[i4]);
                    if (i5 != 0) {
                        break;
                    }
                    i4++;
                }
                if (i5 != 0) {
                    return i5 > 0 ? 1 : -1;
                }
                for (int i6 = i4; i6 < split.length; i6++) {
                    if (Integer.parseInt(split[i6]) > 0) {
                        return 1;
                    }
                }
                while (i4 < split2.length) {
                    if (Integer.parseInt(split2[i4]) > 0) {
                        return -1;
                    }
                    i4++;
                }
                return 0;
            }
        } catch (Exception unused) {
        }
        return -2;
    }

    public static String vv(String... strArr) {
        return com.ss.android.download.api.p.m.vv(strArr);
    }

    @NonNull
    public static <T> T vv(T... tArr) {
        if (tArr != null) {
            for (T t4 : tArr) {
                if (t4 != null) {
                    return t4;
                }
            }
            throw new IllegalArgumentException("args is null");
        }
        throw new IllegalArgumentException("args is null");
    }

    public static boolean vv() {
        try {
            if (com.ss.android.downloadlib.addownload.b.getContext().getPackageManager().getPackageInfo(com.ss.android.downloadlib.addownload.b.getContext().getPackageName(), 0).applicationInfo.targetSdkVersion == 33) {
                return Build.VERSION.SDK_INT == 33;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static long vv(File file, long j4) {
        if (file == null) {
            return j4;
        }
        try {
            return com.ss.android.socialbase.downloader.wv.u.i(file.getAbsolutePath());
        } catch (Exception e5) {
            e5.printStackTrace();
            return j4;
        }
    }

    public static long vv(File file) {
        if (file == null) {
            return -1L;
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return -1L;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1L;
        }
    }

    public static void vv(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.putOpt(str, obj);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }
}
