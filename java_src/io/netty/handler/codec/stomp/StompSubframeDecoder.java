package io.netty.handler.codec.stomp;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.ReplayingDecoder;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.util.AsciiString;
import io.netty.util.ByteProcessor;
import io.netty.util.internal.AppendableCharSequence;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.StringUtil;
import okio.Utf8;
/* loaded from: classes6.dex */
public class StompSubframeDecoder extends ReplayingDecoder<State> {
    private static final int DEFAULT_CHUNK_SIZE = 8132;
    private static final int DEFAULT_MAX_LINE_LENGTH = 1024;
    private int alreadyReadChunkSize;
    private final Utf8LineParser commandParser;
    private long contentLength;
    private final HeaderParser headerParser;
    private LastStompContentSubframe lastContent;
    private final int maxChunkSize;

    /* renamed from: io.netty.handler.codec.stomp.StompSubframeDecoder$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State = iArr;
            try {
                iArr[State.SKIP_CONTROL_CHARACTERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State[State.READ_HEADERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State[State.BAD_FRAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State[State.READ_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$stomp$StompSubframeDecoder$State[State.FINALIZE_FRAME_READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class HeaderParser extends Utf8LineParser {
        private String name;
        private boolean valid;
        private final boolean validateHeaders;

        HeaderParser(AppendableCharSequence appendableCharSequence, int i4, boolean z4) {
            super(appendableCharSequence, i4);
            this.validateHeaders = z4;
        }

        boolean parseHeader(StompHeaders stompHeaders, ByteBuf byteBuf) {
            AppendableCharSequence parse = super.parse(byteBuf);
            if (parse != null) {
                if (this.name == null && parse.length() == 0) {
                    return false;
                }
                if (this.valid) {
                    stompHeaders.add((StompHeaders) this.name, parse.toString());
                    return true;
                } else if (this.validateHeaders) {
                    if (StringUtil.isNullOrEmpty(this.name)) {
                        throw new IllegalArgumentException("received an invalid header line '" + parse.toString() + '\'');
                    }
                    throw new IllegalArgumentException("a header value or name contains a prohibited character ':', " + (this.name + ':' + parse.toString()));
                } else {
                    return true;
                }
            }
            return false;
        }

        @Override // io.netty.handler.codec.stomp.StompSubframeDecoder.Utf8LineParser, io.netty.util.ByteProcessor
        public boolean process(byte b5) throws Exception {
            if (b5 == 58) {
                if (this.name == null) {
                    AppendableCharSequence charSequence = charSequence();
                    if (charSequence.length() != 0) {
                        this.name = charSequence.substring(0, charSequence.length());
                        charSequence.reset();
                        this.valid = true;
                        return true;
                    }
                    this.name = "";
                } else {
                    this.valid = false;
                }
            }
            return super.process(b5);
        }

        @Override // io.netty.handler.codec.stomp.StompSubframeDecoder.Utf8LineParser
        protected void reset() {
            this.name = null;
            this.valid = false;
            super.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum State {
        SKIP_CONTROL_CHARACTERS,
        READ_HEADERS,
        READ_CONTENT,
        FINALIZE_FRAME_READ,
        BAD_FRAME,
        INVALID_CHUNK
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class Utf8LineParser implements ByteProcessor {
        private final AppendableCharSequence charSeq;
        private char interim;
        private int lineLength;
        private final int maxLineLength;
        private boolean nextRead;

        Utf8LineParser(AppendableCharSequence appendableCharSequence, int i4) {
            this.charSeq = (AppendableCharSequence) ObjectUtil.checkNotNull(appendableCharSequence, "charSeq");
            this.maxLineLength = i4;
        }

        AppendableCharSequence charSequence() {
            return this.charSeq;
        }

        AppendableCharSequence parse(ByteBuf byteBuf) {
            reset();
            int forEachByte = byteBuf.forEachByte(this);
            if (forEachByte == -1) {
                return null;
            }
            byteBuf.readerIndex(forEachByte + 1);
            return this.charSeq;
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b5) throws Exception {
            if (b5 == 13) {
                this.lineLength++;
                return true;
            } else if (b5 == 10) {
                return false;
            } else {
                int i4 = this.lineLength + 1;
                this.lineLength = i4;
                if (i4 <= this.maxLineLength) {
                    if (this.nextRead) {
                        this.interim = (char) (((b5 & Utf8.REPLACEMENT_BYTE) << 6) | this.interim);
                        this.nextRead = false;
                    } else {
                        char c5 = this.interim;
                        if (c5 != 0) {
                            this.charSeq.append((char) ((b5 & Utf8.REPLACEMENT_BYTE) | c5));
                            this.interim = (char) 0;
                        } else if (b5 >= 0) {
                            this.charSeq.append((char) b5);
                        } else if ((b5 & 224) == 192) {
                            this.interim = (char) ((b5 & 31) << 6);
                        } else {
                            this.interim = (char) ((b5 & 15) << 12);
                            this.nextRead = true;
                        }
                    }
                    return true;
                }
                throw new TooLongFrameException("An STOMP line is larger than " + this.maxLineLength + " bytes.");
            }
        }

        protected void reset() {
            this.charSeq.reset();
            this.lineLength = 0;
            this.interim = (char) 0;
            this.nextRead = false;
        }
    }

    public StompSubframeDecoder() {
        this(1024, DEFAULT_CHUNK_SIZE);
    }

    private static long getContentLength(StompHeaders stompHeaders) {
        AsciiString asciiString = StompHeaders.CONTENT_LENGTH;
        long j4 = stompHeaders.getLong(asciiString, 0L);
        if (j4 >= 0) {
            return j4;
        }
        throw new DecoderException(((Object) asciiString) + " must be non-negative");
    }

    private StompCommand readCommand(ByteBuf byteBuf) {
        AppendableCharSequence parse = this.commandParser.parse(byteBuf);
        if (parse != null) {
            String charSequence = parse.toString();
            try {
                return StompCommand.valueOf(charSequence);
            } catch (IllegalArgumentException unused) {
                throw new DecoderException("Cannot to parse command " + charSequence);
            }
        }
        throw new DecoderException("Failed to read command from channel");
    }

    private State readHeaders(ByteBuf byteBuf, StompHeaders stompHeaders) {
        do {
        } while (this.headerParser.parseHeader(stompHeaders, byteBuf));
        if (stompHeaders.contains(StompHeaders.CONTENT_LENGTH)) {
            long contentLength = getContentLength(stompHeaders);
            this.contentLength = contentLength;
            if (contentLength == 0) {
                return State.FINALIZE_FRAME_READ;
            }
        }
        return State.READ_CONTENT;
    }

    private void resetDecoder() {
        checkpoint(State.SKIP_CONTROL_CHARACTERS);
        this.contentLength = -1L;
        this.alreadyReadChunkSize = 0;
        this.lastContent = null;
    }

    private static void skipControlCharacters(ByteBuf byteBuf) {
        while (true) {
            byte readByte = byteBuf.readByte();
            if (readByte != 13 && readByte != 10) {
                byteBuf.readerIndex(byteBuf.readerIndex() - 1);
                return;
            }
        }
    }

    private static void skipNullCharacter(ByteBuf byteBuf) {
        byte readByte = byteBuf.readByte();
        if (readByte == 0) {
            return;
        }
        throw new IllegalStateException("unexpected byte in buffer " + ((int) readByte) + " while expecting NULL byte");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(10:(2:3|(9:5|(2:7|8)|10|11|(2:13|(2:15|16))(2:22|(1:24)(4:25|(1:27)|28|(4:30|(1:32)|33|(1:35)(2:36|37))(2:38|(1:40)(3:(1:42)(1:48)|43|(1:45)(2:46|47)))))|17|(1:19)|20|21))(1:66)|56|57|10|11|(0)(0)|17|(0)|20|21)|52|53|54|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
        r7 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: Exception -> 0x00ff, TryCatch #0 {Exception -> 0x00ff, blocks: (B:15:0x0042, B:45:0x00e2, B:47:0x00e9, B:48:0x00ed, B:20:0x0056, B:23:0x005d, B:26:0x0062, B:28:0x006a, B:31:0x0072, B:33:0x0086, B:34:0x0093, B:36:0x009c, B:38:0x00af, B:40:0x00b7, B:42:0x00c7, B:44:0x00d6, B:49:0x00f6, B:41:0x00be), top: B:61:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9 A[Catch: Exception -> 0x00ff, TryCatch #0 {Exception -> 0x00ff, blocks: (B:15:0x0042, B:45:0x00e2, B:47:0x00e9, B:48:0x00ed, B:20:0x0056, B:23:0x005d, B:26:0x0062, B:28:0x006a, B:31:0x0072, B:33:0x0086, B:34:0x0093, B:36:0x009c, B:38:0x00af, B:40:0x00b7, B:42:0x00c7, B:44:0x00d6, B:49:0x00f6, B:41:0x00be), top: B:61:0x0042 }] */
    @Override // io.netty.handler.codec.ByteToMessageDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void decode(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, java.util.List<java.lang.Object> r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.stomp.StompSubframeDecoder.decode(io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, java.util.List):void");
    }

    public StompSubframeDecoder(boolean z4) {
        this(1024, DEFAULT_CHUNK_SIZE, z4);
    }

    public StompSubframeDecoder(int i4, int i5) {
        this(i4, i5, false);
    }

    public StompSubframeDecoder(int i4, int i5, boolean z4) {
        super(State.SKIP_CONTROL_CHARACTERS);
        this.contentLength = -1L;
        ObjectUtil.checkPositive(i4, "maxLineLength");
        ObjectUtil.checkPositive(i5, "maxChunkSize");
        this.maxChunkSize = i5;
        this.commandParser = new Utf8LineParser(new AppendableCharSequence(16), i4);
        this.headerParser = new HeaderParser(new AppendableCharSequence(128), i4, z4);
    }
}
