package com.join.mgps.ptr.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
/* loaded from: classes4.dex */
public class DropBounceInterpolator implements Interpolator {
    public DropBounceInterpolator() {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 < 0.25f) {
            double d5 = f5;
            Double.isNaN(d5);
            return (((float) Math.pow(d5 - 0.125d, 2.0d)) * (-38.4f)) + 0.6f;
        }
        double d6 = f5;
        if (d6 < 0.5d || d6 >= 0.75d) {
            return 0.0f;
        }
        Double.isNaN(d6);
        return (((float) Math.pow(d6 - 0.625d, 2.0d)) * (-19.2f)) + 0.3f;
    }

    public DropBounceInterpolator(Context context, AttributeSet attributeSet) {
    }
}
