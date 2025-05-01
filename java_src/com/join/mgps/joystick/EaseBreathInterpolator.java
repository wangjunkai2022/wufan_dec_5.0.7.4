package com.join.mgps.joystick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
/* loaded from: classes3.dex */
public class EaseBreathInterpolator implements Interpolator {
    public EaseBreathInterpolator() {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        double pow;
        double d5 = f5;
        if (d5 < 0.333d) {
            double d6 = f5 * 3.0f;
            Double.isNaN(d6);
            pow = (Math.sin((d6 * 3.141592653589793d) - 1.5707963267948966d) * 0.5d) + 0.5d;
        } else {
            Double.isNaN(d5);
            pow = Math.pow((Math.sin((d5 * (-9.42477796076938d) * 0.5d) + 3.141592653589793d) * 0.5d) + 0.5d, 2.0d);
        }
        return (float) pow;
    }

    public EaseBreathInterpolator(Context context, AttributeSet attributeSet) {
    }
}
