package com.nineoldandroids.animation;
/* compiled from: FloatEvaluator.java */
/* loaded from: classes5.dex */
public class f implements p<Number> {
    @Override // com.nineoldandroids.animation.p
    /* renamed from: a */
    public Float evaluate(float f5, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + (f5 * (number2.floatValue() - floatValue)));
    }
}
