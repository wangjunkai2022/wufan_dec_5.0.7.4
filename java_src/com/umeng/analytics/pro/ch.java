package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FieldMetaData.java */
/* loaded from: classes6.dex */
public class ch implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    private static Map<Class<? extends bv>, Map<? extends cc, ch>> f63566d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f63567a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f63568b;

    /* renamed from: c  reason: collision with root package name */
    public final ci f63569c;

    public ch(String str, byte b5, ci ciVar) {
        this.f63567a = str;
        this.f63568b = b5;
        this.f63569c = ciVar;
    }

    public static void a(Class<? extends bv> cls, Map<? extends cc, ch> map) {
        f63566d.put(cls, map);
    }

    public static Map<? extends cc, ch> a(Class<? extends bv> cls) {
        if (!f63566d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e5.getMessage());
            } catch (InstantiationException e6) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e6.getMessage());
            }
        }
        return f63566d.get(cls);
    }
}
