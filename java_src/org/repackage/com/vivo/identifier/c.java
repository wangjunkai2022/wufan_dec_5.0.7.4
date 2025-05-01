package org.repackage.com.vivo.identifier;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: IdentifierIdClient.java */
/* loaded from: classes7.dex */
public class c {
    private static boolean A = false;
    private static int B = 13;
    private static d C = null;
    private static d D = null;
    private static d E = null;
    private static d F = null;
    private static HandlerThread G = null;
    private static Handler H = null;
    private static String I = null;
    private static String J = null;
    private static String K = null;
    private static String L = null;
    private static String M = null;
    private static String N = null;
    private static String O = null;
    private static volatile c P = null;
    private static volatile org.repackage.com.vivo.identifier.b Q = null;
    private static int R = 0;
    private static int S = 0;
    private static int T = 0;
    private static int U = 0;
    private static int V = 0;
    private static int W = 0;
    private static int X = 0;
    private static int Y = 0;
    private static int Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    private static int f73034a0 = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final String f73035b = "VMS_SDK_Client";

    /* renamed from: b0  reason: collision with root package name */
    private static int f73036b0 = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final String f73037c = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: c0  reason: collision with root package name */
    private static int f73038c0 = 0;

    /* renamed from: d  reason: collision with root package name */
    private static final String f73039d = "persist.sys.identifierid.supported";

    /* renamed from: e  reason: collision with root package name */
    public static final String f73040e = "persist.sys.identifierid";

    /* renamed from: f  reason: collision with root package name */
    private static final String f73041f = "com.vivo.vms";

    /* renamed from: g  reason: collision with root package name */
    private static final String f73042g = "appid";

    /* renamed from: h  reason: collision with root package name */
    private static final String f73043h = "type";

    /* renamed from: i  reason: collision with root package name */
    private static final String f73044i = "OAID";

    /* renamed from: j  reason: collision with root package name */
    private static final String f73045j = "VAID";

    /* renamed from: k  reason: collision with root package name */
    private static final String f73046k = "OAIDSTATUS";

    /* renamed from: l  reason: collision with root package name */
    private static Object f73047l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static final int f73048m = 0;

    /* renamed from: n  reason: collision with root package name */
    private static final int f73049n = 1;

    /* renamed from: o  reason: collision with root package name */
    private static final int f73050o = 2;

    /* renamed from: p  reason: collision with root package name */
    private static final int f73051p = 3;

    /* renamed from: q  reason: collision with root package name */
    private static final int f73052q = 4;

    /* renamed from: r  reason: collision with root package name */
    private static final int f73053r = 5;

    /* renamed from: s  reason: collision with root package name */
    private static final int f73054s = 6;

    /* renamed from: t  reason: collision with root package name */
    private static final int f73055t = 7;

    /* renamed from: u  reason: collision with root package name */
    private static final int f73056u = 8;

    /* renamed from: v  reason: collision with root package name */
    private static final int f73057v = 9;

    /* renamed from: w  reason: collision with root package name */
    private static final int f73058w = 10;

    /* renamed from: x  reason: collision with root package name */
    private static final int f73059x = 11;

    /* renamed from: y  reason: collision with root package name */
    private static final int f73060y = 2000;

    /* renamed from: z  reason: collision with root package name */
    private static Context f73061z;

