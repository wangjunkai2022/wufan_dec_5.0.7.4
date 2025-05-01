package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
/* compiled from: DefaultByteArrayPoolParams.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final int f12048a = 16384;

    /* renamed from: b  reason: collision with root package name */
    private static final int f12049b = 5;

    /* renamed from: c  reason: collision with root package name */
    private static final int f12050c = 81920;

    /* renamed from: d  reason: collision with root package name */
    private static final int f12051d = 1048576;

    public static e0 a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new e0(f12050c, 1048576, sparseIntArray);
    }
}
