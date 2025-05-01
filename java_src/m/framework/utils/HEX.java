package m.framework.utils;
/* loaded from: classes7.dex */
public class HEX {
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decodeHex(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) == 0) {
            byte[] bArr = new byte[length >> 1];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i4 + 1;
                i4 = i6 + 1;
                bArr[i5] = (byte) (((toDigit(cArr[i4], i4) << 4) | toDigit(cArr[i6], i6)) & 255);
                i5++;
            }
            return bArr;
        }
        throw new RuntimeException("Odd number of characters.");
    }

    public static byte[] decodeHexString(String str) {
        return decodeHex(str.toCharArray());
    }

    public static char[] encodeHex(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i4 + 1;
            char[] cArr2 = DIGITS;
            cArr[i4] = cArr2[(bArr[i5] & 240) >>> 4];
            i4 = i6 + 1;
            cArr[i6] = cArr2[bArr[i5] & 15];
        }
        return cArr;
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    public static byte[] toByte(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 == 1) {
            return null;
        }
        int i4 = length / 2;
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 * 2;
            bArr[i5] = (byte) Integer.parseInt(str.substring(i6, i6 + 2), 16);
        }
        return bArr;
    }

    protected static int toDigit(char c5, int i4) {
        int digit = Character.digit(c5, 16);
        if (digit != -1) {
            return digit;
        }
        throw new RuntimeException("Illegal hexadecimal charcter " + c5 + " at index " + i4);
    }

    public static String toHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < bArr.length; i4++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i4])));
        }
        return stringBuffer.toString();
    }

    public byte[] decode(byte[] bArr) {
        return decodeHex(new String(bArr).toCharArray());
    }

    public byte[] encode(byte[] bArr) {
        return new String(encodeHex(bArr)).getBytes();
    }

    public byte[] decode(Object obj) {
        try {
            return decodeHex(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    public char[] encode(Object obj) {
        try {
            return encodeHex(obj instanceof String ? ((String) obj).getBytes() : (byte[]) obj);
        } catch (ClassCastException e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }
}
