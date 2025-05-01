package s0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
/* compiled from: AnimatedDrawableUtil.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f73354a = 11;

    /* renamed from: b  reason: collision with root package name */
    private static final int f73355b = 100;

    public static boolean f(int i4, int i5, int i6) {
        if (i4 == -1 || i5 == -1) {
            return true;
        }
        if (i4 <= i5) {
            if (i6 < i4 || i6 > i5) {
                return true;
            }
        } else if (i6 < i4 && i6 > i5) {
            return true;
        }
        return false;
    }

    public void a(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] < 11) {
                iArr[i4] = 100;
            }
        }
    }

    public int b(int[] iArr, int i4) {
        int binarySearch = Arrays.binarySearch(iArr, i4);
        return binarySearch < 0 ? ((-binarySearch) - 1) - 1 : binarySearch;
    }

    public int[] c(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr2[i5] = i4;
            i4 += iArr[i5];
        }
        return iArr2;
    }

    @SuppressLint({"NewApi"})
    public int d(Bitmap bitmap) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (i4 >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getWidth() * bitmap.getHeight() * 4;
    }

    public int e(int[] iArr) {
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        return i4;
    }
}
