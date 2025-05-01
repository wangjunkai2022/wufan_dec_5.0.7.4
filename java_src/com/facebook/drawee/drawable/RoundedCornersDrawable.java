package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class RoundedCornersDrawable extends h implements l {
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    Type f11161f;

    /* renamed from: g  reason: collision with root package name */
    private final RectF f11162g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private RectF f11163h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Matrix f11164i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f11165j;
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    final float[] f11166k;
    @VisibleForTesting

    /* renamed from: l  reason: collision with root package name */
    final Paint f11167l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11168m;

    /* renamed from: n  reason: collision with root package name */
    private float f11169n;

    /* renamed from: o  reason: collision with root package name */
    private int f11170o;

    /* renamed from: p  reason: collision with root package name */
    private int f11171p;

    /* renamed from: q  reason: collision with root package name */
    private float f11172q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11173r;

    /* renamed from: s  reason: collision with root package name */
    private final Path f11174s;

    /* renamed from: t  reason: collision with root package name */
    private final Path f11175t;

    /* renamed from: u  reason: collision with root package name */
    private final RectF f11176u;

    /* loaded from: classes2.dex */
    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11177a;

        static {
            int[] iArr = new int[Type.values().length];
            f11177a = iArr;
            try {
                iArr[Type.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11177a[Type.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) com.facebook.common.internal.h.i(drawable));
        this.f11161f = Type.OVERLAY_COLOR;
        this.f11162g = new RectF();
        this.f11165j = new float[8];
        this.f11166k = new float[8];
        this.f11167l = new Paint(1);
        this.f11168m = false;
        this.f11169n = 0.0f;
        this.f11170o = 0;
        this.f11171p = 0;
        this.f11172q = 0.0f;
        this.f11173r = false;
        this.f11174s = new Path();
        this.f11175t = new Path();
        this.f11176u = new RectF();
    }

    private void A() {
        float[] fArr;
        this.f11174s.reset();
        this.f11175t.reset();
        this.f11176u.set(getBounds());
        RectF rectF = this.f11176u;
        float f5 = this.f11172q;
        rectF.inset(f5, f5);
        this.f11174s.addRect(this.f11176u, Path.Direction.CW);
        if (this.f11168m) {
            this.f11174s.addCircle(this.f11176u.centerX(), this.f11176u.centerY(), Math.min(this.f11176u.width(), this.f11176u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f11174s.addRoundRect(this.f11176u, this.f11165j, Path.Direction.CW);
        }
        RectF rectF2 = this.f11176u;
        float f6 = this.f11172q;
        rectF2.inset(-f6, -f6);
        RectF rectF3 = this.f11176u;
        float f7 = this.f11169n;
        rectF3.inset(f7 / 2.0f, f7 / 2.0f);
        if (this.f11168m) {
            this.f11175t.addCircle(this.f11176u.centerX(), this.f11176u.centerY(), Math.min(this.f11176u.width(), this.f11176u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i4 = 0;
            while (true) {
                fArr = this.f11166k;
                if (i4 >= fArr.length) {
                    break;
                }
                fArr[i4] = (this.f11165j[i4] + this.f11172q) - (this.f11169n / 2.0f);
                i4++;
            }
            this.f11175t.addRoundRect(this.f11176u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f11176u;
        float f8 = this.f11169n;
        rectF4.inset((-f8) / 2.0f, (-f8) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.l
    public void a(int i4, float f5) {
        this.f11170o = i4;
        this.f11169n = f5;
        A();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.l
    public boolean b() {
        return this.f11173r;
    }

    @Override // com.facebook.drawee.drawable.l
    public void c(boolean z4) {
        this.f11168m = z4;
        A();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f11162g.set(getBounds());
        int i4 = a.f11177a[this.f11161f.ordinal()];
        if (i4 == 1) {
            int save = canvas.save();
            this.f11174s.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.f11174s);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i4 == 2) {
            if (this.f11173r) {
                RectF rectF = this.f11163h;
                if (rectF == null) {
                    this.f11163h = new RectF(this.f11162g);
                    this.f11164i = new Matrix();
                } else {
                    rectF.set(this.f11162g);
                }
                RectF rectF2 = this.f11163h;
                float f5 = this.f11169n;
                rectF2.inset(f5, f5);
                this.f11164i.setRectToRect(this.f11162g, this.f11163h, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f11162g);
                canvas.concat(this.f11164i);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f11167l.setStyle(Paint.Style.FILL);
            this.f11167l.setColor(this.f11171p);
            this.f11167l.setStrokeWidth(0.0f);
            this.f11174s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f11174s, this.f11167l);
            if (this.f11168m) {
                float width = ((this.f11162g.width() - this.f11162g.height()) + this.f11169n) / 2.0f;
                float height = ((this.f11162g.height() - this.f11162g.width()) + this.f11169n) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f11162g;
                    float f6 = rectF3.left;
                    canvas.drawRect(f6, rectF3.top, f6 + width, rectF3.bottom, this.f11167l);
                    RectF rectF4 = this.f11162g;
                    float f7 = rectF4.right;
                    canvas.drawRect(f7 - width, rectF4.top, f7, rectF4.bottom, this.f11167l);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f11162g;
                    float f8 = rectF5.left;
                    float f9 = rectF5.top;
                    canvas.drawRect(f8, f9, rectF5.right, f9 + height, this.f11167l);
                    RectF rectF6 = this.f11162g;
                    float f10 = rectF6.left;
                    float f11 = rectF6.bottom;
                    canvas.drawRect(f10, f11 - height, rectF6.right, f11, this.f11167l);
                }
            }
        }
        if (this.f11170o != 0) {
            this.f11167l.setStyle(Paint.Style.STROKE);
            this.f11167l.setColor(this.f11170o);
            this.f11167l.setStrokeWidth(this.f11169n);
            this.f11174s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f11175t, this.f11167l);
        }
    }

    @Override // com.facebook.drawee.drawable.l
    public void g(float f5) {
        this.f11172q = f5;
        A();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.l
    public boolean i() {
        return this.f11168m;
    }

    @Override // com.facebook.drawee.drawable.l
    public int j() {
        return this.f11170o;
    }

    @Override // com.facebook.drawee.drawable.l
    public float[] k() {
        return this.f11165j;
    }

    @Override // com.facebook.drawee.drawable.l
    public void l(boolean z4) {
        this.f11173r = z4;
        A();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.l
    public float m() {
        return this.f11169n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A();
    }

    @Override // com.facebook.drawee.drawable.l
    public float q() {
        return this.f11172q;
    }

    @Override // com.facebook.drawee.drawable.l
    public void r(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f11165j, 0.0f);
        } else {
            com.facebook.common.internal.h.e(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f11165j, 0, 8);
        }
        A();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.l
    public void setRadius(float f5) {
        Arrays.fill(this.f11165j, f5);
        A();
        invalidateSelf();
    }

    public int x() {
        return this.f11171p;
    }

    public void y(int i4) {
        this.f11171p = i4;
        invalidateSelf();
    }

    public void z(Type type) {
        this.f11161f = type;
        invalidateSelf();
    }
}
