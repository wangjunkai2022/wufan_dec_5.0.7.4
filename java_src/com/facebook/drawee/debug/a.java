package com.facebook.drawee.debug;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.r;
import javax.annotation.Nullable;
import n0.b;
/* compiled from: DebugControllerOverlayDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements b {
    private static final float A = 0.1f;
    private static final float B = 0.5f;
    private static final int C = -26624;
    private static final int D = -1;
    private static final int E = 2;
    private static final int F = 40;
    private static final int G = 10;
    private static final int H = 8;
    private static final int I = 10;
    private static final int J = 9;
    private static final int K = 8;

    /* renamed from: w  reason: collision with root package name */
    private static final String f11136w = "none";
    @VisibleForTesting

    /* renamed from: x  reason: collision with root package name */
    static final int f11137x = 1716301648;
    @VisibleForTesting

    /* renamed from: y  reason: collision with root package name */
    static final int f11138y = 1728026624;
    @VisibleForTesting

    /* renamed from: z  reason: collision with root package name */
    static final int f11139z = 1727284022;

    /* renamed from: b  reason: collision with root package name */
    private String f11140b;

    /* renamed from: c  reason: collision with root package name */
    private String f11141c;

    /* renamed from: d  reason: collision with root package name */
    private int f11142d;

    /* renamed from: e  reason: collision with root package name */
    private int f11143e;

    /* renamed from: f  reason: collision with root package name */
    private int f11144f;

    /* renamed from: g  reason: collision with root package name */
    private String f11145g;

    /* renamed from: h  reason: collision with root package name */
    private r.c f11146h;

    /* renamed from: i  reason: collision with root package name */
    private int f11147i;

    /* renamed from: j  reason: collision with root package name */
    private int f11148j;

    /* renamed from: k  reason: collision with root package name */
    private int f11149k = 80;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f11150l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    private final Matrix f11151m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    private final Rect f11152n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final RectF f11153o = new RectF();

    /* renamed from: p  reason: collision with root package name */
    private int f11154p;

    /* renamed from: q  reason: collision with root package name */
    private int f11155q;

    /* renamed from: r  reason: collision with root package name */
    private int f11156r;

    /* renamed from: s  reason: collision with root package name */
    private int f11157s;

    /* renamed from: t  reason: collision with root package name */
    private int f11158t;

    /* renamed from: u  reason: collision with root package name */
    private long f11159u;

    /* renamed from: v  reason: collision with root package name */
    private String f11160v;

    public a() {
        e();
    }

    private void b(Canvas canvas, String str, @Nullable Object... objArr) {
        if (objArr == null) {
            canvas.drawText(str, this.f11157s, this.f11158t, this.f11150l);
        } else {
            canvas.drawText(String.format(str, objArr), this.f11157s, this.f11158t, this.f11150l);
        }
        this.f11158t += this.f11156r;
    }

    private void d(Rect rect, int i4, int i5) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i5, rect.height() / i4)));
        this.f11150l.setTextSize(min);
        int i6 = min + 8;
        this.f11156r = i6;
        int i7 = this.f11149k;
        if (i7 == 80) {
            this.f11156r = i6 * (-1);
        }
        this.f11154p = rect.left + 10;
        this.f11155q = i7 == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    @Override // n0.b
    public void a(long j4) {
        this.f11159u = j4;
        invalidateSelf();
    }

    @VisibleForTesting
    int c(int i4, int i5, @Nullable r.c cVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i4 > 0 && i5 > 0) {
            if (cVar != null) {
                Rect rect = this.f11152n;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f11151m.reset();
                cVar.a(this.f11151m, this.f11152n, i4, i5, 0.0f, 0.0f);
                RectF rectF = this.f11153o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i4;
                rectF.bottom = i5;
                this.f11151m.mapRect(rectF);
                width = Math.min(width, (int) this.f11153o.width());
                height = Math.min(height, (int) this.f11153o.height());
            }
            float f5 = width;
            float f6 = f5 * 0.1f;
            float f7 = f5 * 0.5f;
            float f8 = height;
            float f9 = 0.1f * f8;
            float f10 = f8 * 0.5f;
            int abs = Math.abs(i4 - width);
            int abs2 = Math.abs(i5 - height);
            float f11 = abs;
            if (f11 < f6 && abs2 < f9) {
                return f11137x;
            }
            if (f11 < f7 && abs2 < f10) {
                return f11138y;
            }
        }
        return f11139z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f11150l.setStyle(Paint.Style.STROKE);
        this.f11150l.setStrokeWidth(2.0f);
        this.f11150l.setColor(C);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f11150l);
        this.f11150l.setStyle(Paint.Style.FILL);
        this.f11150l.setColor(c(this.f11142d, this.f11143e, this.f11146h));
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f11150l);
        this.f11150l.setStyle(Paint.Style.FILL);
        this.f11150l.setStrokeWidth(0.0f);
        this.f11150l.setColor(-1);
        this.f11157s = this.f11154p;
        this.f11158t = this.f11155q;
        String str = this.f11141c;
        if (str != null) {
            b(canvas, "IDs: %s, %s", this.f11140b, str);
        } else {
            b(canvas, "ID: %s", this.f11140b);
        }
        b(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        b(canvas, "I: %dx%d", Integer.valueOf(this.f11142d), Integer.valueOf(this.f11143e));
        b(canvas, "I: %d KiB", Integer.valueOf(this.f11144f / 1024));
        String str2 = this.f11145g;
        if (str2 != null) {
            b(canvas, "i format: %s", str2);
        }
        int i4 = this.f11147i;
        if (i4 > 0) {
            b(canvas, "anim: f %d, l %d", Integer.valueOf(i4), Integer.valueOf(this.f11148j));
        }
        r.c cVar = this.f11146h;
        if (cVar != null) {
            b(canvas, "scale: %s", cVar);
        }
        long j4 = this.f11159u;
        if (j4 >= 0) {
            b(canvas, "t: %d ms", Long.valueOf(j4));
        }
        String str3 = this.f11160v;
        if (str3 != null) {
            b(canvas, "origin: %s", str3);
        }
    }

    public void e() {
        this.f11142d = -1;
        this.f11143e = -1;
        this.f11144f = -1;
        this.f11147i = -1;
        this.f11148j = -1;
        this.f11145g = null;
        g(null);
        this.f11159u = -1L;
        this.f11160v = null;
        invalidateSelf();
    }

    public void f(int i4, int i5) {
        this.f11147i = i4;
        this.f11148j = i5;
        invalidateSelf();
    }

    public void g(@Nullable String str) {
        if (str == null) {
            str = "none";
        }
        this.f11140b = str;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(int i4, int i5) {
        this.f11142d = i4;
        this.f11143e = i5;
        invalidateSelf();
    }

    public void i(long j4) {
        this.f11159u = j4;
    }

    public void j(@Nullable String str) {
        this.f11145g = str;
    }

    public void k(@Nullable String str) {
        this.f11141c = str;
        invalidateSelf();
    }

    public void l(int i4) {
        this.f11144f = i4;
    }

    public void m(String str) {
        this.f11160v = str;
        invalidateSelf();
    }

    public void n(r.c cVar) {
        this.f11146h = cVar;
    }

    public void o(int i4) {
        this.f11149k = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
