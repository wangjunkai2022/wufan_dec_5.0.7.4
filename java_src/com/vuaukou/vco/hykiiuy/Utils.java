package com.vuaukou.vco.hykiiuy;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/* loaded from: classes8.dex */
public class Utils {
    private static String a(Class cls, String str, String str2) {
        int i4 = 0;
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            Field.setAccessible(declaredFields, true);
            while (true) {
                int i5 = i4;
                if (i5 >= declaredFields.length) {
                    return "";
                }
                Field field = declaredFields[i5];
                if (field != null && field.getName().equals(str) && Modifier.isStatic(field.getModifiers())) {
                    String replace = field.getType().toString().replace(a.auu.a.c("LQkVFhJT"), "").replace(a.auu.a.c("JwsAABMVBC0AVA=="), "");
                    if (str2.equals(replace.startsWith(a.auu.a.c("FQ==")) ? replace.replace(external.org.apache.commons.lang3.d.f68897a, '/') : replace.equals(a.auu.a.c("JwsA")) ? a.auu.a.c("Bw==") : replace.equals(a.auu.a.c("KAkbBBU=")) ? a.auu.a.c("CA==") : replace.equals(a.auu.a.c("IgoaAg==")) ? a.auu.a.c("BA==") : replace.equals(a.auu.a.c("KgoBBw0W")) ? a.auu.a.c("Cg==") : replace.equals(a.auu.a.c("PQ0bFxU=")) ? a.auu.a.c("HQ==") : replace.equals(a.auu.a.c("LQ0VFw==")) ? a.auu.a.c("DQ==") : replace.equals(a.auu.a.c("LAobCQQSCw==")) ? a.auu.a.c("FA==") : replace.equals(a.auu.a.c("LBwAAA==")) ? a.auu.a.c("DA==") : (a.auu.a.c("Ag==") + replace + a.auu.a.c("dQ==")).replace(external.org.apache.commons.lang3.d.f68897a, '/'))) {
                        String.format(a.auu.a.c("KAwRCQVTCy8IEV9EAEU6HAQAW1YW"), field.getName(), replace);
                        return field.getDeclaringClass().getName().replace(external.org.apache.commons.lang3.d.f68897a, '/');
                    }
                }
                i4 = i5 + 1;
            }
        } catch (NoClassDefFoundError e5) {
            return a.auu.a.c("AAo3CQAAFgoAEiMOBgsqIAYXDgE=");
        }
    }

    private static String a(String str) {
        return str.startsWith(a.auu.a.c("FQ==")) ? str.replace(external.org.apache.commons.lang3.d.f68897a, '/') : str.equals(a.auu.a.c("JwsA")) ? a.auu.a.c("Bw==") : str.equals(a.auu.a.c("KAkbBBU=")) ? a.auu.a.c("CA==") : str.equals(a.auu.a.c("IgoaAg==")) ? a.auu.a.c("BA==") : str.equals(a.auu.a.c("KgoBBw0W")) ? a.auu.a.c("Cg==") : str.equals(a.auu.a.c("PQ0bFxU=")) ? a.auu.a.c("HQ==") : str.equals(a.auu.a.c("LQ0VFw==")) ? a.auu.a.c("DQ==") : str.equals(a.auu.a.c("LAobCQQSCw==")) ? a.auu.a.c("FA==") : str.equals(a.auu.a.c("LBwAAA==")) ? a.auu.a.c("DA==") : (a.auu.a.c("Ag==") + str + a.auu.a.c("dQ==")).replace(external.org.apache.commons.lang3.d.f68897a, '/');
    }

    public static String getFieldSCDesc(Class cls, String str, String str2) {
        String.format(a.auu.a.c("KQAAIwgWCSo2NyEEAAZuFxEUFBoXK0UaBAwWX2sWVBEYAwB0QAc="), str, str2);
        while (cls != null) {
            String a5 = a(cls, str, str2);
            if (a5 != null && a5.length() > 0) {
                String.format(a.auu.a.c("KQAAIwgWCSo2NyEEAAZuCxUIBElAPQ=="), a5);
                return a5;
            }
            cls = cls.getSuperclass();
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        new java.lang.StringBuilder(a.auu.a.c("KQAARQwWESYKEF8=")).append(r9).append(a.auu.a.c("bgwaRQ==")).append(r12);
        r0.setAccessible(true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method getMethod(java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            r3 = 0
            r1 = 0
            java.lang.String r0 = "Yw=="
            java.lang.String r0 = a.auu.a.c(r0)     // Catch: java.lang.Exception -> L66
            java.lang.String[] r5 = r13.split(r0)     // Catch: java.lang.Exception -> L66
            java.lang.Class<com.vuaukou.vco.hykiiuy.Utils> r0 = com.vuaukou.vco.hykiiuy.Utils.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L66
            java.lang.Class r0 = r0.loadClass(r12)     // Catch: java.lang.Exception -> L66
            java.lang.reflect.Method[] r6 = r0.getDeclaredMethods()     // Catch: java.lang.Exception -> L66
            int r7 = r6.length     // Catch: java.lang.Exception -> L66
            r4 = r3
        L1c:
            if (r4 >= r7) goto L6a
            r0 = r6[r4]     // Catch: java.lang.Exception -> L66
            int r8 = r5.length     // Catch: java.lang.Exception -> L66
            r2 = r3
        L22:
            if (r2 >= r8) goto L70
            r9 = r5[r2]     // Catch: java.lang.Exception -> L66
            if (r14 == 0) goto L32
            java.lang.String r10 = r0.getName()     // Catch: java.lang.Exception -> L66
            boolean r10 = r10.equals(r9)     // Catch: java.lang.Exception -> L66
            if (r10 != 0) goto L3e
        L32:
            if (r14 != 0) goto L63
            java.lang.String r10 = r0.getName()     // Catch: java.lang.Exception -> L66
            boolean r10 = r10.contains(r9)     // Catch: java.lang.Exception -> L66
            if (r10 == 0) goto L63
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = "KQAARQwWESYKEF8="
            java.lang.String r2 = a.auu.a.c(r2)     // Catch: java.lang.Exception -> L6b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L6b
            java.lang.StringBuilder r1 = r1.append(r9)     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = "bgwaRQ=="
            java.lang.String r2 = a.auu.a.c(r2)     // Catch: java.lang.Exception -> L6b
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L6b
            r1.append(r12)     // Catch: java.lang.Exception -> L6b
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L6b
        L5e:
            int r1 = r4 + 1
            r4 = r1
            r1 = r0
            goto L1c
        L63:
            int r2 = r2 + 1
            goto L22
        L66:
            r0 = move-exception
        L67:
            r0.toString()
        L6a:
            return r1
        L6b:
            r1 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L67
        L70:
            r0 = r1
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vuaukou.vco.hykiiuy.Utils.getMethod(java.lang.String, java.lang.String, boolean):java.lang.reflect.Method");
    }

    public static Object getStaticFO(String str, String str2) {
        Object obj = null;
        try {
            Field field = Class.forName(str.replace('/', external.org.apache.commons.lang3.d.f68897a)).getField(str2);
            Class<?> type = field.getType();
            obj = type == Integer.TYPE ? Integer.valueOf(field.getInt(null)) : type == Float.TYPE ? Float.valueOf(field.getFloat(null)) : type == Long.TYPE ? Long.valueOf(field.getLong(null)) : type == Double.TYPE ? Double.valueOf(field.getDouble(null)) : type == Short.TYPE ? Short.valueOf(field.getShort(null)) : type == Character.TYPE ? Character.valueOf(field.getChar(null)) : type == Boolean.TYPE ? Boolean.valueOf(field.getBoolean(null)) : type == Byte.TYPE ? Byte.valueOf(field.getByte(null)) : field.get(null);
        } catch (Exception e5) {
            e5.toString();
        }
        return obj;
    }
}
