package com.kwad.sdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public class DownloadProgressBar extends View {
    private Rect aTA;
    private LinearGradient aTB;
    private LinearGradient aTC;
    private LinearGradient aTD;
    private Runnable aTE;
    Paint aTv;
    Paint aTw;
    Paint aTx;
    private String aTy;
    private float aTz;
    private Matrix mMatrix;
    private Path mPath;
    private RectF mRectF;
    private long mStartTime;

    public DownloadProgressBar(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.aTE);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.clipPath(this.mPath);
        this.aTv.setShader(this.aTB);
        canvas.drawRect(this.mRectF, this.aTv);
        this.aTv.setShader(this.aTC);
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.aTz) / 100.0f, getHeight(), this.aTv);
        float f5 = this.aTz;
        float f6 = 0.0f;
        if (f5 > 0.0f && f5 < 100.0f) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.mStartTime) % 2500;
            float f7 = elapsedRealtime >= 1500 ? 0.0f : ((float) elapsedRealtime) / 1500.0f;
            this.mMatrix.reset();
            this.mMatrix.setScale(1.0f, f7);
            this.aTD.setLocalMatrix(this.mMatrix);
            this.aTw.setShader(this.aTD);
            canvas.drawRect(0.0f, 0.0f, ((getWidth() * this.aTz) / 100.0f) * f7, getHeight(), this.aTw);
            if (elapsedRealtime > 500 && elapsedRealtime <= 1500) {
                f6 = ((float) (elapsedRealtime - 500)) / 1000.0f;
            }
            float width = ((getWidth() * this.aTz) / 100.0f) * f6;
            this.mMatrix.reset();
            this.mMatrix.setScale(1.0f, f7);
            this.aTD.setLocalMatrix(this.mMatrix);
            this.aTw.setShader(this.aTD);
            canvas.drawRect(0.0f, 0.0f, width, getHeight(), this.aTw);
        }
        String str = this.aTy;
        if (str != null) {
            this.aTx.getTextBounds(str, 0, str.length(), this.aTA);
            Rect rect = this.aTA;
            canvas.drawText(this.aTy, getWidth() / 2.0f, (getHeight() / 2.0f) - ((rect.top + rect.bottom) / 2.0f), this.aTx);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.aTB = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{1291525714, 1291569420}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.aTC = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-319918, -276212}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.aTv.setShader(this.aTB);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{16501004, -276212}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.aTD = linearGradient;
        this.aTw.setShader(linearGradient);
        float f5 = i4;
        this.mRectF.set(0.0f, 0.0f, f5, i5);
        this.mPath.reset();
        float f6 = f5 / 2.0f;
        this.mPath.addRoundRect(this.mRectF, f6, f6, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i4) {
        super.onVisibilityChanged(view, i4);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (i4 == 0) {
            float f5 = this.aTz;
            if (f5 <= 0.0f || f5 >= 100.0f) {
                return;
            }
            this.mStartTime = SystemClock.elapsedRealtime();
            post(this.aTE);
            return;
        }
        removeCallbacks(this.aTE);
    }

    public void setProgress(float f5) {
        this.aTz = f5;
        invalidate();
        if (f5 != 0.0f && f5 != 100.0f) {
            if (getWindowVisibility() == 0 && this.mStartTime == 0) {
                post(this.aTE);
                return;
            }
            return;
        }
        removeCallbacks(this.aTE);
    }

    public void setText(String str) {
        this.aTy = str;
        invalidate();
    }

    public DownloadProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DownloadProgressBar(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.aTE = new Runnable() { // from class: com.kwad.sdk.widget.DownloadProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                DownloadProgressBar.this.invalidate();
                if (DownloadProgressBar.this.getWindowVisibility() == 0) {
                    DownloadProgressBar.this.postDelayed(this, 34L);
                }
            }
        };
        this.aTv = new Paint(1);
        this.aTw = new Paint(1);
        this.mRectF = new RectF();
        Paint paint = new Paint(1);
        this.aTx = paint;
        paint.setTextSize(com.kwad.sdk.c.a.a.a(context, 16.0f));
        this.aTx.setColor(-1);
        this.aTx.setTextAlign(Paint.Align.CENTER);
        this.aTA = new Rect();
        this.mMatrix = new Matrix();
        this.mPath = new Path();
    }
}
