package com.join.mgps.Util;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.activity.QuarkPromptActivity_;
import com.join.mgps.dto.Constant;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: SignUtil.java */
/* loaded from: classes3.dex */
public class x1 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f28145a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", com.kuaishou.weapon.p0.t.f55693l, "c", com.kuaishou.weapon.p0.t.f55701t, com.kwad.sdk.m.e.TAG, com.xinzhu.overmind.utils.helpers.f.f68332a};

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b5 : bArr) {
            stringBuffer.append(b(b5));
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(byte r3) {
        /*
            if (r3 >= 0) goto L4
            int r3 = r3 + 256
        L4:
            int r0 = r3 / 16
            int r3 = r3 % 16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = com.join.mgps.Util.x1.f28145a
            r0 = r2[r0]
            r1.append(r0)
            r3 = r2[r3]
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.x1.b(byte):java.lang.String");
    }

    public static String c(String str) {
        new ArrayList();
        try {
            return a(MessageDigest.getInstance("MD5").digest(("Se+mLqD-mV@y6^Z+" + str).getBytes()));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : map.keySet()) {
                if (!str.equals("sig") && !str.equals(Constant.MD5)) {
                    arrayList.add(str + SimpleComparison.EQUAL_TO_OPERATION + map.get(str));
                }
            }
            Collections.sort(arrayList);
            return a(MessageDigest.getInstance("MD5").digest(("Se+mLqD-mV@y6^Z+QmUMaPuW8beIUZf4Gzh58yNPjvDNydRs" + arrayList.toString().replace("[", "").replace("]", "").replace(", ", m.a.f71490d)).getBytes()));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private static String e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        try {
            for (String str : map.keySet()) {
                if (!str.equals("sig") && !str.equals(Constant.MD5)) {
                    arrayList.add(str + SimpleComparison.EQUAL_TO_OPERATION + map.get(str));
                    if ("device_id".equals(str)) {
                        z4 = true;
                    }
                }
            }
            if (!z4) {
                arrayList.add("device_id=");
            }
            Collections.sort(arrayList);
            return a(MessageDigest.getInstance("MD5").digest(("Se+mLqD-mV@y6^Z+" + arrayList.toString().replace("[", "").replace("]", "").replace(", ", m.a.f71490d)).getBytes()));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private static String f(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        try {
            for (String str : map.keySet()) {
                if (!str.equals("sig") && !str.equals(Constant.MD5)) {
                    arrayList.add(str + SimpleComparison.EQUAL_TO_OPERATION + map.get(str));
                    if ("device_id".equals(str)) {
                        z4 = true;
                    }
                }
            }
            if (!z4) {
                arrayList.add("device_id=");
            }
            Collections.sort(arrayList);
            return a(MessageDigest.getInstance("MD5").digest(("Se+mLqD-mV@y6^Z+" + arrayList.toString()).getBytes()));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String g(Object obj) {
        return e(i(obj));
    }

    public static String h(Object obj) {
        return e(k(obj));
    }

    private static Map<String, String> i(Object obj) {
        HashMap hashMap = new HashMap();
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                String name = declaredFields[i4].getName();
                try {
                    boolean isAccessible = declaredFields[i4].isAccessible();
                    declaredFields[i4].setAccessible(true);
                    Object obj2 = declaredFields[i4].get(obj);
                    if (obj2 != null) {
                        hashMap.put(name, obj2.toString());
                    }
                    declaredFields[i4].setAccessible(isAccessible);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                } catch (IllegalArgumentException e6) {
                    e6.printStackTrace();
                }
            }
        }
        return hashMap;
    }

    private static void j(Object obj, Map<String, String> map) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                String name = declaredFields[i4].getName();
                try {
                    boolean isAccessible = declaredFields[i4].isAccessible();
                    declaredFields[i4].setAccessible(true);
                    Object obj2 = declaredFields[i4].get(obj);
                    if (obj2 != null) {
                        if (obj2 instanceof Collection) {
                            map.put(name, JsonMapper.getInstance().toJson(obj2).replace(",", ", "));
                        } else {
                            map.put(name, obj2.toString());
                        }
                    }
                    declaredFields[i4].setAccessible(isAccessible);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                } catch (IllegalArgumentException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    private static Map<String, String> k(Object obj) {
        HashMap hashMap = new HashMap();
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        for (int i4 = 0; i4 < length; i4++) {
            try {
                if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                    String name = declaredFields[i4].getName();
                    boolean isAccessible = declaredFields[i4].isAccessible();
                    declaredFields[i4].setAccessible(true);
                    Object obj2 = declaredFields[i4].get(obj);
                    if (obj2 != null) {
                        if (name.equals(QuarkPromptActivity_.E)) {
                            j(obj2, hashMap);
                        } else {
                            hashMap.put(name, obj2.toString());
                        }
                    }
                    declaredFields[i4].setAccessible(isAccessible);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return hashMap;
    }

    private static boolean l(Object obj) {
        try {
            return ((Class) obj.getClass().getField("TYPE").get(null)).isPrimitive();
        } catch (Exception unused) {
            return false;
        }
    }
}
