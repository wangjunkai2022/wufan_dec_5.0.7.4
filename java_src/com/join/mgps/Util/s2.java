package com.join.mgps.Util;

import android.util.SparseArray;
import android.view.View;
/* compiled from: ViewHolder.java */
/* loaded from: classes3.dex */
public class s2 {
    public static <T extends View> T a(View view, int i4) {
        SparseArray sparseArray = (SparseArray) view.getTag();
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            view.setTag(sparseArray);
        }
        T t4 = (T) sparseArray.get(i4);
        if (t4 == null) {
            T t5 = (T) view.findViewById(i4);
            sparseArray.put(i4, t5);
            return t5;
        }
        return t4;
    }
}
