package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: CountingLruMap.java */
@ThreadSafe
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final v<V> f11649a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<K, V> f11650b = new LinkedHashMap<>();
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private int f11651c = 0;

    public g(v<V> vVar) {
        this.f11649a = vVar;
    }

    private int i(V v2) {
        if (v2 == null) {
            return 0;
        }
        return this.f11649a.a(v2);
    }

    public synchronized ArrayList<V> a() {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>((Collection<? extends V>) this.f11650b.values());
        this.f11650b.clear();
        this.f11651c = 0;
        return arrayList;
    }

    public synchronized boolean b(K k4) {
        return this.f11650b.containsKey(k4);
    }

    @Nullable
    public synchronized V c(K k4) {
        return this.f11650b.get(k4);
    }

    public synchronized int d() {
        return this.f11650b.size();
    }

    @Nullable
    public synchronized K e() {
        return this.f11650b.isEmpty() ? null : this.f11650b.keySet().iterator().next();
    }

    @VisibleForTesting
    synchronized ArrayList<K> f() {
        return new ArrayList<>(this.f11650b.keySet());
    }

    public synchronized ArrayList<Map.Entry<K, V>> g(@Nullable com.facebook.common.internal.i<K> iVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f11650b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f11650b.entrySet()) {
            if (iVar == null || iVar.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public synchronized int h() {
        return this.f11651c;
    }

    @VisibleForTesting
    synchronized ArrayList<V> j() {
        return new ArrayList<>((Collection<? extends V>) this.f11650b.values());
    }

    @Nullable
    public synchronized V k(K k4, V v2) {
        V remove;
        remove = this.f11650b.remove(k4);
        this.f11651c -= i(remove);
        this.f11650b.put(k4, v2);
        this.f11651c += i(v2);
        return remove;
    }

    @Nullable
    public synchronized V l(K k4) {
        V remove;
        remove = this.f11650b.remove(k4);
        this.f11651c -= i(remove);
        return remove;
    }

    public synchronized ArrayList<V> m(@Nullable com.facebook.common.internal.i<K> iVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it2 = this.f11650b.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (iVar == null || iVar.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f11651c -= i(next.getValue());
                it2.remove();
            }
        }
        return arrayList;
    }
}
