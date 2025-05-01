package com.umeng.analytics.pro;

import java.util.BitSet;
/* compiled from: TTupleProtocol.java */
/* loaded from: classes6.dex */
public final class da extends co {

    /* compiled from: TTupleProtocol.java */
    /* loaded from: classes6.dex */
    public static class a implements cw {
        @Override // com.umeng.analytics.pro.cw
        public cu a(di diVar) {
            return new da(diVar);
        }
    }

    public da(di diVar) {
        super(diVar);
    }

    @Override // com.umeng.analytics.pro.cu
    public Class<? extends dc> D() {
        return df.class;
    }

    public void a(BitSet bitSet, int i4) throws cb {
        for (byte b5 : b(bitSet, i4)) {
            a(b5);
        }
    }

    public BitSet b(int i4) throws cb {
        double d5 = i4;
        Double.isNaN(d5);
        int ceil = (int) Math.ceil(d5 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i5 = 0; i5 < ceil; i5++) {
            bArr[i5] = u();
        }
        return a(bArr);
    }

    public static BitSet a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < bArr.length * 8; i4++) {
            if ((bArr[(bArr.length - (i4 / 8)) - 1] & (1 << (i4 % 8))) > 0) {
                bitSet.set(i4);
            }
        }
        return bitSet;
    }

    public static byte[] b(BitSet bitSet, int i4) {
        double d5 = i4;
        Double.isNaN(d5);
        int ceil = (int) Math.ceil(d5 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i5 = 0; i5 < bitSet.length(); i5++) {
            if (bitSet.get(i5)) {
                int i6 = (ceil - (i5 / 8)) - 1;
                bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
            }
        }
        return bArr;
    }
}
