package com.zxing.android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.join.android.app.mgsim.wufun.R;
import com.zxing.android.camera.c;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes6.dex */
public final class ViewfinderView extends View {

    /* renamed from: n  reason: collision with root package name */
    private static final long f68789n = 30;

    /* renamed from: o  reason: collision with root package name */
    private static final int f68790o = 255;

    /* renamed from: p  reason: collision with root package name */
    private static final int f68791p = 5;

    /* renamed from: q  reason: collision with root package name */
    private static final int f68792q = 10;

    /* renamed from: r  reason: collision with root package name */
    private static final int f68793r = 6;

    /* renamed from: s  reason: collision with root package name */
    private static final int f68794s = 5;

    /* renamed from: t  reason: collision with root package name */
    private static final int f68795t = 5;

    /* renamed from: u  reason: collision with root package name */
    private static float f68796u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    private static final int f68797v = 16;

    /* renamed from: w  reason: collision with root package name */
    private static final int f68798w = 30;

    /* renamed from: b  reason: collision with root package name */
    private int f68799b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f68800c;

    /* renamed from: d  reason: collision with root package name */
    private int f68801d;

    /* renamed from: e  reason: collision with root package name */
    private int f68802e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f68803f;

    /* renamed from: g  reason: collision with root package name */
    private final int f68804g;

    /* renamed from: h  reason: collision with root package name */
    private final int f68805h;

    /* renamed from: i  reason: collision with root package name */
    private final int f68806i;

    /* renamed from: j  reason: collision with root package name */
    private Collection<ResultPoint> f68807j;

    /* renamed from: k  reason: collision with root package name */
    private Collection<ResultPoint> f68808k;

    /* renamed from: l  reason: collision with root package name */
    private c f68809l;

    /* renamed from: m  reason: collision with root package name */
    boolean f68810m;

    public ViewfinderView(Context context) {
        this(context, null);
    }

    public void a(ResultPoint resultPoint) {
        this.f68807j.add(resultPoint);
    }

    public void b(Bitmap bitmap) {
        this.f68803f = bitmap;
        invalidate();
    }

    public void c() {
        Bitmap bitmap = this.f68803f;
        this.f68803f = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        int i5;
        Rect c5 = this.f68809l.c();
        if (c5 == null) {
            return;
        }
        if (!this.f68810m) {
            this.f68810m = true;
            this.f68801d = c5.top;
            this.f68802e = c5.bottom;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f68800c.setColor(this.f68803f != null ? this.f68805h : this.f68804g);
        float f5 = width;
        canvas.drawRect(0.0f, 0.0f, f5, c5.top, this.f68800c);
        canvas.drawRect(0.0f, c5.top, c5.left, c5.bottom + 1, this.f68800c);
        canvas.drawRect(c5.right + 1, c5.top, f5, c5.bottom + 1, this.f68800c);
        canvas.drawRect(0.0f, c5.bottom + 1, f5, height, this.f68800c);
        if (this.f68803f != null) {
            this.f68800c.setAlpha(255);
            canvas.drawBitmap(this.f68803f, c5.left, c5.top, this.f68800c);
            return;
        }
        this.f68800c.setColor(-1);
        canvas.drawRect(c5.left, c5.top, c5.right + 1, i4 + 2, this.f68800c);
        canvas.drawRect(c5.left, c5.top + 2, i5 + 2, c5.bottom - 1, this.f68800c);
        int i6 = c5.right;
        canvas.drawRect(i6 - 1, c5.top, i6 + 1, c5.bottom - 1, this.f68800c);
        float f6 = c5.left;
        int i7 = c5.bottom;
        canvas.drawRect(f6, i7 - 1, c5.right + 1, i7 + 1, this.f68800c);
        this.f68800c.setColor(-15809537);
        this.f68800c.setAntiAlias(true);
        int i8 = c5.left;
        int i9 = c5.top;
        canvas.drawRect((i8 - 10) + 2, (i9 - 10) + 2, ((i8 + this.f68799b) - 10) + 2, i9 + 2, this.f68800c);
        int i10 = c5.left;
        int i11 = c5.top;
        canvas.drawRect((i10 - 10) + 2, (i11 - 10) + 2, i10 + 2, ((i11 + this.f68799b) - 10) + 2, this.f68800c);
        int i12 = c5.right;
        int i13 = c5.top;
        canvas.drawRect(((i12 - this.f68799b) + 10) - 2, (i13 - 10) + 2, (i12 + 10) - 2, i13 + 2, this.f68800c);
        int i14 = c5.right;
        int i15 = c5.top;
        canvas.drawRect(i14 - 2, (i15 - 10) + 2, (i14 + 10) - 2, ((i15 + this.f68799b) - 10) + 2, this.f68800c);
        int i16 = c5.left;
        int i17 = c5.bottom;
        canvas.drawRect((i16 - 10) + 2, i17 - 2, ((i16 + this.f68799b) - 10) + 2, (i17 + 10) - 2, this.f68800c);
        int i18 = c5.left;
        int i19 = c5.bottom;
        canvas.drawRect((i18 - 10) + 2, ((i19 - this.f68799b) + 10) - 2, i18 + 2, (i19 + 10) - 2, this.f68800c);
        int i20 = c5.right;
        int i21 = c5.bottom;
        canvas.drawRect(((i20 - this.f68799b) + 10) - 2, i21 - 2, (i20 + 10) - 2, (i21 + 10) - 2, this.f68800c);
        int i22 = c5.right;
        int i23 = c5.bottom;
        canvas.drawRect(i22 - 2, ((i23 - this.f68799b) + 10) - 2, (i22 + 10) - 2, (i23 + 10) - 2, this.f68800c);
        int i24 = this.f68801d + 5;
        this.f68801d = i24;
        if (i24 >= c5.bottom) {
            this.f68801d = c5.top;
        }
        Rect rect = new Rect();
        rect.left = c5.left;
        rect.right = c5.right;
        int i25 = this.f68801d;
        rect.top = i25;
        rect.bottom = i25 + 18;
        canvas.drawBitmap(((BitmapDrawable) getResources().getDrawable(R.drawable.qr_scan_line)).getBitmap(), (Rect) null, rect, this.f68800c);
        postInvalidateDelayed(f68789n, c5.left, c5.top, c5.right, c5.bottom);
    }

    public void setCameraManager(c cVar) {
        this.f68809l = cVar;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68800c = new Paint(1);
        this.f68804g = 1610612736;
        this.f68805h = -1342177280;
        this.f68806i = -1056964864;
        this.f68807j = new ArrayList(5);
        this.f68808k = null;
        float f5 = context.getResources().getDisplayMetrics().density;
        f68796u = f5;
        this.f68799b = (int) (f5 * 20.0f);
    }
}
