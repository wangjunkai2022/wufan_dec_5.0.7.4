package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class CompactStringObjectMap implements Serializable {
    private static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
    private static final long serialVersionUID = 1;
    private final Object[] _hashArea;
    private final int _hashMask;
    private final int _spillCount;

    private CompactStringObjectMap(int i4, int i5, Object[] objArr) {
        this._hashMask = i4;
        this._spillCount = i5;
        this._hashArea = objArr;
    }

    private final Object _find2(String str, int i4, Object obj) {
        if (obj == null) {
            return null;
        }
        int i5 = this._hashMask + 1;
        int i6 = ((i4 >> 1) + i5) << 1;
        Object obj2 = this._hashArea[i6];
        if (str.equals(obj2)) {
            return this._hashArea[i6 + 1];
        }
        if (obj2 != null) {
            int i7 = (i5 + (i5 >> 1)) << 1;
            int i8 = this._spillCount + i7;
            while (i7 < i8) {
                Object obj3 = this._hashArea[i7];
                if (obj3 == str || str.equals(obj3)) {
                    return this._hashArea[i7 + 1];
                }
                i7 += 2;
            }
        }
        return null;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        if (map.isEmpty()) {
            return EMPTY;
        }
        int findSize = findSize(map.size());
        int i4 = findSize - 1;
        int i5 = (findSize >> 1) + findSize;
        Object[] objArr = new Object[i5 * 2];
        int i6 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int hashCode = key.hashCode() & i4;
                int i7 = hashCode + hashCode;
                if (objArr[i7] != null) {
                    i7 = ((hashCode >> 1) + findSize) << 1;
                    if (objArr[i7] != null) {
                        i7 = (i5 << 1) + i6;
                        i6 += 2;
                        if (i7 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i7] = key;
                objArr[i7 + 1] = entry.getValue();
            }
        }
        return new CompactStringObjectMap(i4, i6, objArr);
    }

    private static final int findSize(int i4) {
        if (i4 <= 5) {
            return 8;
        }
        if (i4 <= 12) {
            return 16;
        }
        int i5 = 32;
        while (i5 < i4 + (i4 >> 2)) {
            i5 += i5;
        }
        return i5;
    }

    public Object find(String str) {
        int hashCode = str.hashCode() & this._hashMask;
        int i4 = hashCode << 1;
        Object obj = this._hashArea[i4];
        if (obj != str && !str.equals(obj)) {
            return _find2(str, hashCode, obj);
        }
        return this._hashArea[i4 + 1];
    }

    public Object findCaseInsensitive(String str) {
        int length = this._hashArea.length;
        for (int i4 = 0; i4 < length; i4 += 2) {
            Object obj = this._hashArea[i4];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this._hashArea[i4 + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i4 = 0; i4 < length; i4 += 2) {
            Object obj = this._hashArea[i4];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
