package com.beizi.ad.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes2.dex */
public class DrawTextImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private String f6356a;

    /* renamed from: b  reason: collision with root package name */
    private float f6357b;

    /* renamed from: c  reason: collision with root package name */
    private float f6358c;

    /* renamed from: d  reason: collision with root package name */
    private float f6359d;

    /* renamed from: e  reason: collision with root package name */
    private int f6360e;

    /* renamed from: f  reason: collision with root package name */
    private int f6361f;

    public DrawTextImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6356a = "";
        this.f6357b = 30.0f;
        this.f6358c = -1000.0f;
        this.f6359d = -1000.0f;
        this.f6360e = 0;
        this.f6361f = 3;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6356a.equals("")) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(this.f6360e));
        paint.setStrokeWidth(this.f6361f);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(this.f6357b);
        String str = this.f6356a;
        float f5 = this.f6358c;
        if (f5 == -1000.0f) {
            f5 = canvas.getWidth() - (this.f6357b * this.f6356a.length());
        }
        float f6 = this.f6359d;
        if (f6 == -1000.0f) {
            f6 = canvas.getHeight() - 50;
        }
        canvas.drawText(str, f5, f6, paint);
    }

    public void setDrawLocalXY(float f5, float f6) {
        this.f6358c = f5;
        this.f6359d = f6;
        drawableStateChanged();
    }

    public void setDrawText(String str) {
        this.f6356a = str;
        drawableStateChanged();
    }

    public void setDrawTextColorResourse(int i4) {
        this.f6360e = i4;
        drawableStateChanged();
    }

    public void setDrawTextSize(float f5) {
        this.f6357b = f5;
        drawableStateChanged();
    }

    public void setDrawTextStrokeWidth(int i4) {
        this.f6361f = i4;
        drawableStateChanged();
    }

    public DrawTextImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6356a = "";
        this.f6357b = 30.0f;
        this.f6358c = -1000.0f;
        this.f6359d = -1000.0f;
        this.f6360e = 0;
        this.f6361f = 3;
    }

    public DrawTextImageView(Context context) {
        super(context);
        this.f6356a = "";
        this.f6357b = 30.0f;
        this.f6358c = -1000.0f;
        this.f6359d = -1000.0f;
        this.f6360e = 0;
        this.f6361f = 3;
    }
}
