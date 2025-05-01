package com.aggmoread.sdk.z.a.n;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f2346a;

    private a() {
    }

    private int a(int i4, int i5, int i6, int i7) {
        double d5 = i4;
        double d6 = i6;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = i5;
        double d8 = i7;
        Double.isNaN(d7);
        Double.isNaN(d8);
        double min = Math.min(d5 / d6, d7 / d8);
        float f5 = 1.0f;
        while (true) {
            float f6 = 2.0f * f5;
            if (f6 > min) {
                return (int) f5;
            }
            f5 = f6;
        }
    }

    private int a(int i4, int i5, int i6, int i7, ImageView.ScaleType scaleType) {
        if (i4 == 0 && i5 == 0) {
            return i6;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i4 == 0 ? i6 : i4;
        } else if (i4 == 0) {
            double d5 = i5;
            double d6 = i7;
            Double.isNaN(d5);
            Double.isNaN(d6);
            double d7 = i6;
            Double.isNaN(d7);
            return (int) (d7 * (d5 / d6));
        } else if (i5 == 0) {
            return i4;
        } else {
            double d8 = i7;
            double d9 = i6;
            Double.isNaN(d8);
            Double.isNaN(d9);
            double d10 = d8 / d9;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d11 = i4;
                Double.isNaN(d11);
                double d12 = i5;
                if (d11 * d10 < d12) {
                    Double.isNaN(d12);
                    return (int) (d12 / d10);
                }
                return i4;
            }
            double d13 = i4;
            Double.isNaN(d13);
            double d14 = i5;
            if (d13 * d10 > d14) {
                Double.isNaN(d14);
                return (int) (d14 / d10);
            }
            return i4;
        }
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f2346a == null) {
                synchronized (a.class) {
                    if (f2346a == null) {
                        f2346a = new a();
                    }
                }
            }
            aVar = f2346a;
        }
        return aVar;
    }

    public Bitmap a(int i4, int i5, Bitmap.Config config, ImageView.ScaleType scaleType, byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i4 == 0 && i5 == 0) {
            options.inPreferredConfig = config;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        int a5 = a(i4, i5, i6, i7, scaleType);
        int a6 = a(i5, i4, i7, i6, scaleType);
        options.inJustDecodeBounds = false;
        options.inSampleSize = a(i6, i7, a5, a6);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            if (decodeByteArray.getWidth() > a5 || decodeByteArray.getHeight() > a6) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a5, a6, true);
                decodeByteArray.recycle();
                return createScaledBitmap;
            }
            return decodeByteArray;
        }
        return decodeByteArray;
    }
}
