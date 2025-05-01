package com.join.android.app.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes3.dex */
public class RoundImageView extends ImageView {

    /* renamed from: b  reason: collision with root package name */
    private final RectF f14947b;

    /* renamed from: c  reason: collision with root package name */
    private float f14948c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f14949d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f14950e;

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14947b = new RectF();
        this.f14948c = 6.0f;
        this.f14949d = new Paint();
        this.f14950e = new Paint();
        a();
    }

    private void a() {
        this.f14949d.setAntiAlias(true);
        this.f14949d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f14950e.setAntiAlias(true);
        this.f14950e.setColor(-1);
        this.f14948c *= getResources().getDisplayMetrics().density;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f14947b, this.f14950e, 31);
        RectF rectF = this.f14947b;
        float f5 = this.f14948c;
        canvas.drawRoundRect(rectF, f5, f5, this.f14950e);
        canvas.saveLayer(this.f14947b, this.f14949d, 31);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f14947b.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public RoundImageView(Context context) {
        super(context);
        this.f14947b = new RectF();
        this.f14948c = 6.0f;
        this.f14949d = new Paint();
        this.f14950e = new Paint();
        a();
    }
}
