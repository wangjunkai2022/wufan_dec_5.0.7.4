package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
/* loaded from: classes5.dex */
public final class m extends p {
    private int aNH;
    private int[] aNI;

    public m(com.kwad.sdk.pngencrypt.k kVar) {
        super("PLTE", kVar);
        this.aNH = 0;
    }

    private void dW(int i4) {
        this.aNH = i4;
        if (i4 > 0 && i4 <= 256) {
            int[] iArr = this.aNI;
            if (iArr == null || iArr.length != i4) {
                this.aNI = new int[i4];
                return;
            }
            return;
        }
        throw new PngjException("invalid pallette - nentries=" + this.aNH);
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        dW(dVar.len / 3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.aNH) {
            byte[] bArr = dVar.data;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            a(i4, bArr[i5] & 255, bArr[i6] & 255, bArr[i7] & 255);
            i4++;
            i5 = i7 + 1;
        }
    }

    private void a(int i4, int i5, int i6, int i7) {
        this.aNI[i4] = (i5 << 16) | (i6 << 8) | i7;
    }
}
