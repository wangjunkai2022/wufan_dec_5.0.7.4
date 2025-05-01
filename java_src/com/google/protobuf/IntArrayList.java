package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess {
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        IntArrayList intArrayList = new IntArrayList();
        EMPTY_LIST = intArrayList;
        intArrayList.makeImmutable();
    }

    IntArrayList() {
        this(new int[10], 0);
    }

    public static IntArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i4) {
        if (i4 < 0 || i4 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i4));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i4) {
        return "Index:" + i4 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Objects.requireNonNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i4 = intArrayList.size;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.size;
        if (Integer.MAX_VALUE - i5 >= i4) {
            int i6 = i5 + i4;
            int[] iArr = this.array;
            if (i6 > iArr.length) {
                this.array = Arrays.copyOf(iArr, i6);
            }
            System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
            this.size = i6;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i4) {
        addInt(this.size, i4);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i4 = 0; i4 < this.size; i4++) {
            if (this.array[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i4) {
        ensureIndexInRange(i4);
        return this.array[i4];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.size; i5++) {
            i4 = (i4 * 31) + this.array[i5];
        }
        return i4;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i4, int i5) {
        ensureIsMutable();
        ensureIndexInRange(i4);
        int[] iArr = this.array;
        int i6 = iArr[i4];
        iArr[i4] = i5;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i4) {
        this.array = iArr;
        this.size = i4;
    }

    private void addInt(int i4, int i5) {
        int i6;
        ensureIsMutable();
        if (i4 >= 0 && i4 <= (i6 = this.size)) {
            int[] iArr = this.array;
            if (i6 < iArr.length) {
                System.arraycopy(iArr, i4, iArr, i4 + 1, i6 - i4);
            } else {
                int[] iArr2 = new int[((i6 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i4);
                System.arraycopy(this.array, i4, iArr2, i4 + 1, this.size - i4);
                this.array = iArr2;
            }
            this.array[i4] = i5;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i4));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i4, Integer num) {
        addInt(i4, num.intValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i4) {
        return Integer.valueOf(getInt(i4));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i4) {
        if (i4 >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, i4), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i4 = 0; i4 < this.size; i4++) {
            if (obj.equals(Integer.valueOf(this.array[i4]))) {
                int[] iArr = this.array;
                System.arraycopy(iArr, i4 + 1, iArr, i4, this.size - i4);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i4, Integer num) {
        return Integer.valueOf(setInt(i4, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i4) {
        ensureIsMutable();
        ensureIndexInRange(i4);
        int[] iArr = this.array;
        int i5 = iArr[i4];
        System.arraycopy(iArr, i4 + 1, iArr, i4, this.size - i4);
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }
}
