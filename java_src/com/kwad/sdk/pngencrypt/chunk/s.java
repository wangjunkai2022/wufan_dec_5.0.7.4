package com.kwad.sdk.pngencrypt.chunk;
/* loaded from: classes5.dex */
public final class s extends p {
    private int aNQ;
    private int aNR;
    private int aNS;
    private int aNT;
    private int[] aNU;

    public s(com.kwad.sdk.pngencrypt.k kVar) {
        super("tRNS", kVar);
        this.aNU = new int[0];
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        com.kwad.sdk.pngencrypt.k kVar = this.aMq;
        if (kVar.aMx) {
            this.aNQ = com.kwad.sdk.pngencrypt.n.f(dVar.data, 0);
        } else if (kVar.aMy) {
            int length = dVar.data.length;
            this.aNU = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                this.aNU[i4] = dVar.data[i4] & 255;
            }
        } else {
            this.aNR = com.kwad.sdk.pngencrypt.n.f(dVar.data, 0);
            this.aNS = com.kwad.sdk.pngencrypt.n.f(dVar.data, 2);
            this.aNT = com.kwad.sdk.pngencrypt.n.f(dVar.data, 4);
        }
    }
}
