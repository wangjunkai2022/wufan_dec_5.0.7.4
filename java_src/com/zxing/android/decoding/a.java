package com.zxing.android.decoding;

import android.graphics.Bitmap;
import com.google.zxing.LuminanceSource;
/* compiled from: BitmapLuminanceSource.java */
/* loaded from: classes6.dex */
public class a extends LuminanceSource {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f68739a;

    public a(Bitmap bitmap) {
        super(bitmap.getWidth(), bitmap.getHeight());
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        this.f68739a = new byte[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, getWidth(), 0, 0, getWidth(), getHeight());
        for (int i4 = 0; i4 < width; i4++) {
            this.f68739a[i4] = (byte) iArr[i4];
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        return this.f68739a;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i4, byte[] bArr) {
        System.arraycopy(this.f68739a, i4 * getWidth(), bArr, 0, getWidth());
        return bArr;
    }
}
