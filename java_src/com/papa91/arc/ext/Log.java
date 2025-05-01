package com.papa91.arc.ext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.Arrays;
/* loaded from: classes5.dex */
public class Log {
    public static final String BAD_IMPLEMENTATION = "Bad implementation";
    private static final boolean DISABLE_LOG = true;
    private static final long FLUSH_LOG_EVERY_MS = 5000;
    static String LOG_FILE = "/last_run.log";
    public static final String TAG = "WF-LOG";
    static volatile boolean closed;
    static final Runnable flushTask = new Runnable() { // from class: com.papa91.arc.ext.Log.1
        @Override // java.lang.Runnable
        public void run() {
            Log.flush(true);
        }
    };
    private static long lastFlush = 0;
    public static String lastSearchLog = "- none -";
    static StringBuilder lastSearchLogCurrent = null;
    static volatile BufferedWriter writer = null;

    /* loaded from: classes5.dex */
    public static class LogWrapper {
        public static final int MAX_MSG_LEN = 1023;
        public static final int MAX_TAG_LEN = 23;
        private static final boolean OFF = false;

        public static int d(String str, String str2) {
            return log(2, str, str2, null);
        }

        public static int e(String str, String str2) {
            return log(9, str, str2, null);
        }

        private static String fixTag(String str) {
            return str == null ? "null" : str.length() > 23 ? str.substring(0, 23) : str;
        }

