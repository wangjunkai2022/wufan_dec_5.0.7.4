package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ListBuilder.kt */
/* loaded from: classes.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    @NotNull
    private E[] array;
    @Nullable
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    @Nullable
    private final ListBuilder<E> root;

    /* compiled from: ListBuilder.kt */
    @SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    /* loaded from: classes6.dex */
    private static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        private int index;
        private int lastIndex;
        @NotNull
        private final ListBuilder<E> list;

        public Itr(@NotNull ListBuilder<E> list, int i4) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i4;
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            ListBuilder<E> listBuilder = this.list;
            int i4 = this.index;
            this.index = i4 + 1;
            listBuilder.add(i4, e5);
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.index < ((ListBuilder) this.list).length) {
                int i4 = this.index;
                this.index = i4 + 1;
                this.lastIndex = i4;
                return (E) ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i4 = this.index;
            if (i4 > 0) {
                int i5 = i4 - 1;
                this.index = i5;
                this.lastIndex = i5;
                return (E) ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i4 = this.lastIndex;
            if (i4 != -1) {
                this.list.remove(i4);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            int i4 = this.lastIndex;
            if (i4 != -1) {
                this.list.set(i4, e5);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private ListBuilder(E[] eArr, int i4, int i5, boolean z4, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i4;
        this.length = i5;
        this.isReadOnly = z4;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    private final void addAllInternal(int i4, Collection<? extends E> collection, int i5) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAllInternal(i4, collection, i5);
            this.array = this.backing.array;
            this.length += i5;
            return;
        }
        insertAtInternal(i4, i5);
        Iterator<? extends E> it2 = collection.iterator();
        for (int i6 = 0; i6 < i5; i6++) {
            this.array[i4 + i6] = it2.next();
        }
    }

    private final void addAtInternal(int i4, E e5) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAtInternal(i4, e5);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        insertAtInternal(i4, 1);
        this.array[i4] = e5;
    }

    private final void checkIsMutable() {
        if (isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        boolean subarrayContentEquals;
        subarrayContentEquals = ListBuilderKt.subarrayContentEquals(this.array, this.offset, this.length, list);
        return subarrayContentEquals;
    }

    private final void ensureCapacity(int i4) {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        if (i4 >= 0) {
            E[] eArr = this.array;
            if (i4 > eArr.length) {
                this.array = (E[]) ListBuilderKt.copyOfUninitializedElements(this.array, ArrayDeque.Companion.newCapacity$kotlin_stdlib(eArr.length, i4));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void ensureExtraCapacity(int i4) {
        ensureCapacity(this.length + i4);
    }

    private final void insertAtInternal(int i4, int i5) {
        ensureExtraCapacity(i5);
        E[] eArr = this.array;
        ArraysKt.copyInto(eArr, eArr, i4 + i5, i4, this.offset + this.length);
        this.length += i5;
    }

    private final boolean isEffectivelyReadOnly() {
        ListBuilder<E> listBuilder;
        return this.isReadOnly || ((listBuilder = this.root) != null && listBuilder.isReadOnly);
    }

    private final E removeAtInternal(int i4) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.removeAtInternal(i4);
        }
        E[] eArr = this.array;
        E e5 = eArr[i4];
        ArraysKt.copyInto(eArr, eArr, i4, i4 + 1, this.offset + this.length);
        ListBuilderKt.resetAt(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e5;
    }

    private final void removeRangeInternal(int i4, int i5) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.removeRangeInternal(i4, i5);
        } else {
            E[] eArr = this.array;
            ArraysKt.copyInto(eArr, eArr, i4, i4 + i5, this.length);
            E[] eArr2 = this.array;
            int i6 = this.length;
            ListBuilderKt.resetRange(eArr2, i6 - i5, i6);
        }
        this.length -= i5;
    }

    private final int retainOrRemoveAllInternal(int i4, int i5, Collection<? extends E> collection, boolean z4) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int retainOrRemoveAllInternal = listBuilder.retainOrRemoveAllInternal(i4, i5, collection, z4);
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i4 + i6;
            if (collection.contains(this.array[i8]) == z4) {
                E[] eArr = this.array;
                i6++;
                eArr[i7 + i4] = eArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i5 - i7;
        E[] eArr2 = this.array;
        ArraysKt.copyInto(eArr2, eArr2, i4 + i7, i5 + i4, this.length);
        E[] eArr3 = this.array;
        int i10 = this.length;
        ListBuilderKt.resetRange(eArr3, i10 - i9, i10);
        this.length -= i9;
        return i9;
    }

    private final Object writeReplace() {
        if (isEffectivelyReadOnly()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        checkIsMutable();
        addAtInternal(this.offset + this.length, e5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.offset + this.length, elements, size);
        return size > 0;
    }

    @NotNull
    public final List<E> build() {
        if (this.backing == null) {
            checkIsMutable();
            this.isReadOnly = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, this.length);
        return this.array[this.offset + i4];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int subarrayContentHashCode;
        subarrayContentHashCode = ListBuilderKt.subarrayContentHashCode(this.array, this.offset, this.length);
        return subarrayContentHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i4 = 0; i4 < this.length; i4++) {
            if (Intrinsics.areEqual(this.array[this.offset + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new Itr(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i4 = this.length - 1; i4 >= 0; i4--) {
            if (Intrinsics.areEqual(this.array[this.offset + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new Itr(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i4) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, this.length);
        return removeAtInternal(this.offset + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i4, E e5) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, this.length);
        E[] eArr = this.array;
        int i5 = this.offset;
        E e6 = eArr[i5 + i4];
        eArr[i5 + i4] = e5;
        return e6;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i4, int i5) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, this.length);
        E[] eArr = this.array;
        int i6 = this.offset + i4;
        int i7 = i5 - i4;
        boolean z4 = this.isReadOnly;
        ListBuilder<E> listBuilder = this.root;
        return new ListBuilder(eArr, i6, i7, z4, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        int length = destination.length;
        int i4 = this.length;
        if (length < i4) {
            E[] eArr = this.array;
            int i5 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i5, i4 + i5, destination.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.array;
        int i6 = this.offset;
        ArraysKt.copyInto(eArr2, destination, 0, i6, i4 + i6);
        int length2 = destination.length;
        int i7 = this.length;
        if (length2 > i7) {
            destination[i7] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        String subarrayContentToString;
        subarrayContentToString = ListBuilderKt.subarrayContentToString(this.array, this.offset, this.length);
        return subarrayContentToString;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i4) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i4, this.length);
        return new Itr(this, i4);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i4, E e5) {
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i4, this.length);
        addAtInternal(this.offset + i4, e5);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i4, this.length);
        int size = elements.size();
        addAllInternal(this.offset + i4, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        E[] eArr = this.array;
        int i4 = this.offset;
        return ArraysKt.copyOfRange(eArr, i4, this.length + i4);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i4) {
        this(ListBuilderKt.arrayOfUninitializedElements(i4), 0, 0, false, null, null);
    }
}
