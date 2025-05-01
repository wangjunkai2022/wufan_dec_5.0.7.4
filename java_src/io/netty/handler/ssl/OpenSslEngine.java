package io.netty.handler.ssl;

import io.netty.buffer.ByteBufAllocator;
/* loaded from: classes6.dex */
public final class OpenSslEngine extends ReferenceCountedOpenSslEngine {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenSslEngine(OpenSslContext openSslContext, ByteBufAllocator byteBufAllocator, String str, int i4, boolean z4) {
        super(openSslContext, byteBufAllocator, str, i4, z4, false);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        OpenSsl.releaseIfNeeded(this);
    }
}
