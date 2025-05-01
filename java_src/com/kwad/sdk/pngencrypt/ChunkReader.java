package com.kwad.sdk.pngencrypt;
/* loaded from: classes5.dex */
public abstract class ChunkReader implements f {
    public final ChunkReaderMode aKZ;
    private final com.kwad.sdk.pngencrypt.chunk.d aLa;
    private boolean aLd;
    protected int aLb = 0;
    private int aLc = 0;
    protected ErrorBehaviour aLe = ErrorBehaviour.STRICT;

    /* loaded from: classes5.dex */
    public enum ChunkReaderMode {
        BUFFER,
        PROCESS,
        SKIP
    }

    public ChunkReader(int i4, String str, long j4, ChunkReaderMode chunkReaderMode) {
        if (chunkReaderMode == null || str.length() != 4 || i4 < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk paramenters: " + chunkReaderMode));
        }
        this.aKZ = chunkReaderMode;
        com.kwad.sdk.pngencrypt.chunk.d dVar = new com.kwad.sdk.pngencrypt.chunk.d(i4, str, chunkReaderMode == ChunkReaderMode.BUFFER);
        this.aLa = dVar;
        dVar.aK(j4);
        this.aLd = chunkReaderMode != ChunkReaderMode.SKIP;
    }

    public final com.kwad.sdk.pngencrypt.chunk.d Kh() {
        return this.aLa;
    }

    protected abstract void Ki();

    protected abstract void a(int i4, byte[] bArr, int i5, int i6);

    @Override // com.kwad.sdk.pngencrypt.f
    public final int b(byte[] bArr, int i4, int i5) {
        int i6 = 0;
        if (i5 == 0) {
            return 0;
        }
        if (i5 < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("negative length??"));
        }
        if (this.aLb == 0 && this.aLc == 0 && this.aLd) {
            com.kwad.sdk.pngencrypt.chunk.d dVar = this.aLa;
            dVar.f(dVar.aNh, 0, 4);
        }
        com.kwad.sdk.pngencrypt.chunk.d dVar2 = this.aLa;
        int i7 = dVar2.len - this.aLb;
        if (i7 > i5) {
            i7 = i5;
        }
        if (i7 > 0 || this.aLc == 0) {
            if (this.aLd && this.aKZ != ChunkReaderMode.BUFFER && i7 > 0) {
                dVar2.f(bArr, i4, i7);
            }
            ChunkReaderMode chunkReaderMode = this.aKZ;
            if (chunkReaderMode == ChunkReaderMode.BUFFER) {
                byte[] bArr2 = this.aLa.data;
                if (bArr2 != bArr && i7 > 0) {
                    System.arraycopy(bArr, i4, bArr2, this.aLb, i7);
                }
            } else if (chunkReaderMode == ChunkReaderMode.PROCESS) {
                a(this.aLb, bArr, i4, i7);
            }
            this.aLb += i7;
            i4 += i7;
            i5 -= i7;
        }
        int i8 = this.aLb;
        com.kwad.sdk.pngencrypt.chunk.d dVar3 = this.aLa;
        if (i8 == dVar3.len) {
            int i9 = this.aLc;
            int i10 = 4 - i9;
            if (i10 <= i5) {
                i5 = i10;
            }
            if (i5 > 0) {
                byte[] bArr3 = dVar3.aNj;
                if (bArr != bArr3) {
                    System.arraycopy(bArr, i4, bArr3, i9, i5);
                }
                int i11 = this.aLc + i5;
                this.aLc = i11;
                if (i11 == 4) {
                    if (this.aLd) {
                        if (this.aKZ == ChunkReaderMode.BUFFER) {
                            com.kwad.sdk.pngencrypt.chunk.d dVar4 = this.aLa;
                            dVar4.f(dVar4.data, 0, dVar4.len);
                        }
                        this.aLa.bI(this.aLe == ErrorBehaviour.STRICT);
                    }
                    Ki();
                }
            }
            i6 = i5;
        }
        if (i7 > 0 || i6 > 0) {
            return i7 + i6;
        }
        return -1;
    }

    public final void bG(boolean z4) {
        this.aLd = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChunkReader chunkReader = (ChunkReader) obj;
            com.kwad.sdk.pngencrypt.chunk.d dVar = this.aLa;
            if (dVar == null) {
                if (chunkReader.aLa != null) {
                    return false;
                }
            } else if (!dVar.equals(chunkReader.aLa)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        com.kwad.sdk.pngencrypt.chunk.d dVar = this.aLa;
        return (dVar == null ? 0 : dVar.hashCode()) + 31;
    }

    @Override // com.kwad.sdk.pngencrypt.f
    public final boolean isDone() {
        return this.aLc == 4;
    }

    public String toString() {
        return this.aLa.toString();
    }
}
