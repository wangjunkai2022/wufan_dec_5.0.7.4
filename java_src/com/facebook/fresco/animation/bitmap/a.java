package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import javax.annotation.Nullable;
/* compiled from: BitmapFrameCache.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: BitmapFrameCache.java */
    /* renamed from: com.facebook.fresco.animation.bitmap.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0263a {
        void a(a aVar, int i4);

        void b(a aVar, int i4);
    }

    void a(int i4, com.facebook.common.references.a<Bitmap> aVar, int i5);

    int b();

    void c(int i4, com.facebook.common.references.a<Bitmap> aVar, int i5);

    void clear();

    @Nullable
    com.facebook.common.references.a<Bitmap> d(int i4);

    @Nullable
    com.facebook.common.references.a<Bitmap> e(int i4, int i5, int i6);

    void f(InterfaceC0263a interfaceC0263a);

    boolean g(int i4);

    @Nullable
    com.facebook.common.references.a<Bitmap> h(int i4);
}
