package com.yxcorp.kuaishou.addfp.c.a;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.yxcorp.kuaishou.addfp.KWEGIDDFP;
/* loaded from: classes6.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015e, code lost:
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0160, code lost:
        r11 = r0;
        r10 = r1;
        r1 = r12;
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0139, code lost:
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017f A[Catch: IOException -> 0x017b, TryCatch #20 {IOException -> 0x017b, blocks: (B:112:0x0177, B:116:0x017f, B:118:0x0184), top: B:135:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0184 A[Catch: IOException -> 0x017b, TRY_LEAVE, TryCatch #20 {IOException -> 0x017b, blocks: (B:112:0x0177, B:116:0x017f, B:118:0x0184), top: B:135:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d A[Catch: IOException -> 0x0129, TryCatch #11 {IOException -> 0x0129, blocks: (B:76:0x0125, B:80:0x012d, B:82:0x0132), top: B:133:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132 A[Catch: IOException -> 0x0129, TRY_LEAVE, TryCatch #11 {IOException -> 0x0129, blocks: (B:76:0x0125, B:80:0x012d, B:82:0x0132), top: B:133:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152 A[Catch: IOException -> 0x014e, TryCatch #9 {IOException -> 0x014e, blocks: (B:93:0x014a, B:97:0x0152, B:99:0x0157), top: B:130:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0157 A[Catch: IOException -> 0x014e, TRY_LEAVE, TryCatch #9 {IOException -> 0x014e, blocks: (B:93:0x014a, B:97:0x0152, B:99:0x0157), top: B:130:0x014a }] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yxcorp.kuaishou.addfp.android.b.e a(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.c.a.a.a(java.lang.String, boolean):com.yxcorp.kuaishou.addfp.android.b.e");
    }

    public static String a(int i4, String str) {
        String a5;
        Context paramContext = KWEGIDDFP.instance().getParamContext();
        if (paramContext == null) {
            return "";
        }
        String[] split = new String(Base64.decode("U3lzdGVtQFNlY3VyZUBHbG9iYWw=", 0)).split("@");
        String str2 = split[0];
        String str3 = split[1];
        String str4 = split[2];
        if (i4 == 0) {
            a5 = com.yxcorp.kuaishou.addfp.android.b.a.a(paramContext, split[0], str);
            if (TextUtils.isEmpty(a5)) {
                a5 = Settings.System.getString(paramContext.getContentResolver(), str);
            }
        } else if (i4 == 1) {
            a5 = com.yxcorp.kuaishou.addfp.android.b.a.a(paramContext, split[1], str);
            if (TextUtils.isEmpty(a5)) {
                a5 = Settings.Secure.getString(paramContext.getContentResolver(), str);
            }
        } else if (i4 == 2) {
            a5 = com.yxcorp.kuaishou.addfp.android.b.a.a(paramContext, split[2], str);
            if (TextUtils.isEmpty(a5)) {
                a5 = Settings.Global.getString(paramContext.getContentResolver(), str);
            }
        } else {
            a5 = "";
        }
        return a5 == null ? "" : a5;
    }

    public static String a(Context context, String str) {
        try {
            return Settings.System.getString(context.getContentResolver(), str);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String a(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.c.a.a.a():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:41:0x00b7, B:43:0x00bf), top: B:59:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #1 {all -> 0x00dc, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0020, B:10:0x002a, B:23:0x0069, B:25:0x006f, B:28:0x0076, B:30:0x0080, B:34:0x0090, B:36:0x0096, B:37:0x00ad, B:45:0x00cf, B:47:0x00d5, B:32:0x0086, B:15:0x0043, B:17:0x004d, B:19:0x0057, B:21:0x0065), top: B:57:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r8) {
        /*
            java.lang.String r0 = "k_w_o_d_out_dtt"
            java.lang.String r1 = "KWE_N"
            java.lang.String r2 = a(r8, r0)     // Catch: java.lang.Throwable -> Ldc
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r4 = "Lm91a2R0ZnQ="
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r6 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r7 = ""
            if (r3 == 0) goto L43
            com.yxcorp.kuaishou.addfp.android.a.d r3 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldc
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> Ldc
            if (r3 != 0) goto L68
            java.lang.String[] r3 = new java.lang.String[]{r6, r5}     // Catch: java.lang.Throwable -> Ldc
            boolean r3 = com.yxcorp.kuaishou.addfp.android.b.g.a(r8, r3)     // Catch: java.lang.Throwable -> Ldc
            if (r3 == 0) goto L40
            com.yxcorp.kuaishou.addfp.android.a.d r3 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r7 = r3.a(r4)     // Catch: java.lang.Throwable -> Ldc
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ldc
            if (r3 != 0) goto L68
            android.content.ContentResolver r3 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L68
            android.provider.Settings.System.putString(r3, r0, r7)     // Catch: java.lang.Throwable -> L68
            goto L68
        L40:
            java.lang.String r0 = "KWE_PN"
            goto L69
        L43:
            com.yxcorp.kuaishou.addfp.android.a.d r0 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldc
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> Ldc
            if (r0 != 0) goto L68
            java.lang.String[] r0 = new java.lang.String[]{r6, r5}     // Catch: java.lang.Throwable -> Ldc
            boolean r0 = com.yxcorp.kuaishou.addfp.android.b.g.a(r8, r0)     // Catch: java.lang.Throwable -> Ldc
            if (r0 == 0) goto L68
            com.yxcorp.kuaishou.addfp.android.a.d r0 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r7 = r0.a(r4)     // Catch: java.lang.Throwable -> Ldc
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ldc
            if (r0 == 0) goto L68
            com.yxcorp.kuaishou.addfp.android.a.d.a(r8, r2)     // Catch: java.lang.Throwable -> Ldc
        L68:
            r0 = r1
        L69:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ldc
            if (r3 == 0) goto L76
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ldc
            if (r3 == 0) goto L76
            goto Le2
        L76:
            com.yxcorp.kuaishou.addfp.android.a.d r1 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldc
            java.util.LinkedHashMap r1 = r1.b(r2)     // Catch: java.lang.Throwable -> Ldc
            if (r1 == 0) goto L86
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Ldc
            if (r2 != 0) goto L8e
        L86:
            com.yxcorp.kuaishou.addfp.android.a.d r8 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Ldc
            java.util.LinkedHashMap r1 = r8.b(r7)     // Catch: java.lang.Throwable -> Ldc
        L8e:
            if (r1 == 0) goto Lda
            int r8 = r1.size()     // Catch: java.lang.Throwable -> Ldc
            if (r8 <= 0) goto Lda
            r8 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldc
            java.util.Set r3 = r1.entrySet()     // Catch: java.lang.Throwable -> Ldc
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ldc
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ldc
            java.util.ListIterator r1 = r2.listIterator(r1)     // Catch: java.lang.Throwable -> Ldc
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldc
            r2.<init>()     // Catch: java.lang.Throwable -> Ldc
        Lad:
            boolean r3 = r1.hasPrevious()     // Catch: java.lang.Throwable -> Ldc
            if (r3 == 0) goto Lcf
            r3 = 10
            if (r8 >= r3) goto Lcf
            java.lang.Object r3 = r1.previous()     // Catch: java.lang.Throwable -> Lad
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto Lcc
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lad
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Lad
        Lcc:
            int r8 = r8 + 1
            goto Lad
        Lcf:
            int r8 = r2.length()     // Catch: java.lang.Throwable -> Ldc
            if (r8 <= 0) goto Lda
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> Ldc
            return r8
        Lda:
            r1 = r0
            goto Le2
        Ldc:
            r8 = move-exception
            r8.printStackTrace()
            java.lang.String r1 = "KWE_PE"
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.c.a.a.a(android.content.Context):java.lang.String");
    }
}
