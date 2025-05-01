package com.xinzhu.overmind.utils.helpers;

import java.util.Arrays;
import java.util.HashSet;
/* compiled from: InterfaceHelper.java */
/* loaded from: classes.dex */
public class g {
    public static Class<?>[] a(Class<?> cls) {
        if (cls == null) {
            return new Class[0];
        }
        HashSet hashSet = new HashSet(Arrays.asList(cls.getInterfaces()));
        while (cls.getSuperclass() != Object.class && (cls = cls.getSuperclass()) != null) {
            hashSet.addAll(Arrays.asList(cls.getInterfaces()));
        }
        Class<?>[] clsArr = new Class[hashSet.size()];
        hashSet.toArray(clsArr);
        return clsArr;
    }
}
