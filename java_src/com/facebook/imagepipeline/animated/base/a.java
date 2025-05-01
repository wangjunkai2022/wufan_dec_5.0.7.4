package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import javax.annotation.Nullable;
/* compiled from: AnimatedDrawableBackend.java */
/* loaded from: classes.dex */
public interface a {
    int a();

    int b();

    int c();

    void d();

    AnimatedDrawableFrameInfo e(int i4);

    void f(int i4, Canvas canvas);

    a g(Rect rect);

    int getHeight();

    int getWidth();

    boolean h(int i4);

    int i(int i4);

    @Nullable
    com.facebook.common.references.a<Bitmap> j(int i4);

    int k(int i4);

    int l();

    int m(int i4);

    int n();

    int o();

    int p();

    f q();
}
