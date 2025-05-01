package io.netty.channel.group;

import io.netty.util.internal.ObjectUtil;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes6.dex */
final class CombinedIterator<E> implements Iterator<E> {
    private Iterator<E> currentIterator;

    /* renamed from: i1  reason: collision with root package name */
    private final Iterator<E> f69186i1;

    /* renamed from: i2  reason: collision with root package name */
    private final Iterator<E> f69187i2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CombinedIterator(Iterator<E> it2, Iterator<E> it3) {
        this.f69186i1 = (Iterator) ObjectUtil.checkNotNull(it2, "i1");
        this.f69187i2 = (Iterator) ObjectUtil.checkNotNull(it3, "i2");
        this.currentIterator = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (!this.currentIterator.hasNext()) {
            if (this.currentIterator != this.f69186i1) {
                return false;
            }
            this.currentIterator = this.f69187i2;
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        while (true) {
            try {
                return this.currentIterator.next();
            } catch (NoSuchElementException e5) {
                if (this.currentIterator != this.f69186i1) {
                    throw e5;
                }
                this.currentIterator = this.f69187i2;
            }
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        this.currentIterator.remove();
    }
}
