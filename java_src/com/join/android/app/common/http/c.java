package com.join.android.app.common.http;

import android.content.Context;
import android.content.Intent;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.o0;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.x0;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: HttpDNSUtil.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static Context f14630a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f14631b = "app-resource.wufan88.com";

    /* renamed from: c  reason: collision with root package name */
    public static boolean f14632c;

    public static String a(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("3CXDWhPx".getBytes("utf-8"), "DES");
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(AESUtils.g(str)));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static boolean b(String str, String str2) {
        v0.c("DNS 1 getWufunData 1");
        String c5 = c(str, str2);
        v0.c("DNS 2 ");
        if (g2.i(c5)) {
            try {
                ((DNSDataResult) JsonMapper.getInstance().fromJson(c5, DNSDataResult.class)).updateRpcConstant();
                Context context = f14630a;
                if (context != null) {
                    com.join.mgps.pref.h.n(context).R(c5);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            v0.c("DNS 3 " + c5);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: Exception -> 0x003a, TRY_ENTER, TryCatch #1 {Exception -> 0x003a, blocks: (B:3:0x0003, B:4:0x002b, B:13:0x0043, B:16:0x004d, B:18:0x00a6, B:20:0x00d1, B:21:0x00da, B:23:0x00e1, B:24:0x00e5, B:17:0x007a, B:12:0x003f), top: B:30:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:3:0x0003, B:4:0x002b, B:13:0x0043, B:16:0x004d, B:18:0x00a6, B:20:0x00d1, B:21:0x00da, B:23:0x00e1, B:24:0x00e5, B:17:0x007a, B:12:0x003f), top: B:30:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1 A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:3:0x0003, B:4:0x002b, B:13:0x0043, B:16:0x004d, B:18:0x00a6, B:20:0x00d1, B:21:0x00da, B:23:0x00e1, B:24:0x00e5, B:17:0x007a, B:12:0x003f), top: B:30:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r10 = ""
            r0 = 0
            android.content.Context r1 = com.join.android.app.common.http.c.f14630a     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.Context r2 = com.join.android.app.common.http.c.f14630a     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            int r2 = r1.versionCode     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            r3.<init>()     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            r3.append(r2)     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r2 = "_"
            r3.append(r2)     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            r3.append(r1)     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L3a android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.Context r2 = com.join.android.app.common.http.c.f14630a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38 java.lang.Exception -> L3a
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38 java.lang.Exception -> L3a
            java.lang.String r3 = "android_id"
            java.lang.String r2 = android.provider.Settings.System.getString(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38 java.lang.Exception -> L3a
            goto L43
        L38:
            r2 = move-exception
            goto L3f
        L3a:
            r11 = move-exception
            goto Lff
        L3d:
            r2 = move-exception
            r1 = r10
        L3f:
            r2.printStackTrace()     // Catch: java.lang.Exception -> L3a
            r2 = r10
        L43:
            boolean r3 = com.join.android.app.common.http.c.f14632c     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = "&anid="
            java.lang.String r5 = "&version="
            java.lang.String r6 = "http://"
            if (r3 == 0) goto L7a
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L3a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r7.<init>()     // Catch: java.lang.Exception -> L3a
            r7.append(r6)     // Catch: java.lang.Exception -> L3a
            r7.append(r11)     // Catch: java.lang.Exception -> L3a
            java.lang.String r11 = "/wf26_test_encode.json?t="
            r7.append(r11)     // Catch: java.lang.Exception -> L3a
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3a
            r7.append(r8)     // Catch: java.lang.Exception -> L3a
            r7.append(r5)     // Catch: java.lang.Exception -> L3a
            r7.append(r1)     // Catch: java.lang.Exception -> L3a
            r7.append(r4)     // Catch: java.lang.Exception -> L3a
            r7.append(r2)     // Catch: java.lang.Exception -> L3a
            java.lang.String r11 = r7.toString()     // Catch: java.lang.Exception -> L3a
            r3.<init>(r11)     // Catch: java.lang.Exception -> L3a
            goto La6
        L7a:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L3a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r7.<init>()     // Catch: java.lang.Exception -> L3a
            r7.append(r6)     // Catch: java.lang.Exception -> L3a
            r7.append(r11)     // Catch: java.lang.Exception -> L3a
            java.lang.String r11 = "/wf26_encode.json?t="
            r7.append(r11)     // Catch: java.lang.Exception -> L3a
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3a
            r7.append(r8)     // Catch: java.lang.Exception -> L3a
            r7.append(r5)     // Catch: java.lang.Exception -> L3a
            r7.append(r1)     // Catch: java.lang.Exception -> L3a
            r7.append(r4)     // Catch: java.lang.Exception -> L3a
            r7.append(r2)     // Catch: java.lang.Exception -> L3a
            java.lang.String r11 = r7.toString()     // Catch: java.lang.Exception -> L3a
            r3.<init>(r11)     // Catch: java.lang.Exception -> L3a
        La6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r11.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "yuming "
            r11.append(r1)     // Catch: java.lang.Exception -> L3a
            r11.append(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L3a
            com.join.mgps.Util.v0.c(r11)     // Catch: java.lang.Exception -> L3a
            java.net.URLConnection r11 = r3.openConnection()     // Catch: java.lang.Exception -> L3a
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "GET"
            r11.setRequestMethod(r1)     // Catch: java.lang.Exception -> L3a
            r11.connect()     // Catch: java.lang.Exception -> L3a
            int r1 = r11.getResponseCode()     // Catch: java.lang.Exception -> L3a
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L102
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Exception -> L3a
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.lang.Exception -> L3a
        Lda:
            int r2 = r11.read()     // Catch: java.lang.Exception -> L3a
            r3 = -1
            if (r2 == r3) goto Le5
            r1.write(r2)     // Catch: java.lang.Exception -> L3a
            goto Lda
        Le5:
            r1.flush()     // Catch: java.lang.Exception -> L3a
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L3a
            int r4 = r2.length     // Catch: java.lang.Exception -> L3a
            r3.<init>(r2, r0, r4)     // Catch: java.lang.Exception -> L3a
            r11.close()     // Catch: java.lang.Exception -> L3a
            r1.close()     // Catch: java.lang.Exception -> L3a
            java.lang.String r11 = "9d34201f969e5062"
            java.lang.String r10 = com.join.mgps.Util.a.c(r3, r11)     // Catch: java.lang.Exception -> L3a
            return r10
        Lff:
            r11.printStackTrace()
        L102:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.http.c.c(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void d(Context context) {
        String[] split;
        f14630a = context;
        try {
            if (f14632c) {
                Intent intent = new Intent("com.join.intent.showtoast");
                intent.putExtra("message", "这个是测试版本");
                context.sendBroadcast(intent);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        String f5 = f(f14631b);
        if (g2.i(f5)) {
            String a5 = a(f5);
            if (!g2.i(a5) || (split = a5.split(",")) == null || split.length <= 0) {
                return;
            }
            b(f14631b, split[0]);
        }
    }

    public static String e(String str) {
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + 300;
        return o0.a("http://203.107.1.33/108593/sign_d?host=" + str + "&t=" + currentTimeMillis + "&s=" + g(str, currentTimeMillis), false);
    }

    public static String f(String str) {
        return o0.a("http://119.29.29.98/d?dn=" + h(str) + "&id=7794&ttl=1", false);
    }

    public static String g(String str, long j4) {
        return x0.d(str + "-880c86a5ef4e520a88c0cca16af9e8ff-" + j4);
    }

    public static String h(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("3CXDWhPx".getBytes("utf-8"), "DES");
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return AESUtils.a(cipher.doFinal(str.getBytes("utf-8")));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }
}
