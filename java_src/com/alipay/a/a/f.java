package com.alipay.a.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static List<j> f4510a;

    static {
        ArrayList arrayList = new ArrayList();
        f4510a = arrayList;
        arrayList.add(new l());
        f4510a.add(new d());
        f4510a.add(new c());
        f4510a.add(new h());
        f4510a.add(new b());
        f4510a.add(new a());
        f4510a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b5 = b(obj);
        if (i.a.b(b5.getClass())) {
            return org.json.alipay.c.c(b5.toString());
        }
        if (Collection.class.isAssignableFrom(b5.getClass())) {
            return new org.json.alipay.b((Collection) ((List) b5)).toString();
        }
        if (Map.class.isAssignableFrom(b5.getClass())) {
            return new org.json.alipay.c((Map) b5).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + b5.getClass());
    }

    public static Object b(Object obj) {
        Object a5;
        if (obj == null) {
            return null;
        }
        for (j jVar : f4510a) {
            if (jVar.a(obj.getClass()) && (a5 = jVar.a(obj)) != null) {
                return a5;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
