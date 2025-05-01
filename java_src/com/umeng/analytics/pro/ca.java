package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;
/* compiled from: TEnumHelper.java */
/* loaded from: classes6.dex */
public class ca {
    public static bz a(Class<? extends bz> cls, int i4) {
        try {
            return (bz) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i4));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
