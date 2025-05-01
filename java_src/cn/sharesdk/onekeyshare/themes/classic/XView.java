package cn.sharesdk.onekeyshare.themes.classic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* loaded from: classes2.dex */
public class XView extends View {
    private float ratio;

    public XView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-6250336);
        float width = getWidth() / 2;
        canvas.drawRect(width, 0.0f, getWidth(), getHeight() / 2, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(this.ratio * 3.0f);
        paint2.setColor(-1);
        float f5 = this.ratio * 8.0f;
        float f6 = width + f5;
        float f7 = width - f5;
        canvas.drawLine(f6, f5, getWidth() - f5, f7, paint2);
        canvas.drawLine(f6, f7, getWidth() - f5, f5, paint2);
    }

    public void setRatio(float f5) {
        this.ratio = f5;
    }
}