        public static int i(String str, String str2) {
            return log(4, str, str2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
            return 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int log(int r3, java.lang.String r4, java.lang.String r5, java.lang.Throwable r6) {
            /*
                fixTag(r4)
                if (r5 != 0) goto L7
                java.lang.String r5 = "null"
            L7:
                int r4 = r5.length()
                r6 = 0
                r0 = 0
            Ld:
                int r1 = r4 - r0
                r2 = 1023(0x3ff, float:1.434E-42)
                if (r1 <= r2) goto L15
                r1 = 1023(0x3ff, float:1.434E-42)
            L15:
                int r1 = r1 + r0
                r5.substring(r0, r1)
                if (r3 == 0) goto L2d
                r0 = 1
                if (r3 == r0) goto L2d
                r0 = 3
                if (r3 == r0) goto L2d
                r0 = 5
                if (r3 == r0) goto L2d
                r0 = 10
                if (r3 == r0) goto L2d
                r0 = 7
                if (r3 == r0) goto L2d
                r0 = 8
            L2d:
                if (r1 < r4) goto L30
                return r6
            L30:
                r0 = r1
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: com.papa91.arc.ext.Log.LogWrapper.log(int, java.lang.String, java.lang.String, java.lang.Throwable):int");
        }

        public static int v(String str, String str2) {
            return log(0, str, str2, null);
        }

        public static int w(String str, String str2) {
            return log(6, str, str2, null);
        }

        public static int d(String str, String str2, Throwable th) {
            return log(3, str, str2, th);
        }

        public static int e(String str, String str2, Throwable th) {
            return log(10, str, str2, th);
        }

        public static int i(String str, String str2, Throwable th) {
            return log(5, str, str2, th);
        }

        public static int v(String str, String str2, Throwable th) {
            return log(1, str, str2, th);
        }

        public static int w(String str, String str2, Throwable th) {
            return log(7, str, str2, th);
        }

        public static int w(String str, Throwable th) {
            return log(8, str, null, th);
        }
    }

    public static int badImplementation(Throwable th) {
        return w(BAD_IMPLEMENTATION, th);
    }

    public static void close() {
        ThreadManager.runOnLogThread(new Runnable() { // from class: com.papa91.arc.ext.Log.2
            @Override // java.lang.Runnable
            public void run() {
                Log.closed = true;
                if (Log.writer != null) {
                    try {
                        Log.writer.flush();
                        Log.writer.close();
                        Log.writer = null;
                    } catch (IOException e5) {
                        LogWrapper.d(Log.TAG, "Log close: I/O", e5);
                    }
                }
            }
        });
    }

    public static void crash() {
        ThreadManager.runOnLogThread(new Runnable() { // from class: com.papa91.arc.ext.Log.3
            @Override // java.lang.Runnable
            public void run() {
                Log.close();
            }
        });
    }

    public static int d(String str) {
        return d(TAG, str);
    }

    public static int e(String str) {
        return e(TAG, str);
    }

    public static boolean flush(boolean z4) {
        if (writer == null) {
            return false;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastFlush > 5000 || z4) {
                try {
                    writer.flush();
                } catch (NullPointerException unused) {
                }
                lastFlush = currentTimeMillis;
                return true;
            }
            return false;
        } catch (IOException e5) {
            LogWrapper.d(TAG, "Log write: I/O", e5);
            return false;
        }
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
        } catch (OutOfMemoryError unused) {
            printWriter.write("OutOfMemoryError 1\n");
            while (th != null) {
                try {
                    printWriter.write(th.toString());
                    printWriter.write("\n");
                } catch (OutOfMemoryError unused2) {
                    printWriter.write("OutOfMemoryError 2\n");
                }
                th = th.getCause();
            }
        } catch (Throwable th3) {
            printWriter.write("Exception on printStackTrace: " + th3.getMessage());
        }
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        return stringWriter2 == null ? "" : stringWriter2;
    }

    public static void here() {
        Thread currentThread = Thread.currentThread();
        StackTraceElement stackTraceElement = currentThread.getStackTrace()[3];
        d("here: " + currentThread.getName() + " : " + currentThread.getId() + " : " + stackTraceElement.getFileName() + " : " + stackTraceElement.getClassName() + " : " + stackTraceElement.getMethodName() + " : " + stackTraceElement.getLineNumber());
    }

    public static int i(String str) {
        return i(TAG, str);
    }

    public static int iFull(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1003;
            i(str.substring(i4, i5 < length ? i5 : length));
            i4 = i5;
        }
        return 0;
    }

    static void reopen() {
    }

    public static void runLogOnProcessErrStream(final Process process, final InputStream inputStream) {
        if (process != null) {
            new DaemonThread("runLogOnProcessErrStream") { // from class: com.papa91.arc.ext.Log.4
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    super.run();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 512);
                        int[] iArr = null;
                        boolean z4 = false;
                        int i4 = 0;
                        int i5 = 0;
                        while (!Thread.interrupted()) {
                            if (z4) {
                                try {
                                    process.exitValue();
                                    return;
                                } catch (ArrayIndexOutOfBoundsException e5) {
                                    Log.badImplementation(e5);
                                } catch (IllegalThreadStateException unused) {
                                }
                            }
                            try {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        String trim = readLine.trim();
                                        if (trim.length() != 0) {
                                            if (trim.startsWith("KEY: ")) {
                                                try {
                                                    int parseInt = Integer.parseInt(trim.substring(5));
                                                    if (iArr == null) {
                                                        iArr = new int[512];
                                                    }
                                                    if (i4 == iArr.length) {
                                                        iArr = Arrays.copyOf(iArr, iArr.length + 512);
                                                    }
                                                    int i6 = i4 + 1;
                                                    try {
                                                        iArr[i4] = parseInt;
                                                    } catch (NumberFormatException e6) {
                                                        try {
                                                            Log.w("Failed parse: " + trim, e6);
                                                        } catch (IllegalArgumentException e7) {
                                                            Log.badImplementation(e7);
                                                            i5++;
                                                        }
                                                    }
                                                    i4 = i6;
                                                } catch (NumberFormatException e8) {
                                                    Log.w("Failed parse: " + trim, e8);
                                                }
                                            } else if (trim.startsWith("KEY_END")) {
                                                iArr = null;
                                                i4 = 0;
                                            } else if (trim.startsWith("EVENT: ")) {
                                                try {
                                                    Integer.parseInt(trim.substring(7));
                                                } catch (NumberFormatException e9) {
                                                    Log.w("Failed parse: " + trim, e9);
                                                }
                                            } else if (trim.startsWith("BAD_KERNEL")) {
                                                ThreadManager.runOnUiThread(new Runnable() { // from class: com.papa91.arc.ext.Log.4.1
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                    }
                                                });
                                            } else {
                                                StringBuilder sb = Log.lastSearchLogCurrent;
                                                if (trim.contains(" dbg: ") || trim.endsWith("Send code: 2")) {
                                                    sb = new StringBuilder();
                                                    Log.lastSearchLogCurrent = sb;
                                                }
                                                if (trim.contains(" dbg: ") || trim.contains(" clocks: ") || trim.startsWith("MR[") || trim.contains("::searchDone:")) {
                                                    if (sb == null) {
                                                        sb = new StringBuilder();
                                                        Log.lastSearchLogCurrent = sb;
                                                    }
                                                    sb.append(trim);
                                                    sb.append('\n');
                                                }
                                                if (trim.contains("::searchDone:") || trim.endsWith("Send code: 3")) {
                                                    if (sb != null) {
                                                        Log.lastSearchLog = sb.toString();
                                                    }
                                                    Log.lastSearchLogCurrent = null;
                                                }
                                            }
                                        }
                                    } else {
                                        Thread.sleep(500L);
                                    }
                                } catch (IllegalArgumentException e10) {
                                    Log.badImplementation(e10);
                                    i5++;
                                    if (i5 <= 30) {
                                        return;
                                    }
                                }
                            } catch (IOException unused2) {
                                z4 = true;
                            } catch (InterruptedException unused3) {
                                return;
                            }
                        }
                    } catch (NullPointerException e11) {
                        Log.w("runLogOnProcessErrStream failed", e11);
                    }
                }
            }.start();
        }
    }

    public static synchronized void s(String str) {
        synchronized (Log.class) {
        }
    }

    public static int v(String str) {
        return v(TAG, str);
    }

    public static int w(String str) {
        return w(TAG, str);
    }

    public static int wt(String str, Throwable th) {
        return LogWrapper.w(str, th);
    }

    public static int d(String str, Throwable th) {
        return d(TAG, str, th);
    }

    public static int e(String str, Throwable th) {
        return e(TAG, str, th);
    }

    public static int i(String str, Throwable th) {
        return i(TAG, str, th);
    }

    public static int v(String str, Throwable th) {
        return v(TAG, str, th);
    }

    public static int w(String str, Throwable th) {
        return w(TAG, str, th);
    }

    public static int d(String str, String str2) {
        return LogWrapper.d(str, str2);
    }

    public static int e(String str, String str2) {
        return LogWrapper.e(str, str2);
    }

    public static int i(String str, String str2) {
        return LogWrapper.i(str, str2);
    }

    public static int v(String str, String str2) {
        return LogWrapper.v(str, str2);
    }

    public static int w(String str, String str2) {
        return LogWrapper.w(str, str2);
    }

    public static int d(String str, String str2, Throwable th) {
        return LogWrapper.d(str, str2, th);
    }

    public static int e(String str, String str2, Throwable th) {
        return LogWrapper.e(str, str2, th);
    }

    public static int i(String str, String str2, Throwable th) {
        return LogWrapper.i(str, str2, th);
    }

    public static int v(String str, String str2, Throwable th) {
        return LogWrapper.v(str, str2, th);
    }

    public static int w(String str, String str2, Throwable th) {
        return LogWrapper.w(str, str2, th);
    }
}
