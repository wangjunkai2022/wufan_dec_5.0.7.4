package com.join.android.app.common.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public class HighlightView {

    /* renamed from: q  reason: collision with root package name */
    private static final String f14924q = "HighlightView";

    /* renamed from: r  reason: collision with root package name */
    public static final int f14925r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f14926s = 2;

    /* renamed from: t  reason: collision with root package name */
    public static final int f14927t = 4;

    /* renamed from: u  reason: collision with root package name */
    public static final int f14928u = 8;

    /* renamed from: v  reason: collision with root package name */
    public static final int f14929v = 16;

    /* renamed from: w  reason: collision with root package name */
    public static final int f14930w = 32;

    /* renamed from: a  reason: collision with root package name */
    View f14931a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14932b;

    /* renamed from: c  reason: collision with root package name */
    boolean f14933c;

    /* renamed from: e  reason: collision with root package name */
    public Rect f14935e;

    /* renamed from: f  reason: collision with root package name */
    public RectF f14936f;

    /* renamed from: g  reason: collision with root package name */
    public RectF f14937g;

    /* renamed from: h  reason: collision with root package name */
    public Matrix f14938h;

    /* renamed from: j  reason: collision with root package name */
    private float f14940j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f14942l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f14943m;

    /* renamed from: d  reason: collision with root package name */
    private ModifyMode f14934d = ModifyMode.None;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14939i = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14941k = false;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f14944n = new Paint();

    /* renamed from: o  reason: collision with root package name */
    private final Paint f14945o = new Paint();

    /* renamed from: p  reason: collision with root package name */
    private final Paint f14946p = new Paint();

    /* loaded from: classes3.dex */
    public enum ModifyMode {
        None,
        Move,
        Grow
    }

    public HighlightView(View view) {
        this.f14931a = view;
    }

    private Rect a() {
        RectF rectF = this.f14937g;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.f14938h.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }

    private void h() {
        Resources resources = this.f14931a.getResources();
        this.f14942l = resources.getDrawable(R.drawable.picture_cut_button_normal);
        this.f14943m = resources.getDrawable(R.drawable.picture_cut_button_normal);
    }

    public void b(Canvas canvas) {
        if (this.f14933c) {
            return;
        }
        canvas.save();
        Path path = new Path();
        if (!g()) {
            this.f14946p.setColor(-16777216);
            canvas.drawRect(this.f14935e, this.f14946p);
            return;
        }
        Rect rect = new Rect();
        this.f14931a.getDrawingRect(rect);
        if (this.f14941k) {
            Rect rect2 = this.f14935e;
            float width = this.f14935e.width() / 2.0f;
            path.addCircle(rect2.left + width, rect2.top + (this.f14935e.height() / 2.0f), width, Path.Direction.CW);
            this.f14946p.setColor(-1112874);
        } else {
            path.addRect(new RectF(this.f14935e), Path.Direction.CW);
            this.f14946p.setColor(-1);
        }
        Region region = new Region();
        region.set(rect);
        region.op(this.f14935e, Region.Op.DIFFERENCE);
        RegionIterator regionIterator = new RegionIterator(region);
        Rect rect3 = new Rect();
        while (regionIterator.next(rect3)) {
            canvas.drawRect(rect3, g() ? this.f14944n : this.f14945o);
        }
        canvas.restore();
        canvas.drawPath(path, this.f14946p);
        if (this.f14934d == ModifyMode.Grow && this.f14941k) {
            int intrinsicWidth = this.f14942l.getIntrinsicWidth();
            int intrinsicHeight = this.f14942l.getIntrinsicHeight();
            double cos = Math.cos(0.7853981633974483d);
            double width2 = this.f14935e.width();
            Double.isNaN(width2);
            int round = (int) Math.round(cos * (width2 / 2.0d));
            Rect rect4 = this.f14935e;
            int width3 = ((rect4.left + (rect4.width() / 2)) + round) - (intrinsicWidth / 2);
            Rect rect5 = this.f14935e;
            int height = ((rect5.top + (rect5.height() / 2)) - round) - (intrinsicHeight / 2);
            Drawable drawable = this.f14942l;
            drawable.setBounds(width3, height, drawable.getIntrinsicWidth() + width3, this.f14942l.getIntrinsicHeight() + height);
            this.f14942l.draw(canvas);
        }
        if (this.f14941k) {
            return;
        }
        Rect rect6 = this.f14935e;
        int i4 = rect6.left + 1;
        int i5 = rect6.right + 1;
        int i6 = rect6.top + 4;
        int i7 = rect6.bottom + 3;
        int intrinsicWidth2 = this.f14942l.getIntrinsicWidth() / 2;
        int intrinsicHeight2 = this.f14942l.getIntrinsicHeight() / 2;
        int i8 = i4 - intrinsicWidth2;
        int i9 = i6 - intrinsicHeight2;
        int i10 = i4 + intrinsicWidth2;
        int i11 = i6 + intrinsicHeight2;
        this.f14943m.setBounds(i8, i9, i10, i11);
        this.f14943m.draw(canvas);
        int i12 = i5 - intrinsicWidth2;
        int i13 = i5 + intrinsicWidth2;
        this.f14942l.setBounds(i12, i9, i13, i11);
        this.f14942l.draw(canvas);
        int i14 = i7 - intrinsicHeight2;
        int i15 = i7 + intrinsicHeight2;
        this.f14942l.setBounds(i8, i14, i10, i15);
        this.f14942l.draw(canvas);
        this.f14943m.setBounds(i12, i14, i13, i15);
        this.f14943m.draw(canvas);
    }

    public Rect c() {
        RectF rectF = this.f14937g;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public int d(float f5, float f6) {
        Rect a5 = a();
        if (this.f14941k) {
            float centerX = f5 - a5.centerX();
            float centerY = f6 - a5.centerY();
            int sqrt = (int) Math.sqrt((centerX * centerX) + (centerY * centerY));
            int width = this.f14935e.width() / 2;
            return ((float) Math.abs(sqrt - width)) <= 20.0f ? Math.abs(centerY) > Math.abs(centerX) ? centerY < 0.0f ? 8 : 16 : centerX < 0.0f ? 2 : 4 : sqrt < width ? 32 : 1;
        }
        boolean z4 = false;
        boolean z5 = f6 >= ((float) a5.top) - 20.0f && f6 < ((float) a5.bottom) + 20.0f;
        int i4 = a5.left;
        if (f5 >= i4 - 20.0f && f5 < a5.right + 20.0f) {
            z4 = true;
        }
        int i5 = (Math.abs(((float) i4) - f5) >= 20.0f || !z5) ? 1 : 3;
        if (Math.abs(a5.right - f5) < 20.0f && z5) {
            i5 |= 4;
        }
        if (Math.abs(a5.top - f6) < 20.0f && z4) {
            i5 |= 8;
        }
        if (Math.abs(a5.bottom - f6) < 20.0f && z4) {
            i5 |= 16;
        }
        if (i5 == 1 && a5.contains((int) f5, (int) f6)) {
            return 32;
        }
        return i5;
    }

    void e(float f5, float f6) {
        if (this.f14939i) {
            if (f5 != 0.0f) {
                f6 = f5 / this.f14940j;
            } else if (f6 != 0.0f) {
                f5 = this.f14940j * f6;
            }
        }
        RectF rectF = new RectF(this.f14937g);
        if (f5 > 0.0f && rectF.width() + (f5 * 2.0f) > this.f14936f.width()) {
            f5 = (this.f14936f.width() - rectF.width()) / 2.0f;
            if (this.f14939i) {
                f6 = f5 / this.f14940j;
            }
        }
        if (f6 > 0.0f && rectF.height() + (f6 * 2.0f) > this.f14936f.height()) {
            f6 = (this.f14936f.height() - rectF.height()) / 2.0f;
            if (this.f14939i) {
                f5 = this.f14940j * f6;
            }
        }
        rectF.inset(-f5, -f6);
        if (rectF.width() < 25.0f) {
            return;
        }
        if (rectF.height() < (this.f14939i ? 25.0f / this.f14940j : 25.0f)) {
            return;
        }
        float f7 = rectF.left;
        RectF rectF2 = this.f14936f;
        float f8 = rectF2.left;
        if (f7 < f8) {
            rectF.offset(f8 - f7, 0.0f);
        } else {
            float f9 = rectF.right;
            float f10 = rectF2.right;
            if (f9 > f10) {
                rectF.offset(-(f9 - f10), 0.0f);
            }
        }
        float f11 = rectF.top;
        RectF rectF3 = this.f14936f;
        float f12 = rectF3.top;
        if (f11 < f12) {
            rectF.offset(0.0f, f12 - f11);
        } else {
            float f13 = rectF.bottom;
            float f14 = rectF3.bottom;
            if (f13 > f14) {
                rectF.offset(0.0f, -(f13 - f14));
            }
        }
        this.f14937g.set(rectF);
        this.f14935e = a();
        this.f14931a.invalidate();
    }

    public void f(int i4, float f5, float f6) {
        Rect a5 = a();
        if (i4 == 1) {
            return;
        }
        if (i4 == 32) {
            j(f5 * (this.f14937g.width() / a5.width()), f6 * (this.f14937g.height() / a5.height()));
            return;
        }
        if ((i4 & 6) == 0) {
            f5 = 0.0f;
        }
        if ((i4 & 24) == 0) {
            f6 = 0.0f;
        }
        e(((i4 & 2) != 0 ? -1 : 1) * f5 * (this.f14937g.width() / a5.width()), ((i4 & 8) != 0 ? -1 : 1) * f6 * (this.f14937g.height() / a5.height()));
    }

    public boolean g() {
        return this.f14932b;
    }

    public void i() {
        this.f14935e = a();
    }

    void j(float f5, float f6) {
        Rect rect = new Rect(this.f14935e);
        this.f14937g.offset(f5, f6);
        RectF rectF = this.f14937g;
        rectF.offset(Math.max(0.0f, this.f14936f.left - rectF.left), Math.max(0.0f, this.f14936f.top - this.f14937g.top));
        RectF rectF2 = this.f14937g;
        rectF2.offset(Math.min(0.0f, this.f14936f.right - rectF2.right), Math.min(0.0f, this.f14936f.bottom - this.f14937g.bottom));
        Rect a5 = a();
        this.f14935e = a5;
        rect.union(a5);
        rect.inset(-10, -10);
        this.f14931a.invalidate();
    }

    public void k(boolean z4) {
        this.f14932b = z4;
    }

    public void l(boolean z4) {
        this.f14933c = z4;
    }

    public void m(ModifyMode modifyMode) {
        if (modifyMode != this.f14934d) {
            this.f14934d = modifyMode;
            this.f14931a.invalidate();
        }
    }

    public void n(Matrix matrix, Rect rect, RectF rectF, boolean z4, boolean z5) {
        if (z4) {
            z5 = true;
        }
        this.f14938h = new Matrix(matrix);
        this.f14937g = rectF;
        this.f14936f = new RectF(rect);
        this.f14939i = z5;
        this.f14941k = z4;
        this.f14940j = this.f14937g.width() / this.f14937g.height();
        this.f14935e = a();
        this.f14944n.setARGB(125, 50, 50, 50);
        this.f14945o.setARGB(125, 50, 50, 50);
        this.f14946p.setStrokeWidth(3.0f);
        this.f14946p.setStyle(Paint.Style.STROKE);
        this.f14946p.setAntiAlias(true);
        this.f14934d = ModifyMode.None;
        h();
    }
}
