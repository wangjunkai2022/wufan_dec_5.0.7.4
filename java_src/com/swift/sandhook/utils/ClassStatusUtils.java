package com.swift.sandhook.utils;

import com.swift.sandhook.SandHookConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public class ClassStatusUtils {
    static Field fieldStatusOfClass;

    static {
        try {
            Field declaredField = Class.class.getDeclaredField("status");
            fieldStatusOfClass = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public static int getClassStatus(Class cls, boolean z4) {
        int i4 = 0;
        if (cls == null) {
            return 0;
        }
        try {
            i4 = fieldStatusOfClass.getInt(cls);
        } catch (Throwable unused) {
        }
        return z4 ? (int) (toUnsignedLong(i4) >> 28) : i4;
    }

    public static boolean isInitialized(Class cls) {
        if (fieldStatusOfClass == null) {
            return true;
        }
        return SandHookConfig.SDK_INT >= 30 ? getClassStatus(cls, true) >= 14 : SandHookConfig.SDK_INT >= 28 ? getClassStatus(cls, true) == 14 : SandHookConfig.SDK_INT == 27 ? getClassStatus(cls, false) == 11 : getClassStatus(cls, false) == 10;
    }

    public static boolean isStaticAndNoInited(Member member) {
        if (member instanceof Method) {
            return Modifier.isStatic(member.getModifiers()) && !isInitialized(member.getDeclaringClass());
        }
        return false;
    }

    public static long toUnsignedLong(int i4) {
        return i4 & 4294967295L;
    }
}
