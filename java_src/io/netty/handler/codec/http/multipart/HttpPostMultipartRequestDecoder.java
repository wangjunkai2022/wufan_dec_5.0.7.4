package io.netty.handler.codec.http.multipart;

import com.j256.ormlite.stmt.query.SimpleComparison;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpConstants;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import io.netty.util.AsciiString;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.InternalThreadLocalMap;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes6.dex */
public class HttpPostMultipartRequestDecoder implements InterfaceHttpPostRequestDecoder {
    private static final String FILENAME_ENCODED = HttpHeaderValues.FILENAME.toString() + '*';
    private final List<InterfaceHttpData> bodyListHttpData;
    private int bodyListHttpDataRank;
    private final Map<String, List<InterfaceHttpData>> bodyMapHttpData;
    private Charset charset;
    private Attribute currentAttribute;
    private Map<CharSequence, Attribute> currentFieldAttributes;
    private FileUpload currentFileUpload;
    private HttpPostRequestDecoder.MultiPartStatus currentStatus;
    private boolean destroyed;
    private int discardThreshold;
    private final HttpDataFactory factory;
    private boolean isLastChunk;
    private String multipartDataBoundary;
    private String multipartMixedBoundary;
    private final HttpRequest request;
    private ByteBuf undecodedChunk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus;

