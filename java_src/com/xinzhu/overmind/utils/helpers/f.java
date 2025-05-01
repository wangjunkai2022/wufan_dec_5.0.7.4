package com.xinzhu.overmind.utils.helpers;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.lang.reflect.Array;
/* compiled from: DefaultNegativeResultHelper.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f68332a = "f";

    public static <T> Object a(Class<T> cls) {
        String name = cls.getName();
        if (name.equals("java.lang.Void") || name.equals("void")) {
            return null;
        }
        if (!name.equals("java.lang.Boolean") && !name.equals("boolean")) {
            if (!Number.class.isAssignableFrom(cls) && !name.equals(MethodReflectParams.BYTE) && !name.equals(MethodReflectParams.SHORT) && !name.equals(MethodReflectParams.INT) && !name.equals(MethodReflectParams.LONG) && !name.equals("float") && !name.equals(MethodReflectParams.DOUBLE)) {
                if (cls.isArray()) {
                    return Array.newInstance(cls.getComponentType(), 0);
                }
                return null;
            }
            return 0;
        }
        return Boolean.FALSE;
    }
}
