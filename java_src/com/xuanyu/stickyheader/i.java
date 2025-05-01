package com.xuanyu.stickyheader;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
/* compiled from: StickyHeaderRegistry.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<RecyclerView, HashSet<Class>> f68456a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<Class, Class> f68457b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static HashSet<Class> f68458c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private static WeakHashMap<RecyclerView, HashMap<Class, View>> f68459d = new WeakHashMap<>();

    public static <T> Class<? extends a<T>> a(Class<T> cls) {
        return f68457b.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View b(RecyclerView recyclerView, Class cls) {
        if (f68459d.get(recyclerView) == null) {
            return null;
        }
        return f68459d.get(recyclerView).get(cls);
    }

    public static boolean c(Class cls) {
        return f68458c.contains(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(RecyclerView recyclerView, Class cls, View view) {
        HashMap<Class, View> hashMap = f68459d.get(recyclerView);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            f68459d.put(recyclerView, hashMap);
        }
        hashMap.put(cls, view);
    }

    public static void f(RecyclerView recyclerView, Class cls) {
        HashSet<Class> hashSet = f68456a.get(recyclerView);
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        hashSet.add(cls);
    }

    public static <T> void g(Class<T> cls) {
        f68458c.add(cls);
    }

    public static <T> void h(Class<T> cls, Class<? extends a<T>> cls2) {
        f68457b.put(cls, cls2);
    }

    public boolean d(RecyclerView recyclerView, Class cls) {
        return f68456a.get(recyclerView) != null && f68456a.get(recyclerView).contains(cls);
    }
}
