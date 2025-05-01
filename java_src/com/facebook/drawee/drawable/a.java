package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;
/* compiled from: ArrayDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements Drawable.Callback, t, s {

    /* renamed from: b  reason: collision with root package name */
    private t f11178b;

    /* renamed from: d  reason: collision with root package name */
    private final Drawable[] f11180d;

    /* renamed from: e  reason: collision with root package name */
    private final d[] f11181e;

    /* renamed from: c  reason: collision with root package name */
    private final e f11179c = new e();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f11182f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private boolean f11183g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11184h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11185i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDrawable.java */
    /* renamed from: com.facebook.drawee.drawable.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0260a implements d {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11186b;

        C0260a(int i4) {
            this.f11186b = i4;
        }

        @Override // com.facebook.drawee.drawable.d
        public Drawable f(Drawable drawable) {
            return a.this.f(this.f11186b, drawable);
        }

        @Override // com.facebook.drawee.drawable.d
        public Drawable p() {
            return a.this.b(this.f11186b);
        }
    }

    public a(Drawable[] drawableArr) {
        int i4 = 0;
        com.facebook.common.internal.h.i(drawableArr);
        this.f11180d = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f11180d;
            if (i4 < drawableArr2.length) {
                f.e(drawableArr2[i4], this, this);
                i4++;
            } else {
                this.f11181e = new d[drawableArr2.length];
                return;
            }
        }
    }

    private d a(int i4) {
        return new C0260a(i4);
    }

    @Nullable
    public Drawable b(int i4) {
        com.facebook.common.internal.h.d(i4 >= 0);
        com.facebook.common.internal.h.d(i4 < this.f11180d.length);
        return this.f11180d[i4];
    }

    public d c(int i4) {
        com.facebook.common.internal.h.d(i4 >= 0);
        com.facebook.common.internal.h.d(i4 < this.f11181e.length);
        d[] dVarArr = this.f11181e;
        if (dVarArr[i4] == null) {
            dVarArr[i4] = a(i4);
        }
        return this.f11181e[i4];
    }

    public int d() {
        return this.f11180d.length;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i4++;
        }
    }

    @Override // com.facebook.drawee.drawable.t
    public void e(Matrix matrix) {
        t tVar = this.f11178b;
        if (tVar != null) {
            tVar.e(matrix);
        } else {
            matrix.reset();
        }
    }

    @Nullable
    public Drawable f(int i4, @Nullable Drawable drawable) {
        com.facebook.common.internal.h.d(i4 >= 0);
        com.facebook.common.internal.h.d(i4 < this.f11180d.length);
        Drawable drawable2 = this.f11180d[i4];
        if (drawable != drawable2) {
            if (drawable != null && this.f11185i) {
                drawable.mutate();
            }
            f.e(this.f11180d[i4], null, null);
            f.e(drawable, null, null);
            f.f(drawable, this.f11179c);
            f.b(drawable, this);
            f.e(drawable, this, this);
            this.f11184h = false;
            this.f11180d[i4] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i4 = 0;
        int i5 = -1;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                i5 = Math.max(i5, drawable.getIntrinsicHeight());
            }
            i4++;
        }
        if (i5 > 0) {
            return i5;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i4 = 0;
        int i5 = -1;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                i5 = Math.max(i5, drawable.getIntrinsicWidth());
            }
            i4++;
        }
        if (i5 > 0) {
            return i5;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f11180d.length == 0) {
            return -2;
        }
        int i4 = -1;
        int i5 = 1;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i5 >= drawableArr.length) {
                return i4;
            }
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                i4 = Drawable.resolveOpacity(i4, drawable.getOpacity());
            }
            i5++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i4 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f11182f;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i4++;
        }
    }

    @Override // com.facebook.drawee.drawable.s
    public void h(t tVar) {
        this.f11178b = tVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f11184h) {
            this.f11183g = false;
            int i4 = 0;
            while (true) {
                Drawable[] drawableArr = this.f11180d;
                boolean z4 = true;
                if (i4 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i4];
                boolean z5 = this.f11183g;
                if (drawable == null || !drawable.isStateful()) {
                    z4 = false;
                }
                this.f11183g = z5 | z4;
                i4++;
            }
            this.f11184h = true;
        }
        return this.f11183g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 < drawableArr.length) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    drawable.mutate();
                }
                i4++;
            } else {
                this.f11185i = true;
                return this;
            }
        }
    }

    @Override // com.facebook.drawee.drawable.t
    public void n(RectF rectF) {
        t tVar = this.f11178b;
        if (tVar != null) {
            tVar.n(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i5 >= drawableArr.length) {
                return z4;
            }
            Drawable drawable = drawableArr[i5];
            if (drawable != null && drawable.setLevel(i4)) {
                z4 = true;
            }
            i5++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return z4;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null && drawable.setState(iArr)) {
                z4 = true;
            }
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f11179c.b(i4);
        int i5 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i5 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                drawable.setAlpha(i4);
            }
            i5++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11179c.c(colorFilter);
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z4) {
        this.f11179c.d(z4);
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.setDither(z4);
            }
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        this.f11179c.e(z4);
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.setFilterBitmap(z4);
            }
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f5, float f6) {
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.setHotspot(f5, f6);
            }
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f11180d;
            if (i4 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                drawable.setVisible(z4, z5);
            }
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
