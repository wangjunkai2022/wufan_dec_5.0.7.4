package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: ProgressBarDrawable.java */
/* loaded from: classes2.dex */
public class k extends Drawable implements c {

    /* renamed from: b  reason: collision with root package name */
    private final Paint f11227b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    private final Path f11228c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f11229d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private int f11230e = Integer.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private int f11231f = -2147450625;

    /* renamed from: g  reason: collision with root package name */
    private int f11232g = 10;

    /* renamed from: h  reason: collision with root package name */
    private int f11233h = 20;

    /* renamed from: i  reason: collision with root package name */
    private int f11234i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f11235j = 0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11236k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11237l = false;

    private void a(Canvas canvas, int i4) {
        this.f11227b.setColor(i4);
        this.f11227b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f11228c.reset();
        this.f11228c.setFillType(Path.FillType.EVEN_ODD);
        this.f11228c.addRoundRect(this.f11229d, Math.min(this.f11235j, this.f11233h / 2), Math.min(this.f11235j, this.f11233h / 2), Path.Direction.CW);
        canvas.drawPath(this.f11228c, this.f11227b);
    }

    private void b(Canvas canvas, int i4, int i5) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int i6 = this.f11232g;
        int i7 = bounds.left + i6;
        int i8 = bounds.bottom - i6;
        int i9 = this.f11233h;
        int i10 = i8 - i9;
        this.f11229d.set(i7, i10, i7 + (((width - (i6 * 2)) * i4) / 10000), i10 + i9);
        a(canvas, i5);
    }

    private void c(Canvas canvas, int i4, int i5) {
        Rect bounds = getBounds();
        int height = bounds.height();
        int i6 = this.f11232g;
        int i7 = bounds.left + i6;
        int i8 = bounds.top + i6;
        this.f11229d.set(i7, i8, i7 + this.f11233h, i8 + (((height - (i6 * 2)) * i4) / 10000));
        a(canvas, i5);
    }

    @Override // com.facebook.drawee.drawable.c
    public Drawable d() {
        k kVar = new k();
        kVar.f11230e = this.f11230e;
        kVar.f11231f = this.f11231f;
        kVar.f11232g = this.f11232g;
        kVar.f11233h = this.f11233h;
        kVar.f11234i = this.f11234i;
        kVar.f11235j = this.f11235j;
        kVar.f11236k = this.f11236k;
        kVar.f11237l = this.f11237l;
        return kVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f11236k && this.f11234i == 0) {
            return;
        }
        if (this.f11237l) {
            c(canvas, 10000, this.f11230e);
            c(canvas, this.f11234i, this.f11231f);
            return;
        }
        b(canvas, 10000, this.f11230e);
        b(canvas, this.f11234i, this.f11231f);
    }

    public int e() {
        return this.f11230e;
    }

    public int f() {
        return this.f11233h;
    }

    public int g() {
        return this.f11231f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return f.c(this.f11227b.getColor());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i4 = this.f11232g;
        rect.set(i4, i4, i4, i4);
        return this.f11232g != 0;
    }

    public boolean h() {
        return this.f11236k;
    }

    public boolean i() {
        return this.f11237l;
    }

    public int j() {
        return this.f11235j;
    }

    public void k(int i4) {
        if (this.f11230e != i4) {
            this.f11230e = i4;
            invalidateSelf();
        }
    }

    public void l(int i4) {
        if (this.f11233h != i4) {
            this.f11233h = i4;
            invalidateSelf();
        }
    }

    public void m(int i4) {
        if (this.f11231f != i4) {
            this.f11231f = i4;
            invalidateSelf();
        }
    }

    public void n(boolean z4) {
        this.f11236k = z4;
    }

    public void o(boolean z4) {
        if (this.f11237l != z4) {
            this.f11237l = z4;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        this.f11234i = i4;
        invalidateSelf();
        return true;
    }

    public void p(int i4) {
        if (this.f11232g != i4) {
            this.f11232g = i4;
            invalidateSelf();
        }
    }

    public void q(int i4) {
        if (this.f11235j != i4) {
            this.f11235j = i4;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f11227b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11227b.setColorFilter(colorFilter);
    }
}
