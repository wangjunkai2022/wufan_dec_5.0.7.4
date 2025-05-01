package com.join.android.app.common.exception;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.join.android.app.common.utils.n;
import com.join.mgps.Util.h0;
import com.join.mgps.activity.SplashActivity;
import com.papa.sim.statistic.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import net.lingala.zip4j.util.e;
/* compiled from: DefaultExceptionHandler.java */
/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f14607e = true;

    /* renamed from: f  reason: collision with root package name */
    public static final String f14608f = "CrashCatchHandler";

    /* renamed from: g  reason: collision with root package name */
    private static final String f14609g = "VERSION_NAME";

    /* renamed from: h  reason: collision with root package name */
    private static final String f14610h = "VERSION_CODE";

    /* renamed from: i  reason: collision with root package name */
    private static final String f14611i = "EXCEPTION";

    /* renamed from: j  reason: collision with root package name */
    private static final String f14612j = "crash";

    /* renamed from: k  reason: collision with root package name */
    private static final String f14613k = ".log";

    /* renamed from: l  reason: collision with root package name */
    private static final int f14614l = 2000;

    /* renamed from: m  reason: collision with root package name */
    private static final String f14615m = "/log";

    /* renamed from: n  reason: collision with root package name */
    private static final String f14616n = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: o  reason: collision with root package name */
    private static final a f14617o = new a();

    /* renamed from: a  reason: collision with root package name */
    private Context f14618a;

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f14619b;

    /* renamed from: c  reason: collision with root package name */
    private Properties f14620c = new Properties();

    /* renamed from: d  reason: collision with root package name */
    private String f14621d;

    /* compiled from: DefaultExceptionHandler.java */
    /* renamed from: com.join.android.app.common.exception.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0309a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f14622b;

        C0309a(Throwable th) {
            this.f14622b = th;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            a.this.k(this.f14622b);
            a.this.i(this.f14622b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultExceptionHandler.java */
    /* loaded from: classes3.dex */
    public class b implements FilenameFilter {
        b() {
        }

        boolean a(long j4) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j4);
            int i4 = calendar.get(1);
            int i5 = calendar.get(2);
            int i6 = calendar.get(5);
            calendar.setTimeInMillis(System.currentTimeMillis());
            return i4 == calendar.get(1) && i5 == calendar.get(2) && i6 == calendar.get(5);
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str.contains(h0.f27805a)) {
                String substring = str.substring(str.lastIndexOf(h0.f27805a) + 1);
                if (TextUtils.isEmpty(substring) && substring.equals("log")) {
                    if (!a(file.lastModified()) && file.exists()) {
                        file.delete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private a() {
    }

    @SuppressLint({"CommitPrefEdits"})
    private String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        this.f14620c.put(f14611i, stringWriter.toString());
        try {
            stringWriter.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        printWriter.close();
        String str = e.F0 + f14612j + new SimpleDateFormat(f14616n, Locale.US).format(new Date()) + f14613k;
        File file = new File(this.f14621d);
        if (!file.exists()) {
            file.mkdirs();
            if (file.canWrite()) {
                return m(str);
            }
            l("unable to write to log file", null);
        } else if (file.canWrite()) {
            return m(str);
        } else {
            l("unable to write to log file", null);
        }
        return null;
    }

    public static a e() {
        return f14617o;
    }

    public static FilenameFilter f() {
        return new b();
    }

    private String g() {
        if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return this.f14618a.getCacheDir().getPath();
        }
        return this.f14618a.getExternalCacheDir().getAbsolutePath();
    }

    private void h() {
        ((AlarmManager) this.f14618a.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + 1000, PendingIntent.getActivity(this.f14618a, 0, new Intent(this.f14618a, SplashActivity.class), 0));
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(Throwable th) {
        String localizedMessage;
        if (th == null || (localizedMessage = th.getLocalizedMessage()) == null) {
            return false;
        }
        l("程序异常，即将退出:\r\n", localizedMessage);
        c();
        d(th);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer(n.n(this.f14618a).m() + ";error::");
        stringBuffer.append(th.getMessage());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            try {
                stringBuffer.append(stackTraceElement.toString());
            } catch (Exception unused) {
            }
        }
        p.l(this.f14618a).L1(stringBuffer.toString());
    }

    private void l(String str, String str2) {
    }

    public void c() {
        Field[] declaredFields;
        try {
            this.f14620c.put(f14609g, com.join.android.app.mgsim.wufun.b.f15657h);
            this.f14620c.put(f14610h, "417");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        for (Field field : Build.class.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                this.f14620c.put(field.getName(), String.valueOf(field.get(null)));
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            } catch (IllegalArgumentException e7) {
                e7.printStackTrace();
            }
        }
    }

    public void j(Context context) {
        this.f14618a = context;
        this.f14619b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f14621d = g() + f14615m;
        new File(this.f14621d).listFiles(f());
    }

    public String m(String str) {
        File file = new File(this.f14621d + str);
        try {
            file.createNewFile();
            if (file.exists() && file.canWrite()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                this.f14620c.store(fileOutputStream, "");
                fileOutputStream.flush();
                fileOutputStream.close();
                return str;
            }
            return null;
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        th.printStackTrace();
        new C0309a(th).start();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException unused) {
        }
        h();
    }
}
