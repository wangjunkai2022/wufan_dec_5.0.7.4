package com.sdk.r;

import com.j256.ormlite.stmt.query.SimpleComparison;
import io.netty.handler.codec.http.HttpConstants;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import okio.Utf8;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static char[] f60097a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b  reason: collision with root package name */
    public static byte[] f60098b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, HttpConstants.COLON, HttpConstants.SEMICOLON, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, BinaryMemcacheOpcodes.SETQ, BinaryMemcacheOpcodes.ADDQ, BinaryMemcacheOpcodes.REPLACEQ, BinaryMemcacheOpcodes.DELETEQ, BinaryMemcacheOpcodes.INCREMENTQ, BinaryMemcacheOpcodes.DECREMENTQ, BinaryMemcacheOpcodes.QUITQ, BinaryMemcacheOpcodes.FLUSHQ, BinaryMemcacheOpcodes.APPENDQ, -1, -1, -1, -1, -1, -1, BinaryMemcacheOpcodes.PREPENDQ, 27, BinaryMemcacheOpcodes.TOUCH, BinaryMemcacheOpcodes.GAT, BinaryMemcacheOpcodes.GATQ, 31, 32, BinaryMemcacheOpcodes.SASL_AUTH, 34, BinaryMemcacheOpcodes.GATK, BinaryMemcacheOpcodes.GATKQ, 37, 38, 39, 40, 41, 42, 43, HttpConstants.COMMA, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static String a(String str) {
        int i4;
        byte b5;
        int i5;
        byte b6;
        int i6;
        byte b7;
        int i7;
        byte b8;
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i8 = 0;
        loop0: while (i8 < length) {
            while (true) {
                i4 = i8 + 1;
                b5 = f60098b[bytes[i8]];
                if (i4 >= length || b5 != -1) {
                    break;
                }
                i8 = i4;
            }
            if (b5 == -1) {
                break;
            }
            while (true) {
                i5 = i4 + 1;
                b6 = f60098b[bytes[i4]];
                if (i5 >= length || b6 != -1) {
                    break;
                }
                i4 = i5;
            }
            if (b6 == -1) {
                break;
            }
            byteArrayOutputStream.write((b5 << 2) | ((b6 & 48) >>> 4));
            while (true) {
                i6 = i5 + 1;
                byte b9 = bytes[i5];
                if (b9 == 61) {
                    break loop0;
                }
                b7 = f60098b[b9];
                if (i6 >= length || b7 != -1) {
                    break;
                }
                i5 = i6;
            }
            if (b7 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b6 & 15) << 4) | ((b7 & 60) >>> 2));
            while (true) {
                i7 = i6 + 1;
                byte b10 = bytes[i6];
                if (b10 == 61) {
                    break loop0;
                }
                b8 = f60098b[b10];
                if (i7 >= length || b8 != -1) {
                    break;
                }
                i6 = i7;
            }
            if (b8 == -1) {
                break;
            }
            byteArrayOutputStream.write(b8 | ((b7 & 3) << 6));
            i8 = i7;
        }
        return new String(byteArrayOutputStream.toByteArray(), Charset.defaultCharset());
    }

    public static String b(String str) {
        String str2;
        byte[] bytes = str.getBytes("utf-8");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            int i6 = bytes[i4] & 255;
            if (i5 == length) {
                stringBuffer.append(f60097a[i6 >>> 2]);
                stringBuffer.append(f60097a[(i6 & 3) << 4]);
                str2 = "==";
            } else {
                int i7 = i5 + 1;
                int i8 = bytes[i5] & 255;
                if (i7 == length) {
                    stringBuffer.append(f60097a[i6 >>> 2]);
                    stringBuffer.append(f60097a[((i6 & 3) << 4) | ((i8 & 240) >>> 4)]);
                    stringBuffer.append(f60097a[(i8 & 15) << 2]);
                    str2 = SimpleComparison.EQUAL_TO_OPERATION;
                } else {
                    int i9 = i7 + 1;
                    int i10 = bytes[i7] & 255;
                    stringBuffer.append(f60097a[i6 >>> 2]);
                    stringBuffer.append(f60097a[((i6 & 3) << 4) | ((i8 & 240) >>> 4)]);
                    stringBuffer.append(f60097a[((i8 & 15) << 2) | ((i10 & 192) >>> 6)]);
                    stringBuffer.append(f60097a[i10 & 63]);
                    i4 = i9;
                }
            }
            stringBuffer.append(str2);
            break;
        }
        return stringBuffer.toString();
    }
}
