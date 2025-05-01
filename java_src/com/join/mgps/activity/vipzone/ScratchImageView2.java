package com.join.mgps.activity.vipzone;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class ScratchImageView2 extends View {
    private String TAG;
    private Bitmap mBgBitmap;
    private Canvas mCanvas;
    Bitmap mDstBmp;
    float mEventX;
    float mEventY;
    private Bitmap mFgBitmap;
    private Paint mPaint;
    private Path mPath;
    Bitmap mSrcBmp;
    Bitmap mTxtBmp;
    private int viewHeight;
    private int viewWidth;

    public ScratchImageView2(Context context) {
        super(context);
        this.TAG = "ScratchImageView2";
    }

    private void init() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(SupportMenu.CATEGORY_MASK);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(80.0f);
        setLayerType(1, null);
        this.mTxtBmp = BitmapFactory.decodeResource(getResources(), R.drawable.icon).copy(Bitmap.Config.ARGB_8888, true);
        Bitmap copy = BitmapFactory.decodeResource(getResources(), R.drawable.scratch_imag).copy(Bitmap.Config.ARGB_8888, true);
        this.mSrcBmp = copy;
        this.mDstBmp = Bitmap.createBitmap(copy.getWidth(), this.mSrcBmp.getHeight(), Bitmap.Config.ARGB_8888);
        this.mPath = new Path();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(this.mTxtBmp, 0.0f, 0.0f, this.mPaint);
        int saveLayer = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.mPaint) : 0;
        new Canvas(this.mDstBmp).drawPath(this.mPath, this.mPaint);
        canvas.drawBitmap(this.mDstBmp, 0.0f, 0.0f, this.mPaint);
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        canvas.drawBitmap(this.mSrcBmp, 0.0f, 0.0f, this.mPaint);
        this.mPaint.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mEventX = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.mEventY = y2;
            this.mPath.moveTo(this.mEventX, y2);
        } else if (action == 2) {
            float x4 = motionEvent.getX();
            float f5 = this.mEventX;
            float f6 = ((x4 - f5) / 2.0f) + f5;
            float y4 = motionEvent.getY();
            float f7 = this.mEventY;
            this.mPath.quadTo(this.mEventX, f7, f6, ((y4 - f7) / 2.0f) + f7);
            this.mEventX = motionEvent.getX();
            this.mEventY = motionEvent.getY();
        }
        invalidate();
        return true;
    }

    public ScratchImageView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "ScratchImageView2";
        init();
    }

    public ScratchImageView2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.TAG = "ScratchImageView2";
    }
}
