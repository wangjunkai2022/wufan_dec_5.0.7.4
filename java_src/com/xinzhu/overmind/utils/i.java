package com.xinzhu.overmind.utils;

import java.util.AbstractSet;
import java.util.Iterator;
/* compiled from: FastImmutableArraySet.java */
/* loaded from: classes6.dex */
public final class i<T> extends AbstractSet<T> {

    /* renamed from: b  reason: collision with root package name */
    a<T> f68348b;

    /* renamed from: c  reason: collision with root package name */
    T[] f68349c;

    /* compiled from: FastImmutableArraySet.java */
    /* loaded from: classes6.dex */
    private static final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T[] f68350b;

        /* renamed from: c  reason: collision with root package name */
        int f68351c;

        public a(T[] tArr) {
            this.f68350b = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f68351c != this.f68350b.length;
        }

        @Override // java.util.Iterator
        public T next() {
            T[] tArr = this.f68350b;
            int i4 = this.f68351c;
            this.f68351c = i4 + 1;
            return tArr[i4];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public i(T[] tArr) {
        this.f68349c = tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        a<T> aVar = this.f68348b;
        if (aVar == null) {
            a<T> aVar2 = new a<>(this.f68349c);
            this.f68348b = aVar2;
            return aVar2;
        }
        aVar.f68351c = 0;
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f68349c.length;
    }
}
