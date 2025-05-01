package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
import javax.annotation.Nullable;
/* compiled from: RoundedColorDrawable.java */
/* loaded from: classes.dex */
public class n extends Drawable implements l {

    /* renamed from: b  reason: collision with root package name */
    private final float[] f11238b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final float[] f11239c;
    @VisibleForTesting
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    float[] f11240d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    final Paint f11241e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11242f;

    /* renamed from: g  reason: collision with root package name */
    private float f11243g;

    /* renamed from: h  reason: collision with root package name */
    private float f11244h;

    /* renamed from: i  reason: collision with root package name */
    private int f11245i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11246j;
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    final Path f11247k;
    @VisibleForTesting

    /* renamed from: l  reason: collision with root package name */
    final Path f11248l;

    /* renamed from: m  reason: collision with root package name */
    private int f11249m;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f11250n;

    /* renamed from: o  reason: collision with root package name */
    private int f11251o;

    public n(int i4) {
        this.f11238b = new float[8];
        this.f11239c = new float[8];
        this.f11241e = new Paint(1);
        this.f11242f = false;
        this.f11243g = 0.0f;
        this.f11244h = 0.0f;
        this.f11245i = 0;
        this.f11246j = false;
        this.f11247k = new Path();
        this.f11248l = new Path();
        this.f11249m = 0;
        this.f11250n = new RectF();
        this.f11251o = 255;
        f(i4);
    }

    @TargetApi(11)
    public static n d(ColorDrawable colorDrawable) {
        return new n(colorDrawable.getColor());
    }

    private void h() {
        float[] fArr;
        float[] fArr2;
        this.f11247k.reset();
        this.f11248l.reset();
        this.f11250n.set(getBounds());
        RectF rectF = this.f11250n;
        float f5 = this.f11243g;
        rectF.inset(f5 / 2.0f, f5 / 2.0f);
        int i4 = 0;
        if (this.f11242f) {
            this.f11248l.addCircle(this.f11250n.centerX(), this.f11250n.centerY(), Math.min(this.f11250n.width(), this.f11250n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i5 = 0;
            while (true) {
                fArr = this.f11239c;
                if (i5 >= fArr.length) {
                    break;
                }
                fArr[i5] = (this.f11238b[i5] + this.f11244h) - (this.f11243g / 2.0f);
                i5++;
            }
            this.f11248l.addRoundRect(this.f11250n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f11250n;
        float f6 = this.f11243g;
        rectF2.inset((-f6) / 2.0f, (-f6) / 2.0f);
        float f7 = this.f11244h + (this.f11246j ? this.f11243g : 0.0f);
        this.f11250n.inset(f7, f7);
        if (this.f11242f) {
            this.f11247k.addCircle(this.f11250n.centerX(), this.f11250n.centerY(), Math.min(this.f11250n.width(), this.f11250n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f11246j) {
            if (this.f11240d == null) {
                this.f11240d = new float[8];
            }
            while (true) {
                fArr2 = this.f11240d;
                if (i4 >= fArr2.length) {
                    break;
                }
                fArr2[i4] = this.f11238b[i4] - this.f11243g;
                i4++;
            }
            this.f11247k.addRoundRect(this.f11250n, fArr2, Path.Direction.CW);
        } else {
            this.f11247k.addRoundRect(this.f11250n, this.f11238b, Path.Direction.CW);
        }
        float f8 = -f7;
        this.f11250n.inset(f8, f8);
    }

    @Override // com.facebook.drawee.drawable.l
    public void a(int i4, float f5) {
        if (this.f11245i != i4) {
            this.f11245i = i4;
            invalidateSelf();
        }
        if (this.f11243g != f5) {
            this.f11243g = f5;
            h();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.l
    public boolean b() {
        return this.f11246j;
    }

    @Override // com.facebook.drawee.drawable.l
    public void c(boolean z4) {
        this.f11242f = z4;
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f11241e.setColor(f.d(this.f11249m, this.f11251o));
        this.f11241e.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.f11247k, this.f11241e);
        if (this.f11243g != 0.0f) {
            this.f11241e.setColor(f.d(this.f11245i, this.f11251o));
            this.f11241e.setStyle(Paint.Style.STROKE);
            this.f11241e.setStrokeWidth(this.f11243g);
            canvas.drawPath(this.f11248l, this.f11241e);
        }
    }

    public int e() {
        return this.f11249m;
    }

    public void f(int i4) {
        if (this.f11249m != i4) {
            this.f11249m = i4;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.l
    public void g(float f5) {
        if (this.f11244h != f5) {
            this.f11244h = f5;
            h();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11251o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return f.c(f.d(this.f11249m, this.f11251o));
    }

    @Override // com.facebook.drawee.drawable.l
    public boolean i() {
        return this.f11242f;
    }

    @Override // com.facebook.drawee.drawable.l
    public int j() {
        return this.f11245i;
    }

    @Override // com.facebook.drawee.drawable.l
    public float[] k() {
        return this.f11238b;
    }

    @Override // com.facebook.drawee.drawable.l
    public void l(boolean z4) {
        if (this.f11246j != z4) {
            this.f11246j = z4;
            h();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.l
    public float m() {
        return this.f11243g;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h();
    }

    @Override // com.facebook.drawee.drawable.l
    public float q() {
        return this.f11244h;
    }

    @Override // com.facebook.drawee.drawable.l
    public void r(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f11238b, 0.0f);
        } else {
            com.facebook.common.internal.h.e(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f11238b, 0, 8);
        }
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (i4 != this.f11251o) {
            this.f11251o = i4;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // com.facebook.drawee.drawable.l
    public void setRadius(float f5) {
        com.facebook.common.internal.h.e(f5 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f11238b, f5);
        h();
        invalidateSelf();
    }

    public n(float[] fArr, int i4) {
        this(i4);
        r(fArr);
    }

    public n(float f5, int i4) {
        this(i4);
        setRadius(f5);
    }
}
