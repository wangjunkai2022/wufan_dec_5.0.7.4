package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: GradientColorParser.java */
/* loaded from: classes2.dex */
public class o implements n0<com.airbnb.lottie.model.content.d> {

    /* renamed from: a  reason: collision with root package name */
    private int f4242a;

    public o(int i4) {
        this.f4242a = i4;
    }

    private com.airbnb.lottie.model.content.d b(com.airbnb.lottie.model.content.d dVar, List<Float> list) {
        int i4 = this.f4242a * 4;
        if (list.size() <= i4) {
            return dVar;
        }
        float[] b5 = dVar.b();
        int[] a5 = dVar.a();
        int size = (list.size() - i4) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i5 = 0;
        while (i4 < list.size()) {
            if (i4 % 2 == 0) {
                fArr[i5] = list.get(i4).floatValue();
            } else {
                fArr2[i5] = list.get(i4).floatValue();
                i5++;
            }
            i4++;
        }
        float[] e5 = e(dVar.b(), fArr);
        int length = e5.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            float f5 = e5[i6];
            int binarySearch = Arrays.binarySearch(b5, f5);
            int binarySearch2 = Arrays.binarySearch(fArr, f5);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i6] = d(f5, a5[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i6] = c(f5, fArr2[binarySearch2], b5, a5);
            }
        }
        return new com.airbnb.lottie.model.content.d(e5, iArr);
    }

    private int c(float f5, float f6, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f5 != fArr[0]) {
            for (int i4 = 1; i4 < fArr.length; i4++) {
                if (fArr[i4] >= f5 || i4 == fArr.length - 1) {
                    int i5 = i4 - 1;
                    float f7 = (f5 - fArr[i5]) / (fArr[i4] - fArr[i5]);
                    int i6 = iArr[i4];
                    int i7 = iArr[i5];
                    return Color.argb((int) (f6 * 255.0f), com.airbnb.lottie.utils.g.l(Color.red(i7), Color.red(i6), f7), com.airbnb.lottie.utils.g.l(Color.green(i7), Color.green(i6), f7), com.airbnb.lottie.utils.g.l(Color.blue(i7), Color.blue(i6), f7));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int d(float f5, int i4, float[] fArr, float[] fArr2) {
        float k4;
        if (fArr2.length >= 2 && f5 > fArr[0]) {
            for (int i5 = 1; i5 < fArr.length; i5++) {
                float f6 = fArr[i5];
                if (f6 >= f5 || i5 == fArr.length - 1) {
                    if (f6 <= f5) {
                        k4 = fArr2[i5];
                    } else {
                        int i6 = i5 - 1;
                        k4 = com.airbnb.lottie.utils.g.k(fArr2[i6], fArr2[i5], (f5 - fArr[i6]) / (fArr[i5] - fArr[i6]));
                    }
                    return Color.argb((int) (k4 * 255.0f), Color.red(i4), Color.green(i4), Color.blue(i4));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    protected static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            float f5 = i5 < fArr.length ? fArr[i5] : Float.NaN;
            float f6 = i6 < fArr2.length ? fArr2[i6] : Float.NaN;
            if (!Float.isNaN(f6) && f5 >= f6) {
                if (!Float.isNaN(f5) && f6 >= f5) {
                    fArr3[i7] = f5;
                    i5++;
                    i6++;
                    i4++;
                } else {
                    fArr3[i7] = f6;
                    i6++;
                }
            } else {
                fArr3[i7] = f5;
                i5++;
            }
        }
        return i4 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i4);
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: f */
    public com.airbnb.lottie.model.content.d a(JsonReader jsonReader, float f5) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z4 = jsonReader.y() == JsonReader.Token.BEGIN_ARRAY;
        if (z4) {
            jsonReader.b();
        }
        while (jsonReader.k()) {
            arrayList.add(Float.valueOf((float) jsonReader.p()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f4242a = 2;
        }
        if (z4) {
            jsonReader.g();
        }
        if (this.f4242a == -1) {
            this.f4242a = arrayList.size() / 4;
        }
        int i4 = this.f4242a;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f4242a * 4; i7++) {
            int i8 = i7 / 4;
            double floatValue = arrayList.get(i7).floatValue();
            int i9 = i7 % 4;
            if (i9 == 0) {
                if (i8 > 0) {
                    float f6 = (float) floatValue;
                    if (fArr[i8 - 1] >= f6) {
                        fArr[i8] = f6 + 0.01f;
                    }
                }
                fArr[i8] = (float) floatValue;
            } else if (i9 == 1) {
                Double.isNaN(floatValue);
                i5 = (int) (floatValue * 255.0d);
            } else if (i9 == 2) {
                Double.isNaN(floatValue);
                i6 = (int) (floatValue * 255.0d);
            } else if (i9 == 3) {
                Double.isNaN(floatValue);
                iArr[i8] = Color.argb(255, i5, i6, (int) (floatValue * 255.0d));
            }
        }
        return b(new com.airbnb.lottie.model.content.d(fArr, iArr), arrayList);
    }
}
