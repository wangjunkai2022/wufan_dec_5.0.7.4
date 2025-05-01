package com.ss.android.downloadlib.guide.install;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes5.dex */
public class ClipImageView extends ImageView {

    /* renamed from: i  reason: collision with root package name */
    private Paint f60609i;

    /* renamed from: m  reason: collision with root package name */
    private Path f60610m;

    /* renamed from: o  reason: collision with root package name */
    private float[] f60611o;

    /* renamed from: p  reason: collision with root package name */
    private RectF f60612p;
    private boolean vv;

    public ClipImageView(Context context) {
        super(context);
        this.vv = true;
        vv(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.vv) {
            this.f60610m.reset();
            this.f60612p.set(0.0f, 0.0f, getWidth(), getHeight());
            float[] fArr = this.f60611o;
            if (fArr != null) {
                this.f60610m.addRoundRect(this.f60612p, fArr, Path.Direction.CW);
            }
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.clipPath(this.f60610m);
            Paint paint = this.f60609i;
            if (paint != null) {
                canvas.drawPath(this.f60610m, paint);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Paint paint = new Paint(1);
        this.f60609i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f60609i.setColor(i4);
    }

    public void setClip(boolean z4) {
        this.vv = z4;
    }

    public void setRadius(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        this.f60611o = fArr;
    }

    public void setRoundRadius(int i4) {
        if (i4 > 0) {
            float f5 = i4;
            setRadius(new float[]{f5, f5, f5, f5, f5, f5, f5, f5});
        }
    }

    protected void vv(Context context) {
        this.f60610m = new Path();
        this.f60612p = new RectF();
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.vv = true;
        vv(context);
    }

    public ClipImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.vv = true;
        vv(context);
    }
}
