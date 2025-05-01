package io.netty.handler.ssl;

import com.tencent.cos.common.COSHttpResponseKey;
import io.netty.internal.tcnative.SSL;
import io.netty.internal.tcnative.SSLContext;
import io.netty.internal.tcnative.SessionTicketKey;
import io.netty.util.internal.ObjectUtil;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Lock;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
/* loaded from: classes6.dex */
public abstract class OpenSslSessionContext implements SSLSessionContext {
    private static final Enumeration<byte[]> EMPTY = new EmptyEnumeration();
    final ReferenceCountedOpenSslContext context;
    private final OpenSslKeyMaterialProvider provider;
    private final OpenSslSessionStats stats;

    /* loaded from: classes6.dex */
    private static final class EmptyEnumeration implements Enumeration<byte[]> {
        private EmptyEnumeration() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public byte[] nextElement() {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenSslSessionContext(ReferenceCountedOpenSslContext referenceCountedOpenSslContext, OpenSslKeyMaterialProvider openSslKeyMaterialProvider) {
        this.context = referenceCountedOpenSslContext;
        this.provider = openSslKeyMaterialProvider;
        this.stats = new OpenSslSessionStats(referenceCountedOpenSslContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void destroy() {
        OpenSslKeyMaterialProvider openSslKeyMaterialProvider = this.provider;
        if (openSslKeyMaterialProvider != null) {
            openSslKeyMaterialProvider.destroy();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public Enumeration<byte[]> getIds() {
        return EMPTY;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public SSLSession getSession(byte[] bArr) {
        ObjectUtil.checkNotNull(bArr, "bytes");
        return null;
    }

    public abstract boolean isSessionCacheEnabled();

    public abstract void setSessionCacheEnabled(boolean z4);

    @Deprecated
    public void setTicketKeys(byte[] bArr) {
        if (bArr.length % 48 == 0) {
            int length = bArr.length / 48;
            SessionTicketKey[] sessionTicketKeyArr = new SessionTicketKey[length];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i5, 16);
                int i6 = i5 + 16;
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i6, 16);
                int i7 = i4 + 16;
                byte[] copyOfRange3 = Arrays.copyOfRange(bArr, i6, 16);
                i5 = i6 + 16;
                sessionTicketKeyArr[i7] = new SessionTicketKey(copyOfRange, copyOfRange2, copyOfRange3);
                i4 = i7 + 1;
            }
            Lock writeLock = this.context.ctxLock.writeLock();
            writeLock.lock();
            try {
                SSLContext.clearOptions(this.context.ctx, SSL.SSL_OP_NO_TICKET);
                SSLContext.setSessionTicketKeys(this.context.ctx, sessionTicketKeyArr);
                return;
            } finally {
                writeLock.unlock();
            }
        }
        throw new IllegalArgumentException("keys.length % 48 != 0");
    }

    public OpenSslSessionStats stats() {
        return this.stats;
    }

    public void setTicketKeys(OpenSslSessionTicketKey... openSslSessionTicketKeyArr) {
        ObjectUtil.checkNotNull(openSslSessionTicketKeyArr, COSHttpResponseKey.Data.KEYS);
        int length = openSslSessionTicketKeyArr.length;
        SessionTicketKey[] sessionTicketKeyArr = new SessionTicketKey[length];
        for (int i4 = 0; i4 < length; i4++) {
            sessionTicketKeyArr[i4] = openSslSessionTicketKeyArr[i4].key;
        }
        Lock writeLock = this.context.ctxLock.writeLock();
        writeLock.lock();
        try {
            SSLContext.clearOptions(this.context.ctx, SSL.SSL_OP_NO_TICKET);
            SSLContext.setSessionTicketKeys(this.context.ctx, sessionTicketKeyArr);
        } finally {
            writeLock.unlock();
        }
    }
}
