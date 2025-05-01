package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
/* compiled from: RoundedDrawable.java */
/* loaded from: classes2.dex */
public abstract class o extends Drawable implements l, s {
    @Nullable
    private t C;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f11252b;
    @Nullable
    @VisibleForTesting

    /* renamed from: l  reason: collision with root package name */
    float[] f11262l;
    @Nullable
    @VisibleForTesting

    /* renamed from: q  reason: collision with root package name */
    RectF f11267q;
    @Nullable
    @VisibleForTesting

    /* renamed from: w  reason: collision with root package name */
    Matrix f11273w;
    @Nullable
    @VisibleForTesting

    /* renamed from: x  reason: collision with root package name */
    Matrix f11274x;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f11253c = false;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f11254d = false;

    /* renamed from: e  reason: collision with root package name */
    protected float f11255e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    protected final Path f11256f = new Path();

    /* renamed from: g  reason: collision with root package name */
    protected boolean f11257g = true;

    /* renamed from: h  reason: collision with root package name */
    protected int f11258h = 0;

    /* renamed from: i  reason: collision with root package name */
    protected final Path f11259i = new Path();

    /* renamed from: j  reason: collision with root package name */
    private final float[] f11260j = new float[8];
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    final float[] f11261k = new float[8];
    @VisibleForTesting

    /* renamed from: m  reason: collision with root package name */
    final RectF f11263m = new RectF();
    @VisibleForTesting

    /* renamed from: n  reason: collision with root package name */
    final RectF f11264n = new RectF();
    @VisibleForTesting

    /* renamed from: o  reason: collision with root package name */
    final RectF f11265o = new RectF();
    @VisibleForTesting

    /* renamed from: p  reason: collision with root package name */
    final RectF f11266p = new RectF();
    @VisibleForTesting

    /* renamed from: r  reason: collision with root package name */
    final Matrix f11268r = new Matrix();
    @VisibleForTesting

    /* renamed from: s  reason: collision with root package name */
    final Matrix f11269s = new Matrix();
    @VisibleForTesting

    /* renamed from: t  reason: collision with root package name */
    final Matrix f11270t = new Matrix();
    @VisibleForTesting

    /* renamed from: u  reason: collision with root package name */
    final Matrix f11271u = new Matrix();
    @VisibleForTesting

    /* renamed from: v  reason: collision with root package name */
    final Matrix f11272v = new Matrix();
    @VisibleForTesting

    /* renamed from: y  reason: collision with root package name */
    final Matrix f11275y = new Matrix();

