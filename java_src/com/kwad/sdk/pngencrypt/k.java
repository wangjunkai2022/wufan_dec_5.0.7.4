package com.kwad.sdk.pngencrypt;
/* loaded from: classes5.dex */
public final class k {
    public final int aMA;
    public final int aMB;
    public final int aMC;
    public final int aMD;
    public final int aME;
    private long aMF = -1;
    private long aMG = -1;
    public final int aMb;
    public final int aMc;
    public final int aMu;
    public final int aMv;
    public final boolean aMw;
    public final boolean aMx;
    public final boolean aMy;
    public final boolean aMz;

    public k(int i4, int i5, int i6, boolean z4, boolean z5, boolean z6) {
        this.aMc = i4;
        this.aMb = i5;
        this.aMw = z4;
        this.aMy = z6;
        this.aMx = z5;
        if (z5 && z6) {
            throw new PngjException("palette and greyscale are mutually exclusive");
        }
        int i7 = (z5 || z6) ? z4 ? 2 : 1 : z4 ? 4 : 3;
        this.aMv = i7;
        this.aMu = i6;
        boolean z7 = i6 < 8;
        this.aMz = z7;
        int i8 = i7 * i6;
        this.aMA = i8;
        this.aMB = (i8 + 7) / 8;
        int i9 = ((i8 * i4) + 7) / 8;
        this.aMC = i9;
        int i10 = i7 * i4;
        this.aMD = i10;
        this.aME = z7 ? i9 : i10;
        if (i6 == 1 || i6 == 2 || i6 == 4) {
            if (!z6 && !z5) {
                throw new PngjException("only indexed or grayscale can have bitdepth=" + i6);
            }
        } else if (i6 != 8) {
            if (i6 != 16) {
                throw new PngjException("invalid bitdepth=" + i6);
            } else if (z6) {
                throw new PngjException("indexed can't have bitdepth=" + i6);
            }
        }
        if (i4 <= 0 || i4 > 16777216) {
            throw new PngjException("invalid cols=" + i4 + " ???");
        } else if (i5 > 0 && i5 <= 16777216) {
            if (i10 <= 0) {
                throw new PngjException("invalid image parameters (overflow?)");
            }
        } else {
            throw new PngjException("invalid rows=" + i5 + " ???");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            return this.aMw == kVar.aMw && this.aMu == kVar.aMu && this.aMc == kVar.aMc && this.aMx == kVar.aMx && this.aMy == kVar.aMy && this.aMb == kVar.aMb;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.aMw ? 1231 : 1237) + 31) * 31) + this.aMu) * 31) + this.aMc) * 31) + (this.aMx ? 1231 : 1237)) * 31) + (this.aMy ? 1231 : 1237)) * 31) + this.aMb;
    }

    public final String toString() {
        return "ImageInfo [cols=" + this.aMc + ", rows=" + this.aMb + ", bitDepth=" + this.aMu + ", channels=" + this.aMv + ", alpha=" + this.aMw + ", greyscale=" + this.aMx + ", indexed=" + this.aMy + "]";
    }
}
