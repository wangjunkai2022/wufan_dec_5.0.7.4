package com.androidquery.util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class AQUtility {
    private static final int IO_BUFFER_SIZE = 4096;
    private static File cacheDir;
    private static Context context;
    private static boolean debug;
    private static Thread.UncaughtExceptionHandler eh;
    private static Handler handler;
    private static final byte[] map2;
    private static File pcacheDir;
    private static ScheduledExecutorService storeExe;
    private static Object wait;
    private static Map<String, Long> times = new HashMap();
    public static boolean TEST_IO_EXCEPTION = false;
    private static final char[] map1 = new char[64];

    static {
        char c5 = 'A';
        int i4 = 0;
        while (c5 <= 'Z') {
            map1[i4] = c5;
            c5 = (char) (c5 + 1);
            i4++;
        }
        char c6 = 'a';
        while (c6 <= 'z') {
            map1[i4] = c6;
            c6 = (char) (c6 + 1);
            i4++;
        }
        char c7 = '0';
        while (c7 <= '9') {
            map1[i4] = c7;
            c7 = (char) (c7 + 1);
            i4++;
        }
        char[] cArr = map1;
        cArr[i4] = '+';
        cArr[i4 + 1] = '/';
        map2 = new byte[128];
        int i5 = 0;
        while (true) {
            byte[] bArr = map2;
            if (i5 >= bArr.length) {
                break;
            }
            bArr[i5] = -1;
            i5++;
        }
        for (int i6 = 0; i6 < 64; i6++) {
            map2[map1[i6]] = (byte) i6;
        }
    }

    public static void apply(SharedPreferences.Editor editor) {
        if (Constants.SDK_INT >= 9) {
            invokeHandler(editor, "apply", false, true, null, null);
        } else {
            editor.commit();
        }
    }

    public static void cleanCache(File file, long j4, long j5) {
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            Arrays.sort(listFiles, new Common());
            if (testCleanNeeded(listFiles, j4)) {
                cleanCache(listFiles, j5);
            }
            File tempDir = getTempDir();
            if (tempDir == null || !tempDir.exists()) {
                return;
            }
            cleanCache(tempDir.listFiles(), 0L);
        } catch (Exception e5) {
            report(e5);
        }
    }

    public static void cleanCacheAsync(Context context2) {
        cleanCacheAsync(context2, 3000000L, 2000000L);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        copy(inputStream, outputStream, 0, null);
    }

    public static void debug(Object obj) {
        if (debug) {
            new StringBuilder().append(obj);
        }
    }

    public static void debugNotify() {
        Object obj;
        if (!debug || (obj = wait) == null) {
            return;
        }
        synchronized (obj) {
            wait.notifyAll();
        }
    }

    public static void debugWait(long j4) {
        if (debug) {
            if (wait == null) {
                wait = new Object();
            }
            synchronized (wait) {
                try {
                    wait.wait(j4);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static int dip2pixel(Context context2, float f5) {
        return (int) TypedValue.applyDimension(1, f5, context2.getResources().getDisplayMetrics());
    }

    public static char[] encode64(byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9 = ((i5 * 4) + 2) / 3;
        char[] cArr = new char[((i5 + 2) / 3) * 4];
        int i10 = i5 + i4;
        int i11 = 0;
        while (i4 < i10) {
            int i12 = i4 + 1;
            int i13 = bArr[i4] & 255;
            if (i12 < i10) {
                i6 = i12 + 1;
                i7 = bArr[i12] & 255;
            } else {
                i6 = i12;
                i7 = 0;
            }
            if (i6 < i10) {
                i8 = bArr[i6] & 255;
                i6++;
            } else {
                i8 = 0;
            }
            int i14 = i13 >>> 2;
            int i15 = ((i13 & 3) << 4) | (i7 >>> 4);
            int i16 = ((i7 & 15) << 2) | (i8 >>> 6);
            int i17 = i8 & 63;
            int i18 = i11 + 1;
            char[] cArr2 = map1;
            cArr[i11] = cArr2[i14];
            int i19 = i18 + 1;
            cArr[i18] = cArr2[i15];
            char c5 = '=';
            cArr[i19] = i19 < i9 ? cArr2[i16] : '=';
            int i20 = i19 + 1;
            if (i20 < i9) {
                c5 = cArr2[i17];
            }
            cArr[i20] = c5;
            i11 = i20 + 1;
            i4 = i6;
        }
        return cArr;
    }

    public static void ensureUIThread() {
        if (isUIThread()) {
            return;
        }
        report(new IllegalStateException("Not UI Thread"));
    }

    public static File getCacheDir(Context context2, int i4) {
        if (i4 == 1) {
            File file = pcacheDir;
            if (file != null) {
                return file;
            }
            File file2 = new File(getCacheDir(context2), "persistent");
            pcacheDir = file2;
            file2.mkdirs();
            return pcacheDir;
        }
        return getCacheDir(context2);
    }

    public static File getCacheFile(File file, String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(File.separator)) {
            return new File(str);
        }
        return makeCacheFile(file, getCacheFileName(str));
    }

    private static String getCacheFileName(String str) {
        return getMD5Hex(str);
    }

    public static Context getContext() {
        if (context == null) {
            warn("warn", "getContext with null");
            debug((Throwable) new IllegalStateException());
        }
        return context;
    }

    public static File getExistedCacheByUrl(File file, String str) {
        File cacheFile = getCacheFile(file, str);
        if (cacheFile == null || !cacheFile.exists() || cacheFile.length() == 0) {
            return null;
        }
        return cacheFile;
    }

    public static File getExistedCacheByUrlSetAccess(File file, String str) {
        File existedCacheByUrl = getExistedCacheByUrl(file, str);
        if (existedCacheByUrl != null) {
            lastAccess(existedCacheByUrl);
        }
        return existedCacheByUrl;
    }

    private static ScheduledExecutorService getFileStoreExecutor() {
        if (storeExe == null) {
            storeExe = Executors.newSingleThreadScheduledExecutor();
        }
        return storeExe;
    }

    public static Handler getHandler() {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        return handler;
    }

    private static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e5) {
            report(e5);
            return null;
        }
    }

    private static String getMD5Hex(String str) {
        return new BigInteger(getMD5(str.getBytes())).abs().toString(36);
    }

    public static File getTempDir() {
        File file = new File(Environment.getExternalStorageDirectory(), "aquery/temp");
        file.mkdirs();
        if (file.exists() && file.canWrite()) {
            return file;
        }
        return null;
    }

    public static Object invokeHandler(Object obj, String str, boolean z4, boolean z5, Class<?>[] clsArr, Object... objArr) {
        return invokeHandler(obj, str, z4, z5, clsArr, null, objArr);
    }

    private static Object invokeMethod(Object obj, String str, boolean z4, Class<?>[] clsArr, Class<?>[] clsArr2, Object... objArr) throws Exception {
        if (obj != null && str != null) {
            if (clsArr == null) {
                try {
                    clsArr = new Class[0];
                } catch (NoSuchMethodException unused) {
                    if (z4) {
                        try {
                            if (clsArr2 == null) {
                                return obj.getClass().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
                            }
                            return obj.getClass().getMethod(str, clsArr2).invoke(obj, objArr);
                        } catch (NoSuchMethodException unused2) {
                        }
                    }
                }
            }
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        }
        return null;
    }

    public static boolean isDebug() {
        return debug;
    }

    public static boolean isUIThread() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    private static void lastAccess(File file) {
        file.setLastModified(System.currentTimeMillis());
    }

    private static File makeCacheFile(File file, String str) {
        return new File(file, str);
    }

    public static float pixel2dip(Context context2, float f5) {
        return f5 / (context2.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static void post(Runnable runnable) {
        getHandler().post(runnable);
    }

    public static void postAsync(final Runnable runnable) {
        new AsyncTask<Void, Void, String>() { // from class: com.androidquery.util.AQUtility.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public String doInBackground(Void... voidArr) {
                try {
                    runnable.run();
                    return null;
                } catch (Exception e5) {
                    AQUtility.report(e5);
                    return null;
                }
            }
        }.execute(new Void[0]);
    }

    public static void postDelayed(Runnable runnable, long j4) {
        getHandler().postDelayed(runnable, j4);
    }

    public static void removePost(Runnable runnable) {
        getHandler().removeCallbacks(runnable);
    }

    public static void report(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            warn("reporting", Log.getStackTraceString(th));
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = eh;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static void setAlpha(View view, float f5) {
        if (f5 == 1.0f) {
            view.clearAnimation();
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f5, f5);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public static void setCacheDir(File file) {
        cacheDir = file;
        if (file != null) {
            file.mkdirs();
        }
    }

    public static void setContext(Application application) {
        context = application.getApplicationContext();
    }

    public static void setDebug(boolean z4) {
        debug = z4;
    }

    public static void setExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        eh = uncaughtExceptionHandler;
    }

    public static void store(File file, byte[] bArr) {
        if (file != null) {
            try {
                write(file, bArr);
            } catch (Exception e5) {
                report(e5);
            }
        }
    }

    public static void storeAsync(File file, byte[] bArr, long j4) {
        getFileStoreExecutor().schedule(new Common().method(1, file, bArr), j4, TimeUnit.MILLISECONDS);
    }

    private static boolean testCleanNeeded(File[] fileArr, long j4) {
        long j5 = 0;
        for (File file : fileArr) {
            j5 += file.length();
            if (j5 > j4) {
                return true;
            }
        }
        return false;
    }

    public static void time(String str) {
        times.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static long timeEnd(String str, long j4) {
        Long l4 = times.get(str);
        if (l4 == null) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
        if (j4 == 0 || currentTimeMillis > j4) {
            debug(str, Long.valueOf(currentTimeMillis));
        }
        return currentTimeMillis;
    }

    public static byte[] toBytes(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copy(inputStream, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            report(e5);
            bArr = null;
        }
        close(inputStream);
        return bArr;
    }

    public static void transparent(View view, boolean z4) {
        setAlpha(view, z4 ? 0.5f : 1.0f);
    }

    public static void warn(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(":");
        sb.append(obj2);
    }

    public static void write(File file, byte[] bArr) {
        try {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e5) {
                    debug("file create fail", file);
                    report(e5);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Exception e6) {
            report(e6);
        }
    }

    public static void cleanCacheAsync(Context context2, long j4, long j5) {
        try {
            getFileStoreExecutor().schedule(new Common().method(2, getCacheDir(context2), Long.valueOf(j4), Long.valueOf(j5)), 0L, TimeUnit.MILLISECONDS);
        } catch (Exception e5) {
            report(e5);
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i4, Progress progress) throws IOException {
        if (progress != null) {
            progress.reset();
            progress.setBytes(i4);
        }
        byte[] bArr = new byte[4096];
        int i5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                if (progress != null) {
                    progress.done();
                    return;
                }
                return;
            }
            outputStream.write(bArr, 0, read);
            i5++;
            if (TEST_IO_EXCEPTION && i5 > 2) {
                debug("simulating internet error");
                throw new IOException();
            } else if (progress != null) {
                progress.increment(read);
            }
        }
    }

    public static Object invokeHandler(Object obj, String str, boolean z4, boolean z5, Class<?>[] clsArr, Class<?>[] clsArr2, Object... objArr) {
        try {
            return invokeMethod(obj, str, z4, clsArr, clsArr2, objArr);
        } catch (Exception e5) {
            if (z5) {
                report(e5);
                return null;
            }
            debug((Throwable) e5);
            return null;
        }
    }

    public static void post(Object obj, String str) {
        post(obj, str, new Class[0], new Object[0]);
    }

    public static void debug(Object obj, Object obj2) {
        if (debug) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(":");
            sb.append(obj2);
        }
    }

    public static void post(final Object obj, final String str, final Class<?>[] clsArr, final Object... objArr) {
        post(new Runnable() { // from class: com.androidquery.util.AQUtility.1
            @Override // java.lang.Runnable
            public void run() {
                AQUtility.invokeHandler(obj, str, false, true, clsArr, objArr);
            }
        });
    }

    public static void postAsync(Object obj, String str) {
        postAsync(obj, str, new Class[0], new Object[0]);
    }

    public static void postAsync(final Object obj, final String str, final Class<?>[] clsArr, final Object... objArr) {
        postAsync(new Runnable() { // from class: com.androidquery.util.AQUtility.3
            @Override // java.lang.Runnable
            public void run() {
                AQUtility.invokeHandler(obj, str, false, true, clsArr, objArr);
            }
        });
    }

    public static void debug(Throwable th) {
        if (debug) {
            Log.getStackTraceString(th);
        }
    }

    public static File getCacheDir(Context context2) {
        if (cacheDir == null) {
            File file = new File(context2.getCacheDir(), "aquery");
            cacheDir = file;
            file.mkdirs();
        }
        return cacheDir;
    }

    private static void cleanCache(File[] fileArr, long j4) {
        long j5 = 0;
        int i4 = 0;
        for (File file : fileArr) {
            if (file.isFile()) {
                j5 += file.length();
                if (j5 >= j4) {
                    file.delete();
                    i4++;
                }
            }
        }
        debug("deleted", Integer.valueOf(i4));
    }
}
