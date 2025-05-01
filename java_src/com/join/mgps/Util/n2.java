package com.join.mgps.Util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.util.LinkedMultiValueMap;
/* compiled from: TypeUtil.java */
/* loaded from: classes3.dex */
public class n2 {

    /* compiled from: TypeUtil.java */
    /* loaded from: classes3.dex */
    private class a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f27953a;

        /* renamed from: b  reason: collision with root package name */
        private String f27954b;

        /* renamed from: c  reason: collision with root package name */
        private String f27955c;

        /* renamed from: d  reason: collision with root package name */
        private String f27956d;

        /* renamed from: e  reason: collision with root package name */
        private String f27957e;

        /* renamed from: f  reason: collision with root package name */
        private String f27958f;

        /* renamed from: g  reason: collision with root package name */
        private String f27959g;

        public a() {
        }

        public a(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f27953a = num;
            this.f27954b = str;
            this.f27955c = str2;
            this.f27956d = str3;
            this.f27957e = str4;
            this.f27958f = str5;
            this.f27959g = str6;
        }
    }

    private static String a(String str, Object obj, List list) {
        int i4;
        StringBuffer stringBuffer = new StringBuffer("");
        int i5 = 0;
        if (obj.getClass().isArray()) {
            if (Array.getLength(obj) > 0) {
                while (i5 < Array.getLength(obj)) {
                    Object obj2 = Array.get(obj, i5);
                    stringBuffer.append(i(str + "[" + i5 + "]", obj2, list));
                    i5++;
                }
            } else {
                stringBuffer.append(str + "[]: empty\n");
            }
        } else {
            boolean z4 = obj instanceof Collection;
            boolean z5 = obj instanceof Hashtable;
            boolean z6 = obj instanceof HashMap;
            boolean z7 = obj instanceof HashSet;
            if ((obj instanceof AbstractMap) || z6 || z5) {
                Map map = (Map) obj;
                Set keySet = map.keySet();
                if (keySet.size() > 0) {
                    for (Object obj3 : keySet) {
                        Object obj4 = map.get(obj3);
                        stringBuffer.append(i(str + "[" + obj3 + "]", obj4, list));
                    }
                } else {
                    stringBuffer.append(str + "[]: empty\n");
                }
            } else if (z4 || z7) {
                Iterator it2 = null;
                if (z4) {
                    Collection collection = (Collection) obj;
                    it2 = collection.iterator();
                    i4 = collection.size();
                } else if (z5) {
                    Hashtable hashtable = (Hashtable) obj;
                    it2 = hashtable.values().iterator();
                    i4 = hashtable.size();
                } else if (z7) {
                    HashSet hashSet = (HashSet) obj;
                    it2 = hashSet.iterator();
                    i4 = hashSet.size();
                } else if (z6) {
                    HashMap hashMap = (HashMap) obj;
                    it2 = hashMap.values().iterator();
                    i4 = hashMap.size();
                } else {
                    i4 = 0;
                }
                if (i4 > 0) {
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        stringBuffer.append(i(str + "[" + i5 + "]", next, list));
                        i5++;
                    }
                } else {
                    stringBuffer.append(str + "[]: empty\n");
                }
            }
        }
        return stringBuffer.toString();
    }

    private static String b(String str, Object obj, List list) {
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                f(cls.getDeclaredFields(), str, obj, stringBuffer, list);
            }
        } catch (IllegalAccessException e5) {
            stringBuffer.append(e5.toString());
        }
        return stringBuffer.toString();
    }

    public static boolean c(Object obj) {
        return obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Hashtable) || (obj instanceof HashMap) || (obj instanceof HashSet) || (obj instanceof List) || (obj instanceof AbstractMap);
    }

    public static boolean d(Object obj) {
        Class<?> cls;
        return ((obj instanceof Boolean) || (obj instanceof Short) || (obj instanceof Byte) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof String) || (cls = obj.getClass()) == Boolean.TYPE || cls == Boolean.class || cls == Short.TYPE || cls == Short.class || cls == Byte.TYPE || cls == Byte.class || cls == Integer.TYPE || cls == Integer.class || cls == Long.TYPE || cls == Long.class || cls == Float.TYPE || cls == Float.class || cls == Character.TYPE || cls == Character.class || cls == Double.TYPE || cls == Double.class || cls == String.class) ? false : true;
    }

    private static void e(String[] strArr) {
        System.out.println(h("test", new a(12, "广西大学西校园10栋204 宿舍", "云守护", "我在参加信息安全大赛呢", "2012-5-19", "1", "100")));
    }

    private static void f(Field[] fieldArr, String str, Object obj, StringBuffer stringBuffer, List list) throws IllegalAccessException {
        for (int i4 = 0; i4 < fieldArr.length; i4++) {
            if (!fieldArr[i4].getName().equals("__discriminator") && !fieldArr[i4].getName().equals("__uninitialized")) {
                fieldArr[i4].setAccessible(true);
                if (!Modifier.isStatic(fieldArr[i4].getModifiers())) {
                    stringBuffer.append(i(str + h0.f27805a + fieldArr[i4].getName(), fieldArr[i4].get(obj), list));
                }
            }
        }
    }

    public static LinkedMultiValueMap<String, String> g(String str, Object obj) {
        if (obj == null || c(obj)) {
            return null;
        }
        d(obj);
        return null;
    }

    public static String h(String str, Object obj) {
        if (obj == null) {
            return str + ": null\n";
        } else if (c(obj)) {
            return a(str, obj, new ArrayList());
        } else {
            if (d(obj)) {
                return b(str, obj, new ArrayList());
            }
            return str + ": " + obj.toString() + "\n\r";
        }
    }

    private static String i(String str, Object obj, List list) {
        if (obj == null) {
            return str + ": null\n";
        } else if (c(obj)) {
            return a(str, obj, list);
        } else {
            if (d(obj)) {
                if (!list.contains(obj)) {
                    list.add(obj);
                    return b(str, obj, list);
                }
                return str + ": <already visited>\n";
            }
            return str + ": " + obj.toString() + "\n";
        }
    }
}
