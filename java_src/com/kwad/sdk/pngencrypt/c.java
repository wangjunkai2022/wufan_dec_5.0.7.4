package com.kwad.sdk.pngencrypt;

import com.kwad.sdk.pngencrypt.ChunkReader;
import com.kwad.sdk.pngencrypt.chunk.ChunkLoadBehaviour;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes5.dex */
public final class c extends b {
    protected k aLs;
    protected k aLt;
    protected e aLu;
    protected int aLv = -1;
    protected com.kwad.sdk.pngencrypt.chunk.e aLw = null;
    private long aLy = 0;
    private boolean aLz = true;
    private boolean aLA = false;
    private Set<String> aLB = new HashSet();
    private long aLC = 0;
    private long aLD = 0;
    private long aLE = 0;
    private ChunkLoadBehaviour aLG = ChunkLoadBehaviour.LOAD_CHUNK_ALWAYS;
    protected final boolean aLx = false;
    private g aLF = new com.kwad.sdk.pngencrypt.chunk.a();

    /* renamed from: com.kwad.sdk.pngencrypt.c$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] aLH;

        static {
            int[] iArr = new int[ChunkLoadBehaviour.values().length];
            aLH = iArr;
            try {
                iArr[ChunkLoadBehaviour.LOAD_CHUNK_IF_SAFE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aLH[ChunkLoadBehaviour.LOAD_CHUNK_NEVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(boolean z4) {
    }

    private int Ko() {
        return this.aLv;
    }

    private k Kt() {
        return this.aLt;
    }

    private void go(String str) {
        if (str.equals("IHDR")) {
            if (this.aLv < 0) {
                this.aLv = 0;
                return;
            }
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk " + str));
        } else if (str.equals("PLTE")) {
            int i4 = this.aLv;
            if (i4 != 0 && i4 != 1) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk here " + str));
                return;
            }
            this.aLv = 2;
        } else if (str.equals("IDAT")) {
            int i5 = this.aLv;
            if (i5 >= 0 && i5 <= 4) {
                this.aLv = 4;
                return;
            }
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk " + str));
        } else if (str.equals("IEND")) {
            if (this.aLv >= 4) {
                this.aLv = 6;
                return;
            }
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("unexpected chunk " + str));
        } else {
            int i6 = this.aLv;
            if (i6 <= 1) {
                this.aLv = 1;
            } else if (i6 <= 3) {
                this.aLv = 3;
            } else {
                this.aLv = 5;
            }
        }
    }

    private static boolean gp(String str) {
        return !com.kwad.sdk.pngencrypt.chunk.b.gs(str);
    }

    @Override // com.kwad.sdk.pngencrypt.b
    protected final boolean Kj() {
        return this.aLz;
    }

    public final boolean Kp() {
        return Ko() < 4;
    }

    public final j Kq() {
        DeflatedChunksSet Kl = Kl();
        if (Kl instanceof j) {
            return (j) Kl;
        }
        return null;
    }

    public final k Kr() {
        return this.aLs;
    }

    public final e Ks() {
        return this.aLu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.b
    public final void a(ChunkReader chunkReader) {
        super.a(chunkReader);
        if (chunkReader.Kh().ahY.equals("IHDR")) {
            com.kwad.sdk.pngencrypt.chunk.i iVar = new com.kwad.sdk.pngencrypt.chunk.i(null);
            iVar.a(chunkReader.Kh());
            k Lc = iVar.Lc();
            this.aLs = Lc;
            this.aLt = Lc;
            if (iVar.La()) {
                this.aLu = new e(this.aLt);
            }
            this.aLw = new com.kwad.sdk.pngencrypt.chunk.e(this.aLs);
        }
        ChunkReader.ChunkReaderMode chunkReaderMode = chunkReader.aKZ;
        ChunkReader.ChunkReaderMode chunkReaderMode2 = ChunkReader.ChunkReaderMode.BUFFER;
        if (chunkReaderMode == chunkReaderMode2 && gp(chunkReader.Kh().ahY)) {
            this.aLy += chunkReader.Kh().len;
        }
        if (chunkReader.aKZ == chunkReaderMode2 || this.aLA) {
            try {
                this.aLw.a(this.aLF.a(chunkReader.Kh(), Kr()), this.aLv);
            } catch (PngjException e5) {
                throw e5;
            }
        }
    }

    public final void aH(long j4) {
        this.aLC = j4;
    }

    public final void aI(long j4) {
        this.aLD = j4;
    }

    public final void aJ(long j4) {
        this.aLE = j4;
    }

    @Override // com.kwad.sdk.pngencrypt.b, com.kwad.sdk.pngencrypt.f
    public final int b(byte[] bArr, int i4, int i5) {
        return super.b(bArr, i4, i5);
    }

    public final void bH(boolean z4) {
        this.aLz = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.b
    public final void c(int i4, String str, long j4) {
        go(str);
        super.c(i4, str, j4);
    }

    @Override // com.kwad.sdk.pngencrypt.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.aLv != 6) {
            this.aLv = 6;
        }
        super.close();
    }

    @Override // com.kwad.sdk.pngencrypt.b
    protected final DeflatedChunksSet gm(String str) {
        return new j(str, this.aLx, Kt(), this.aLu);
    }

    @Override // com.kwad.sdk.pngencrypt.b
    protected final boolean gn(String str) {
        return str.equals("IDAT");
    }

    @Override // com.kwad.sdk.pngencrypt.b
    public final boolean v(int i4, String str) {
        if (super.v(i4, str)) {
            return true;
        }
        if (this.aLC > 0 && i4 + Kk() > this.aLC) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Maximum total bytes to read exceeeded: " + this.aLC + " offset:" + Kk() + " len=" + i4));
        }
        if (this.aLB.contains(str)) {
            return true;
        }
        if (com.kwad.sdk.pngencrypt.chunk.b.gs(str)) {
            return false;
        }
        long j4 = this.aLD;
        if (j4 <= 0 || i4 <= j4) {
            long j5 = this.aLE;
            if (j5 <= 0 || i4 <= j5 - this.aLy) {
                int i5 = AnonymousClass1.aLH[this.aLG.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        return true;
                    }
                } else if (!com.kwad.sdk.pngencrypt.chunk.b.gu(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
