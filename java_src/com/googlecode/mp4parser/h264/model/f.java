package com.googlecode.mp4parser.h264.model;

import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
/* compiled from: ScalingList.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public int[] f14141a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14142b;

    public static f a(com.googlecode.mp4parser.h264.read.b bVar, int i4) throws IOException {
        f fVar = new f();
        fVar.f14141a = new int[i4];
        int i5 = 8;
        int i6 = 8;
        int i7 = 0;
        while (i7 < i4) {
            if (i5 != 0) {
                i5 = ((bVar.t("deltaScale") + i6) + 256) % 256;
                fVar.f14142b = i7 == 0 && i5 == 0;
            }
            int[] iArr = fVar.f14141a;
            if (i5 != 0) {
                i6 = i5;
            }
            iArr[i7] = i6;
            i6 = iArr[i7];
            i7++;
        }
        return fVar;
    }

    public void b(h1.b bVar) throws IOException {
        int i4 = 0;
        if (this.f14142b) {
            bVar.i(0, "SPS: ");
            return;
        }
        int i5 = 8;
        while (true) {
            int[] iArr = this.f14141a;
            if (i4 >= iArr.length) {
                return;
            }
            bVar.i((iArr[i4] - i5) + InputDeviceCompat.SOURCE_ANY, "SPS: ");
            i5 = this.f14141a[i4];
            i4++;
        }
    }

    public String toString() {
        return "ScalingList{scalingList=" + this.f14141a + ", useDefaultScalingMatrixFlag=" + this.f14142b + '}';
    }
}
