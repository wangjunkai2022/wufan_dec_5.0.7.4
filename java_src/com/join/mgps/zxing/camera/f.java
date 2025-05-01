package com.join.mgps.zxing.camera;

import android.graphics.Bitmap;
import com.google.zxing.LuminanceSource;
/* compiled from: PlanarYUVLuminanceSource.java */
/* loaded from: classes5.dex */
public final class f extends LuminanceSource {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f55071a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55072b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55073c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55074d;

    /* renamed from: e  reason: collision with root package name */
    private final int f55075e;

    public f(byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9) {
        super(i8, i9);
        if (i8 + i6 <= i4) {
            int i10 = i9 + i7;
        }
        this.f55071a = bArr;
        this.f55072b = i4;
        this.f55073c = i5;
        this.f55074d = i6;
        this.f55075e = i7;
    }

    public int a() {
        return this.f55073c;
    }

    public int b() {
        return this.f55072b;
    }

    public Bitmap c() {
        int width = getWidth();
        int height = getHeight();
        int[] iArr = new int[width * height];
        byte[] bArr = this.f55071a;
        int i4 = (this.f55075e * this.f55072b) + this.f55074d;
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = i5 * width;
            for (int i7 = 0; i7 < width; i7++) {
                iArr[i6 + i7] = ((bArr[i4 + i7] & 255) * 65793) | (-16777216);
            }
            i4 += this.f55072b;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i4 = this.f55072b;
        if (width == i4 && height == this.f55073c) {
            return this.f55071a;
        }
        int i5 = width * height;
        byte[] bArr = new byte[i5];
        int i6 = (this.f55075e * i4) + this.f55074d;
        if (width == i4) {
            System.arraycopy(this.f55071a, i6, bArr, 0, i5);
            return bArr;
        }
        byte[] bArr2 = this.f55071a;
        for (int i7 = 0; i7 < height; i7++) {
            System.arraycopy(bArr2, i6, bArr, i7 * width, width);
            i6 += this.f55072b;
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
            System.arraycopy(this.f55071a, ((i4 + this.f55075e) * this.f55072b) + this.f55074d, bArr, 0, width);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: " + i4);
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }
}
