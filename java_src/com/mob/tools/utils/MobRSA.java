package com.mob.tools.utils;

import com.mob.commons.v;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;
/* loaded from: classes5.dex */
public class MobRSA implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private int f56984a;

    public MobRSA(int i4) {
        this.f56984a = i4;
    }

    private byte[] a(byte[] bArr, int i4, int i5, BigInteger bigInteger, BigInteger bigInteger2, int i6) throws Throwable {
        if (bArr.length != i5 || i4 != 0) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            bArr = bArr2;
        }
        BigInteger bigInteger3 = new BigInteger(a(bArr, i6));
        if (bigInteger3.compareTo(bigInteger2) <= 0) {
            return bigInteger3.modPow(bigInteger, bigInteger2).toByteArray();
        }
        throw new Throwable("the message must be smaller than the modulue");
    }

    public byte[] encode(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        int i4 = this.f56984a / 8;
        int i5 = i4 - 11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            int i6 = 0;
            while (bArr.length > i6) {
                try {
                    int min = Math.min(bArr.length - i6, i5);
                    byte[] a5 = a(bArr, i6, min, bigInteger, bigInteger2, i4);
                    dataOutputStream2.writeInt(a5.length);
                    dataOutputStream2.write(a5);
                    i6 += min;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    v.a(dataOutputStream, byteArrayOutputStream);
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            v.a(dataOutputStream2, byteArrayOutputStream);
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private byte[] a(byte[] bArr, int i4) throws Throwable {
        if (bArr.length <= i4 - 1) {
            byte[] bArr2 = new byte[i4];
            bArr2[0] = 1;
            int length = bArr.length;
            bArr2[1] = (byte) (length >> 24);
            bArr2[2] = (byte) (length >> 16);
            bArr2[3] = (byte) (length >> 8);
            bArr2[4] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, i4 - length, length);
            return bArr2;
        }
        throw new Throwable("Message too large");
    }
}
