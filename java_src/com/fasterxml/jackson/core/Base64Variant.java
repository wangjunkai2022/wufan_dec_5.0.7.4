package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.http.conn.ssl.TokenParser;
/* loaded from: classes2.dex */
public final class Base64Variant implements Serializable {
    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;
    private static final int INT_SPACE = 32;
    protected static final char PADDING_CHAR_NONE = 0;
    private static final long serialVersionUID = 1;
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final int _maxLineLength;
    final String _name;
    private final char _paddingChar;
    private final PaddingReadBehaviour _paddingReadBehaviour;
    private final boolean _writePadding;

    /* loaded from: classes2.dex */
    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z4, char c5, int i4) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._writePadding = z4;
        this._paddingChar = c5;
        this._maxLineLength = i4;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i5 = 0; i5 < length; i5++) {
                char c6 = this._base64ToAsciiC[i5];
                this._base64ToAsciiB[i5] = (byte) c6;
                this._asciiToBase64[c6] = i5;
            }
            if (z4) {
                this._asciiToBase64[c5] = -2;
            }
            this._paddingReadBehaviour = z4 ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
            return;
        }
        throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
    }

    protected void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    protected void _reportBase64UnexpectedPadding() throws IllegalArgumentException {
        throw new IllegalArgumentException(unexpectedPaddingMessage());
    }

    protected void _reportInvalidBase64(char c5, int i4, String str) throws IllegalArgumentException {
        String str2;
        if (c5 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c5) + ") as character #" + (i4 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c5)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i4 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (Character.isDefined(c5) && !Character.isISOControl(c5)) {
            str2 = "Illegal character '" + c5 + "' (code 0x" + Integer.toHexString(c5) + ") in base64 content";
        } else {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c5) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean acceptsPaddingOnRead() {
        return this._paddingReadBehaviour != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Byte(byte b5) {
        if (b5 < 0) {
            return -1;
        }
        return this._asciiToBase64[b5];
    }

    public int decodeBase64Char(char c5) {
        if (c5 <= 127) {
            return this._asciiToBase64[c5];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public byte encodeBase64BitsAsByte(int i4) {
        return this._base64ToAsciiB[i4];
    }

    public char encodeBase64BitsAsChar(int i4) {
        return this._base64ToAsciiC[i4];
    }

    public int encodeBase64Chunk(int i4, char[] cArr, int i5) {
        int i6 = i5 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i5] = cArr2[(i4 >> 18) & 63];
        int i7 = i6 + 1;
        cArr[i6] = cArr2[(i4 >> 12) & 63];
        int i8 = i7 + 1;
        cArr[i7] = cArr2[(i4 >> 6) & 63];
        int i9 = i8 + 1;
        cArr[i8] = cArr2[i4 & 63];
        return i9;
    }

    public int encodeBase64Partial(int i4, int i5, char[] cArr, int i6) {
        int i7 = i6 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i6] = cArr2[(i4 >> 18) & 63];
        int i8 = i7 + 1;
        cArr[i7] = cArr2[(i4 >> 12) & 63];
        if (usesPadding()) {
            int i9 = i8 + 1;
            cArr[i8] = i5 == 2 ? this._base64ToAsciiC[(i4 >> 6) & 63] : this._paddingChar;
            int i10 = i9 + 1;
            cArr[i9] = this._paddingChar;
            return i10;
        } else if (i5 == 2) {
            int i11 = i8 + 1;
            cArr[i8] = this._base64ToAsciiC[(i4 >> 6) & 63];
            return i11;
        } else {
            return i8;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Base64Variant.class) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant._paddingChar == this._paddingChar && base64Variant._maxLineLength == this._maxLineLength && base64Variant._writePadding == this._writePadding && base64Variant._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(base64Variant._name);
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public byte getPaddingByte() {
        return (byte) this._paddingChar;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", getName(), Character.valueOf(getPaddingChar()));
    }

    public PaddingReadBehaviour paddingReadBehaviour() {
        return this._paddingReadBehaviour;
    }

    protected Object readResolve() {
        Base64Variant valueOf = Base64Variants.valueOf(this._name);
        boolean z4 = this._writePadding;
        boolean z5 = valueOf._writePadding;
        return (z4 == z5 && this._paddingChar == valueOf._paddingChar && this._paddingReadBehaviour == valueOf._paddingReadBehaviour && this._maxLineLength == valueOf._maxLineLength && z4 == z5) ? valueOf : new Base64Variant(valueOf, this._name, z4, this._paddingChar, this._paddingReadBehaviour, this._maxLineLength);
    }

    public boolean requiresPaddingOnRead() {
        return this._paddingReadBehaviour == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public String toString() {
        return this._name;
    }

    protected String unexpectedPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", getName());
    }

    public boolean usesPadding() {
        return this._writePadding;
    }

    public boolean usesPaddingChar(char c5) {
        return c5 == this._paddingChar;
    }

    public Base64Variant withPaddingAllowed() {
        return withReadPadding(PaddingReadBehaviour.PADDING_ALLOWED);
    }

    public Base64Variant withPaddingForbidden() {
        return withReadPadding(PaddingReadBehaviour.PADDING_FORBIDDEN);
    }

    public Base64Variant withPaddingRequired() {
        return withReadPadding(PaddingReadBehaviour.PADDING_REQUIRED);
    }

    public Base64Variant withReadPadding(PaddingReadBehaviour paddingReadBehaviour) {
        return paddingReadBehaviour == this._paddingReadBehaviour ? this : new Base64Variant(this, paddingReadBehaviour);
    }

    public Base64Variant withWritePadding(boolean z4) {
        return z4 == this._writePadding ? this : new Base64Variant(this, this._name, z4, this._paddingChar, this._maxLineLength);
    }

    public int decodeBase64Char(int i4) {
        if (i4 <= 127) {
            return this._asciiToBase64[i4];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z4) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z4) {
            sb.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i4 = 0;
        int i5 = length - 3;
        while (i4 <= i5) {
            int i6 = i4 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            encodeBase64Chunk(sb, (((bArr[i4] << 8) | (bArr[i6] & 255)) << 8) | (bArr[i7] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append(TokenParser.ESCAPE);
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i4 = i8;
        }
        int i9 = length - i4;
        if (i9 > 0) {
            int i10 = i4 + 1;
            int i11 = bArr[i4] << 16;
            if (i9 == 2) {
                i11 |= (bArr[i10] & 255) << 8;
            }
            encodeBase64Partial(sb, i11, i9);
        }
        if (z4) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public boolean usesPaddingChar(int i4) {
        return i4 == this._paddingChar;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) throws IllegalArgumentException {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt > ' ') {
                int decodeBase64Char = decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(charAt, 0, null);
                }
                if (i5 >= length) {
                    _reportBase64EOF();
                }
                int i6 = i5 + 1;
                char charAt2 = str.charAt(i5);
                int decodeBase64Char2 = decodeBase64Char(charAt2);
                if (decodeBase64Char2 < 0) {
                    _reportInvalidBase64(charAt2, 1, null);
                }
                int i7 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (i6 >= length) {
                    if (!requiresPaddingOnRead()) {
                        byteArrayBuilder.append(i7 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i8 = i6 + 1;
                char charAt3 = str.charAt(i6);
                int decodeBase64Char3 = decodeBase64Char(charAt3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        _reportInvalidBase64(charAt3, 2, null);
                    }
                    if (!acceptsPaddingOnRead()) {
                        _reportBase64UnexpectedPadding();
                    }
                    if (i8 >= length) {
                        _reportBase64EOF();
                    }
                    i4 = i8 + 1;
                    char charAt4 = str.charAt(i8);
                    if (!usesPaddingChar(charAt4)) {
                        _reportInvalidBase64(charAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                    }
                    byteArrayBuilder.append(i7 >> 4);
                } else {
                    int i9 = (i7 << 6) | decodeBase64Char3;
                    if (i8 >= length) {
                        if (!requiresPaddingOnRead()) {
                            byteArrayBuilder.appendTwoBytes(i9 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i5 = i8 + 1;
                    char charAt5 = str.charAt(i8);
                    int decodeBase64Char4 = decodeBase64Char(charAt5);
                    if (decodeBase64Char4 < 0) {
                        if (decodeBase64Char4 != -2) {
                            _reportInvalidBase64(charAt5, 3, null);
                        }
                        if (!acceptsPaddingOnRead()) {
                            _reportBase64UnexpectedPadding();
                        }
                        byteArrayBuilder.appendTwoBytes(i9 >> 2);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i9 << 6) | decodeBase64Char4);
                    }
                }
            }
            i4 = i5;
        }
    }

    public void encodeBase64Chunk(StringBuilder sb, int i4) {
        sb.append(this._base64ToAsciiC[(i4 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i4 >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i4 >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i4 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb, int i4, int i5) {
        sb.append(this._base64ToAsciiC[(i4 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i4 >> 12) & 63]);
        if (usesPadding()) {
            sb.append(i5 == 2 ? this._base64ToAsciiC[(i4 >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i5 == 2) {
            sb.append(this._base64ToAsciiC[(i4 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i4, byte[] bArr, int i5) {
        int i6 = i5 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i5] = bArr2[(i4 >> 18) & 63];
        int i7 = i6 + 1;
        bArr[i6] = bArr2[(i4 >> 12) & 63];
        int i8 = i7 + 1;
        bArr[i7] = bArr2[(i4 >> 6) & 63];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[i4 & 63];
        return i9;
    }

    public int encodeBase64Partial(int i4, int i5, byte[] bArr, int i6) {
        int i7 = i6 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i6] = bArr2[(i4 >> 18) & 63];
        int i8 = i7 + 1;
        bArr[i7] = bArr2[(i4 >> 12) & 63];
        if (!usesPadding()) {
            if (i5 == 2) {
                int i9 = i8 + 1;
                bArr[i8] = this._base64ToAsciiB[(i4 >> 6) & 63];
                return i9;
            }
            return i8;
        }
        byte b5 = (byte) this._paddingChar;
        int i10 = i8 + 1;
        bArr[i8] = i5 == 2 ? this._base64ToAsciiB[(i4 >> 6) & 63] : b5;
        int i11 = i10 + 1;
        bArr[i10] = b5;
        return i11;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i4) {
        this(base64Variant, str, base64Variant._writePadding, base64Variant._paddingChar, i4);
    }

    public String encode(byte[] bArr, boolean z4, String str) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z4) {
            sb.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i4 = 0;
        int i5 = length - 3;
        while (i4 <= i5) {
            int i6 = i4 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            encodeBase64Chunk(sb, (((bArr[i4] << 8) | (bArr[i6] & 255)) << 8) | (bArr[i7] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append(str);
                maxLineLength = getMaxLineLength() >> 2;
            }
            i4 = i8;
        }
        int i9 = length - i4;
        if (i9 > 0) {
            int i10 = i4 + 1;
            int i11 = bArr[i4] << 16;
            if (i9 == 2) {
                i11 |= (bArr[i10] & 255) << 8;
            }
            encodeBase64Partial(sb, i11, i9);
        }
        if (z4) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z4, char c5, int i4) {
        this(base64Variant, str, z4, c5, base64Variant._paddingReadBehaviour, i4);
    }

    private Base64Variant(Base64Variant base64Variant, String str, boolean z4, char c5, PaddingReadBehaviour paddingReadBehaviour, int i4) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z4;
        this._paddingChar = c5;
        this._maxLineLength = i4;
        this._paddingReadBehaviour = paddingReadBehaviour;
    }

    private Base64Variant(Base64Variant base64Variant, PaddingReadBehaviour paddingReadBehaviour) {
        this(base64Variant, base64Variant._name, base64Variant._writePadding, base64Variant._paddingChar, paddingReadBehaviour, base64Variant._maxLineLength);
    }
}
