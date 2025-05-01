package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import javax.annotation.Nullable;
/* compiled from: AnimationBackend.java */
/* loaded from: classes.dex */
public interface a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11385a = -1;

    int b();

    void clear();

    int d();

    void e(Rect rect);

    int f();

    void g(@Nullable ColorFilter colorFilter);

    boolean h(Drawable drawable, Canvas canvas, int i4);

    void k(@IntRange(from = 0, to = 255) int i4);
}
