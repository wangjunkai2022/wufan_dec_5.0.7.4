package com.yxcorp.kuaishou.addfp.android.a;

import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f68574d = true;

    /* renamed from: e  reason: collision with root package name */
    private static int f68575e;

    /* renamed from: a  reason: collision with root package name */
    private String f68576a;

    /* renamed from: b  reason: collision with root package name */
    private String f68577b;

    /* renamed from: c  reason: collision with root package name */
    private ReentrantLock f68578c;

    private c() {
        this.f68577b = "";
        this.f68578c = new ReentrantLock();
    }

    private static String a(String str) {
        return TextUtils.isEmpty(str) ? "KWE_N" : str.replace(SimpleComparison.EQUAL_TO_OPERATION, "").replace(m.a.f71490d, "");
    }

    public static void a(JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("64".equals(next) && jSONObject.optInt(next, 1) == 0) {
                    f68574d = false;
                }
                if ("64_level".equals(next)) {
                    f68575e = jSONObject.optInt(next, 0);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r2 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "/sys/class/android_usb/android0/iSerial"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L35
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L31
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L35
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L35
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L2f
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L32
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L2f
            r2.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r1 = move-exception
            r1.printStackTrace()
        L2e:
            return r0
        L2f:
            r1 = move-exception
            goto L37
        L31:
            r2 = r0
        L32:
            if (r2 == 0) goto L44
            goto L3c
        L35:
            r1 = move-exception
            r2 = r0
        L37:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L44
        L3c:
            r2.close()     // Catch: java.lang.Throwable -> L40
            goto L44
        L40:
            r1 = move-exception
            r1.printStackTrace()
        L44:
            return r0
        L45:
            r0 = move-exception
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r1 = move-exception
            r1.printStackTrace()
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.android.a.c.b():java.lang.String");
    }

    public static c c() {
        return b.f68573a;
    }

    public String a() {
        try {
            return !TextUtils.isEmpty(this.f68576a) ? this.f68576a : "KWE_N";
        } catch (Throwable th) {
            th.printStackTrace();
            return "KWE_N";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02aa A[Catch: all -> 0x02f0, TryCatch #11 {all -> 0x032a, blocks: (B:3:0x0013, B:5:0x0020, B:8:0x0028, B:10:0x002f, B:12:0x003e, B:14:0x0053, B:16:0x0060, B:18:0x006e, B:20:0x007c, B:22:0x0085, B:24:0x0092, B:30:0x00b0, B:32:0x00d5, B:34:0x00ed, B:36:0x00fa, B:38:0x0107, B:40:0x0114, B:42:0x0129, B:49:0x014f, B:51:0x015c, B:57:0x017b, B:59:0x0184, B:61:0x0197, B:66:0x01c3, B:71:0x01f4, B:81:0x0207, B:83:0x0214, B:85:0x0225, B:87:0x022e, B:89:0x024c, B:91:0x025a, B:93:0x0268, B:95:0x026e, B:97:0x0276, B:99:0x027c, B:101:0x0284, B:106:0x0290, B:110:0x0299, B:122:0x02f4, B:104:0x028b, B:79:0x0202, B:77:0x01fd, B:44:0x0132, B:26:0x009f, B:111:0x02a0, B:114:0x02aa, B:116:0x02be, B:117:0x02c9, B:118:0x02cc, B:53:0x0165), top: B:155:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(android.content.Context r21, com.yxcorp.kuaishou.addfp.ResponseDfpCallback r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.android.a.c.a(android.content.Context, com.yxcorp.kuaishou.addfp.ResponseDfpCallback, boolean):java.lang.String");
    }

    public void b(String str) {
        this.f68576a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0066 A[Catch: all -> 0x00f1, TryCatch #3 {all -> 0x00f1, blocks: (B:2:0x0000, B:15:0x0018, B:18:0x0023, B:21:0x0029, B:25:0x0033, B:27:0x003b, B:29:0x0047, B:33:0x0056, B:39:0x0066, B:41:0x0074, B:56:0x00af, B:66:0x00d1, B:68:0x00db, B:71:0x00e2, B:73:0x00ea, B:51:0x00a2, B:53:0x00a8, B:7:0x0009, B:45:0x0080, B:47:0x0088), top: B:82:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.android.a.c.a(android.content.Context):java.lang.String");
    }
}
