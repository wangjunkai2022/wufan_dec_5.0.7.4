package com.beizi.fusion.widget;

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
    private final RectF f7175a;

    /* renamed from: b  reason: collision with root package name */
    private float f7176b;

    /* renamed from: c  reason: collision with root package name */
    private String f7177c;

    /* renamed from: d  reason: collision with root package name */
    private int f7178d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f7179e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f7180f;

    public CustomRoundImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7175a = new RectF();
        this.f7176b = 0.0f;
        this.f7177c = null;
        this.f7178d = 0;
        this.f7179e = new Paint();
        this.f7180f = new Paint();
        a();
    }

    private void a() {
        this.f7179e.setAntiAlias(true);
        this.f7179e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f7180f.setAntiAlias(true);
        this.f7180f.setColor(-1);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f7175a, this.f7180f, 31);
        RectF rectF = this.f7175a;
        float f5 = this.f7176b;
        canvas.drawRoundRect(rectF, f5, f5, this.f7180f);
        canvas.saveLayer(this.f7175a, this.f7179e, 31);
        super.draw(canvas);
        if (this.f7178d > 0 && !TextUtils.isEmpty(this.f7177c) && this.f7177c.startsWith("#")) {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor(this.f7177c));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f7178d);
            paint.setAntiAlias(true);
            RectF rectF2 = this.f7175a;
            float f6 = this.f7176b;
            canvas.drawRoundRect(rectF2, f6, f6, paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f7175a.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public void setBorderColor(String str) {
        this.f7177c = str;
        invalidate();
    }

    public void setBorderWidth(int i4) {
        this.f7178d = i4;
        invalidate();
    }

    public void setRectRadius(float f5) {
        this.f7176b = f5;
        invalidate();
    }

    public CustomRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7175a = new RectF();
        this.f7176b = 0.0f;
        this.f7177c = null;
        this.f7178d = 0;
        this.f7179e = new Paint();
        this.f7180f = new Paint();
        a();
    }

    public CustomRoundImageView(Context context) {
        super(context);
        this.f7175a = new RectF();
        this.f7176b = 0.0f;
        this.f7177c = null;
        this.f7178d = 0;
        this.f7179e = new Paint();
        this.f7180f = new Paint();
        a();
    }
}
