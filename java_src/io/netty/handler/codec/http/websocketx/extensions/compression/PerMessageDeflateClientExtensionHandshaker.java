package io.netty.handler.codec.http.websocketx.extensions.compression;

import io.netty.handler.codec.compression.ZlibCodecFactory;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionDecoder;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider;
import io.netty.util.internal.ObjectUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes6.dex */
public final class PerMessageDeflateClientExtensionHandshaker implements WebSocketClientExtensionHandshaker {
    private final boolean allowClientNoContext;
    private final boolean allowClientWindowSize;
    private final int compressionLevel;
    private final WebSocketExtensionFilterProvider extensionFilterProvider;
    private final boolean requestedServerNoContext;
    private final int requestedServerWindowSize;

    /* loaded from: classes6.dex */
    private final class PermessageDeflateExtension implements WebSocketClientExtension {
        private final boolean clientNoContext;
        private final int clientWindowSize;
        private final WebSocketExtensionFilterProvider extensionFilterProvider;
        private final boolean serverNoContext;
        private final int serverWindowSize;

        PermessageDeflateExtension(boolean z4, int i4, boolean z5, int i5, WebSocketExtensionFilterProvider webSocketExtensionFilterProvider) {
            this.serverNoContext = z4;
            this.serverWindowSize = i4;
            this.clientNoContext = z5;
            this.clientWindowSize = i5;
            this.extensionFilterProvider = webSocketExtensionFilterProvider;
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public WebSocketExtensionDecoder newExtensionDecoder() {
            return new PerMessageDeflateDecoder(this.serverNoContext, this.extensionFilterProvider.decoderFilter());
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public WebSocketExtensionEncoder newExtensionEncoder() {
            return new PerMessageDeflateEncoder(PerMessageDeflateClientExtensionHandshaker.this.compressionLevel, this.clientWindowSize, this.clientNoContext, this.extensionFilterProvider.encoderFilter());
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public int rsv() {
            return 4;
        }
    }

    public PerMessageDeflateClientExtensionHandshaker() {
        this(6, ZlibCodecFactory.isSupportingWindowSizeAndMemLevel(), 15, false, false);
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker
    public WebSocketClientExtension handshakeExtension(WebSocketExtensionData webSocketExtensionData) {
        if ("permessage-deflate".equals(webSocketExtensionData.name())) {
            Iterator<Map.Entry<String, String>> it2 = webSocketExtensionData.parameters().entrySet().iterator();
            boolean z4 = false;
            boolean z5 = true;
            boolean z6 = false;
            int i4 = 15;
            boolean z7 = false;
            int i5 = 15;
            while (z5 && it2.hasNext()) {
                Map.Entry<String, String> next = it2.next();
                if ("client_max_window_bits".equalsIgnoreCase(next.getKey())) {
                    if (this.allowClientWindowSize) {
                        i5 = Integer.parseInt(next.getValue());
                    } else {
                        z5 = false;
                    }
                } else if ("server_max_window_bits".equalsIgnoreCase(next.getKey())) {
                    i4 = Integer.parseInt(next.getValue());
                    if (i5 <= 15 && i5 >= 8) {
                    }
                    z5 = false;
                } else if ("client_no_context_takeover".equalsIgnoreCase(next.getKey())) {
                    if (this.allowClientNoContext) {
                        z7 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    if ("server_no_context_takeover".equalsIgnoreCase(next.getKey()) && this.requestedServerNoContext) {
                        z6 = true;
                    }
                    z5 = false;
                }
            }
            if ((!this.requestedServerNoContext || z6) && this.requestedServerWindowSize == i4) {
                z4 = z5;
            }
            if (z4) {
                return new PermessageDeflateExtension(z6, i4, z7, i5, this.extensionFilterProvider);
            }
            return null;
        }
        return null;
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker
    public WebSocketExtensionData newRequestData() {
        HashMap hashMap = new HashMap(4);
        if (this.requestedServerWindowSize != 15) {
            hashMap.put("server_no_context_takeover", null);
        }
        if (this.allowClientNoContext) {
            hashMap.put("client_no_context_takeover", null);
        }
        int i4 = this.requestedServerWindowSize;
        if (i4 != 15) {
            hashMap.put("server_max_window_bits", Integer.toString(i4));
        }
        if (this.allowClientWindowSize) {
            hashMap.put("client_max_window_bits", null);
        }
        return new WebSocketExtensionData("permessage-deflate", hashMap);
    }

    public PerMessageDeflateClientExtensionHandshaker(int i4, boolean z4, int i5, boolean z5, boolean z6) {
        this(i4, z4, i5, z5, z6, WebSocketExtensionFilterProvider.DEFAULT);
    }

    public PerMessageDeflateClientExtensionHandshaker(int i4, boolean z4, int i5, boolean z5, boolean z6, WebSocketExtensionFilterProvider webSocketExtensionFilterProvider) {
        if (i5 > 15 || i5 < 8) {
            throw new IllegalArgumentException("requestedServerWindowSize: " + i5 + " (expected: 8-15)");
        } else if (i4 >= 0 && i4 <= 9) {
            this.compressionLevel = i4;
            this.allowClientWindowSize = z4;
            this.requestedServerWindowSize = i5;
            this.allowClientNoContext = z5;
            this.requestedServerNoContext = z6;
            this.extensionFilterProvider = (WebSocketExtensionFilterProvider) ObjectUtil.checkNotNull(webSocketExtensionFilterProvider, "extensionFilterProvider");
        } else {
            throw new IllegalArgumentException("compressionLevel: " + i4 + " (expected: 0-9)");
        }
    }
}
