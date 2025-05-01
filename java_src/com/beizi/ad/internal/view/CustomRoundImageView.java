package com.beizi.ad.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes2.dex */
public class CustomRoundImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private final RectF f6350a;

    /* renamed from: b  reason: collision with root package name */
    private float f6351b;

    /* renamed from: c  reason: collision with root package name */
    private String f6352c;

    /* renamed from: d  reason: collision with root package name */
    private int f6353d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f6354e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f6355f;

    public CustomRoundImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6350a = new RectF();
        this.f6351b = 0.0f;
        this.f6352c = null;
        this.f6353d = 0;
        this.f6354e = new Paint();
        this.f6355f = new Paint();
        a();
    }

    private void a() {
        this.f6354e.setAntiAlias(true);
        this.f6354e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f6355f.setAntiAlias(true);
        this.f6355f.setColor(-1);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f6350a, this.f6355f, 31);
        RectF rectF = this.f6350a;
        float f5 = this.f6351b;
        canvas.drawRoundRect(rectF, f5, f5, this.f6355f);
        canvas.saveLayer(this.f6350a, this.f6354e, 31);
        super.draw(canvas);
        if (this.f6353d > 0 && !TextUtils.isEmpty(this.f6352c) && this.f6352c.startsWith("#")) {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor(this.f6352c));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f6353d);
            paint.setAntiAlias(true);
            RectF rectF2 = this.f6350a;
            float f6 = this.f6351b;
            canvas.drawRoundRect(rectF2, f6, f6, paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f6350a.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public void setBorderColor(String str) {
        this.f6352c = str;
        invalidate();
    }

    public void setBorderWidth(int i4) {
        this.f6353d = i4;
        invalidate();
    }

    public void setRectRadius(float f5) {
        this.f6351b = f5;
        invalidate();
    }

    public CustomRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6350a = new RectF();
        this.f6351b = 0.0f;
        this.f6352c = null;
        this.f6353d = 0;
        this.f6354e = new Paint();
        this.f6355f = new Paint();
        a();
    }

    public CustomRoundImageView(Context context) {
        super(context);
        this.f6350a = new RectF();
        this.f6351b = 0.0f;
        this.f6352c = null;
        this.f6353d = 0;
        this.f6354e = new Paint();
        this.f6355f = new Paint();
        a();
    }
}
