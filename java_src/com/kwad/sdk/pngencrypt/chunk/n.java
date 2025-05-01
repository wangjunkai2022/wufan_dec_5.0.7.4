package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
/* loaded from: classes5.dex */
public final class n extends k {
    private String aNJ;
    private int aNK;
    private int[] aNL;

    public n(com.kwad.sdk.pngencrypt.k kVar) {
        super("sPLT", kVar);
    }

    public final String Le() {
        return this.aNJ;
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            bArr = dVar.data;
            if (i10 >= bArr.length) {
                i10 = -1;
                break;
            } else if (bArr[i10] == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 > 0 && i10 <= bArr.length - 2) {
            this.aNJ = b.d(bArr, 0, i10);
            int e5 = com.kwad.sdk.pngencrypt.n.e(dVar.data, i10 + 1);
            this.aNK = e5;
            int i11 = i10 + 2;
            int length = (dVar.data.length - i11) / (e5 == 8 ? 6 : 10);
            this.aNL = new int[length * 5];
            int i12 = i11;
            int i13 = 0;
            while (i9 < length) {
                if (this.aNK == 8) {
                    int i14 = i12 + 1;
                    i5 = com.kwad.sdk.pngencrypt.n.e(dVar.data, i12);
                    int i15 = i14 + 1;
                    i6 = com.kwad.sdk.pngencrypt.n.e(dVar.data, i14);
                    int i16 = i15 + 1;
                    i7 = com.kwad.sdk.pngencrypt.n.e(dVar.data, i15);
                    i4 = i16 + 1;
                    i8 = com.kwad.sdk.pngencrypt.n.e(dVar.data, i16);
                } else {
                    int f5 = com.kwad.sdk.pngencrypt.n.f(dVar.data, i12);
                    int i17 = i12 + 2;
                    int f6 = com.kwad.sdk.pngencrypt.n.f(dVar.data, i17);
                    int i18 = i17 + 2;
                    int f7 = com.kwad.sdk.pngencrypt.n.f(dVar.data, i18);
                    int i19 = i18 + 2;
                    int f8 = com.kwad.sdk.pngencrypt.n.f(dVar.data, i19);
                    i4 = i19 + 2;
                    i5 = f5;
                    i6 = f6;
                    i7 = f7;
                    i8 = f8;
                }
                int f9 = com.kwad.sdk.pngencrypt.n.f(dVar.data, i4);
                int[] iArr = this.aNL;
                int i20 = i13 + 1;
                iArr[i13] = i5;
                int i21 = i20 + 1;
                iArr[i20] = i6;
                int i22 = i21 + 1;
                iArr[i21] = i7;
                int i23 = i22 + 1;
                iArr[i22] = i8;
                iArr[i23] = f9;
                i9++;
                i13 = i23 + 1;
                i12 = i4 + 2;
            }
            return;
        }
        throw new PngjException("bad sPLT chunk: no separator found");
    }
}
