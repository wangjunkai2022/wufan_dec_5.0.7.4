package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import javax.annotation.Nullable;
/* compiled from: PoolParams.java */
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f12007i = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f12008a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12009b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f12010c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12011d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12012e;

    /* renamed from: f  reason: collision with root package name */
    public String f12013f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12014g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12015h;

    public e0(int i4, @Nullable SparseIntArray sparseIntArray) {
        this(i4, i4, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public e0(int i4, int i5, @Nullable SparseIntArray sparseIntArray) {
        this(i4, i5, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public e0(int i4, int i5, @Nullable SparseIntArray sparseIntArray, int i6, int i7, int i8) {
        com.facebook.common.internal.h.o(i4 >= 0 && i5 >= i4);
        this.f12009b = i4;
        this.f12008a = i5;
        this.f12010c = sparseIntArray;
        this.f12011d = i6;
        this.f12012e = i7;
        this.f12015h = i8;
    }
}
