package external.org.apache.commons.lang3.reflect;

import external.org.apache.commons.lang3.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
/* compiled from: MemberUtils.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f68987a = 7;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f68988b = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    public static int a(Class<?>[] clsArr, Class<?>[] clsArr2, Class<?>[] clsArr3) {
        float d5 = d(clsArr3, clsArr);
        float d6 = d(clsArr3, clsArr2);
        if (d5 < d6) {
            return -1;
        }
        return d6 < d5 ? 1 : 0;
    }

    private static float b(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return c(cls, cls2);
        }
        float f5 = 0.0f;
        while (true) {
            if (cls != null && !cls2.equals(cls)) {
                if (cls2.isInterface() && d.A(cls, cls2)) {
                    f5 += 0.25f;
                    break;
                }
                f5 += 1.0f;
                cls = cls.getSuperclass();
            } else {
                break;
            }
        }
        return cls == null ? f5 + 1.5f : f5;
    }

    private static float c(Class<?> cls, Class<?> cls2) {
        float f5;
        if (cls.isPrimitive()) {
            f5 = 0.0f;
        } else {
            cls = d.L(cls);
            f5 = 0.1f;
        }
        int i4 = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = f68988b;
            if (i4 >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i4]) {
                f5 += 0.1f;
                if (i4 < clsArr.length - 1) {
                    cls = clsArr[i4 + 1];
                }
            }
            i4++;
        }
        return f5;
    }

    private static float d(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f5 = 0.0f;
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            f5 += b(clsArr[i4], clsArr2[i4]);
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }

    static boolean f(int i4) {
        return (i4 & 7) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(AccessibleObject accessibleObject) {
        if (accessibleObject == null || accessibleObject.isAccessible()) {
            return;
        }
        Member member = (Member) accessibleObject;
        if (Modifier.isPublic(member.getModifiers()) && f(member.getDeclaringClass().getModifiers())) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException unused) {
            }
        }
    }
}
