package com.kwad.sdk.pngencrypt;

import java.util.Arrays;
import java.util.zip.Inflater;
/* loaded from: classes5.dex */
public final class j extends DeflatedChunksSet {
    protected final e aLu;
    protected byte[] aMo;
    protected byte[] aMp;
    protected final k aMq;
    final p aMr;
    protected int[] aMs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.pngencrypt.j$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] aMt;

        static {
            int[] iArr = new int[FilterType.values().length];
            aMt = iArr;
            try {
                iArr[FilterType.FILTER_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aMt[FilterType.FILTER_SUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                aMt[FilterType.FILTER_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                aMt[FilterType.FILTER_AVERAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                aMt[FilterType.FILTER_PAETH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public j(String str, boolean z4, k kVar, e eVar) {
        this(str, z4, kVar, eVar, null, null);
    }

    private void KH() {
        dI(this.aMr.aMY);
    }

    private int KI() {
        int KG;
        e eVar = this.aLu;
        int i4 = 0;
        if (eVar == null) {
            int Ky = Ky();
            k kVar = this.aMq;
            if (Ky < kVar.aMb - 1) {
                KG = kVar.aMC;
                i4 = KG + 1;
            }
        } else if (eVar.Kz()) {
            KG = this.aLu.KG();
            i4 = KG + 1;
        }
        if (!this.aLx) {
            dE(i4);
        }
        return i4;
    }

    private void dI(int i4) {
        byte[] bArr = this.aMo;
        if (bArr == null || bArr.length < this.aLN.length) {
            byte[] bArr2 = this.aLN;
            this.aMo = new byte[bArr2.length];
            this.aMp = new byte[bArr2.length];
        }
        if (this.aMr.aMV == 0) {
            Arrays.fill(this.aMo, (byte) 0);
        }
        byte[] bArr3 = this.aMo;
        this.aMo = this.aMp;
        this.aMp = bArr3;
        byte b5 = this.aLN[0];
        if (FilterType.isValidStandard(b5)) {
            FilterType byVal = FilterType.getByVal(b5);
            int[] iArr = this.aMs;
            iArr[b5] = iArr[b5] + 1;
            this.aMo[0] = this.aLN[0];
            int i5 = AnonymousClass1.aMt[byVal.ordinal()];
            if (i5 == 1) {
                dK(i4);
                return;
            } else if (i5 == 2) {
                dM(i4);
                return;
            } else if (i5 == 3) {
                dN(i4);
                return;
            } else if (i5 == 4) {
                dJ(i4);
                return;
            } else if (i5 == 5) {
                dL(i4);
                return;
            } else {
                throw new PngjException("Filter type " + ((int) b5) + " not implemented");
            }
        }
        throw new PngjException("Filter type " + ((int) b5) + " invalid");
    }

    private void dJ(int i4) {
        int i5 = 1;
        int i6 = 1 - this.aMq.aMB;
        while (i5 <= i4) {
            this.aMo[i5] = (byte) (this.aLN[i5] + (((i6 > 0 ? this.aMo[i6] & 255 : 0) + (this.aMp[i5] & 255)) / 2));
            i5++;
            i6++;
        }
    }

    private void dK(int i4) {
        for (int i5 = 1; i5 <= i4; i5++) {
            this.aMo[i5] = this.aLN[i5];
        }
    }

    private void dL(int i4) {
        int i5 = 1;
        int i6 = 1 - this.aMq.aMB;
        while (i5 <= i4) {
            int i7 = 0;
            int i8 = i6 > 0 ? this.aMo[i6] & 255 : 0;
            if (i6 > 0) {
                i7 = this.aMp[i6] & 255;
            }
            this.aMo[i5] = (byte) (this.aLN[i5] + n.b(i8, this.aMp[i5] & 255, i7));
            i5++;
            i6++;
        }
    }

    private void dM(int i4) {
        int i5;
        int i6 = 1;
        while (true) {
            i5 = this.aMq.aMB;
            if (i6 > i5) {
                break;
            }
            this.aMo[i6] = this.aLN[i6];
            i6++;
        }
        int i7 = i5 + 1;
        int i8 = 1;
        while (i7 <= i4) {
            byte[] bArr = this.aMo;
            bArr[i7] = (byte) (this.aLN[i7] + bArr[i8]);
            i7++;
            i8++;
        }
    }

    private void dN(int i4) {
        for (int i5 = 1; i5 <= i4; i5++) {
            this.aMo[i5] = (byte) (this.aLN[i5] + this.aMp[i5]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.pngencrypt.DeflatedChunksSet
    public final void Kv() {
        super.Kv();
        this.aMr.update(Ky());
        KH();
        p pVar = this.aMr;
        pVar.h(this.aMo, pVar.aMY + 1);
    }

    @Override // com.kwad.sdk.pngencrypt.DeflatedChunksSet
    protected final int Kw() {
        return KI();
    }

    @Override // com.kwad.sdk.pngencrypt.DeflatedChunksSet
    public final void close() {
        super.close();
        this.aMo = null;
        this.aMp = null;
    }

    private j(String str, boolean z4, k kVar, e eVar, Inflater inflater, byte[] bArr) {
        super(str, z4, (eVar != null ? eVar.KG() : kVar.aMC) + 1, kVar.aMC + 1, null, null);
        this.aMs = new int[5];
        this.aMq = kVar;
        this.aLu = eVar;
        this.aMr = new p(kVar, eVar);
        com.kwad.sdk.core.e.c.d("PNG_ENCRYPT", "Creating IDAT set ");
    }
}
