package com.mob.commons.cc;

import com.mob.commons.cc.aa;
import com.mob.commons.cc.x;
import com.mob.commons.cc.z;
import com.tencent.cos.common.COSHttpResponseKey;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes5.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public int f56301a;

    /* renamed from: b  reason: collision with root package name */
    public String f56302b;

    /* renamed from: c  reason: collision with root package name */
    public int f56303c;

    /* renamed from: d  reason: collision with root package name */
    public String f56304d;

    /* renamed from: e  reason: collision with root package name */
    public String f56305e;

    /* renamed from: f  reason: collision with root package name */
    public String f56306f;

    /* renamed from: g  reason: collision with root package name */
    public int f56307g;

    /* renamed from: h  reason: collision with root package name */
    public String f56308h;

    /* renamed from: i  reason: collision with root package name */
    public int f56309i;

    /* renamed from: j  reason: collision with root package name */
    public int f56310j;

    /* renamed from: k  reason: collision with root package name */
    public int f56311k;

    /* renamed from: l  reason: collision with root package name */
    public String f56312l;

    /* renamed from: m  reason: collision with root package name */
    public Object[] f56313m;

    /* renamed from: n  reason: collision with root package name */
    public String f56314n;

    /* renamed from: o  reason: collision with root package name */
    public String[] f56315o;

    /* renamed from: p  reason: collision with root package name */
    public String f56316p;

    /* renamed from: q  reason: collision with root package name */
    public Object f56317q;

    /* renamed from: r  reason: collision with root package name */
    public int f56318r;

    /* renamed from: s  reason: collision with root package name */
    public int f56319s;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f56320a;

        /* renamed from: b  reason: collision with root package name */
        public s f56321b;

        /* renamed from: c  reason: collision with root package name */
        public List<Object> f56322c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f56323d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f56324e;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<y> f56325f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<Object> f56326g;

        public Object a() {
            return this.f56321b.a();
        }

        public Object b(String str) {
            return this.f56321b.a(str);
        }

        public void a(Object obj) {
            this.f56321b.a(obj);
        }

        public void b(String str, Object obj) {
            this.f56321b.a(str, obj);
        }

        public Class<?> a(String str) {
            return this.f56321b.b(str);
        }

        public void a(String str, Class<?> cls) {
            this.f56321b.a(str, cls);
        }

        public void a(String str, Object obj) {
            this.f56321b.b(str, obj);
        }
    }

    public y(int i4) {
        this.f56301a = i4;
    }

    public void a(x.a aVar) throws Throwable {
        int i4 = 0;
        switch (this.f56301a) {
            case 1:
                this.f56308h = (String) aVar.b();
                aVar.a();
                return;
            case 2:
                this.f56317q = aVar.b();
                return;
            case 3:
                this.f56308h = (String) aVar.b();
                return;
            case 4:
                this.f56311k = ((Integer) aVar.b()).intValue();
                return;
            case 5:
                this.f56311k = ((Integer) aVar.b()).intValue();
                return;
            case 6:
                this.f56319s = ((Integer) aVar.b()).intValue();
                return;
            case 7:
                this.f56318r = ((Integer) aVar.b()).intValue();
                return;
            case 8:
            case 15:
            case 23:
            case 25:
            case 28:
            case 30:
            case 33:
            case 34:
            default:
                return;
            case 9:
                this.f56308h = (String) aVar.b();
                return;
            case 10:
                this.f56304d = (String) aVar.b();
                this.f56305e = (String) aVar.b();
                return;
            case 11:
                this.f56312l = (String) aVar.b();
                return;
            case 12:
                this.f56316p = (String) aVar.b();
                this.f56309i = ((Integer) aVar.b()).intValue();
                return;
            case 13:
                this.f56314n = (String) aVar.b();
                this.f56312l = (String) aVar.b();
                return;
            case 14:
                this.f56314n = (String) aVar.b();
                this.f56316p = (String) aVar.b();
                this.f56309i = ((Integer) aVar.b()).intValue();
                return;
            case 16:
                this.f56309i = ((Integer) aVar.b()).intValue();
                return;
            case 17:
                this.f56314n = (String) aVar.b();
                return;
            case 18:
                this.f56314n = (String) aVar.b();
                this.f56309i = ((Integer) aVar.b()).intValue();
                return;
            case 19:
                this.f56308h = (String) aVar.b();
                return;
            case 20:
                this.f56306f = (String) aVar.b();
                return;
            case 21:
                this.f56306f = (String) aVar.b();
                int intValue = ((Integer) aVar.b()).intValue();
                this.f56307g = intValue;
                this.f56307g = intValue + aVar.c();
                return;
            case 22:
                this.f56306f = (String) aVar.b();
                int intValue2 = ((Integer) aVar.b()).intValue();
                this.f56307g = intValue2;
                this.f56307g = intValue2 + aVar.c();
                return;
            case 24:
                this.f56312l = (String) aVar.b();
                return;
            case 26:
                this.f56314n = (String) aVar.b();
                this.f56312l = (String) aVar.b();
                return;
            case 27:
                this.f56314n = (String) aVar.b();
                return;
            case 29:
                this.f56308h = (String) aVar.b();
                this.f56309i = ((Integer) aVar.b()).intValue();
                int intValue3 = ((Integer) aVar.b()).intValue();
                this.f56310j = intValue3;
                this.f56310j = intValue3 + aVar.c();
                return;
            case 31:
                this.f56308h = (String) aVar.b();
                this.f56309i = ((Integer) aVar.b()).intValue();
                return;
            case 32:
                this.f56309i = ((Integer) aVar.b()).intValue();
                return;
            case 35:
                this.f56304d = (String) aVar.b();
                this.f56305e = (String) aVar.b();
                return;
            case 36:
                int intValue4 = ((Integer) aVar.b()).intValue();
                this.f56315o = new String[intValue4];
                while (i4 < intValue4) {
                    this.f56315o[i4] = (String) aVar.b();
                    aVar.a();
                    i4++;
                }
                return;
            case 37:
                int intValue5 = ((Integer) aVar.b()).intValue();
                this.f56313m = new Object[intValue5];
                while (i4 < intValue5) {
                    this.f56313m[i4] = aVar.b();
                    i4++;
                }
                return;
            case 38:
                int intValue6 = ((Integer) aVar.b()).intValue();
                this.f56315o = new String[intValue6];
                while (i4 < intValue6) {
                    this.f56315o[i4] = (String) aVar.b();
                    i4++;
                }
                return;
        }
    }

    void b(Object obj, s sVar) throws Throwable {
        Object a5 = sVar.a();
        if (obj instanceof Map) {
            ((Map) obj).put(this.f56312l, a5);
            return;
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field field = null;
            try {
                field = cls.getDeclaredField(this.f56312l);
            } catch (Throwable unused) {
            }
            if (field != null && !Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(obj, a5);
                return;
            }
        }
        y yVar = new y(12);
        yVar.f56302b = this.f56302b;
        yVar.f56303c = this.f56303c;
        yVar.f56316p = "set" + Character.toUpperCase(this.f56312l.charAt(0)) + this.f56312l.substring(1);
        yVar.f56309i = 1;
        yVar.a(obj, new Object[]{a5}, sVar);
    }

    public y() {
    }

    void b(Class<?> cls, s sVar) throws Throwable {
        Field field;
        Object a5 = sVar.a();
        while (cls != null) {
            try {
                field = cls.getDeclaredField(this.f56312l);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(null, a5);
                return;
            }
            cls = cls.getSuperclass();
        }
        y yVar = new y(14);
        yVar.f56302b = this.f56302b;
        yVar.f56303c = this.f56303c;
        yVar.f56314n = this.f56314n;
        yVar.f56316p = "set" + Character.toUpperCase(this.f56312l.charAt(0)) + this.f56312l.substring(1);
        yVar.f56309i = 1;
        yVar.a(cls, new Object[]{a5}, sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:419:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a87 A[LOOP:13: B:427:0x0a84->B:429:0x0a87, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a94  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mob.commons.cc.y.a r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.y.a(com.mob.commons.cc.y$a):void");
    }

    void a(Object obj, s sVar) throws Throwable {
        if (obj instanceof Map) {
            sVar.a(((Map) obj).get(this.f56312l));
        } else if (com.mob.commons.s.a("006gfe>ej1ih").equals(this.f56312l) && obj.getClass().isArray()) {
            sVar.a(Integer.valueOf(Array.getLength(obj)));
        } else {
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                Field field = null;
                try {
                    field = cls.getDeclaredField(this.f56312l);
                } catch (Throwable unused) {
                }
                if (field != null && !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    sVar.a(field.get(obj));
                    return;
                }
            }
            y yVar = new y(12);
            yVar.f56302b = this.f56302b;
            yVar.f56303c = this.f56303c;
            yVar.f56316p = com.mob.commons.s.a("0039ej>fi") + Character.toUpperCase(this.f56312l.charAt(0)) + this.f56312l.substring(1);
            yVar.f56309i = 0;
            yVar.a(obj, new Object[0], sVar);
        }
    }

    void a(Class<?> cls, s sVar) throws Throwable {
        Field field;
        while (true) {
            if (cls != null) {
                if ("class".equals(this.f56312l)) {
                    sVar.a(cls);
                    return;
                } else if (cls.equals(x.class) && com.mob.commons.s.a("007+ddGfAdjfididk'e").equals(this.f56312l)) {
                    sVar.a((Object) 70);
                    return;
                } else if (cls.isEnum()) {
                    Object[] enumConstants = cls.getEnumConstants();
                    if (enumConstants != null) {
                        for (Object obj : enumConstants) {
                            if (((Enum) obj).name().equals(this.f56312l)) {
                                sVar.a(obj);
                                return;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    try {
                        field = cls.getDeclaredField(this.f56312l);
                    } catch (Throwable unused) {
                        field = null;
                    }
                    if (field != null && Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        sVar.a(field.get(null));
                        return;
                    }
                    cls = cls.getSuperclass();
                }
            } else {
                y yVar = new y(14);
                yVar.f56302b = this.f56302b;
                yVar.f56303c = this.f56303c;
                yVar.f56314n = this.f56314n;
                yVar.f56316p = com.mob.commons.s.a("003Qej(fi") + Character.toUpperCase(this.f56312l.charAt(0)) + this.f56312l.substring(1);
                yVar.f56309i = 1;
                yVar.a(cls, new Object[0], sVar);
                return;
            }
        }
    }

    void a(Class<?> cls, Object[] objArr, s sVar) throws Throwable {
        Method[] declaredMethods;
        Class<?>[] parameterTypes;
        boolean[] zArr;
        boolean[] a5;
        Constructor<?>[] declaredConstructors;
        Map map;
        List list;
        Class<?> cls2 = cls;
        if ("new".equals(this.f56316p)) {
            if (List.class.isAssignableFrom(cls2) && objArr.length == 1 && objArr[0] != null && objArr[0].getClass().isArray()) {
                int length = Array.getLength(objArr[0]);
                if (cls2.equals(List.class)) {
                    list = new ArrayList(length);
                } else {
                    list = (List) cls.newInstance();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    list.add(Array.get(objArr[0], i4));
                }
                sVar.a(list);
            } else if (Map.class.isAssignableFrom(cls2) && objArr.length == 1 && objArr[0] != null) {
                if (cls2.equals(Map.class)) {
                    map = new HashMap();
                } else {
                    map = (Map) cls.newInstance();
                }
                if (objArr[0] instanceof Map) {
                    map.putAll((Map) objArr[0]);
                } else {
                    Class<?> cls3 = Class.forName("org.json.JSONObject");
                    a(map, a(objArr[0], cls3), cls3, Class.forName("org.json.JSONArray"));
                }
                sVar.a(map);
            } else if (cls2.equals(aa.class)) {
                if (objArr.length == 2) {
                    sVar.a(new aa((Number) objArr[0], (Number) objArr[1], null));
                } else if (objArr.length == 3) {
                    sVar.a(new aa((Number) objArr[0], (Number) objArr[1], (Number) objArr[2]));
                } else {
                    throw new NoSuchMethodException("method name: new at line: " + this.f56302b + "(" + this.f56303c + ")");
                }
            } else {
                boolean[][] zArr2 = new boolean[2];
                Constructor a6 = sVar.g().a(cls2, objArr, zArr2);
                if (a6 != null) {
                    Object[] a7 = !zArr2[1][0] ? sVar.g().a(sVar, a6.getParameterTypes(), objArr, zArr2[0]) : objArr;
                    a6.setAccessible(true);
                    sVar.a(a6.newInstance(a7));
                    return;
                }
                for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    boolean[] zArr3 = new boolean[1];
                    boolean[] a8 = sVar.g().a(parameterTypes2, objArr, zArr3);
                    if (a8 != null) {
                        Object[] a9 = !zArr3[0] ? sVar.g().a(sVar, parameterTypes2, objArr, a8) : objArr;
                        constructor.setAccessible(true);
                        sVar.a(constructor.newInstance(a9));
                        return;
                    }
                }
                throw new NoSuchMethodException("method name: new at line: " + this.f56302b + "(" + this.f56303c + ")");
            }
        } else if ("fromJson".equals(this.f56316p) && Map.class.isAssignableFrom(cls2) && objArr.length == 1 && objArr[0] != null) {
            this.f56316p = "new";
            a(cls, objArr, sVar);
        } else {
            if (cls2.equals(Array.class)) {
                if (this.f56316p.equals(com.mob.commons.s.a("011ef%fgeeAeTfi8idecf")) && objArr.length == 2 && (objArr[1] instanceof Integer)) {
                    sVar.a(Array.newInstance((Class) objArr[0], ((Integer) objArr[1]).intValue()));
                    return;
                } else if ("copy".equals(this.f56316p)) {
                    int i5 = this.f56309i;
                    if (i5 == 5) {
                        System.arraycopy(objArr[0], Integer.parseInt(String.valueOf(objArr[1])), objArr[2], Integer.parseInt(String.valueOf(objArr[3])), Integer.parseInt(String.valueOf(objArr[44])));
                        return;
                    } else if (i5 == 2) {
                        System.arraycopy(objArr[0], 0, objArr[1], 0, Math.min(Array.getLength(objArr[0]), Array.getLength(objArr[1])));
                        return;
                    } else {
                        throw new NoSuchMethodException("method name: copy at line: " + this.f56302b + "(" + this.f56303c + ")");
                    }
                }
            } else if ("quit".equals(this.f56316p) && cls2.equals(x.class)) {
                sVar.e();
                return;
            }
            if (sVar.g().a((Object) null, cls, this.f56316p, objArr, sVar)) {
                return;
            }
            for (Class<? super Object> cls4 = cls2; cls4 != null; cls4 = cls4.getSuperclass()) {
                boolean[][] zArr4 = new boolean[2];
                Method a10 = sVar.g().a(cls4, this.f56316p, true, objArr, zArr4);
                if (a10 != null) {
                    Object[] a11 = !zArr4[1][0] ? sVar.g().a(sVar, a10.getParameterTypes(), objArr, zArr4[0]) : objArr;
                    a10.setAccessible(true);
                    if (a10.getReturnType() == Void.TYPE) {
                        a10.invoke(null, a11);
                        return;
                    } else {
                        sVar.a(a10.invoke(null, a11));
                        return;
                    }
                }
            }
            while (cls2 != null) {
                for (Method method : cls2.getDeclaredMethods()) {
                    if (method.getName().equals(this.f56316p) && Modifier.isStatic(method.getModifiers()) && (a5 = sVar.g().a((parameterTypes = method.getParameterTypes()), objArr, (zArr = new boolean[1]))) != null) {
                        Object[] a12 = !zArr[0] ? sVar.g().a(sVar, parameterTypes, objArr, a5) : objArr;
                        method.setAccessible(true);
                        if (method.getReturnType() == Void.TYPE) {
                            method.invoke(null, a12);
                            return;
                        } else {
                            sVar.a(method.invoke(null, a12));
                            return;
                        }
                    }
                }
                cls2 = cls2.getSuperclass();
            }
            throw new NoSuchMethodException("method name: " + this.f56316p + " at line: " + this.f56302b + "(" + this.f56303c + ")");
        }
    }

    private Object a(Object obj, Class<?> cls) throws Throwable {
        if (obj instanceof ByteArrayOutputStream) {
            return a(((ByteArrayOutputStream) obj).toByteArray(), cls);
        }
        if (obj instanceof byte[]) {
            return a(new String((byte[]) obj, "utf-8"), cls);
        }
        if (!(obj instanceof StringBuffer) && !(obj instanceof StringBuilder)) {
            if (obj instanceof String) {
                return cls.getConstructor(String.class).newInstance(obj);
            }
            if (obj.getClass().equals(cls)) {
                return obj;
            }
            throw new ClassCastException("Failed to cast " + obj + " to be " + cls.getName() + " at line: " + this.f56302b + "(" + this.f56303c + ")");
        }
        return a(obj.toString(), cls);
    }

    private void a(Map map, Object obj, Class<?> cls, Class<?> cls2) throws Throwable {
        Field declaredField = cls.getDeclaredField("nameValuePairs");
        declaredField.setAccessible(true);
        Field declaredField2 = cls.getDeclaredField("NULL");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(null);
        for (Map.Entry entry : ((Map) declaredField.get(obj)).entrySet()) {
            map.put(entry.getKey(), a(entry.getValue(), obj2, cls, cls2));
        }
    }

    private Object a(Object obj, Object obj2, Class<?> cls, Class<?> cls2) throws Throwable {
        if (obj == null || obj2.equals(obj)) {
            return null;
        }
        if (obj.getClass().equals(cls)) {
            HashMap hashMap = new HashMap();
            a((Map) hashMap, obj, cls, cls2);
            return hashMap;
        } else if (obj.getClass().equals(cls2)) {
            Field declaredField = cls2.getDeclaredField("values");
            declaredField.setAccessible(true);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) declaredField.get(obj)) {
                arrayList.add(a(obj3, obj2, cls, cls2));
            }
            return arrayList;
        } else {
            return obj;
        }
    }

    void a(Object obj, Object[] objArr, s sVar) throws Throwable {
        byte[] bArr;
        String[] strArr;
        z zVar;
        String str;
        Method[] declaredMethods;
        Class<?>[] parameterTypes;
        boolean[] zArr;
        boolean[] a5;
        Class<?>[] clsArr;
        Object[] objArr2 = objArr;
        int i4 = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(this.f56316p);
            if (obj2 != null) {
                if (obj2 instanceof z) {
                    LinkedList<Object> b5 = ((z) obj2).b(objArr2);
                    if (b5.size() > 0) {
                        sVar.a(b5.get(0));
                        return;
                    }
                    return;
                } else if (obj2 instanceof Method) {
                    sVar.a((Method) obj2, objArr2);
                    return;
                }
            } else if ((com.mob.commons.s.a("005j>djdkeiec").equals(this.f56316p) || com.mob.commons.s.a("0115dg.eKfi)d(ef6f8gldjdkeiec").equals(this.f56316p)) && objArr2.length == 1 && objArr2[0] != null) {
                if (objArr2[0] instanceof Class) {
                    clsArr = new Class[]{(Class) objArr2[0]};
                } else if (objArr2[0] instanceof List) {
                    List list = (List) objArr2[0];
                    clsArr = (Class[]) list.toArray(new Class[list.size()]);
                } else {
                    throw new NoSuchMethodException("method name: " + this.f56316p + " at line: " + this.f56302b + "(" + this.f56303c + ")");
                }
                sVar.a(sVar.a(obj, com.mob.commons.s.a("005j@djdkeiec").equals(this.f56316p), clsArr));
                return;
            } else if ("iterator".equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(map.entrySet().iterator());
                return;
            } else if ("toJson".equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(Class.forName("org.json.JSONObject").getDeclaredConstructor(Map.class).newInstance(obj));
                return;
            }
        } else if (obj instanceof z) {
            z zVar2 = (z) obj;
            if (com.mob.commons.s.a("004ifIfiDi").equals(this.f56316p)) {
                sVar.a(zVar2.a(objArr2));
                return;
            } else if (com.mob.commons.s.a("008cMdgdjdjecdiEe-ej").equals(this.f56316p)) {
                sVar.a(zVar2.a(sVar, this.f56302b, this.f56303c));
                return;
            }
        } else if (obj instanceof Method) {
            if (com.mob.commons.s.a("004if4fi(i").equals(this.f56316p)) {
                z.a aVar = new z.a();
                s b6 = sVar.b();
                try {
                    b6.a((Method) obj, objArr2);
                    aVar.f56334b = b6.a();
                } catch (Throwable th) {
                    aVar.f56333a = th;
                }
                sVar.a(aVar);
                return;
            } else if (com.mob.commons.s.a("0133fi.fiQfdQccf fifidiff1gf").equals(this.f56316p) && objArr2.length == 1) {
                ((Method) obj).setAccessible(((Boolean) objArr2[0]).booleanValue());
                return;
            }
        } else if (obj instanceof Collection) {
            Collection<Object> collection = (Collection) obj;
            int size = collection.size();
            if ("toArray".equals(this.f56316p) && objArr2.length == 1 && objArr2[0] != null && (objArr2[0] instanceof Class)) {
                Object newInstance = Array.newInstance((Class) objArr2[0], size);
                for (Object obj3 : collection) {
                    Array.set(newInstance, i4, obj3);
                    i4++;
                }
                sVar.a(newInstance);
                return;
            }
        } else if (obj.getClass().isArray()) {
            if ("iterator".equals(this.f56316p) && objArr2.length == 0) {
                ArrayList arrayList = new ArrayList();
                int length = Array.getLength(obj);
                while (i4 < length) {
                    arrayList.add(Array.get(obj, i4));
                    i4++;
                }
                sVar.a(arrayList.iterator());
                return;
            } else if ("toList".equals(this.f56316p) && objArr2.length == 0) {
                ArrayList arrayList2 = new ArrayList();
                int length2 = Array.getLength(obj);
                while (i4 < length2) {
                    arrayList2.add(Array.get(obj, i4));
                    i4++;
                }
                sVar.a(arrayList2);
                return;
            } else if (obj.getClass().getComponentType() == Byte.TYPE) {
                if (com.mob.commons.s.a("003!dfdchi").equals(this.f56316p) && objArr2.length == 0) {
                    byte[] bArr2 = (byte[]) obj;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2, 0, bArr2.length);
                    Object a6 = a(byteArrayInputStream);
                    byteArrayInputStream.close();
                    sVar.a(a6);
                    return;
                } else if ("hex".equals(this.f56316p) && objArr2.length == 0) {
                    sVar.a(a((byte[]) obj));
                    return;
                } else if (COSHttpResponseKey.Data.SHA.equals(this.f56316p) && objArr2.length == 1) {
                    MessageDigest messageDigest = MessageDigest.getInstance((String) objArr2[0]);
                    messageDigest.update((byte[]) obj);
                    sVar.a(messageDigest.digest());
                    return;
                }
            }
        } else if (Iterator.class.isAssignableFrom(obj.getClass())) {
            if ("hasNext".equals(this.f56316p)) {
                sVar.a(Boolean.valueOf(((Iterator) obj).hasNext()));
                return;
            } else if ("next".equals(this.f56316p)) {
                sVar.a(((Iterator) obj).next());
                return;
            } else if ("remove".equals(this.f56316p)) {
                ((Iterator) obj).remove();
                return;
            }
        } else if (obj instanceof aa.a) {
            if ("hasNext".equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(Boolean.valueOf(((aa.a) obj).a()));
                return;
            } else if ("next".equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(((aa.a) obj).b());
                return;
            }
        } else if (obj instanceof aa) {
            if ("iterator".equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(((aa) obj).a());
                return;
            } else if ("isInRange".equals(this.f56316p) && objArr2.length == 1) {
                sVar.a(Boolean.valueOf(((aa) obj).a((Number) objArr2[0])));
                return;
            } else if ("contains".equals(this.f56316p) && objArr2.length == 1) {
                sVar.a(Boolean.valueOf(((aa) obj).b((Number) objArr2[0])));
                return;
            } else if (HttpHeaders.Values.BOUNDARY.equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(((aa) obj).b());
                return;
            }
        } else if (obj instanceof String) {
            if ("getBytes".equals(this.f56316p)) {
                if (objArr2.length == 0) {
                    sVar.a(((String) obj).getBytes());
                    return;
                } else if (objArr2.length == 1 && (objArr2[0] instanceof String)) {
                    sVar.a(((String) obj).getBytes((String) objArr2[0]));
                    return;
                }
            } else if ("input".equals(this.f56316p)) {
                if (objArr2.length == 0) {
                    sVar.a(new FileInputStream((String) obj));
                    return;
                } else if (objArr2.length == 1 && (objArr2[0] instanceof z)) {
                    FileInputStream fileInputStream = new FileInputStream((String) obj);
                    ((z) objArr2[0]).b(fileInputStream);
                    fileInputStream.close();
                    return;
                }
            } else if ("output".equals(this.f56316p)) {
                if (objArr2.length == 0) {
                    sVar.a(new FileOutputStream((String) obj));
                    return;
                } else if (objArr2.length == 1 && (objArr2[0] instanceof z)) {
                    FileOutputStream fileOutputStream = new FileOutputStream((String) obj);
                    ((z) objArr2[0]).b(fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                }
            } else {
                File file = null;
                String valueOf = null;
                String valueOf2 = null;
                FileInputStream fileInputStream2 = null;
                r3 = null;
                Collection<Object> collection2 = null;
                file = null;
                if (com.mob.commons.s.a("012?djYfd<dcgcdjdkdfgcdi<gf").equals(this.f56316p)) {
                    if (objArr2.length == 0) {
                        valueOf = "utf-8";
                    } else if (objArr2.length == 1) {
                        valueOf = String.valueOf(objArr2[0]);
                    }
                    if (valueOf != null) {
                        FileInputStream fileInputStream3 = new FileInputStream((String) obj);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr3 = new byte[4096];
                        for (int read = fileInputStream3.read(bArr3); read != -1; read = fileInputStream3.read(bArr3)) {
                            byteArrayOutputStream.write(bArr3, 0, read);
                        }
                        fileInputStream3.close();
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        sVar.a(new String(byteArrayOutputStream.toByteArray(), valueOf));
                        return;
                    }
                } else if (com.mob.commons.s.a("011QfgdjdiUif5fcdkgcdi]gf").equals(this.f56316p)) {
                    if (objArr2.length == 1) {
                        valueOf2 = String.valueOf(objArr2[0]);
                        str = "utf-8";
                    } else if (objArr2.length == 2) {
                        valueOf2 = String.valueOf(objArr2[0]);
                        str = String.valueOf(objArr2[1]);
                    } else {
                        str = null;
                    }
                    if (valueOf2 != null) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(valueOf2);
                        fileOutputStream2.write(((String) obj).getBytes(str));
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        return;
                    }
                } else if (com.mob.commons.s.a("009)djTfdTdcfedi%ef+fi").equals(this.f56316p)) {
                    String str2 = "utf-8";
                    if (objArr2.length == 0) {
                        zVar = null;
                        fileInputStream2 = new FileInputStream((String) obj);
                    } else if (objArr2.length == 1) {
                        if (objArr2[0] instanceof String) {
                            fileInputStream2 = new FileInputStream((String) obj);
                            str2 = (String) objArr2[0];
                            zVar = null;
                        } else {
                            if (objArr2[0] instanceof z) {
                                fileInputStream2 = new FileInputStream((String) obj);
                                zVar = (z) objArr2[0];
                            }
                            zVar = null;
                        }
                    } else {
                        if (objArr2.length == 2 && (objArr2[0] instanceof String) && (objArr2[1] instanceof z)) {
                            fileInputStream2 = new FileInputStream((String) obj);
                            str2 = (String) objArr2[0];
                            zVar = (z) objArr2[1];
                        }
                        zVar = null;
                    }
                    if (fileInputStream2 != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, str2));
                        String readLine = bufferedReader.readLine();
                        if (zVar == null) {
                            ArrayList arrayList3 = new ArrayList();
                            while (readLine != null) {
                                arrayList3.add(readLine);
                                readLine = bufferedReader.readLine();
                            }
                            sVar.a(arrayList3);
                        } else {
                            while (readLine != null) {
                                zVar.b(readLine);
                                readLine = bufferedReader.readLine();
                            }
                        }
                        bufferedReader.close();
                        return;
                    }
                } else if (com.mob.commons.s.a("010CfgdjdiNifJfedi6ef]fi").equals(this.f56316p)) {
                    String str3 = "utf-8";
                    if (objArr2.length >= 1) {
                        if (objArr2.length == 2 && (objArr2[1] instanceof String)) {
                            str3 = (String) objArr2[1];
                        }
                        if (objArr2[0] instanceof String) {
                            collection2 = new ArrayList();
                            collection2.add(objArr2[0]);
                        } else if (objArr2[0] instanceof Collection) {
                            collection2 = (Collection) objArr2[0];
                        } else if (objArr2[0].getClass().isArray()) {
                            collection2 = new ArrayList();
                            int length3 = Array.getLength(objArr2[0]);
                            for (int i5 = 0; i5 < length3; i5++) {
                                collection2.add(Array.get(objArr2[0], i5));
                            }
                        }
                    }
                    if (collection2 != null) {
                        FileOutputStream fileOutputStream3 = new FileOutputStream((String) obj);
                        for (Object obj4 : collection2) {
                            fileOutputStream3.write((obj4 + "\r\n").getBytes(str3));
                        }
                        fileOutputStream3.flush();
                        fileOutputStream3.close();
                        return;
                    }
                } else if (com.mob.commons.s.a("004fMei,fc").equals(this.f56316p)) {
                    if (objArr2.length == 0) {
                        sVar.a(Runtime.getRuntime().exec((String) obj));
                        return;
                    } else if (objArr2.length == 1 || objArr2.length == 2) {
                        if (objArr2[0] instanceof String[]) {
                            strArr = (String[]) objArr2[0];
                        } else if (objArr2[0] instanceof List) {
                            List list2 = (List) objArr2[0];
                            int size2 = list2.size();
                            String[] strArr2 = new String[size2];
                            for (int i6 = 0; i6 < size2; i6++) {
                                Object obj5 = list2.get(i6);
                                strArr2[i6] = obj5 == null ? null : String.valueOf(obj5);
                            }
                            strArr = strArr2;
                        } else {
                            strArr = null;
                        }
                        if (objArr2.length == 2 && (objArr2[1] instanceof File)) {
                            file = (File) objArr2[1];
                        }
                        if (strArr != null) {
                            sVar.a(Runtime.getRuntime().exec((String) obj, strArr, file));
                            return;
                        }
                    }
                } else if (com.mob.commons.s.a("007PefdjdkdffkVf$ei").equals(this.f56316p) && objArr2.length == 0) {
                    String str4 = (String) obj;
                    int length4 = str4.length();
                    if (length4 % 2 == 1) {
                        length4++;
                        bArr = new byte[length4 / 2];
                        str4 = "0" + str4;
                    } else {
                        bArr = new byte[length4 / 2];
                    }
                    int i7 = 0;
                    while (i4 < length4) {
                        int i8 = i4 + 2;
                        bArr[i7] = (byte) Integer.parseInt(str4.substring(i4, i8), 16);
                        i7++;
                        i4 = i8;
                    }
                    sVar.a(bArr);
                    return;
                }
            }
        } else if (obj instanceof InputStream) {
            if (com.mob.commons.s.a("017iTdkfl<didSeeWej(dgYiRelQiHdj6fd3df").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new DataInputStream((InputStream) obj));
                return;
            } else if (com.mob.commons.s.a("021iVdkfjdgefef>fVdjJf%dceeVejXdg iCel!i8dj>fdKdf").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new BufferedInputStream((InputStream) obj));
                return;
            } else if (com.mob.commons.s.a("017i?dkidijeeglee=ejWdgDi4el+i$dj@fdJdf").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new GZIPInputStream((InputStream) obj));
                return;
            } else if (com.mob.commons.s.a("019i9dkghffhgUfci:ee+ej'dgOiGel+i<dj4fdDdf").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new ObjectInputStream((InputStream) obj));
                return;
            } else if (com.mob.commons.s.a("003=dfdchi").equals(this.f56316p) && objArr2.length == 0) {
                a((InputStream) obj);
            }
        } else if (obj instanceof OutputStream) {
            if (com.mob.commons.s.a("018iXdkflGdid-ghdg[ij_dg+iFel1i+dj(fd)df").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new DataOutputStream((OutputStream) obj));
                return;
            } else if (com.mob.commons.s.a("022i6dkfjdgefefUf:dj fLdcghdgOij)dgTiIel(i+djBfd@df").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new BufferedOutputStream((OutputStream) obj));
                return;
            } else if (com.mob.commons.s.a("018i)dkidijeeglghdg[ijMdgAiFel5iIdj:fd>df").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new GZIPOutputStream((OutputStream) obj));
                return;
            } else if (com.mob.commons.s.a("020iWdkghffhg?fci0ghdg>ijVdgLiMelDiVdj*fd_df").equals(this.f56316p) && objArr2.length == 0) {
                sVar.a(new ObjectOutputStream((OutputStream) obj));
                return;
            }
        } else if (obj instanceof Class) {
            if (com.mob.commons.s.a("006NdidfCjGdkdjEi").equals(this.f56316p)) {
                if (objArr2.length == 0) {
                    Class<?> cls = (Class) obj;
                    sVar.a(cls.getSimpleName(), cls);
                    return;
                } else if (objArr2.length == 1 && (objArr2[0] instanceof String)) {
                    sVar.a((String) objArr2[0], (Class) obj);
                    return;
                }
            }
        } else if (obj instanceof Throwable) {
            if (com.mob.commons.s.a("005ih-djdkfg").equals(this.f56316p) && objArr2.length == 0) {
                throw ((Throwable) obj);
            }
        } else if (AccessibleObject.class.isAssignableFrom(obj.getClass()) && com.mob.commons.s.a("013%fi>fi6fdQccf4fifidiff>gf").equals(this.f56316p) && objArr2.length == 1) {
            ((AccessibleObject) obj).setAccessible(((Boolean) objArr2[0]).booleanValue());
            return;
        }
        if (com.mob.commons.s.a("004g6dk%c$eh").equals(this.f56316p) && objArr2.length > 0 && (objArr2[0] instanceof z)) {
            synchronized (obj) {
                z zVar3 = (z) objArr2[0];
                int length5 = objArr2.length - 1;
                Object[] objArr3 = new Object[length5];
                if (objArr2.length > 1) {
                    System.arraycopy(objArr2, 1, objArr3, 0, length5);
                }
                LinkedList<Object> b7 = zVar3.b(objArr3);
                if (!b7.isEmpty()) {
                    sVar.a(b7.get(0));
                }
            }
            return;
        }
        Class<?> cls2 = obj.getClass();
        if (sVar.g().a(obj, cls2, this.f56316p, objArr, sVar)) {
            return;
        }
        for (Class<?> cls3 = cls2; cls3 != null; cls3 = cls3.getSuperclass()) {
            boolean[][] zArr2 = new boolean[2];
            Method a7 = sVar.g().a(cls3, this.f56316p, false, objArr, zArr2);
            if (a7 != null) {
                if (!zArr2[1][0]) {
                    objArr2 = sVar.g().a(sVar, a7.getParameterTypes(), objArr2, zArr2[0]);
                }
                a7.setAccessible(true);
                if (a7.getReturnType() == Void.TYPE) {
                    a7.invoke(obj, objArr2);
                    return;
                } else {
                    sVar.a(a7.invoke(obj, objArr2));
                    return;
                }
            }
        }
        while (cls2 != null) {
            for (Method method : cls2.getDeclaredMethods()) {
                if (method.getName().equals(this.f56316p) && !Modifier.isStatic(method.getModifiers()) && (a5 = sVar.g().a((parameterTypes = method.getParameterTypes()), objArr2, (zArr = new boolean[1]))) != null) {
                    if (!zArr[0]) {
                        objArr2 = sVar.g().a(sVar, parameterTypes, objArr2, a5);
                    }
                    method.setAccessible(true);
                    if (method.getReturnType() == Void.TYPE) {
                        method.invoke(obj, objArr2);
                        return;
                    } else {
                        sVar.a(method.invoke(obj, objArr2));
                        return;
                    }
                }
            }
            cls2 = cls2.getSuperclass();
        }
        throw new NoSuchMethodException("method name: " + this.f56316p + " at line: " + this.f56302b + "(" + this.f56303c + ")");
    }

    private String a(InputStream inputStream) throws Throwable {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[1024];
        MessageDigest messageDigest = MessageDigest.getInstance(com.mob.commons.s.a("003+hcflhi"));
        int read = inputStream.read(bArr);
        while (read != -1) {
            messageDigest.update(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return a(messageDigest.digest());
    }

    private String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < length; i4++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i4])));
        }
        return stringBuffer.toString();
    }
}
