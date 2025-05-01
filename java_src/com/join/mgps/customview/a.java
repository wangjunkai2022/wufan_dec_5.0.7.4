package com.join.mgps.customview;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* compiled from: CircleDrawable.java */
/* loaded from: classes4.dex */
public class a extends Drawable {

    /* renamed from: f  reason: collision with root package name */
    public static final String f48332f = "CircleDrawable";

    /* renamed from: a  reason: collision with root package name */
    protected final Paint f48333a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f48334b;

    /* renamed from: c  reason: collision with root package name */
    protected final BitmapShader f48335c;

    /* renamed from: d  reason: collision with root package name */
    protected float f48336d;

    /* renamed from: e  reason: collision with root package name */
    protected Bitmap f48337e;

    public a(Bitmap bitmap) {
        this(bitmap, 0);
    }

    public void a() {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float width = bounds.width() / this.f48337e.getWidth();
        float height = bounds.height() / this.f48337e.getHeight();
        if (width <= height) {
            width = height;
        }
        matrix.postScale(width, width);
        this.f48335c.setLocalMatrix(matrix);
    }

    public void b() {
        float height;
        int i4;
        Rect bounds = getBounds();
        if (bounds.width() < bounds.height()) {
            height = bounds.width() / 2.0f;
            i4 = this.f48334b;
        } else {
            height = bounds.height() / 2.0f;
            i4 = this.f48334b;
        }
        this.f48336d = height - i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.width() / 2.0f, bounds.height() / 2.0f, this.f48336d, this.f48333a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f48333a.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f48333a.setColorFilter(colorFilter);
    }

    public a(Bitmap bitmap, int i4) {
        this.f48334b = i4;
        this.f48337e = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f48335c = bitmapShader;
        Paint paint = new Paint();
        this.f48333a = paint;
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
    }
}
