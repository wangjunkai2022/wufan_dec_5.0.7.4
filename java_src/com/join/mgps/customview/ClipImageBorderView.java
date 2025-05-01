package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes4.dex */
public class ClipImageBorderView extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f46548b;

    /* renamed from: c  reason: collision with root package name */
    private int f46549c;

    /* renamed from: d  reason: collision with root package name */
    private int f46550d;

    /* renamed from: e  reason: collision with root package name */
    private int f46551e;

    /* renamed from: f  reason: collision with root package name */
    private int f46552f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f46553g;

    public ClipImageBorderView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f46550d = getWidth() - (this.f46548b * 2);
        this.f46549c = (getHeight() - this.f46550d) / 2;
        this.f46553g.setColor(Color.parseColor("#aa000000"));
        this.f46553g.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, 0.0f, this.f46548b, getHeight(), this.f46553g);
        canvas.drawRect(getWidth() - this.f46548b, 0.0f, getWidth(), getHeight(), this.f46553g);
        canvas.drawRect(this.f46548b, 0.0f, getWidth() - this.f46548b, this.f46549c, this.f46553g);
        canvas.drawRect(this.f46548b, getHeight() - this.f46549c, getWidth() - this.f46548b, getHeight(), this.f46553g);
        this.f46553g.setColor(this.f46551e);
        this.f46553g.setStrokeWidth(this.f46552f);
        this.f46553g.setStyle(Paint.Style.STROKE);
        canvas.drawRect(this.f46548b, this.f46549c, getWidth() - this.f46548b, getHeight() - this.f46549c, this.f46553g);
    }

    public void setHorizontalPadding(int i4) {
        this.f46548b = i4;
    }

    public ClipImageBorderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipImageBorderView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46551e = Color.parseColor("#FFFFFF");
        this.f46552f = 1;
        this.f46552f = (int) TypedValue.applyDimension(1, 1, getResources().getDisplayMetrics());
        Paint paint = new Paint();
        this.f46553g = paint;
        paint.setAntiAlias(true);
    }
}
