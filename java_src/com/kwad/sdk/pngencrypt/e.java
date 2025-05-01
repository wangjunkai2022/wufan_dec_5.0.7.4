package com.kwad.sdk.pngencrypt;
/* loaded from: classes5.dex */
public final class e {
    final k aLZ;
    private int aMb;
    private int aMc;
    int aMd;
    int aMe;
    int aMf;
    int aMg;
    int aMh;
    int aMi;
    private boolean aMn;
    private int aMa = 0;
    private int aMj = -1;
    private int aMk = -1;
    private int aMl = 0;
    int aMm = 0;

    public e(k kVar) {
        this.aMn = false;
        this.aLZ = kVar;
        this.aMn = false;
        dG(1);
        dF(0);
    }

    private int KF() {
        return KE();
    }

    private void dF(int i4) {
        this.aMj = i4;
        int i5 = (i4 * this.aMd) + this.aMf;
        this.aMk = i5;
        if (i5 < 0 || i5 >= this.aLZ.aMb) {
            throw new PngjException("bad row - this should not happen");
        }
    }

    private void dG(int i4) {
        if (this.aMa == i4) {
            return;
        }
        this.aMa = i4;
        byte[] dH = dH(i4);
        byte b5 = dH[0];
        this.aMe = b5;
        byte b6 = dH[1];
        this.aMd = b6;
        byte b7 = dH[2];
        this.aMg = b7;
        byte b8 = dH[3];
        this.aMf = b8;
        k kVar = this.aLZ;
        int i5 = kVar.aMb;
        this.aMb = i5 > b8 ? (((i5 + b6) - 1) - b8) / b6 : 0;
        int i6 = kVar.aMc;
        int i7 = i6 > b7 ? (((i6 + b5) - 1) - b7) / b5 : 0;
        this.aMc = i7;
        if (i7 == 0) {
            this.aMb = 0;
        }
        int i8 = kVar.aMv;
        this.aMi = b5 * i8;
        this.aMh = b7 * i8;
    }

    private static byte[] dH(int i4) {
        switch (i4) {
            case 1:
                return new byte[]{8, 8, 0, 0};
            case 2:
                return new byte[]{8, 8, 4, 0};
            case 3:
                return new byte[]{4, 8, 0, 4};
            case 4:
                return new byte[]{4, 4, 2, 0};
            case 5:
                return new byte[]{2, 4, 0, 2};
            case 6:
                return new byte[]{2, 2, 1, 0};
            case 7:
                return new byte[]{1, 2, 0, 1};
            default:
                throw new PngjException("bad interlace pass" + i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int KA() {
        return this.aMj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int KB() {
        return this.aMk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int KC() {
        return this.aMa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int KD() {
        return this.aMb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int KE() {
        return this.aMc;
    }

    public final int KG() {
        return ((this.aLZ.aMA * KF()) + 7) / 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Kz() {
        int i4;
        while (true) {
            this.aMl++;
            int i5 = this.aMb;
            if (i5 != 0 && (i4 = this.aMj) < i5 - 1) {
                dF(i4 + 1);
                break;
            }
            int i6 = this.aMa;
            if (i6 == 7) {
                this.aMn = true;
                return false;
            }
            dG(i6 + 1);
            if (this.aMb == 0) {
                this.aMl--;
            } else {
                dF(0);
                break;
            }
        }
        return true;
    }
}
