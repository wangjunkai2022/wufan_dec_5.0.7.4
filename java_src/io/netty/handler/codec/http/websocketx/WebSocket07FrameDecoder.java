package io.netty.handler.codec.http.websocketx;
/* loaded from: classes6.dex */
public class WebSocket07FrameDecoder extends WebSocket08FrameDecoder {
    public WebSocket07FrameDecoder(boolean z4, boolean z5, int i4) {
        this(WebSocketDecoderConfig.newBuilder().expectMaskedFrames(z4).allowExtensions(z5).maxFramePayloadLength(i4).build());
    }

    public WebSocket07FrameDecoder(boolean z4, boolean z5, int i4, boolean z6) {
        this(WebSocketDecoderConfig.newBuilder().expectMaskedFrames(z4).allowExtensions(z5).maxFramePayloadLength(i4).allowMaskMismatch(z6).build());
    }

    public WebSocket07FrameDecoder(WebSocketDecoderConfig webSocketDecoderConfig) {
        super(webSocketDecoderConfig);
    }
}
