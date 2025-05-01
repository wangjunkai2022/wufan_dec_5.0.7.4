package com.fasterxml.jackson.core.json.async;

import com.android.dx.io.Opcodes;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.papa91.arc.ext.Log;
import com.tencent.bugly.Bugly;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public class NonBlockingJsonParser extends NonBlockingJsonParserBase implements ByteArrayFeeder {
    protected byte[] _inputBuffer;
    protected int _origBufferLen;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public NonBlockingJsonParser(IOContext iOContext, int i4, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i4, byteQuadsCanonicalizer);
        this._inputBuffer = ParserMinimalBase.NO_BYTES;
    }

    private final int _decodeCharEscape() throws IOException {
        if (this._inputEnd - this._inputPtr < 5) {
            return _decodeSplitEscaped(0, -1);
        }
        return _decodeFastCharEscape();
    }

    private final int _decodeFastCharEscape() throws IOException {
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b5 = bArr[i4];
        if (b5 == 34 || b5 == 47 || b5 == 92) {
            return (char) b5;
        }
        if (b5 != 98) {
            if (b5 != 102) {
                if (b5 != 110) {
                    if (b5 != 114) {
                        if (b5 != 116) {
                            if (b5 != 117) {
                                return _handleUnrecognizedCharacterEscape((char) b5);
                            }
                            this._inputPtr = i5 + 1;
                            byte b6 = bArr[i5];
                            int charToHex = CharTypes.charToHex(b6);
                            if (charToHex >= 0) {
                                byte[] bArr2 = this._inputBuffer;
                                int i6 = this._inputPtr;
                                this._inputPtr = i6 + 1;
                                b6 = bArr2[i6];
                                int charToHex2 = CharTypes.charToHex(b6);
                                if (charToHex2 >= 0) {
                                    int i7 = (charToHex << 4) | charToHex2;
                                    byte[] bArr3 = this._inputBuffer;
                                    int i8 = this._inputPtr;
                                    this._inputPtr = i8 + 1;
                                    byte b7 = bArr3[i8];
                                    int charToHex3 = CharTypes.charToHex(b7);
                                    if (charToHex3 >= 0) {
                                        int i9 = (i7 << 4) | charToHex3;
                                        byte[] bArr4 = this._inputBuffer;
                                        int i10 = this._inputPtr;
                                        this._inputPtr = i10 + 1;
                                        b7 = bArr4[i10];
                                        int charToHex4 = CharTypes.charToHex(b7);
                                        if (charToHex4 >= 0) {
                                            return (i9 << 4) | charToHex4;
                                        }
                                    }
                                    b6 = b7;
                                }
                            }
                            _reportUnexpectedChar(b6 & 255, "expected a hex-digit for character escape sequence");
                            return -1;
                        }
                        return 9;
                    }
                    return 13;
                }
                return 10;
            }
            return 12;
        }
        return 8;
    }

    private int _decodeSplitEscaped(int i4, int i5) throws IOException {
        int i6 = this._inputPtr;
        int i7 = this._inputEnd;
        if (i6 >= i7) {
            this._quoted32 = i4;
            this._quotedDigits = i5;
            return -1;
        }
        byte[] bArr = this._inputBuffer;
        int i8 = i6 + 1;
        this._inputPtr = i8;
        byte b5 = bArr[i6];
        if (i5 == -1) {
            if (b5 == 34 || b5 == 47 || b5 == 92) {
                return b5;
            }
            if (b5 == 98) {
                return 8;
            }
            if (b5 == 102) {
                return 12;
            }
            if (b5 == 110) {
                return 10;
            }
            if (b5 == 114) {
                return 13;
            }
            if (b5 == 116) {
                return 9;
            }
            if (b5 != 117) {
                return _handleUnrecognizedCharacterEscape((char) b5);
            }
            if (i8 >= i7) {
                this._quotedDigits = 0;
                this._quoted32 = 0;
                return -1;
            }
            this._inputPtr = i8 + 1;
            b5 = bArr[i8];
            i5 = 0;
        }
        while (true) {
            int i9 = b5 & 255;
            int charToHex = CharTypes.charToHex(i9);
            if (charToHex < 0) {
                _reportUnexpectedChar(i9 & 255, "expected a hex-digit for character escape sequence");
            }
            i4 = (i4 << 4) | charToHex;
            i5++;
            if (i5 == 4) {
                return i4;
            }
            int i10 = this._inputPtr;
            if (i10 >= this._inputEnd) {
                this._quotedDigits = i5;
                this._quoted32 = i4;
                return -1;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i10 + 1;
            b5 = bArr2[i10];
        }
    }

    private final boolean _decodeSplitMultiByte(int i4, int i5, boolean z4) throws IOException {
        if (i5 == 1) {
            int _decodeSplitEscaped = _decodeSplitEscaped(0, -1);
            if (_decodeSplitEscaped < 0) {
                this._minorState = 41;
                return false;
            }
            this._textBuffer.append((char) _decodeSplitEscaped);
            return true;
        } else if (i5 == 2) {
            if (z4) {
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                this._textBuffer.append((char) _decodeUTF8_2(i4, bArr[i6]));
                return true;
            }
            this._minorState = 42;
            this._pending32 = i4;
            return false;
        } else if (i5 == 3) {
            int i7 = i4 & 15;
            if (z4) {
                byte[] bArr2 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                return _decodeSplitUTF8_3(i7, 1, bArr2[i8]);
            }
            this._minorState = 43;
            this._pending32 = i7;
            this._pendingBytes = 1;
            return false;
        } else if (i5 != 4) {
            if (i4 < 32) {
                _throwUnquotedSpace(i4, "string value");
            } else {
                _reportInvalidChar(i4);
            }
            this._textBuffer.append((char) i4);
            return true;
        } else {
            int i9 = i4 & 7;
            if (z4) {
                byte[] bArr3 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                return _decodeSplitUTF8_4(i9, 1, bArr3[i10]);
            }
            this._pending32 = i9;
            this._pendingBytes = 1;
            this._minorState = 44;
            return false;
        }
    }

    private final boolean _decodeSplitUTF8_3(int i4, int i5, int i6) throws IOException {
        if (i5 == 1) {
            if ((i6 & 192) != 128) {
                _reportInvalidOther(i6 & 255, this._inputPtr);
            }
            i4 = (i4 << 6) | (i6 & 63);
            int i7 = this._inputPtr;
            if (i7 >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i4;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i7 + 1;
            i6 = bArr[i7];
        }
        if ((i6 & 192) != 128) {
            _reportInvalidOther(i6 & 255, this._inputPtr);
        }
        this._textBuffer.append((char) ((i4 << 6) | (i6 & 63)));
        return true;
    }

    private final boolean _decodeSplitUTF8_4(int i4, int i5, int i6) throws IOException {
        if (i5 == 1) {
            if ((i6 & 192) != 128) {
                _reportInvalidOther(i6 & 255, this._inputPtr);
            }
            i4 = (i4 << 6) | (i6 & 63);
            int i7 = this._inputPtr;
            if (i7 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i4;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i7 + 1;
            i6 = bArr[i7];
            i5 = 2;
        }
        if (i5 == 2) {
            if ((i6 & 192) != 128) {
                _reportInvalidOther(i6 & 255, this._inputPtr);
            }
            i4 = (i4 << 6) | (i6 & 63);
            int i8 = this._inputPtr;
            if (i8 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i4;
                this._pendingBytes = 3;
                return false;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i8 + 1;
            i6 = bArr2[i8];
        }
        if ((i6 & 192) != 128) {
            _reportInvalidOther(i6 & 255, this._inputPtr);
        }
        int i9 = ((i4 << 6) | (i6 & 63)) - 65536;
        this._textBuffer.append((char) (55296 | (i9 >> 10)));
        this._textBuffer.append((char) ((i9 & Log.LogWrapper.MAX_MSG_LEN) | 56320));
        return true;
    }

    private final int _decodeUTF8_2(int i4, int i5) throws IOException {
        if ((i5 & 192) != 128) {
            _reportInvalidOther(i5 & 255, this._inputPtr);
        }
        return ((i4 & 31) << 6) | (i5 & 63);
    }

    private final int _decodeUTF8_3(int i4, int i5, int i6) throws IOException {
        int i7 = i4 & 15;
        if ((i5 & 192) != 128) {
            _reportInvalidOther(i5 & 255, this._inputPtr);
        }
        int i8 = (i7 << 6) | (i5 & 63);
        if ((i6 & 192) != 128) {
            _reportInvalidOther(i6 & 255, this._inputPtr);
        }
        return (i8 << 6) | (i6 & 63);
    }

    private final int _decodeUTF8_4(int i4, int i5, int i6, int i7) throws IOException {
        if ((i5 & 192) != 128) {
            _reportInvalidOther(i5 & 255, this._inputPtr);
        }
        int i8 = ((i4 & 7) << 6) | (i5 & 63);
        if ((i6 & 192) != 128) {
            _reportInvalidOther(i6 & 255, this._inputPtr);
        }
        int i9 = (i8 << 6) | (i6 & 63);
        if ((i7 & 192) != 128) {
            _reportInvalidOther(i7 & 255, this._inputPtr);
        }
        return ((i9 << 6) | (i7 & 63)) - 65536;
    }

    private final String _fastParseName() throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        int i6 = bArr[i4] & 255;
        if (iArr[i6] != 0) {
            if (i6 == 34) {
                this._inputPtr = i5;
                return "";
            }
            return null;
        }
        int i7 = i5 + 1;
        int i8 = bArr[i5] & 255;
        if (iArr[i8] != 0) {
            if (i8 == 34) {
                this._inputPtr = i7;
                return _findName(i6, 1);
            }
            return null;
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i7 + 1;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 == 34) {
                this._inputPtr = i10;
                return _findName(i9, 2);
            }
            return null;
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i10 + 1;
        int i14 = bArr[i10] & 255;
        if (iArr[i14] != 0) {
            if (i14 == 34) {
                this._inputPtr = i13;
                return _findName(i12, 3);
            }
            return null;
        }
        int i15 = (i12 << 8) | i14;
        int i16 = i13 + 1;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] == 0) {
            this._quad1 = i15;
            return _parseMediumName(i16, i17);
        } else if (i17 == 34) {
            this._inputPtr = i16;
            return _findName(i15, 4);
        } else {
            return null;
        }
    }

    private JsonToken _finishAposName(int i4, int i5, int i6) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i7 = this._inputPtr;
            if (i7 >= this._inputEnd) {
                this._quadLength = i4;
                this._pending32 = i5;
                this._pendingBytes = i6;
                this._minorState = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i7 + 1;
            int i8 = bArr[i7] & 255;
            if (i8 == 39) {
                if (i6 > 0) {
                    if (i4 >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i4] = NonBlockingJsonParserBase._padLastQuad(i5, i6);
                    i4++;
                } else if (i4 == 0) {
                    return _fieldComplete("");
                }
                String findName = this._symbols.findName(iArr, i4);
                if (findName == null) {
                    findName = _addName(iArr, i4, i6);
                }
                return _fieldComplete(findName);
            }
            if (i8 != 34 && iArr2[i8] != 0) {
                if (i8 != 92) {
                    _throwUnquotedSpace(i8, "name");
                } else {
                    i8 = _decodeCharEscape();
                    if (i8 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 9;
                        this._quadLength = i4;
                        this._pending32 = i5;
                        this._pendingBytes = i6;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i8 > 127) {
                    int i9 = 0;
                    if (i6 >= 4) {
                        if (i4 >= iArr.length) {
                            int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = growArrayBy;
                            iArr = growArrayBy;
                        }
                        iArr[i4] = i5;
                        i4++;
                        i5 = 0;
                        i6 = 0;
                    }
                    if (i8 < 2048) {
                        i5 = (i5 << 8) | (i8 >> 6) | 192;
                        i6++;
                    } else {
                        int i10 = (i5 << 8) | (i8 >> 12) | Opcodes.SHL_INT_LIT8;
                        int i11 = i6 + 1;
                        if (i11 >= 4) {
                            if (i4 >= iArr.length) {
                                int[] growArrayBy2 = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = growArrayBy2;
                                iArr = growArrayBy2;
                            }
                            iArr[i4] = i10;
                            i4++;
                            i11 = 0;
                        } else {
                            i9 = i10;
                        }
                        i5 = (i9 << 8) | ((i8 >> 6) & 63) | 128;
                        i6 = i11 + 1;
                    }
                    i8 = (i8 & 63) | 128;
                }
            }
            if (i6 < 4) {
                i6++;
                i5 = (i5 << 8) | i8;
            } else {
                if (i4 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i4] = i5;
                i4++;
                i5 = i8;
                i6 = 1;
            }
        }
    }

    private final JsonToken _finishAposString() throws IOException {
        int i4;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i5 = this._inputPtr;
        int i6 = this._inputEnd - 5;
        while (i5 < this._inputEnd) {
            int i7 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i5);
            while (true) {
                if (i5 < min) {
                    int i8 = i5 + 1;
                    int i9 = bArr[i5] & 255;
                    if (iArr[i9] == 0 || i9 == 34) {
                        if (i9 == 39) {
                            this._inputPtr = i8;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        }
                        bufferWithoutReset[currentSegmentSize] = (char) i9;
                        i5 = i8;
                        currentSegmentSize++;
                    } else if (i8 >= i6) {
                        this._inputPtr = i8;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        if (!_decodeSplitMultiByte(i9, iArr[i9], i8 < this._inputEnd)) {
                            this._minorStateAfterSplit = 45;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this._currToken = jsonToken;
                            return jsonToken;
                        }
                        bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                        currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        i5 = this._inputPtr;
                    } else {
                        int i10 = iArr[i9];
                        if (i10 == 1) {
                            this._inputPtr = i8;
                            i9 = _decodeFastCharEscape();
                            i4 = this._inputPtr;
                        } else if (i10 == 2) {
                            i9 = _decodeUTF8_2(i9, this._inputBuffer[i8]);
                            i4 = i8 + 1;
                        } else if (i10 == 3) {
                            byte[] bArr2 = this._inputBuffer;
                            int i11 = i8 + 1;
                            i9 = _decodeUTF8_3(i9, bArr2[i8], bArr2[i11]);
                            i4 = i11 + 1;
                        } else if (i10 != 4) {
                            if (i9 < 32) {
                                _throwUnquotedSpace(i9, "string value");
                            } else {
                                _reportInvalidChar(i9);
                            }
                            i4 = i8;
                        } else {
                            byte[] bArr3 = this._inputBuffer;
                            int i12 = i8 + 1;
                            int i13 = i12 + 1;
                            int i14 = i13 + 1;
                            int _decodeUTF8_4 = _decodeUTF8_4(i9, bArr3[i8], bArr3[i12], bArr3[i13]);
                            int i15 = currentSegmentSize + 1;
                            bufferWithoutReset[currentSegmentSize] = (char) (55296 | (_decodeUTF8_4 >> 10));
                            if (i15 >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                currentSegmentSize = 0;
                            } else {
                                currentSegmentSize = i15;
                            }
                            i9 = (_decodeUTF8_4 & Log.LogWrapper.MAX_MSG_LEN) | 56320;
                            i4 = i14;
                        }
                        if (currentSegmentSize >= bufferWithoutReset.length) {
                            bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                        } else {
                            i7 = currentSegmentSize;
                        }
                        currentSegmentSize = i7 + 1;
                        bufferWithoutReset[i7] = (char) i9;
                        i5 = i4;
                    }
                }
            }
        }
        this._inputPtr = i5;
        this._minorState = 45;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final JsonToken _finishBOM(int i4) throws IOException {
        while (true) {
            int i5 = this._inputPtr;
            if (i5 < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i5 + 1;
                int i6 = bArr[i5] & 255;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            this._currInputProcessed -= 3;
                            return _startDocument(i6);
                        }
                    } else if (i6 != 191) {
                        _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i6));
                    }
                } else if (i6 != 187) {
                    _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i6));
                }
                i4++;
            } else {
                this._pending32 = i4;
                this._minorState = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
        }
    }

    private final JsonToken _finishCComment(int i4, boolean z4) throws IOException {
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = z4 ? 52 : 53;
                this._pending32 = i4;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            int i7 = bArr[i5] & 255;
            if (i7 < 32) {
                if (i7 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i6;
                } else if (i7 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i6;
                } else if (i7 != 9) {
                    _throwInvalidSpace(i7);
                }
            } else if (i7 == 42) {
                z4 = true;
            } else if (i7 == 47 && z4) {
                return _startAfterComment(i4);
            }
            z4 = false;
        }
    }

    private final JsonToken _finishCppComment(int i4) throws IOException {
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 54;
                this._pending32 = i4;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            int i7 = bArr[i5] & 255;
            if (i7 < 32) {
                if (i7 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i6;
                    break;
                } else if (i7 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i6;
                    break;
                } else if (i7 != 9) {
                    _throwInvalidSpace(i7);
                }
            }
        }
        return _startAfterComment(i4);
    }

    private final JsonToken _finishHashComment(int i4) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 55;
                this._pending32 = i4;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            int i7 = bArr[i5] & 255;
            if (i7 < 32) {
                if (i7 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i6;
                    break;
                } else if (i7 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i6;
                    break;
                } else if (i7 != 9) {
                    _throwInvalidSpace(i7);
                }
            }
        }
        return _startAfterComment(i4);
    }

    private final JsonToken _finishRegularString() throws IOException {
        int i4;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i5 = this._inputPtr;
        int i6 = this._inputEnd - 5;
        while (i5 < this._inputEnd) {
            int i7 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i5);
            while (true) {
                if (i5 < min) {
                    int i8 = i5 + 1;
                    int i9 = bArr[i5] & 255;
                    if (iArr[i9] == 0) {
                        bufferWithoutReset[currentSegmentSize] = (char) i9;
                        i5 = i8;
                        currentSegmentSize++;
                    } else if (i9 == 34) {
                        this._inputPtr = i8;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return _valueComplete(JsonToken.VALUE_STRING);
                    } else if (i8 >= i6) {
                        this._inputPtr = i8;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        if (!_decodeSplitMultiByte(i9, iArr[i9], i8 < this._inputEnd)) {
                            this._minorStateAfterSplit = 40;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this._currToken = jsonToken;
                            return jsonToken;
                        }
                        bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                        currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        i5 = this._inputPtr;
                    } else {
                        int i10 = iArr[i9];
                        if (i10 == 1) {
                            this._inputPtr = i8;
                            i9 = _decodeFastCharEscape();
                            i4 = this._inputPtr;
                        } else if (i10 == 2) {
                            i9 = _decodeUTF8_2(i9, this._inputBuffer[i8]);
                            i4 = i8 + 1;
                        } else if (i10 == 3) {
                            byte[] bArr2 = this._inputBuffer;
                            int i11 = i8 + 1;
                            i9 = _decodeUTF8_3(i9, bArr2[i8], bArr2[i11]);
                            i4 = i11 + 1;
                        } else if (i10 != 4) {
                            if (i9 < 32) {
                                _throwUnquotedSpace(i9, "string value");
                            } else {
                                _reportInvalidChar(i9);
                            }
                            i4 = i8;
                        } else {
                            byte[] bArr3 = this._inputBuffer;
                            int i12 = i8 + 1;
                            int i13 = i12 + 1;
                            int i14 = i13 + 1;
                            int _decodeUTF8_4 = _decodeUTF8_4(i9, bArr3[i8], bArr3[i12], bArr3[i13]);
                            int i15 = currentSegmentSize + 1;
                            bufferWithoutReset[currentSegmentSize] = (char) (55296 | (_decodeUTF8_4 >> 10));
                            if (i15 >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                currentSegmentSize = 0;
                            } else {
                                currentSegmentSize = i15;
                            }
                            i9 = (_decodeUTF8_4 & Log.LogWrapper.MAX_MSG_LEN) | 56320;
                            i4 = i14;
                        }
                        if (currentSegmentSize >= bufferWithoutReset.length) {
                            bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                        } else {
                            i7 = currentSegmentSize;
                        }
                        currentSegmentSize = i7 + 1;
                        bufferWithoutReset[i7] = (char) i9;
                        i5 = i4;
                    }
                }
            }
        }
        this._inputPtr = i5;
        this._minorState = 40;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private JsonToken _finishUnquotedName(int i4, int i5, int i6) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        while (true) {
            int i7 = this._inputPtr;
            if (i7 >= this._inputEnd) {
                this._quadLength = i4;
                this._pending32 = i5;
                this._pendingBytes = i6;
                this._minorState = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            int i8 = this._inputBuffer[i7] & 255;
            if (inputCodeUtf8JsNames[i8] != 0) {
                if (i6 > 0) {
                    if (i4 >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i4] = i5;
                    i4++;
                }
                String findName = this._symbols.findName(iArr, i4);
                if (findName == null) {
                    findName = _addName(iArr, i4, i6);
                }
                return _fieldComplete(findName);
            }
            this._inputPtr = i7 + 1;
            if (i6 < 4) {
                i6++;
                i5 = (i5 << 8) | i8;
            } else {
                if (i4 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i4] = i5;
                i4++;
                i5 = i8;
                i6 = 1;
            }
        }
    }

    private JsonToken _handleOddName(int i4) throws IOException {
        if (i4 != 35) {
            if (i4 != 39) {
                if (i4 == 47) {
                    return _startSlashComment(4);
                }
                if (i4 == 93) {
                    return _closeArrayScope();
                }
            } else if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _finishAposName(0, 0, 0);
            }
        } else if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) != 0) {
            return _finishHashComment(4);
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) i4, "was expecting double-quote to start field name");
        }
        if (CharTypes.getInputCodeUtf8JsNames()[i4] != 0) {
            _reportUnexpectedChar(i4, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return _finishUnquotedName(0, i4, 1);
    }

    private final JsonToken _parseEscapedName(int i4, int i5, int i6) throws IOException {
        int i7;
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i8 = this._inputPtr;
            if (i8 >= this._inputEnd) {
                this._quadLength = i4;
                this._pending32 = i5;
                this._pendingBytes = i6;
                this._minorState = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i8 + 1;
            int i9 = bArr[i8] & 255;
            if (iArr2[i9] == 0) {
                if (i6 < 4) {
                    i6++;
                    i5 = (i5 << 8) | i9;
                } else {
                    if (i4 >= iArr.length) {
                        int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = growArrayBy;
                        iArr = growArrayBy;
                    }
                    i7 = i4 + 1;
                    iArr[i4] = i5;
                    i4 = i7;
                    i5 = i9;
                    i6 = 1;
                }
            } else if (i9 == 34) {
                if (i6 > 0) {
                    if (i4 >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i4] = NonBlockingJsonParserBase._padLastQuad(i5, i6);
                    i4++;
                } else if (i4 == 0) {
                    return _fieldComplete("");
                }
                String findName = this._symbols.findName(iArr, i4);
                if (findName == null) {
                    findName = _addName(iArr, i4, i6);
                }
                return _fieldComplete(findName);
            } else {
                if (i9 != 92) {
                    _throwUnquotedSpace(i9, "name");
                } else {
                    i9 = _decodeCharEscape();
                    if (i9 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i4;
                        this._pending32 = i5;
                        this._pendingBytes = i6;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i4 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                if (i9 > 127) {
                    int i10 = 0;
                    if (i6 >= 4) {
                        iArr[i4] = i5;
                        i4++;
                        i5 = 0;
                        i6 = 0;
                    }
                    if (i9 < 2048) {
                        i5 = (i5 << 8) | (i9 >> 6) | 192;
                        i6++;
                    } else {
                        int i11 = (i5 << 8) | (i9 >> 12) | Opcodes.SHL_INT_LIT8;
                        int i12 = i6 + 1;
                        if (i12 >= 4) {
                            iArr[i4] = i11;
                            i4++;
                            i12 = 0;
                        } else {
                            i10 = i11;
                        }
                        i5 = (i10 << 8) | ((i9 >> 6) & 63) | 128;
                        i6 = i12 + 1;
                    }
                    i9 = (i9 & 63) | 128;
                }
                if (i6 < 4) {
                    i6++;
                    i5 = (i5 << 8) | i9;
                } else {
                    i7 = i4 + 1;
                    iArr[i4] = i5;
                    i4 = i7;
                    i5 = i9;
                    i6 = 1;
                }
            }
        }
    }

    private final String _parseMediumName(int i4, int i5) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i6 = i4 + 1;
        int i7 = bArr[i4] & 255;
        if (iArr[i7] != 0) {
            if (i7 == 34) {
                this._inputPtr = i6;
                return _findName(this._quad1, i5, 1);
            }
            return null;
        }
        int i8 = i7 | (i5 << 8);
        int i9 = i6 + 1;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            if (i10 == 34) {
                this._inputPtr = i9;
                return _findName(this._quad1, i8, 2);
            }
            return null;
        }
        int i11 = (i8 << 8) | i10;
        int i12 = i9 + 1;
        int i13 = bArr[i9] & 255;
        if (iArr[i13] != 0) {
            if (i13 == 34) {
                this._inputPtr = i12;
                return _findName(this._quad1, i11, 3);
            }
            return null;
        }
        int i14 = (i11 << 8) | i13;
        int i15 = i12 + 1;
        int i16 = bArr[i12] & 255;
        if (iArr[i16] == 0) {
            return _parseMediumName2(i15, i16, i14);
        }
        if (i16 == 34) {
            this._inputPtr = i15;
            return _findName(this._quad1, i14, 4);
        }
        return null;
    }

    private final String _parseMediumName2(int i4, int i5, int i6) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i7 = i4 + 1;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 == 34) {
                this._inputPtr = i7;
                return _findName(this._quad1, i6, i5, 1);
            }
            return null;
        }
        int i9 = i8 | (i5 << 8);
        int i10 = i7 + 1;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 == 34) {
                this._inputPtr = i10;
                return _findName(this._quad1, i6, i9, 2);
            }
            return null;
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i10 + 1;
        int i14 = bArr[i10] & 255;
        if (iArr[i14] != 0) {
            if (i14 == 34) {
                this._inputPtr = i13;
                return _findName(this._quad1, i6, i12, 3);
            }
            return null;
        }
        int i15 = (i12 << 8) | i14;
        int i16 = i13 + 1;
        if ((bArr[i13] & 255) == 34) {
            this._inputPtr = i16;
            return _findName(this._quad1, i6, i15, 4);
        }
        return null;
    }

    private final int _skipWS(int i4) throws IOException {
        do {
            if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._currToken = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i4 = bArr[i5] & 255;
        } while (i4 <= 32);
        return i4;
    }

    private final JsonToken _startAfterComment(int i4) throws IOException {
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._minorState = i4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i5 + 1;
        int i6 = bArr[i5] & 255;
        if (i4 != 4) {
            if (i4 != 5) {
                switch (i4) {
                    case 12:
                        return _startValue(i6);
                    case 13:
                        return _startValueExpectComma(i6);
                    case 14:
                        return _startValueExpectColon(i6);
                    case 15:
                        return _startValueAfterComma(i6);
                    default:
                        VersionUtil.throwInternal();
                        return null;
                }
            }
            return _startFieldNameAfterComma(i6);
        }
        return _startFieldName(i6);
    }

    private final JsonToken _startDocument(int i4) throws IOException {
        int i5 = i4 & 255;
        if (i5 == 239 && this._minorState != 1) {
            return _finishBOM(1);
        }
        while (i5 <= 32) {
            if (i5 != 32) {
                if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i5 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i5 != 9) {
                    _throwInvalidSpace(i5);
                }
            }
            int i6 = this._inputPtr;
            if (i6 >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                if (this._endOfInput) {
                    return _eofAsNextToken();
                }
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i6 + 1;
            i5 = bArr[i6] & 255;
        }
        return _startValue(i5);
    }

    private final JsonToken _startFieldName(int i4) throws IOException {
        String _fastParseName;
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i4 != 34) {
            if (i4 == 125) {
                return _closeObjectScope();
            }
            return _handleOddName(i4);
        } else if (this._inputPtr + 13 <= this._inputEnd && (_fastParseName = _fastParseName()) != null) {
            return _fieldComplete(_fastParseName);
        } else {
            return _parseEscapedName(0, 0, 0);
        }
    }

    private final JsonToken _startFieldNameAfterComma(int i4) throws IOException {
        String _fastParseName;
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 5;
            return this._currToken;
        }
        if (i4 != 44) {
            if (i4 == 125) {
                return _closeObjectScope();
            }
            if (i4 == 35) {
                return _finishHashComment(5);
            }
            if (i4 == 47) {
                return _startSlashComment(5);
            }
            _reportUnexpectedChar(i4, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._minorState = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i6 = this._inputBuffer[i5];
        this._inputPtr = i5 + 1;
        if (i6 <= 32 && (i6 = _skipWS(i6)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i6 != 34) {
            if (i6 == 125 && (this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                return _closeObjectScope();
            }
            return _handleOddName(i6);
        } else if (this._inputPtr + 13 <= this._inputEnd && (_fastParseName = _fastParseName()) != null) {
            return _fieldComplete(_fastParseName);
        } else {
            return _parseEscapedName(0, 0, 0);
        }
    }

    private final JsonToken _startSlashComment(int i4) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._pending32 = i4;
            this._minorState = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 == 42) {
            return _finishCComment(i4, false);
        }
        if (b5 == 47) {
            return _finishCppComment(i4);
        }
        _reportUnexpectedChar(b5 & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final JsonToken _startValue(int i4) throws IOException {
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        this._parsingContext.expectComma();
        if (i4 == 34) {
            return _startString();
        }
        if (i4 != 35) {
            if (i4 != 91) {
                if (i4 != 93) {
                    if (i4 != 102) {
                        if (i4 != 110) {
                            if (i4 != 116) {
                                if (i4 != 123) {
                                    if (i4 != 125) {
                                        switch (i4) {
                                            case 45:
                                                return _startNegativeNumber();
                                            case 46:
                                                if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                                                    return _startFloatThatStartsWithPeriod();
                                                }
                                                break;
                                            case 47:
                                                return _startSlashComment(12);
                                            case 48:
                                                return _startNumberLeadingZero();
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                return _startPositiveNumber(i4);
                                        }
                                        return _startUnexpectedValue(false, i4);
                                    }
                                    return _closeObjectScope();
                                }
                                return _startObjectScope();
                            }
                            return _startTrueToken();
                        }
                        return _startNullToken();
                    }
                    return _startFalseToken();
                }
                return _closeArrayScope();
            }
            return _startArrayScope();
        }
        return _finishHashComment(12);
    }

    private final JsonToken _startValueAfterComma(int i4) throws IOException {
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i4 == 34) {
            return _startString();
        }
        if (i4 != 35) {
            if (i4 != 45) {
                if (i4 != 91) {
                    if (i4 != 93) {
                        if (i4 == 102) {
                            return _startFalseToken();
                        }
                        if (i4 == 110) {
                            return _startNullToken();
                        }
                        if (i4 == 116) {
                            return _startTrueToken();
                        }
                        if (i4 == 123) {
                            return _startObjectScope();
                        }
                        if (i4 != 125) {
                            switch (i4) {
                                case 47:
                                    return _startSlashComment(15);
                                case 48:
                                    return _startNumberLeadingZero();
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    return _startPositiveNumber(i4);
                            }
                        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                            return _closeObjectScope();
                        }
                    } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                        return _closeArrayScope();
                    }
                    return _startUnexpectedValue(true, i4);
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return _finishHashComment(15);
    }

    private final JsonToken _startValueExpectColon(int i4) throws IOException {
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 14;
            return this._currToken;
        }
        if (i4 != 58) {
            if (i4 == 47) {
                return _startSlashComment(14);
            }
            if (i4 == 35) {
                return _finishHashComment(14);
            }
            _reportUnexpectedChar(i4, "was expecting a colon to separate field name and value");
        }
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._minorState = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i6 = this._inputBuffer[i5];
        this._inputPtr = i5 + 1;
        if (i6 <= 32 && (i6 = _skipWS(i6)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i6 == 34) {
            return _startString();
        }
        if (i6 != 35) {
            if (i6 != 45) {
                if (i6 != 91) {
                    if (i6 != 102) {
                        if (i6 != 110) {
                            if (i6 != 116) {
                                if (i6 != 123) {
                                    switch (i6) {
                                        case 47:
                                            return _startSlashComment(12);
                                        case 48:
                                            return _startNumberLeadingZero();
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return _startPositiveNumber(i6);
                                        default:
                                            return _startUnexpectedValue(false, i6);
                                    }
                                }
                                return _startObjectScope();
                            }
                            return _startTrueToken();
                        }
                        return _startNullToken();
                    }
                    return _startFalseToken();
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return _finishHashComment(12);
    }

    private final JsonToken _startValueExpectComma(int i4) throws IOException {
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 13;
            return this._currToken;
        }
        if (i4 != 44) {
            if (i4 == 93) {
                return _closeArrayScope();
            }
            if (i4 == 125) {
                return _closeObjectScope();
            }
            if (i4 == 47) {
                return _startSlashComment(13);
            }
            if (i4 == 35) {
                return _finishHashComment(13);
            }
            _reportUnexpectedChar(i4, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        this._parsingContext.expectComma();
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._minorState = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i6 = this._inputBuffer[i5];
        this._inputPtr = i5 + 1;
        if (i6 <= 32 && (i6 = _skipWS(i6)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i6 == 34) {
            return _startString();
        }
        if (i6 != 35) {
            if (i6 != 45) {
                if (i6 != 91) {
                    if (i6 != 93) {
                        if (i6 == 102) {
                            return _startFalseToken();
                        }
                        if (i6 == 110) {
                            return _startNullToken();
                        }
                        if (i6 == 116) {
                            return _startTrueToken();
                        }
                        if (i6 == 123) {
                            return _startObjectScope();
                        }
                        if (i6 != 125) {
                            switch (i6) {
                                case 47:
                                    return _startSlashComment(15);
                                case 48:
                                    return _startNumberLeadingZero();
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    return _startPositiveNumber(i6);
                            }
                        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                            return _closeObjectScope();
                        }
                    } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                        return _closeArrayScope();
                    }
                    return _startUnexpectedValue(true, i6);
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return _finishHashComment(15);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() throws IOException {
        VersionUtil.throwInternal();
        return ' ';
    }

    protected JsonToken _finishErrorToken() throws IOException {
        do {
            int i4 = this._inputPtr;
            if (i4 < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i4 + 1;
                char c5 = (char) bArr[i4];
                if (!Character.isJavaIdentifierPart(c5)) {
                    break;
                }
                this._textBuffer.append(c5);
            } else {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
        } while (this._textBuffer.size() < 256);
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    protected JsonToken _finishErrorTokenWithEOF() throws IOException {
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    protected final JsonToken _finishFieldWithEscape() throws IOException {
        int i4;
        int i5;
        int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
        if (_decodeSplitEscaped < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i6 = this._quadLength;
        int[] iArr = this._quadBuffer;
        if (i6 >= iArr.length) {
            this._quadBuffer = ParserBase.growArrayBy(iArr, 32);
        }
        int i7 = this._pending32;
        int i8 = this._pendingBytes;
        int i9 = 1;
        if (_decodeSplitEscaped > 127) {
            int i10 = 0;
            if (i8 >= 4) {
                int[] iArr2 = this._quadBuffer;
                int i11 = this._quadLength;
                this._quadLength = i11 + 1;
                iArr2[i11] = i7;
                i7 = 0;
                i8 = 0;
            }
            if (_decodeSplitEscaped < 2048) {
                i4 = i7 << 8;
                i5 = (_decodeSplitEscaped >> 6) | 192;
            } else {
                int i12 = (i7 << 8) | (_decodeSplitEscaped >> 12) | Opcodes.SHL_INT_LIT8;
                i8++;
                if (i8 >= 4) {
                    int[] iArr3 = this._quadBuffer;
                    int i13 = this._quadLength;
                    this._quadLength = i13 + 1;
                    iArr3[i13] = i12;
                    i8 = 0;
                } else {
                    i10 = i12;
                }
                i4 = i10 << 8;
                i5 = ((_decodeSplitEscaped >> 6) & 63) | 128;
            }
            i7 = i4 | i5;
            i8++;
            _decodeSplitEscaped = (_decodeSplitEscaped & 63) | 128;
        }
        if (i8 < 4) {
            i9 = 1 + i8;
            _decodeSplitEscaped |= i7 << 8;
        } else {
            int[] iArr4 = this._quadBuffer;
            int i14 = this._quadLength;
            this._quadLength = i14 + 1;
            iArr4[i14] = i7;
        }
        if (this._minorStateAfterSplit == 9) {
            return _finishAposName(this._quadLength, _decodeSplitEscaped, i9);
        }
        return _parseEscapedName(this._quadLength, _decodeSplitEscaped, i9);
    }

    protected JsonToken _finishFloatExponent(boolean z4, int i4) throws IOException {
        if (z4) {
            this._minorState = 32;
            if (i4 == 45 || i4 == 43) {
                this._textBuffer.append((char) i4);
                int i5 = this._inputPtr;
                if (i5 >= this._inputEnd) {
                    this._minorState = 32;
                    this._expLength = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i5 + 1;
                i4 = bArr[i5];
            }
        }
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i6 = this._expLength;
        while (i4 >= 48 && i4 <= 57) {
            i6++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i7 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) i4;
            int i8 = this._inputPtr;
            if (i8 >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i7);
                this._expLength = i6;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i8 + 1;
            i4 = bArr2[i8];
            currentSegmentSize = i7;
        }
        int i9 = i4 & 255;
        if (i6 == 0) {
            reportUnexpectedNumberChar(i9, "Exponent indicator not followed by a digit");
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        this._expLength = i6;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    protected JsonToken _finishFloatFraction() throws IOException {
        byte b5;
        int i4 = this._fractLength;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            byte[] bArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            b5 = bArr[i5];
            if (b5 < 48 || b5 > 57) {
                break;
            }
            i4++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i6 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) b5;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i6);
                this._fractLength = i4;
                return JsonToken.NOT_AVAILABLE;
            }
            currentSegmentSize = i6;
        }
        if (i4 == 0) {
            reportUnexpectedNumberChar(b5, "Decimal point not followed by a digit");
        }
        this._fractLength = i4;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        if (b5 != 101 && b5 != 69) {
            this._inputPtr--;
            this._textBuffer.setCurrentLength(currentSegmentSize);
            this._expLength = 0;
            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
        }
        this._textBuffer.append((char) b5);
        this._expLength = 0;
        int i7 = this._inputPtr;
        if (i7 >= this._inputEnd) {
            this._minorState = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this._minorState = 32;
        byte[] bArr2 = this._inputBuffer;
        this._inputPtr = i7 + 1;
        return _finishFloatExponent(true, bArr2[i7] & 255);
    }

    protected JsonToken _finishKeywordToken(String str, int i4, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._pending32 = i4;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            byte b5 = this._inputBuffer[i5];
            if (i4 == length) {
                if (b5 < 48 || b5 == 93 || b5 == 125) {
                    return _valueComplete(jsonToken);
                }
            } else if (b5 != str.charAt(i4)) {
                break;
            } else {
                i4++;
                this._inputPtr++;
            }
        }
        this._minorState = 50;
        this._textBuffer.resetWithCopy(str, 0, i4);
        return _finishErrorToken();
    }

    protected JsonToken _finishKeywordTokenWithEOF(String str, int i4, JsonToken jsonToken) throws IOException {
        if (i4 == str.length()) {
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._textBuffer.resetWithCopy(str, 0, i4);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r4._minorState = 50;
        r4._textBuffer.resetWithCopy(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        return _finishErrorToken();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _finishNonStdToken(int r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = r4._nonStdToken(r5)
            int r1 = r0.length()
        L8:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L1b
            r4._nonStdTokenType = r5
            r4._pending32 = r6
            r5 = 19
            r4._minorState = r5
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r3 = r4._inputBuffer
            r2 = r3[r2]
            if (r6 != r1) goto L32
            r1 = 48
            if (r2 < r1) goto L2d
            r1 = 93
            if (r2 == r1) goto L2d
            r1 = 125(0x7d, float:1.75E-43)
            if (r2 != r1) goto L38
        L2d:
            com.fasterxml.jackson.core.JsonToken r5 = r4._valueNonStdNumberComplete(r5)
            return r5
        L32:
            char r3 = r0.charAt(r6)
            if (r2 == r3) goto L47
        L38:
            r5 = 50
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r1 = 0
            r5.resetWithCopy(r0, r1, r6)
            com.fasterxml.jackson.core.JsonToken r5 = r4._finishErrorToken()
            return r5
        L47:
            int r6 = r6 + 1
            int r2 = r4._inputPtr
            int r2 = r2 + 1
            r4._inputPtr = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNonStdToken(int, int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _finishNonStdTokenWithEOF(int i4, int i5) throws IOException {
        String _nonStdToken = _nonStdToken(i4);
        if (i5 == _nonStdToken.length()) {
            return _valueNonStdNumberComplete(i4);
        }
        this._textBuffer.resetWithCopy(_nonStdToken, 0, i5);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r4._intLength = r0 + r6;
        r4._textBuffer.setCurrentLength(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _finishNumberIntegralPart(char[] r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4._numberNegative
            if (r0 == 0) goto L6
            r0 = -1
            goto L7
        L6:
            r0 = 0
        L7:
            int r1 = r4._inputPtr
            int r2 = r4._inputEnd
            if (r1 < r2) goto L1b
            r5 = 26
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r2 = r4._inputBuffer
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 48
            if (r2 >= r3) goto L35
            r3 = 46
            if (r2 != r3) goto L42
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4._startFloat(r5, r6, r2)
            return r5
        L35:
            r3 = 57
            if (r2 <= r3) goto L5d
            r3 = 101(0x65, float:1.42E-43)
            if (r2 == r3) goto L51
            r3 = 69
            if (r2 != r3) goto L42
            goto L51
        L42:
            int r0 = r0 + r6
            r4._intLength = r0
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            com.fasterxml.jackson.core.JsonToken r5 = r4._valueComplete(r5)
            return r5
        L51:
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4._startFloat(r5, r6, r2)
            return r5
        L5d:
            int r1 = r1 + 1
            r4._inputPtr = r1
            int r1 = r5.length
            if (r6 < r1) goto L6a
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.expandCurrentSegment()
        L6a:
            int r1 = r6 + 1
            char r2 = (char) r2
            r5[r6] = r2
            r6 = r1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNumberIntegralPart(char[], int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _finishNumberLeadingNegZeroes() throws IOException {
        int i4;
        do {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i4 = bArr[i5] & 255;
            if (i4 < 48) {
                if (i4 == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '-';
                    emptyAndGetCurrentSegment[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 2, i4);
                }
            } else if (i4 > 57) {
                if (i4 == 101 || i4 == 69) {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = '-';
                    emptyAndGetCurrentSegment2[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 2, i4);
                } else if (i4 != 93 && i4 != 125) {
                    reportUnexpectedNumberChar(i4, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
                continue;
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i4 == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = '-';
        emptyAndGetCurrentSegment3[1] = (char) i4;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 2);
    }

    protected JsonToken _finishNumberLeadingZeroes() throws IOException {
        int i4;
        do {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i4 = bArr[i5] & 255;
            if (i4 < 48) {
                if (i4 == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 1, i4);
                }
            } else if (i4 > 57) {
                if (i4 == 101 || i4 == 69) {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 1, i4);
                } else if (i4 != 93 && i4 != 125) {
                    reportUnexpectedNumberChar(i4, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
                continue;
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i4 == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = (char) i4;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 1);
    }

    protected JsonToken _finishNumberMinus(int i4) throws IOException {
        if (i4 <= 48) {
            if (i4 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i4, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i4 > 57) {
            if (i4 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i4, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        emptyAndGetCurrentSegment[1] = (char) i4;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment, 2);
    }

    protected final JsonToken _finishToken() throws IOException {
        int i4 = this._minorState;
        if (i4 != 1) {
            if (i4 == 4) {
                byte[] bArr = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                return _startFieldName(bArr[i5] & 255);
            } else if (i4 != 5) {
                switch (i4) {
                    case 7:
                        return _parseEscapedName(this._quadLength, this._pending32, this._pendingBytes);
                    case 8:
                        return _finishFieldWithEscape();
                    case 9:
                        return _finishAposName(this._quadLength, this._pending32, this._pendingBytes);
                    case 10:
                        return _finishUnquotedName(this._quadLength, this._pending32, this._pendingBytes);
                    default:
                        switch (i4) {
                            case 12:
                                byte[] bArr2 = this._inputBuffer;
                                int i6 = this._inputPtr;
                                this._inputPtr = i6 + 1;
                                return _startValue(bArr2[i6] & 255);
                            case 13:
                                byte[] bArr3 = this._inputBuffer;
                                int i7 = this._inputPtr;
                                this._inputPtr = i7 + 1;
                                return _startValueExpectComma(bArr3[i7] & 255);
                            case 14:
                                byte[] bArr4 = this._inputBuffer;
                                int i8 = this._inputPtr;
                                this._inputPtr = i8 + 1;
                                return _startValueExpectColon(bArr4[i8] & 255);
                            case 15:
                                byte[] bArr5 = this._inputBuffer;
                                int i9 = this._inputPtr;
                                this._inputPtr = i9 + 1;
                                return _startValueAfterComma(bArr5[i9] & 255);
                            case 16:
                                return _finishKeywordToken("null", this._pending32, JsonToken.VALUE_NULL);
                            case 17:
                                return _finishKeywordToken("true", this._pending32, JsonToken.VALUE_TRUE);
                            case 18:
                                return _finishKeywordToken(Bugly.SDK_IS_DEV, this._pending32, JsonToken.VALUE_FALSE);
                            case 19:
                                return _finishNonStdToken(this._nonStdTokenType, this._pending32);
                            default:
                                switch (i4) {
                                    case 23:
                                        byte[] bArr6 = this._inputBuffer;
                                        int i10 = this._inputPtr;
                                        this._inputPtr = i10 + 1;
                                        return _finishNumberMinus(bArr6[i10] & 255);
                                    case 24:
                                        return _finishNumberLeadingZeroes();
                                    case 25:
                                        return _finishNumberLeadingNegZeroes();
                                    case 26:
                                        return _finishNumberIntegralPart(this._textBuffer.getBufferWithoutReset(), this._textBuffer.getCurrentSegmentSize());
                                    default:
                                        switch (i4) {
                                            case 30:
                                                return _finishFloatFraction();
                                            case 31:
                                                byte[] bArr7 = this._inputBuffer;
                                                int i11 = this._inputPtr;
                                                this._inputPtr = i11 + 1;
                                                return _finishFloatExponent(true, bArr7[i11] & 255);
                                            case 32:
                                                byte[] bArr8 = this._inputBuffer;
                                                int i12 = this._inputPtr;
                                                this._inputPtr = i12 + 1;
                                                return _finishFloatExponent(false, bArr8[i12] & 255);
                                            default:
                                                switch (i4) {
                                                    case 40:
                                                        return _finishRegularString();
                                                    case 41:
                                                        int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
                                                        if (_decodeSplitEscaped < 0) {
                                                            return JsonToken.NOT_AVAILABLE;
                                                        }
                                                        this._textBuffer.append((char) _decodeSplitEscaped);
                                                        if (this._minorStateAfterSplit == 45) {
                                                            return _finishAposString();
                                                        }
                                                        return _finishRegularString();
                                                    case 42:
                                                        TextBuffer textBuffer = this._textBuffer;
                                                        int i13 = this._pending32;
                                                        byte[] bArr9 = this._inputBuffer;
                                                        int i14 = this._inputPtr;
                                                        this._inputPtr = i14 + 1;
                                                        textBuffer.append((char) _decodeUTF8_2(i13, bArr9[i14]));
                                                        if (this._minorStateAfterSplit == 45) {
                                                            return _finishAposString();
                                                        }
                                                        return _finishRegularString();
                                                    case 43:
                                                        int i15 = this._pending32;
                                                        int i16 = this._pendingBytes;
                                                        byte[] bArr10 = this._inputBuffer;
                                                        int i17 = this._inputPtr;
                                                        this._inputPtr = i17 + 1;
                                                        if (!_decodeSplitUTF8_3(i15, i16, bArr10[i17])) {
                                                            return JsonToken.NOT_AVAILABLE;
                                                        }
                                                        if (this._minorStateAfterSplit == 45) {
                                                            return _finishAposString();
                                                        }
                                                        return _finishRegularString();
                                                    case 44:
                                                        int i18 = this._pending32;
                                                        int i19 = this._pendingBytes;
                                                        byte[] bArr11 = this._inputBuffer;
                                                        int i20 = this._inputPtr;
                                                        this._inputPtr = i20 + 1;
                                                        if (!_decodeSplitUTF8_4(i18, i19, bArr11[i20])) {
                                                            return JsonToken.NOT_AVAILABLE;
                                                        }
                                                        if (this._minorStateAfterSplit == 45) {
                                                            return _finishAposString();
                                                        }
                                                        return _finishRegularString();
                                                    case 45:
                                                        return _finishAposString();
                                                    default:
                                                        switch (i4) {
                                                            case 50:
                                                                return _finishErrorToken();
                                                            case 51:
                                                                return _startSlashComment(this._pending32);
                                                            case 52:
                                                                return _finishCComment(this._pending32, true);
                                                            case 53:
                                                                return _finishCComment(this._pending32, false);
                                                            case 54:
                                                                return _finishCppComment(this._pending32);
                                                            case 55:
                                                                return _finishHashComment(this._pending32);
                                                            default:
                                                                VersionUtil.throwInternal();
                                                                return null;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                byte[] bArr12 = this._inputBuffer;
                int i21 = this._inputPtr;
                this._inputPtr = i21 + 1;
                return _startFieldNameAfterComma(bArr12[i21] & 255);
            }
        }
        return _finishBOM(this._pending32);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected final JsonToken _finishTokenWithEOF() throws IOException {
        JsonToken jsonToken = this._currToken;
        int i4 = this._minorState;
        if (i4 != 3) {
            if (i4 != 12) {
                if (i4 != 50) {
                    switch (i4) {
                        case 16:
                            return _finishKeywordTokenWithEOF("null", this._pending32, JsonToken.VALUE_NULL);
                        case 17:
                            return _finishKeywordTokenWithEOF("true", this._pending32, JsonToken.VALUE_TRUE);
                        case 18:
                            return _finishKeywordTokenWithEOF(Bugly.SDK_IS_DEV, this._pending32, JsonToken.VALUE_FALSE);
                        case 19:
                            return _finishNonStdTokenWithEOF(this._nonStdTokenType, this._pending32);
                        default:
                            switch (i4) {
                                case 24:
                                case 25:
                                    return _valueCompleteInt(0, "0");
                                case 26:
                                    int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                                    if (this._numberNegative) {
                                        currentSegmentSize--;
                                    }
                                    this._intLength = currentSegmentSize;
                                    return _valueComplete(JsonToken.VALUE_NUMBER_INT);
                                default:
                                    switch (i4) {
                                        case 30:
                                            this._expLength = 0;
                                            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                        case 31:
                                            _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                            _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                            return _eofAsNextToken();
                                        case 32:
                                            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                        default:
                                            switch (i4) {
                                                case 52:
                                                case 53:
                                                    _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                                    break;
                                                case 54:
                                                case 55:
                                                    break;
                                                default:
                                                    _reportInvalidEOF(": was expecting rest of token (internal state: " + this._minorState + ")", this._currToken);
                                                    return jsonToken;
                                            }
                                            return _eofAsNextToken();
                                    }
                            }
                    }
                }
                return _finishErrorTokenWithEOF();
            }
            return _eofAsNextToken();
        }
        return _eofAsNextToken();
    }

    protected JsonToken _reportErrorToken(String str) throws IOException {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.contentsAsString(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    protected JsonToken _startAposString() throws IOException {
        int i4 = this._inputPtr;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i4);
        byte[] bArr = this._inputBuffer;
        int i5 = 0;
        while (i4 < min) {
            int i6 = bArr[i4] & 255;
            if (i6 == 39) {
                this._inputPtr = i4 + 1;
                this._textBuffer.setCurrentLength(i5);
                return _valueComplete(JsonToken.VALUE_STRING);
            } else if (iArr[i6] != 0) {
                break;
            } else {
                i4++;
                emptyAndGetCurrentSegment[i5] = (char) i6;
                i5++;
            }
        }
        this._textBuffer.setCurrentLength(i5);
        this._inputPtr = i4;
        return _finishAposString();
    }

    protected JsonToken _startFalseToken() throws IOException {
        int i4;
        int i5 = this._inputPtr;
        if (i5 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i6 = i5 + 1;
            if (bArr[i5] == 97) {
                int i7 = i6 + 1;
                if (bArr[i6] == 108) {
                    int i8 = i7 + 1;
                    if (bArr[i7] == 115) {
                        int i9 = i8 + 1;
                        if (bArr[i8] == 101 && ((i4 = bArr[i9] & 255) < 48 || i4 == 93 || i4 == 125)) {
                            this._inputPtr = i9;
                            return _valueComplete(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this._minorState = 18;
        return _finishKeywordToken(Bugly.SDK_IS_DEV, 1, JsonToken.VALUE_FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        r2 = r2 & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r9 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        reportUnexpectedNumberChar(r2, "Decimal point not followed by a digit");
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00ec -> B:47:0x00c3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _startFloat(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startFloat(char[], int, int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _startFloatThatStartsWithPeriod() throws IOException {
        this._numberNegative = false;
        this._intLength = 0;
        return _startFloat(this._textBuffer.emptyAndGetCurrentSegment(), 0, 46);
    }

    protected JsonToken _startNegativeNumber() throws IOException {
        this._numberNegative = true;
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            this._minorState = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i4 + 1;
        int i5 = bArr[i4] & 255;
        int i6 = 2;
        if (i5 <= 48) {
            if (i5 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i5, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i5 > 57) {
            if (i5 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i5, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        emptyAndGetCurrentSegment[1] = (char) i5;
        int i7 = this._inputPtr;
        if (i7 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        int i8 = this._inputBuffer[i7];
        while (true) {
            if (i8 < 48) {
                if (i8 == 46) {
                    this._intLength = i6 - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i6, i8);
                }
            } else if (i8 <= 57) {
                if (i6 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i9 = i6 + 1;
                emptyAndGetCurrentSegment[i6] = (char) i8;
                int i10 = this._inputPtr + 1;
                this._inputPtr = i10;
                if (i10 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i9);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                i8 = this._inputBuffer[i10] & 255;
                i6 = i9;
            } else if (i8 == 101 || i8 == 69) {
                this._intLength = i6 - 1;
                this._inputPtr++;
                return _startFloat(emptyAndGetCurrentSegment, i6, i8);
            }
        }
        this._intLength = i6 - 1;
        this._textBuffer.setCurrentLength(i6);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken _startNullToken() throws IOException {
        int i4;
        int i5 = this._inputPtr;
        if (i5 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i6 = i5 + 1;
            if (bArr[i5] == 117) {
                int i7 = i6 + 1;
                if (bArr[i6] == 108) {
                    int i8 = i7 + 1;
                    if (bArr[i7] == 108 && ((i4 = bArr[i8] & 255) < 48 || i4 == 93 || i4 == 125)) {
                        this._inputPtr = i8;
                        return _valueComplete(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this._minorState = 16;
        return _finishKeywordToken("null", 1, JsonToken.VALUE_NULL);
    }

    protected JsonToken _startNumberLeadingZero() throws IOException {
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            this._minorState = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i5 = i4 + 1;
        int i6 = this._inputBuffer[i4] & 255;
        if (i6 < 48) {
            if (i6 == 46) {
                this._inputPtr = i5;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment, 1, i6);
            }
        } else if (i6 <= 57) {
            return _finishNumberLeadingZeroes();
        } else {
            if (i6 == 101 || i6 == 69) {
                this._inputPtr = i5;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment2[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment2, 1, i6);
            } else if (i6 != 93 && i6 != 125) {
                reportUnexpectedNumberChar(i6, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return _valueCompleteInt(0, "0");
    }

    protected JsonToken _startPositiveNumber(int i4) throws IOException {
        this._numberNegative = false;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = (char) i4;
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i6 = this._inputBuffer[i5] & 255;
        int i7 = 1;
        while (true) {
            if (i6 < 48) {
                if (i6 == 46) {
                    this._intLength = i7;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i7, i6);
                }
            } else if (i6 <= 57) {
                if (i7 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i8 = i7 + 1;
                emptyAndGetCurrentSegment[i7] = (char) i6;
                int i9 = this._inputPtr + 1;
                this._inputPtr = i9;
                if (i9 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i8);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken2;
                    return jsonToken2;
                }
                i6 = this._inputBuffer[i9] & 255;
                i7 = i8;
            } else if (i6 == 101 || i6 == 69) {
                this._intLength = i7;
                this._inputPtr++;
                return _startFloat(emptyAndGetCurrentSegment, i7, i6);
            }
        }
        this._intLength = i7;
        this._textBuffer.setCurrentLength(i7);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken _startString() throws IOException {
        int i4 = this._inputPtr;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i4);
        byte[] bArr = this._inputBuffer;
        int i5 = 0;
        while (true) {
            if (i4 >= min) {
                break;
            }
            int i6 = bArr[i4] & 255;
            if (iArr[i6] == 0) {
                i4++;
                emptyAndGetCurrentSegment[i5] = (char) i6;
                i5++;
            } else if (i6 == 34) {
                this._inputPtr = i4 + 1;
                this._textBuffer.setCurrentLength(i5);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
        }
        this._textBuffer.setCurrentLength(i5);
        this._inputPtr = i4;
        return _finishRegularString();
    }

    protected JsonToken _startTrueToken() throws IOException {
        int i4;
        int i5 = this._inputPtr;
        if (i5 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i6 = i5 + 1;
            if (bArr[i5] == 114) {
                int i7 = i6 + 1;
                if (bArr[i6] == 117) {
                    int i8 = i7 + 1;
                    if (bArr[i7] == 101 && ((i4 = bArr[i8] & 255) < 48 || i4 == 93 || i4 == 125)) {
                        this._inputPtr = i8;
                        return _valueComplete(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this._minorState = 17;
        return _finishKeywordToken("true", 1, JsonToken.VALUE_TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r4 != 44) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (r2._parsingContext.inArray() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r2._parsingContext.inRoot() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
        if ((r2._features & com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
        r2._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _startUnexpectedValue(boolean r3, int r4) throws java.io.IOException {
        /*
            r2 = this;
            r3 = 39
            if (r4 == r3) goto L53
            r3 = 73
            r0 = 1
            if (r4 == r3) goto L4e
            r3 = 78
            if (r4 == r3) goto L48
            r3 = 93
            if (r4 == r3) goto L24
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 == r3) goto L5f
            r3 = 43
            if (r4 == r3) goto L1e
            r3 = 44
            if (r4 == r3) goto L2d
            goto L5f
        L1e:
            r3 = 2
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r3, r0)
            return r3
        L24:
            com.fasterxml.jackson.core.json.JsonReadContext r3 = r2._parsingContext
            boolean r3 = r3.inArray()
            if (r3 != 0) goto L2d
            goto L5f
        L2d:
            com.fasterxml.jackson.core.json.JsonReadContext r3 = r2._parsingContext
            boolean r3 = r3.inRoot()
            if (r3 != 0) goto L5f
            int r3 = r2._features
            int r1 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_MISSING
            r3 = r3 & r1
            if (r3 == 0) goto L5f
            int r3 = r2._inputPtr
            int r3 = r3 - r0
            r2._inputPtr = r3
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            com.fasterxml.jackson.core.JsonToken r3 = r2._valueComplete(r3)
            return r3
        L48:
            r3 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r3, r0)
            return r3
        L4e:
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r0, r0)
            return r3
        L53:
            int r3 = r2._features
            int r0 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r3 = r3 & r0
            if (r3 == 0) goto L5f
            com.fasterxml.jackson.core.JsonToken r3 = r2._startAposString()
            return r3
        L5f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "expected a valid value "
            r3.append(r0)
            java.lang.String r0 = r2._validJsonValueList()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2._reportUnexpectedChar(r4, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startUnexpectedValue(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public void endOfInput() {
        this._endOfInput = true;
    }

    @Override // com.fasterxml.jackson.core.async.ByteArrayFeeder
    public void feedInput(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = this._inputPtr;
        int i7 = this._inputEnd;
        if (i6 < i7) {
            _reportError("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(i7 - i6));
        }
        if (i5 < i4) {
            _reportError("Input end (%d) may not be before start (%d)", Integer.valueOf(i5), Integer.valueOf(i4));
        }
        if (this._endOfInput) {
            _reportError("Already closed, can not feed more input");
        }
        this._currInputProcessed += this._origBufferLen;
        this._currInputRowStart = i4 - (this._inputEnd - this._currInputRowStart);
        this._currBufferStart = i4;
        this._inputBuffer = bArr;
        this._inputPtr = i4;
        this._inputEnd = i5;
        this._origBufferLen = i5 - i4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ByteArrayFeeder getNonBlockingInputFeeder() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public final boolean needMoreInput() {
        return this._inputPtr >= this._inputEnd && !this._endOfInput;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            if (this._endOfInput) {
                if (this._currToken == JsonToken.NOT_AVAILABLE) {
                    return _finishTokenWithEOF();
                }
                return _eofAsNextToken();
            }
            return JsonToken.NOT_AVAILABLE;
        } else if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return _finishToken();
        } else {
            this._numTypesValid = 0;
            this._tokenInputTotal = this._currInputProcessed + i4;
            this._binaryValue = null;
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            int i5 = bArr[i4] & 255;
            switch (this._majorState) {
                case 0:
                    return _startDocument(i5);
                case 1:
                    return _startValue(i5);
                case 2:
                    return _startFieldName(i5);
                case 3:
                    return _startFieldNameAfterComma(i5);
                case 4:
                    return _startValueExpectColon(i5);
                case 5:
                    return _startValue(i5);
                case 6:
                    return _startValueExpectComma(i5);
                default:
                    VersionUtil.throwInternal();
                    return null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase, com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i4 = this._inputEnd;
        int i5 = this._inputPtr;
        int i6 = i4 - i5;
        if (i6 > 0) {
            outputStream.write(this._inputBuffer, i5, i6);
        }
        return i6;
    }
}
