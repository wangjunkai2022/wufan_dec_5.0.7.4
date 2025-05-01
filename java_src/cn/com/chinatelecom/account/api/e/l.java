package cn.com.chinatelecom.account.api.e;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f733a = "l";

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f734b = {68, 64, 94, 49, 69, BinaryMemcacheOpcodes.GATK, 50, 83};

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = bArr[i4];
                for (byte b5 : f734b) {
                    bArr2[i4] = (byte) (b5 ^ bArr2[i4]);
                }
            }
            return new String(bArr2);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
