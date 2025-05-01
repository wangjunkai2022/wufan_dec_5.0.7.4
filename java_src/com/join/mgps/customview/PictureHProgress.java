package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class PictureHProgress extends View {

    /* renamed from: b  reason: collision with root package name */
    int f47528b;

    /* renamed from: c  reason: collision with root package name */
    int f47529c;

    /* renamed from: d  reason: collision with root package name */
    int f47530d;

    /* renamed from: e  reason: collision with root package name */
    int f47531e;

    /* renamed from: f  reason: collision with root package name */
    int f47532f;

    /* renamed from: g  reason: collision with root package name */
    int f47533g;

    /* renamed from: h  reason: collision with root package name */
    int f47534h;

    /* renamed from: i  reason: collision with root package name */
    Bitmap f47535i;

    /* renamed from: j  reason: collision with root package name */
    int f47536j;

    /* renamed from: k  reason: collision with root package name */
    int f47537k;

    /* renamed from: l  reason: collision with root package name */
    Paint f47538l;

    /* renamed from: m  reason: collision with root package name */
    Paint f47539m;

    /* renamed from: n  reason: collision with root package name */
    Paint f47540n;

    /* renamed from: o  reason: collision with root package name */
    private PorterDuffXfermode f47541o;

    /* renamed from: p  reason: collision with root package name */
    float f47542p;

    /* renamed from: q  reason: collision with root package name */
    int f47543q;

    /* renamed from: r  reason: collision with root package name */
    int f47544r;

    public PictureHProgress(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.PictureHProgress);
        this.f47528b = obtainStyledAttributes.getColor(3, this.f47528b);
        this.f47529c = obtainStyledAttributes.getColor(0, this.f47529c);
        this.f47530d = obtainStyledAttributes.getResourceId(2, this.f47530d);
        this.f47531e = (int) obtainStyledAttributes.getDimension(1, this.f47531e);
        this.f47532f = (int) obtainStyledAttributes.getDimension(4, this.f47532f);
        this.f47533g = obtainStyledAttributes.getInteger(6, this.f47533g);
        this.f47534h = obtainStyledAttributes.getInteger(5, this.f47534h);
        obtainStyledAttributes.recycle();
    }

    public int getProgress() {
        return this.f47533g;
    }

    @Override // android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int save;
        super.onDraw(canvas);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            save = canvas.saveLayer(0.0f, 0.0f, this.f47543q, this.f47544r, this.f47539m);
        } else {
            save = canvas.save();
        }
        int i5 = ((int) (this.f47531e * this.f47542p)) / 2;
        if (this.f47535i == null) {
            int i6 = i5 * 2;
            this.f47535i = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), this.f47530d), i6, i6, true);
        }
        int i7 = this.f47532f / 2;
        int i8 = this.f47543q - i5;
        int i9 = this.f47544r;
        float f5 = i5;
        float f6 = (i9 / 2) - i7;
        float f7 = (i9 / 2) + i7;
        float f8 = i7;
        canvas.drawRoundRect(new RectF(f5, f6, i8, f7), f8, f8, this.f47539m);
        this.f47538l.setXfermode(this.f47541o);
        canvas.drawRect(new RectF(f5, f6, (i8 * getProgress()) / this.f47534h, f7), this.f47538l);
        float width = ((this.f47543q - this.f47535i.getWidth()) * getProgress()) / this.f47534h;
        float f9 = (this.f47544r / 2) - i5;
        Bitmap bitmap = this.f47535i;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, width, f9, this.f47540n);
        }
        this.f47538l.setXfermode(null);
        if (i4 >= 21) {
            canvas.restoreToCount(save);
        } else {
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        this.f47543q = View.MeasureSpec.getSize(i4);
        int max = Math.max(this.f47531e, this.f47532f);
        this.f47544r = max;
        setMeasuredDimension(this.f47543q, max);
    }

    public void setMaxProgress(int i4) {
        this.f47534h = i4;
    }

    public void setProgress(int i4) {
        int i5 = this.f47534h;
        if (i4 > i5) {
            i4 = i5;
        }
        this.f47533g = i4;
        postInvalidate();
    }

    public PictureHProgress(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureHProgress(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47528b = -1;
        this.f47529c = -3355444;
        this.f47530d = R.drawable.ic_progress_logo;
        this.f47531e = 56;
        this.f47532f = 25;
        this.f47533g = 0;
        this.f47534h = 100;
        this.f47535i = null;
        this.f47536j = 0;
        this.f47537k = 0;
        this.f47542p = 1.0f;
        a(attributeSet);
        setLayerType(1, null);
        this.f47541o = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        Paint paint = new Paint();
        this.f47539m = paint;
        paint.setColor(this.f47529c);
        this.f47539m.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f47538l = paint2;
        paint2.setColor(this.f47528b);
        this.f47538l.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f47540n = paint3;
        paint3.setAntiAlias(true);
    }
}
