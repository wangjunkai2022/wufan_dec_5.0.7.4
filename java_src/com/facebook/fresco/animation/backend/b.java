package com.facebook.fresco.animation.backend;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import com.facebook.fresco.animation.backend.a;
import javax.annotation.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AnimationBackendDelegate.java */
/* loaded from: classes.dex */
public class b<T extends a> implements a {

    /* renamed from: g  reason: collision with root package name */
    private static final int f11386g = -1;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private T f11387c;
    @IntRange(from = -1, to = IjkMediaMeta.AV_CH_LAYOUT_7POINT1_WIDE_BACK)

    /* renamed from: d  reason: collision with root package name */
    private int f11388d = -1;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ColorFilter f11389e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Rect f11390f;

    public b(@Nullable T t4) {
        this.f11387c = t4;
    }

    @SuppressLint({"Range"})
    private void i(a aVar) {
        Rect rect = this.f11390f;
        if (rect != null) {
            aVar.e(rect);
        }
        int i4 = this.f11388d;
        if (i4 >= 0 && i4 <= 255) {
            aVar.k(i4);
        }
        ColorFilter colorFilter = this.f11389e;
        if (colorFilter != null) {
            aVar.g(colorFilter);
        }
    }

    @Override // com.facebook.fresco.animation.backend.d
    public int a() {
        T t4 = this.f11387c;
        if (t4 == null) {
            return 0;
        }
        return t4.a();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public int b() {
        T t4 = this.f11387c;
        if (t4 == null) {
            return 0;
        }
        return t4.b();
    }

    @Override // com.facebook.fresco.animation.backend.d
    public int c() {
        T t4 = this.f11387c;
        if (t4 == null) {
            return 0;
        }
        return t4.c();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void clear() {
        T t4 = this.f11387c;
        if (t4 != null) {
            t4.clear();
        }
    }

    @Override // com.facebook.fresco.animation.backend.a
    public int d() {
        T t4 = this.f11387c;
        if (t4 == null) {
            return -1;
        }
        return t4.d();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void e(@Nullable Rect rect) {
        T t4 = this.f11387c;
        if (t4 != null) {
            t4.e(rect);
        }
        this.f11390f = rect;
    }

    @Override // com.facebook.fresco.animation.backend.a
    public int f() {
        T t4 = this.f11387c;
        if (t4 == null) {
            return -1;
        }
        return t4.f();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void g(ColorFilter colorFilter) {
        T t4 = this.f11387c;
        if (t4 != null) {
            t4.g(colorFilter);
        }
        this.f11389e = colorFilter;
    }

    @Override // com.facebook.fresco.animation.backend.a
    public boolean h(Drawable drawable, Canvas canvas, int i4) {
        T t4 = this.f11387c;
        return t4 != null && t4.h(drawable, canvas, i4);
    }

    @Override // com.facebook.fresco.animation.backend.d
    public int j(int i4) {
        T t4 = this.f11387c;
        if (t4 == null) {
            return 0;
        }
        return t4.j(i4);
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void k(@IntRange(from = 0, to = 255) int i4) {
        T t4 = this.f11387c;
        if (t4 != null) {
            t4.k(i4);
        }
        this.f11388d = i4;
    }

    @Nullable
    public T l() {
        return this.f11387c;
    }

    public void m(@Nullable T t4) {
        this.f11387c = t4;
        if (t4 != null) {
            i(t4);
        }
    }
}
