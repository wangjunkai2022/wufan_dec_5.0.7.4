package com.join.mgps.zxing.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.zxing.camera.c;
import java.util.Collection;
import java.util.HashSet;
/* loaded from: classes5.dex */
public final class ViewfinderView extends View {

    /* renamed from: m  reason: collision with root package name */
    private static final String f55159m = "log";

    /* renamed from: n  reason: collision with root package name */
    private static final long f55160n = 10;

    /* renamed from: o  reason: collision with root package name */
    private static final int f55161o = 255;

    /* renamed from: p  reason: collision with root package name */
    private static final int f55162p = 3;

    /* renamed from: q  reason: collision with root package name */
    private static final int f55163q = 3;

    /* renamed from: r  reason: collision with root package name */
    private static final int f55164r = 5;

    /* renamed from: s  reason: collision with root package name */
    private static final int f55165s = 5;

    /* renamed from: t  reason: collision with root package name */
    private static float f55166t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    private static final int f55167u = 16;

    /* renamed from: v  reason: collision with root package name */
    private static final int f55168v = 30;

    /* renamed from: b  reason: collision with root package name */
    private int f55169b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f55170c;

    /* renamed from: d  reason: collision with root package name */
    private int f55171d;

    /* renamed from: e  reason: collision with root package name */
    private int f55172e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f55173f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55174g;

    /* renamed from: h  reason: collision with root package name */
    private final int f55175h;

    /* renamed from: i  reason: collision with root package name */
    private final int f55176i;

    /* renamed from: j  reason: collision with root package name */
    private Collection<ResultPoint> f55177j;

    /* renamed from: k  reason: collision with root package name */
    private Collection<ResultPoint> f55178k;

    /* renamed from: l  reason: collision with root package name */
    boolean f55179l;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5 = context.getResources().getDisplayMetrics().density;
        f55166t = f5;
        this.f55169b = (int) (f5 * 20.0f);
        this.f55170c = new Paint();
        Resources resources = getResources();
        this.f55174g = resources.getColor(R.color.viewfinder_mask);
        this.f55175h = resources.getColor(R.color.result_view);
        this.f55176i = resources.getColor(R.color.possible_result_points);
        this.f55177j = new HashSet(5);
    }

    public void a(ResultPoint resultPoint) {
        this.f55177j.add(resultPoint);
    }

    public void b(Bitmap bitmap) {
        this.f55173f = bitmap;
        invalidate();
    }

    public void c() {
        this.f55173f = null;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Rect d5 = c.c().d();
        if (d5 == null) {
            return;
        }
        if (!this.f55179l) {
            this.f55179l = true;
            this.f55171d = d5.top;
            this.f55172e = d5.bottom;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f55170c.setColor(this.f55173f != null ? this.f55175h : this.f55174g);
        float f5 = width;
        canvas.drawRect(0.0f, 0.0f, f5, d5.top, this.f55170c);
        canvas.drawRect(0.0f, d5.top, d5.left, d5.bottom + 1, this.f55170c);
        canvas.drawRect(d5.right + 1, d5.top, f5, d5.bottom + 1, this.f55170c);
        canvas.drawRect(0.0f, d5.bottom + 1, f5, height, this.f55170c);
        if (this.f55173f != null) {
            this.f55170c.setAlpha(255);
            canvas.drawBitmap(this.f55173f, d5.left, d5.top, this.f55170c);
            return;
        }
        this.f55170c.setColor(-16711936);
        canvas.drawRect(d5.left, d5.top, i4 + this.f55169b, i5 + 3, this.f55170c);
        canvas.drawRect(d5.left, d5.top, i6 + 3, i7 + this.f55169b, this.f55170c);
        int i18 = d5.right;
        canvas.drawRect(i18 - this.f55169b, d5.top, i18, i8 + 3, this.f55170c);
        int i19 = d5.right;
        canvas.drawRect(i19 - 3, d5.top, i19, i9 + this.f55169b, this.f55170c);
        canvas.drawRect(d5.left, i11 - 3, i10 + this.f55169b, d5.bottom, this.f55170c);
        canvas.drawRect(d5.left, i13 - this.f55169b, i12 + 3, d5.bottom, this.f55170c);
        canvas.drawRect(i14 - this.f55169b, i15 - 3, d5.right, d5.bottom, this.f55170c);
        canvas.drawRect(i16 - 3, i17 - this.f55169b, d5.right, d5.bottom, this.f55170c);
        int i20 = this.f55171d + 5;
        this.f55171d = i20;
        if (i20 >= d5.bottom) {
            this.f55171d = d5.top;
        }
        float f6 = d5.left + 5;
        int i21 = this.f55171d;
        canvas.drawRect(f6, i21 - 1, d5.right - 5, i21 + 1, this.f55170c);
        this.f55170c.setColor(-1);
        this.f55170c.setTextSize(f55166t * 16.0f);
        this.f55170c.setTypeface(Typeface.create("System", 1));
        Collection<ResultPoint> collection = this.f55177j;
        Collection<ResultPoint> collection2 = this.f55178k;
        if (collection.isEmpty()) {
            this.f55178k = null;
        } else {
            this.f55177j = new HashSet(5);
            this.f55178k = collection;
            this.f55170c.setAlpha(255);
            this.f55170c.setColor(this.f55176i);
            for (ResultPoint resultPoint : collection) {
                canvas.drawCircle(d5.left + resultPoint.getX(), d5.top + resultPoint.getY(), 6.0f, this.f55170c);
            }
        }
        if (collection2 != null) {
            this.f55170c.setAlpha(127);
            this.f55170c.setColor(this.f55176i);
            for (ResultPoint resultPoint2 : collection2) {
                canvas.drawCircle(d5.left + resultPoint2.getX(), d5.top + resultPoint2.getY(), 3.0f, this.f55170c);
            }
        }
        postInvalidateDelayed(10L, d5.left, d5.top, d5.right, d5.bottom);
    }
}
