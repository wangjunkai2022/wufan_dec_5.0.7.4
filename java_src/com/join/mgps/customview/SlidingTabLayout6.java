package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class SlidingTabLayout6 extends SlidingTabLayout1 {
    protected int K;

    public SlidingTabLayout6(Context context) {
        super(context);
        this.K = 4;
        this.f47806u = 0;
        this.K = (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
    }

    @Override // com.join.mgps.customview.SlidingTabLayout1
    protected void e(Canvas canvas) {
        View childAt;
        int i4;
        if (isInEditMode() || this.f47793h == 0) {
            return;
        }
        int height = getHeight();
        this.f47796k.setColor(this.f47798m);
        float left = childAt.getLeft() * 1.0f;
        float right = this.f47791f.getChildAt(this.f47794i).getRight();
        if (this.f47795j > 0.0f && (i4 = this.f47794i) < this.f47793h - 1) {
            View childAt2 = this.f47791f.getChildAt(i4 + 1);
            float f5 = this.f47795j;
            left = (childAt2.getLeft() * f5) + ((1.0f - f5) * left);
            right = (childAt2.getRight() * f5) + ((1.0f - f5) * right);
        }
        float f6 = (int) (((1.0f - this.f47805t) * (right - left)) / 2.0f);
        float f7 = height;
        RectF rectF = new RectF(left + f6, height - this.f47804s, right - f6, f7);
        int i5 = this.K;
        canvas.drawRoundRect(rectF, i5, i5, this.f47796k);
        this.f47796k.setColor(this.f47799n);
        canvas.drawRect(0.0f, height - this.f47806u, this.f47791f.getWidth(), f7, this.f47796k);
        this.f47797l.setColor(this.f47800o);
        for (int i6 = 0; i6 < this.f47793h - 1; i6++) {
            View childAt3 = this.f47791f.getChildAt(i6);
            canvas.drawLine(childAt3.getRight(), this.f47807v, childAt3.getRight(), height - this.f47807v, this.f47797l);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.customview.SlidingTabLayout1
    public void i() {
        for (int i4 = 0; i4 < this.f47793h; i4++) {
            View childAt = this.f47791f.getChildAt(i4);
            childAt.setBackgroundResource(this.F);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.f47810y);
                textView.setTypeface(this.C, this.D);
                textView.setTextColor(this.A);
                textView.setTypeface(Typeface.defaultFromStyle(0));
                ViewPager viewPager = this.f47792g;
                if (viewPager != null && i4 == viewPager.getCurrentItem()) {
                    textView.setTextColor(this.B);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                    textView.setTextSize(0, this.f47811z);
                }
                if (this.H != null && i4 == this.f47794i) {
                    textView.setTextColor(this.B);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                    textView.setTextSize(0, this.f47811z);
                }
                if (this.f47802q) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.G));
                    }
                }
            }
        }
    }

    public SlidingTabLayout6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = 4;
        this.f47806u = 0;
        this.K = (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
    }
}
