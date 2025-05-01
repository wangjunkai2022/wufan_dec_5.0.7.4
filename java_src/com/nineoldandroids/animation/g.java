package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.j;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatKeyframeSet.java */
/* loaded from: classes5.dex */
public class g extends k {

    /* renamed from: g  reason: collision with root package name */
    private float f57706g;

    /* renamed from: h  reason: collision with root package name */
    private float f57707h;

    /* renamed from: i  reason: collision with root package name */
    private float f57708i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57709j;

    public g(j.a... aVarArr) {
        super(aVarArr);
        this.f57709j = true;
    }

    @Override // com.nineoldandroids.animation.k
    public Object b(float f5) {
        return Float.valueOf(i(f5));
    }

    @Override // com.nineoldandroids.animation.k
    /* renamed from: h */
    public g clone() {
        ArrayList<j> arrayList = this.f57725e;
        int size = arrayList.size();
        j.a[] aVarArr = new j.a[size];
        for (int i4 = 0; i4 < size; i4++) {
            aVarArr[i4] = (j.a) arrayList.get(i4).clone();
        }
        return new g(aVarArr);
    }

    public float i(float f5) {
        int i4 = this.f57721a;
        if (i4 == 2) {
            if (this.f57709j) {
                this.f57709j = false;
                this.f57706g = ((j.a) this.f57725e.get(0)).p();
                float p4 = ((j.a) this.f57725e.get(1)).p();
                this.f57707h = p4;
                this.f57708i = p4 - this.f57706g;
            }
            Interpolator interpolator = this.f57724d;
            if (interpolator != null) {
                f5 = interpolator.getInterpolation(f5);
            }
            p pVar = this.f57726f;
            if (pVar == null) {
                return this.f57706g + (f5 * this.f57708i);
            }
            return ((Number) pVar.evaluate(f5, Float.valueOf(this.f57706g), Float.valueOf(this.f57707h))).floatValue();
        } else if (f5 <= 0.0f) {
            j.a aVar = (j.a) this.f57725e.get(0);
            j.a aVar2 = (j.a) this.f57725e.get(1);
            float p5 = aVar.p();
            float p6 = aVar2.p();
            float b5 = aVar.b();
            float b6 = aVar2.b();
            Interpolator c5 = aVar2.c();
            if (c5 != null) {
                f5 = c5.getInterpolation(f5);
            }
            float f6 = (f5 - b5) / (b6 - b5);
            p pVar2 = this.f57726f;
            return pVar2 == null ? p5 + (f6 * (p6 - p5)) : ((Number) pVar2.evaluate(f6, Float.valueOf(p5), Float.valueOf(p6))).floatValue();
        } else if (f5 >= 1.0f) {
            j.a aVar3 = (j.a) this.f57725e.get(i4 - 2);
            j.a aVar4 = (j.a) this.f57725e.get(this.f57721a - 1);
            float p7 = aVar3.p();
            float p8 = aVar4.p();
            float b7 = aVar3.b();
            float b8 = aVar4.b();
            Interpolator c6 = aVar4.c();
            if (c6 != null) {
                f5 = c6.getInterpolation(f5);
            }
            float f7 = (f5 - b7) / (b8 - b7);
            p pVar3 = this.f57726f;
            return pVar3 == null ? p7 + (f7 * (p8 - p7)) : ((Number) pVar3.evaluate(f7, Float.valueOf(p7), Float.valueOf(p8))).floatValue();
        } else {
            j.a aVar5 = (j.a) this.f57725e.get(0);
            int i5 = 1;
            while (true) {
                int i6 = this.f57721a;
                if (i5 < i6) {
                    j.a aVar6 = (j.a) this.f57725e.get(i5);
                    if (f5 < aVar6.b()) {
                        Interpolator c7 = aVar6.c();
                        if (c7 != null) {
                            f5 = c7.getInterpolation(f5);
                        }
                        float b9 = (f5 - aVar5.b()) / (aVar6.b() - aVar5.b());
                        float p9 = aVar5.p();
                        float p10 = aVar6.p();
                        p pVar4 = this.f57726f;
                        return pVar4 == null ? p9 + (b9 * (p10 - p9)) : ((Number) pVar4.evaluate(b9, Float.valueOf(p9), Float.valueOf(p10))).floatValue();
                    }
                    i5++;
                    aVar5 = aVar6;
                } else {
                    return ((Number) this.f57725e.get(i6 - 1).d()).floatValue();
                }
            }
        }
    }
}
