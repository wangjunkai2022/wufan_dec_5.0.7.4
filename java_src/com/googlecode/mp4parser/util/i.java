package com.googlecode.mp4parser.util;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: LazyList.java */
/* loaded from: classes3.dex */
public class i<E> extends AbstractList<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final j f14229d = j.a(i.class);

    /* renamed from: b  reason: collision with root package name */
    List<E> f14230b;

    /* renamed from: c  reason: collision with root package name */
    Iterator<E> f14231c;

    /* compiled from: LazyList.java */
    /* loaded from: classes3.dex */
    class a implements Iterator<E> {

        /* renamed from: b  reason: collision with root package name */
        int f14232b = 0;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14232b < i.this.f14230b.size() || i.this.f14231c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f14232b < i.this.f14230b.size()) {
                List<E> list = i.this.f14230b;
                int i4 = this.f14232b;
                this.f14232b = i4 + 1;
                return list.get(i4);
            }
            i iVar = i.this;
            iVar.f14230b.add(iVar.f14231c.next());
            return (E) next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public i(List<E> list, Iterator<E> it2) {
        this.f14230b = list;
        this.f14231c = it2;
    }

    private void a() {
        f14229d.b("blowup running");
        while (this.f14231c.hasNext()) {
            this.f14230b.add(this.f14231c.next());
        }
    }

    public List<E> b() {
        return this.f14230b;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        if (this.f14230b.size() > i4) {
            return this.f14230b.get(i4);
        }
        if (this.f14231c.hasNext()) {
            this.f14230b.add(this.f14231c.next());
            return get(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        f14229d.b("potentially expensive size() call");
        a();
        return this.f14230b.size();
    }
}
