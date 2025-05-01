package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
/* loaded from: classes5.dex */
public final class j extends t {
    private boolean aNB;
    private String aNC;
    private String aND;

    public j(com.kwad.sdk.pngencrypt.k kVar) {
        super("iTXt", kVar);
        this.aNB = false;
        this.aNC = "";
        this.aND = "";
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        int[] iArr = new int[3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            byte[] bArr = dVar.data;
            if (i4 >= bArr.length) {
                break;
            }
            if (bArr[i4] == 0) {
                iArr[i5] = i4;
                i5++;
                if (i5 == 1) {
                    i4 += 2;
                }
                if (i5 == 3) {
                    break;
                }
            }
            i4++;
        }
        if (i5 != 3) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad formed PngChunkITXT chunk"));
        }
        this.key = b.d(dVar.data, 0, iArr[0]);
        int i6 = iArr[0] + 1;
        byte[] bArr2 = dVar.data;
        boolean z4 = bArr2[i6] != 0;
        this.aNB = z4;
        int i7 = i6 + 1;
        if (z4 && bArr2[i7] != 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad formed PngChunkITXT chunk - bad compression method "));
        }
        this.aNC = b.d(dVar.data, i7, iArr[1] - i7);
        this.aND = b.e(dVar.data, iArr[1] + 1, (iArr[2] - iArr[1]) - 1);
        int i8 = iArr[2] + 1;
        if (this.aNB) {
            byte[] bArr3 = dVar.data;
            this.aNV = b.j(b.b(bArr3, i8, bArr3.length - i8, false));
            return;
        }
        byte[] bArr4 = dVar.data;
        this.aNV = b.e(bArr4, i8, bArr4.length - i8);
    }
}
