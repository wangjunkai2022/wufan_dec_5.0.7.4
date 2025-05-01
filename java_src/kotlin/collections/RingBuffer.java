package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: SlidingWindow.kt */
@SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
/* loaded from: classes6.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    @NotNull
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(@NotNull Object[] buffer, int i4) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (i4 >= 0) {
            if (i4 <= buffer.length) {
                this.capacity = buffer.length;
                this.size = i4;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i4 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i4).toString());
    }

    private final int forward(int i4, int i5) {
        return (i4 + i5) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t4) {
        if (!isFull()) {
            this.buffer[(this.startIndex + size()) % this.capacity] = t4;
            this.size = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final RingBuffer<T> expanded(int i4) {
        int coerceAtMost;
        Object[] array;
        int i5 = this.capacity;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(i5 + (i5 >> 1) + 1, i4);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[coerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i4) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, size());
        return (T) this.buffer[(this.startIndex + i4) % this.capacity];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer$iterator$1
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i4;
                this.this$0 = this;
                this.count = this.size();
                i4 = ((RingBuffer) this).startIndex;
                this.index = i4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            protected void computeNext() {
                Object[] objArr;
                if (this.count != 0) {
                    objArr = ((RingBuffer) this.this$0).buffer;
                    setNext(objArr[this.index]);
                    this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                    this.count--;
                    return;
                }
                done();
            }
        };
    }

    public final void removeFirst(int i4) {
        if (i4 >= 0) {
            if (!(i4 <= size())) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i4 + ", size = " + size()).toString());
            } else if (i4 > 0) {
                int i5 = this.startIndex;
                int i6 = (i5 + i4) % this.capacity;
                if (i5 > i6) {
                    ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i5, this.capacity);
                    ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, 0, i6);
                } else {
                    ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i5, i6);
                }
                this.startIndex = i6;
                this.size = size() - i4;
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i4).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = this.startIndex; i5 < size && i6 < this.capacity; i6++) {
            array[i5] = this.buffer[i6];
            i5++;
        }
        while (i5 < size) {
            array[i5] = this.buffer[i4];
            i5++;
            i4++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public RingBuffer(int i4) {
        this(new Object[i4], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
