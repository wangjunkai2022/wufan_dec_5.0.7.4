package com.join.mgps.zxing.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.zxing.camera.c;
import java.util.Collection;
import java.util.HashSet;
/* loaded from: classes5.dex */
public class FaceTransferViewfinderView extends View {

    /* renamed from: m  reason: collision with root package name */
    private static final String f55138m = "log";

    /* renamed from: n  reason: collision with root package name */
    private static final long f55139n = 10;

    /* renamed from: o  reason: collision with root package name */
    private static final int f55140o = 255;

    /* renamed from: p  reason: collision with root package name */
    private static final int f55141p = 10;

    /* renamed from: q  reason: collision with root package name */
    private static final int f55142q = 6;

    /* renamed from: r  reason: collision with root package name */
    private static final int f55143r = 5;

    /* renamed from: s  reason: collision with root package name */
    private static final int f55144s = 5;

    /* renamed from: t  reason: collision with root package name */
    private static float f55145t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    private static final int f55146u = 15;

    /* renamed from: v  reason: collision with root package name */
    private static final int f55147v = 30;

    /* renamed from: b  reason: collision with root package name */
    private int f55148b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f55149c;

    /* renamed from: d  reason: collision with root package name */
    private int f55150d;

    /* renamed from: e  reason: collision with root package name */
    private int f55151e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f55152f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55153g;

    /* renamed from: h  reason: collision with root package name */
    private final int f55154h;

    /* renamed from: i  reason: collision with root package name */
    private final int f55155i;

    /* renamed from: j  reason: collision with root package name */
    private Collection<ResultPoint> f55156j;

    /* renamed from: k  reason: collision with root package name */
    private Collection<ResultPoint> f55157k;

    /* renamed from: l  reason: collision with root package name */
    boolean f55158l;

    public FaceTransferViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5 = context.getResources().getDisplayMetrics().density;
        f55145t = f5;
        this.f55148b = (int) (f5 * 20.0f);
        this.f55149c = new Paint();
        Resources resources = getResources();
        this.f55153g = resources.getColor(R.color.viewfinder_mask);
        this.f55154h = resources.getColor(R.color.result_view);
        this.f55155i = resources.getColor(R.color.possible_result_points);
        this.f55156j = new HashSet(5);
    }

    public void a(ResultPoint resultPoint) {
        this.f55156j.add(resultPoint);
    }

    public void b(Bitmap bitmap) {
        this.f55152f = bitmap;
        invalidate();
    }

    public void c() {
        this.f55152f = null;
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
        Rect e5 = c.c().e();
        if (e5 == null) {
            return;
        }
        if (!this.f55158l) {
            this.f55158l = true;
            this.f55150d = e5.top;
            this.f55151e = e5.bottom;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f55149c.setColor(this.f55152f != null ? this.f55154h : this.f55153g);
        float f5 = width;
        canvas.drawRect(0.0f, 0.0f, f5, e5.top, this.f55149c);
        canvas.drawRect(0.0f, e5.top, e5.left, e5.bottom + 1, this.f55149c);
        canvas.drawRect(e5.right + 1, e5.top, f5, e5.bottom + 1, this.f55149c);
        canvas.drawRect(0.0f, e5.bottom + 1, f5, height, this.f55149c);
        if (this.f55152f != null) {
            this.f55149c.setAlpha(255);
            canvas.drawBitmap(this.f55152f, e5.left, e5.top, this.f55149c);
            return;
        }
        this.f55149c.setColor(Color.parseColor("#03e3fe"));
        canvas.drawRect(e5.left, e5.top, i4 + this.f55148b, i5 + 10, this.f55149c);
        canvas.drawRect(e5.left, e5.top, i6 + 10, i7 + this.f55148b, this.f55149c);
        int i18 = e5.right;
        canvas.drawRect(i18 - this.f55148b, e5.top, i18, i8 + 10, this.f55149c);
        int i19 = e5.right;
        canvas.drawRect(i19 - 10, e5.top, i19, i9 + this.f55148b, this.f55149c);
        canvas.drawRect(e5.left, i11 - 10, i10 + this.f55148b, e5.bottom, this.f55149c);
        canvas.drawRect(e5.left, i13 - this.f55148b, i12 + 10, e5.bottom, this.f55149c);
        canvas.drawRect(i14 - this.f55148b, i15 - 10, e5.right, e5.bottom, this.f55149c);
        canvas.drawRect(i16 - 10, i17 - this.f55148b, e5.right, e5.bottom, this.f55149c);
        int i20 = this.f55150d + 5;
        this.f55150d = i20;
        if (i20 >= e5.bottom) {
            this.f55150d = e5.top;
        }
        Rect rect = new Rect();
        rect.left = e5.left;
        rect.right = e5.right;
        int i21 = this.f55150d;
        rect.top = i21;
        rect.bottom = i21 + 18;
        canvas.drawBitmap(((BitmapDrawable) getResources().getDrawable(R.drawable.qrcode_scan_line)).getBitmap(), (Rect) null, rect, this.f55149c);
        this.f55149c.setColor(-16777216);
        this.f55149c.setTextSize(f55145t * 15.0f);
        this.f55149c.setAlpha(64);
        this.f55149c.setTypeface(Typeface.create("System", 1));
        String string = getResources().getString(R.string.scan_qr_code_declar);
        canvas.drawText(string, (f5 - this.f55149c.measureText(string)) / 2.0f, e5.bottom + (f55145t * 30.0f), this.f55149c);
        Collection<ResultPoint> collection = this.f55156j;
        Collection<ResultPoint> collection2 = this.f55157k;
        if (collection.isEmpty()) {
            this.f55157k = null;
        } else {
            this.f55156j = new HashSet(5);
            this.f55157k = collection;
            this.f55149c.setAlpha(255);
            this.f55149c.setColor(this.f55155i);
            for (ResultPoint resultPoint : collection) {
                canvas.drawCircle(e5.left + resultPoint.getX(), e5.top + resultPoint.getY(), 6.0f, this.f55149c);
            }
        }
        if (collection2 != null) {
            this.f55149c.setAlpha(127);
            this.f55149c.setColor(this.f55155i);
            for (ResultPoint resultPoint2 : collection2) {
                canvas.drawCircle(e5.left + resultPoint2.getX(), e5.top + resultPoint2.getY(), 3.0f, this.f55149c);
            }
        }
        postInvalidateDelayed(10L, e5.left, e5.top, e5.right, e5.bottom);
    }
}
