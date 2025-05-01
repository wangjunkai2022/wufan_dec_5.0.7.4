package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.j;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntKeyframeSet.java */
/* loaded from: classes5.dex */
public class i extends k {

    /* renamed from: g  reason: collision with root package name */
    private int f57710g;

    /* renamed from: h  reason: collision with root package name */
    private int f57711h;

    /* renamed from: i  reason: collision with root package name */
    private int f57712i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57713j;

    public i(j.b... bVarArr) {
        super(bVarArr);
        this.f57713j = true;
    }

    @Override // com.nineoldandroids.animation.k
    public Object b(float f5) {
        return Integer.valueOf(i(f5));
    }

    @Override // com.nineoldandroids.animation.k
    /* renamed from: h */
    public i clone() {
        ArrayList<j> arrayList = this.f57725e;
        int size = arrayList.size();
        j.b[] bVarArr = new j.b[size];
        for (int i4 = 0; i4 < size; i4++) {
            bVarArr[i4] = (j.b) arrayList.get(i4).clone();
        }
        return new i(bVarArr);
    }

    public int i(float f5) {
        int i4 = this.f57721a;
        if (i4 == 2) {
            if (this.f57713j) {
                this.f57713j = false;
                this.f57710g = ((j.b) this.f57725e.get(0)).p();
                int p4 = ((j.b) this.f57725e.get(1)).p();
                this.f57711h = p4;
                this.f57712i = p4 - this.f57710g;
            }
            Interpolator interpolator = this.f57724d;
            if (interpolator != null) {
                f5 = interpolator.getInterpolation(f5);
            }
            p pVar = this.f57726f;
            if (pVar == null) {
                return this.f57710g + ((int) (f5 * this.f57712i));
            }
            return ((Number) pVar.evaluate(f5, Integer.valueOf(this.f57710g), Integer.valueOf(this.f57711h))).intValue();
        } else if (f5 <= 0.0f) {
            j.b bVar = (j.b) this.f57725e.get(0);
            j.b bVar2 = (j.b) this.f57725e.get(1);
            int p5 = bVar.p();
            int p6 = bVar2.p();
            float b5 = bVar.b();
            float b6 = bVar2.b();
            Interpolator c5 = bVar2.c();
            if (c5 != null) {
                f5 = c5.getInterpolation(f5);
            }
            float f6 = (f5 - b5) / (b6 - b5);
            p pVar2 = this.f57726f;
            return pVar2 == null ? p5 + ((int) (f6 * (p6 - p5))) : ((Number) pVar2.evaluate(f6, Integer.valueOf(p5), Integer.valueOf(p6))).intValue();
        } else if (f5 >= 1.0f) {
            j.b bVar3 = (j.b) this.f57725e.get(i4 - 2);
            j.b bVar4 = (j.b) this.f57725e.get(this.f57721a - 1);
            int p7 = bVar3.p();
            int p8 = bVar4.p();
            float b7 = bVar3.b();
            float b8 = bVar4.b();
            Interpolator c6 = bVar4.c();
            if (c6 != null) {
                f5 = c6.getInterpolation(f5);
            }
            float f7 = (f5 - b7) / (b8 - b7);
            p pVar3 = this.f57726f;
            return pVar3 == null ? p7 + ((int) (f7 * (p8 - p7))) : ((Number) pVar3.evaluate(f7, Integer.valueOf(p7), Integer.valueOf(p8))).intValue();
        } else {
            j.b bVar5 = (j.b) this.f57725e.get(0);
            int i5 = 1;
            while (true) {
                int i6 = this.f57721a;
                if (i5 < i6) {
                    j.b bVar6 = (j.b) this.f57725e.get(i5);
                    if (f5 < bVar6.b()) {
                        Interpolator c7 = bVar6.c();
                        if (c7 != null) {
                            f5 = c7.getInterpolation(f5);
                        }
                        float b9 = (f5 - bVar5.b()) / (bVar6.b() - bVar5.b());
                        int p9 = bVar5.p();
                        int p10 = bVar6.p();
                        p pVar4 = this.f57726f;
                        return pVar4 == null ? p9 + ((int) (b9 * (p10 - p9))) : ((Number) pVar4.evaluate(b9, Integer.valueOf(p9), Integer.valueOf(p10))).intValue();
                    }
                    i5++;
                    bVar5 = bVar6;
                } else {
                    return ((Number) this.f57725e.get(i6 - 1).d()).intValue();
                }
            }
        }
    }
}
