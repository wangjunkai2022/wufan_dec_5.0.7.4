package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import com.facebook.fresco.animation.backend.c;
import com.facebook.fresco.animation.backend.d;
import com.facebook.imagepipeline.bitmaps.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class BitmapAnimationBackend implements com.facebook.fresco.animation.backend.a, c.b {

    /* renamed from: o  reason: collision with root package name */
    public static final int f11403o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f11404p = 0;

    /* renamed from: q  reason: collision with root package name */
    public static final int f11405q = 1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f11406r = 2;

    /* renamed from: s  reason: collision with root package name */
    public static final int f11407s = 3;

    /* renamed from: t  reason: collision with root package name */
    private static final Class<?> f11408t = BitmapAnimationBackend.class;

    /* renamed from: c  reason: collision with root package name */
    private final f f11409c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.fresco.animation.bitmap.a f11410d;

    /* renamed from: e  reason: collision with root package name */
    private final d f11411e;

    /* renamed from: f  reason: collision with root package name */
    private final b f11412f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final com.facebook.fresco.animation.bitmap.preparation.a f11413g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final com.facebook.fresco.animation.bitmap.preparation.b f11414h;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private Rect f11416j;

    /* renamed from: k  reason: collision with root package name */
    private int f11417k;

    /* renamed from: l  reason: collision with root package name */
    private int f11418l;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private a f11420n;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap.Config f11419m = Bitmap.Config.ARGB_8888;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f11415i = new Paint(6);

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FrameType {
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(BitmapAnimationBackend bitmapAnimationBackend, int i4, int i5);

        void b(BitmapAnimationBackend bitmapAnimationBackend, int i4);

        void c(BitmapAnimationBackend bitmapAnimationBackend, int i4);
    }

    public BitmapAnimationBackend(f fVar, com.facebook.fresco.animation.bitmap.a aVar, d dVar, b bVar, @Nullable com.facebook.fresco.animation.bitmap.preparation.a aVar2, @Nullable com.facebook.fresco.animation.bitmap.preparation.b bVar2) {
        this.f11409c = fVar;
        this.f11410d = aVar;
        this.f11411e = dVar;
        this.f11412f = bVar;
        this.f11413g = aVar2;
        this.f11414h = bVar2;
        q();
    }

    private boolean l(int i4, @Nullable com.facebook.common.references.a<Bitmap> aVar, Canvas canvas, int i5) {
        if (com.facebook.common.references.a.t(aVar)) {
            if (this.f11416j == null) {
                canvas.drawBitmap(aVar.k(), 0.0f, 0.0f, this.f11415i);
            } else {
                canvas.drawBitmap(aVar.k(), (Rect) null, this.f11416j, this.f11415i);
            }
            if (i5 != 3) {
                this.f11410d.c(i4, aVar, i5);
            }
            a aVar2 = this.f11420n;
            if (aVar2 != null) {
                aVar2.a(this, i4, i5);
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean m(Canvas canvas, int i4, int i5) {
        com.facebook.common.references.a<Bitmap> h4;
        boolean l4;
        int i6 = 3;
        boolean z4 = false;
        try {
            if (i5 == 0) {
                h4 = this.f11410d.h(i4);
                l4 = l(i4, h4, canvas, 0);
                i6 = 1;
            } else if (i5 == 1) {
                h4 = this.f11410d.e(i4, this.f11417k, this.f11418l);
                if (n(i4, h4) && l(i4, h4, canvas, 1)) {
                    z4 = true;
                }
                l4 = z4;
                i6 = 2;
            } else if (i5 == 2) {
                h4 = this.f11409c.e(this.f11417k, this.f11418l, this.f11419m);
                if (n(i4, h4) && l(i4, h4, canvas, 2)) {
                    z4 = true;
                }
                l4 = z4;
            } else if (i5 != 3) {
                return false;
            } else {
                h4 = this.f11410d.d(i4);
                l4 = l(i4, h4, canvas, 3);
                i6 = -1;
            }
            com.facebook.common.references.a.h(h4);
            return (l4 || i6 == -1) ? l4 : m(canvas, i4, i6);
        } catch (RuntimeException e5) {
            com.facebook.common.logging.a.l0(f11408t, "Failed to create frame bitmap", e5);
            return false;
        } finally {
            com.facebook.common.references.a.h(null);
        }
    }

    private boolean n(int i4, @Nullable com.facebook.common.references.a<Bitmap> aVar) {
        if (com.facebook.common.references.a.t(aVar)) {
            boolean a5 = this.f11412f.a(i4, aVar.k());
            if (!a5) {
                com.facebook.common.references.a.h(aVar);
            }
            return a5;
        }
        return false;
    }

    private void q() {
        int f5 = this.f11412f.f();
        this.f11417k = f5;
        if (f5 == -1) {
            Rect rect = this.f11416j;
            this.f11417k = rect == null ? -1 : rect.width();
        }
        int d5 = this.f11412f.d();
        this.f11418l = d5;
        if (d5 == -1) {
            Rect rect2 = this.f11416j;
            this.f11418l = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // com.facebook.fresco.animation.backend.d
    public int a() {
        return this.f11411e.a();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public int b() {
        return this.f11410d.b();
    }

    @Override // com.facebook.fresco.animation.backend.d
    public int c() {
        return this.f11411e.c();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void clear() {
        this.f11410d.clear();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public int d() {
        return this.f11418l;
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void e(@Nullable Rect rect) {
        this.f11416j = rect;
        this.f11412f.e(rect);
        q();
    }

    @Override // com.facebook.fresco.animation.backend.a
    public int f() {
        return this.f11417k;
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void g(@Nullable ColorFilter colorFilter) {
        this.f11415i.setColorFilter(colorFilter);
    }

    @Override // com.facebook.fresco.animation.backend.a
    public boolean h(Drawable drawable, Canvas canvas, int i4) {
        com.facebook.fresco.animation.bitmap.preparation.b bVar;
        a aVar;
        a aVar2 = this.f11420n;
        if (aVar2 != null) {
            aVar2.c(this, i4);
        }
        boolean m4 = m(canvas, i4, 0);
        if (!m4 && (aVar = this.f11420n) != null) {
            aVar.b(this, i4);
        }
        com.facebook.fresco.animation.bitmap.preparation.a aVar3 = this.f11413g;
        if (aVar3 != null && (bVar = this.f11414h) != null) {
            aVar3.a(bVar, this.f11410d, this, i4);
        }
        return m4;
    }

    @Override // com.facebook.fresco.animation.backend.c.b
    public void i() {
        clear();
    }

    @Override // com.facebook.fresco.animation.backend.d
    public int j(int i4) {
        return this.f11411e.j(i4);
    }

    @Override // com.facebook.fresco.animation.backend.a
    public void k(@IntRange(from = 0, to = 255) int i4) {
        this.f11415i.setAlpha(i4);
    }

    public void o(Bitmap.Config config) {
        this.f11419m = config;
    }

    public void p(@Nullable a aVar) {
        this.f11420n = aVar;
    }
}
