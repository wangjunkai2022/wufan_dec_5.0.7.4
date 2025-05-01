package com.kwad.sdk.pngencrypt.chunk;
/* loaded from: classes5.dex */
public abstract class PngChunk {
    protected final com.kwad.sdk.pngencrypt.k aMq;
    public final boolean aNq;
    public final boolean aNr;
    public final boolean aNs;
    protected d aNt;
    private boolean aNu = false;
    protected int aNv = -1;
    public final String ahY;

    /* loaded from: classes5.dex */
    public enum ChunkOrderingConstraint {
        NONE,
        BEFORE_PLTE_AND_IDAT,
        AFTER_PLTE_BEFORE_IDAT,
        AFTER_PLTE_BEFORE_IDAT_PLTE_REQUIRED,
        BEFORE_IDAT,
        AFTER_IDAT,
        NA;

        public final boolean isOk(int i4, boolean z4) {
            if (this == NONE) {
                return true;
            }
            return this == BEFORE_IDAT ? i4 < 4 : this == BEFORE_PLTE_AND_IDAT ? i4 < 2 : this == AFTER_PLTE_BEFORE_IDAT ? z4 ? i4 < 4 : i4 < 4 && i4 > 2 : this == AFTER_IDAT && i4 > 4;
        }

        public final boolean mustGoAfterIDAT() {
            return this == AFTER_IDAT;
        }

        public final boolean mustGoAfterPLTE() {
            return this == AFTER_PLTE_BEFORE_IDAT || this == AFTER_PLTE_BEFORE_IDAT_PLTE_REQUIRED;
        }

        public final boolean mustGoBeforeIDAT() {
            return this == BEFORE_IDAT || this == BEFORE_PLTE_AND_IDAT || this == AFTER_PLTE_BEFORE_IDAT;
        }

        public final boolean mustGoBeforePLTE() {
            return this == BEFORE_PLTE_AND_IDAT;
        }
    }

    public PngChunk(String str, com.kwad.sdk.pngencrypt.k kVar) {
        this.ahY = str;
        this.aMq = kVar;
        this.aNq = b.gs(str);
        this.aNr = b.gt(str);
        this.aNs = b.gu(str);
    }

    private long KU() {
        d dVar = this.aNt;
        if (dVar != null) {
            return dVar.KU();
        }
        return -1L;
    }

    private int KW() {
        d dVar = this.aNt;
        if (dVar != null) {
            return dVar.len;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(d dVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(d dVar) {
        this.aNt = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void dO(int i4) {
        this.aNv = i4;
    }

    public String toString() {
        return "chunk id= " + this.ahY + " (len=" + KW() + " offset=" + KU() + ")";
    }
}