        static {
            int[] iArr = new int[HttpPostRequestDecoder.MultiPartStatus.values().length];
            $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus = iArr;
            try {
                iArr[HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.PREAMBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.DISPOSITION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.FIELD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.MIXEDDISPOSITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.MIXEDFILEUPLOAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.EPILOGUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public HttpPostMultipartRequestDecoder(HttpRequest httpRequest) {
        this(new DefaultHttpDataFactory(16384L), httpRequest, HttpConstants.DEFAULT_CHARSET);
    }

    private void checkDestroyed() {
        if (this.destroyed) {
            throw new IllegalStateException(HttpPostMultipartRequestDecoder.class.getSimpleName() + " was destroyed already");
        }
    }

    private void cleanMixedAttributes() {
        this.currentFieldAttributes.remove(HttpHeaderValues.CHARSET);
        this.currentFieldAttributes.remove(HttpHeaderNames.CONTENT_LENGTH);
        this.currentFieldAttributes.remove(HttpHeaderNames.CONTENT_TRANSFER_ENCODING);
        this.currentFieldAttributes.remove(HttpHeaderNames.CONTENT_TYPE);
        this.currentFieldAttributes.remove(HttpHeaderValues.FILENAME);
    }

    private static String cleanString(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt != '\t') {
                if (charAt != '\"') {
                    if (charAt != ',' && charAt != '=' && charAt != ':' && charAt != ';') {
                        sb.append(charAt);
                    }
                }
            }
            sb.append(' ');
        }
        return sb.toString().trim();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: IOException -> 0x00b8, IllegalArgumentException -> 0x00bf, NullPointerException -> 0x00c6, TRY_ENTER, TryCatch #6 {IOException -> 0x00b8, IllegalArgumentException -> 0x00bf, NullPointerException -> 0x00c6, blocks: (B:38:0x008b, B:39:0x009e), top: B:65:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: IOException -> 0x00b8, IllegalArgumentException -> 0x00bf, NullPointerException -> 0x00c6, TRY_LEAVE, TryCatch #6 {IOException -> 0x00b8, IllegalArgumentException -> 0x00bf, NullPointerException -> 0x00c6, blocks: (B:38:0x008b, B:39:0x009e), top: B:65:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private io.netty.handler.codec.http.multipart.InterfaceHttpData decodeMultipart(io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.decodeMultipart(io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus):io.netty.handler.codec.http.multipart.InterfaceHttpData");
    }

    private InterfaceHttpData findMultipartDelimiter(String str, HttpPostRequestDecoder.MultiPartStatus multiPartStatus, HttpPostRequestDecoder.MultiPartStatus multiPartStatus2) {
        int readerIndex = this.undecodedChunk.readerIndex();
        try {
            skipControlCharacters(this.undecodedChunk);
            skipOneLine();
            try {
                String readDelimiter = readDelimiter(this.undecodedChunk, str);
                if (readDelimiter.equals(str)) {
                    this.currentStatus = multiPartStatus;
                    return decodeMultipart(multiPartStatus);
                }
                if (readDelimiter.equals(str + "--")) {
                    this.currentStatus = multiPartStatus2;
                    HttpPostRequestDecoder.MultiPartStatus multiPartStatus3 = HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER;
                    if (multiPartStatus2 == multiPartStatus3) {
                        this.currentFieldAttributes = null;
                        return decodeMultipart(multiPartStatus3);
                    }
                    return null;
                }
                this.undecodedChunk.readerIndex(readerIndex);
                throw new HttpPostRequestDecoder.ErrorDataDecoderException("No Multipart delimiter found");
            } catch (HttpPostRequestDecoder.NotEnoughDataDecoderException unused) {
                this.undecodedChunk.readerIndex(readerIndex);
                return null;
            }
        } catch (HttpPostRequestDecoder.NotEnoughDataDecoderException unused2) {
            this.undecodedChunk.readerIndex(readerIndex);
            return null;
        }
    }

    private InterfaceHttpData findMultipartDisposition() {
        boolean z4;
        int readerIndex = this.undecodedChunk.readerIndex();
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
            this.currentFieldAttributes = new TreeMap(CaseIgnoringComparator.INSTANCE);
        }
        while (!skipOneLine()) {
            try {
                skipControlCharacters(this.undecodedChunk);
                String[] splitMultipartHeader = splitMultipartHeader(readLine(this.undecodedChunk, this.charset));
                boolean z5 = false;
                if (HttpHeaderNames.CONTENT_DISPOSITION.contentEqualsIgnoreCase(splitMultipartHeader[0])) {
                    if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
                        z4 = HttpHeaderValues.FORM_DATA.contentEqualsIgnoreCase(splitMultipartHeader[1]);
                    } else {
                        z4 = (HttpHeaderValues.ATTACHMENT.contentEqualsIgnoreCase(splitMultipartHeader[1]) || HttpHeaderValues.FILE.contentEqualsIgnoreCase(splitMultipartHeader[1])) ? true : true;
                    }
                    if (z4) {
                        for (int i4 = 2; i4 < splitMultipartHeader.length; i4++) {
                            try {
                                Attribute contentDispositionAttribute = getContentDispositionAttribute(splitMultipartHeader[i4].split(SimpleComparison.EQUAL_TO_OPERATION, 2));
                                this.currentFieldAttributes.put(contentDispositionAttribute.getName(), contentDispositionAttribute);
                            } catch (IllegalArgumentException e5) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e5);
                            } catch (NullPointerException e6) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e6);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    AsciiString asciiString = HttpHeaderNames.CONTENT_TRANSFER_ENCODING;
                    if (asciiString.contentEqualsIgnoreCase(splitMultipartHeader[0])) {
                        try {
                            this.currentFieldAttributes.put(asciiString, this.factory.createAttribute(this.request, asciiString.toString(), cleanString(splitMultipartHeader[1])));
                        } catch (IllegalArgumentException e7) {
                            throw new HttpPostRequestDecoder.ErrorDataDecoderException(e7);
                        } catch (NullPointerException e8) {
                            throw new HttpPostRequestDecoder.ErrorDataDecoderException(e8);
                        }
                    } else {
                        AsciiString asciiString2 = HttpHeaderNames.CONTENT_LENGTH;
                        if (asciiString2.contentEqualsIgnoreCase(splitMultipartHeader[0])) {
                            try {
                                this.currentFieldAttributes.put(asciiString2, this.factory.createAttribute(this.request, asciiString2.toString(), cleanString(splitMultipartHeader[1])));
                            } catch (IllegalArgumentException e9) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e9);
                            } catch (NullPointerException e10) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e10);
                            }
                        } else if (!HttpHeaderNames.CONTENT_TYPE.contentEqualsIgnoreCase(splitMultipartHeader[0])) {
                            continue;
                        } else if (HttpHeaderValues.MULTIPART_MIXED.contentEqualsIgnoreCase(splitMultipartHeader[1])) {
                            if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
                                String substringAfter = StringUtil.substringAfter(splitMultipartHeader[2], '=');
                                this.multipartMixedBoundary = "--" + substringAfter;
                                HttpPostRequestDecoder.MultiPartStatus multiPartStatus = HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER;
                                this.currentStatus = multiPartStatus;
                                return decodeMultipart(multiPartStatus);
                            }
                            throw new HttpPostRequestDecoder.ErrorDataDecoderException("Mixed Multipart found in a previous Mixed Multipart");
                        } else {
                            for (int i5 = 1; i5 < splitMultipartHeader.length; i5++) {
                                AsciiString asciiString3 = HttpHeaderValues.CHARSET;
                                String asciiString4 = asciiString3.toString();
                                if (splitMultipartHeader[i5].regionMatches(true, 0, asciiString4, 0, asciiString4.length())) {
                                    try {
                                        this.currentFieldAttributes.put(asciiString3, this.factory.createAttribute(this.request, asciiString4, cleanString(StringUtil.substringAfter(splitMultipartHeader[i5], '='))));
                                    } catch (IllegalArgumentException e11) {
                                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e11);
                                    } catch (NullPointerException e12) {
                                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e12);
                                    }
                                } else {
                                    try {
                                        Attribute createAttribute = this.factory.createAttribute(this.request, cleanString(splitMultipartHeader[0]), splitMultipartHeader[i5]);
                                        this.currentFieldAttributes.put(createAttribute.getName(), createAttribute);
                                    } catch (IllegalArgumentException e13) {
                                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e13);
                                    } catch (NullPointerException e14) {
                                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e14);
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (HttpPostRequestDecoder.NotEnoughDataDecoderException unused) {
                this.undecodedChunk.readerIndex(readerIndex);
                return null;
            }
        }
        Attribute attribute = this.currentFieldAttributes.get(HttpHeaderValues.FILENAME);
        if (this.currentStatus != HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
            if (attribute != null) {
                HttpPostRequestDecoder.MultiPartStatus multiPartStatus2 = HttpPostRequestDecoder.MultiPartStatus.MIXEDFILEUPLOAD;
                this.currentStatus = multiPartStatus2;
                return decodeMultipart(multiPartStatus2);
            }
            throw new HttpPostRequestDecoder.ErrorDataDecoderException("Filename not found");
        } else if (attribute != null) {
            HttpPostRequestDecoder.MultiPartStatus multiPartStatus3 = HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD;
            this.currentStatus = multiPartStatus3;
            return decodeMultipart(multiPartStatus3);
        } else {
            HttpPostRequestDecoder.MultiPartStatus multiPartStatus4 = HttpPostRequestDecoder.MultiPartStatus.FIELD;
            this.currentStatus = multiPartStatus4;
            return decodeMultipart(multiPartStatus4);
        }
    }

    private Attribute getContentDispositionAttribute(String... strArr) {
        String cleanString = cleanString(strArr[0]);
        String str = strArr[1];
        AsciiString asciiString = HttpHeaderValues.FILENAME;
        if (asciiString.contentEquals(cleanString)) {
            int length = str.length() - 1;
            if (length > 0 && str.charAt(0) == '\"' && str.charAt(length) == '\"') {
                str = str.substring(1, length);
            }
        } else if (FILENAME_ENCODED.equals(cleanString)) {
            try {
                cleanString = asciiString.toString();
                String[] split = str.split("'", 3);
                str = QueryStringDecoder.decodeComponent(split[2], Charset.forName(split[0]));
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e5);
            } catch (UnsupportedCharsetException e6) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e6);
            }
        } else {
            str = cleanString(str);
        }
        return this.factory.createAttribute(this.request, cleanString, str);
    }

    private static boolean loadDataMultipart(ByteBuf byteBuf, String str, HttpData httpData) {
        if (!byteBuf.hasArray()) {
            return loadDataMultipartStandard(byteBuf, str, httpData);
        }
        HttpPostBodyUtil.SeekAheadOptimize seekAheadOptimize = new HttpPostBodyUtil.SeekAheadOptimize(byteBuf);
        int readerIndex = byteBuf.readerIndex();
        int length = str.length();
        int i4 = seekAheadOptimize.pos;
        boolean z4 = false;
        byte b5 = 10;
        int i5 = 0;
        while (true) {
            int i6 = seekAheadOptimize.pos;
            if (i6 >= seekAheadOptimize.limit) {
                break;
            }
            byte[] bArr = seekAheadOptimize.bytes;
            seekAheadOptimize.pos = i6 + 1;
            byte b6 = bArr[i6];
            if (b5 == 10 && b6 == str.codePointAt(i5)) {
                i5++;
                if (length == i5) {
                    z4 = true;
                    break;
                }
            } else {
                i4 = seekAheadOptimize.pos;
                if (b6 == 10) {
                    i4 -= b5 == 13 ? 2 : 1;
                    i5 = 0;
                }
                b5 = b6;
            }
        }
        if (b5 == 13) {
            i4--;
        }
        int readPosition = seekAheadOptimize.getReadPosition(i4);
        try {
            httpData.addContent(byteBuf.copy(readerIndex, readPosition - readerIndex), z4);
            byteBuf.readerIndex(readPosition);
            return z4;
        } catch (IOException e5) {
            throw new HttpPostRequestDecoder.ErrorDataDecoderException(e5);
        }
    }

    private static boolean loadDataMultipartStandard(ByteBuf byteBuf, String str, HttpData httpData) {
        int readerIndex = byteBuf.readerIndex();
        int length = str.length();
        boolean z4 = false;
        int i4 = readerIndex;
        byte b5 = 10;
        int i5 = 0;
        while (true) {
            if (!byteBuf.isReadable()) {
                break;
            }
            byte readByte = byteBuf.readByte();
            if (b5 == 10 && readByte == str.codePointAt(i5)) {
                i5++;
                if (length == i5) {
                    z4 = true;
                    break;
                }
            } else {
                i4 = byteBuf.readerIndex();
                if (readByte == 10) {
                    i4 -= b5 == 13 ? 2 : 1;
                    i5 = 0;
                }
                b5 = readByte;
            }
        }
        if (b5 == 13) {
            i4--;
        }
        try {
            httpData.addContent(byteBuf.copy(readerIndex, i4 - readerIndex), z4);
            byteBuf.readerIndex(i4);
            return z4;
        } catch (IOException e5) {
            throw new HttpPostRequestDecoder.ErrorDataDecoderException(e5);
        }
    }

    private void parseBody() {
        HttpPostRequestDecoder.MultiPartStatus multiPartStatus = this.currentStatus;
        if (multiPartStatus != HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE && multiPartStatus != HttpPostRequestDecoder.MultiPartStatus.EPILOGUE) {
            parseBodyMultipart();
        } else if (this.isLastChunk) {
            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.EPILOGUE;
        }
    }

    private void parseBodyMultipart() {
        ByteBuf byteBuf = this.undecodedChunk;
        if (byteBuf == null || byteBuf.readableBytes() == 0) {
            return;
        }
        InterfaceHttpData decodeMultipart = decodeMultipart(this.currentStatus);
        while (decodeMultipart != null) {
            addHttpData(decodeMultipart);
            HttpPostRequestDecoder.MultiPartStatus multiPartStatus = this.currentStatus;
            if (multiPartStatus == HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE || multiPartStatus == HttpPostRequestDecoder.MultiPartStatus.EPILOGUE) {
                return;
            }
            decodeMultipart = decodeMultipart(multiPartStatus);
        }
    }

    private static String readDelimiter(ByteBuf byteBuf, String str) {
        int i4;
        int i5;
        if (!byteBuf.hasArray()) {
            return readDelimiterStandard(byteBuf, str);
        }
        HttpPostBodyUtil.SeekAheadOptimize seekAheadOptimize = new HttpPostBodyUtil.SeekAheadOptimize(byteBuf);
        int readerIndex = byteBuf.readerIndex();
        int length = str.length();
        try {
            StringBuilder sb = new StringBuilder(64);
            int i6 = 0;
            while (true) {
                i4 = seekAheadOptimize.pos;
                i5 = seekAheadOptimize.limit;
                if (i4 >= i5 || i6 >= length) {
                    break;
                }
                byte[] bArr = seekAheadOptimize.bytes;
                seekAheadOptimize.pos = i4 + 1;
                byte b5 = bArr[i4];
                if (b5 == str.charAt(i6)) {
                    i6++;
                    sb.append((char) b5);
                } else {
                    byteBuf.readerIndex(readerIndex);
                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                }
            }
            if (i4 < i5) {
                byte[] bArr2 = seekAheadOptimize.bytes;
                int i7 = i4 + 1;
                seekAheadOptimize.pos = i7;
                byte b6 = bArr2[i4];
                if (b6 == 13) {
                    if (i7 < i5) {
                        seekAheadOptimize.pos = i7 + 1;
                        if (bArr2[i7] == 10) {
                            seekAheadOptimize.setReadPosition(0);
                            return sb.toString();
                        }
                        byteBuf.readerIndex(readerIndex);
                        throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                    }
                    byteBuf.readerIndex(readerIndex);
                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                } else if (b6 == 10) {
                    seekAheadOptimize.setReadPosition(0);
                    return sb.toString();
                } else if (b6 == 45) {
                    sb.append('-');
                    int i8 = seekAheadOptimize.pos;
                    if (i8 < seekAheadOptimize.limit) {
                        byte[] bArr3 = seekAheadOptimize.bytes;
                        seekAheadOptimize.pos = i8 + 1;
                        if (bArr3[i8] == 45) {
                            sb.append('-');
                            int i9 = seekAheadOptimize.pos;
                            int i10 = seekAheadOptimize.limit;
                            if (i9 < i10) {
                                byte[] bArr4 = seekAheadOptimize.bytes;
                                int i11 = i9 + 1;
                                seekAheadOptimize.pos = i11;
                                byte b7 = bArr4[i9];
                                if (b7 != 13) {
                                    if (b7 == 10) {
                                        seekAheadOptimize.setReadPosition(0);
                                        return sb.toString();
                                    }
                                    seekAheadOptimize.setReadPosition(1);
                                    return sb.toString();
                                } else if (i11 < i10) {
                                    seekAheadOptimize.pos = i11 + 1;
                                    if (bArr4[i11] == 10) {
                                        seekAheadOptimize.setReadPosition(0);
                                        return sb.toString();
                                    }
                                    byteBuf.readerIndex(readerIndex);
                                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                                } else {
                                    byteBuf.readerIndex(readerIndex);
                                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                                }
                            }
                            seekAheadOptimize.setReadPosition(0);
                            return sb.toString();
                        }
                    }
                }
            }
            byteBuf.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        } catch (IndexOutOfBoundsException e5) {
            byteBuf.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e5);
        }
    }

    private static String readDelimiterStandard(ByteBuf byteBuf, String str) {
        int readerIndex = byteBuf.readerIndex();
        try {
            StringBuilder sb = new StringBuilder(64);
            int i4 = 0;
            int length = str.length();
            while (byteBuf.isReadable() && i4 < length) {
                byte readByte = byteBuf.readByte();
                if (readByte == str.charAt(i4)) {
                    i4++;
                    sb.append((char) readByte);
                } else {
                    byteBuf.readerIndex(readerIndex);
                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                }
            }
            if (byteBuf.isReadable()) {
                byte readByte2 = byteBuf.readByte();
                if (readByte2 == 13) {
                    if (byteBuf.readByte() == 10) {
                        return sb.toString();
                    }
                    byteBuf.readerIndex(readerIndex);
                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                } else if (readByte2 == 10) {
                    return sb.toString();
                } else {
                    if (readByte2 == 45) {
                        sb.append('-');
                        if (byteBuf.readByte() == 45) {
                            sb.append('-');
                            if (byteBuf.isReadable()) {
                                byte readByte3 = byteBuf.readByte();
                                if (readByte3 == 13) {
                                    if (byteBuf.readByte() == 10) {
                                        return sb.toString();
                                    }
                                    byteBuf.readerIndex(readerIndex);
                                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                                } else if (readByte3 == 10) {
                                    return sb.toString();
                                } else {
                                    byteBuf.readerIndex(byteBuf.readerIndex() - 1);
                                    return sb.toString();
                                }
                            }
                            return sb.toString();
                        }
                    }
                }
            }
            byteBuf.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        } catch (IndexOutOfBoundsException e5) {
            byteBuf.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e5);
        }
    }

    private static String readLine(ByteBuf byteBuf, Charset charset) {
        if (!byteBuf.hasArray()) {
            return readLineStandard(byteBuf, charset);
        }
        HttpPostBodyUtil.SeekAheadOptimize seekAheadOptimize = new HttpPostBodyUtil.SeekAheadOptimize(byteBuf);
        int readerIndex = byteBuf.readerIndex();
        try {
            ByteBuf buffer = Unpooled.buffer(64);
            while (true) {
                int i4 = seekAheadOptimize.pos;
                int i5 = seekAheadOptimize.limit;
                if (i4 < i5) {
                    byte[] bArr = seekAheadOptimize.bytes;
                    int i6 = i4 + 1;
                    seekAheadOptimize.pos = i6;
                    byte b5 = bArr[i4];
                    if (b5 == 13) {
                        if (i6 < i5) {
                            int i7 = i6 + 1;
                            seekAheadOptimize.pos = i7;
                            if (bArr[i6] == 10) {
                                seekAheadOptimize.setReadPosition(0);
                                return buffer.toString(charset);
                            }
                            seekAheadOptimize.pos = i7 - 1;
                            buffer.writeByte(13);
                        } else {
                            buffer.writeByte(b5);
                        }
                    } else if (b5 == 10) {
                        seekAheadOptimize.setReadPosition(0);
                        return buffer.toString(charset);
                    } else {
                        buffer.writeByte(b5);
                    }
                } else {
                    byteBuf.readerIndex(readerIndex);
                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                }
            }
        } catch (IndexOutOfBoundsException e5) {
            byteBuf.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e5);
        }
    }

    private static String readLineStandard(ByteBuf byteBuf, Charset charset) {
        int readerIndex = byteBuf.readerIndex();
        try {
            ByteBuf buffer = Unpooled.buffer(64);
            while (byteBuf.isReadable()) {
                byte readByte = byteBuf.readByte();
                if (readByte == 13) {
                    if (byteBuf.getByte(byteBuf.readerIndex()) == 10) {
                        byteBuf.readByte();
                        return buffer.toString(charset);
                    }
                    buffer.writeByte(13);
                } else if (readByte == 10) {
                    return buffer.toString(charset);
                } else {
                    buffer.writeByte(readByte);
                }
            }
            byteBuf.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        } catch (IndexOutOfBoundsException e5) {
            byteBuf.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e5);
        }
    }

    private void setMultipart(String str) {
        String[] multipartDataBoundary = HttpPostRequestDecoder.getMultipartDataBoundary(str);
        if (multipartDataBoundary != null) {
            this.multipartDataBoundary = multipartDataBoundary[0];
            if (multipartDataBoundary.length > 1 && multipartDataBoundary[1] != null) {
                this.charset = Charset.forName(multipartDataBoundary[1]);
            }
        } else {
            this.multipartDataBoundary = null;
        }
        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER;
    }

    private static void skipControlCharacters(ByteBuf byteBuf) {
        if (!byteBuf.hasArray()) {
            try {
                skipControlCharactersStandard(byteBuf);
                return;
            } catch (IndexOutOfBoundsException e5) {
                throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e5);
            }
        }
        HttpPostBodyUtil.SeekAheadOptimize seekAheadOptimize = new HttpPostBodyUtil.SeekAheadOptimize(byteBuf);
        while (true) {
            int i4 = seekAheadOptimize.pos;
            if (i4 < seekAheadOptimize.limit) {
                byte[] bArr = seekAheadOptimize.bytes;
                seekAheadOptimize.pos = i4 + 1;
                char c5 = (char) (bArr[i4] & 255);
                if (!Character.isISOControl(c5) && !Character.isWhitespace(c5)) {
                    seekAheadOptimize.setReadPosition(1);
                    return;
                }
            } else {
                throw new HttpPostRequestDecoder.NotEnoughDataDecoderException("Access out of bounds");
            }
        }
    }

    private static void skipControlCharactersStandard(ByteBuf byteBuf) {
        while (true) {
            char readUnsignedByte = (char) byteBuf.readUnsignedByte();
            if (!Character.isISOControl(readUnsignedByte) && !Character.isWhitespace(readUnsignedByte)) {
                byteBuf.readerIndex(byteBuf.readerIndex() - 1);
                return;
            }
        }
    }

    private boolean skipOneLine() {
        if (this.undecodedChunk.isReadable()) {
            byte readByte = this.undecodedChunk.readByte();
            if (readByte != 13) {
                if (readByte == 10) {
                    return true;
                }
                ByteBuf byteBuf = this.undecodedChunk;
                byteBuf.readerIndex(byteBuf.readerIndex() - 1);
                return false;
            } else if (!this.undecodedChunk.isReadable()) {
                ByteBuf byteBuf2 = this.undecodedChunk;
                byteBuf2.readerIndex(byteBuf2.readerIndex() - 1);
                return false;
            } else if (this.undecodedChunk.readByte() == 10) {
                return true;
            } else {
                ByteBuf byteBuf3 = this.undecodedChunk;
                byteBuf3.readerIndex(byteBuf3.readerIndex() - 2);
                return false;
            }
        }
        return false;
    }

    private static String[] splitMultipartHeader(String str) {
        String[] split;
        char charAt;
        ArrayList arrayList = new ArrayList(1);
        int findNonWhitespace = HttpPostBodyUtil.findNonWhitespace(str, 0);
        int i4 = findNonWhitespace;
        while (i4 < str.length() && (charAt = str.charAt(i4)) != ':' && !Character.isWhitespace(charAt)) {
            i4++;
        }
        int i5 = i4;
        while (true) {
            if (i5 >= str.length()) {
                break;
            } else if (str.charAt(i5) == ':') {
                i5++;
                break;
            } else {
                i5++;
            }
        }
        int findNonWhitespace2 = HttpPostBodyUtil.findNonWhitespace(str, i5);
        int findEndOfString = HttpPostBodyUtil.findEndOfString(str);
        arrayList.add(str.substring(findNonWhitespace, i4));
        String substring = findNonWhitespace2 >= findEndOfString ? "" : str.substring(findNonWhitespace2, findEndOfString);
        if (substring.indexOf(59) >= 0) {
            split = splitMultipartHeaderValues(substring);
        } else {
            split = substring.split(",");
        }
        for (String str2 : split) {
            arrayList.add(str2.trim());
        }
        String[] strArr = new String[arrayList.size()];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            strArr[i6] = (String) arrayList.get(i6);
        }
        return strArr;
    }

    private static String[] splitMultipartHeaderValues(String str) {
        ArrayList arrayList = InternalThreadLocalMap.get().arrayList(1);
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (z4) {
                if (z5) {
                    z5 = false;
                } else if (charAt == '\\') {
                    z5 = true;
                } else if (charAt == '\"') {
                    z4 = false;
                }
            } else if (charAt == '\"') {
                z4 = true;
            } else if (charAt == ';') {
                arrayList.add(str.substring(i4, i5));
                i4 = i5 + 1;
            }
        }
        arrayList.add(str.substring(i4));
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void addHttpData(InterfaceHttpData interfaceHttpData) {
        if (interfaceHttpData == null) {
            return;
        }
        List<InterfaceHttpData> list = this.bodyMapHttpData.get(interfaceHttpData.getName());
        if (list == null) {
            list = new ArrayList<>(1);
            this.bodyMapHttpData.put(interfaceHttpData.getName(), list);
        }
        list.add(interfaceHttpData);
        this.bodyListHttpData.add(interfaceHttpData);
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void cleanFiles() {
        checkDestroyed();
        this.factory.cleanRequestHttpData(this.request);
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public InterfaceHttpData currentPartialHttpData() {
        FileUpload fileUpload = this.currentFileUpload;
        return fileUpload != null ? fileUpload : this.currentAttribute;
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void destroy() {
        cleanFiles();
        this.destroyed = true;
        ByteBuf byteBuf = this.undecodedChunk;
        if (byteBuf == null || byteBuf.refCnt() <= 0) {
            return;
        }
        this.undecodedChunk.release();
        this.undecodedChunk = null;
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public InterfaceHttpData getBodyHttpData(String str) {
        checkDestroyed();
        if (this.isLastChunk) {
            List<InterfaceHttpData> list = this.bodyMapHttpData.get(str);
            if (list != null) {
                return list.get(0);
            }
            return null;
        }
        throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public List<InterfaceHttpData> getBodyHttpDatas() {
        checkDestroyed();
        if (this.isLastChunk) {
            return this.bodyListHttpData;
        }
        throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public int getDiscardThreshold() {
        return this.discardThreshold;
    }

    protected InterfaceHttpData getFileUpload(String str) {
        String value;
        Attribute attribute = this.currentFieldAttributes.get(HttpHeaderNames.CONTENT_TRANSFER_ENCODING);
        Charset charset = this.charset;
        HttpPostBodyUtil.TransferEncodingMechanism transferEncodingMechanism = HttpPostBodyUtil.TransferEncodingMechanism.BIT7;
        if (attribute != null) {
            try {
                String lowerCase = attribute.getValue().toLowerCase();
                if (lowerCase.equals(transferEncodingMechanism.value())) {
                    charset = CharsetUtil.US_ASCII;
                } else {
                    transferEncodingMechanism = HttpPostBodyUtil.TransferEncodingMechanism.BIT8;
                    if (lowerCase.equals(transferEncodingMechanism.value())) {
                        charset = CharsetUtil.ISO_8859_1;
                    } else {
                        transferEncodingMechanism = HttpPostBodyUtil.TransferEncodingMechanism.BINARY;
                        if (!lowerCase.equals(transferEncodingMechanism.value())) {
                            throw new HttpPostRequestDecoder.ErrorDataDecoderException("TransferEncoding Unknown: " + lowerCase);
                        }
                    }
                }
            } catch (IOException e5) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e5);
            }
        }
        Attribute attribute2 = this.currentFieldAttributes.get(HttpHeaderValues.CHARSET);
        if (attribute2 != null) {
            try {
                charset = Charset.forName(attribute2.getValue());
            } catch (IOException e6) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e6);
            } catch (UnsupportedCharsetException e7) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e7);
            }
        }
        Charset charset2 = charset;
        if (this.currentFileUpload == null) {
            Attribute attribute3 = this.currentFieldAttributes.get(HttpHeaderValues.FILENAME);
            Attribute attribute4 = this.currentFieldAttributes.get(HttpHeaderValues.NAME);
            Attribute attribute5 = this.currentFieldAttributes.get(HttpHeaderNames.CONTENT_TYPE);
            Attribute attribute6 = this.currentFieldAttributes.get(HttpHeaderNames.CONTENT_LENGTH);
            long j4 = 0;
            if (attribute6 != null) {
                try {
                    j4 = Long.parseLong(attribute6.getValue());
                } catch (IOException e8) {
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException(e8);
                } catch (NumberFormatException unused) {
                }
            }
            long j5 = j4;
            if (attribute5 != null) {
                try {
                    value = attribute5.getValue();
                } catch (IOException e9) {
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException(e9);
                } catch (IllegalArgumentException e10) {
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException(e10);
                } catch (NullPointerException e11) {
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException(e11);
                }
            } else {
                value = HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE;
            }
            this.currentFileUpload = this.factory.createFileUpload(this.request, cleanString(attribute4.getValue()), cleanString(attribute3.getValue()), value, transferEncodingMechanism.value(), charset2, j5);
        }
        if (loadDataMultipart(this.undecodedChunk, str, this.currentFileUpload) && this.currentFileUpload.isCompleted()) {
            if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD) {
                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER;
                this.currentFieldAttributes = null;
            } else {
                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER;
                cleanMixedAttributes();
            }
            FileUpload fileUpload = this.currentFileUpload;
            this.currentFileUpload = null;
            return fileUpload;
        }
        return null;
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean hasNext() {
        checkDestroyed();
        if (this.currentStatus != HttpPostRequestDecoder.MultiPartStatus.EPILOGUE || this.bodyListHttpDataRank < this.bodyListHttpData.size()) {
            return !this.bodyListHttpData.isEmpty() && this.bodyListHttpDataRank < this.bodyListHttpData.size();
        }
        throw new HttpPostRequestDecoder.EndOfDataDecoderException();
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean isMultipart() {
        checkDestroyed();
        return true;
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public InterfaceHttpData next() {
        checkDestroyed();
        if (hasNext()) {
            List<InterfaceHttpData> list = this.bodyListHttpData;
            int i4 = this.bodyListHttpDataRank;
            this.bodyListHttpDataRank = i4 + 1;
            return list.get(i4);
        }
        return null;
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void removeHttpDataFromClean(InterfaceHttpData interfaceHttpData) {
        checkDestroyed();
        this.factory.removeHttpDataFromClean(this.request, interfaceHttpData);
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void setDiscardThreshold(int i4) {
        this.discardThreshold = ObjectUtil.checkPositiveOrZero(i4, "discardThreshold");
    }

    public HttpPostMultipartRequestDecoder(HttpDataFactory httpDataFactory, HttpRequest httpRequest) {
        this(httpDataFactory, httpRequest, HttpConstants.DEFAULT_CHARSET);
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public HttpPostMultipartRequestDecoder offer(HttpContent httpContent) {
        checkDestroyed();
        ByteBuf content = httpContent.content();
        ByteBuf byteBuf = this.undecodedChunk;
        if (byteBuf == null) {
            this.undecodedChunk = content.copy();
        } else {
            byteBuf.writeBytes(content);
        }
        if (httpContent instanceof LastHttpContent) {
            this.isLastChunk = true;
        }
        parseBody();
        ByteBuf byteBuf2 = this.undecodedChunk;
        if (byteBuf2 != null && byteBuf2.writerIndex() > this.discardThreshold) {
            this.undecodedChunk.discardReadBytes();
        }
        return this;
    }

    public HttpPostMultipartRequestDecoder(HttpDataFactory httpDataFactory, HttpRequest httpRequest, Charset charset) {
        this.bodyListHttpData = new ArrayList();
        this.bodyMapHttpData = new TreeMap(CaseIgnoringComparator.INSTANCE);
        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED;
        this.discardThreshold = 10485760;
        HttpRequest httpRequest2 = (HttpRequest) ObjectUtil.checkNotNull(httpRequest, "request");
        this.request = httpRequest2;
        this.charset = (Charset) ObjectUtil.checkNotNull(charset, "charset");
        this.factory = (HttpDataFactory) ObjectUtil.checkNotNull(httpDataFactory, "factory");
        setMultipart(httpRequest2.headers().get(HttpHeaderNames.CONTENT_TYPE));
        if (httpRequest instanceof HttpContent) {
            offer((HttpContent) httpRequest);
            return;
        }
        this.undecodedChunk = Unpooled.buffer();
        parseBody();
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public List<InterfaceHttpData> getBodyHttpDatas(String str) {
        checkDestroyed();
        if (this.isLastChunk) {
            return this.bodyMapHttpData.get(str);
        }
        throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
    }
}
