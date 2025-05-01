package com.mob.tools.log;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.mob.commons.q;
import com.mob.commons.s;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes5.dex */
public class NLog implements ClassKeeper, PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, NLog> f56788a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, String> f56789b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private String f56790c;

    /* renamed from: d  reason: collision with root package name */
    private int f56791d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56792e;

    public NLog() {
        this.f56792e = false;
        this.f56790c = null;
        this.f56791d = -1;
    }

    private String a(Throwable th) {
        try {
            return Log.getStackTraceString(th);
        } catch (Throwable th2) {
            if (th2 instanceof OutOfMemoryError) {
                return s.a("023-ej8fi-el1idc1ehfcdjPdcfPelYiUdjdi2eKejifdkdkdf");
            }
            return th2.getMessage();
        }
    }

    private String b(Throwable th) {
        try {
            String name = th.getClass().getName();
            String c5 = c(th);
            String stackTraceElement = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
            Throwable th2 = th;
            while (th2 != null && th2.getCause() != null) {
                th2 = th2.getCause();
            }
            if (th2 != null && th2 != th) {
                return name + ":" + c5 + "\n" + stackTraceElement + "\n......\nCaused by:\n" + a(th2);
            }
            return a(th);
        } catch (Throwable unused) {
            return a(th);
        }
    }

    private static String c(Throwable th) {
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return "";
        }
        if (message.length() <= 1000) {
            return message;
        }
        return message.substring(0, 1000) + "\n[Message over limit size:1000, cut!]";
    }

    public static NLog getInstance(String str, int i4, String str2) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f56788a;
        synchronized (hashMap) {
            nLog = hashMap.get(str);
            if (nLog == null) {
                nLog = new NLog(str, i4);
                f56789b.put(str, str2);
                hashMap.put(str, nLog);
            }
        }
        return nLog;
    }

    public static NLog getInstanceForSDK(String str, boolean z4) {
        return getInstance(str);
    }

    public static void setCollector(String str, LogCollector logCollector) {
        getInstance(str).setCollector(logCollector);
    }

    public final void crash(Throwable th) {
        a(6, 1, b(th));
    }

    public final int d(Throwable th) {
        return log(3, th);
    }

    public final void dg() {
        this.f56792e = true;
    }

    public final int e(Throwable th) {
        return log(6, th);
    }

    public final void error(Throwable th) {
        error(a(th));
    }

    public final int i(Throwable th) {
        return log(4, th);
    }

    public final int log(int i4, Throwable th) {
        return a(i4, 0, a(th));
    }

    public NLog setCollector(LogCollector logCollector) {
        return this;
    }

    public final int v(Throwable th) {
        return log(2, th);
    }

    public final int w(Throwable th) {
        return log(5, th);
    }

    public final int d(Object obj, Object... objArr) {
        return log(3, obj, objArr);
    }

    public final int e(Throwable th, Object obj, Object... objArr) {
        return log(6, th, obj, objArr);
    }

    public final void error(String str) {
        e(str);
    }

    public final int i(Throwable th, Object obj, Object... objArr) {
        return log(4, th, obj, objArr);
    }

    public final int log(int i4, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return a(i4, 0, obj2);
    }

    public final int v(Object obj, Object... objArr) {
        return log(2, obj, objArr);
    }

    public final int w(Object obj, Object... objArr) {
        return log(5, obj, objArr);
    }

    public final int d(Throwable th, Object obj, Object... objArr) {
        return log(3, th, obj, objArr);
    }

    public final int e(Object obj, Object... objArr) {
        return log(6, obj, objArr);
    }

    public final int i(Object obj, Object... objArr) {
        return log(4, obj, objArr);
    }

    public final int v(Throwable th, Object obj, Object... objArr) {
        return log(2, th, obj, objArr);
    }

    public final int w(Throwable th, Object obj, Object... objArr) {
        return log(5, th, obj, objArr);
    }

    public final int e(String str) {
        return log(6, str, new Object[0]);
    }

    public final int i(String str) {
        return log(4, str, new Object[0]);
    }

    public final int w(String str) {
        return log(5, str, new Object[0]);
    }

    private NLog(String str, int i4) {
        this.f56792e = false;
        this.f56790c = str;
        this.f56791d = i4;
    }

    private int a(int i4, int i5, String str) {
        try {
            String str2 = Process.myPid() + "-" + Process.myTid() + "(" + Thread.currentThread().getName() + ") " + str;
            if (i5 == 1) {
                String str3 = this.f56790c;
                int i6 = this.f56791d;
                HashMap<String, String> hashMap = f56789b;
                if (!hashMap.isEmpty()) {
                    NLog nLog = null;
                    Iterator<Map.Entry<String, String>> it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry<String, String> next = it2.next();
                        if (next.getValue() != null && str.contains(next.getValue())) {
                            nLog = f56788a.get(next.getKey());
                            break;
                        }
                    }
                    if (nLog != null) {
                        str3 = nLog.f56790c;
                        i6 = nLog.f56791d;
                    }
                }
                q.a().a(1, str3, i6, str2);
            }
            q.a().a(i4, str2);
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final int log(int i4, Throwable th, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        sb.append(obj2);
        sb.append('\n');
        sb.append(a(th));
        return a(i4, 0, sb.toString());
    }

    @Deprecated
    public static NLog getInstance(String str) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f56788a;
        synchronized (hashMap) {
            nLog = hashMap.get(str);
            if (nLog == null) {
                nLog = new NLog(str, -1);
                f56789b.put(str, null);
                hashMap.put(str, nLog);
            }
        }
        return nLog;
    }
}
