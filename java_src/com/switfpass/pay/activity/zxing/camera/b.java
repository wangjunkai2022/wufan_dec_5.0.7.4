package com.switfpass.pay.activity.zxing.camera;

import android.graphics.Bitmap;
import com.google.zxing.LuminanceSource;
/* loaded from: classes5.dex */
public final class b extends LuminanceSource {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f61631a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61632b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61633c;

    /* renamed from: d  reason: collision with root package name */
    private final int f61634d;

    /* renamed from: e  reason: collision with root package name */
    private final int f61635e;

    public b(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        super(i8, i9);
        if (i8 + i6 > i4 || i9 + i7 > i5) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f61631a = bArr;
        this.f61632b = i4;
        this.f61633c = i5;
        this.f61634d = i6;
        this.f61635e = i7;
    }

    public final int a() {
        return this.f61633c;
    }

    public final int b() {
        return this.f61632b;
    }

    public final Bitmap c() {
        int width = getWidth();
        int height = getHeight();
        int[] iArr = new int[width * height];
        byte[] bArr = this.f61631a;
        int i4 = (this.f61635e * this.f61632b) + this.f61634d;
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = i5 * width;
            for (int i7 = 0; i7 < width; i7++) {
                iArr[i6 + i7] = ((bArr[i4 + i7] & 255) * 65793) | (-16777216);
            }
            i4 += this.f61632b;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i4 = this.f61632b;
        if (width == i4 && height == this.f61633c) {
            return this.f61631a;
        }
        int i5 = width * height;
        byte[] bArr = new byte[i5];
        int i6 = (this.f61635e * i4) + this.f61634d;
        if (width == i4) {
            System.arraycopy(this.f61631a, i6, bArr, 0, i5);
            return bArr;
        }
        byte[] bArr2 = this.f61631a;
        for (int i7 = 0; i7 < height; i7++) {
            System.arraycopy(bArr2, i6, bArr, i7 * width, width);
            i6 += this.f61632b;
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] getRow(int i4, byte[] bArr) {
        if (i4 < 0 || i4 >= getHeight()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i4);
        }
        int width = getWidth();
        if (bArr == null || bArr.length < width) {
            bArr = new byte[width];
        }
        System.arraycopy(this.f61631a, ((i4 + this.f61635e) * this.f61632b) + this.f61634d, bArr, 0, width);
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public final boolean isCropSupported() {
        return true;
    }
}
