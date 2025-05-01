package io.netty.handler.codec.http.websocketx;

import com.join.mgps.data.c;
import io.netty.handler.codec.http.EmptyHttpHeaders;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.util.internal.ObjectUtil;
import java.net.URI;
/* loaded from: classes6.dex */
public final class WebSocketClientProtocolConfig {
    static final boolean DEFAULT_ALLOW_MASK_MISMATCH = false;
    static final boolean DEFAULT_DROP_PONG_FRAMES = true;
    static final boolean DEFAULT_HANDLE_CLOSE_FRAMES = true;
    static final boolean DEFAULT_PERFORM_MASKING = true;
    private final boolean absoluteUpgradeUrl;
    private final boolean allowExtensions;
    private final boolean allowMaskMismatch;
    private final HttpHeaders customHeaders;
    private final boolean dropPongFrames;
    private final long forceCloseTimeoutMillis;
    private final boolean handleCloseFrames;
    private final long handshakeTimeoutMillis;
    private final int maxFramePayloadLength;
    private final boolean performMasking;
    private final WebSocketCloseStatus sendCloseFrame;
    private final String subprotocol;
    private final WebSocketVersion version;
    private final URI webSocketUri;

    /* loaded from: classes6.dex */
    public static final class Builder {
        private boolean absoluteUpgradeUrl;
        private boolean allowExtensions;
        private boolean allowMaskMismatch;
        private HttpHeaders customHeaders;
        private boolean dropPongFrames;
        private long forceCloseTimeoutMillis;
        private boolean handleCloseFrames;
        private long handshakeTimeoutMillis;
        private int maxFramePayloadLength;
        private boolean performMasking;
        private WebSocketCloseStatus sendCloseFrame;
        private String subprotocol;
        private WebSocketVersion version;
        private URI webSocketUri;

        public Builder absoluteUpgradeUrl(boolean z4) {
            this.absoluteUpgradeUrl = z4;
            return this;
        }

        public Builder allowExtensions(boolean z4) {
            this.allowExtensions = z4;
            return this;
        }

        public Builder allowMaskMismatch(boolean z4) {
            this.allowMaskMismatch = z4;
            return this;
        }

        public WebSocketClientProtocolConfig build() {
            return new WebSocketClientProtocolConfig(this.webSocketUri, this.subprotocol, this.version, this.allowExtensions, this.customHeaders, this.maxFramePayloadLength, this.performMasking, this.allowMaskMismatch, this.handleCloseFrames, this.sendCloseFrame, this.dropPongFrames, this.handshakeTimeoutMillis, this.forceCloseTimeoutMillis, this.absoluteUpgradeUrl);
        }

        public Builder customHeaders(HttpHeaders httpHeaders) {
            this.customHeaders = httpHeaders;
            return this;
        }

        public Builder dropPongFrames(boolean z4) {
            this.dropPongFrames = z4;
            return this;
        }

        public Builder forceCloseTimeoutMillis(long j4) {
            this.forceCloseTimeoutMillis = j4;
            return this;
        }

        public Builder handleCloseFrames(boolean z4) {
            this.handleCloseFrames = z4;
            return this;
        }

        public Builder handshakeTimeoutMillis(long j4) {
            this.handshakeTimeoutMillis = j4;
            return this;
        }

        public Builder maxFramePayloadLength(int i4) {
            this.maxFramePayloadLength = i4;
            return this;
        }

        public Builder performMasking(boolean z4) {
            this.performMasking = z4;
            return this;
        }

        public Builder sendCloseFrame(WebSocketCloseStatus webSocketCloseStatus) {
            this.sendCloseFrame = webSocketCloseStatus;
            return this;
        }

        public Builder subprotocol(String str) {
            this.subprotocol = str;
            return this;
        }

        public Builder version(WebSocketVersion webSocketVersion) {
            this.version = webSocketVersion;
            return this;
        }

        public Builder webSocketUri(String str) {
            return webSocketUri(URI.create(str));
        }

        public Builder webSocketUri(URI uri) {
            this.webSocketUri = uri;
            return this;
        }

        private Builder(WebSocketClientProtocolConfig webSocketClientProtocolConfig) {
            this(((WebSocketClientProtocolConfig) ObjectUtil.checkNotNull(webSocketClientProtocolConfig, "clientConfig")).webSocketUri(), webSocketClientProtocolConfig.subprotocol(), webSocketClientProtocolConfig.version(), webSocketClientProtocolConfig.allowExtensions(), webSocketClientProtocolConfig.customHeaders(), webSocketClientProtocolConfig.maxFramePayloadLength(), webSocketClientProtocolConfig.performMasking(), webSocketClientProtocolConfig.allowMaskMismatch(), webSocketClientProtocolConfig.handleCloseFrames(), webSocketClientProtocolConfig.sendCloseFrame(), webSocketClientProtocolConfig.dropPongFrames(), webSocketClientProtocolConfig.handshakeTimeoutMillis(), webSocketClientProtocolConfig.forceCloseTimeoutMillis(), webSocketClientProtocolConfig.absoluteUpgradeUrl());
        }

