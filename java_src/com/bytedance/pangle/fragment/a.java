package com.bytedance.pangle.fragment;

import androidx.collection.SimpleArrayMap;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Field;
/* loaded from: classes2.dex */
final class a {
    public static void a(Class cls) {
        try {
            if (Fragment.class.getName().contains("support")) {
                ((SimpleArrayMap) a(Fragment.class, "sClassMap").get(null)).put(cls.getName(), cls);
                return;
            }
            Field a5 = a(Fragment.class, "sClassMap");
            if (a5 != null) {
                ((SimpleArrayMap) a5.get(null)).put(cls.getName(), cls);
                return;
            }
            Class a6 = a("androidx.fragment.app.FragmentFactory");
            if (a6 == null) {
                return;
            }
            Field a7 = a(a6, "sClassMap");
            if (a7 != null) {
                ((SimpleArrayMap) a7.get(null)).put(cls.getName(), cls);
                return;
            }
            Field a8 = a(a6, "sClassCacheMap");
            if (a8 != null) {
                SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                simpleArrayMap.put(cls.getName(), cls);
                ((SimpleArrayMap) a8.get(null)).put(cls.getClassLoader(), simpleArrayMap);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static Field a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
