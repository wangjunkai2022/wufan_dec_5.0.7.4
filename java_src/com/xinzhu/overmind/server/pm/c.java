package com.xinzhu.overmind.server.pm;

import java.util.AbstractSet;
import java.util.Iterator;
/* compiled from: FastImmutableArraySet.java */
/* loaded from: classes.dex */
public final class c<T> extends AbstractSet<T> {

    /* renamed from: b  reason: collision with root package name */
    a<T> f68171b;

    /* renamed from: c  reason: collision with root package name */
    T[] f68172c;

    /* compiled from: FastImmutableArraySet.java */
    /* loaded from: classes6.dex */
    private static final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T[] f68173b;

        /* renamed from: c  reason: collision with root package name */
        int f68174c;

        public a(T[] tArr) {
            this.f68173b = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f68174c != this.f68173b.length;
        }

        @Override // java.util.Iterator
        public T next() {
            T[] tArr = this.f68173b;
            int i4 = this.f68174c;
            this.f68174c = i4 + 1;
            return tArr[i4];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public c(T[] tArr) {
        this.f68172c = tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        a<T> aVar = this.f68171b;
        if (aVar == null) {
            a<T> aVar2 = new a<>(this.f68172c);
            this.f68171b = aVar2;
            return aVar2;
        }
        aVar.f68174c = 0;
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f68172c.length;
    }
}