        private Builder(URI uri, String str, WebSocketVersion webSocketVersion, boolean z4, HttpHeaders httpHeaders, int i4, boolean z5, boolean z6, boolean z7, WebSocketCloseStatus webSocketCloseStatus, boolean z8, long j4, long j5, boolean z9) {
            this.webSocketUri = uri;
            this.subprotocol = str;
            this.version = webSocketVersion;
            this.allowExtensions = z4;
            this.customHeaders = httpHeaders;
            this.maxFramePayloadLength = i4;
            this.performMasking = z5;
            this.allowMaskMismatch = z6;
            this.handleCloseFrames = z7;
            this.sendCloseFrame = webSocketCloseStatus;
            this.dropPongFrames = z8;
            this.handshakeTimeoutMillis = j4;
            this.forceCloseTimeoutMillis = j5;
            this.absoluteUpgradeUrl = z9;
        }
    }

    public static Builder newBuilder() {
        return new Builder(URI.create("https://localhost/"), null, WebSocketVersion.V13, false, EmptyHttpHeaders.INSTANCE, 65536, true, false, true, WebSocketCloseStatus.NORMAL_CLOSURE, true, c.f49010a, -1L, false);
    }

    public boolean absoluteUpgradeUrl() {
        return this.absoluteUpgradeUrl;
    }

    public boolean allowExtensions() {
        return this.allowExtensions;
    }

    public boolean allowMaskMismatch() {
        return this.allowMaskMismatch;
    }

    public HttpHeaders customHeaders() {
        return this.customHeaders;
    }

    public boolean dropPongFrames() {
        return this.dropPongFrames;
    }

    public long forceCloseTimeoutMillis() {
        return this.forceCloseTimeoutMillis;
    }

    public boolean handleCloseFrames() {
        return this.handleCloseFrames;
    }

    public long handshakeTimeoutMillis() {
        return this.handshakeTimeoutMillis;
    }

    public int maxFramePayloadLength() {
        return this.maxFramePayloadLength;
    }

    public boolean performMasking() {
        return this.performMasking;
    }

    public WebSocketCloseStatus sendCloseFrame() {
        return this.sendCloseFrame;
    }

    public String subprotocol() {
        return this.subprotocol;
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        return "WebSocketClientProtocolConfig {webSocketUri=" + this.webSocketUri + ", subprotocol=" + this.subprotocol + ", version=" + this.version + ", allowExtensions=" + this.allowExtensions + ", customHeaders=" + this.customHeaders + ", maxFramePayloadLength=" + this.maxFramePayloadLength + ", performMasking=" + this.performMasking + ", allowMaskMismatch=" + this.allowMaskMismatch + ", handleCloseFrames=" + this.handleCloseFrames + ", sendCloseFrame=" + this.sendCloseFrame + ", dropPongFrames=" + this.dropPongFrames + ", handshakeTimeoutMillis=" + this.handshakeTimeoutMillis + ", forceCloseTimeoutMillis=" + this.forceCloseTimeoutMillis + ", absoluteUpgradeUrl=" + this.absoluteUpgradeUrl + "}";
    }

    public WebSocketVersion version() {
        return this.version;
    }

    public URI webSocketUri() {
        return this.webSocketUri;
    }

    private WebSocketClientProtocolConfig(URI uri, String str, WebSocketVersion webSocketVersion, boolean z4, HttpHeaders httpHeaders, int i4, boolean z5, boolean z6, boolean z7, WebSocketCloseStatus webSocketCloseStatus, boolean z8, long j4, long j5, boolean z9) {
        this.webSocketUri = uri;
        this.subprotocol = str;
        this.version = webSocketVersion;
        this.allowExtensions = z4;
        this.customHeaders = httpHeaders;
        this.maxFramePayloadLength = i4;
        this.performMasking = z5;
        this.allowMaskMismatch = z6;
        this.forceCloseTimeoutMillis = j5;
        this.handleCloseFrames = z7;
        this.sendCloseFrame = webSocketCloseStatus;
        this.dropPongFrames = z8;
        this.handshakeTimeoutMillis = ObjectUtil.checkPositive(j4, "handshakeTimeoutMillis");
        this.absoluteUpgradeUrl = z9;
    }
}
