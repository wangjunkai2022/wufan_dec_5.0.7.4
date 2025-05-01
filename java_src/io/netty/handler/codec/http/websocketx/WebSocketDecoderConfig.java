package io.netty.handler.codec.http.websocketx;

import io.netty.util.internal.ObjectUtil;
/* loaded from: classes6.dex */
public final class WebSocketDecoderConfig {
    static final WebSocketDecoderConfig DEFAULT = new WebSocketDecoderConfig(65536, true, false, false, true, true);
    private final boolean allowExtensions;
    private final boolean allowMaskMismatch;
    private final boolean closeOnProtocolViolation;
    private final boolean expectMaskedFrames;
    private final int maxFramePayloadLength;
    private final boolean withUTF8Validator;

    /* loaded from: classes6.dex */
    public static final class Builder {
        private boolean allowExtensions;
        private boolean allowMaskMismatch;
        private boolean closeOnProtocolViolation;
        private boolean expectMaskedFrames;
        private int maxFramePayloadLength;
        private boolean withUTF8Validator;

        public Builder allowExtensions(boolean z4) {
            this.allowExtensions = z4;
            return this;
        }

        public Builder allowMaskMismatch(boolean z4) {
            this.allowMaskMismatch = z4;
            return this;
        }

        public WebSocketDecoderConfig build() {
            return new WebSocketDecoderConfig(this.maxFramePayloadLength, this.expectMaskedFrames, this.allowMaskMismatch, this.allowExtensions, this.closeOnProtocolViolation, this.withUTF8Validator);
        }

        public Builder closeOnProtocolViolation(boolean z4) {
            this.closeOnProtocolViolation = z4;
            return this;
        }

        public Builder expectMaskedFrames(boolean z4) {
            this.expectMaskedFrames = z4;
            return this;
        }

        public Builder maxFramePayloadLength(int i4) {
            this.maxFramePayloadLength = i4;
            return this;
        }

        public Builder withUTF8Validator(boolean z4) {
            this.withUTF8Validator = z4;
            return this;
        }

        private Builder(WebSocketDecoderConfig webSocketDecoderConfig) {
            ObjectUtil.checkNotNull(webSocketDecoderConfig, "decoderConfig");
            this.maxFramePayloadLength = webSocketDecoderConfig.maxFramePayloadLength();
            this.expectMaskedFrames = webSocketDecoderConfig.expectMaskedFrames();
            this.allowMaskMismatch = webSocketDecoderConfig.allowMaskMismatch();
            this.allowExtensions = webSocketDecoderConfig.allowExtensions();
            this.closeOnProtocolViolation = webSocketDecoderConfig.closeOnProtocolViolation();
            this.withUTF8Validator = webSocketDecoderConfig.withUTF8Validator();
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean allowExtensions() {
        return this.allowExtensions;
    }

    public boolean allowMaskMismatch() {
        return this.allowMaskMismatch;
    }

    public boolean closeOnProtocolViolation() {
        return this.closeOnProtocolViolation;
    }

    public boolean expectMaskedFrames() {
        return this.expectMaskedFrames;
    }

    public int maxFramePayloadLength() {
        return this.maxFramePayloadLength;
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        return "WebSocketDecoderConfig [maxFramePayloadLength=" + this.maxFramePayloadLength + ", expectMaskedFrames=" + this.expectMaskedFrames + ", allowMaskMismatch=" + this.allowMaskMismatch + ", allowExtensions=" + this.allowExtensions + ", closeOnProtocolViolation=" + this.closeOnProtocolViolation + ", withUTF8Validator=" + this.withUTF8Validator + "]";
    }

    public boolean withUTF8Validator() {
        return this.withUTF8Validator;
    }

    private WebSocketDecoderConfig(int i4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.maxFramePayloadLength = i4;
        this.expectMaskedFrames = z4;
        this.allowMaskMismatch = z5;
        this.allowExtensions = z6;
        this.closeOnProtocolViolation = z7;
        this.withUTF8Validator = z8;
    }
}
