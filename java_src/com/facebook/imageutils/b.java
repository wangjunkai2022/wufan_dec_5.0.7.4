package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;
import javax.annotation.Nullable;
/* compiled from: ImageMetaData.java */
/* loaded from: classes.dex */
public class b {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Pair<Integer, Integer> f12527a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final ColorSpace f12528b;

    public b(int i4, int i5, @Nullable ColorSpace colorSpace) {
        this.f12527a = (i4 == -1 || i5 == -1) ? null : new Pair<>(Integer.valueOf(i4), Integer.valueOf(i5));
        this.f12528b = colorSpace;
    }

    @Nullable
    public ColorSpace a() {
        return this.f12528b;
    }

    @Nullable
    public Pair<Integer, Integer> b() {
        return this.f12527a;
    }
}
