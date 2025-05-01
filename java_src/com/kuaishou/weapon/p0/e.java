package com.kuaishou.weapon.p0;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f55572a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f55573b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f55574c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f55575d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f55576e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static int f55577f = -1;

    /* renamed from: g  reason: collision with root package name */
    static ThreadLocal<StringBuilder> f55578g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    private static int f55579h;

    private static void a(int i4, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length < 3) {
            return;
        }
        String fileName = stackTrace[2].getFileName();
        int lineNumber = stackTrace[2].getLineNumber();
        String methodName = stackTrace[2].getMethodName();
        if (fileName.length() > 5) {
            fileName = fileName.substring(0, fileName.length() - 5);
        }
        StringBuilder sb = f55578g.get();
        if (sb == null) {
            sb = new StringBuilder();
            f55578g.set(sb);
        }
        synchronized (sb) {
            sb.setLength(0);
            sb.append("[");
            sb.append(f55579h);
            sb.append("][");
            sb.append(fileName);
            sb.append(':');
            sb.append(lineNumber);
            sb.append(external.org.apache.commons.lang3.d.f68897a);
            sb.append(methodName);
            sb.append("] ");
            sb.append(str);
            f55579h++;
        }
    }

    public static void b(String str) {
        int i4 = f55577f;
        if (i4 == -1 || i4 == 0 || i4 == 1) {
            a(1, str);
        }
    }

    public static void c(String str) {
        int i4 = f55577f;
        if (i4 == -1 || i4 == 0 || i4 == 1 || i4 == 2) {
            a(2, str);
        }
    }

    public static void d(String str) {
    }

    public static void b(String str, Throwable th) {
        int i4 = f55577f;
        if (i4 == -1 || i4 == 0 || i4 == 1) {
            a(1, str + "\n" + a(th));
        }
    }

    public static void c(String str, Throwable th) {
        int i4 = f55577f;
        if (i4 == -1 || i4 == 0 || i4 == 1 || i4 == 2) {
            a(2, str + "\n" + a(th));
        }
    }

    public static void a(String str) {
        int i4 = f55577f;
        if (i4 == -1 || i4 == 0) {
            a(0, str);
        }
    }

    public static void a(String str, Throwable th) {
        int i4 = f55577f;
        if (i4 == -1 || i4 == 0) {
            a(0, str + "\n" + a(th));
        }
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