    /* renamed from: a  reason: collision with root package name */
    private final int f73062a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IdentifierIdClient.java */
    /* loaded from: classes7.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.R + c.S + c.X + c.f73034a0 + c.T + c.U + c.Z + c.f73034a0 + c.V + c.W + c.f73036b0 + c.f73038c0 > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("oaid", c.this.g(c.R, c.S, c.X, c.Y));
                contentValues.put("vaid", c.this.g(c.T, c.U, c.Z, c.f73034a0));
                contentValues.put("aaid", c.this.g(c.V, c.W, c.f73036b0, c.f73038c0));
                c.Q.c(7, "vivo", new ContentValues[]{contentValues});
                int unused = c.R = c.S = c.T = c.U = c.V = c.W = 0;
                int unused2 = c.X = c.Y = c.Z = c.f73034a0 = c.f73036b0 = c.f73038c0 = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IdentifierIdClient.java */
    /* loaded from: classes7.dex */
    public class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 11) {
                int i4 = message.getData().getInt("type");
                try {
                    String a5 = c.Q.a(i4, message.getData().getString("appid"));
                    if (i4 == 0) {
                        String unused = c.I = a5;
                        c.z(8, c.I);
                    } else if (i4 == 1) {
                        if (a5 != null) {
                            String unused2 = c.J = a5;
                        }
                        c.z(9, c.J);
                    } else if (i4 == 2) {
                        if (a5 != null) {
                            String unused3 = c.K = a5;
                        }
                        c.z(10, c.K);
                    } else if (i4 != 3) {
                        if (i4 == 4) {
                            String unused4 = c.M = a5;
                        } else if (i4 == 5 && a5 != null) {
                            String unused5 = c.N = a5;
                        }
                    } else if (a5 != null) {
                        String unused6 = c.L = a5;
                    }
                } catch (Exception e5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("readException:");
                    sb.append(e5.toString());
                }
                synchronized (c.f73047l) {
                    c.f73047l.notify();
                }
            }
        }
    }

    private c() {
        d();
        Q = new org.repackage.com.vivo.identifier.b(f73061z);
        this.f73062a = w(f73061z);
    }

    private void D(int i4, String str) {
        l(i4, str);
    }

    private void H(int i4, String str) {
        synchronized (f73047l) {
            l(i4, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f73047l.wait(2000L);
            } catch (InterruptedException unused) {
            }
            int i5 = ((SystemClock.uptimeMillis() - uptimeMillis) > 2000L ? 1 : ((SystemClock.uptimeMillis() - uptimeMillis) == 2000L ? 0 : -1));
        }
    }

    private void c() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new a(), 600L, 600L, TimeUnit.SECONDS);
    }

    private static void d() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        G = handlerThread;
        handlerThread.start();
        H = new b(G.getLooper());
    }

    private static void e() {
        A = "1".equals(i(f73039d, "0")) || "1".equals(i(f73040e, "0"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String g(int i4, int i5, int i6, int i7) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i4);
        stringBuffer.append(",");
        stringBuffer.append(i5);
        stringBuffer.append(";");
        stringBuffer.append(i6);
        stringBuffer.append(",");
        stringBuffer.append(i7);
        return stringBuffer.toString();
    }

    private static String i(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "0");
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("getProperty: invoke is error");
                sb.append(e5.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c k(Context context) {
        if (f73061z == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f73061z = context;
        }
        if (P == null) {
            synchronized (c.class) {
                if (P == null) {
                    P = new c();
                    P.c();
                }
            }
        }
        return P;
    }

    private static synchronized void m(Context context, int i4, String str) {
        synchronized (c.class) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (E == null) {
                            E = new d(P, 2, str);
                            ContentResolver contentResolver = context.getContentResolver();
                            contentResolver.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/" + context.getPackageName()), false, E);
                        }
                    }
                } else if (D == null) {
                    D = new d(P, 1, str);
                    ContentResolver contentResolver2 = context.getContentResolver();
                    contentResolver2.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, D);
                }
            } else if (C == null) {
                C = new d(P, 0, null);
                context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, C);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n() {
        if (!A) {
            e();
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c t(Context context) {
        if (n()) {
            return k(context);
        }
        return null;
    }

    private static int w(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f73041f, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(int i4, String str) {
        if (i4 == 0) {
            if (str == null) {
                S++;
            } else {
                R++;
            }
        } else if (i4 == 1) {
            if (str == null) {
                U++;
            } else {
                T++;
            }
        } else if (i4 == 2) {
            if (str == null) {
                W++;
            } else {
                V++;
            }
        } else {
            switch (i4) {
                case 8:
                    if (str == null) {
                        Y++;
                        return;
                    } else {
                        X++;
                        return;
                    }
                case 9:
                    if (str == null) {
                        f73034a0++;
                        return;
                    } else {
                        Z++;
                        return;
                    }
                case 10:
                    if (str == null) {
                        f73038c0++;
                        return;
                    } else {
                        f73036b0++;
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String B() {
        String str = I;
        if (str != null) {
            z(0, str);
            return I;
        }
        D(0, null);
        if (C == null) {
            m(f73061z, 0, null);
        }
        z(0, I);
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String F() {
        String str = J;
        if (str != null) {
            z(1, str);
            return J;
        }
        H(1, "vivo");
        if (D == null) {
            m(f73061z, 1, "vivo");
        }
        z(1, J);
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String J() {
        String str = J;
        if (str != null) {
            z(1, str);
            return J;
        }
        D(1, "vivo");
        if (D == null) {
            m(f73061z, 1, "vivo");
        }
        z(1, J);
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String M() {
        String str = K;
        if (str != null) {
            z(2, str);
            return K;
        }
        H(2, "vivo");
        if (E == null) {
            m(f73061z, 2, "vivo");
        }
        z(2, K);
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String O() {
        String str = K;
        if (str != null) {
            z(2, str);
            return K;
        }
        D(2, "vivo");
        if (E == null) {
            m(f73061z, 2, "vivo");
        }
        z(2, K);
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String Q() {
        H(4, null);
        return M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String S() {
        String str = N;
        if (str != null) {
            return str;
        }
        H(5, "vivo");
        return N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String U() {
        String str = N;
        if (str != null) {
            return str;
        }
        D(5, "vivo");
        return N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i4, String str) {
        Message obtainMessage = H.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        if (i4 == 1 || i4 == 2 || i4 == 6) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        H.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(List<String> list) {
        if (this.f73062a >= B && list != null && list.size() != 0) {
            try {
                ContentValues[] contentValuesArr = new ContentValues[list.size()];
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ContentValues contentValues = new ContentValues();
                    String[] split = list.get(i4).split(":");
                    if (split.length != 2) {
                        return false;
                    }
                    String str = split[0];
                    String str2 = split[1];
                    contentValues.put("packageName", str);
                    contentValues.put("uid", str2);
                    contentValues.put("value", format);
                    contentValuesArr[i4] = contentValues;
                }
                return Q.c(6, "vivo", contentValuesArr);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String q() {
        String str = L;
        if (str != null) {
            return str;
        }
        H(3, null);
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List s(List<String> list) {
        if (this.f73062a >= B && list != null && list.size() != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    String[] split = list.get(i4).split(":");
                    if (split.length == 2) {
                        arrayList.add(Boolean.valueOf(Q.b(6, "vivo", split[0], split[1])));
                    }
                }
                return arrayList;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String x() {
        String str = I;
        if (str != null) {
            z(0, str);
            return I;
        }
        H(0, null);
        if (C == null) {
            m(f73061z, 0, null);
        }
        z(0, I);
        return I;
    }
}
