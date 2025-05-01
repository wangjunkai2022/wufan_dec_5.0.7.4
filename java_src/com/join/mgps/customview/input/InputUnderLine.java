package com.join.mgps.customview.input;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class InputUnderLine extends EditText {

    /* renamed from: b  reason: collision with root package name */
    private Paint f48527b;

    public InputUnderLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f48527b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f48527b.setColor(context.getResources().getColor(R.color.app_gray_color));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0.0f, getHeight() - 1, getWidth() - 1, getHeight() - 1, this.f48527b);
    }
}
