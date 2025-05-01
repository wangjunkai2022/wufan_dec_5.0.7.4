package com.kwad.sdk.pngencrypt;

import com.kwad.sdk.pngencrypt.ChunkReader;
import java.io.Closeable;
import java.util.Arrays;
/* loaded from: classes5.dex */
public abstract class b implements f, Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final byte[] aLf;
    private final int aLg;
    private byte[] aLh;
    private int aLi;
    protected boolean aLj;
    protected boolean aLk;
    private int aLl;
    private long aLm;
    private DeflatedChunksSet aLn;
    private ChunkReader aLo;
    private long aLp;
    private ErrorBehaviour aLq;
    protected boolean closed;

    public b() {
        this(n.KL());
    }

    private static String Km() {
        return "IHDR";
    }

    private static String Kn() {
        return "IEND";
    }

    private ChunkReader a(String str, int i4, long j4, boolean z4) {
        return new ChunkReader(i4, str, j4, z4 ? ChunkReader.ChunkReaderMode.SKIP : ChunkReader.ChunkReaderMode.BUFFER) { // from class: com.kwad.sdk.pngencrypt.b.2
            @Override // com.kwad.sdk.pngencrypt.ChunkReader
            protected final void Ki() {
                b.this.a(this);
            }

            @Override // com.kwad.sdk.pngencrypt.ChunkReader
            protected final void a(int i5, byte[] bArr, int i6, int i7) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("should never happen"));
            }
        };
    }

    private static void h(byte[] bArr) {
        if (Arrays.equals(bArr, n.KL())) {
            return;
        }
        com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad signature:" + Arrays.toString(bArr)));
    }

    protected boolean Kj() {
        return true;
    }

    public final long Kk() {
        return this.aLm;
    }

    public final DeflatedChunksSet Kl() {
        return this.aLn;
    }

    @Override // com.kwad.sdk.pngencrypt.f
    public int b(byte[] bArr, int i4, int i5) {
        if (this.closed) {
            return -1;
        }
        if (i5 == 0) {
            return 0;
        }
        if (i5 < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen. Bad length: " + i5));
        }
        if (this.aLj) {
            ChunkReader chunkReader = this.aLo;
            if (chunkReader != null && !chunkReader.isDone()) {
                int b5 = this.aLo.b(bArr, i4, i5);
                if (b5 < 0) {
                    return -1;
                }
                int i6 = b5 + 0;
                this.aLm += b5;
                return i6;
            }
            int i7 = this.aLi;
            int i8 = 8 - i7;
            if (i8 <= i5) {
                i5 = i8;
            }
            System.arraycopy(bArr, i4, this.aLh, i7, i5);
            int i9 = this.aLi + i5;
            this.aLi = i9;
            int i10 = i5 + 0;
            this.aLm += i5;
            if (i9 == 8) {
                this.aLl++;
                c(n.g(this.aLh, 0), com.kwad.sdk.pngencrypt.chunk.b.i(this.aLh, 4), this.aLm - 8);
                this.aLi = 0;
                return i10;
            }
            return i10;
        }
        int i11 = this.aLg;
        int i12 = this.aLi;
        int i13 = i11 - i12;
        if (i13 <= i5) {
            i5 = i13;
        }
        System.arraycopy(bArr, i4, this.aLh, i12, i5);
        int i14 = this.aLi + i5;
        this.aLi = i14;
        if (i14 == this.aLg) {
            h(this.aLh);
            this.aLi = 0;
            this.aLj = true;
        }
        int i15 = i5 + 0;
        this.aLm += i5;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i4, String str, long j4) {
        if (str.length() != 4 || !com.kwad.sdk.pngencrypt.chunk.b.aNg.matcher(str).matches()) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk id: " + str));
        }
        if (i4 < 0) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk len: " + i4));
        }
        if (str.equals("IDAT")) {
            this.aLp += i4;
        }
        boolean Kj = Kj();
        boolean v2 = v(i4, str);
        boolean gn = gn(str);
        DeflatedChunksSet deflatedChunksSet = this.aLn;
        boolean gq = (deflatedChunksSet == null || deflatedChunksSet.isClosed()) ? false : this.aLn.gq(str);
        if (gn && !v2) {
            if (!gq) {
                DeflatedChunksSet deflatedChunksSet2 = this.aLn;
                if (deflatedChunksSet2 != null && !deflatedChunksSet2.isDone()) {
                    com.kwad.sdk.core.e.c.printStackTrace(new PngjException("new IDAT-like chunk when previous was not done"));
                }
                this.aLn = gm(str);
            }
            this.aLo = new d(i4, str, Kj, j4, this.aLn) { // from class: com.kwad.sdk.pngencrypt.b.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.kwad.sdk.pngencrypt.d, com.kwad.sdk.pngencrypt.ChunkReader
                public final void Ki() {
                    super.Ki();
                    b.this.a(this);
                }
            };
        } else {
            this.aLo = a(str, i4, j4, v2);
        }
        ChunkReader chunkReader = this.aLo;
        if (chunkReader == null || Kj) {
            return;
        }
        chunkReader.bG(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DeflatedChunksSet deflatedChunksSet = this.aLn;
        if (deflatedChunksSet != null) {
            deflatedChunksSet.close();
        }
        this.closed = true;
    }

    protected abstract DeflatedChunksSet gm(String str);

    protected boolean gn(String str) {
        return false;
    }

    @Override // com.kwad.sdk.pngencrypt.f
    public final boolean isDone() {
        return this.aLk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean v(int i4, String str) {
        return false;
    }

    private b(byte[] bArr) {
        this.aLh = new byte[8];
        this.aLi = 0;
        this.aLj = false;
        this.aLk = false;
        this.closed = false;
        this.aLl = 0;
        this.aLm = 0L;
        this.aLq = ErrorBehaviour.STRICT;
        this.aLf = bArr;
        int length = bArr == null ? 0 : bArr.length;
        this.aLg = length;
        this.aLj = length <= 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ChunkReader chunkReader) {
        if (this.aLl == 1 && !Km().equals(chunkReader.Kh().ahY)) {
            String str = "Bad first chunk: " + chunkReader.Kh().ahY + " expected: " + Km();
            if (this.aLq.f55906c < ErrorBehaviour.SUPER_LENIENT.f55906c) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException(str));
            } else {
                com.kwad.sdk.core.e.c.d("PNG_ENCRYPT", str);
            }
        }
        Kn();
        if (chunkReader.Kh().ahY.equals(Kn())) {
            this.aLk = true;
            close();
        }
    }
}
