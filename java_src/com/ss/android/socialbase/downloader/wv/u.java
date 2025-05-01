package com.ss.android.socialbase.downloader.wv;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.papa91.arc.ext.Log;
import com.ss.android.socialbase.downloader.depend.pj;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.jh;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import net.lingala.zip4j.util.e;
import okhttp3.internal.http2.StreamResetException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class u {

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f61479b = null;

    /* renamed from: k  reason: collision with root package name */
    private static Boolean f61481k = null;
    private static final String vv = "u";
    private static ConnectivityManager wv;

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f61482m = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: p  reason: collision with root package name */
    private static String f61485p = null;

    /* renamed from: i  reason: collision with root package name */
    private static volatile SparseArray<Boolean> f61480i = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    private static volatile SparseArray<List<pj>> f61484o = new SparseArray<>();

    /* renamed from: u  reason: collision with root package name */
    private static final char[] f61486u = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: n  reason: collision with root package name */
    private static Pattern f61483n = null;
    private static Pattern qv = null;

    private static boolean b(String str) {
        new StringBuilder("deleteDirIfEmpty on thread: ").append(Thread.currentThread());
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            return file.isDirectory() && file.delete();
        }
        return false;
    }

    public static boolean i(int i4) {
        return i4 == 206 || i4 == 200;
    }

    public static boolean i(DownloadInfo downloadInfo) {
        boolean z4 = false;
        if (!downloadInfo.isDeleteCacheIfCheckFailed() && TextUtils.isEmpty(downloadInfo.getLastModified())) {
            com.ss.android.socialbase.downloader.p.vv.m(vv, "dcache::last modify is emtpy, so just return cache");
        } else {
            String str = vv;
            com.ss.android.socialbase.downloader.p.vv.m(str, "dcache::curt=" + System.currentTimeMillis() + " expired=" + downloadInfo.getCacheExpiredTime());
            if (System.currentTimeMillis() > downloadInfo.getCacheExpiredTime()) {
                z4 = true;
            }
        }
        String str2 = vv;
        com.ss.android.socialbase.downloader.p.vv.m(str2, "cacheExpired::dcache::name=" + downloadInfo.getName() + " expired=" + z4);
        return z4;
    }

    private static String k(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        try {
            if (f61483n == null) {
                f61483n = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            matcher = f61483n.matcher(str);
        } catch (Exception unused) {
        }
        if (matcher.find()) {
            return matcher.group(1);
        }
        if (qv == null) {
            qv = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
        }
        Matcher matcher2 = qv.matcher(str);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        return null;
    }

    public static long m(com.ss.android.socialbase.downloader.network.n nVar) {
        if (nVar == null) {
            return -1L;
        }
        String m4 = m(nVar, "Content-Range");
        if (TextUtils.isEmpty(m4)) {
            return -1L;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(m4);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Exception e5) {
            com.ss.android.socialbase.downloader.p.vv.i(vv, "parse content-length from content-range failed ".concat(String.valueOf(e5)));
        }
        return -1L;
    }

    public static boolean m(long j4) {
        return j4 == -1;
    }

    public static String n(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String o(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return vv(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format("%s.tp", str);
    }

    public static boolean p(int i4) {
        return i4 == 200 || i4 == 201 || i4 == 0;
    }

    public static boolean qv(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode == 1023 || errorCode == 1039 || errorCode == 1040 || errorCode == 1054 || errorCode == 1064) {
                String message = baseException.getMessage();
                return !TextUtils.isEmpty(message) && message.contains("ENOSPC");
            }
        } else if (th instanceof IOException) {
            String k4 = k(th);
            if (!TextUtils.isEmpty(k4) && k4.contains("ENOSPC")) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String i4 = i(com.ss.android.socialbase.downloader.downloader.p.ky());
        return i4 != null && i4.equals(str);
    }

    public static String vv(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return vv(bArr, 0, bArr.length);
    }

    public static boolean vv(int i4) {
        return i4 == 0 || i4 == 2;
    }

    private static String wv() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read <= 0) {
                    break;
                }
                sb.append((char) read);
            }
            if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                com.ss.android.socialbase.downloader.p.vv.m("Process", "get processName = " + sb.toString());
            }
            String sb2 = sb.toString();
            vv(bufferedReader);
            return sb2;
        } catch (Throwable unused2) {
            vv(bufferedReader);
            return null;
        }
    }

    public static void p(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder("deleteFile: ");
            sb.append(str);
            sb.append(e.F0);
            sb.append(str2);
            file.delete();
        }
    }

    public static String vv(byte[] bArr, int i4, int i5) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i4 >= 0 && i4 + i5 <= bArr.length) {
            int i6 = i5 * 2;
            char[] cArr = new char[i6];
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = bArr[i8 + i4] & 255;
                int i10 = i7 + 1;
                char[] cArr2 = f61486u;
                cArr[i7] = cArr2[i9 >> 4];
                i7 = i10 + 1;
                cArr[i10] = cArr2[i9 & 15];
            }
            return new String(cArr, 0, i6);
        }
        throw new IndexOutOfBoundsException();
    }

    public static boolean u(Throwable th) {
        if (th == null) {
            return false;
        }
        String k4 = k(th);
        return !TextUtils.isEmpty(k4) && k4.contains("Requested Range Not Satisfiable");
    }

    private static String b() {
        String str;
        Throwable th;
        Object invoke;
        try {
            Method declaredMethod = Class.forName(InstrumentationProxy.f64868d, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            invoke = declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable th2) {
            str = null;
            th = th2;
        }
        if (invoke instanceof String) {
            str = (String) invoke;
            try {
                if (!TextUtils.isEmpty(str) && com.ss.android.socialbase.downloader.p.vv.vv()) {
                    com.ss.android.socialbase.downloader.p.vv.m("Process", "processName = ".concat(String.valueOf(str)));
                }
            } catch (Throwable th3) {
                th = th3;
                th.printStackTrace();
                return str;
            }
            return str;
        }
        return null;
    }

    public static long i(String str) throws BaseException {
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getAvailableBytes();
            }
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException e5) {
            throw new BaseException(1050, e5);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    private static String o(Context context) {
        if (context == null) {
            return null;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                            com.ss.android.socialbase.downloader.p.vv.m("Process", "processName = " + runningAppProcessInfo.processName);
                        }
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return null;
    }

    public static long u(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0L;
        }
        List<com.ss.android.socialbase.downloader.model.m> p4 = com.ss.android.socialbase.downloader.downloader.p.ns().p(downloadInfo.getId());
        int chunkCount = downloadInfo.getChunkCount();
        boolean z4 = chunkCount > 1;
        if (downloadInfo.isBreakpointAvailable()) {
            if (z4) {
                if (p4 == null || chunkCount != p4.size()) {
                    return 0L;
                }
                return m(p4);
            }
            return downloadInfo.getCurBytes();
        }
        return 0L;
    }

    public static boolean n(Throwable th) {
        return com.ss.android.socialbase.downloader.downloader.p.lb().vv(th);
    }

    public static File n() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        if ("mounted".equals(str)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        return null;
    }

    public static boolean p(DownloadInfo downloadInfo) {
        return vv(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5());
    }

    public static long m(String str) {
        if (str == null) {
            return -1L;
        }
        String[] split = str.split(e.F0);
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException unused) {
                com.ss.android.socialbase.downloader.p.vv.i(vv, "parse instance length failed with ".concat(str));
            }
        }
        return -1L;
    }

    public static boolean p(String str, String str2, String str3) {
        return vv(m(str, str2, str3));
    }

    public static boolean qv(String str) {
        Context ky;
        if (com.ss.android.socialbase.downloader.n.vv.p().m("save_path_security") > 0 && (ky = com.ss.android.socialbase.downloader.downloader.p.ky()) != null && !TextUtils.isEmpty(str) && !str.startsWith("/data")) {
            if (!str.contains("Android/data/" + ky.getPackageName())) {
                return false;
            }
        }
        return true;
    }

    public static boolean wv(Throwable th) {
        if (th instanceof BaseException) {
            int errorCode = ((BaseException) th).getErrorCode();
            return errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013;
        }
        return false;
    }

    private static String k() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                String processName = Application.getProcessName();
                if (!TextUtils.isEmpty(processName) && com.ss.android.socialbase.downloader.p.vv.vv()) {
                    com.ss.android.socialbase.downloader.p.vv.m("Process", "processName = ".concat(String.valueOf(processName)));
                }
                return processName;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean p(com.ss.android.socialbase.downloader.network.n nVar) {
        if (nVar == null) {
            return false;
        }
        return vv.vv(8) ? HttpHeaders.Values.CHUNKED.equals(nVar.vv("Transfer-Encoding")) || vv(nVar) == -1 : vv(nVar) == -1;
    }

    public static String vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            try {
                bArr[i4] = (byte) (Integer.parseInt(str.substring(i5, i5 + 2), 16) & 255);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        try {
            return new String(bArr, "utf-8");
        } catch (Exception e6) {
            e6.printStackTrace();
            return str;
        }
    }

    public static boolean i(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    public static String u() {
        return vv(Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).getGlobalSaveTempDir(), false);
    }

    public static String m(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    public static long wv(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        Matcher matcher = Pattern.compile("max-age=([0-9]+)").matcher(str);
        if (matcher.find()) {
            try {
                return Long.parseLong(matcher.group(1));
            } catch (Throwable th) {
                th.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public static boolean o(Throwable th) {
        if (th == null) {
            return false;
        }
        String k4 = k(th);
        return !TextUtils.isEmpty(k4) && k4.contains("Precondition Failed");
    }

    public static boolean p(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager vv2 = vv(context);
            if (vv2 == null || (activeNetworkInfo = vv2.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean qv() {
        Context ky = com.ss.android.socialbase.downloader.downloader.p.ky();
        return (ky == null || m(ky) || !p(ky)) ? false : true;
    }

    public static String i(Context context) {
        String str = f61485p;
        if (TextUtils.isEmpty(str)) {
            String k4 = k();
            f61485p = k4;
            if (!TextUtils.isEmpty(k4)) {
                return f61485p;
            }
            String b5 = b();
            f61485p = b5;
            if (!TextUtils.isEmpty(b5)) {
                return f61485p;
            }
            String o4 = o(context);
            f61485p = o4;
            if (!TextUtils.isEmpty(o4)) {
                return f61485p;
            }
            String wv2 = wv();
            f61485p = wv2;
            return wv2;
        }
        return str;
    }

    public static long m(List<com.ss.android.socialbase.downloader.model.m> list) {
        long j4 = 0;
        for (com.ss.android.socialbase.downloader.model.m mVar : list) {
            j4 += mVar.q();
        }
        return j4;
    }

    public static String k(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "throwable getMsg error";
        }
    }

    public static com.ss.android.socialbase.downloader.constants.u o(int i4) {
        com.ss.android.socialbase.downloader.constants.u uVar = com.ss.android.socialbase.downloader.constants.u.MAIN;
        com.ss.android.socialbase.downloader.constants.u uVar2 = com.ss.android.socialbase.downloader.constants.u.SUB;
        if (i4 != uVar2.ordinal()) {
            uVar2 = com.ss.android.socialbase.downloader.constants.u.NOTIFICATION;
            if (i4 != uVar2.ordinal()) {
                return uVar;
            }
        }
        return uVar2;
    }

    public static void m(DownloadInfo downloadInfo) {
        com.ss.android.socialbase.downloader.n.vv vv2;
        JSONObject i4;
        if (downloadInfo == null || (i4 = (vv2 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId())).i("download_dir")) == null) {
            return;
        }
        String optString = i4.optString("ins_desc");
        if (!TextUtils.isEmpty(optString)) {
            p(downloadInfo.getSavePath(), optString);
        }
        String title = downloadInfo.getTitle();
        if (TextUtils.isEmpty(title)) {
            title = downloadInfo.getName();
        }
        String vv3 = vv(title, vv2);
        String savePath = downloadInfo.getSavePath();
        if (TextUtils.isEmpty(vv3) || TextUtils.isEmpty(savePath)) {
            return;
        }
        File file = new File(vv3);
        for (File file2 = new File(savePath); file != null && file2 != null && file2.isDirectory() && TextUtils.equals(file.getName(), file2.getName()); file2 = file2.getParentFile()) {
            b(file2.getPath());
            file = file.getParentFile();
        }
    }

    public static boolean p() {
        Boolean bool = f61479b;
        if (bool != null) {
            return bool.booleanValue();
        }
        String i4 = i(com.ss.android.socialbase.downloader.downloader.p.ky());
        if (i4 != null) {
            if (i4.equals(com.ss.android.socialbase.downloader.downloader.p.ky().getPackageName() + ":downloader")) {
                f61479b = Boolean.TRUE;
                return f61479b.booleanValue();
            }
        }
        f61479b = Boolean.FALSE;
        return f61479b.booleanValue();
    }

    public static long vv(com.ss.android.socialbase.downloader.network.n nVar) {
        if (nVar == null) {
            return -1L;
        }
        String m4 = m(nVar, "Content-Length");
        if (TextUtils.isEmpty(m4) && vv.vv(1)) {
            return m(nVar);
        }
        try {
            return Long.parseLong(m4);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static long o(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return -1L;
        }
        List<com.ss.android.socialbase.downloader.model.m> p4 = com.ss.android.socialbase.downloader.downloader.p.ns().p(downloadInfo.getId());
        if (downloadInfo.getChunkCount() == 1) {
            return downloadInfo.getCurBytes();
        }
        if (p4 == null || p4.size() <= 1) {
            return 0L;
        }
        long i4 = i(p4);
        if (i4 >= 0) {
            return i4;
        }
        return 0L;
    }

    public static String vv(com.ss.android.socialbase.downloader.network.n nVar, String str) {
        String k4 = k(nVar.vv("Content-Disposition"));
        return TextUtils.isEmpty(k4) ? o(str) : k4;
    }

    public static String o() {
        return vv(Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).getGlobalSaveDir(), true);
    }

    public static boolean p(Throwable th) {
        if (th == null) {
            return false;
        }
        String k4 = k(th);
        return !TextUtils.isEmpty(k4) && k4.contains("network not available");
    }

    public static boolean p(BaseException baseException) {
        if (baseException == null) {
            return false;
        }
        if (baseException.getErrorCode() != 1011) {
            return baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException);
        }
        return true;
    }

    public static com.ss.android.socialbase.downloader.model.o vv(DownloadInfo downloadInfo, String str, String str2, int i4) throws BaseException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str, str2);
            boolean z4 = false;
            if (file.exists() && file.isDirectory()) {
                throw new BaseException(1035, new IOException(String.format("path is :%s, path is directory:%B:", str, Boolean.valueOf(file.isDirectory()))));
            }
            if (!file.exists()) {
                try {
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        if (!file2.exists()) {
                            if (!file2.mkdirs() && !file2.exists()) {
                                if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo).vv("opt_mkdir_failed", 0) != 1) {
                                    throw new BaseException(1030, "download savePath directory can not created:" + str);
                                }
                                int i5 = 0;
                                while (!z4) {
                                    int i6 = i5 + 1;
                                    if (i5 >= 3) {
                                        break;
                                    }
                                    try {
                                        Thread.sleep(10L);
                                        z4 = file2.mkdirs();
                                        i5 = i6;
                                    } catch (InterruptedException unused) {
                                    }
                                }
                                if (!z4) {
                                    if (i(downloadInfo.getSavePath()) < 16384) {
                                        throw new BaseException(1006, "download savePath directory can not created:" + str);
                                    }
                                    throw new BaseException(1030, "download savePath directory can not created:" + str);
                                }
                            }
                        } else {
                            file2.delete();
                            if (!file2.mkdirs() && !file2.exists()) {
                                throw new BaseException(1031, "download savePath is not directory:path=" + str);
                            }
                            throw new BaseException(1031, "download savePath is not directory:" + str);
                        }
                    }
                    file.createNewFile();
                } catch (IOException e5) {
                    throw new BaseException(1036, e5);
                }
            }
            return new com.ss.android.socialbase.downloader.model.o(file, i4);
        }
        throw new BaseException(1021, new IOException("path must be not empty"));
    }

    public static String o(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String o4 = o(str2);
        return (TextUtils.isEmpty(o4) || str.contains(o4)) ? str : new File(str, o4).getAbsolutePath();
    }

    public static boolean i() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    private static void p(Throwable th, String str) throws com.ss.android.socialbase.downloader.exception.n {
        com.ss.android.socialbase.downloader.exception.n vv2 = com.ss.android.socialbase.downloader.downloader.p.lb().vv(th, null);
        if (vv2 == null) {
            vv2 = com.ss.android.socialbase.downloader.downloader.p.lb().vv(th.getCause(), null);
        }
        if (vv2 == null) {
            return;
        }
        throw new com.ss.android.socialbase.downloader.exception.n(vv2.getErrorCode(), m(vv2, str)).vv(vv2.vv());
    }

    public static boolean i(Throwable th) {
        if (th == null) {
            return false;
        }
        String k4 = k(th);
        return !TextUtils.isEmpty(k4) && k4.contains("Exception in connect");
    }

    private static long i(List<com.ss.android.socialbase.downloader.model.m> list) {
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        long j4 = -1;
        for (com.ss.android.socialbase.downloader.model.m mVar : list) {
            if (mVar != null && (mVar.t() <= mVar.j() || mVar.j() == 0)) {
                if (j4 == -1 || j4 > mVar.t()) {
                    j4 = mVar.t();
                }
            }
        }
        return j4;
    }

    public static long p(long j4) {
        return System.currentTimeMillis() - j4;
    }

    public static boolean p(List<com.ss.android.socialbase.downloader.model.p> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (com.ss.android.socialbase.downloader.model.p pVar : list) {
            if (pVar != null && !TextUtils.isEmpty(pVar.vv()) && !TextUtils.isEmpty(pVar.m()) && "download-tc21-1-15".equals(pVar.vv()) && "download-tc21-1-15".equals(pVar.m())) {
                return true;
            }
        }
        return false;
    }

    public static int m(String str, String str2, String str3) {
        return com.ss.android.vv.p.vv(str3, new File(str, str2));
    }

    public static String m(int i4) {
        String str = "ttmd5 check code = " + i4 + ", ";
        if (i4 != 99) {
            switch (i4) {
                case 0:
                    return str + "md5 match";
                case 1:
                    return str + "md5 not match";
                case 2:
                    return str + "md5 empty";
                case 3:
                    return str + "ttmd5 version not support";
                case 4:
                    return str + "ttmd5 tag parser error";
                case 5:
                    return str + "file not exist";
                case 6:
                    return str + "get file md5 error";
                default:
                    return str;
            }
        }
        return str + "unknown error";
    }

    @TargetApi(19)
    private static void m(File file, File file2, boolean z4) throws IOException {
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            FileChannel channel2 = fileOutputStream.getChannel();
            try {
                long size = channel.size();
                long j4 = 0;
                while (j4 < size) {
                    long j5 = size - j4;
                    long transferFrom = channel2.transferFrom(channel, j4, j5 > 31457280 ? 31457280L : j5);
                    if (transferFrom == 0) {
                        break;
                    }
                    j4 += transferFrom;
                }
                if (channel2 != null) {
                    channel2.close();
                }
                fileOutputStream.close();
                channel.close();
                fileInputStream.close();
                long length = file.length();
                long length2 = file2.length();
                if (length == length2) {
                    if (z4) {
                        file2.setLastModified(file.lastModified());
                        return;
                    }
                    return;
                }
                throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel2 != null) {
                        try {
                            channel2.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                }
                throw th5;
            }
        }
    }

    public static List<com.ss.android.socialbase.downloader.model.m> vv(List<com.ss.android.socialbase.downloader.model.m> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (com.ss.android.socialbase.downloader.model.m mVar : list) {
            if (mVar != null) {
                if (mVar.i()) {
                    sparseArray.put(mVar.la(), mVar);
                    List<com.ss.android.socialbase.downloader.model.m> list2 = (List) sparseArray2.get(mVar.la());
                    if (list2 != null) {
                        for (com.ss.android.socialbase.downloader.model.m mVar2 : list2) {
                            mVar2.vv(mVar);
                        }
                        mVar.vv(list2);
                    }
                } else {
                    com.ss.android.socialbase.downloader.model.m mVar3 = (com.ss.android.socialbase.downloader.model.m) sparseArray.get(mVar.m());
                    if (mVar3 != null) {
                        List<com.ss.android.socialbase.downloader.model.m> n4 = mVar3.n();
                        if (n4 == null) {
                            n4 = new ArrayList<>();
                            mVar3.vv(n4);
                        }
                        mVar.vv(mVar3);
                        n4.add(mVar);
                    } else {
                        List list3 = (List) sparseArray2.get(mVar.m());
                        if (list3 == null) {
                            list3 = new ArrayList();
                            sparseArray2.put(mVar.m(), list3);
                        }
                        list3.add(mVar);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i4)));
        }
        return arrayList.isEmpty() ? list : arrayList;
    }

    public static boolean m(File file, File file2) throws BaseException {
        StringBuilder sb = new StringBuilder("moveFile1: src:");
        sb.append(file.getPath());
        sb.append(" dest:");
        sb.append(file2.getPath());
        boolean renameTo = file.renameTo(file2);
        if (!renameTo) {
            renameTo = vv(file, file2);
            try {
                StringBuilder sb2 = new StringBuilder("moveFile2: src:");
                sb2.append(file.getPath());
                sb2.append(" dest:");
                sb2.append(file2.getPath());
                file.delete();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return renameTo;
    }

    public static boolean m(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager vv2 = vv(context);
            if (vv2 != null && (activeNetworkInfo = vv2.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (1 == activeNetworkInfo.getType()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String vv(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return String.format("%s%s%s", str, File.separator, str2);
    }

    public static String vv(String str, String str2, String str3) {
        String vv2;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            vv2 = vv(str2, str3);
        } else {
            vv2 = vv(str, str3);
        }
        if (TextUtils.isEmpty(vv2)) {
            return null;
        }
        return String.format("%s.tp", vv2);
    }

    public static boolean m() {
        return !p() && com.ss.android.socialbase.downloader.downloader.p.p() && jh.vv(true).n();
    }

    public static boolean m(Throwable th) {
        if (th == null) {
            return false;
        }
        String k4 = k(th);
        if (!(th instanceof com.ss.android.socialbase.downloader.exception.m) || (((com.ss.android.socialbase.downloader.exception.m) th).vv() != 403 && (TextUtils.isEmpty(k4) || !k4.contains("403")))) {
            return !TextUtils.isEmpty(k4) && k4.contains("Forbidden");
        }
        return true;
    }

    public static void vv(DownloadInfo downloadInfo) {
        vv(downloadInfo, true);
    }

    public static boolean m(BaseException baseException) {
        if (baseException instanceof com.ss.android.socialbase.downloader.exception.m) {
            com.ss.android.socialbase.downloader.exception.m mVar = (com.ss.android.socialbase.downloader.exception.m) baseException;
            return mVar.vv() == 412 || mVar.vv() == 416;
        }
        return false;
    }

    public static void vv(DownloadInfo downloadInfo, boolean z4) {
        if (downloadInfo == null) {
            return;
        }
        if (z4) {
            try {
                p(downloadInfo.getSavePath(), downloadInfo.getName());
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        p(downloadInfo.getTempPath(), downloadInfo.getTempName());
        if (downloadInfo.isSavePathRedirected()) {
            m(downloadInfo);
        }
        if (z4) {
            String o4 = o(downloadInfo.getUrl());
            if (TextUtils.isEmpty(o4) || TextUtils.isEmpty(downloadInfo.getSavePath()) || !downloadInfo.getSavePath().contains(o4)) {
                return;
            }
            b(downloadInfo.getSavePath());
        }
    }

    public static String m(Throwable th, String str) {
        if (str == null) {
            return k(th);
        }
        return str + "-" + k(th);
    }

    public static void m(List<com.ss.android.socialbase.downloader.model.p> list, DownloadInfo downloadInfo) {
        long ttnetProtectTimeout = downloadInfo.getTtnetProtectTimeout();
        if (ttnetProtectTimeout > 300) {
            list.add(new com.ss.android.socialbase.downloader.model.p("extra_ttnet_protect_timeout", String.valueOf(ttnetProtectTimeout)));
        }
    }

    public static String m(com.ss.android.socialbase.downloader.network.n nVar, String str) {
        if (nVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String vv2 = nVar.vv(str);
        if (com.ss.android.socialbase.downloader.n.vv.p().m("fix_get_http_resp_head_ignore_case", true)) {
            if (TextUtils.isEmpty(vv2)) {
                vv2 = nVar.vv(str.toLowerCase());
            }
            return TextUtils.isEmpty(vv2) ? nVar.vv(str.toUpperCase()) : vv2;
        }
        return vv2;
    }

    public static boolean vv(Context context, String str) {
        return (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) ? false : true;
    }

    public static boolean vv(DownloadInfo downloadInfo, boolean z4, String str) {
        if (!z4 && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            try {
                if (new File(downloadInfo.getSavePath(), downloadInfo.getName()).exists()) {
                    if (p(downloadInfo.getSavePath(), downloadInfo.getName(), str)) {
                        return true;
                    }
                }
            } catch (OutOfMemoryError e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    public static boolean m(BaseException baseException, DownloadInfo downloadInfo) {
        return downloadInfo != null && downloadInfo.isOnlyWifi() && p(com.ss.android.socialbase.downloader.downloader.p.ky());
    }

    public static int vv(File file, String str) {
        return com.ss.android.vv.p.vv(str, file);
    }

    public static double vv(long j4) {
        double d5 = j4;
        Double.isNaN(d5);
        return d5 / 1048576.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vv(com.ss.android.socialbase.downloader.model.DownloadInfo r18, com.ss.android.socialbase.downloader.depend.l r19, com.ss.android.socialbase.downloader.depend.pj r20) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.wv.u.vv(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.depend.l, com.ss.android.socialbase.downloader.depend.pj):void");
    }

    private static void vv(int i4, boolean z4, BaseException baseException) {
        synchronized (f61480i) {
            List<pj> list = f61484o.get(i4);
            if (list != null) {
                for (pj pjVar : list) {
                    if (pjVar != null) {
                        if (z4) {
                            pjVar.vv();
                        } else {
                            pjVar.vv(baseException);
                        }
                    }
                }
            }
            com.ss.android.socialbase.downloader.p.vv.m(vv, "handleTempSaveCallback id:".concat(String.valueOf(i4)));
            f61480i.remove(i4);
        }
    }

    public static void vv(DownloadInfo downloadInfo, String str) throws BaseException {
        if (downloadInfo == null || TextUtils.isEmpty(str) || str.equals(downloadInfo.getName())) {
            return;
        }
        File file = new File(downloadInfo.getSavePath(), str);
        File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        StringBuilder sb = new StringBuilder("copyFileFromExistFileWithSameName: existFile:");
        sb.append(file.getPath());
        sb.append(" targetFile:");
        sb.append(file2.getPath());
        if (file2.exists() && !file2.canWrite()) {
            throw new BaseException(1001, "targetPath file exists but read-only");
        }
        if (!vv(file, file2)) {
            throw new BaseException(1001, String.format("Can't copy the exist file(%s/%s) to the target file(%s/%s)", downloadInfo.getSavePath(), str, downloadInfo.getSavePath(), downloadInfo.getName()));
        }
    }

    public static boolean vv(File file, File file2) throws BaseException {
        return vv(file, file2, true);
    }

    public static boolean vv(File file, File file2, boolean z4) throws BaseException {
        if (file != null && file2 != null) {
            try {
                if (file.exists() && !file.isDirectory() && !file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                        throw new BaseException(1053, "Destination '" + parentFile + "' directory cannot be created");
                    }
                    StringBuilder sb = new StringBuilder("copyFile: srcFile:");
                    sb.append(file.getPath());
                    sb.append(" destFile:");
                    sb.append(file2.getPath());
                    if (file2.exists() && !file2.canWrite()) {
                        throw new IOException("Destination '" + file2 + "' exists but is read-only");
                    }
                    m(file, file2, z4);
                    return true;
                }
            } catch (BaseException e5) {
                throw e5;
            } catch (Throwable th) {
                vv(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    public static boolean vv(int i4, String str) {
        if (vv.vv(16777216)) {
            return i4 == 206 || i4 == 1;
        } else if (i4 >= 400) {
            return false;
        } else {
            return i4 == 206 || i4 == 1 || "bytes".equals(str);
        }
    }

    public static List<com.ss.android.socialbase.downloader.model.p> vv(List<com.ss.android.socialbase.downloader.model.p> list, String str, com.ss.android.socialbase.downloader.model.m mVar) {
        return vv(list, str, mVar.r(), mVar.j());
    }

    public static List<com.ss.android.socialbase.downloader.model.p> vv(List<com.ss.android.socialbase.downloader.model.p> list, String str, long j4, long j5) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (com.ss.android.socialbase.downloader.model.p pVar : list) {
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new com.ss.android.socialbase.downloader.model.p("If-Match", str));
        }
        arrayList.add(new com.ss.android.socialbase.downloader.model.p("Accept-Encoding", "identity"));
        String format = j5 <= 0 ? String.format("bytes=%s-", String.valueOf(j4)) : String.format("bytes=%s-%s", String.valueOf(j4), String.valueOf(j5));
        arrayList.add(new com.ss.android.socialbase.downloader.model.p("Range", format));
        String str2 = vv;
        com.ss.android.socialbase.downloader.p.vv.m(str2, " range CurrentOffset:" + j4 + " EndOffset:" + j5 + ", range = " + format);
        return arrayList;
    }

    public static boolean vv(int i4, String str, String str2) {
        return i4 == -3 && !i(str, str2);
    }

    public static ConnectivityManager vv(Context context) {
        ConnectivityManager connectivityManager = wv;
        if (connectivityManager == null) {
            ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
            wv = connectivityManager2;
            return connectivityManager2;
        }
        return connectivityManager;
    }

    public static boolean vv() {
        Boolean bool = f61481k;
        if (bool != null) {
            return bool.booleanValue();
        }
        String i4 = i(com.ss.android.socialbase.downloader.downloader.p.ky());
        Boolean valueOf = Boolean.valueOf((i4 == null || !i4.contains(":")) && i4 != null && i4.equals(com.ss.android.socialbase.downloader.downloader.p.ky().getPackageName()));
        f61481k = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean vv(Throwable th) {
        if (th == null) {
            return false;
        }
        String k4 = k(th);
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        return !TextUtils.isEmpty(k4) && (k4.contains("time out") || k4.contains("Time-out"));
    }

    public static boolean vv(BaseException baseException) {
        return baseException != null && baseException.getErrorCode() == 1051;
    }

    public static void vv(Throwable th, String str) throws BaseException {
        String str2 = !TextUtils.isEmpty(str) ? str : "";
        if (!(th instanceof BaseException)) {
            if (!(th instanceof SSLHandshakeException)) {
                if (!vv(th)) {
                    if (!o(th)) {
                        if (!u(th)) {
                            if (!m(th)) {
                                if (!p(th)) {
                                    if (!i(th)) {
                                        if (th instanceof IOException) {
                                            p(th, str);
                                            vv((IOException) th, str);
                                            return;
                                        }
                                        throw new BaseException(1000, m(th, str2));
                                    }
                                    throw new BaseException(1041, m(th, str2));
                                }
                                throw new BaseException(1049, m(th, str2));
                            }
                            throw new BaseException(1047, m(th, str2));
                        }
                        throw new com.ss.android.socialbase.downloader.exception.m(1004, 416, m(th, str2));
                    }
                    throw new com.ss.android.socialbase.downloader.exception.m(1004, TTAdConstant.IMAGE_URL_CODE, m(th, str2));
                }
                throw new BaseException(1048, m(th, str2));
            }
            throw new BaseException(1011, m(th, str2));
        }
        BaseException baseException = (BaseException) th;
        baseException.setErrorMsg(str2 + "-" + baseException.getErrorMessage());
        throw baseException;
    }

    public static void vv(IOException iOException, String str) throws BaseException {
        if (str == null) {
            str = "";
        }
        String m4 = m(iOException, str);
        if (!(iOException instanceof ConnectException)) {
            if (!(iOException instanceof UnknownHostException)) {
                if (!(iOException instanceof NoRouteToHostException)) {
                    if (!(iOException instanceof UnknownServiceException)) {
                        if (!(iOException instanceof PortUnreachableException)) {
                            if (!(iOException instanceof SocketTimeoutException)) {
                                if (!(iOException instanceof SocketException)) {
                                    if (!(iOException instanceof HttpRetryException)) {
                                        if (!(iOException instanceof ProtocolException)) {
                                            if (!(iOException instanceof MalformedURLException)) {
                                                if (!(iOException instanceof FileNotFoundException)) {
                                                    if (!(iOException instanceof InterruptedIOException)) {
                                                        if (!(iOException instanceof UnsupportedEncodingException)) {
                                                            if (!(iOException instanceof EOFException)) {
                                                                if (!(iOException instanceof StreamResetException)) {
                                                                    if (!(iOException instanceof SSLException)) {
                                                                        if (qv(iOException)) {
                                                                            throw new BaseException(1006, m4);
                                                                        }
                                                                        throw new BaseException((int) Log.LogWrapper.MAX_MSG_LEN, m4);
                                                                    }
                                                                    throw new BaseException(1011, m4);
                                                                }
                                                                throw new BaseException(1067, m4);
                                                            }
                                                            throw new BaseException(1066, m4);
                                                        }
                                                        throw new BaseException(1065, m4);
                                                    }
                                                    throw new BaseException(1064, m4);
                                                }
                                                throw new BaseException(1063, m4);
                                            }
                                            throw new BaseException(1062, m4);
                                        }
                                        throw new BaseException(1061, m4);
                                    }
                                    throw new BaseException(1060, m4);
                                }
                                throw new BaseException(1059, m4);
                            }
                            throw new BaseException(1048, m4);
                        }
                        throw new BaseException(1058, m4);
                    }
                    throw new BaseException(1057, m4);
                }
                throw new BaseException(1056, m4);
            }
            throw new BaseException(1055, m4);
        }
        throw new BaseException(1041, m4);
    }

    public static boolean vv(BaseException baseException, DownloadInfo downloadInfo) {
        if (baseException == null) {
            return false;
        }
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1000 || errorCode == 1032 || errorCode == 1033 || errorCode == 1034 || errorCode == 1008 || errorCode == 1026 || errorCode == 1027 || errorCode == 1044 || errorCode == 1020) {
            return true;
        }
        return (errorCode == 1049 || errorCode == 1055 || errorCode == 1006 || downloadInfo == null || downloadInfo.getCurBytes() >= 8388608) ? false : true;
    }

    public static <K> HashMap<Integer, K> vv(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap<Integer, K> hashMap = new HashMap<>();
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = sparseArray.keyAt(i4);
            hashMap.put(Integer.valueOf(keyAt), sparseArray.valueAt(i4));
        }
        return hashMap;
    }

    public static <K> void vv(SparseArray<K> sparseArray, Map<Integer, K> map) {
        if (map == null || sparseArray == null) {
            return;
        }
        for (Integer num : map.keySet()) {
            if (num != null) {
                sparseArray.put(num.intValue(), map.get(num));
            }
        }
    }

    public static boolean vv(List<com.ss.android.socialbase.downloader.model.p> list, List<com.ss.android.socialbase.downloader.model.p> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public static void vv(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void vv(Cursor... cursorArr) {
        if (cursorArr == null) {
            return;
        }
        for (Cursor cursor : cursorArr) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static String vv(String str, int i4) {
        return i4 == 0 ? "" : (TextUtils.isEmpty(str) || str.length() <= i4) ? str : str.substring(0, i4);
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

    private static String vv(File file, boolean z4) {
        Context ky = com.ss.android.socialbase.downloader.downloader.p.ky();
        if (vv(file)) {
            return file.getAbsolutePath();
        }
        int i4 = ky.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT >= 29 && ((i4 == 29 && !Environment.isExternalStorageLegacy()) || i4 > 29)) {
            File externalFilesDir = ky.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
            if (vv(externalFilesDir)) {
                return externalFilesDir.getAbsolutePath();
            }
        } else {
            if (z4) {
                File n4 = n();
                if (vv(n4)) {
                    return n4.getAbsolutePath();
                }
            }
            File externalFilesDir2 = ky.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
            if (vv(externalFilesDir2)) {
                return externalFilesDir2.getAbsolutePath();
            }
        }
        return ky.getFilesDir().getAbsolutePath();
    }

    public static boolean vv(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists() || file.mkdirs()) {
                return file.isDirectory();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void vv(List<com.ss.android.socialbase.downloader.model.p> list, DownloadInfo downloadInfo) {
        long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
        if (throttleNetSpeed > 0) {
            list.add(new com.ss.android.socialbase.downloader.model.p("extra_throttle_net_speed", String.valueOf(throttleNetSpeed)));
        }
    }

    public static int vv(Object obj, int i4) {
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException unused) {
            return i4;
        }
    }

    public static String vv(Object obj, String str) {
        try {
            return (String) obj;
        } catch (ClassCastException unused) {
            return str;
        }
    }

    public static boolean vv(Object obj, boolean z4) {
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            return z4;
        }
    }
}
