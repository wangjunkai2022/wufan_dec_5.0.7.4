package com.kwad.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public class RatioFrameLayout extends FrameLayout {
    private double apu;

    public RatioFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public double getRatio() {
        return this.apu;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.apu != 0.0d) {
            int size = View.MeasureSpec.getSize(i4);
            new StringBuilder("widthSize:").append(size);
            double d5 = size;
            double d6 = this.apu;
            Double.isNaN(d5);
            i5 = View.MeasureSpec.makeMeasureSpec((int) (d5 * d6), 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    public void setRatio(double d5) {
        this.apu = d5;
    }

    public RatioFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.apu = 0.0d;
    }
}
