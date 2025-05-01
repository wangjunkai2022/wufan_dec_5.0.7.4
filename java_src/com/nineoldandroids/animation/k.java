package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.j;
import java.util.ArrayList;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeyframeSet.java */
/* loaded from: classes5.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    int f57721a;

    /* renamed from: b  reason: collision with root package name */
    j f57722b;

    /* renamed from: c  reason: collision with root package name */
    j f57723c;

    /* renamed from: d  reason: collision with root package name */
    Interpolator f57724d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<j> f57725e;

    /* renamed from: f  reason: collision with root package name */
    p f57726f;

    public k(j... jVarArr) {
        this.f57721a = jVarArr.length;
        ArrayList<j> arrayList = new ArrayList<>();
        this.f57725e = arrayList;
        arrayList.addAll(Arrays.asList(jVarArr));
        this.f57722b = this.f57725e.get(0);
        j jVar = this.f57725e.get(this.f57721a - 1);
        this.f57723c = jVar;
        this.f57724d = jVar.c();
    }

    public static k c(float... fArr) {
        int length = fArr.length;
        j.a[] aVarArr = new j.a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (j.a) j.f(0.0f);
            aVarArr[1] = (j.a) j.g(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (j.a) j.g(0.0f, fArr[0]);
            for (int i4 = 1; i4 < length; i4++) {
                aVarArr[i4] = (j.a) j.g(i4 / (length - 1), fArr[i4]);
            }
        }
        return new g(aVarArr);
    }

    public static k d(int... iArr) {
        int length = iArr.length;
        j.b[] bVarArr = new j.b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (j.b) j.h(0.0f);
            bVarArr[1] = (j.b) j.i(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (j.b) j.i(0.0f, iArr[0]);
            for (int i4 = 1; i4 < length; i4++) {
                bVarArr[i4] = (j.b) j.i(i4 / (length - 1), iArr[i4]);
            }
        }
        return new i(bVarArr);
    }

    public static k e(j... jVarArr) {
        int length = jVarArr.length;
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (int i5 = 0; i5 < length; i5++) {
            if (jVarArr[i5] instanceof j.a) {
                z4 = true;
            } else if (jVarArr[i5] instanceof j.b) {
                z5 = true;
            } else {
                z6 = true;
            }
        }
        if (z4 && !z5 && !z6) {
            j.a[] aVarArr = new j.a[length];
            while (i4 < length) {
                aVarArr[i4] = (j.a) jVarArr[i4];
                i4++;
            }
            return new g(aVarArr);
        } else if (z5 && !z4 && !z6) {
            j.b[] bVarArr = new j.b[length];
            while (i4 < length) {
                bVarArr[i4] = (j.b) jVarArr[i4];
                i4++;
            }
            return new i(bVarArr);
        } else {
            return new k(jVarArr);
        }
    }

    public static k f(Object... objArr) {
        int length = objArr.length;
        j.c[] cVarArr = new j.c[Math.max(length, 2)];
        if (length == 1) {
            cVarArr[0] = (j.c) j.j(0.0f);
            cVarArr[1] = (j.c) j.k(1.0f, objArr[0]);
        } else {
            cVarArr[0] = (j.c) j.k(0.0f, objArr[0]);
            for (int i4 = 1; i4 < length; i4++) {
                cVarArr[i4] = (j.c) j.k(i4 / (length - 1), objArr[i4]);
            }
        }
        return new k(cVarArr);
    }

    @Override // 
    /* renamed from: a */
    public k clone() {
        ArrayList<j> arrayList = this.f57725e;
        int size = arrayList.size();
        j[] jVarArr = new j[size];
        for (int i4 = 0; i4 < size; i4++) {
            jVarArr[i4] = arrayList.get(i4).clone();
        }
        return new k(jVarArr);
    }

    public Object b(float f5) {
        int i4 = this.f57721a;
        if (i4 == 2) {
            Interpolator interpolator = this.f57724d;
            if (interpolator != null) {
                f5 = interpolator.getInterpolation(f5);
            }
            return this.f57726f.evaluate(f5, this.f57722b.d(), this.f57723c.d());
        }
        int i5 = 1;
        if (f5 <= 0.0f) {
            j jVar = this.f57725e.get(1);
            Interpolator c5 = jVar.c();
            if (c5 != null) {
                f5 = c5.getInterpolation(f5);
            }
            float b5 = this.f57722b.b();
            return this.f57726f.evaluate((f5 - b5) / (jVar.b() - b5), this.f57722b.d(), jVar.d());
        } else if (f5 >= 1.0f) {
            j jVar2 = this.f57725e.get(i4 - 2);
            Interpolator c6 = this.f57723c.c();
            if (c6 != null) {
                f5 = c6.getInterpolation(f5);
            }
            float b6 = jVar2.b();
            return this.f57726f.evaluate((f5 - b6) / (this.f57723c.b() - b6), jVar2.d(), this.f57723c.d());
        } else {
            j jVar3 = this.f57722b;
            while (i5 < this.f57721a) {
                j jVar4 = this.f57725e.get(i5);
                if (f5 < jVar4.b()) {
                    Interpolator c7 = jVar4.c();
                    if (c7 != null) {
                        f5 = c7.getInterpolation(f5);
                    }
                    float b7 = jVar3.b();
                    return this.f57726f.evaluate((f5 - b7) / (jVar4.b() - b7), jVar3.d(), jVar4.d());
                }
                i5++;
                jVar3 = jVar4;
            }
            return this.f57723c.d();
        }
    }

    public void g(p pVar) {
        this.f57726f = pVar;
    }

    public String toString() {
        String str = " ";
        for (int i4 = 0; i4 < this.f57721a; i4++) {
            str = str + this.f57725e.get(i4).d() + "  ";
        }
        return str;
    }
}
