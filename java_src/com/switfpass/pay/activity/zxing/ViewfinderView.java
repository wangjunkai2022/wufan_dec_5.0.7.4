package com.switfpass.pay.activity.zxing;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.join.android.app.mgsim.wufun.R;
import com.switfpass.pay.activity.zxing.camera.a;
import java.util.Collection;
import java.util.HashSet;
/* loaded from: classes5.dex */
public final class ViewfinderView extends View {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f61603o = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: p  reason: collision with root package name */
    private static float f61604p;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f61605b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f61606c;

    /* renamed from: d  reason: collision with root package name */
    private final int f61607d;

    /* renamed from: e  reason: collision with root package name */
    private final int f61608e;

    /* renamed from: f  reason: collision with root package name */
    private final int f61609f;

    /* renamed from: g  reason: collision with root package name */
    private final int f61610g;

    /* renamed from: h  reason: collision with root package name */
    private int f61611h;

    /* renamed from: i  reason: collision with root package name */
    private int f61612i;

    /* renamed from: j  reason: collision with root package name */
    private Collection f61613j;

    /* renamed from: k  reason: collision with root package name */
    private Collection f61614k;

    /* renamed from: l  reason: collision with root package name */
    private int f61615l;

    /* renamed from: m  reason: collision with root package name */
    private Rect f61616m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f61617n;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61615l = 0;
        this.f61605b = new Paint();
        Resources resources = getResources();
        this.f61607d = resources.getColor(R.bool.abc_action_bar_embed_tabs);
        this.f61608e = resources.getColor(R.bool.abc_config_actionMenuItemAllCaps);
        this.f61609f = resources.getColor(R.bool.bottomsheet_is_tablet);
        this.f61610g = resources.getColor(R.bool.default_circle_indicator_centered);
        this.f61611h = 0;
        this.f61613j = new HashSet(5);
        this.f61616m = new Rect();
        this.f61617n = getResources().getDrawable(2130837586);
        float f5 = context.getResources().getDisplayMetrics().density;
        f61604p = f5;
        this.f61612i = (int) (f5 * 20.0f);
    }

    public final void a(ResultPoint resultPoint) {
        this.f61613j.add(resultPoint);
    }

    public final void b(Bitmap bitmap) {
        this.f61606c = bitmap;
        invalidate();
    }

    public final void c() {
        this.f61606c = null;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
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
        Rect d5 = a.c().d();
        if (d5 == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f61605b.setColor(this.f61606c != null ? this.f61608e : this.f61607d);
        float f5 = width;
        canvas.drawRect(0.0f, 0.0f, f5, d5.top, this.f61605b);
        canvas.drawRect(0.0f, d5.top, d5.left, d5.bottom, this.f61605b);
        canvas.drawRect(d5.right, d5.top, f5, d5.bottom, this.f61605b);
        canvas.drawRect(0.0f, d5.bottom, f5, height, this.f61605b);
        if (this.f61606c != null) {
            this.f61605b.setAlpha(255);
            canvas.drawBitmap(this.f61606c, (Rect) null, d5, this.f61605b);
            return;
        }
        this.f61605b.setColor(this.f61609f);
        canvas.drawRect(d5.left, d5.top, i4 + this.f61612i, i5 + 10, this.f61605b);
        canvas.drawRect(d5.left, d5.top, i6 + 10, i7 + this.f61612i, this.f61605b);
        int i18 = d5.right;
        canvas.drawRect(i18 - this.f61612i, d5.top, i18, i8 + 10, this.f61605b);
        int i19 = d5.right;
        canvas.drawRect(i19 - 10, d5.top, i19, i9 + this.f61612i, this.f61605b);
        canvas.drawRect(d5.left, i11 - 10, i10 + this.f61612i, d5.bottom, this.f61605b);
        canvas.drawRect(d5.left, i13 - this.f61612i, i12 + 10, d5.bottom, this.f61605b);
        canvas.drawRect(i14 - this.f61612i, i15 - 10, d5.right, d5.bottom, this.f61605b);
        canvas.drawRect(i16 - 10, i17 - this.f61612i, d5.right, d5.bottom, this.f61605b);
        this.f61611h = (this.f61611h + 1) % f61603o.length;
        int i20 = this.f61615l + 3;
        this.f61615l = i20;
        int i21 = d5.bottom;
        int i22 = d5.top;
        if (i20 < i21 - i22) {
            this.f61616m.set(d5.left - 6, (i22 + i20) - 6, d5.right + 6, i22 + 6 + i20);
            this.f61617n.setBounds(this.f61616m);
            this.f61617n.draw(canvas);
            invalidate();
        } else {
            this.f61615l = 0;
        }
        Collection<ResultPoint> collection = this.f61613j;
        Collection<ResultPoint> collection2 = this.f61614k;
        if (collection.isEmpty()) {
            this.f61614k = null;
        } else {
            this.f61613j = new HashSet(5);
            this.f61614k = collection;
            this.f61605b.setAlpha(255);
            this.f61605b.setColor(this.f61610g);
            for (ResultPoint resultPoint : collection) {
                canvas.drawCircle(d5.left + resultPoint.getX(), d5.top + resultPoint.getY(), 6.0f, this.f61605b);
            }
        }
        if (collection2 != null) {
            this.f61605b.setAlpha(127);
            this.f61605b.setColor(this.f61610g);
            for (ResultPoint resultPoint2 : collection2) {
                canvas.drawCircle(d5.left + resultPoint2.getX(), d5.top + resultPoint2.getY(), 3.0f, this.f61605b);
            }
        }
        postInvalidateDelayed(100L, d5.left, d5.top, d5.right, d5.bottom);
    }
}
