package com.aggmoread.sdk.z.c.a.a.e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes2.dex */
public class l extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private float f3505a;

    public l(Context context) {
        super(context);
        new Path();
    }

    public void a(float f5) {
        this.f3505a = f5;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f5 = this.f3505a;
        path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
