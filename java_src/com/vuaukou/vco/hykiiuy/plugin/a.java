package com.vuaukou.vco.hykiiuy.plugin;

import android.content.Context;
import android.os.Process;
import java.lang.reflect.Method;
/* loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0071: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x0071 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(int r7) {
        /*
            java.lang.String r0 = ""
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.String r6 = "YRUGCgJc"
            java.lang.String r6 = a.auu.a.c(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.String r6 = "YQYZAQ0aCys="
            java.lang.String r6 = a.auu.a.c(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.String r5 = "JxYbSFlLUHdIRQ=="
            java.lang.String r5 = a.auu.a.c(r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
        L3a:
            int r3 = r2.read()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            if (r3 <= 0) goto L4f
            char r3 = (char) r3     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            r1.append(r3)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            goto L3a
        L45:
            r1 = move-exception
        L46:
            r1.toString()     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L5f
        L4e:
            return r0
        L4f:
            r1.trimToSize()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L4e
        L5a:
            r1 = move-exception
            r1.toString()
            goto L4e
        L5f:
            r1 = move-exception
            r1.toString()
            goto L4e
        L64:
            r0 = move-exception
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6b
        L6a:
            throw r0
        L6b:
            r1 = move-exception
            r1.toString()
            goto L6a
        L70:
            r0 = move-exception
            r3 = r2
            goto L65
        L73:
            r1 = move-exception
            r2 = r3
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vuaukou.vco.hykiiuy.plugin.a.a(int):java.lang.String");
    }

    private static void a(Context context, String str) {
        if (context != null) {
            try {
                String c5 = a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaEBIWF2A3ESkIHQ4rFw==");
                String c6 = a.auu.a.c("IgoVAS0aBzwEBhw=");
                Class<?> cls = Class.forName(c5);
                cls.getMethod(c6, Context.class, String.class).invoke(cls, context, str);
                return;
            } catch (Exception e5) {
            }
        }
        System.loadLibrary(str);
    }

    private static void a(Context context, String str, boolean z4) {
        Method method;
        try {
            Class<?> cls = Class.forName(a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaEBIWF2AwBwATIBE8BAAABgo="));
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            cls.getMethod(a.auu.a.c("PQAAMBIWFxoEEw=="), String.class).invoke(newInstance, str);
            if (z4 && (method = cls.getMethod(a.auu.a.c("PQAAIwgfESsXIwoTFxY="), String[].class)) != null) {
                method.invoke(newInstance, new String[]{a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxw="), a.auu.a.c("IgwWExQcECM="), a.auu.a.c("IgwWCwQUEC8XEEsSHA=="), a.auu.a.c("IgwWAQQLAycdWhYO"), a.auu.a.c("JgwaEVs=")});
            }
            Class<?> cls2 = Class.forName(a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaJhMSFiYtFQsFHwA8"));
            cls2.getMethod(a.auu.a.c("JwsdEQ=="), Context.class, newInstance.getClass()).invoke(cls2, context, newInstance);
        } catch (Exception e5) {
            e5.toString();
        }
    }

    private static void a(String str) {
        try {
            String c5 = a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaJhMSFiYtFQsFHwA8");
            String c6 = a.auu.a.c("IgAVEwQxFysEEAYTBggs");
            Class<?> cls = Class.forName(c5);
            cls.getMethod(c6, String.class).invoke(cls, str);
        } catch (Exception e5) {
            e5.toString();
        }
    }

    private static void a(Throwable th) {
        try {
            String c5 = a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaJhMSFiYtFQsFHwA8");
            String c6 = a.auu.a.c("OxUYCgAXJi8RFw0EFyA2BhEVFRoKIA==");
            Class<?> cls = Class.forName(c5);
            cls.getMethod(c6, Throwable.class).invoke(cls, th);
        } catch (Exception e5) {
            e5.toString();
        }
    }

    private static boolean a(Context context) {
        String a5 = a(Process.myPid());
        if (context != null) {
            return context.getPackageName().equals(a5);
        }
        return false;
    }
}
