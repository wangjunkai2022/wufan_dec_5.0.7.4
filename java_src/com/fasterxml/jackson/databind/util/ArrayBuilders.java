package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;
/* loaded from: classes3.dex */
public final class ArrayBuilders {
    private BooleanBuilder _booleanBuilder = null;
    private ByteBuilder _byteBuilder = null;
    private ShortBuilder _shortBuilder = null;
    private IntBuilder _intBuilder = null;
    private LongBuilder _longBuilder = null;
    private FloatBuilder _floatBuilder = null;
    private DoubleBuilder _doubleBuilder = null;

    /* loaded from: classes3.dex */
    public static final class BooleanBuilder extends PrimitiveArrayBuilder<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final boolean[] _constructArray(int i4) {
            return new boolean[i4];
        }
    }

    /* loaded from: classes3.dex */
    public static final class ByteBuilder extends PrimitiveArrayBuilder<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final byte[] _constructArray(int i4) {
            return new byte[i4];
        }
    }

    /* loaded from: classes3.dex */
    public static final class DoubleBuilder extends PrimitiveArrayBuilder<double[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final double[] _constructArray(int i4) {
            return new double[i4];
        }
    }

    /* loaded from: classes3.dex */
    public static final class FloatBuilder extends PrimitiveArrayBuilder<float[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final float[] _constructArray(int i4) {
            return new float[i4];
        }
    }

    /* loaded from: classes3.dex */
    public static final class IntBuilder extends PrimitiveArrayBuilder<int[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final int[] _constructArray(int i4) {
            return new int[i4];
        }
    }

    /* loaded from: classes3.dex */
    public static final class LongBuilder extends PrimitiveArrayBuilder<long[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final long[] _constructArray(int i4) {
            return new long[i4];
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShortBuilder extends PrimitiveArrayBuilder<short[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final short[] _constructArray(int i4) {
            return new short[i4];
        }
    }

    public static <T> HashSet<T> arrayToSet(T[] tArr) {
        if (tArr != null) {
            HashSet<T> hashSet = new HashSet<>(tArr.length);
            for (T t4 : tArr) {
                hashSet.add(t4);
            }
            return hashSet;
        }
        return new HashSet<>();
    }

    public static Object getArrayComparator(final Object obj) {
        final int length = Array.getLength(obj);
        final Class<?> cls = obj.getClass();
        return new Object() { // from class: com.fasterxml.jackson.databind.util.ArrayBuilders.1
            public boolean equals(Object obj2) {
                if (obj2 == this) {
                    return true;
                }
                if (ClassUtil.hasClass(obj2, cls) && Array.getLength(obj2) == length) {
                    for (int i4 = 0; i4 < length; i4++) {
                        Object obj3 = Array.get(obj, i4);
                        Object obj4 = Array.get(obj2, i4);
                        if (obj3 != obj4 && obj3 != null && !obj3.equals(obj4)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }

    public static <T> T[] insertInListNoDup(T[] tArr, T t4) {
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (tArr[i4] == t4) {
                if (i4 == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i4);
                tArr2[0] = t4;
                int i5 = i4 + 1;
                int i6 = length - i5;
                if (i6 > 0) {
                    System.arraycopy(tArr, i5, tArr2, i5, i6);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t4;
        return tArr3;
    }

    public BooleanBuilder getBooleanBuilder() {
        if (this._booleanBuilder == null) {
            this._booleanBuilder = new BooleanBuilder();
        }
        return this._booleanBuilder;
    }

    public ByteBuilder getByteBuilder() {
        if (this._byteBuilder == null) {
            this._byteBuilder = new ByteBuilder();
        }
        return this._byteBuilder;
    }

    public DoubleBuilder getDoubleBuilder() {
        if (this._doubleBuilder == null) {
            this._doubleBuilder = new DoubleBuilder();
        }
        return this._doubleBuilder;
    }

    public FloatBuilder getFloatBuilder() {
        if (this._floatBuilder == null) {
            this._floatBuilder = new FloatBuilder();
        }
        return this._floatBuilder;
    }

    public IntBuilder getIntBuilder() {
        if (this._intBuilder == null) {
            this._intBuilder = new IntBuilder();
        }
        return this._intBuilder;
    }

    public LongBuilder getLongBuilder() {
        if (this._longBuilder == null) {
            this._longBuilder = new LongBuilder();
        }
        return this._longBuilder;
    }

    public ShortBuilder getShortBuilder() {
        if (this._shortBuilder == null) {
            this._shortBuilder = new ShortBuilder();
        }
        return this._shortBuilder;
    }
}
