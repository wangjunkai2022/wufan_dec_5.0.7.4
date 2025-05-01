package com.kwad.framework.filedownloader.f;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.kwad.sdk.utils.ar;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public class f {
    private static int ajk = 65536;
    private static long ajl = 2000;
    private static String ajm;
    private static Boolean ajn;
    private static Boolean ajo;
    private static final Pattern ajp = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    public static int A(String str, String str2) {
        return com.kwad.framework.filedownloader.download.b.vS().vT().g(str, str2, false);
    }

    public static void B(String str, String str2) {
        bE(str2);
        bF(str);
    }

    public static void V(long j4) {
        if (ay(c.xp())) {
            ajl = j4;
            return;
        }
        throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
    }

    public static String a(String str, boolean z4, String str2) {
        if (str == null) {
            return null;
        }
        if (z4) {
            if (str2 == null) {
                return null;
            }
            return z(str, str2);
        }
        return str;
    }

    private static File aA(Context context) {
        return new File(context.getFilesDir().getAbsolutePath() + File.separator + "filedownloader", ".old_file_converted");
    }

    public static boolean ay(Context context) {
        boolean endsWith;
        Boolean bool = ajn;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (e.xr().ajf) {
            endsWith = true;
        } else if (((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)) == null) {
            d.d(f.class, "fail to get the activity manager!", new Object[0]);
            return false;
        } else {
            endsWith = ar.getProcessName(context).endsWith(":filedownloader");
        }
        Boolean valueOf = Boolean.valueOf(endsWith);
        ajn = valueOf;
        return valueOf.booleanValue();
    }

    public static void az(Context context) {
        File aA = aA(context);
        try {
            aA.getParentFile().mkdirs();
            aA.createNewFile();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public static String b(String str, Object... objArr) {
        try {
            return String.format(Locale.ENGLISH, str, objArr);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String bA(String str) {
        return "FileDownloader-" + str;
    }

    public static boolean bB(String str) {
        return c.xp().checkCallingOrSelfPermission(str) == 0;
    }

    private static long bC(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static com.kwad.framework.filedownloader.e.a bD(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                file.delete();
                if (!file.createNewFile()) {
                    throw new RuntimeException(b("found invalid internal destination path[%s], & path is directory[%B]", str, Boolean.valueOf(file.isDirectory())));
                }
            }
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException(b("create new file error  %s", file.getAbsolutePath()));
            }
            return com.kwad.framework.filedownloader.download.b.vS().b(file);
        }
        throw new RuntimeException("found invalid internal destination path, empty");
    }

    private static void bE(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void bF(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void bM(int i4) {
        if (ay(c.xp())) {
            ajk = i4;
            return;
        }
        throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
    }

    public static String bu(String str) {
        return z(xv(), bv(str));
    }

    private static String bv(String str) {
        return bx(str);
    }

    public static String bw(String str) {
        return b("%s.temp", str);
    }

    public static String bx(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b5 : digest) {
                int i4 = b5 & 255;
                if (i4 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i4));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e5);
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException("Huh, MD5 should be supported?", e6);
        }
    }

    public static String by(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = ajp.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    public static String bz(String str) {
        int length = str.length();
        int i4 = 2;
        int i5 = (File.separatorChar == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf != -1 || i5 <= 0) {
            i4 = lastIndexOf;
        }
        if (i4 != -1) {
            char charAt = str.charAt(length - 1);
            char c5 = File.separatorChar;
            if (charAt == c5) {
                return null;
            }
            if (str.indexOf(c5) == i4 && str.charAt(i5) == File.separatorChar) {
                return str.substring(0, i4 + 1);
            }
            return str.substring(0, i4);
        }
        return null;
    }

    public static int g(String str, String str2, boolean z4) {
        return com.kwad.framework.filedownloader.download.b.vS().vT().g(str, str2, z4);
    }

    public static boolean i(long j4, long j5) {
        return j4 > ((long) xt()) && j5 > xu();
    }

    private static int xt() {
        return ajk;
    }

    private static long xu() {
        return ajl;
    }

    private static String xv() {
        if (!TextUtils.isEmpty(ajm)) {
            return ajm;
        }
        if (c.xp().getExternalCacheDir() == null) {
            return Environment.getDownloadCacheDirectory().getAbsolutePath();
        }
        return c.xp().getExternalCacheDir().getAbsolutePath();
    }

    public static boolean xw() {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.xp().getSystemService("connectivity");
        if (connectivityManager == null) {
            d.d(f.class, "failed to get connectivity manager!", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static String xx() {
        return b("FileDownloader/%s", BuildConfig.VERSION_NAME);
    }

    private static String z(String str, String str2) {
        if (str2 != null) {
            if (str != null) {
                return b("%s%s%s", str, File.separator, str2);
            }
            throw new IllegalStateException("can't generate real path, the directory is null");
        }
        throw new IllegalStateException("can't generate real path, the file name is null");
    }

    public static String a(int i4, com.kwad.framework.filedownloader.a.b bVar) {
        if (bVar != null) {
            String bg = bVar.bg("Etag");
            if (d.ajb) {
                d.c(f.class, "etag find %s for task(%d)", bg, Integer.valueOf(i4));
            }
            return bg;
        }
        throw new RuntimeException("connection is null when findEtag");
    }

    public static long b(int i4, com.kwad.framework.filedownloader.a.b bVar) {
        long bC = bC(bVar.bg("Content-Length"));
        String bg = bVar.bg("Transfer-Encoding");
        if (bC < 0) {
            if (!(bg != null && bg.equals(HttpHeaders.Values.CHUNKED))) {
                if (e.xr().aje) {
                    if (d.ajb) {
                        d.c(f.class, "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk", Integer.valueOf(i4));
                    }
                } else {
                    throw new FileDownloadGiveUpRetryException("can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties");
                }
            }
            return -1L;
        }
        return bC;
    }

    public static String a(com.kwad.framework.filedownloader.a.b bVar, String str) {
        String by = by(bVar.bg("Content-Disposition"));
        if (TextUtils.isEmpty(by)) {
            by = bv(str);
        }
        return by.replaceAll("\\/", "_");
    }

    private static boolean a(int i4, com.kwad.framework.filedownloader.d.c cVar, Boolean bool) {
        if (cVar == null) {
            if (d.ajb) {
                d.c(f.class, "can't continue %d model == null", Integer.valueOf(i4));
            }
            return false;
        } else if (cVar.wh() == null) {
            if (d.ajb) {
                d.c(f.class, "can't continue %d temp path == null", Integer.valueOf(i4));
            }
            return false;
        } else {
            return a(i4, cVar, cVar.wh(), null);
        }
    }

    public static boolean b(int i4, com.kwad.framework.filedownloader.d.c cVar) {
        return a(i4, cVar, (Boolean) null);
    }

    public static boolean a(int i4, com.kwad.framework.filedownloader.d.c cVar, String str, Boolean bool) {
        if (str == null) {
            if (d.ajb) {
                d.c(f.class, "can't continue %d path = null", Integer.valueOf(i4));
                return false;
            }
            return false;
        }
        File file = new File(str);
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (exists && !isDirectory) {
            long length = file.length();
            long wP = cVar.wP();
            if (cVar.wS() <= 1 && wP == 0) {
                if (d.ajb) {
                    d.c(f.class, "can't continue %d the downloaded-record is zero.", Integer.valueOf(i4));
                    return false;
                }
                return false;
            }
            long total = cVar.getTotal();
            if (length >= wP && (total == -1 || (length <= total && wP < total))) {
                if (bool == null || bool.booleanValue() || total != length) {
                    return true;
                }
                if (d.ajb) {
                    d.c(f.class, "can't continue %d, because of the output stream doesn't support seek, but the task has already pre-allocated, so we only can download it from the very beginning.", Integer.valueOf(i4));
                    return false;
                }
                return false;
            } else if (d.ajb) {
                d.c(f.class, "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]", Integer.valueOf(i4), Long.valueOf(length), Long.valueOf(wP), Long.valueOf(total));
                return false;
            } else {
                return false;
            }
        } else if (d.ajb) {
            d.c(f.class, "can't continue %d file not suit, exists[%B], directory[%B]", Integer.valueOf(i4), Boolean.valueOf(exists), Boolean.valueOf(isDirectory));
            return false;
        } else {
            return false;
        }
    }
}
