package io.reactivex.internal.util;
/* loaded from: classes6.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    static int mix(int i4) {
        int i5 = i4 * INT_PHI;
        return i5 ^ (i5 >>> 16);
    }

    public boolean add(T t4) {
        T t5;
        T[] tArr = this.keys;
        int i4 = this.mask;
        int mix = mix(t4.hashCode()) & i4;
        T t6 = tArr[mix];
        if (t6 != null) {
            if (t6.equals(t4)) {
                return false;
            }
            do {
                mix = (mix + 1) & i4;
                t5 = tArr[mix];
                if (t5 == null) {
                }
            } while (!t5.equals(t4));
            return false;
        }
        tArr[mix] = t4;
        int i5 = this.size + 1;
        this.size = i5;
        if (i5 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public Object[] keys() {
        return this.keys;
    }

    void rehash() {
        T[] tArr = this.keys;
        int length = tArr.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        T[] tArr2 = (T[]) new Object[i4];
        int i6 = this.size;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int mix = mix(tArr[length].hashCode()) & i5;
                if (tArr2[mix] != null) {
                    do {
                        mix = (mix + 1) & i5;
                    } while (tArr2[mix] != null);
                }
                tArr2[mix] = tArr[length];
                i6 = i7;
            } else {
                this.mask = i5;
                this.maxSize = (int) (i4 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
        }
    }

    public boolean remove(T t4) {
        T t5;
        T[] tArr = this.keys;
        int i4 = this.mask;
        int mix = mix(t4.hashCode()) & i4;
        T t6 = tArr[mix];
        if (t6 == null) {
            return false;
        }
        if (t6.equals(t4)) {
            return removeEntry(mix, tArr, i4);
        }
        do {
            mix = (mix + 1) & i4;
            t5 = tArr[mix];
            if (t5 == null) {
                return false;
            }
        } while (!t5.equals(t4));
        return removeEntry(mix, tArr, i4);
    }

    boolean removeEntry(int i4, T[] tArr, int i5) {
        int i6;
        T t4;
        this.size--;
        while (true) {
            int i7 = i4 + 1;
            while (true) {
                i6 = i7 & i5;
                t4 = tArr[i6];
                if (t4 == null) {
                    tArr[i4] = null;
                    return true;
                }
                int mix = mix(t4.hashCode()) & i5;
                if (i4 > i6) {
                    if (i4 >= mix && mix > i6) {
                        break;
                    }
                    i7 = i6 + 1;
                } else if (i4 < mix && mix <= i6) {
                    i7 = i6 + 1;
                }
            }
            tArr[i4] = t4;
            i4 = i6;
        }
    }

    public int size() {
        return this.size;
    }

    public OpenHashSet(int i4) {
        this(i4, 0.75f);
    }

    public OpenHashSet(int i4, float f5) {
        this.loadFactor = f5;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i4);
        this.mask = roundToPowerOfTwo - 1;
        this.maxSize = (int) (f5 * roundToPowerOfTwo);
        this.keys = (T[]) new Object[roundToPowerOfTwo];
    }
}
