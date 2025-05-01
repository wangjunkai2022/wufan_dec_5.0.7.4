package io.netty.handler.ssl;

import io.netty.buffer.ByteBufAllocator;
import java.security.cert.Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
/* loaded from: classes6.dex */
public abstract class OpenSslContext extends ReferenceCountedOpenSslContext {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenSslContext(Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, ApplicationProtocolConfig applicationProtocolConfig, long j4, long j5, int i4, Certificate[] certificateArr, ClientAuth clientAuth, String[] strArr, boolean z4, boolean z5) throws SSLException {
        super(iterable, cipherSuiteFilter, applicationProtocolConfig, j4, j5, i4, certificateArr, clientAuth, strArr, z4, z5, false);
    }

    protected final void finalize() throws Throwable {
        super.finalize();
        OpenSsl.releaseIfNeeded(this);
    }

    @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext
    final SSLEngine newEngine0(ByteBufAllocator byteBufAllocator, String str, int i4, boolean z4) {
        return new OpenSslEngine(this, byteBufAllocator, str, i4, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenSslContext(Iterable<String> iterable, CipherSuiteFilter cipherSuiteFilter, OpenSslApplicationProtocolNegotiator openSslApplicationProtocolNegotiator, long j4, long j5, int i4, Certificate[] certificateArr, ClientAuth clientAuth, String[] strArr, boolean z4, boolean z5) throws SSLException {
        super(iterable, cipherSuiteFilter, openSslApplicationProtocolNegotiator, j4, j5, i4, certificateArr, clientAuth, strArr, z4, z5, false);
    }
}
