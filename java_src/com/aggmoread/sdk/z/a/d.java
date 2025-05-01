package com.aggmoread.sdk.z.a;

import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static int f1990a = 255;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1991b;

    /* renamed from: c  reason: collision with root package name */
    static final String f1992c = System.getProperty("line.separator");

    /* renamed from: d  reason: collision with root package name */
    private static FileWriter f1993d;

    /* renamed from: e  reason: collision with root package name */
    private static StringBuffer f1994e;

    /* renamed from: f  reason: collision with root package name */
    private static SimpleDateFormat f1995f;

    static int a(int i4) {
        return (i4 ^ (-1)) & 255;
    }

    private static String a() {
        if (f1995f == null) {
            f1995f = new SimpleDateFormat(" yyyy-MM-dd hh:mm:ss SSS ");
        }
        return f1995f.format(new Date(System.currentTimeMillis()));
    }

    private static synchronized void a(String str) {
        synchronized (d.class) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    f1994e = new StringBuffer();
                    f1994e.append(" TIME:" + a());
                    StringBuffer stringBuffer = f1994e;
                    stringBuffer.append(str + "\n");
                    String stringBuffer2 = f1994e.toString();
                    if (f1993d == null) {
                        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator);
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        File file2 = new File(file, "sdk.log");
                        StringBuilder sb = new StringBuilder();
                        sb.append("file path = ");
                        sb.append(file2.getAbsolutePath());
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        if (file2.length() > 52428800) {
                            file2.delete();
                            file2 = new File(file, "sdk.log");
                        }
                        f1993d = new FileWriter(file2, true);
                    }
                    f1993d.write(stringBuffer2);
                    f1993d.flush();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void a(String str, String str2) {
        if (b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(" [AdSdk] ");
            sb.append(str2);
            if (f1991b) {
                a(str2);
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(" [AdSdk] ");
            sb.append(str2);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        if (b()) {
            if (objArr != null && objArr.length > 0) {
                try {
                    str2 = String.format(str2, objArr);
                } catch (Exception unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(" [AdSdk] ");
            sb.append(str2);
            if (f1991b) {
                a(str2);
            }
        }
    }

    public static void a(String str, Throwable th) {
        a(str, "", th);
    }

    static void a(String str, boolean z4) {
        c(str, "***********************************************");
    }

    public static void a(boolean z4) {
        f1990a = z4 ? a(51) : 255;
    }

    private static int b(int i4) {
        return 1 << ((i4 ^ (-1)) & 15);
    }

    public static void b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(" [AdSdk] ");
        sb.append(str2);
    }

    static boolean b() {
        return f1990a != 255 && (b(13) ^ e(f1990a)) == c(b(13) + d(8));
    }

    private static int c(int i4) {
        return 136 >> ((i4 ^ (-1)) & 15);
    }

    public static void c(String str, String str2) {
        if (b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(" [AdSdk] ");
            sb.append(str2);
            if (f1991b) {
                a(str2);
            }
        }
    }

    private static int d(int i4) {
        return (i4 ^ (-1)) & 15;
    }

    public static void d(String str, String str2) {
        String[] split;
        if (b()) {
            try {
                if (str.startsWith("{")) {
                    str = new JSONObject(str).toString(4);
                } else if (str.startsWith("[")) {
                    str = new JSONArray(str).toString(4);
                }
            } catch (JSONException unused) {
            }
            a("AdSdk", true);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String str3 = f1992c;
            sb.append(str3);
            sb.append(str);
            for (String str4 : sb.toString().split(str3)) {
                c("AdSdk", "* " + str4);
            }
            a("AdSdk", false);
        }
    }

    private static int e(int i4) {
        return (i4 >> 4) & 15;
    }

    public static void e(String str, String str2) {
        a(str, str2, (Throwable) null);
    }
}
