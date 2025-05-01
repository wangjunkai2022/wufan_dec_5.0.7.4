package com.zhy.view.flowlayout;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: TagAdapter.java */
/* loaded from: classes6.dex */
public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private List<T> f68649a;

    /* renamed from: b  reason: collision with root package name */
    private a f68650b;

    /* renamed from: c  reason: collision with root package name */
    private HashSet<Integer> f68651c = new HashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TagAdapter.java */
    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    public b(List<T> list) {
        this.f68649a = list;
    }

    public int a() {
        List<T> list = this.f68649a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T b(int i4) {
        return this.f68649a.get(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashSet<Integer> c() {
        return this.f68651c;
    }

    public abstract View d(FlowLayout flowLayout, int i4, T t4);

    public void e() {
        this.f68650b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a aVar) {
        this.f68650b = aVar;
    }

    public boolean g(int i4, T t4) {
        return false;
    }

    public void h(Set<Integer> set) {
        this.f68651c.clear();
        if (set != null) {
            this.f68651c.addAll(set);
        }
        e();
    }

    public void i(int... iArr) {
        for (int i4 : iArr) {
            this.f68651c.add(Integer.valueOf(i4));
        }
        e();
    }

    public b(T[] tArr) {
        this.f68649a = new ArrayList(Arrays.asList(tArr));
    }
}
