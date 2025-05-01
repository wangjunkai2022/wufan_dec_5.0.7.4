package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
/* compiled from: DefaultFlexByteArrayPoolParams.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12052a = 4194304;

    /* renamed from: b  reason: collision with root package name */
    private static final int f12053b = 131072;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12054c = Runtime.getRuntime().availableProcessors();

    private m() {
    }

    public static SparseIntArray a(int i4, int i5, int i6) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i4 <= i5) {
            sparseIntArray.put(i4, i6);
            i4 *= 2;
        }
        return sparseIntArray;
    }

    public static e0 b() {
        int i4 = f12054c;
        return new e0(4194304, i4 * 4194304, a(131072, 4194304, i4), 131072, 4194304, i4);
    }
}
