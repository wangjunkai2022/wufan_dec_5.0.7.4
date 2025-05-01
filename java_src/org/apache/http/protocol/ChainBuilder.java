package org.apache.http.protocol;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.http.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes7.dex */
final class ChainBuilder<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private final Map<Class<?>, E> uniqueClasses = new HashMap();

    private void ensureUnique(E e5) {
        E remove = this.uniqueClasses.remove(e5.getClass());
        if (remove != null) {
            this.list.remove(remove);
        }
        this.uniqueClasses.put(e5.getClass(), e5);
    }

    public ChainBuilder<E> addAllFirst(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        for (E e5 : collection) {
            addFirst(e5);
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        for (E e5 : collection) {
            addLast(e5);
        }
        return this;
    }

    public ChainBuilder<E> addFirst(E e5) {
        if (e5 == null) {
            return this;
        }
        ensureUnique(e5);
        this.list.addFirst(e5);
        return this;
    }

    public ChainBuilder<E> addLast(E e5) {
        if (e5 == null) {
            return this;
        }
        ensureUnique(e5);
        this.list.addLast(e5);
        return this;
    }

    public LinkedList<E> build() {
        return new LinkedList<>(this.list);
    }

    public ChainBuilder<E> addAllFirst(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e5 : eArr) {
            addFirst(e5);
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e5 : eArr) {
            addLast(e5);
        }
        return this;
    }
}
