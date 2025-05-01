package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.tencent.bugly.Bugly;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
/* loaded from: classes3.dex */
public class ReaderBasedJsonParser extends ParserBase {
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public ReaderBasedJsonParser(IOContext iOContext, int i4, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i5, int i6, boolean z4) {
        super(iOContext, i4);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i5;
        this._inputEnd = i6;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z4;
    }

    private final void _checkMatchEnd(String str, int i4, int i5) throws IOException {
        if (Character.isJavaIdentifierPart((char) i5)) {
            _reportInvalidToken(str.substring(0, i4));
        }
    }

    private void _closeScope(int i4) throws JsonParseException {
        if (i4 == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i4, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i4 == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i4, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String _handleOddName2(int r5, int r6, int[] r7) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            char[] r1 = r4._inputBuffer
            int r2 = r4._inputPtr
            int r2 = r2 - r5
            r0.resetWithShared(r1, r5, r2)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.getCurrentSegment()
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            int r0 = r0.getCurrentSegmentSize()
            int r1 = r7.length
        L17:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L24
            boolean r2 = r4._loadMore()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4._inputBuffer
            int r3 = r4._inputPtr
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r0)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r7 = r5.getTextBuffer()
            int r0 = r5.getTextOffset()
            int r5 = r5.size()
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r1 = r4._symbols
            java.lang.String r5 = r1.findSymbol(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4._inputPtr
            int r3 = r3 + 1
            r4._inputPtr = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.finishCurrentSegment()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddName2(int, int, int[]):java.lang.String");
    }

    private final void _isNextTokenNameYes(int i4) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        _updateLocation();
        if (i4 == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
        } else if (i4 == 91) {
            this._nextToken = JsonToken.START_ARRAY;
        } else if (i4 == 102) {
            _matchToken(Bugly.SDK_IS_DEV, 1);
            this._nextToken = JsonToken.VALUE_FALSE;
        } else if (i4 == 110) {
            _matchToken("null", 1);
            this._nextToken = JsonToken.VALUE_NULL;
        } else if (i4 == 116) {
            _matchToken("true", 1);
            this._nextToken = JsonToken.VALUE_TRUE;
        } else if (i4 == 123) {
            this._nextToken = JsonToken.START_OBJECT;
        } else if (i4 == 45) {
            this._nextToken = _parseNegNumber();
        } else if (i4 != 46) {
            switch (i4) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    this._nextToken = _parsePosNumber(i4);
                    return;
                default:
                    this._nextToken = _handleOddValue(i4);
                    return;
            }
        } else {
            this._nextToken = _parseFloatThatStartsWithPeriod();
        }
    }

    private final void _matchFalse() throws IOException {
        int i4;
        char c5;
        int i5 = this._inputPtr;
        if (i5 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i5] == 'a') {
                int i6 = i5 + 1;
                if (cArr[i6] == 'l') {
                    int i7 = i6 + 1;
                    if (cArr[i7] == 's') {
                        int i8 = i7 + 1;
                        if (cArr[i8] == 'e' && ((c5 = cArr[(i4 = i8 + 1)]) < '0' || c5 == ']' || c5 == '}')) {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken(Bugly.SDK_IS_DEV, 1);
    }

    private final void _matchNull() throws IOException {
        int i4;
        char c5;
        int i5 = this._inputPtr;
        if (i5 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i5] == 'u') {
                int i6 = i5 + 1;
                if (cArr[i6] == 'l') {
                    int i7 = i6 + 1;
                    if (cArr[i7] == 'l' && ((c5 = cArr[(i4 = i7 + 1)]) < '0' || c5 == ']' || c5 == '}')) {
                        this._inputPtr = i4;
                        return;
                    }
                }
            }
        }
        _matchToken("null", 1);
    }

    private final void _matchToken2(String str, int i4) throws IOException {
        int i5;
        char c5;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i4)) {
                _reportInvalidToken(str.substring(0, i4));
            }
            i5 = this._inputPtr + 1;
            this._inputPtr = i5;
            i4++;
        } while (i4 < length);
        if ((i5 < this._inputEnd || _loadMore()) && (c5 = this._inputBuffer[this._inputPtr]) >= '0' && c5 != ']' && c5 != '}') {
            _checkMatchEnd(str, i4, c5);
        }
    }

    private final void _matchTrue() throws IOException {
        int i4;
        char c5;
        int i5 = this._inputPtr;
        if (i5 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i5] == 'r') {
                int i6 = i5 + 1;
                if (cArr[i6] == 'u') {
                    int i7 = i6 + 1;
                    if (cArr[i7] == 'e' && ((c5 = cArr[(i4 = i7 + 1)]) < '0' || c5 == ']' || c5 == '}')) {
                        this._inputPtr = i4;
                        return;
                    }
                }
            }
        }
        _matchToken("true", 1);
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i4) throws IOException {
        if (i4 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        } else if (i4 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (i4 == 102) {
            _matchToken(Bugly.SDK_IS_DEV, 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else if (i4 == 110) {
            _matchToken("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (i4 == 116) {
            _matchToken("true", 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else if (i4 != 123) {
            switch (i4) {
                case 44:
                    if (!this._parsingContext.inRoot() && (this._features & FEAT_MASK_ALLOW_MISSING) != 0) {
                        this._inputPtr--;
                        JsonToken jsonToken6 = JsonToken.VALUE_NULL;
                        this._currToken = jsonToken6;
                        return jsonToken6;
                    }
                    break;
                case 45:
                    JsonToken _parseNegNumber = _parseNegNumber();
                    this._currToken = _parseNegNumber;
                    return _parseNegNumber;
                case 46:
                    JsonToken _parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod();
                    this._currToken = _parseFloatThatStartsWithPeriod;
                    return _parseFloatThatStartsWithPeriod;
                default:
                    switch (i4) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            JsonToken _parsePosNumber = _parsePosNumber(i4);
                            this._currToken = _parsePosNumber;
                            return _parsePosNumber;
                    }
            }
            JsonToken _handleOddValue = _handleOddValue(i4);
            this._currToken = _handleOddValue;
            return _handleOddValue;
        } else {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken7 = JsonToken.START_OBJECT;
            this._currToken = jsonToken7;
            return jsonToken7;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x006e -> B:30:0x0050). Please submit an issue!!! */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:227)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:222)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:167)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:372)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private String _parseName2(int i4, int i5, int i6) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i4, this._inputPtr - i4);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            char c5 = cArr[i7];
            if (c5 <= '\\') {
                if (c5 == '\\') {
                    c5 = _decodeEscaped();
                } else if (c5 <= i6) {
                    if (c5 == i6) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i5);
                    } else if (c5 < ' ') {
                        _throwUnquotedSpace(c5, "name");
                    }
                }
            }
            i5 = (i5 * 33) + c5;
            int i8 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c5;
            if (i8 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i8;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z4, int i4) throws IOException {
        int i5;
        char nextChar;
        boolean z5;
        int i6;
        char nextChar2;
        if (z4) {
            i4++;
        }
        this._inputPtr = i4;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i7 = 0;
        if (z4) {
            emptyAndGetCurrentSegment[0] = '-';
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i8 = this._inputPtr;
        if (i8 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i8 + 1;
            nextChar = cArr[i8];
        } else {
            nextChar = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (nextChar == '0') {
            nextChar = _verifyNoLeadingZeroes();
        }
        int i9 = 0;
        while (nextChar >= '0' && nextChar <= '9') {
            i9++;
            if (i5 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i5 = 0;
            }
            int i10 = i5 + 1;
            emptyAndGetCurrentSegment[i5] = nextChar;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                i5 = i10;
                nextChar = 0;
                z5 = true;
                break;
            }
            char[] cArr2 = this._inputBuffer;
            int i11 = this._inputPtr;
            this._inputPtr = i11 + 1;
            nextChar = cArr2[i11];
            i5 = i10;
        }
        z5 = false;
        if (i9 == 0) {
            return _handleInvalidNumberStart(nextChar, z4);
        }
        if (nextChar == '.') {
            if (i5 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i5 = 0;
            }
            emptyAndGetCurrentSegment[i5] = nextChar;
            i5++;
            i6 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z5 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                nextChar = cArr3[i12];
                if (nextChar < '0' || nextChar > '9') {
                    break;
                }
                i6++;
                if (i5 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i5 = 0;
                }
                emptyAndGetCurrentSegment[i5] = nextChar;
                i5++;
            }
            if (i6 == 0) {
                reportUnexpectedNumberChar(nextChar, "Decimal point not followed by a digit");
            }
        } else {
            i6 = 0;
        }
        if (nextChar == 'e' || nextChar == 'E') {
            if (i5 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i5 = 0;
            }
            int i13 = i5 + 1;
            emptyAndGetCurrentSegment[i5] = nextChar;
            int i14 = this._inputPtr;
            if (i14 < this._inputEnd) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i14 + 1;
                nextChar2 = cArr4[i14];
            } else {
                nextChar2 = getNextChar("expected a digit for number exponent");
            }
            if (nextChar2 == '-' || nextChar2 == '+') {
                if (i13 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i13 = 0;
                }
                int i15 = i13 + 1;
                emptyAndGetCurrentSegment[i13] = nextChar2;
                int i16 = this._inputPtr;
                if (i16 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i16 + 1;
                    nextChar2 = cArr5[i16];
                } else {
                    nextChar2 = getNextChar("expected a digit for number exponent");
                }
                i13 = i15;
            }
            nextChar = nextChar2;
            int i17 = 0;
            while (nextChar <= '9' && nextChar >= '0') {
                i17++;
                if (i13 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i13 = 0;
                }
                i5 = i13 + 1;
                emptyAndGetCurrentSegment[i13] = nextChar;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i7 = i17;
                    z5 = true;
                    break;
                }
                char[] cArr6 = this._inputBuffer;
                int i18 = this._inputPtr;
                this._inputPtr = i18 + 1;
                nextChar = cArr6[i18];
                i13 = i5;
            }
            i7 = i17;
            i5 = i13;
            if (i7 == 0) {
                reportUnexpectedNumberChar(nextChar, "Exponent indicator not followed by a digit");
            }
        }
        if (!z5) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(nextChar);
            }
        }
        this._textBuffer.setCurrentLength(i5);
        return reset(z4, i9, i6, i7);
    }

    private final int _skipAfterComma2() throws IOException {
        char c5;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            c5 = cArr[i4];
            if (c5 > ' ') {
                if (c5 == '/') {
                    _skipComment();
                } else if (c5 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c5 < ' ') {
                if (c5 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i5;
                } else if (c5 == '\r') {
                    _skipCR();
                } else if (c5 != '\t') {
                    _throwInvalidSpace(c5);
                }
            }
        }
        return c5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _skipCComment() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            int r0 = r3._inputPtr
            int r1 = r3._inputEnd
            if (r0 < r1) goto Lc
            boolean r0 = r3._loadMore()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            int r2 = r1 + 1
            r3._inputPtr = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3._inputEnd
            if (r2 < r0) goto L2d
            boolean r0 = r3._loadMore()
            if (r0 != 0) goto L2d
        L26:
            r0 = 0
            java.lang.String r1 = " in a comment"
            r3._reportInvalidEOF(r1, r0)
            return
        L2d:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3._inputPtr = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3._currInputRow
            int r0 = r0 + 1
            r3._currInputRow = r0
            r3._currInputRowStart = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3._skipCR()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3._throwInvalidSpace(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCComment():void");
    }

    private final int _skipColon() throws IOException {
        int i4 = this._inputPtr;
        if (i4 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c5 = cArr[i4];
        if (c5 == ':') {
            int i5 = i4 + 1;
            this._inputPtr = i5;
            char c6 = cArr[i5];
            if (c6 > ' ') {
                if (c6 != '/' && c6 != '#') {
                    this._inputPtr = i5 + 1;
                    return c6;
                }
                return _skipColon2(true);
            }
            if (c6 == ' ' || c6 == '\t') {
                int i6 = i5 + 1;
                this._inputPtr = i6;
                char c7 = cArr[i6];
                if (c7 > ' ') {
                    if (c7 != '/' && c7 != '#') {
                        this._inputPtr = i6 + 1;
                        return c7;
                    }
                    return _skipColon2(true);
                }
            }
            return _skipColon2(true);
        }
        if (c5 == ' ' || c5 == '\t') {
            int i7 = i4 + 1;
            this._inputPtr = i7;
            c5 = cArr[i7];
        }
        if (c5 == ':') {
            int i8 = this._inputPtr + 1;
            this._inputPtr = i8;
            char c8 = cArr[i8];
            if (c8 > ' ') {
                if (c8 != '/' && c8 != '#') {
                    this._inputPtr = i8 + 1;
                    return c8;
                }
                return _skipColon2(true);
            }
            if (c8 == ' ' || c8 == '\t') {
                int i9 = i8 + 1;
                this._inputPtr = i9;
                char c9 = cArr[i9];
                if (c9 > ' ') {
                    if (c9 != '/' && c9 != '#') {
                        this._inputPtr = i9 + 1;
                        return c9;
                    }
                    return _skipColon2(true);
                }
            }
            return _skipColon2(true);
        }
        return _skipColon2(false);
    }

    private final int _skipColon2(boolean z4) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            char c5 = cArr[i4];
            if (c5 > ' ') {
                if (c5 == '/') {
                    _skipComment();
                } else if (c5 != '#' || !_skipYAMLComment()) {
                    if (z4) {
                        return c5;
                    }
                    if (c5 != ':') {
                        _reportUnexpectedChar(c5, "was expecting a colon to separate field name and value");
                    }
                    z4 = true;
                }
            } else if (c5 < ' ') {
                if (c5 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i5;
                } else if (c5 == '\r') {
                    _skipCR();
                } else if (c5 != '\t') {
                    _throwInvalidSpace(c5);
                }
            }
        }
    }

    private final int _skipColonFast(int i4) throws IOException {
        char[] cArr = this._inputBuffer;
        int i5 = i4 + 1;
        char c5 = cArr[i4];
        if (c5 == ':') {
            int i6 = i5 + 1;
            char c6 = cArr[i5];
            if (c6 > ' ') {
                if (c6 != '/' && c6 != '#') {
                    this._inputPtr = i6;
                    return c6;
                }
            } else if (c6 == ' ' || c6 == '\t') {
                int i7 = i6 + 1;
                char c7 = cArr[i6];
                if (c7 > ' ' && c7 != '/' && c7 != '#') {
                    this._inputPtr = i7;
                    return c7;
                }
                i6 = i7;
            }
            this._inputPtr = i6 - 1;
            return _skipColon2(true);
        }
        if (c5 == ' ' || c5 == '\t') {
            int i8 = i5 + 1;
            char c8 = cArr[i5];
            i5 = i8;
            c5 = c8;
        }
        boolean z4 = c5 == ':';
        if (z4) {
            int i9 = i5 + 1;
            char c9 = cArr[i5];
            if (c9 > ' ') {
                if (c9 != '/' && c9 != '#') {
                    this._inputPtr = i9;
                    return c9;
                }
            } else if (c9 == ' ' || c9 == '\t') {
                i5 = i9 + 1;
                char c10 = cArr[i9];
                if (c10 > ' ' && c10 != '/' && c10 != '#') {
                    this._inputPtr = i5;
                    return c10;
                }
            }
            i5 = i9;
        }
        this._inputPtr = i5 - 1;
        return _skipColon2(z4);
    }

    private final int _skipComma(int i4) throws IOException {
        if (i4 != 44) {
            _reportUnexpectedChar(i4, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (true) {
            int i5 = this._inputPtr;
            if (i5 < this._inputEnd) {
                char[] cArr = this._inputBuffer;
                int i6 = i5 + 1;
                this._inputPtr = i6;
                char c5 = cArr[i5];
                if (c5 > ' ') {
                    if (c5 == '/' || c5 == '#') {
                        this._inputPtr = i6 - 1;
                        return _skipAfterComma2();
                    }
                    return c5;
                } else if (c5 < ' ') {
                    if (c5 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i6;
                    } else if (c5 == '\r') {
                        _skipCR();
                    } else if (c5 != '\t') {
                        _throwInvalidSpace(c5);
                    }
                }
            } else {
                return _skipAfterComma2();
            }
        }
    }

    private void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        char c5 = cArr[i4];
        if (c5 == '/') {
            _skipLine();
        } else if (c5 == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c5, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipLine() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            char c5 = cArr[i4];
            if (c5 < ' ') {
                if (c5 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i5;
                    return;
                } else if (c5 == '\r') {
                    _skipCR();
                    return;
                } else if (c5 != '\t') {
                    _throwInvalidSpace(c5);
                }
            }
        }
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        char c5 = cArr[i4];
        if (c5 > ' ') {
            if (c5 == '/' || c5 == '#') {
                this._inputPtr = i5 - 1;
                return _skipWSOrEnd2();
            }
            return c5;
        }
        if (c5 != ' ') {
            if (c5 == '\n') {
                this._currInputRow++;
                this._currInputRowStart = i5;
            } else if (c5 == '\r') {
                _skipCR();
            } else if (c5 != '\t') {
                _throwInvalidSpace(c5);
            }
        }
        while (true) {
            int i6 = this._inputPtr;
            if (i6 < this._inputEnd) {
                char[] cArr2 = this._inputBuffer;
                int i7 = i6 + 1;
                this._inputPtr = i7;
                char c6 = cArr2[i6];
                if (c6 > ' ') {
                    if (c6 == '/' || c6 == '#') {
                        this._inputPtr = i7 - 1;
                        return _skipWSOrEnd2();
                    }
                    return c6;
                } else if (c6 != ' ') {
                    if (c6 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i7;
                    } else if (c6 == '\r') {
                        _skipCR();
                    } else if (c6 != '\t') {
                        _throwInvalidSpace(c6);
                    }
                }
            } else {
                return _skipWSOrEnd2();
            }
        }
    }

    private int _skipWSOrEnd2() throws IOException {
        char c5;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            c5 = cArr[i4];
            if (c5 > ' ') {
                if (c5 == '/') {
                    _skipComment();
                } else if (c5 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c5 != ' ') {
                if (c5 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i5;
                } else if (c5 == '\r') {
                    _skipCR();
                } else if (c5 != '\t') {
                    _throwInvalidSpace(c5);
                }
            }
        }
        return c5;
    }

    private boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i4 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i4;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i4 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i4 = this._inputPtr;
        this._nameStartOffset = i4;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i4 - this._currInputRowStart;
    }

    private char _verifyNLZ2() throws IOException {
        char c5;
        if ((this._inputPtr < this._inputEnd || _loadMore()) && (c5 = this._inputBuffer[this._inputPtr]) >= '0' && c5 <= '9') {
            if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            this._inputPtr++;
            if (c5 == '0') {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr = this._inputBuffer;
                    int i4 = this._inputPtr;
                    c5 = cArr[i4];
                    if (c5 < '0' || c5 > '9') {
                        return '0';
                    }
                    this._inputPtr = i4 + 1;
                } while (c5 == '0');
            }
            return c5;
        }
        return '0';
    }

    private final char _verifyNoLeadingZeroes() throws IOException {
        char c5;
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd || ((c5 = this._inputBuffer[i4]) >= '0' && c5 <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
    }

    private final void _verifyRootSpace(int i4) throws IOException {
        int i5 = this._inputPtr + 1;
        this._inputPtr = i5;
        if (i4 != 9) {
            if (i4 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i5;
            } else if (i4 == 13) {
                _skipCR();
            } else if (i4 != 32) {
                _reportMissingRootWS(i4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    protected byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c5 = cArr[i4];
            if (c5 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c5);
                if (decodeBase64Char < 0) {
                    if (c5 == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c5, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                char c6 = cArr2[i5];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c6);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c6, 1);
                }
                int i6 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                char c7 = cArr3[i7];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c7);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c7 == '\"') {
                            _getByteArrayBuilder.append(i6 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c7, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        char c8 = cArr4[i8];
                        if (!base64Variant.usesPaddingChar(c8) && _decodeBase64Escape(base64Variant, c8, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c8, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        _getByteArrayBuilder.append(i6 >> 4);
                    }
                }
                int i9 = (i6 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                char c9 = cArr5[i10];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c9);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c9 == '\"') {
                            _getByteArrayBuilder.appendTwoBytes(i9 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c9, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i9 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i9 << 6) | decodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        char c5 = cArr[i4];
        if (c5 == '\"' || c5 == '/' || c5 == '\\') {
            return c5;
        }
        if (c5 != 'b') {
            if (c5 != 'f') {
                if (c5 != 'n') {
                    if (c5 != 'r') {
                        if (c5 != 't') {
                            if (c5 != 'u') {
                                return _handleUnrecognizedCharacterEscape(c5);
                            }
                            int i5 = 0;
                            for (int i6 = 0; i6 < 4; i6++) {
                                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                                    _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
                                }
                                char[] cArr2 = this._inputBuffer;
                                int i7 = this._inputPtr;
                                this._inputPtr = i7 + 1;
                                char c6 = cArr2[i7];
                                int charToHex = CharTypes.charToHex(c6);
                                if (charToHex < 0) {
                                    _reportUnexpectedChar(c6, "expected a hex-digit for character escape sequence");
                                }
                                i5 = (i5 << 4) | charToHex;
                            }
                            return (char) i5;
                        }
                        return '\t';
                    }
                    return '\r';
                }
                return '\n';
            }
            return '\f';
        }
        return '\b';
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected final void _finishString() throws IOException {
        int i4 = this._inputPtr;
        int i5 = this._inputEnd;
        if (i4 < i5) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c5 = cArr[i4];
                if (c5 >= length || iArr[c5] == 0) {
                    i4++;
                    if (i4 >= i5) {
                        break;
                    }
                } else if (c5 == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i6 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i6, i4 - i6);
                    this._inputPtr = i4 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i7 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i7, i4 - i7);
        this._inputPtr = i4;
        _finishString2();
    }

    protected void _finishString2() throws IOException {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c5 = cArr[i4];
            if (c5 < length && iArr[c5] != 0) {
                if (c5 == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c5 == '\\') {
                    c5 = _decodeEscaped();
                } else if (c5 < ' ') {
                    _throwUnquotedSpace(c5, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c5;
            currentSegmentSize++;
        }
    }

    protected final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6 && id != 7 && id != 8) {
                return jsonToken.asString();
            }
            return this._textBuffer.contentsAsString();
        }
        return this._parsingContext.getCurrentName();
    }

    protected JsonToken _handleApos() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c5 = cArr[i4];
            if (c5 <= '\\') {
                if (c5 == '\\') {
                    c5 = _decodeEscaped();
                } else if (c5 <= '\'') {
                    if (c5 == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    } else if (c5 < ' ') {
                        _throwUnquotedSpace(c5, "string value");
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            emptyAndGetCurrentSegment[currentSegmentSize] = c5;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:227)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:222)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:167)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:372)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    protected String _handleOddName(int i4) throws IOException {
        boolean isJavaIdentifierPart;
        if (i4 == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar(i4, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        if (i4 < length) {
            isJavaIdentifierPart = inputCodeLatin1JsNames[i4] == 0;
        } else {
            isJavaIdentifierPart = Character.isJavaIdentifierPart((char) i4);
        }
        if (!isJavaIdentifierPart) {
            _reportUnexpectedChar(i4, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i5 = this._inputPtr;
        int i6 = this._hashSeed;
        int i7 = this._inputEnd;
        if (i5 < i7) {
            do {
                char[] cArr = this._inputBuffer;
                char c5 = cArr[i5];
                if (c5 < length) {
                    if (inputCodeLatin1JsNames[c5] != 0) {
                        int i8 = this._inputPtr - 1;
                        this._inputPtr = i5;
                        return this._symbols.findSymbol(cArr, i8, i5 - i8, i6);
                    }
                } else if (!Character.isJavaIdentifierPart(c5)) {
                    int i9 = this._inputPtr - 1;
                    this._inputPtr = i5;
                    return this._symbols.findSymbol(this._inputBuffer, i9, i5 - i9, i6);
                }
                i6 = (i6 * 33) + c5;
                i5++;
            } while (i5 < i7);
            this._inputPtr = i5;
            return _handleOddName2(this._inputPtr - 1, i6, inputCodeLatin1JsNames);
        }
        this._inputPtr = i5;
        return _handleOddName2(this._inputPtr - 1, i6, inputCodeLatin1JsNames);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r4 != 44) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r3._parsingContext.inArray() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r3._parsingContext.inRoot() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        if ((r3._features & com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L8e
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L75
            r0 = 78
            if (r4 == r0) goto L5c
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto L9a
        L1b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L2c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L2c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L3c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L45
            goto L9a
        L45:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 != 0) goto L9a
            int r0 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r2
            if (r0 == 0) goto L9a
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5c:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L6f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L6f:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L9a
        L75:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L88
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L88:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L9a
        L8e:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto L9a
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L9a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r0, r1)
        Lb9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected a valid value "
            r0.append(r1)
            java.lang.String r1 = r3._validJsonValueList()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected boolean _isNextTokenNameMaybe(int i4, String str) throws IOException {
        JsonToken _parseNegNumber;
        String _parseName = i4 == 34 ? _parseName() : _handleOddName(i4);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str.equals(_parseName);
        }
        if (_skipColon == 45) {
            _parseNegNumber = _parseNegNumber();
        } else if (_skipColon == 46) {
            _parseNegNumber = _parseFloatThatStartsWithPeriod();
        } else if (_skipColon == 91) {
            _parseNegNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    _parseNegNumber = _parsePosNumber(_skipColon);
                    break;
                default:
                    _parseNegNumber = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            _parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = _parseNegNumber;
        return str.equals(_parseName);
    }

    protected boolean _loadMore() throws IOException {
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i4 = this._inputEnd;
                long j4 = i4;
                this._currInputProcessed += j4;
                this._currInputRowStart -= i4;
                this._nameStartOffset -= j4;
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    protected void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    protected final void _matchToken(String str, int i4) throws IOException {
        int i5;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i4);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i4)) {
                _reportInvalidToken(str.substring(0, i4));
            }
            i5 = this._inputPtr + 1;
            this._inputPtr = i5;
            i4++;
        } while (i4 < length);
        char c5 = this._inputBuffer[i5];
        if (c5 < '0' || c5 == ']' || c5 == '}') {
            return;
        }
        _checkMatchEnd(str, i4, c5);
    }

    protected String _parseAposName() throws IOException {
        int i4 = this._inputPtr;
        int i5 = this._hashSeed;
        int i6 = this._inputEnd;
        if (i4 < i6) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c5 = cArr[i4];
                if (c5 == '\'') {
                    int i7 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    return this._symbols.findSymbol(cArr, i7, i4 - i7, i5);
                } else if (c5 < length && iArr[c5] != 0) {
                    break;
                } else {
                    i5 = (i5 * 33) + c5;
                    i4++;
                }
            } while (i4 < i6);
        }
        int i8 = this._inputPtr;
        this._inputPtr = i4;
        return _parseName2(i8, i5, 39);
    }

    protected final JsonToken _parseFloatThatStartsWithPeriod() throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleOddValue(46);
        }
        int i4 = this._inputPtr;
        return _parseFloat(46, i4 - 1, i4, false, 0);
    }

    protected final String _parseName() throws IOException {
        int i4 = this._inputPtr;
        int i5 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i4 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c5 = cArr[i4];
            if (c5 >= iArr.length || iArr[c5] == 0) {
                i5 = (i5 * 33) + c5;
                i4++;
            } else if (c5 == '\"') {
                int i6 = this._inputPtr;
                this._inputPtr = i4 + 1;
                return this._symbols.findSymbol(cArr, i6, i4 - i6, i5);
            }
        }
        int i7 = this._inputPtr;
        this._inputPtr = i4;
        return _parseName2(i7, i5, 34);
    }

    protected final JsonToken _parseNegNumber() throws IOException {
        int i4 = this._inputPtr;
        int i5 = i4 - 1;
        int i6 = this._inputEnd;
        if (i4 >= i6) {
            return _parseNumber2(true, i5);
        }
        int i7 = i4 + 1;
        char c5 = this._inputBuffer[i4];
        if (c5 > '9' || c5 < '0') {
            this._inputPtr = i7;
            return _handleInvalidNumberStart(c5, true);
        } else if (c5 == '0') {
            return _parseNumber2(true, i5);
        } else {
            int i8 = 1;
            while (i7 < i6) {
                int i9 = i7 + 1;
                char c6 = this._inputBuffer[i7];
                if (c6 < '0' || c6 > '9') {
                    if (c6 != '.' && c6 != 'e' && c6 != 'E') {
                        int i10 = i9 - 1;
                        this._inputPtr = i10;
                        if (this._parsingContext.inRoot()) {
                            _verifyRootSpace(c6);
                        }
                        this._textBuffer.resetWithShared(this._inputBuffer, i5, i10 - i5);
                        return resetInt(true, i8);
                    }
                    this._inputPtr = i9;
                    return _parseFloat(c6, i5, i9, true, i8);
                }
                i8++;
                i7 = i9;
            }
            return _parseNumber2(true, i5);
        }
    }

    protected final JsonToken _parsePosNumber(int i4) throws IOException {
        int i5 = this._inputPtr;
        int i6 = i5 - 1;
        int i7 = this._inputEnd;
        if (i4 == 48) {
            return _parseNumber2(false, i6);
        }
        int i8 = 1;
        while (i5 < i7) {
            int i9 = i5 + 1;
            char c5 = this._inputBuffer[i5];
            if (c5 < '0' || c5 > '9') {
                if (c5 != '.' && c5 != 'e' && c5 != 'E') {
                    int i10 = i9 - 1;
                    this._inputPtr = i10;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c5);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i6, i10 - i6);
                    return resetInt(false, i8);
                }
                this._inputPtr = i9;
                return _parseFloat(c5, i6, i9, false, i8);
            }
            i8++;
            i5 = i9;
        }
        this._inputPtr = i6;
        return _parseNumber2(false, i6);
    }

    protected int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i4 = 3;
        int length = bArr.length - 3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            char c5 = cArr[i7];
            if (c5 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c5);
                if (decodeBase64Char < 0) {
                    if (c5 == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c5, 0);
                    if (decodeBase64Char < 0) {
                    }
                }
                if (i5 > length) {
                    i6 += i5;
                    outputStream.write(bArr, 0, i5);
                    i5 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c6 = cArr2[i8];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c6);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c6, 1);
                }
                int i9 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                char c7 = cArr3[i10];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c7);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c7 == '\"') {
                            int i11 = i5 + 1;
                            bArr[i5] = (byte) (i9 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i5 = i11;
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, c7, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i12 = this._inputPtr;
                        this._inputPtr = i12 + 1;
                        char c8 = cArr4[i12];
                        if (!base64Variant.usesPaddingChar(c8) && _decodeBase64Escape(base64Variant, c8, i4) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c8, i4, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i5] = (byte) (i9 >> 4);
                        i5++;
                    }
                }
                int i13 = (i9 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                char c9 = cArr5[i14];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c9);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c9 == '\"') {
                            int i15 = i13 >> 2;
                            int i16 = i5 + 1;
                            bArr[i5] = (byte) (i15 >> 8);
                            i5 = i16 + 1;
                            bArr[i16] = (byte) i15;
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, c9, 3);
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        int i17 = i13 >> 2;
                        int i18 = i5 + 1;
                        bArr[i5] = (byte) (i17 >> 8);
                        i5 = i18 + 1;
                        bArr[i18] = (byte) i17;
                        i4 = 3;
                    }
                }
                int i19 = (i13 << 6) | decodeBase64Char4;
                int i20 = i5 + 1;
                bArr[i5] = (byte) (i19 >> 16);
                int i21 = i20 + 1;
                bArr[i20] = (byte) (i19 >> 8);
                bArr[i21] = (byte) i19;
                i5 = i21 + 1;
                i4 = 3;
            }
            i4 = 3;
        }
        this._tokenIncomplete = false;
        if (i5 > 0) {
            int i22 = i6 + i5;
            outputStream.write(bArr, 0, i5);
            return i22;
        }
        return i6;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _releaseBuffers() throws IOException {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    protected void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    protected final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            if (cArr[i4] == '\n') {
                this._inputPtr = i4 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    protected final void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int i4 = this._inputPtr;
        int i5 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i4 >= i5) {
                this._inputPtr = i4;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i4 = this._inputPtr;
                i5 = this._inputEnd;
            }
            int i6 = i4 + 1;
            char c5 = cArr[i4];
            if (c5 <= '\\') {
                if (c5 == '\\') {
                    this._inputPtr = i6;
                    _decodeEscaped();
                    i4 = this._inputPtr;
                    i5 = this._inputEnd;
                } else if (c5 <= '\"') {
                    if (c5 == '\"') {
                        this._inputPtr = i6;
                        return;
                    } else if (c5 < ' ') {
                        this._inputPtr = i6;
                        _throwUnquotedSpace(c5, "string value");
                    }
                }
            }
            i4 = i6;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        byte[] bArr;
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || (bArr = this._binaryValue) == null) {
            if (jsonToken != JsonToken.VALUE_STRING) {
                _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            }
            if (this._tokenIncomplete) {
                try {
                    this._binaryValue = _decodeBase64(base64Variant);
                    this._tokenIncomplete = false;
                } catch (IllegalArgumentException e5) {
                    throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e5.getMessage());
                }
            } else if (this._binaryValue == null) {
                ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
                _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
                this._binaryValue = _getByteArrayBuilder.toByteArray();
            }
            return this._binaryValue;
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._reader;
    }

    @Deprecated
    protected char getNextChar(String str) throws IOException {
        return getNextChar(str, null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return ParserBase.JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        return _getText2(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int id = jsonToken.id();
            if (id != 5) {
                if (id != 6) {
                    if (id != 7 && id != 8) {
                        return this._currToken.asCharArray();
                    }
                } else if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.getTextBuffer();
            }
            if (!this._nameCopied) {
                String currentName = this._parsingContext.getCurrentName();
                int length = currentName.length();
                char[] cArr = this._nameCopyBuffer;
                if (cArr == null) {
                    this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
                } else if (cArr.length < length) {
                    this._nameCopyBuffer = new char[length];
                }
                currentName.getChars(0, length, this._nameCopyBuffer, 0);
                this._nameCopied = true;
            }
            return this._nameCopyBuffer;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int id = jsonToken.id();
            if (id != 5) {
                if (id != 6) {
                    if (id != 7 && id != 8) {
                        return this._currToken.asCharArray().length;
                    }
                } else if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.size();
            }
            return this._parsingContext.getCurrentName().length();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 != 8) goto L15;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), -1L, this._currInputProcessed + (this._nameStartOffset - 1), this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(_getSourceReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(null);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Boolean nextBooleanValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        JsonToken nextToken = nextToken();
        if (nextToken != null) {
            int id = nextToken.id();
            if (id == 9) {
                return Boolean.TRUE;
            }
            if (id == 10) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        int i4 = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd != 93 && _skipWSOrEnd != 125) {
            if (this._parsingContext.expectComma()) {
                _skipWSOrEnd = _skipComma(_skipWSOrEnd);
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return false;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return false;
            }
            _updateNameLocation();
            if (_skipWSOrEnd == 34) {
                char[] asQuotedChars = serializableString.asQuotedChars();
                int length = asQuotedChars.length;
                int i5 = this._inputPtr;
                if (i5 + length + 4 < this._inputEnd) {
                    int i6 = length + i5;
                    if (this._inputBuffer[i6] == '\"') {
                        while (i5 != i6) {
                            if (asQuotedChars[i4] == this._inputBuffer[i5]) {
                                i4++;
                                i5++;
                            }
                        }
                        this._parsingContext.setCurrentName(serializableString.getValue());
                        _isNextTokenNameYes(_skipColonFast(i5 + 1));
                        return true;
                    }
                }
            }
            return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString.getValue());
        }
        _closeScope(_skipWSOrEnd);
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int nextIntValue(int i4) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i4;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return i4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long nextLongValue(long j4) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j4;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return j4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd != 93 && _skipWSOrEnd != 125) {
            if (this._parsingContext.expectComma()) {
                _skipWSOrEnd = _skipComma(_skipWSOrEnd);
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return this._currToken;
                }
            }
            boolean inObject = this._parsingContext.inObject();
            if (inObject) {
                _updateNameLocation();
                this._parsingContext.setCurrentName(_skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd));
                this._currToken = jsonToken3;
                _skipWSOrEnd = _skipColon();
            }
            _updateLocation();
            if (_skipWSOrEnd == 34) {
                this._tokenIncomplete = true;
                jsonToken = JsonToken.VALUE_STRING;
            } else if (_skipWSOrEnd == 91) {
                if (!inObject) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                }
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipWSOrEnd == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipWSOrEnd != 110) {
                if (_skipWSOrEnd != 116) {
                    if (_skipWSOrEnd == 123) {
                        if (!inObject) {
                            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                        }
                        jsonToken = JsonToken.START_OBJECT;
                    } else if (_skipWSOrEnd == 125) {
                        _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
                    } else if (_skipWSOrEnd == 45) {
                        jsonToken = _parseNegNumber();
                    } else if (_skipWSOrEnd != 46) {
                        switch (_skipWSOrEnd) {
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                                jsonToken = _parsePosNumber(_skipWSOrEnd);
                                break;
                            default:
                                jsonToken = _handleOddValue(_skipWSOrEnd);
                                break;
                        }
                    } else {
                        jsonToken = _parseFloatThatStartsWithPeriod();
                    }
                }
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            }
            if (inObject) {
                this._nextToken = jsonToken;
                return this._currToken;
            }
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeScope(_skipWSOrEnd);
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (this._tokenIncomplete && this._currToken == JsonToken.VALUE_STRING) {
            byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
            try {
                return _readBinary(base64Variant, outputStream, allocBase64Buffer);
            } finally {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            }
        }
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(Writer writer) throws IOException {
        int i4 = this._inputEnd;
        int i5 = this._inputPtr;
        int i6 = i4 - i5;
        if (i6 < 1) {
            return 0;
        }
        this._inputPtr = i5 + i6;
        writer.write(this._inputBuffer, i5, i6);
        return i6;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    protected void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c5 = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c5)) {
                break;
            }
            this._inputPtr++;
            sb.append(c5);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    protected char getNextChar(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        return cArr[i4];
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        } else if (jsonToken != null) {
            if (jsonToken.isNumeric()) {
                return this._textBuffer.contentsToWriter(writer);
            }
            char[] asCharArray = jsonToken.asCharArray();
            writer.write(asCharArray);
            return asCharArray.length;
        } else {
            return 0;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i4, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i4);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken _parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd != 93 && _skipWSOrEnd != 125) {
            if (this._parsingContext.expectComma()) {
                _skipWSOrEnd = _skipComma(_skipWSOrEnd);
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = jsonToken2;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                _parseNegNumber = _parseNegNumber();
            } else if (_skipColon == 46) {
                _parseNegNumber = _parseFloatThatStartsWithPeriod();
            } else if (_skipColon == 91) {
                _parseNegNumber = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                _parseNegNumber = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                _parseNegNumber = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                _parseNegNumber = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        _parseNegNumber = _parsePosNumber(_skipColon);
                        break;
                    default:
                        _parseNegNumber = _handleOddValue(_skipColon);
                        break;
                }
            } else {
                _parseNegNumber = JsonToken.START_OBJECT;
            }
            this._nextToken = _parseNegNumber;
            return _parseName;
        }
        _closeScope(_skipWSOrEnd);
        return null;
    }
}
