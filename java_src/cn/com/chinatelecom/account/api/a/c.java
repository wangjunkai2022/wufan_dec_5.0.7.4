package cn.com.chinatelecom.account.api.a;

import androidx.core.view.InputDeviceCompat;
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f539a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < bArr.length; i4++) {
            char[] cArr = f539a;
            sb.append(cArr[(bArr[i4] >> 4) & 15]);
            sb.append(cArr[bArr[i4] & 15]);
        }
        return sb.toString();
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            int digit = Character.digit(charArray[i5 + 1], 16) | (Character.digit(charArray[i5], 16) << 4);
            if (digit > 127) {
                digit += InputDeviceCompat.SOURCE_ANY;
            }
            bArr[i4] = (byte) digit;
        }
        return bArr;
    }
}
