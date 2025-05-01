package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CornersLinearLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private float f46745b;

    /* renamed from: c  reason: collision with root package name */
    private float f46746c;

    /* renamed from: d  reason: collision with root package name */
    private float f46747d;

    /* renamed from: e  reason: collision with root package name */
    private float f46748e;

    /* renamed from: f  reason: collision with root package name */
    private float f46749f;

    /* renamed from: g  reason: collision with root package name */
    private int f46750g;

    /* renamed from: h  reason: collision with root package name */
    private int f46751h;

    public CornersLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, this.f46750g, this.f46751h);
        float f5 = this.f46745b;
        if (f5 > 0.0f) {
            path.addRoundRect(rectF, f5, f5, Path.Direction.CCW);
        } else {
            float f6 = this.f46746c;
            float f7 = this.f46747d;
            float f8 = this.f46749f;
            float f9 = this.f46748e;
            path.addRoundRect(rectF, new float[]{f6, f6, f7, f7, f8, f8, f9, f9}, Path.Direction.CCW);
        }
        canvas.clipPath(path);
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f46750g = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f46751h = measuredHeight;
        setMeasuredDimension(this.f46750g, measuredHeight);
    }

    public CornersLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CornersLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CornersLinearLayout);
        this.f46745b = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f46746c = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f46747d = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f46749f = obtainStyledAttributes.getDimension(1, 0.0f);
        this.f46748e = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
