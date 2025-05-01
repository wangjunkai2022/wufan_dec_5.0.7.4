package com.beizi.fusion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.beizi.fusion.R;
/* loaded from: classes2.dex */
public class BackArrowView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f7148a;

    /* renamed from: b  reason: collision with root package name */
    private int f7149b;

    /* renamed from: c  reason: collision with root package name */
    private float f7150c;

    /* renamed from: d  reason: collision with root package name */
    private float f7151d;

    /* renamed from: e  reason: collision with root package name */
    private int f7152e;

    /* renamed from: f  reason: collision with root package name */
    private float f7153f;

    /* renamed from: g  reason: collision with root package name */
    private int f7154g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f7155h;

    /* renamed from: i  reason: collision with root package name */
    private Path f7156i;

    public BackArrowView(Context context) {
        this(context, null);
    }

    private void a(Context context, @Nullable AttributeSet attributeSet, int i4) {
        b(context, attributeSet, i4);
        Paint paint = new Paint();
        this.f7155h = paint;
        paint.setColor(this.f7152e);
        this.f7155h.setStyle(Paint.Style.STROKE);
        this.f7155h.setAntiAlias(true);
        this.f7155h.setStrokeWidth(this.f7153f);
        this.f7155h.setStrokeJoin(Paint.Join.ROUND);
    }

    private void b(Context context, @Nullable AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BeiZi_BackArrowView, i4, 0);
        this.f7152e = obtainStyledAttributes.getColor(R.styleable.BeiZi_BackArrowView_beizi_bav_color, Color.argb(255, 0, 0, 0));
        this.f7153f = obtainStyledAttributes.getDimension(R.styleable.BeiZi_BackArrowView_beizi_bav_stroke_width, dip2px(context, 2.0f));
        this.f7154g = obtainStyledAttributes.getInt(R.styleable.BeiZi_BackArrowView_beizi_bav_arrow_style, 1);
        obtainStyledAttributes.recycle();
    }

    public static int dip2px(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate((this.f7148a / 2.0f) - this.f7150c, this.f7149b / 2);
        canvas.rotate(45.0f);
        if (this.f7156i == null) {
            this.f7156i = new Path();
        }
        this.f7156i.reset();
        this.f7156i.lineTo(0.0f, this.f7151d);
        this.f7156i.moveTo(0.0f, 0.0f);
        this.f7156i.lineTo(-this.f7151d, 0.0f);
        if (this.f7154g == 1) {
            this.f7156i.moveTo(0.0f, 0.0f);
            Path path = this.f7156i;
            float f5 = this.f7151d;
            path.lineTo(f5, -f5);
        }
        this.f7156i.close();
        canvas.drawPath(this.f7156i, this.f7155h);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        setMeasuredDimension(a(i4), a(i5));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f7148a = i4;
        this.f7149b = i5;
        float min = Math.min(i4, i5) / 2.0f;
        int i8 = this.f7154g;
        if (i8 == 1) {
            this.f7150c = min / 3.0f;
        } else if (i8 == 2) {
            this.f7150c = min / 4.0f;
        }
        this.f7151d = min * 0.63f;
    }

    public void setViewColor(int i4) {
        Paint paint = this.f7155h;
        if (paint != null) {
            paint.setColor(i4);
            invalidate();
        }
    }

    public BackArrowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BackArrowView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a(context, attributeSet, i4);
    }

    private int a(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(150, size);
        }
        return 150;
    }
}
