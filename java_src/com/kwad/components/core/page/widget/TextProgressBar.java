package com.kwad.components.core.page.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.kwad.sdk.n.l;
/* loaded from: classes5.dex */
public class TextProgressBar extends ProgressBar {
    @Nullable
    private String Rf;
    private LinearGradient Rg;
    private Matrix Rh;
    private boolean Ri;
    private boolean Rj;
    private boolean Rk;
    private int Rl;
    private int Rm;
    private Drawable Rn;
    private int Ro;
    private Rect Rp;
    private int[] Rq;
    private int Rr;
    private int Rs;
    private boolean Rt;
    private Paint mPaint;
    private RectF mRectF;

    public TextProgressBar(Context context) {
        this(context, null);
    }

    private void qC() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-1);
        this.mPaint.setTextSize(com.kwad.sdk.c.a.a.a(getContext(), 12.0f));
        this.Ro = com.kwad.sdk.c.a.a.a(getContext(), 2.0f);
        this.mRectF = new RectF();
        this.Rr = -1;
        this.Rs = -117146;
    }

    private void setProgressText(int i4) {
        this.Rf = String.valueOf((int) (((i4 * 1.0f) / getMax()) * 100.0f)) + "%";
    }

    public final void e(String str, int i4) {
        this.Rf = str;
        this.Ri = true;
        setProgress(i4);
        invalidate();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int width;
        if (this.Rj) {
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -getWidth());
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (!TextUtils.isEmpty(this.Rf)) {
            Paint paint = this.mPaint;
            String str = this.Rf;
            paint.getTextBounds(str, 0, str.length(), this.Rp);
        }
        int height = (getHeight() / 2) - this.Rp.centerY();
        Drawable drawable = this.Rn;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.Rn.getIntrinsicHeight();
            int width2 = (((getWidth() - this.Rp.width()) - intrinsicWidth) - this.Ro) / 2;
            int i4 = intrinsicWidth + width2;
            this.Rn.setBounds(width2, (getHeight() - intrinsicHeight) / 2, i4, (getHeight() + intrinsicHeight) / 2);
            this.Rn.draw(canvas);
            width = i4 + this.Ro;
        } else {
            width = (getWidth() / 2) - this.Rp.centerX();
        }
        if (this.Rq != null) {
            float progress = ((getProgress() * 1.0f) / getMax()) * getWidth();
            float f5 = width;
            if (progress >= f5) {
                if (this.Rg == null) {
                    this.Rg = new LinearGradient(f5, 0.0f, width + this.Rp.width(), 0.0f, this.Rq, (float[]) null, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    this.Rh = matrix;
                    this.Rg.setLocalMatrix(matrix);
                }
                this.mPaint.setShader(this.Rg);
                this.Rh.setScale(((progress - f5) * 1.0f) / this.Rp.width(), 1.0f, f5, 0.0f);
                this.Rg.setLocalMatrix(this.Rh);
            } else {
                this.mPaint.setShader(null);
            }
            canvas.drawText(this.Rf, f5, height, this.mPaint);
            return;
        }
        if (!isIndeterminate() && !this.Rt) {
            this.mPaint.setColor(this.Rr);
            String str2 = this.Rf;
            if (str2 != null) {
                canvas.drawText(str2, width, height, this.mPaint);
            }
            return;
        }
        float width3 = (getWidth() * getProgress()) / getMax();
        int save = canvas.save();
        this.mRectF.set(width3, 0.0f, getWidth(), getHeight());
        canvas.clipRect(this.mRectF);
        this.mPaint.setColor(this.Rs);
        String str3 = this.Rf;
        if (str3 != null) {
            canvas.drawText(str3, width, height, this.mPaint);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        this.mRectF.set(0.0f, 0.0f, width3, getHeight());
        canvas.clipRect(this.mRectF);
        this.mPaint.setColor(this.Rr);
        String str4 = this.Rf;
        if (str4 != null) {
            canvas.drawText(str4, width, height, this.mPaint);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && !TextUtils.isEmpty(this.Rf)) {
            Rect rect = new Rect();
            Paint paint = this.mPaint;
            String str = this.Rf;
            paint.getTextBounds(str, 0, str.length(), rect);
            if (layoutParams.width == -2) {
                int width = rect.width() + this.Rl + this.Rm;
                layoutParams.width = width;
                i4 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
            }
            if (layoutParams.height == -2) {
                int height = rect.height();
                layoutParams.height = height;
                i5 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
            }
        }
        if (this.Rj) {
            super.onMeasure(i5, i4);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (this.Rj) {
            super.onSizeChanged(i5, i4, i6, i7);
        } else {
            super.onSizeChanged(i4, i5, i6, i7);
        }
    }

    public void setDrawableLeft(Drawable drawable) {
        this.Rn = drawable;
    }

    public void setDrawablePadding(int i4) {
        this.Ro = i4;
    }

    public void setHasProgress(boolean z4) {
        this.Rk = z4;
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.Rl = i4;
        this.Rm = i6;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i4) {
        if (this.Rk) {
            super.setProgress(i4);
        } else {
            super.setProgress(0);
        }
    }

    public void setTextColor(int i4) {
        this.Rt = false;
        this.Rr = i4;
        postInvalidate();
    }

    public void setTextDimen(float f5) {
        this.mPaint.setTextSize(f5);
    }

    public void setTextDimenSp(int i4) {
        this.mPaint.setTextSize(TypedValue.applyDimension(2, i4, getResources().getDisplayMetrics()));
    }

    public void setVertical(boolean z4) {
        this.Rj = z4;
    }

    public TextProgressBar(Context context, AttributeSet attributeSet) {
        super(l.wrapContextIfNeed(context), attributeSet);
        this.Rj = false;
        this.Rk = true;
        this.Rp = new Rect();
        qC();
    }

    public final void setTextColor(@ColorInt int i4, @ColorInt int i5) {
        this.Rt = true;
        this.Rr = i4;
        this.Rs = i5;
        postInvalidate();
    }
}
