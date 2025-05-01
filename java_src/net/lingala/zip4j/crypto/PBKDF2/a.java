package net.lingala.zip4j.crypto.PBKDF2;
/* compiled from: BinTools.java */
/* loaded from: classes7.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f71726a = "0123456789ABCDEF";

    a() {
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b5 : bArr) {
            int i4 = (b5 + 256) % 256;
            stringBuffer.append(f71726a.charAt((i4 / 16) & 15));
            stringBuffer.append(f71726a.charAt((i4 % 16) & 15));
        }
        return stringBuffer.toString();
    }

    public static int b(char c5) {
        if (c5 < '0' || c5 > '9') {
            char c6 = 'A';
            if (c5 < 'A' || c5 > 'F') {
                c6 = 'a';
                if (c5 < 'a' || c5 > 'f') {
                    StringBuffer stringBuffer = new StringBuffer("Input string may only contain hex digits, but found '");
                    stringBuffer.append(c5);
                    stringBuffer.append("'");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
            return (c5 - c6) + 10;
        }
        return c5 - '0';
    }

    public static byte[] c(String str) {
        if (str == null) {
            str = "";
        } else if (str.length() % 2 != 0) {
            StringBuffer stringBuffer = new StringBuffer("0");
            stringBuffer.append(str);
            str = stringBuffer.toString();
        }
        byte[] bArr = new byte[str.length() / 2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            int i6 = i4 + 1;
            int i7 = i6 + 1;
            bArr[i5] = (byte) ((b(str.charAt(i4)) * 16) + b(str.charAt(i6)));
            i5++;
            i4 = i7;
        }
        return bArr;
    }
}
