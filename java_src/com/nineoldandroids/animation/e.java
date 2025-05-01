package com.nineoldandroids.animation;
/* compiled from: ArgbEvaluator.java */
/* loaded from: classes5.dex */
public class e implements p {
    @Override // com.nineoldandroids.animation.p
    public Object evaluate(float f5, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        int i4 = intValue >> 24;
        int i5 = (intValue >> 16) & 255;
        int i6 = (intValue >> 8) & 255;
        int i7 = intValue & 255;
        int intValue2 = ((Integer) obj2).intValue();
        return Integer.valueOf(((i4 + ((int) (((intValue2 >> 24) - i4) * f5))) << 24) | ((i5 + ((int) ((((intValue2 >> 16) & 255) - i5) * f5))) << 16) | ((i6 + ((int) ((((intValue2 >> 8) & 255) - i6) * f5))) << 8) | (i7 + ((int) (f5 * ((intValue2 & 255) - i7)))));
    }
}
