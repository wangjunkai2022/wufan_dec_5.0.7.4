package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import com.android.dx.io.Opcodes;
import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public final class Utf8Safe extends Utf8 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 < length) {
                char charAt = charSequence.charAt(i4);
                if (charAt >= 2048) {
                    i5 += encodedLengthGeneral(charSequence, i4);
                    break;
                }
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    public static String decodeUtf8Array(byte[] bArr, int i4, int i5) {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b5 = bArr[i4];
                if (!Utf8.DecodeUtil.isOneByte(b5)) {
                    break;
                }
                i4++;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i4 < i6) {
                int i9 = i4 + 1;
                byte b6 = bArr[i4];
                if (Utf8.DecodeUtil.isOneByte(b6)) {
                    int i10 = i8 + 1;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i8);
                    while (i9 < i6) {
                        byte b7 = bArr[i9];
                        if (!Utf8.DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        i9++;
                        Utf8.DecodeUtil.handleOneByte(b7, cArr, i10);
                        i10++;
                    }
                    i4 = i9;
                    i8 = i10;
                } else if (Utf8.DecodeUtil.isTwoBytes(b6)) {
                    if (i9 < i6) {
                        Utf8.DecodeUtil.handleTwoBytes(b6, bArr[i9], cArr, i8);
                        i4 = i9 + 1;
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.DecodeUtil.isThreeBytes(b6)) {
                    if (i9 < i6 - 1) {
                        int i11 = i9 + 1;
                        Utf8.DecodeUtil.handleThreeBytes(b6, bArr[i9], bArr[i11], cArr, i8);
                        i4 = i11 + 1;
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i9 < i6 - 2) {
                    int i12 = i9 + 1;
                    byte b8 = bArr[i9];
                    int i13 = i12 + 1;
                    Utf8.DecodeUtil.handleFourBytes(b6, b8, bArr[i12], bArr[i13], cArr, i8);
                    i4 = i13 + 1;
                    i8 = i8 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i4, int i5) {
        if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b5 = byteBuffer.get(i4);
                if (!Utf8.DecodeUtil.isOneByte(b5)) {
                    break;
                }
                i4++;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i4 < i6) {
                int i9 = i4 + 1;
                byte b6 = byteBuffer.get(i4);
                if (Utf8.DecodeUtil.isOneByte(b6)) {
                    int i10 = i8 + 1;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i8);
                    while (i9 < i6) {
                        byte b7 = byteBuffer.get(i9);
                        if (!Utf8.DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        i9++;
                        Utf8.DecodeUtil.handleOneByte(b7, cArr, i10);
                        i10++;
                    }
                    i4 = i9;
                    i8 = i10;
                } else if (Utf8.DecodeUtil.isTwoBytes(b6)) {
                    if (i9 < i6) {
                        Utf8.DecodeUtil.handleTwoBytes(b6, byteBuffer.get(i9), cArr, i8);
                        i4 = i9 + 1;
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.DecodeUtil.isThreeBytes(b6)) {
                    if (i9 < i6 - 1) {
                        int i11 = i9 + 1;
                        Utf8.DecodeUtil.handleThreeBytes(b6, byteBuffer.get(i9), byteBuffer.get(i11), cArr, i8);
                        i4 = i11 + 1;
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i9 < i6 - 2) {
                    int i12 = i9 + 1;
                    byte b8 = byteBuffer.get(i9);
                    int i13 = i12 + 1;
                    Utf8.DecodeUtil.handleFourBytes(b6, b8, byteBuffer.get(i12), byteBuffer.get(i13), cArr, i8);
                    i4 = i13 + 1;
                    i8 = i8 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int encodeUtf8Array(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.Utf8Safe.encodeUtf8Array(java.lang.CharSequence, byte[], int, int):int");
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i4 = 0;
        while (i4 < length) {
            try {
                char charAt = charSequence.charAt(i4);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i4, (byte) charAt);
                i4++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i4 == length) {
            byteBuffer.position(position + i4);
            return;
        }
        position += i4;
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i5 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i5, (byte) ((charAt2 & '?') | 128));
                    position = i5;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i5;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
                }
            } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                int i6 = i4 + 1;
                if (i6 != length) {
                    try {
                        char charAt3 = charSequence.charAt(i6);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i7 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i8 = i7 + 1;
                                byteBuffer.put(i7, (byte) (((codePoint >>> 12) & 63) | 128));
                                int i9 = i8 + 1;
                                byteBuffer.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i9, (byte) ((codePoint & 63) | 128));
                                position = i9;
                                i4 = i6;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i7;
                                i4 = i6;
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
                            }
                        } else {
                            i4 = i6;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                throw new UnpairedSurrogateException(i4, length);
            } else {
                int i10 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | Opcodes.SHL_INT_LIT8));
                position = i10 + 1;
                byteBuffer.put(i10, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i4++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i4) < 65536) {
                        throw new UnpairedSurrogateException(i4, length);
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i4, int i5) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i4, i5);
        }
        return decodeUtf8Buffer(byteBuffer, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            return;
        }
        encodeUtf8Buffer(charSequence, byteBuffer);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
