package org.jboss.netty.buffer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.UShort;
/* compiled from: ChannelBuffers.java */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteOrder f72466a = ByteOrder.BIG_ENDIAN;

    /* renamed from: b  reason: collision with root package name */
    public static final ByteOrder f72467b = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: c  reason: collision with root package name */
    public static final e f72468c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f72469d = new char[1024];

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        for (int i4 = 0; i4 < 256; i4++) {
            char[] cArr = f72469d;
            int i5 = i4 << 1;
            cArr[i5] = charArray[(i4 >>> 4) & 15];
            cArr[i5 + 1] = charArray[i4 & 15];
        }
    }

    private h() {
    }

    public static e A(int i4) {
        return B(f72466a, i4);
    }

    public static e B(ByteOrder byteOrder, int i4) {
        Objects.requireNonNull(byteOrder, "endianness");
        if (i4 == 0) {
            return f72468c;
        }
        d dVar = new d(ByteBuffer.allocateDirect(i4).order(byteOrder));
        dVar.clear();
        return dVar;
    }

    public static e C() {
        return F(f72466a, 256);
    }

    public static e D(int i4) {
        return F(f72466a, i4);
    }

    public static e E(int i4, f fVar) {
        Objects.requireNonNull(fVar, "factory");
        return new l(fVar.d(), i4, fVar);
    }

    public static e F(ByteOrder byteOrder, int i4) {
        return new l(byteOrder, i4);
    }

    public static e G(ByteOrder byteOrder, int i4, f fVar) {
        return new l(byteOrder, i4, fVar);
    }

    public static e H(f fVar) {
        Objects.requireNonNull(fVar, "factory");
        return new l(fVar.d(), 256, fVar);
    }

    static ByteBuffer I(CharBuffer charBuffer, Charset charset) {
        CharsetEncoder b5 = org.jboss.netty.util.a.b(charset);
        double remaining = charBuffer.remaining();
        double maxBytesPerChar = b5.maxBytesPerChar();
        Double.isNaN(remaining);
        Double.isNaN(maxBytesPerChar);
        ByteBuffer allocate = ByteBuffer.allocate((int) (remaining * maxBytesPerChar));
        try {
            CoderResult encode = b5.encode(charBuffer, allocate, true);
            if (!encode.isUnderflow()) {
                encode.throwException();
            }
            CoderResult flush = b5.flush(allocate);
            if (!flush.isUnderflow()) {
                flush.throwException();
            }
            allocate.flip();
            return allocate;
        } catch (CharacterCodingException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static boolean J(e eVar, e eVar2) {
        int readableBytes = eVar.readableBytes();
        if (readableBytes != eVar2.readableBytes()) {
            return false;
        }
        int i4 = readableBytes >>> 3;
        int readerIndex = eVar.readerIndex();
        int readerIndex2 = eVar2.readerIndex();
        if (eVar.order() == eVar2.order()) {
            while (i4 > 0) {
                if (eVar.getLong(readerIndex) != eVar2.getLong(readerIndex2)) {
                    return false;
                }
                readerIndex += 8;
                readerIndex2 += 8;
                i4--;
            }
        } else {
            while (i4 > 0) {
                if (eVar.getLong(readerIndex) != V(eVar2.getLong(readerIndex2))) {
                    return false;
                }
                readerIndex += 8;
                readerIndex2 += 8;
                i4--;
            }
        }
        for (int i5 = readableBytes & 7; i5 > 0; i5--) {
            if (eVar.getByte(readerIndex) != eVar2.getByte(readerIndex2)) {
                return false;
            }
            readerIndex++;
            readerIndex2++;
        }
        return true;
    }

    private static int K(e eVar, int i4, int i5, byte b5) {
        int max = Math.max(i4, 0);
        if (max < i5 && eVar.capacity() != 0) {
            while (max < i5) {
                if (eVar.getByte(max) == b5) {
                    return max;
                }
                max++;
            }
        }
        return -1;
    }

    private static int L(e eVar, int i4, int i5, g gVar) {
        int max = Math.max(i4, 0);
        if (max < i5 && eVar.capacity() != 0) {
            while (max < i5) {
                if (gVar.a(eVar, max)) {
                    return max;
                }
                max++;
            }
        }
        return -1;
    }

    public static int M(e eVar) {
        int i4;
        int readableBytes = eVar.readableBytes();
        int i5 = readableBytes >>> 2;
        int i6 = readableBytes & 3;
        int readerIndex = eVar.readerIndex();
        if (eVar.order() == f72466a) {
            i4 = 1;
            while (i5 > 0) {
                i4 = (i4 * 31) + eVar.getInt(readerIndex);
                readerIndex += 4;
                i5--;
            }
        } else {
            i4 = 1;
            while (i5 > 0) {
                i4 = (i4 * 31) + U(eVar.getInt(readerIndex));
                readerIndex += 4;
                i5--;
            }
        }
        while (i6 > 0) {
            i4 = (i4 * 31) + eVar.getByte(readerIndex);
            i6--;
            readerIndex++;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static String N(e eVar) {
        return O(eVar, eVar.readerIndex(), eVar.readableBytes());
    }

    public static String O(e eVar, int i4, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("length: " + i5);
        } else if (i5 == 0) {
            return "";
        } else {
            int i6 = i4 + i5;
            char[] cArr = new char[i5 << 1];
            int i7 = 0;
            while (i4 < i6) {
                System.arraycopy(f72469d, eVar.getUnsignedByte(i4) << 1, cArr, i7, 2);
                i4++;
                i7 += 2;
            }
            return new String(cArr);
        }
    }

    public static e P(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i4 = 0; i4 < length; i4 += 2) {
            bArr[i4 / 2] = (byte) ((Character.digit(str.charAt(i4), 16) << 4) + Character.digit(str.charAt(i4 + 1), 16));
        }
        return g0(bArr);
    }

    public static int Q(e eVar, int i4, int i5, byte b5) {
        if (i4 <= i5) {
            return K(eVar, i4, i5, b5);
        }
        return S(eVar, i4, i5, b5);
    }

    public static int R(e eVar, int i4, int i5, g gVar) {
        if (i4 <= i5) {
            return L(eVar, i4, i5, gVar);
        }
        return T(eVar, i4, i5, gVar);
    }

    private static int S(e eVar, int i4, int i5, byte b5) {
        int min = Math.min(i4, eVar.capacity());
        if (min >= 0 && eVar.capacity() != 0) {
            for (int i6 = min - 1; i6 >= i5; i6--) {
                if (eVar.getByte(i6) == b5) {
                    return i6;
                }
            }
        }
        return -1;
    }

    private static int T(e eVar, int i4, int i5, g gVar) {
        int min = Math.min(i4, eVar.capacity());
        if (min >= 0 && eVar.capacity() != 0) {
            for (int i6 = min - 1; i6 >= i5; i6--) {
                if (gVar.a(eVar, i6)) {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int U(int i4) {
        return (X((short) (i4 >>> 16)) & UShort.MAX_VALUE) | (X((short) i4) << 16);
    }

    public static long V(long j4) {
        return (U((int) (j4 >>> 32)) & 4294967295L) | (U((int) j4) << 32);
    }

    public static int W(int i4) {
        return ((i4 >>> 16) & 255) | ((i4 << 16) & 16711680) | (65280 & i4);
    }

    public static short X(short s4) {
        return (short) (((s4 >>> 8) & 255) | (s4 << 8));
    }

    public static e Y(e eVar) {
        if (eVar instanceof p) {
            eVar = ((p) eVar).A();
        }
        return new p(eVar);
    }

    public static e Z(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return f72468c;
        }
        if (byteBuffer.hasArray()) {
            return b0(byteBuffer.order(), byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new d(byteBuffer);
    }

    public static e a(int i4) {
        return b(f72466a, i4);
    }

    public static e a0(ByteOrder byteOrder, byte[] bArr) {
        if (byteOrder == f72466a) {
            if (bArr.length == 0) {
                return f72468c;
            }
            return new c(bArr);
        } else if (byteOrder == f72467b) {
            if (bArr.length == 0) {
                return f72468c;
            }
            return new o(bArr);
        } else {
            throw new NullPointerException("endianness");
        }
    }

    public static e b(ByteOrder byteOrder, int i4) {
        if (byteOrder == f72466a) {
            if (i4 == 0) {
                return f72468c;
            }
            return new c(i4);
        } else if (byteOrder == f72467b) {
            if (i4 == 0) {
                return f72468c;
            }
            return new o(i4);
        } else {
            throw new NullPointerException("endianness");
        }
    }

    public static e b0(ByteOrder byteOrder, byte[] bArr, int i4, int i5) {
        Objects.requireNonNull(byteOrder, "endianness");
        if (i4 != 0) {
            if (i5 == 0) {
                return f72468c;
            }
            return new q(a0(byteOrder, bArr), i4, i5);
        } else if (i5 == bArr.length) {
            return a0(byteOrder, bArr);
        } else {
            if (i5 == 0) {
                return f72468c;
            }
            return new r(a0(byteOrder, bArr), i5);
        }
    }

    public static int c(e eVar, e eVar2) {
        int readableBytes = eVar.readableBytes();
        int readableBytes2 = eVar2.readableBytes();
        int min = Math.min(readableBytes, readableBytes2);
        int i4 = min >>> 2;
        int readerIndex = eVar.readerIndex();
        int readerIndex2 = eVar2.readerIndex();
        if (eVar.order() == eVar2.order()) {
            while (i4 > 0) {
                long unsignedInt = eVar.getUnsignedInt(readerIndex);
                long unsignedInt2 = eVar2.getUnsignedInt(readerIndex2);
                if (unsignedInt > unsignedInt2) {
                    return 1;
                }
                if (unsignedInt < unsignedInt2) {
                    return -1;
                }
                readerIndex += 4;
                readerIndex2 += 4;
                i4--;
            }
        } else {
            while (i4 > 0) {
                long unsignedInt3 = eVar.getUnsignedInt(readerIndex);
                long U = U(eVar2.getInt(readerIndex2)) & 4294967295L;
                if (unsignedInt3 > U) {
                    return 1;
                }
                if (unsignedInt3 < U) {
                    return -1;
                }
                readerIndex += 4;
                readerIndex2 += 4;
                i4--;
            }
        }
        for (int i5 = min & 3; i5 > 0; i5--) {
            short unsignedByte = eVar.getUnsignedByte(readerIndex);
            short unsignedByte2 = eVar2.getUnsignedByte(readerIndex2);
            if (unsignedByte > unsignedByte2) {
                return 1;
            }
            if (unsignedByte < unsignedByte2) {
                return -1;
            }
            readerIndex++;
            readerIndex2++;
        }
        return readableBytes - readableBytes2;
    }

    public static e c0(ByteOrder byteOrder, byte[]... bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(bArr.length);
                for (byte[] bArr2 : bArr) {
                    if (bArr2 == null) {
                        break;
                    }
                    if (bArr2.length > 0) {
                        arrayList.add(a0(byteOrder, bArr2));
                    }
                }
                return d(byteOrder, arrayList, false);
            } else if (bArr[0].length != 0) {
                return a0(byteOrder, bArr[0]);
            }
        }
        return f72468c;
    }

    private static e d(ByteOrder byteOrder, List<e> list, boolean z4) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return new i(byteOrder, list, z4);
            }
            return list.get(0);
        }
        return f72468c;
    }

    public static e d0(e eVar) {
        if (eVar.H0()) {
            return eVar.G0();
        }
        return f72468c;
    }

    public static e e(CharSequence charSequence, int i4, int i5, Charset charset) {
        return i(f72466a, charSequence, i4, i5, charset);
    }

    public static e e0(boolean z4, ByteBuffer... byteBufferArr) {
        int length = byteBufferArr.length;
        if (length != 0) {
            if (length != 1) {
                ByteOrder byteOrder = null;
                ArrayList arrayList = new ArrayList(byteBufferArr.length);
                for (ByteBuffer byteBuffer : byteBufferArr) {
                    if (byteBuffer == null) {
                        break;
                    }
                    if (byteBuffer.hasRemaining()) {
                        if (byteOrder != null) {
                            if (!byteOrder.equals(byteBuffer.order())) {
                                throw new IllegalArgumentException("inconsistent byte order");
                            }
                        } else {
                            byteOrder = byteBuffer.order();
                        }
                        arrayList.add(Z(byteBuffer));
                    }
                }
                return d(byteOrder, arrayList, z4);
            } else if (byteBufferArr[0].hasRemaining()) {
                return Z(byteBufferArr[0]);
            }
        }
        return f72468c;
    }

    public static e f(CharSequence charSequence, Charset charset) {
        return j(f72466a, charSequence, charset);
    }

    public static e f0(boolean z4, e... eVarArr) {
        int length = eVarArr.length;
        if (length != 0) {
            if (length != 1) {
                ByteOrder byteOrder = null;
                ArrayList arrayList = new ArrayList(eVarArr.length);
                for (e eVar : eVarArr) {
                    if (eVar == null) {
                        break;
                    }
                    if (eVar.H0()) {
                        if (byteOrder != null) {
                            if (!byteOrder.equals(eVar.order())) {
                                throw new IllegalArgumentException("inconsistent byte order");
                            }
                        } else {
                            byteOrder = eVar.order();
                        }
                        if (eVar instanceof i) {
                            arrayList.addAll(((i) eVar).m(eVar.readerIndex(), eVar.readableBytes()));
                        } else {
                            arrayList.add(eVar.G0());
                        }
                    }
                }
                return d(byteOrder, arrayList, z4);
            } else if (eVarArr[0].H0()) {
                return d0(eVarArr[0]);
            }
        }
        return f72468c;
    }

    @Deprecated
    public static e g(String str, String str2) {
        return f(str, Charset.forName(str2));
    }

    public static e g0(byte[] bArr) {
        return a0(f72466a, bArr);
    }

    public static e h(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return f72468c;
        }
        byte[] bArr = new byte[remaining];
        int position = byteBuffer.position();
        try {
            byteBuffer.get(bArr);
            byteBuffer.position(position);
            return a0(byteBuffer.order(), bArr);
        } catch (Throwable th) {
            byteBuffer.position(position);
            throw th;
        }
    }

    public static e h0(byte[] bArr, int i4, int i5) {
        return b0(f72466a, bArr, i4, i5);
    }

    public static e i(ByteOrder byteOrder, CharSequence charSequence, int i4, int i5, Charset charset) {
        Objects.requireNonNull(charSequence, TypedValues.Custom.S_STRING);
        if (i5 == 0) {
            return f72468c;
        }
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (charBuffer.hasArray()) {
                return o(byteOrder, charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i4, i5, charset);
            }
            CharBuffer slice = charBuffer.slice();
            slice.limit(i5);
            slice.position(i4);
            return l(byteOrder, slice, charset);
        }
        return l(byteOrder, CharBuffer.wrap(charSequence, i4, i5 + i4), charset);
    }

    public static e i0(ByteBuffer... byteBufferArr) {
        return e0(false, byteBufferArr);
    }

    public static e j(ByteOrder byteOrder, CharSequence charSequence, Charset charset) {
        Objects.requireNonNull(charSequence, TypedValues.Custom.S_STRING);
        if (charSequence instanceof CharBuffer) {
            return l(byteOrder, (CharBuffer) charSequence, charset);
        }
        return l(byteOrder, CharBuffer.wrap(charSequence), charset);
    }

    public static e j0(e... eVarArr) {
        return f0(false, eVarArr);
    }

    @Deprecated
    public static e k(ByteOrder byteOrder, String str, String str2) {
        return j(byteOrder, str, Charset.forName(str2));
    }

    public static e k0(byte[]... bArr) {
        return c0(f72466a, bArr);
    }

    private static e l(ByteOrder byteOrder, CharBuffer charBuffer, Charset charset) {
        ByteBuffer I = I(charBuffer, charset);
        e a02 = a0(byteOrder, I.array());
        a02.u0(I.remaining());
        return a02;
    }

    public static e m(ByteOrder byteOrder, byte[] bArr) {
        if (byteOrder == f72466a) {
            if (bArr.length == 0) {
                return f72468c;
            }
            return new c((byte[]) bArr.clone());
        } else if (byteOrder == f72467b) {
            if (bArr.length == 0) {
                return f72468c;
            }
            return new o((byte[]) bArr.clone());
        } else {
            throw new NullPointerException("endianness");
        }
    }

    public static e n(ByteOrder byteOrder, byte[] bArr, int i4, int i5) {
        Objects.requireNonNull(byteOrder, "endianness");
        if (i5 == 0) {
            return f72468c;
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return a0(byteOrder, bArr2);
    }

    public static e o(ByteOrder byteOrder, char[] cArr, int i4, int i5, Charset charset) {
        Objects.requireNonNull(cArr, "array");
        if (i5 == 0) {
            return f72468c;
        }
        return l(byteOrder, CharBuffer.wrap(cArr, i4, i5), charset);
    }

    public static e p(ByteOrder byteOrder, char[] cArr, Charset charset) {
        return o(byteOrder, cArr, 0, cArr.length, charset);
    }

    public static e q(ByteOrder byteOrder, byte[]... bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                int i4 = 0;
                for (byte[] bArr2 : bArr) {
                    if (Integer.MAX_VALUE - i4 >= bArr2.length) {
                        i4 += bArr2.length;
                    } else {
                        throw new IllegalArgumentException("The total length of the specified arrays is too big.");
                    }
                }
                if (i4 == 0) {
                    return f72468c;
                }
                byte[] bArr3 = new byte[i4];
                int i5 = 0;
                for (byte[] bArr4 : bArr) {
                    System.arraycopy(bArr4, 0, bArr3, i5, bArr4.length);
                    i5 += bArr4.length;
                }
                return a0(byteOrder, bArr3);
            } else if (bArr[0].length == 0) {
                return f72468c;
            } else {
                return m(byteOrder, bArr[0]);
            }
        }
        return f72468c;
    }

    public static e r(e eVar) {
        if (eVar.H0()) {
            return eVar.copy();
        }
        return f72468c;
    }

    public static e s(byte[] bArr) {
        return m(f72466a, bArr);
    }

    public static e t(byte[] bArr, int i4, int i5) {
        return n(f72466a, bArr, i4, i5);
    }

    public static e u(char[] cArr, int i4, int i5, Charset charset) {
        return o(f72466a, cArr, i4, i5, charset);
    }

    public static e v(char[] cArr, Charset charset) {
        return o(f72466a, cArr, 0, cArr.length, charset);
    }

    public static e w(ByteBuffer... byteBufferArr) {
        int length = byteBufferArr.length;
        if (length != 0) {
            if (length != 1) {
                e[] eVarArr = new e[byteBufferArr.length];
                for (int i4 = 0; i4 < byteBufferArr.length; i4++) {
                    eVarArr[i4] = h(byteBufferArr[i4]);
                }
                return f0(false, eVarArr);
            }
            return h(byteBufferArr[0]);
        }
        return f72468c;
    }

    public static e x(e... eVarArr) {
        int length = eVarArr.length;
        if (length != 0) {
            if (length != 1) {
                e[] eVarArr2 = new e[eVarArr.length];
                for (int i4 = 0; i4 < eVarArr.length; i4++) {
                    eVarArr2[i4] = r(eVarArr[i4]);
                }
                return f0(false, eVarArr2);
            }
            return r(eVarArr[0]);
        }
        return f72468c;
    }

    public static e y(byte[]... bArr) {
        return q(f72466a, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String z(ByteBuffer byteBuffer, Charset charset) {
        CharsetDecoder a5 = org.jboss.netty.util.a.a(charset);
        double remaining = byteBuffer.remaining();
        double maxCharsPerByte = a5.maxCharsPerByte();
        Double.isNaN(remaining);
        Double.isNaN(maxCharsPerByte);
        CharBuffer allocate = CharBuffer.allocate((int) (remaining * maxCharsPerByte));
        try {
            CoderResult decode = a5.decode(byteBuffer, allocate, true);
            if (!decode.isUnderflow()) {
                decode.throwException();
            }
            CoderResult flush = a5.flush(allocate);
            if (!flush.isUnderflow()) {
                flush.throwException();
            }
            return allocate.flip().toString();
        } catch (CharacterCodingException e5) {
            throw new IllegalStateException(e5);
        }
    }
}
