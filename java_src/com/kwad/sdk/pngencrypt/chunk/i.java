package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
import java.io.ByteArrayInputStream;
/* loaded from: classes5.dex */
public final class i extends p {
    private int aMb;
    private int aMc;
    private int aNA;
    private int aNw;
    private int aNx;
    private int aNy;
    private int aNz;

    public i(com.kwad.sdk.pngencrypt.k kVar) {
        super("IHDR", kVar);
        if (kVar != null) {
            Lb();
        }
    }

    private int KD() {
        return this.aMb;
    }

    private int KE() {
        return this.aMc;
    }

    private int KX() {
        return this.aNw;
    }

    private int KY() {
        return this.aNx;
    }

    private int KZ() {
        return this.aNA;
    }

    private void Lb() {
        dP(this.aMq.aMc);
        dQ(this.aMq.aMb);
        dR(this.aMq.aMu);
        com.kwad.sdk.pngencrypt.k kVar = this.aMq;
        int i4 = kVar.aMw ? 4 : 0;
        if (kVar.aMy) {
            i4++;
        }
        if (!kVar.aMx) {
            i4 += 2;
        }
        dS(i4);
        dT(0);
        dU(0);
        dV(0);
    }

    private void Ld() {
        if (this.aMc > 0 && this.aMb > 0 && this.aNy == 0 && this.aNz == 0) {
            int i4 = this.aNw;
            if (i4 != 1 && i4 != 2 && i4 != 4 && i4 != 8 && i4 != 16) {
                throw new PngjException("bad IHDR: bitdepth invalid");
            }
            int i5 = this.aNA;
            if (i5 >= 0 && i5 <= 1) {
                int i6 = this.aNx;
                if (i6 != 0) {
                    if (i6 != 6 && i6 != 2) {
                        if (i6 == 3) {
                            if (i4 == 16) {
                                throw new PngjException("bad IHDR: bitdepth invalid");
                            }
                            return;
                        } else if (i6 != 4) {
                            throw new PngjException("bad IHDR: invalid colormodel");
                        }
                    }
                    if (i4 != 8 && i4 != 16) {
                        throw new PngjException("bad IHDR: bitdepth invalid");
                    }
                    return;
                }
                return;
            }
            throw new PngjException("bad IHDR: interlace invalid");
        }
        throw new PngjException("bad IHDR: col/row/compmethod/filmethod invalid");
    }

    private void dP(int i4) {
        this.aMc = i4;
    }

    private void dQ(int i4) {
        this.aMb = i4;
    }

    private void dR(int i4) {
        this.aNw = i4;
    }

    private void dS(int i4) {
        this.aNx = i4;
    }

    private void dT(int i4) {
        this.aNy = 0;
    }

    private void dU(int i4) {
        this.aNz = 0;
    }

    private void dV(int i4) {
        this.aNA = 0;
    }

    public final boolean La() {
        return KZ() == 1;
    }

    public final com.kwad.sdk.pngencrypt.k Lc() {
        Ld();
        return new com.kwad.sdk.pngencrypt.k(KE(), KD(), KX(), (KY() & 4) != 0, KY() == 0 || KY() == 4, (KY() & 1) != 0);
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        if (dVar.len == 13) {
            ByteArrayInputStream KT = dVar.KT();
            this.aMc = com.kwad.sdk.pngencrypt.n.f(KT);
            this.aMb = com.kwad.sdk.pngencrypt.n.f(KT);
            this.aNw = com.kwad.sdk.pngencrypt.n.e(KT);
            this.aNx = com.kwad.sdk.pngencrypt.n.e(KT);
            this.aNy = com.kwad.sdk.pngencrypt.n.e(KT);
            this.aNz = com.kwad.sdk.pngencrypt.n.e(KT);
            this.aNA = com.kwad.sdk.pngencrypt.n.e(KT);
            return;
        }
        throw new PngjException("Bad IDHR len " + dVar.len);
    }
}
