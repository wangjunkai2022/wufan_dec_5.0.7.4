package cn.aigestudio.downloader.bizs;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: DLUtil.java */
/* loaded from: classes2.dex */
final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f478a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f479b = "DLUtil";

    static {
        StringBuilder sb = new StringBuilder();
        String str = Build.VERSION.RELEASE;
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(str);
        boolean z6 = !TextUtils.isEmpty(Build.ID);
        z4 = (!"REL".equals(Build.VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) ? false : false;
        sb.append("MultiThreadDownloader");
        if (z5) {
            sb.append(net.lingala.zip4j.util.e.F0);
            sb.append(str);
        }
        sb.append(" (Linux; U; Android");
        if (z5) {
            sb.append(" ");
            sb.append(str);
        }
        if (z4 || z6) {
            sb.append(";");
            if (z4) {
                sb.append(" ");
                sb.append(Build.MODEL);
            }
            if (z6) {
                sb.append(" Build/");
                sb.append(Build.ID);
            }
        }
        sb.append(")");
        f478a = sb.toString();
    }

    private k() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r3.createNewFile() != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[Catch: IOException -> 0x0033, all -> 0x004a, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:6:0x000a, B:8:0x0011, B:14:0x001d), top: B:29:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static synchronized boolean a(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<cn.aigestudio.downloader.bizs.k> r0 = cn.aigestudio.downloader.bizs.k.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r5 = 0
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L4a
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r3 = r1.mkdirs()     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L4a
            if (r3 == 0) goto L18
            goto L1a
        L18:
            r3 = 0
            goto L1b
        L1a:
            r3 = 1
        L1b:
            if (r3 == 0) goto L48
            java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L4a
            r3.<init>(r1, r6)     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L4a
            boolean r5 = r3.exists()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L4a
            if (r5 != 0) goto L2e
            boolean r5 = r3.createNewFile()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L4a
            if (r5 == 0) goto L48
        L2e:
            r2 = 1
            goto L48
        L30:
            r6 = move-exception
            r5 = r3
            goto L34
        L33:
            r6 = move-exception
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "createNewFile error."
            r1.append(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L4a
            r1.append(r5)     // Catch: java.lang.Throwable -> L4a
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r0)
            return r2
        L4a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.aigestudio.downloader.bizs.k.a(java.lang.String, java.lang.String):boolean");
    }

    private static boolean b(String str, List<e> list) {
        for (e eVar : list) {
            if (eVar.f420a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<e> c(List<e> list, f fVar) {
        if (list == null || list.isEmpty()) {
            list = new ArrayList<>();
            list.add(new e("Accept", "image/gif, image/jpeg, image/pjpeg, image/pjpeg,application/x-shockwave-flash, application/xaml+xml,application/vnd.ms-xpsdocument, application/x-ms-xbap,application/x-ms-application, application/vnd.ms-excel,application/vnd.ms-powerpoint, application/msword, */*"));
            list.add(new e("Accept-Ranges", "bytes"));
            list.add(new e("Charset", "UTF-8"));
            list.add(new e("Connection", "Keep-Alive"));
            list.add(new e("Accept-Encoding", "identity"));
            list.add(new e("Range", "bytes=0-"));
        }
        if (!b("User-Agent", list)) {
            list.add(new e("User-Agent", f478a));
        }
        if (!TextUtils.isEmpty(fVar.f433l)) {
            list.add(new e("If-Match", fVar.f433l));
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase();
        int indexOf = lowerCase.indexOf(59);
        return indexOf != -1 ? lowerCase.substring(0, indexOf) : lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(String str, String str2, String str3) {
        String str4;
        String decode;
        int lastIndexOf;
        String decode2;
        int lastIndexOf2;
        if (str2 != null) {
            str4 = g(str2);
            if (str4 != null && (lastIndexOf2 = str4.lastIndexOf(47) + 1) > 0) {
                str4 = str4.substring(lastIndexOf2);
            }
        } else {
            str4 = null;
        }
        if (str4 == null && str3 != null && (decode2 = Uri.decode(str3)) != null && !decode2.endsWith(net.lingala.zip4j.util.e.F0) && decode2.indexOf(63) < 0) {
            int lastIndexOf3 = decode2.lastIndexOf(47) + 1;
            str4 = lastIndexOf3 > 0 ? decode2.substring(lastIndexOf3) : decode2;
        }
        if (str4 == null && (decode = Uri.decode(str)) != null && !decode.endsWith(net.lingala.zip4j.util.e.F0) && decode.indexOf(63) < 0 && (lastIndexOf = decode.lastIndexOf(47) + 1) > 0) {
            str4 = decode.substring(lastIndexOf);
        }
        if (str4 == null) {
            str4 = UUID.randomUUID().toString();
        }
        return h(str4);
    }

    private static String g(String str) {
        int indexOf = str.indexOf(SimpleComparison.EQUAL_TO_OPERATION);
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return null;
    }

    private static String h(String str) {
        StringBuilder sb = new StringBuilder();
        boolean z4 = false;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (charAt > 31 && charAt != '\"' && charAt != '*' && charAt != '/' && charAt != ':' && charAt != '<' && charAt != '>' && charAt != '?' && charAt != '\\' && charAt != '|' && charAt != 127) {
                sb.append(charAt);
                z4 = false;
            } else if (!z4) {
                sb.append('_');
                z4 = true;
            }
        }
        return sb.toString();
    }
}