    /* renamed from: z  reason: collision with root package name */
    private float f11276z = 0.0f;
    private boolean A = false;
    private boolean B = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Drawable drawable) {
        this.f11252b = drawable;
    }

    @Override // com.facebook.drawee.drawable.l
    public void a(int i4, float f5) {
        if (this.f11258h == i4 && this.f11255e == f5) {
            return;
        }
        this.f11258h = i4;
        this.f11255e = f5;
        this.B = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.l
    public boolean b() {
        return this.A;
    }

    @Override // com.facebook.drawee.drawable.l
    public void c(boolean z4) {
        this.f11253c = z4;
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f11252b.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean d() {
        return this.f11253c || this.f11254d || this.f11255e > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("RoundedDrawable#draw");
        }
        this.f11252b.draw(canvas);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        float[] fArr;
        if (this.B) {
            this.f11259i.reset();
            RectF rectF = this.f11263m;
            float f5 = this.f11255e;
            rectF.inset(f5 / 2.0f, f5 / 2.0f);
            if (this.f11253c) {
                this.f11259i.addCircle(this.f11263m.centerX(), this.f11263m.centerY(), Math.min(this.f11263m.width(), this.f11263m.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i4 = 0;
                while (true) {
                    fArr = this.f11261k;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    fArr[i4] = (this.f11260j[i4] + this.f11276z) - (this.f11255e / 2.0f);
                    i4++;
                }
                this.f11259i.addRoundRect(this.f11263m, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f11263m;
            float f6 = this.f11255e;
            rectF2.inset((-f6) / 2.0f, (-f6) / 2.0f);
            this.f11256f.reset();
            float f7 = this.f11276z + (this.A ? this.f11255e : 0.0f);
            this.f11263m.inset(f7, f7);
            if (this.f11253c) {
                this.f11256f.addCircle(this.f11263m.centerX(), this.f11263m.centerY(), Math.min(this.f11263m.width(), this.f11263m.height()) / 2.0f, Path.Direction.CW);
            } else if (this.A) {
                if (this.f11262l == null) {
                    this.f11262l = new float[8];
                }
                for (int i5 = 0; i5 < this.f11261k.length; i5++) {
                    this.f11262l[i5] = this.f11260j[i5] - this.f11255e;
                }
                this.f11256f.addRoundRect(this.f11263m, this.f11262l, Path.Direction.CW);
            } else {
                this.f11256f.addRoundRect(this.f11263m, this.f11260j, Path.Direction.CW);
            }
            float f8 = -f7;
            this.f11263m.inset(f8, f8);
            this.f11256f.setFillType(Path.FillType.WINDING);
            this.B = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        Matrix matrix;
        t tVar = this.C;
        if (tVar != null) {
            tVar.e(this.f11270t);
            this.C.n(this.f11263m);
        } else {
            this.f11270t.reset();
            this.f11263m.set(getBounds());
        }
        this.f11265o.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f11266p.set(this.f11252b.getBounds());
        this.f11268r.setRectToRect(this.f11265o, this.f11266p, Matrix.ScaleToFit.FILL);
        if (this.A) {
            RectF rectF = this.f11267q;
            if (rectF == null) {
                this.f11267q = new RectF(this.f11263m);
            } else {
                rectF.set(this.f11263m);
            }
            RectF rectF2 = this.f11267q;
            float f5 = this.f11255e;
            rectF2.inset(f5, f5);
            if (this.f11273w == null) {
                this.f11273w = new Matrix();
            }
            this.f11273w.setRectToRect(this.f11263m, this.f11267q, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f11273w;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f11270t.equals(this.f11271u) || !this.f11268r.equals(this.f11269s) || ((matrix = this.f11273w) != null && !matrix.equals(this.f11274x))) {
            this.f11257g = true;
            this.f11270t.invert(this.f11272v);
            this.f11275y.set(this.f11270t);
            if (this.A) {
                this.f11275y.postConcat(this.f11273w);
            }
            this.f11275y.preConcat(this.f11268r);
            this.f11271u.set(this.f11270t);
            this.f11269s.set(this.f11268r);
            if (this.A) {
                Matrix matrix3 = this.f11274x;
                if (matrix3 == null) {
                    this.f11274x = new Matrix(this.f11273w);
                } else {
                    matrix3.set(this.f11273w);
                }
            } else {
                Matrix matrix4 = this.f11274x;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.f11263m.equals(this.f11264n)) {
            return;
        }
        this.B = true;
        this.f11264n.set(this.f11263m);
    }

    @Override // com.facebook.drawee.drawable.l
    public void g(float f5) {
        if (this.f11276z != f5) {
            this.f11276z = f5;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.f11252b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.f11252b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11252b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11252b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f11252b.getOpacity();
    }

    @Override // com.facebook.drawee.drawable.s
    public void h(@Nullable t tVar) {
        this.C = tVar;
    }

    @Override // com.facebook.drawee.drawable.l
    public boolean i() {
        return this.f11253c;
    }

    @Override // com.facebook.drawee.drawable.l
    public int j() {
        return this.f11258h;
    }

    @Override // com.facebook.drawee.drawable.l
    public float[] k() {
        return this.f11260j;
    }

    @Override // com.facebook.drawee.drawable.l
    public void l(boolean z4) {
        if (this.A != z4) {
            this.A = z4;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.l
    public float m() {
        return this.f11255e;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f11252b.setBounds(rect);
    }

    @Override // com.facebook.drawee.drawable.l
    public float q() {
        return this.f11276z;
    }

    @Override // com.facebook.drawee.drawable.l
    public void r(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f11260j, 0.0f);
            this.f11254d = false;
        } else {
            com.facebook.common.internal.h.e(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f11260j, 0, 8);
            this.f11254d = false;
            for (int i4 = 0; i4 < 8; i4++) {
                this.f11254d |= fArr[i4] > 0.0f;
            }
        }
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f11252b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i4, @NonNull PorterDuff.Mode mode) {
        this.f11252b.setColorFilter(i4, mode);
    }

    @Override // com.facebook.drawee.drawable.l
    public void setRadius(float f5) {
        com.facebook.common.internal.h.o(f5 >= 0.0f);
        Arrays.fill(this.f11260j, f5);
        this.f11254d = f5 != 0.0f;
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f11252b.setColorFilter(colorFilter);
    }
}
