package com.nineoldandroids.animation;
/* compiled from: IntEvaluator.java */
/* loaded from: classes5.dex */
public class h implements p<Integer> {
    @Override // com.nineoldandroids.animation.p
    /* renamed from: a */
    public Integer evaluate(float f5, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) (intValue + (f5 * (num2.intValue() - intValue))));
    }
}
