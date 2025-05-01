package io.netty.handler.codec.http.websocketx;
/* loaded from: classes6.dex */
public class WebSocket13FrameDecoder extends WebSocket08FrameDecoder {
    public WebSocket13FrameDecoder(boolean z4, boolean z5, int i4) {
        this(z4, z5, i4, false);
    }

    public WebSocket13FrameDecoder(boolean z4, boolean z5, int i4, boolean z6) {
        this(WebSocketDecoderConfig.newBuilder().expectMaskedFrames(z4).allowExtensions(z5).maxFramePayloadLength(i4).allowMaskMismatch(z6).build());
    }

    public WebSocket13FrameDecoder(WebSocketDecoderConfig webSocketDecoderConfig) {
        super(webSocketDecoderConfig);
    }
}
