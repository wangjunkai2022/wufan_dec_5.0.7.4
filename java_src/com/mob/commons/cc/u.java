package com.mob.commons.cc;

import com.mob.commons.cc.z;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f56285a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, HashMap<String, String[][]>> f56286b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Class<?>, t<?>> f56287c = new HashMap<>();

    static {
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f56285a = hashMap;
        hashMap.put(com.mob.commons.s.a("003?diKei"), Integer.TYPE);
        hashMap.put(com.mob.commons.s.a("006^dcdkdgff.gf"), Double.TYPE);
        hashMap.put(MethodReflectParams.LONG, Long.TYPE);
        hashMap.put(com.mob.commons.s.a("0055efWg]dk=di"), Float.TYPE);
        hashMap.put("boolean", Boolean.TYPE);
        hashMap.put(MethodReflectParams.SHORT, Short.TYPE);
        hashMap.put(MethodReflectParams.BYTE, Byte.TYPE);
        hashMap.put(com.mob.commons.s.a("004chd)dj"), Character.TYPE);
        hashMap.put("void", Void.TYPE);
    }

    public u() {
        a(z.a.class, z.a.class);
    }

    private boolean b(Class<?> cls, Class<?> cls2) {
        return (cls == Byte.TYPE && cls2 == Byte.class) || (cls == Short.TYPE && (cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Character.TYPE && (cls2 == Character.class || cls2 == Short.class || cls2 == Byte.class)) || ((cls == Integer.TYPE && (cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Long.TYPE && (cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Float.TYPE && (cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Double.TYPE && (cls2 == Double.class || cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || (cls == Boolean.TYPE && cls2 == Boolean.class))))));
    }

    public void a(byte[] bArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), "utf-8"));
        try {
            try {
                HashMap<String, String[][]> hashMap = null;
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    String substring = readLine.substring(0, 2);
                    String substring2 = readLine.substring(2);
                    if (":P".equals(substring)) {
                        arrayList.addAll(Arrays.asList(substring2.split("#")));
                    } else if (":C".equals(substring)) {
                        String str = (String) arrayList.get(Integer.parseInt(substring2));
                        hashMap = this.f56286b.get(str);
                        if (hashMap == null) {
                            hashMap = new HashMap<>();
                            this.f56286b.put(str, hashMap);
                        }
                    } else {
                        String[] split = substring2.split("#");
                        String str2 = (String) arrayList.get(Integer.parseInt(split[0]));
                        String[][] strArr = new String[Integer.parseInt(split[1])];
                        for (int i4 = 2; i4 < split.length; i4++) {
                            String str3 = split[i4].startsWith("+") ? "+" : null;
                            if (split[i4].length() > 1) {
                                String[] split2 = split[i4].substring(1).split(",");
                                String[] strArr2 = new String[split2.length + 1];
                                strArr2[0] = str3;
                                int i5 = 0;
                                while (i5 < split2.length) {
                                    int i6 = i5 + 1;
                                    strArr2[i6] = (String) arrayList.get(Integer.parseInt(split2[i5]));
                                    i5 = i6;
                                }
                                strArr[i4 - 2] = strArr2;
                            } else {
                                String[] strArr3 = new String[1];
                                strArr3[0] = str3;
                                strArr[i4 - 2] = strArr3;
                            }
                        }
                        hashMap.put(str2, strArr);
                    }
                }
            } finally {
                bufferedReader.close();
            }
        } catch (Throwable unused) {
            this.f56286b.clear();
        }
    }

    public void a(Class<?> cls, Class<? extends t<?>> cls2) {
        try {
            t<?> newInstance = cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (this.f56287c.get(cls) == null) {
                this.f56287c.put(cls, newInstance);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean a(Object obj, Class<?> cls, String str, Object[] objArr, s sVar) throws Throwable {
        t<?> tVar = null;
        for (Class<?> cls2 = cls; tVar == null && cls2 != null && cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            tVar = this.f56287c.get(cls2);
        }
        if (tVar != null) {
            boolean[] zArr = new boolean[1];
            Object[] objArr2 = new Object[1];
            Throwable[] thArr = new Throwable[1];
            boolean a5 = tVar.a(obj, cls, str, objArr, zArr, objArr2, thArr);
            if (a5) {
                if (thArr[0] == null) {
                    if (!zArr[0]) {
                        sVar.a(objArr2[0]);
                    }
                } else {
                    throw thArr[0];
                }
            }
            return a5;
        }
        return false;
    }

    public boolean[] a(Class<?>[] clsArr, Object[] objArr, boolean[] zArr) {
        zArr[0] = true;
        if (clsArr.length == objArr.length) {
            boolean[] zArr2 = new boolean[clsArr.length];
            for (int i4 = 0; i4 < objArr.length; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    Class<?> cls = clsArr[i4];
                    if (cls.isInterface() && (obj instanceof z)) {
                        zArr2[i4] = true;
                        zArr[0] = false;
                    } else {
                        Class<?> cls2 = obj.getClass();
                        if (!b(cls, cls2) && !cls.isAssignableFrom(cls2)) {
                            return null;
                        }
                        zArr2[i4] = false;
                    }
                }
            }
            return zArr2;
        }
        return null;
    }

    public Object[] a(s sVar, Class<?>[] clsArr, Object[] objArr, boolean[] zArr) {
        Object[] objArr2 = new Object[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            if (objArr[i4] != null) {
                if (zArr[i4]) {
                    objArr2[i4] = sVar.a(objArr[i4], true, clsArr[i4]);
                } else {
                    objArr2[i4] = objArr[i4];
                }
            }
        }
        return objArr2;
    }

    public Constructor a(Class<?> cls, Object[] objArr, boolean[][] zArr) throws Throwable {
        String[][] strArr;
        boolean z4;
        boolean[] zArr2;
        boolean[] a5;
        HashMap<String, String[][]> hashMap = this.f56286b.get(cls.getName());
        if (hashMap == null || (strArr = hashMap.get(com.mob.commons.s.a("006%iedi-eEdiWi4ig"))) == null) {
            return null;
        }
        for (String[] strArr2 : strArr) {
            if (strArr2.length - 1 == objArr.length) {
                int length = objArr.length;
                Class<?>[] clsArr = new Class[length];
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z4 = false;
                        break;
                    }
                    int i5 = i4 + 1;
                    clsArr[i4] = a(strArr2[i5]);
                    if (clsArr[i4] == null) {
                        z4 = true;
                        break;
                    }
                    i4 = i5;
                }
                if (!z4 && (a5 = a(clsArr, objArr, (zArr2 = new boolean[1]))) != null) {
                    zArr[0] = a5;
                    zArr[1] = zArr2;
                    return cls.getDeclaredConstructor(clsArr);
                }
            }
        }
        return null;
    }

    public Method a(Class<?> cls, String str, boolean z4, Object[] objArr, boolean[][] zArr) throws Throwable {
        String[][] strArr;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean[] zArr2;
        boolean[] a5;
        HashMap<String, String[][]> hashMap = this.f56286b.get(cls.getName());
        if (hashMap == null || (strArr = hashMap.get(str)) == null) {
            return null;
        }
        for (String[] strArr2 : strArr) {
            if (strArr2[0] != null) {
                z5 = z4;
                z6 = true;
            } else {
                z5 = z4;
                z6 = false;
            }
            if ((z5 == z6) && strArr2.length - 1 == objArr.length) {
                int length = objArr.length;
                Class<?>[] clsArr = new Class[length];
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z7 = false;
                        break;
                    }
                    int i5 = i4 + 1;
                    clsArr[i4] = a(strArr2[i5]);
                    if (clsArr[i4] == null) {
                        z7 = true;
                        break;
                    }
                    i4 = i5;
                }
                if (!z7 && (a5 = a(clsArr, objArr, (zArr2 = new boolean[1]))) != null) {
                    zArr[0] = a5;
                    zArr[1] = zArr2;
                    return cls.getDeclaredMethod(str, clsArr);
                }
            }
        }
        return null;
    }

    private Class<?> a(String str) {
        Class<?> cls = f56285a.get(str);
        if (cls == null) {
            try {
                return Class.forName(str);
            } catch (Throwable unused) {
                return null;
            }
        }
        return cls;
    }
}
