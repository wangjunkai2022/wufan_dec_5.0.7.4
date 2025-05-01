package org.aspectj.lang.reflect;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: AjTypeSystem.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class, WeakReference<c>> f72216a = Collections.synchronizedMap(new WeakHashMap());

    public static <T> c<T> a(Class<T> cls) {
        WeakReference<c> weakReference = f72216a.get(cls);
        if (weakReference != null) {
            c<T> cVar = weakReference.get();
            if (cVar != null) {
                return cVar;
            }
            org.aspectj.internal.lang.reflect.b bVar = new org.aspectj.internal.lang.reflect.b(cls);
            f72216a.put(cls, new WeakReference<>(bVar));
            return bVar;
        }
        org.aspectj.internal.lang.reflect.b bVar2 = new org.aspectj.internal.lang.reflect.b(cls);
        f72216a.put(cls, new WeakReference<>(bVar2));
        return bVar2;
    }
}
