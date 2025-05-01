package r2;
/* compiled from: ByteUtility.java */
/* loaded from: classes5.dex */
public class a {
    public static String a(byte[] bArr) {
        return b(bArr, false);
    }

    public static String b(byte[] bArr, boolean z4) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        for (byte b5 : bArr) {
            String hexString = Integer.toHexString(b5 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
            if (z4) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
