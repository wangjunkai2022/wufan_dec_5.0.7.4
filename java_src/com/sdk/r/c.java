package com.sdk.r;

import io.netty.handler.codec.http.HttpConstants;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import okio.Utf8;
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f60095a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f60096b;

    static {
        boolean z4 = com.sdk.f.g.f60051b;
        f60095a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f60096b = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, Utf8.REPLACEMENT_BYTE, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, HttpConstants.COLON, HttpConstants.SEMICOLON, 60, 61, -1, -1, -1, 0, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, BinaryMemcacheOpcodes.SETQ, BinaryMemcacheOpcodes.ADDQ, BinaryMemcacheOpcodes.REPLACEQ, BinaryMemcacheOpcodes.DELETEQ, BinaryMemcacheOpcodes.INCREMENTQ, BinaryMemcacheOpcodes.DECREMENTQ, BinaryMemcacheOpcodes.QUITQ, BinaryMemcacheOpcodes.FLUSHQ, BinaryMemcacheOpcodes.APPENDQ, -1, -1, -1, -1, -1, -1, BinaryMemcacheOpcodes.PREPENDQ, 27, BinaryMemcacheOpcodes.TOUCH, BinaryMemcacheOpcodes.GAT, BinaryMemcacheOpcodes.GATQ, 31, 32, BinaryMemcacheOpcodes.SASL_AUTH, 34, BinaryMemcacheOpcodes.GATK, BinaryMemcacheOpcodes.GATKQ, 37, 38, 39, 40, 41, 42, 43, HttpConstants.COMMA, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(((bArr.length - 1) / 3) << 6);
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = i5 % 3;
            int i7 = 16 - (i6 * 8);
            i4 |= (bArr[i5] << i7) & (255 << i7);
            if (i6 == 2 || i5 == bArr.length - 1) {
                char[] cArr = f60095a;
                stringBuffer.append(cArr[(16515072 & i4) >>> 18]);
                stringBuffer.append(cArr[(258048 & i4) >>> 12]);
                stringBuffer.append(cArr[(i4 & 4032) >>> 6]);
                stringBuffer.append(cArr[i4 & 63]);
                i4 = 0;
            }
        }
        if (bArr.length % 3 > 0) {
            stringBuffer.setCharAt(stringBuffer.length() - 1, '=');
        }
        if (bArr.length % 3 == 1) {
            stringBuffer.setCharAt(stringBuffer.length() - 2, '=');
        }
        return stringBuffer.toString();
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 4 == 0) {
            if (str.length() == 0) {
                return new byte[0];
            }
            int i4 = str.charAt(length + (-1)) == '=' ? 1 : 0;
            if (str.charAt(length - 2) == '=') {
                i4++;
            }
            int i5 = ((length / 4) * 3) - i4;
            byte[] bArr = new byte[i5];
            for (int i6 = 0; i6 < length; i6 += 4) {
                int i7 = (i6 / 4) * 3;
                char charAt = str.charAt(i6);
                char charAt2 = str.charAt(i6 + 1);
                char charAt3 = str.charAt(i6 + 2);
                char charAt4 = str.charAt(i6 + 3);
                byte[] bArr2 = f60096b;
                int i8 = (bArr2[charAt] << BinaryMemcacheOpcodes.ADDQ) | (bArr2[charAt2] << 12) | (bArr2[charAt3] << 6) | bArr2[charAt4];
                bArr[i7] = (byte) ((16711680 & i8) >> 16);
                if (i6 < length - 4) {
                    bArr[i7 + 1] = (byte) ((65280 & i8) >> 8);
                    bArr[i7 + 2] = (byte) (i8 & 255);
                } else {
                    int i9 = i7 + 1;
                    if (i9 < i5) {
                        bArr[i9] = (byte) ((65280 & i8) >> 8);
                    }
                    int i10 = i7 + 2;
                    if (i10 < i5) {
                        bArr[i10] = (byte) (i8 & 255);
                    }
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Base64 string length must be 4*n");
    }
}
