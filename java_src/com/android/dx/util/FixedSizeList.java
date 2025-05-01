package com.android.dx.util;

import java.util.Arrays;
/* loaded from: classes.dex */
public class FixedSizeList extends MutabilityControl implements ToHuman {
    private Object[] arr;

    public FixedSizeList(int i4) {
        super(i4 != 0);
        try {
            this.arr = new Object[i4];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    private Object throwIndex(int i4) {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    private String toString0(String str, String str2, String str3, boolean z4) {
        int length = this.arr.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0 && str2 != null) {
                sb.append(str2);
            }
            if (z4) {
                sb.append(((ToHuman) this.arr[i4]).toHuman());
            } else {
                sb.append(this.arr[i4]);
            }
        }
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.arr, ((FixedSizeList) obj).arr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object get0(int i4) {
        try {
            Object obj = this.arr[i4];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i4);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return throwIndex(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object getOrNull0(int i4) {
        return this.arr[i4];
    }

    public int hashCode() {
        return Arrays.hashCode(this.arr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void set0(int i4, Object obj) {
        throwIfImmutable();
        try {
            this.arr[i4] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throwIndex(i4);
        }
    }

    public void shrinkToFit() {
        int length = this.arr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (this.arr[i5] != null) {
                i4++;
            }
        }
        if (length == i4) {
            return;
        }
        throwIfImmutable();
        Object[] objArr = new Object[i4];
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = this.arr[i7];
            if (obj != null) {
                objArr[i6] = obj;
                i6++;
            }
        }
        this.arr = objArr;
        if (i4 == 0) {
            setImmutable();
        }
    }

    public final int size() {
        return this.arr.length;
    }

    public String toHuman() {
        String name = getClass().getName();
        return toString0(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", true);
    }

    public String toString() {
        String name = getClass().getName();
        return toString0(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", false);
    }

    public String toHuman(String str, String str2, String str3) {
        return toString0(str, str2, str3, true);
    }

    public String toString(String str, String str2, String str3) {
        return toString0(str, str2, str3, false);
    }
}
