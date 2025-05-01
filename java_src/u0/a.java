package u0;

import android.graphics.Bitmap;
import com.facebook.common.internal.h;
/* compiled from: InPlaceRoundFilter.java */
/* loaded from: classes2.dex */
public final class a {
    private a() {
    }

    public static void a(Bitmap bitmap) {
        h.i(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, height) / 2;
        int i4 = width / 2;
        int i5 = height / 2;
        if (min == 0) {
            return;
        }
        h.d(min >= 1);
        h.d(width > 0 && ((float) width) <= 2048.0f);
        h.d(height > 0 && ((float) height) <= 2048.0f);
        h.d(i4 > 0 && i4 < width);
        h.d(i5 > 0 && i5 < height);
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i6 = min - 1;
        h.d(i4 - i6 >= 0 && i5 - i6 >= 0 && i4 + i6 < width && i5 + i6 < height);
        int i7 = (-min) * 2;
        int[] iArr2 = new int[width];
        int i8 = i7 + 1;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        while (i6 >= i9) {
            int i12 = i4 + i6;
            int i13 = i4 - i6;
            int i14 = i4 + i9;
            int i15 = min;
            int i16 = i4 - i9;
            int i17 = i5 + i6;
            int i18 = i5 - i6;
            int i19 = i4;
            int i20 = i5 + i9;
            int i21 = i5 - i9;
            h.d(i6 >= 0 && i14 < width && i16 >= 0 && i20 < height && i21 >= 0);
            int i22 = i20 * width;
            int i23 = height;
            int i24 = width * i21;
            int i25 = i5;
            int i26 = width * i17;
            int i27 = i7;
            int i28 = width * i18;
            int i29 = i10;
            System.arraycopy(iArr2, 0, iArr, i22, i13);
            System.arraycopy(iArr2, 0, iArr, i24, i13);
            System.arraycopy(iArr2, 0, iArr, i26, i16);
            System.arraycopy(iArr2, 0, iArr, i28, i16);
            int i30 = width - i12;
            System.arraycopy(iArr2, 0, iArr, i22 + i12, i30);
            System.arraycopy(iArr2, 0, iArr, i24 + i12, i30);
            int i31 = width - i14;
            System.arraycopy(iArr2, 0, iArr, i26 + i14, i31);
            System.arraycopy(iArr2, 0, iArr, i28 + i14, i31);
            if (i8 <= 0) {
                i9++;
                i11 += 2;
                i8 += i11;
            }
            if (i8 > 0) {
                i6--;
                i10 = i29 + 2;
                i8 += i10 + i27;
                min = i15;
                i7 = i27;
            } else {
                min = i15;
                i7 = i27;
                i10 = i29;
            }
            i4 = i19;
            i5 = i25;
            height = i23;
        }
        int i32 = height;
        int i33 = min;
        int i34 = i5;
        for (int i35 = i34 - i33; i35 >= 0; i35--) {
            System.arraycopy(iArr2, 0, iArr, i35 * width, width);
        }
        for (int i36 = i34 + i33; i36 < i32; i36++) {
            System.arraycopy(iArr2, 0, iArr, i36 * width, width);
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, i32);
    }
}
