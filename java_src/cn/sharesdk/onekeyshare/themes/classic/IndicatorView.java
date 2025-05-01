package cn.sharesdk.onekeyshare.themes.classic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* loaded from: classes2.dex */
public class IndicatorView extends View {
    private static final int DESIGN_BOTTOM_HEIGHT = 52;
    private static final int DESIGN_INDICATOR_DISTANCE = 14;
    private static final int DESIGN_INDICATOR_RADIUS = 6;
    private int count;
    private int current;

    public IndicatorView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        if (this.count <= 1) {
            setVisibility(8);
            return;
        }
        float height = getHeight();
        float f5 = (6.0f * height) / 52.0f;
        float f6 = (14.0f * height) / 52.0f;
        float f7 = f5 * 2.0f;
        float width = (getWidth() - ((this.count * f7) + ((i4 - 1) * f6))) / 2.0f;
        float f8 = height / 2.0f;
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        for (int i5 = 0; i5 < this.count; i5++) {
            if (i5 == this.current) {
                paint.setColor(-10653280);
            } else {
                paint.setColor(-5262921);
            }
            canvas.drawCircle(((f7 + f6) * i5) + width, f8, f5, paint);
        }
    }

    public void onScreenChange(int i4, int i5) {
        if (i4 != this.current) {
            this.current = i4;
            postInvalidate();
        }
    }

    public void setScreenCount(int i4) {
        this.count = i4;
    }
}
