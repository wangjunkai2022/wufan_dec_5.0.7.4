package com.aggmoread.sdk.z.c.a.a.e;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class j {
    public static Object a(Class cls, Object obj, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e5) {
            e.b("XXXXX", "err " + e5.getMessage());
            return null;
        }
    }

    public static Object a(Class cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj != null) {
            try {
                Method method = clsArr != null ? cls.getMethod(str, clsArr) : cls.getMethod(str, new Class[0]);
                method.setAccessible(true);
                return method.invoke(obj, objArr);
            } catch (Exception e5) {
                e.b("XXXXX", "invoke method err " + e5.getMessage());
                return null;
            }
        }
        return null;
    }

    public static Object a(Class cls, String str) {
        try {
            return cls.getField(str).get(null);
        } catch (Exception e5) {
            e.b("XXXXX", "static err " + e5.getMessage());
            return null;
        }
    }

    public static Object a(Object obj, Class cls) {
        Field[] fields;
        try {
            for (Field field : obj.getClass().getFields()) {
                Class<?> type = field.getType();
                e.b("XXXXX", "field type " + type);
                if (type == cls) {
                    field.setAccessible(true);
                    return field.get(obj);
                }
            }
            return null;
        } catch (Exception e5) {
            e.b("XXXXX", "err " + e5.getMessage());
            return null;
        }
    }

    public static Object a(Object obj, String str) {
        try {
            return a(obj.getClass(), obj, str);
        } catch (Exception e5) {
            e.b("XXXXX", "err " + e5.getMessage());
            return null;
        }
    }

    public static Object a(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj != null) {
            try {
                return a(obj.getClass(), obj, str, clsArr, objArr);
            } catch (Exception e5) {
                e.b("XXXXX", "invoke method err " + e5.getMessage());
                return null;
            }
        }
        return null;
    }

    public static Method a(Object obj, String str, Class<?>... clsArr) {
        if (obj != null) {
            try {
                return obj.getClass().getMethod(str, clsArr);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static void a(Class cls, Object obj, String str, String str2) {
        Field[] declaredFields;
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            e.b("XXXXX", "dumpDeclaredFields ");
            if (cls == null) {
                try {
                    cls = obj.getClass();
                } catch (Exception e5) {
                    e.b("XXXXX", "dump field err " + e5.getMessage());
                    return;
                }
            }
            if (TextUtils.isEmpty(str) || cls.getName().contains(str)) {
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    e.b("XXXXX", " Declared field_" + str2 + " : " + field.getName() + ", field " + field.get(obj));
                }
            }
        }
    }

    public static void a(Object obj, String str, String str2) {
        a((Class) null, obj, str, str2);
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object b(Class cls, Object obj, String str) {
        return a(cls, obj, str, null, new Object[0]);
    }

    public static Object b(Object obj, String str) {
        try {
            Field field = obj.getClass().getField(str);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e5) {
            e.b("XXXXX", "err " + e5.getMessage());
            return null;
        }
    }

    public static void b(Object obj, String str, String str2) {
        Field[] fields;
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            try {
                Class<?> cls = obj.getClass();
                if (TextUtils.isEmpty(str) || cls.getName().contains(str)) {
                    for (Field field : cls.getFields()) {
                        field.setAccessible(true);
                        e.b("XXXXX", " field_" + str2 + " : " + field.getName() + ", field " + field.get(obj));
                    }
                }
            } catch (Exception e5) {
                e.b("XXXXX", "dump field err " + e5.getMessage());
            }
        }
    }
}
