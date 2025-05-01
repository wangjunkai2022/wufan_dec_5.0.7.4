package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f62735a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f62736b = true;

    /* renamed from: c  reason: collision with root package name */
    private static SimpleDateFormat f62737c = null;

    /* renamed from: d  reason: collision with root package name */
    private static int f62738d = 30720;

    /* renamed from: e  reason: collision with root package name */
    private static StringBuilder f62739e;

    /* renamed from: f  reason: collision with root package name */
    private static StringBuilder f62740f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f62741g;

    /* renamed from: h  reason: collision with root package name */
    private static a f62742h;

    /* renamed from: i  reason: collision with root package name */
    private static String f62743i;

    /* renamed from: j  reason: collision with root package name */
    private static String f62744j;

    /* renamed from: k  reason: collision with root package name */
    private static Context f62745k;

    /* renamed from: l  reason: collision with root package name */
    private static String f62746l;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f62747m;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f62748n;

    /* renamed from: o  reason: collision with root package name */
    private static ExecutorService f62749o;

    /* renamed from: p  reason: collision with root package name */
    private static int f62750p;

    /* renamed from: q  reason: collision with root package name */
    private static final Object f62751q = new Object();

    /* compiled from: BUGLY */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f62755a;

        /* renamed from: b  reason: collision with root package name */
        private File f62756b;

        /* renamed from: c  reason: collision with root package name */
        private String f62757c;

        /* renamed from: d  reason: collision with root package name */
        private long f62758d;

        /* renamed from: e  reason: collision with root package name */
        private long f62759e = 30720;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f62757c = str;
            this.f62755a = a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            try {
                File file = new File(this.f62757c);
                this.f62756b = file;
                if (file.exists() && !this.f62756b.delete()) {
                    this.f62755a = false;
                    return false;
                } else if (this.f62756b.createNewFile()) {
                    return true;
                } else {
                    this.f62755a = false;
                    return false;
                }
            } catch (Throwable th) {
                x.a(th);
                this.f62755a = false;
                return false;
            }
        }

        public final boolean a(String str) {
            byte[] bytes;
            if (!this.f62755a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f62756b, true);
                try {
                    fileOutputStream2.write(str.getBytes("UTF-8"));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f62758d += bytes.length;
                    this.f62755a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        x.a(th);
                        this.f62755a = false;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    static {
        try {
            f62737c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            x.b(th.getCause());
        }
    }

    public static synchronized void a(Context context) {
        synchronized (y.class) {
            if (f62747m || context == null || !f62735a) {
                return;
            }
            try {
                f62749o = Executors.newSingleThreadExecutor();
                f62740f = new StringBuilder(0);
                f62739e = new StringBuilder(0);
                f62745k = context;
                f62743i = com.tencent.bugly.crashreport.common.info.a.a(context).f62253d;
                f62744j = "";
                f62746l = f62745k.getFilesDir().getPath() + "/buglylog_" + f62743i + "_" + f62744j + ".txt";
                f62750p = Process.myPid();
            } catch (Throwable unused) {
            }
            f62747m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(String str, String str2, String str3) {
        synchronized (y.class) {
            if (f62736b) {
                d(str, str2, str3);
            } else {
                e(str, str2, str3);
            }
        }
    }

    private static synchronized void d(String str, String str2, String str3) {
        synchronized (y.class) {
            String a5 = a(str, str2, str3, Process.myTid());
            synchronized (f62751q) {
                f62740f.append(a5);
                if (f62740f.length() >= f62738d) {
                    StringBuilder sb = f62740f;
                    f62740f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
                }
            }
        }
    }

    private static synchronized void e(String str, String str2, String str3) {
        synchronized (y.class) {
            String a5 = a(str, str2, str3, Process.myTid());
            synchronized (f62751q) {
                try {
                    f62740f.append(a5);
                } catch (Throwable unused) {
                }
                if (f62740f.length() <= f62738d) {
                    return;
                }
                if (f62741g) {
                    return;
                }
                f62741g = true;
                a aVar = f62742h;
                if (aVar != null) {
                    if (aVar.f62756b == null || f62742h.f62756b.length() + f62740f.length() > f62742h.f62759e) {
                        f62742h.a();
                    }
                } else {
                    f62742h = new a(f62746l);
                }
                if (f62742h.a(f62740f.toString())) {
                    f62740f.setLength(0);
                    f62741g = false;
                }
            }
        }
    }

    private static byte[] b() {
        if (f62735a) {
            StringBuilder sb = new StringBuilder();
            synchronized (f62751q) {
                a aVar = f62742h;
                if (aVar != null && aVar.f62755a && f62742h.f62756b != null && f62742h.f62756b.length() > 0) {
                    sb.append(z.a(f62742h.f62756b, 30720, true));
                }
                StringBuilder sb2 = f62740f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f62740f.toString());
                }
            }
            return z.a((File) null, sb.toString(), "BuglyLog.txt");
        }
        return null;
    }

    public static void a(int i4) {
        synchronized (f62751q) {
            f62738d = i4;
            if (i4 < 0) {
                f62738d = 0;
            } else if (i4 > 30720) {
                f62738d = 30720;
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        a(str, str2, message + '\n' + z.b(th));
    }

    public static synchronized void a(final String str, final String str2, final String str3) {
        synchronized (y.class) {
            if (f62747m && f62735a) {
                try {
                    f62749o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.y.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.c(str, str2, str3);
                        }
                    });
                } catch (Exception e5) {
                    x.b(e5);
                }
            }
        }
    }

    private static String a(String str, String str2, String str3, long j4) {
        String date;
        f62739e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat = f62737c;
        if (simpleDateFormat != null) {
            date = simpleDateFormat.format(date2);
        } else {
            date = date2.toString();
        }
        StringBuilder sb = f62739e;
        sb.append(date);
        sb.append(" ");
        sb.append(f62750p);
        sb.append(" ");
        sb.append(j4);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f62739e.toString();
    }

    public static byte[] a() {
        if (f62736b) {
            if (f62735a) {
                return z.a((File) null, f62740f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return b();
    }
}
