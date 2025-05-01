package u0;

import android.graphics.Bitmap;
import com.facebook.common.internal.h;
/* compiled from: IterativeBoxBlurFilter.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f73363a = "IterativeBoxBlurFilter";

    private static int a(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public static void b(Bitmap bitmap, int i4, int i5) {
        h.i(bitmap);
        h.d(bitmap.isMutable());
        h.d(((float) bitmap.getHeight()) <= 2048.0f);
        h.d(((float) bitmap.getWidth()) <= 2048.0f);
        h.d(i5 > 0 && i5 <= 25);
        h.d(i4 > 0);
        try {
            c(bitmap, i4, i5);
        } catch (OutOfMemoryError e5) {
            com.facebook.common.logging.a.u(f73363a, String.format(null, "OOM: %d iterations on %dx%d with %d radius", Integer.valueOf(i4), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i5)));
            throw e5;
        }
    }

    private static void c(Bitmap bitmap, int i4, int i5) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i6 = i5 + 1;
        int i7 = i6 + i5;
        int[] iArr2 = new int[i7 * 256];
        int i8 = 1;
        while (true) {
            if (i8 > 255) {
                break;
            }
            for (int i9 = 0; i9 < i7; i9++) {
                iArr2[i6] = i8;
                i6++;
            }
            i8++;
        }
        int[] iArr3 = new int[Math.max(width, height)];
        for (int i10 = 0; i10 < i4; i10++) {
            for (int i11 = 0; i11 < height; i11++) {
                d(iArr, iArr3, width, i11, i7, iArr2);
                System.arraycopy(iArr3, 0, iArr, i11 * width, width);
            }
            int i12 = 0;
            while (i12 < width) {
                int i13 = i12;
                e(iArr, iArr3, width, height, i12, i7, iArr2);
                int i14 = i13;
                for (int i15 = 0; i15 < height; i15++) {
                    iArr[i14] = iArr3[i15];
                    i14 += width;
                }
                i12 = i13 + 1;
            }
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    private static void d(int[] iArr, int[] iArr2, int i4, int i5, int i6, int[] iArr3) {
        int i7 = i4 * i5;
        int i8 = ((i5 + 1) * i4) - 1;
        int i9 = i6 >> 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = -i9; i14 < i4 + i9; i14++) {
            int i15 = iArr[a(i7 + i14, i7, i8)];
            i10 += (i15 >> 16) & 255;
            i11 += (i15 >> 8) & 255;
            i12 += i15 & 255;
            i13 += i15 >>> 24;
            if (i14 >= i9) {
                iArr2[i14 - i9] = (iArr3[i13] << 24) | (iArr3[i10] << 16) | (iArr3[i11] << 8) | iArr3[i12];
                int i16 = iArr[a((i14 - (i6 - 1)) + i7, i7, i8)];
                i10 -= (i16 >> 16) & 255;
                i11 -= (i16 >> 8) & 255;
                i12 -= i16 & 255;
                i13 -= i16 >>> 24;
            }
        }
    }

    private static void e(int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int[] iArr3) {
        int i8 = ((i5 - 1) * i4) + i6;
        int i9 = (i7 >> 1) * i4;
        int i10 = (i7 - 1) * i4;
        int i11 = i6 - i9;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i8 + i9) {
            int i17 = iArr[a(i11, i6, i8)];
            i12 += (i17 >> 16) & 255;
            i13 += (i17 >> 8) & 255;
            i14 += i17 & 255;
            i15 += i17 >>> 24;
            if (i11 - i9 >= i6) {
                iArr2[i16] = (iArr3[i15] << 24) | (iArr3[i12] << 16) | (iArr3[i13] << 8) | iArr3[i14];
                i16++;
                int i18 = iArr[a(i11 - i10, i6, i8)];
                i12 -= (i18 >> 16) & 255;
                i13 -= (i18 >> 8) & 255;
                i14 -= i18 & 255;
                i15 -= i18 >>> 24;
            }
            i11 += i4;
        }
    }
}
