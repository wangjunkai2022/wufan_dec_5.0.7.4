package com.zxing.android.camera;

import android.graphics.Bitmap;
import com.google.zxing.LuminanceSource;
/* compiled from: PlanarYUVLuminanceSource.java */
/* loaded from: classes6.dex */
public final class e extends LuminanceSource {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f68722a;

    /* renamed from: b  reason: collision with root package name */
    private final int f68723b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68724c;

    /* renamed from: d  reason: collision with root package name */
    private final int f68725d;

    /* renamed from: e  reason: collision with root package name */
    private final int f68726e;

    public e(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4) {
        super(i8, i9);
        if (i6 + i8 <= i4 && i7 + i9 <= i5) {
            this.f68722a = bArr;
            this.f68723b = i4;
            this.f68724c = i5;
            this.f68725d = i6;
            this.f68726e = i7;
            if (z4) {
                b(i8, i9);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    private void b(int i4, int i5) {
        byte[] bArr = this.f68722a;
        int i6 = (this.f68726e * this.f68723b) + this.f68725d;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = (i4 / 2) + i6;
            int i9 = (i6 + i4) - 1;
            int i10 = i6;
            while (i10 < i8) {
                byte b5 = bArr[i10];
                bArr[i10] = bArr[i9];
                bArr[i9] = b5;
                i10++;
                i9--;
            }
            i7++;
            i6 += this.f68723b;
        }
    }

    public Bitmap a() {
        int width = getWidth();
        int height = getHeight();
        int[] iArr = new int[width * height];
        byte[] bArr = this.f68722a;
        int i4 = (this.f68726e * this.f68723b) + this.f68725d;
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = i5 * width;
            for (int i7 = 0; i7 < width; i7++) {
                iArr[i6 + i7] = ((bArr[i4 + i7] & 255) * 65793) | (-16777216);
            }
            i4 += this.f68723b;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i4 = this.f68723b;
        if (width == i4 && height == this.f68724c) {
            return this.f68722a;
        }
        int i5 = width * height;
        byte[] bArr = new byte[i5];
        int i6 = (this.f68726e * i4) + this.f68725d;
        if (width == i4) {
            System.arraycopy(this.f68722a, i6, bArr, 0, i5);
            return bArr;
        }
        byte[] bArr2 = this.f68722a;
        for (int i7 = 0; i7 < height; i7++) {
            System.arraycopy(bArr2, i6, bArr, i7 * width, width);
            i6 += this.f68723b;
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i4, byte[] bArr) {
        if (i4 >= 0 && i4 < getHeight()) {
            int width = getWidth();
            if (bArr == null || bArr.length < width) {
                bArr = new byte[width];
            }
            try {
                System.arraycopy(this.f68722a, ((i4 + this.f68726e) * this.f68723b) + this.f68725d, bArr, 0, width);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: " + i4);
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }
}
