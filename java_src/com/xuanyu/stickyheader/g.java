package com.xuanyu.stickyheader;

import com.xuanyu.stickyheader.d;
import java.io.PrintStream;
import java.util.HashMap;
/* compiled from: StickyHeaderModelPool.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Class<a<?>>, d.c<a<?>>> f68453a = new HashMap<>();

    public static a<?> a(Class<a<?>> cls) {
        HashMap<Class<a<?>>, d.c<a<?>>> hashMap = f68453a;
        if (hashMap.get(cls) == null) {
            hashMap.put(cls, new d.c<>(50));
        }
        a<?> acquire = hashMap.get(cls).acquire();
        if (acquire != null) {
            return acquire;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InstantiationException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static void b(a<?> aVar) {
        Class<?> cls = aVar.getClass();
        PrintStream printStream = System.out;
        printStream.println("StickyHeaderModelPool -- recycle " + cls);
        HashMap<Class<a<?>>, d.c<a<?>>> hashMap = f68453a;
        if (hashMap.get(cls) == null) {
            return;
        }
        hashMap.get(cls).release(aVar);
    }
}
