package com.kwad.sdk.pngencrypt;

import com.kwad.sdk.pngencrypt.ChunkReader;
/* loaded from: classes5.dex */
public abstract class d extends ChunkReader {
    protected final DeflatedChunksSet aLI;
    protected boolean aLJ;
    protected boolean aLK;
    protected byte[] aLL;
    protected int aLM;

    public d(int i4, String str, long j4, DeflatedChunksSet deflatedChunksSet) {
        super(i4, str, j4, ChunkReader.ChunkReaderMode.PROCESS);
        this.aLJ = false;
        this.aLK = false;
        this.aLM = -1;
        this.aLI = deflatedChunksSet;
        deflatedChunksSet.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.ChunkReader
    public void Ki() {
        int g4;
        if (!this.aLK || this.aLM < 0 || (g4 = n.g(this.aLL, 0)) == this.aLM) {
            return;
        }
        com.kwad.sdk.core.e.c.printStackTrace(new PngjException("bad chunk sequence for fDAT chunk " + g4 + " expected " + this.aLM));
    }

    @Override // com.kwad.sdk.pngencrypt.ChunkReader
    protected final void a(int i4, byte[] bArr, int i5, int i6) {
        if (this.aLK && i4 < 4) {
            while (i4 < 4 && i6 > 0) {
                this.aLL[i4] = bArr[i5];
                i4++;
                i5++;
                i6--;
            }
        }
        if (i6 > 0) {
            this.aLI.c(bArr, i5, i6);
            if (this.aLJ) {
                System.arraycopy(bArr, i5, Kh().data, this.aLb, i6);
            }
        }
    }

    public final void dD(int i4) {
        this.aLM = i4;
    }
}
