package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ArrayDeque.kt */
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
/* loaded from: classes6.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private static final int maxArraySize = 2147483639;
    @NotNull
    private Object[] elementData;
    private int head;
    private int size;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Object[] emptyElementData = new Object[0];

    /* compiled from: ArrayDeque.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int newCapacity$kotlin_stdlib(int i4, int i5) {
            int i6 = i4 + (i4 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - ArrayDeque.maxArraySize > 0) {
                if (i5 > ArrayDeque.maxArraySize) {
                    return Integer.MAX_VALUE;
                }
                return ArrayDeque.maxArraySize;
            }
            return i6;
        }
    }

    public ArrayDeque(int i4) {
        Object[] objArr;
        if (i4 == 0) {
            objArr = emptyElementData;
        } else if (i4 > 0) {
            objArr = new Object[i4];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i4);
        }
        this.elementData = objArr;
    }

    private final void copyCollectionElements(int i4, Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        int length = this.elementData.length;
        while (i4 < length && it2.hasNext()) {
            this.elementData[i4] = it2.next();
            i4++;
        }
        int i5 = this.head;
        for (int i6 = 0; i6 < i5 && it2.hasNext(); i6++) {
            this.elementData[i6] = it2.next();
        }
        this.size = size() + collection.size();
    }

    private final void copyElements(int i4) {
        Object[] objArr = new Object[i4];
        Object[] objArr2 = this.elementData;
        ArraysKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i5 = this.head;
        ArraysKt.copyInto(objArr3, objArr, length - i5, 0, i5);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i4) {
        return i4 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : i4 - 1;
    }

    private final void ensureCapacity(int i4) {
        int coerceAtLeast;
        if (i4 >= 0) {
            Object[] objArr = this.elementData;
            if (i4 <= objArr.length) {
                return;
            }
            if (objArr == emptyElementData) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i4, 10);
                this.elementData = new Object[coerceAtLeast];
                return;
            }
            copyElements(Companion.newCapacity$kotlin_stdlib(objArr.length, i4));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> function1) {
        int positiveMod;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod2 = positiveMod(this.head + size());
                int i4 = this.head;
                if (i4 < positiveMod2) {
                    positiveMod = i4;
                    while (i4 < positiveMod2) {
                        Object obj = this.elementData[i4];
                        if (function1.invoke(obj).booleanValue()) {
                            this.elementData[positiveMod] = obj;
                            positiveMod++;
                        } else {
                            z4 = true;
                        }
                        i4++;
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
                } else {
                    int length = this.elementData.length;
                    int i5 = i4;
                    boolean z5 = false;
                    while (i4 < length) {
                        Object[] objArr = this.elementData;
                        Object obj2 = objArr[i4];
                        objArr[i4] = null;
                        if (function1.invoke(obj2).booleanValue()) {
                            this.elementData[i5] = obj2;
                            i5++;
                        } else {
                            z5 = true;
                        }
                        i4++;
                    }
                    positiveMod = positiveMod(i5);
                    for (int i6 = 0; i6 < positiveMod2; i6++) {
                        Object[] objArr2 = this.elementData;
                        Object obj3 = objArr2[i6];
                        objArr2[i6] = null;
                        if (function1.invoke(obj3).booleanValue()) {
                            this.elementData[positiveMod] = obj3;
                            positiveMod = incremented(positiveMod);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.size = negativeMod(positiveMod - this.head);
                }
            }
        }
        return z4;
    }

    private final int incremented(int i4) {
        if (i4 == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i4 + 1;
    }

    @InlineOnly
    private final E internalGet(int i4) {
        return (E) this.elementData[i4];
    }

    @InlineOnly
    private final int internalIndex(int i4) {
        return positiveMod(this.head + i4);
    }

    private final int negativeMod(int i4) {
        return i4 < 0 ? i4 + this.elementData.length : i4;
    }

    private final int positiveMod(int i4) {
        Object[] objArr = this.elementData;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        addLast(e5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E e5) {
        ensureCapacity(size() + 1);
        int decremented = decremented(this.head);
        this.head = decremented;
        this.elementData[decremented] = e5;
        this.size = size() + 1;
    }

    public final void addLast(E e5) {
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = e5;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int positiveMod = positiveMod(this.head + size());
        int i4 = this.head;
        if (i4 < positiveMod) {
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, i4, positiveMod);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, this.head, objArr.length);
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, 0, positiveMod);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, size());
        return (E) this.elementData[positiveMod(this.head + i4)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i4;
        int positiveMod = positiveMod(this.head + size());
        int i5 = this.head;
        if (i5 < positiveMod) {
            while (i5 < positiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[i5])) {
                    i4 = this.head;
                } else {
                    i5++;
                }
            }
            return -1;
        } else if (i5 < positiveMod) {
            return -1;
        } else {
            int length = this.elementData.length;
            while (true) {
                if (i5 >= length) {
                    for (int i6 = 0; i6 < positiveMod; i6++) {
                        if (Intrinsics.areEqual(obj, this.elementData[i6])) {
                            i5 = i6 + this.elementData.length;
                            i4 = this.head;
                        }
                    }
                    return -1;
                } else if (Intrinsics.areEqual(obj, this.elementData[i5])) {
                    i4 = this.head;
                    break;
                } else {
                    i5++;
                }
            }
        }
        return i5 - i4;
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
        int i4;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i4 = this.head) < positiveMod(this.head + size())) ? this.head : i4 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        int lastIndex;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.elementData;
        int i4 = this.head;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        return (E) objArr[positiveMod(i4 + lastIndex)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i4;
        int positiveMod = positiveMod(this.head + size());
        int i5 = this.head;
        if (i5 < positiveMod) {
            lastIndex = positiveMod - 1;
            if (i5 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i5) {
                        lastIndex--;
                    }
                }
                i4 = this.head;
                return lastIndex - i4;
            }
            return -1;
        }
        if (i5 > positiveMod) {
            int i6 = positiveMod - 1;
            while (true) {
                if (-1 < i6) {
                    if (Intrinsics.areEqual(obj, this.elementData[i6])) {
                        lastIndex = i6 + this.elementData.length;
                        i4 = this.head;
                        break;
                    }
                    i6--;
                } else {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
                    int i7 = this.head;
                    if (i7 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                            if (lastIndex != i7) {
                                lastIndex--;
                            }
                        }
                        i4 = this.head;
                    }
                }
            }
        }
        return -1;
    }

    @Nullable
    public final E lastOrNull() {
        int lastIndex;
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.elementData;
        int i4 = this.head;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        return (E) objArr[positiveMod(i4 + lastIndex)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int positiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod2 = positiveMod(this.head + size());
                int i4 = this.head;
                if (i4 < positiveMod2) {
                    positiveMod = i4;
                    while (i4 < positiveMod2) {
                        Object obj = this.elementData[i4];
                        if (!elements.contains(obj)) {
                            this.elementData[positiveMod] = obj;
                            positiveMod++;
                        } else {
                            z4 = true;
                        }
                        i4++;
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
                } else {
                    int length = this.elementData.length;
                    int i5 = i4;
                    boolean z5 = false;
                    while (i4 < length) {
                        Object[] objArr = this.elementData;
                        Object obj2 = objArr[i4];
                        objArr[i4] = null;
                        if (!elements.contains(obj2)) {
                            this.elementData[i5] = obj2;
                            i5++;
                        } else {
                            z5 = true;
                        }
                        i4++;
                    }
                    positiveMod = positiveMod(i5);
                    for (int i6 = 0; i6 < positiveMod2; i6++) {
                        Object[] objArr2 = this.elementData;
                        Object obj3 = objArr2[i6];
                        objArr2[i6] = null;
                        if (!elements.contains(obj3)) {
                            this.elementData[positiveMod] = obj3;
                            positiveMod = incremented(positiveMod);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.size = negativeMod(positiveMod - this.head);
                }
            }
        }
        return z4;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i4) {
        int lastIndex;
        int lastIndex2;
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, size());
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i4 == lastIndex) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        int positiveMod = positiveMod(this.head + i4);
        E e5 = (E) this.elementData[positiveMod];
        if (i4 < (size() >> 1)) {
            int i5 = this.head;
            if (positiveMod >= i5) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, i5 + 1, i5, positiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, 1, 0, positiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.head;
                ArraysKt.copyInto(objArr3, objArr3, i6 + 1, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i7 = this.head;
            objArr4[i7] = null;
            this.head = incremented(i7);
        } else {
            int i8 = this.head;
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(this);
            int positiveMod2 = positiveMod(i8 + lastIndex2);
            if (positiveMod <= positiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, positiveMod, positiveMod + 1, positiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt.copyInto(objArr6, objArr6, positiveMod, positiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.copyInto(objArr7, objArr7, 0, 1, positiveMod2 + 1);
            }
            this.elementData[positiveMod2] = null;
        }
        this.size = size() - 1;
        return e5;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.elementData;
            int i4 = this.head;
            E e5 = (E) objArr[i4];
            objArr[i4] = null;
            this.head = incremented(i4);
            this.size = size() - 1;
            return e5;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        int lastIndex;
        if (!isEmpty()) {
            int i4 = this.head;
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
            int positiveMod = positiveMod(i4 + lastIndex);
            Object[] objArr = this.elementData;
            E e5 = (E) objArr[positiveMod];
            objArr[positiveMod] = null;
            this.size = size() - 1;
            return e5;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int positiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod2 = positiveMod(this.head + size());
                int i4 = this.head;
                if (i4 < positiveMod2) {
                    positiveMod = i4;
                    while (i4 < positiveMod2) {
                        Object obj = this.elementData[i4];
                        if (elements.contains(obj)) {
                            this.elementData[positiveMod] = obj;
                            positiveMod++;
                        } else {
                            z4 = true;
                        }
                        i4++;
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
                } else {
                    int length = this.elementData.length;
                    int i5 = i4;
                    boolean z5 = false;
                    while (i4 < length) {
                        Object[] objArr = this.elementData;
                        Object obj2 = objArr[i4];
                        objArr[i4] = null;
                        if (elements.contains(obj2)) {
                            this.elementData[i5] = obj2;
                            i5++;
                        } else {
                            z5 = true;
                        }
                        i4++;
                    }
                    positiveMod = positiveMod(i5);
                    for (int i6 = 0; i6 < positiveMod2; i6++) {
                        Object[] objArr2 = this.elementData;
                        Object obj3 = objArr2[i6];
                        objArr2[i6] = null;
                        if (elements.contains(obj3)) {
                            this.elementData[positiveMod] = obj3;
                            positiveMod = incremented(positiveMod);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.size = negativeMod(positiveMod - this.head);
                }
            }
        }
        return z4;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i4, E e5) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, size());
        int positiveMod = positiveMod(this.head + i4);
        Object[] objArr = this.elementData;
        E e6 = (E) objArr[positiveMod];
        objArr[positiveMod] = e5;
        return e6;
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        int positiveMod = positiveMod(this.head + size());
        int i4 = this.head;
        if (i4 < positiveMod) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.elementData, array, 0, i4, positiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt.copyInto(objArr2, array, objArr2.length - this.head, 0, positiveMod);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i4, E e5) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i4, size());
        if (i4 == size()) {
            addLast(e5);
        } else if (i4 == 0) {
            addFirst(e5);
        } else {
            ensureCapacity(size() + 1);
            int positiveMod = positiveMod(this.head + i4);
            if (i4 < ((size() + 1) >> 1)) {
                int decremented = decremented(positiveMod);
                int decremented2 = decremented(this.head);
                int i5 = this.head;
                if (decremented >= i5) {
                    Object[] objArr = this.elementData;
                    objArr[decremented2] = objArr[i5];
                    ArraysKt.copyInto(objArr, objArr, i5, i5 + 1, decremented + 1);
                } else {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                    Object[] objArr3 = this.elementData;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    ArraysKt.copyInto(objArr3, objArr3, 0, 1, decremented + 1);
                }
                this.elementData[decremented] = e5;
                this.head = decremented2;
            } else {
                int positiveMod2 = positiveMod(this.head + size());
                if (positiveMod < positiveMod2) {
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, positiveMod + 1, positiveMod, positiveMod2);
                } else {
                    Object[] objArr5 = this.elementData;
                    ArraysKt.copyInto(objArr5, objArr5, 1, 0, positiveMod2);
                    Object[] objArr6 = this.elementData;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    ArraysKt.copyInto(objArr6, objArr6, positiveMod + 1, positiveMod, objArr6.length - 1);
                }
                this.elementData[positiveMod] = e5;
            }
            this.size = size() + 1;
        }
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i4, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i4 == size()) {
            return addAll(elements);
        }
        ensureCapacity(size() + elements.size());
        int positiveMod = positiveMod(this.head + size());
        int positiveMod2 = positiveMod(this.head + i4);
        int size = elements.size();
        if (i4 < ((size() + 1) >> 1)) {
            int i5 = this.head;
            int i6 = i5 - size;
            if (positiveMod2 < i5) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, i6, i5, objArr.length);
                if (size >= positiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, positiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, 0, size, positiveMod2);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, i6, i5, positiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                i6 += objArr6.length;
                int i7 = positiveMod2 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    ArraysKt.copyInto(objArr6, objArr6, i6, i5, positiveMod2);
                } else {
                    ArraysKt.copyInto(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.elementData;
                    ArraysKt.copyInto(objArr7, objArr7, 0, this.head + length, positiveMod2);
                }
            }
            this.head = i6;
            copyCollectionElements(negativeMod(positiveMod2 - size), elements);
        } else {
            int i8 = positiveMod2 + size;
            if (positiveMod2 < positiveMod) {
                int i9 = size + positiveMod;
                Object[] objArr8 = this.elementData;
                if (i9 <= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i8, positiveMod2, positiveMod);
                } else if (i8 >= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i8 - objArr8.length, positiveMod2, positiveMod);
                } else {
                    int length2 = positiveMod - (i9 - objArr8.length);
                    ArraysKt.copyInto(objArr8, objArr8, 0, length2, positiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt.copyInto(objArr9, objArr9, i8, positiveMod2, length2);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt.copyInto(objArr10, objArr10, size, 0, positiveMod);
                Object[] objArr11 = this.elementData;
                if (i8 >= objArr11.length) {
                    ArraysKt.copyInto(objArr11, objArr11, i8 - objArr11.length, positiveMod2, objArr11.length);
                } else {
                    ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt.copyInto(objArr12, objArr12, i8, positiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(positiveMod2, elements);
        }
        return true;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
