package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.d;
import com.ss.android.download.api.config.j;
import com.ss.android.download.api.config.la;
import com.ss.android.download.api.config.q;
import com.ss.android.download.api.config.t;
import com.ss.android.download.api.config.y;
import com.ss.android.download.api.model.vv;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static com.ss.android.socialbase.appdownloader.p.qv f60380b;

    /* renamed from: d  reason: collision with root package name */
    private static t f60381d;

    /* renamed from: g  reason: collision with root package name */
    private static com.ss.android.download.api.config.r f60382g;

    /* renamed from: i  reason: collision with root package name */
    private static com.ss.android.download.api.config.p f60383i;

    /* renamed from: j  reason: collision with root package name */
    private static y f60384j;
    private static com.ss.android.download.api.config.i jh;

    /* renamed from: k  reason: collision with root package name */
    private static com.ss.android.download.api.config.m f60385k;
    private static j la;

    /* renamed from: m  reason: collision with root package name */
    private static Context f60386m;

    /* renamed from: n  reason: collision with root package name */
    private static com.ss.android.download.api.config.wv f60387n;

    /* renamed from: o  reason: collision with root package name */
    private static com.ss.android.download.api.config.jh f60388o;

    /* renamed from: p  reason: collision with root package name */
    private static com.ss.android.download.api.config.n f60389p;

    /* renamed from: q  reason: collision with root package name */
    private static com.ss.android.download.api.config.b f60390q;
    private static com.ss.android.download.api.config.k qv;

    /* renamed from: r  reason: collision with root package name */
    private static com.ss.android.download.api.config.o f60391r;

    /* renamed from: t  reason: collision with root package name */
    private static q f60392t;

    /* renamed from: u  reason: collision with root package name */
    private static com.ss.android.download.api.config.qv f60393u;

    /* renamed from: v  reason: collision with root package name */
    private static la f60394v;
    public static final JSONObject vv = new JSONObject();
    private static com.ss.android.download.api.model.vv wv;

    /* renamed from: x  reason: collision with root package name */
    private static com.ss.android.download.api.m.vv f60395x;

    /* renamed from: y  reason: collision with root package name */
    private static d f60396y;

    public static com.ss.android.download.api.config.r b() {
        return f60382g;
    }

    public static com.ss.android.download.api.config.b d() {
        return f60390q;
    }

    @NonNull
    public static d g() {
        return f60396y;
    }

    public static Context getContext() {
        Context context = f60386m;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Context is null");
    }

    public static com.ss.android.download.api.config.qv i() {
        return f60393u;
    }

    public static com.ss.android.download.api.config.o j() {
        return f60391r;
    }

    @Nullable
    public static com.ss.android.download.api.config.m jh() {
        return f60385k;
    }

    @NonNull
    public static com.ss.android.download.api.model.vv k() {
        if (wv == null) {
            wv = new vv.C0609vv().vv();
        }
        return wv;
    }

    public static y la() {
        return f60384j;
    }

    public static void m(Context context) {
        if (f60386m != null || context == null || context.getApplicationContext() == null) {
            return;
        }
        f60386m = context.getApplicationContext();
    }

    public static q n() {
        return f60392t;
    }

    @NonNull
    public static com.ss.android.download.api.config.wv o() {
        if (f60387n == null) {
            f60387n = new com.ss.android.download.api.vv.m();
        }
        return f60387n;
    }

    @NonNull
    public static com.ss.android.download.api.config.jh p() {
        if (f60388o == null) {
            f60388o = new com.ss.android.download.api.vv.vv();
        }
        return f60388o;
    }

    public static com.ss.android.download.api.config.i q() {
        return jh;
    }

    @NonNull
    public static j qv() {
        if (la == null) {
            la = new j() { // from class: com.ss.android.downloadlib.addownload.b.3
            };
        }
        return la;
    }

    @Nullable
    public static t r() {
        return f60381d;
    }

    public static String t() {
        return "1.7.0";
    }

    public static com.ss.android.socialbase.appdownloader.p.qv u() {
        if (f60380b == null) {
            f60380b = new com.ss.android.socialbase.appdownloader.p.qv() { // from class: com.ss.android.downloadlib.addownload.b.2
                @Override // com.ss.android.socialbase.appdownloader.p.qv
                public void vv(DownloadInfo downloadInfo, BaseException baseException, int i4) {
                }
            };
        }
        return f60380b;
    }

    public static String v() {
        try {
            int i4 = getContext().getApplicationInfo().targetSdkVersion;
            if (Build.VERSION.SDK_INT >= 29 && ((i4 == 29 && !Environment.isExternalStorageLegacy()) || i4 > 29)) {
                return getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            }
            return Environment.getExternalStorageDirectory().getPath() + File.separator + wv().optString("default_save_dir_name", "ByteDownload");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void vv(Context context) {
        if (context != null && context.getApplicationContext() != null) {
            f60386m = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("Context is null");
    }

    @NonNull
    public static JSONObject wv() {
        com.ss.android.download.api.config.k kVar = qv;
        if (kVar != null && kVar.vv() != null) {
            return qv.vv();
        }
        return vv;
    }

    @NonNull
    public static com.ss.android.download.api.m.vv x() {
        if (f60395x == null) {
            f60395x = new com.ss.android.download.api.m.vv() { // from class: com.ss.android.downloadlib.addownload.b.4
                @Override // com.ss.android.download.api.m.vv
                public void vv(Throwable th, String str) {
                }
            };
        }
        return f60395x;
    }

    @NonNull
    public static la y() {
        if (f60394v == null) {
            f60394v = new la() { // from class: com.ss.android.downloadlib.addownload.b.5
            };
        }
        return f60394v;
    }

    public static boolean ya() {
        return (f60389p == null || f60393u == null || qv == null || f60385k == null || f60396y == null) ? false : true;
    }

    @NonNull
    public static com.ss.android.download.api.config.p m() {
        if (f60383i == null) {
            f60383i = new com.ss.android.download.api.config.p() { // from class: com.ss.android.downloadlib.addownload.b.1
            };
        }
        return f60383i;
    }

    public static void vv(@NonNull com.ss.android.download.api.config.n nVar) {
        f60389p = nVar;
    }

    public static void vv(@NonNull com.ss.android.download.api.config.jh jhVar) {
        f60388o = jhVar;
    }

    public static void vv(@NonNull com.ss.android.download.api.config.qv qvVar) {
        f60393u = qvVar;
    }

    public static void vv(@NonNull com.ss.android.download.api.config.wv wvVar) {
        f60387n = wvVar;
    }

    public static void vv(@NonNull com.ss.android.download.api.config.k kVar) {
        qv = kVar;
    }

    public static void vv(@NonNull com.ss.android.download.api.model.vv vvVar) {
        wv = vvVar;
    }

    public static void vv(@NonNull com.ss.android.download.api.config.m mVar) {
        f60385k = mVar;
    }

    public static com.ss.android.download.api.config.n vv() {
        return f60389p;
    }

    public static void vv(String str) {
        com.ss.android.socialbase.appdownloader.i.k().vv(str);
    }

    public static void vv(d dVar) {
        f60396y = dVar;
    }

    public static void vv(com.ss.android.download.api.m.vv vvVar) {
        f60395x = vvVar;
    }
}
