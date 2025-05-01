package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
/* compiled from: Base64.kt */
@ExperimentalEncodingApi
@SinceKotlin(version = "1.8")
/* loaded from: classes6.dex */
public class Base64 {
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    @NotNull
    public static final Default Default = new Default(null);
    @NotNull
    private static final byte[] mimeLineSeparatorSymbols = {13, 10};
    @NotNull
    private static final Base64 UrlSafe = new Base64(true, false);
    @NotNull
    private static final Base64 Mime = new Base64(false, true);

    /* compiled from: Base64.kt */
    /* loaded from: classes6.dex */
    public static final class Default extends Base64 {
        private Default() {
            super(false, false, null);
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Base64 getMime() {
            return Base64.Mime;
        }

        @NotNull
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        @NotNull
        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }
    }

    private Base64(boolean z4, boolean z5) {
        this.isUrlSafe = z4;
        this.isMimeScheme = z5;
        if (!((z4 && z5) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ Base64(boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z5);
    }

    private final void checkDestinationBounds(int i4, int i5, int i6) {
        if (i5 < 0 || i5 > i4) {
            throw new IndexOutOfBoundsException("destination offset: " + i5 + ", destination size: " + i4);
        }
        int i7 = i5 + i6;
        if (i7 < 0 || i7 > i4) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i5 + ", destination size: " + i4 + ", capacity needed: " + i6);
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return base64.decode(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    private final int decodeImpl(byte[] bArr, byte[] bArr2, int i4, int i5, int i6) {
        int[] access$getBase64UrlDecodeMap$p = this.isUrlSafe ? Base64Kt.access$getBase64UrlDecodeMap$p() : Base64Kt.access$getBase64DecodeMap$p();
        int i7 = -8;
        int i8 = i4;
        int i9 = i5;
        int i10 = 0;
        int i11 = -8;
        while (true) {
            if (i9 >= i6) {
                break;
            }
            if (i11 == i7 && i9 + 3 < i6) {
                int i12 = i9 + 1;
                int i13 = access$getBase64UrlDecodeMap$p[bArr[i9] & 255];
                int i14 = i12 + 1;
                int i15 = access$getBase64UrlDecodeMap$p[bArr[i12] & 255];
                int i16 = i14 + 1;
                int i17 = access$getBase64UrlDecodeMap$p[bArr[i14] & 255];
                int i18 = i16 + 1;
                int i19 = (i13 << 18) | (i15 << 12) | (i17 << 6) | access$getBase64UrlDecodeMap$p[bArr[i16] & 255];
                if (i19 >= 0) {
                    int i20 = i8 + 1;
                    bArr2[i8] = (byte) (i19 >> 16);
                    int i21 = i20 + 1;
                    bArr2[i20] = (byte) (i19 >> 8);
                    bArr2[i21] = (byte) i19;
                    i8 = i21 + 1;
                    i9 = i18;
                    i7 = -8;
                } else {
                    i9 = i18 - 4;
                }
            }
            int i22 = bArr[i9] & 255;
            int i23 = access$getBase64UrlDecodeMap$p[i22];
            if (i23 >= 0) {
                i9++;
                i10 = (i10 << 6) | i23;
                i11 += 6;
                if (i11 >= 0) {
                    bArr2[i8] = (byte) (i10 >>> i11);
                    i10 &= (1 << i11) - 1;
                    i11 -= 8;
                    i8++;
                }
            } else if (i23 == -2) {
                i9 = handlePaddingSymbol(bArr, i9, i6, i11);
                break;
            } else if (!this.isMimeScheme) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid symbol '");
                sb.append((char) i22);
                sb.append("'(");
                String num = Integer.toString(i22, CharsKt.checkRadix(8));
                Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                sb.append(num);
                sb.append(") at index ");
                sb.append(i9);
                throw new IllegalArgumentException(sb.toString());
            } else {
                i9++;
            }
            i7 = -8;
        }
        if (i11 != -2) {
            int skipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(bArr, i9, i6);
            if (skipIllegalSymbolsIfMime >= i6) {
                return i8 - i4;
            }
            int i24 = bArr[skipIllegalSymbolsIfMime] & 255;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Symbol '");
            sb2.append((char) i24);
            sb2.append("'(");
            String num2 = Integer.toString(i24, CharsKt.checkRadix(8));
            Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
            sb2.append(num2);
            sb2.append(") at index ");
            sb2.append(skipIllegalSymbolsIfMime - 1);
            sb2.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if (obj == null) {
            int i8 = (i7 & 4) != 0 ? 0 : i4;
            int i9 = (i7 & 8) != 0 ? 0 : i5;
            if ((i7 & 16) != 0) {
                i6 = bArr.length;
            }
            return base64.decodeIntoByteArray(bArr, bArr2, i8, i9, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    private final int decodeSize(byte[] bArr, int i4, int i5) {
        int i6 = i5 - i4;
        if (i6 == 0) {
            return 0;
        }
        if (i6 != 1) {
            if (this.isMimeScheme) {
                while (true) {
                    if (i4 >= i5) {
                        break;
                    }
                    int i7 = Base64Kt.access$getBase64DecodeMap$p()[bArr[i4] & 255];
                    if (i7 < 0) {
                        if (i7 == -2) {
                            i6 -= i5 - i4;
                            break;
                        }
                        i6--;
                    }
                    i4++;
                }
            } else if (bArr[i5 - 1] == 61) {
                i6--;
                if (bArr[i5 - 2] == 61) {
                    i6--;
                }
            }
            return (int) ((i6 * 6) / 8);
        }
        throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i4 + ", endIndex: " + i5);
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return base64.encode(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if (obj == null) {
            int i8 = (i7 & 4) != 0 ? 0 : i4;
            int i9 = (i7 & 8) != 0 ? 0 : i5;
            if ((i7 & 16) != 0) {
                i6 = bArr.length;
            }
            return base64.encodeIntoByteArray(bArr, bArr2, i8, i9, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    private final int encodeSize(int i4) {
        int i5 = ((i4 + 3) - 1) / 3;
        int i6 = (i5 * 4) + ((this.isMimeScheme ? (i5 - 1) / 19 : 0) * 2);
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 4) != 0) {
                i4 = 0;
            }
            if ((i6 & 8) != 0) {
                i5 = bArr.length;
            }
            return base64.encodeToAppendable(bArr, appendable, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return base64.encodeToByteArray(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
    }

    private final int handlePaddingSymbol(byte[] bArr, int i4, int i5, int i6) {
        if (i6 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i4);
        }
        if (i6 != -6) {
            if (i6 == -4) {
                i4 = skipIllegalSymbolsIfMime(bArr, i4 + 1, i5);
                if (i4 == i5 || bArr[i4] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i4);
                }
            } else if (i6 != -2) {
                throw new IllegalStateException("Unreachable".toString());
            }
        }
        return i4 + 1;
    }

    private final int skipIllegalSymbolsIfMime(byte[] bArr, int i4, int i5) {
        if (this.isMimeScheme) {
            while (i4 < i5) {
                if (Base64Kt.access$getBase64DecodeMap$p()[bArr[i4] & 255] != -1) {
                    return i4;
                }
                i4++;
            }
            return i4;
        }
        return i4;
    }

    @NotNull
    public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b5 : source) {
            sb.append((char) b5);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    @NotNull
    public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), i4, i5);
        byte[] bArr = new byte[i5 - i4];
        int i6 = 0;
        while (i4 < i5) {
            char charAt = source.charAt(i4);
            if (charAt <= 255) {
                bArr[i6] = (byte) charAt;
                i6++;
            } else {
                bArr[i6] = Utf8.REPLACEMENT_BYTE;
                i6++;
            }
            i4++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int i4, int i5, int i6) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i5, i6, i4);
    }

    @NotNull
    public final byte[] decode(@NotNull byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, i4, i5);
        int decodeSize = decodeSize(source, i4, i5);
        byte[] bArr = new byte[decodeSize];
        if (decodeImpl(source, bArr, 0, i4, i5) == decodeSize) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int decodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i5, i6);
        checkDestinationBounds(destination.length, i4, decodeSize(source, i5, i6));
        return decodeImpl(source, destination, i4, i5, i6);
    }

    @NotNull
    public final String encode(@NotNull byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, i4, i5), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, i4, i5, i6);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, @NotNull byte[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i5, i6);
        checkDestinationBounds(destination.length, i4, encodeSize(i6 - i5));
        byte[] access$getBase64UrlEncodeMap$p = this.isUrlSafe ? Base64Kt.access$getBase64UrlEncodeMap$p() : Base64Kt.access$getBase64EncodeMap$p();
        int i7 = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i8 = i4;
        while (true) {
            if (i5 + 2 >= i6) {
                break;
            }
            int min = Math.min((i6 - i5) / 3, i7);
            int i9 = 0;
            while (i9 < min) {
                int i10 = i5 + 1;
                int i11 = i10 + 1;
                int i12 = ((source[i5] & 255) << 16) | ((source[i10] & 255) << 8) | (source[i11] & 255);
                int i13 = i8 + 1;
                destination[i8] = access$getBase64UrlEncodeMap$p[i12 >>> 18];
                int i14 = i13 + 1;
                destination[i13] = access$getBase64UrlEncodeMap$p[(i12 >>> 12) & 63];
                int i15 = i14 + 1;
                destination[i14] = access$getBase64UrlEncodeMap$p[(i12 >>> 6) & 63];
                i8 = i15 + 1;
                destination[i15] = access$getBase64UrlEncodeMap$p[i12 & 63];
                i9++;
                i5 = i11 + 1;
            }
            if (min == i7 && i5 != i6) {
                int i16 = i8 + 1;
                byte[] bArr = mimeLineSeparatorSymbols;
                destination[i8] = bArr[0];
                i8 = i16 + 1;
                destination[i16] = bArr[1];
            }
        }
        int i17 = i6 - i5;
        if (i17 == 1) {
            int i18 = i5 + 1;
            int i19 = (source[i5] & 255) << 4;
            int i20 = i8 + 1;
            destination[i8] = access$getBase64UrlEncodeMap$p[i19 >>> 6];
            int i21 = i20 + 1;
            destination[i20] = access$getBase64UrlEncodeMap$p[i19 & 63];
            int i22 = i21 + 1;
            destination[i21] = 61;
            i8 = i22 + 1;
            destination[i22] = 61;
            i5 = i18;
        } else if (i17 == 2) {
            int i23 = i5 + 1;
            int i24 = i23 + 1;
            int i25 = ((source[i23] & 255) << 2) | ((source[i5] & 255) << 10);
            int i26 = i8 + 1;
            destination[i8] = access$getBase64UrlEncodeMap$p[i25 >>> 12];
            int i27 = i26 + 1;
            destination[i26] = access$getBase64UrlEncodeMap$p[(i25 >>> 6) & 63];
            int i28 = i27 + 1;
            destination[i27] = access$getBase64UrlEncodeMap$p[i25 & 63];
            i8 = i28 + 1;
            destination[i28] = 61;
            i5 = i24;
        }
        if (i5 == i6) {
            return i8 - i4;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public final <A extends Appendable> A encodeToAppendable(@NotNull byte[] source, @NotNull A destination, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, i4, i5), Charsets.ISO_8859_1));
        return destination;
    }

    @NotNull
    public final byte[] encodeToByteArray(@NotNull byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, i4, i5);
    }

    @NotNull
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, i4, i5);
        byte[] bArr = new byte[encodeSize(i5 - i4)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, i4, i5);
        return bArr;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.isMimeScheme;
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.isUrlSafe;
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = charSequence.length();
            }
            return base64.decode(charSequence, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i4, int i5, int i6, int i7, Object obj) {
        if (obj == null) {
            int i8 = (i7 & 4) != 0 ? 0 : i4;
            int i9 = (i7 & 8) != 0 ? 0 : i5;
            if ((i7 & 16) != 0) {
                i6 = charSequence.length();
            }
            return base64.decodeIntoByteArray(charSequence, bArr, i8, i9, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public final int decodeIntoByteArray(@NotNull CharSequence source, @NotNull byte[] destination, int i4, int i5, int i6) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), i5, i6);
            String substring = ((String) source).substring(i5, i6);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "this as java.lang.String).getBytes(charset)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, i5, i6);
        }
        return decodeIntoByteArray$default(this, charsToBytesImpl$kotlin_stdlib, destination, i4, 0, 0, 24, (Object) null);
    }

    @NotNull
    public final byte[] decode(@NotNull CharSequence source, int i4, int i5) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), i4, i5);
            String substring = ((String) source).substring(i4, i5);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "this as java.lang.String).getBytes(charset)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, i4, i5);
        }
        return decode$default(this, charsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}
