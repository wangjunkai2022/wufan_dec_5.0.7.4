package com.alipay.a.a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    static List<i> f4509a;

    static {
        ArrayList arrayList = new ArrayList();
        f4509a = arrayList;
        arrayList.add(new l());
        f4509a.add(new d());
        f4509a.add(new c());
        f4509a.add(new h());
        f4509a.add(new k());
        f4509a.add(new b());
        f4509a.add(new a());
        f4509a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t4;
        for (i iVar : f4509a) {
            if (iVar.a(i.a.a(type)) && (t4 = (T) iVar.b(obj, type)) != null) {
                return t4;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object cVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            cVar = new org.json.alipay.b(trim);
        } else if (!trim.startsWith("{") || !trim.endsWith("}")) {
            return a(trim, type);
        } else {
            cVar = new org.json.alipay.c(trim);
        }
        return a(cVar, type);
    }
}
