package io.netty.handler.codec.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.compression.ZlibCodecFactory;
import io.netty.handler.codec.compression.ZlibWrapper;
import io.netty.handler.codec.http.HttpContentEncoder;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
/* loaded from: classes6.dex */
public class HttpContentCompressor extends HttpContentEncoder {
    private final int compressionLevel;
    private final int contentSizeThreshold;
    private ChannelHandlerContext ctx;
    private final int memLevel;
    private final int windowBits;

    /* renamed from: io.netty.handler.codec.http.HttpContentCompressor$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$ZlibWrapper;

        static {
            int[] iArr = new int[ZlibWrapper.values().length];
            $SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = iArr;
            try {
                iArr[ZlibWrapper.GZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$ZlibWrapper[ZlibWrapper.ZLIB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public HttpContentCompressor() {
        this(6);
    }

    @Override // io.netty.handler.codec.http.HttpContentEncoder
    protected HttpContentEncoder.Result beginEncode(HttpResponse httpResponse, String str) throws Exception {
        ZlibWrapper determineWrapper;
        String str2;
        if ((this.contentSizeThreshold <= 0 || !(httpResponse instanceof HttpContent) || ((HttpContent) httpResponse).content().readableBytes() >= this.contentSizeThreshold) && httpResponse.headers().get(HttpHeaderNames.CONTENT_ENCODING) == null && (determineWrapper = determineWrapper(str)) != null) {
            int i4 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper[determineWrapper.ordinal()];
            if (i4 == 1) {
                str2 = "gzip";
            } else if (i4 != 2) {
                throw new Error();
            } else {
                str2 = "deflate";
            }
            return new HttpContentEncoder.Result(str2, new EmbeddedChannel(this.ctx.channel().id(), this.ctx.channel().metadata().hasDisconnect(), this.ctx.channel().config(), ZlibCodecFactory.newZlibEncoder(determineWrapper, this.compressionLevel, this.windowBits, this.memLevel)));
        }
        return null;
    }

    protected ZlibWrapper determineWrapper(String str) {
        String[] split = str.split(",");
        int length = split.length;
        int i4 = 0;
        float f5 = -1.0f;
        float f6 = -1.0f;
        float f7 = -1.0f;
        while (true) {
            float f8 = 0.0f;
            if (i4 >= length) {
                break;
            }
            String str2 = split[i4];
            int indexOf = str2.indexOf(61);
            if (indexOf != -1) {
                try {
                    f8 = Float.parseFloat(str2.substring(indexOf + 1));
                } catch (NumberFormatException unused) {
                }
            } else {
                f8 = 1.0f;
            }
            if (str2.contains(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD)) {
                f7 = f8;
            } else if (str2.contains("gzip") && f8 > f5) {
                f5 = f8;
            } else if (str2.contains("deflate") && f8 > f6) {
                f6 = f8;
            }
            i4++;
        }
        if (f5 > 0.0f || f6 > 0.0f) {
            if (f5 >= f6) {
                return ZlibWrapper.GZIP;
            }
            return ZlibWrapper.ZLIB;
        } else if (f7 > 0.0f) {
            if (f5 == -1.0f) {
                return ZlibWrapper.GZIP;
            }
            if (f6 == -1.0f) {
                return ZlibWrapper.ZLIB;
            }
            return null;
        } else {
            return null;
        }
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.ctx = channelHandlerContext;
    }

    public HttpContentCompressor(int i4) {
        this(i4, 15, 8, 0);
    }

    public HttpContentCompressor(int i4, int i5, int i6) {
        this(i4, i5, i6, 0);
    }

    public HttpContentCompressor(int i4, int i5, int i6, int i7) {
        if (i4 < 0 || i4 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + i4 + " (expected: 0-9)");
        } else if (i5 < 9 || i5 > 15) {
            throw new IllegalArgumentException("windowBits: " + i5 + " (expected: 9-15)");
        } else if (i6 < 1 || i6 > 9) {
            throw new IllegalArgumentException("memLevel: " + i6 + " (expected: 1-9)");
        } else if (i7 >= 0) {
            this.compressionLevel = i4;
            this.windowBits = i5;
            this.memLevel = i6;
            this.contentSizeThreshold = i7;
        } else {
            throw new IllegalArgumentException("contentSizeThreshold: " + i7 + " (expected: non negative number)");
        }
    }
}
