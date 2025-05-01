package cn.com.chinatelecom.account.api.a;

import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f540a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f541b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    private static byte[] f542c = {68, 64, 94, 49, 50, 83};

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = bArr[i4];
                for (byte b5 : f542c) {
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
