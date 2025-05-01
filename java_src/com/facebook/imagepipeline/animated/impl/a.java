package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.common.internal.h;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.d;
import com.facebook.imagepipeline.animated.base.e;
import com.facebook.imagepipeline.animated.base.f;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: AnimatedDrawableBackendImpl.java */
/* loaded from: classes.dex */
public class a implements com.facebook.imagepipeline.animated.base.a {

    /* renamed from: a  reason: collision with root package name */
    private final s0.a f11586a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11587b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11588c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f11589d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f11590e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f11591f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11592g;

    /* renamed from: h  reason: collision with root package name */
    private final AnimatedDrawableFrameInfo[] f11593h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f11594i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    private final Rect f11595j = new Rect();
    @GuardedBy("this")
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f11596k;

    public a(s0.a aVar, f fVar, Rect rect) {
        this.f11586a = aVar;
        this.f11587b = fVar;
        d e5 = fVar.e();
        this.f11588c = e5;
        int[] i4 = e5.i();
        this.f11590e = i4;
        aVar.a(i4);
        this.f11592g = aVar.e(i4);
        this.f11591f = aVar.c(i4);
        this.f11589d = s(e5, rect);
        this.f11593h = new AnimatedDrawableFrameInfo[e5.a()];
        for (int i5 = 0; i5 < this.f11588c.a(); i5++) {
            this.f11593h[i5] = this.f11588c.e(i5);
        }
    }

    private synchronized void r() {
        Bitmap bitmap = this.f11596k;
        if (bitmap != null) {
            bitmap.recycle();
            this.f11596k = null;
        }
    }

    private static Rect s(d dVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, dVar.getWidth(), dVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), dVar.getWidth()), Math.min(rect.height(), dVar.getHeight()));
    }

    private synchronized void t(int i4, int i5) {
        Bitmap bitmap = this.f11596k;
        if (bitmap != null && (bitmap.getWidth() < i4 || this.f11596k.getHeight() < i5)) {
            r();
        }
        if (this.f11596k == null) {
            this.f11596k = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        }
        this.f11596k.eraseColor(0);
    }

    private void u(Canvas canvas, e eVar) {
        int width = eVar.getWidth();
        int height = eVar.getHeight();
        int c5 = eVar.c();
        int d5 = eVar.d();
        synchronized (this) {
            t(width, height);
            eVar.a(width, height, this.f11596k);
            this.f11594i.set(0, 0, width, height);
            this.f11595j.set(0, 0, width, height);
            canvas.save();
            canvas.translate(c5, d5);
            canvas.drawBitmap(this.f11596k, this.f11594i, this.f11595j, (Paint) null);
            canvas.restore();
        }
    }

    private void v(Canvas canvas, e eVar) {
        double width = this.f11589d.width();
        double width2 = this.f11588c.getWidth();
        Double.isNaN(width);
        Double.isNaN(width2);
        double d5 = width / width2;
        double height = this.f11589d.height();
        double height2 = this.f11588c.getHeight();
        Double.isNaN(height);
        Double.isNaN(height2);
        double d6 = height / height2;
        double width3 = eVar.getWidth();
        Double.isNaN(width3);
        int round = (int) Math.round(width3 * d5);
        double height3 = eVar.getHeight();
        Double.isNaN(height3);
        int round2 = (int) Math.round(height3 * d6);
        double c5 = eVar.c();
        Double.isNaN(c5);
        int i4 = (int) (c5 * d5);
        double d7 = eVar.d();
        Double.isNaN(d7);
        int i5 = (int) (d7 * d6);
        synchronized (this) {
            int width4 = this.f11589d.width();
            int height4 = this.f11589d.height();
            t(width4, height4);
            eVar.a(round, round2, this.f11596k);
            this.f11594i.set(0, 0, width4, height4);
            this.f11595j.set(i4, i5, width4 + i4, height4 + i5);
            canvas.drawBitmap(this.f11596k, this.f11594i, this.f11595j, (Paint) null);
        }
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int a() {
        return this.f11588c.a();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int b() {
        return this.f11592g;
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int c() {
        return this.f11588c.c();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public synchronized void d() {
        r();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public AnimatedDrawableFrameInfo e(int i4) {
        return this.f11593h[i4];
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public void f(int i4, Canvas canvas) {
        e f5 = this.f11588c.f(i4);
        try {
            if (this.f11588c.d()) {
                v(canvas, f5);
            } else {
                u(canvas, f5);
            }
        } finally {
            f5.dispose();
        }
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public com.facebook.imagepipeline.animated.base.a g(Rect rect) {
        return s(this.f11588c, rect).equals(this.f11589d) ? this : new a(this.f11586a, this.f11587b, rect);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int getHeight() {
        return this.f11588c.getHeight();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int getWidth() {
        return this.f11588c.getWidth();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public boolean h(int i4) {
        return this.f11587b.g(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int i(int i4) {
        return this.f11586a.b(this.f11591f, i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public com.facebook.common.references.a<Bitmap> j(int i4) {
        return this.f11587b.c(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int k(int i4) {
        h.g(i4, this.f11591f.length);
        return this.f11591f[i4];
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public synchronized int l() {
        Bitmap bitmap;
        bitmap = this.f11596k;
        return (bitmap != null ? 0 + this.f11586a.d(bitmap) : 0) + this.f11588c.b();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int m(int i4) {
        return this.f11590e[i4];
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int n() {
        return this.f11589d.height();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int o() {
        return this.f11589d.width();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int p() {
        return this.f11587b.d();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public f q() {
        return this.f11587b;
    }
}
