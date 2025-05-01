package io.netty.handler.ssl;

import io.netty.buffer.ByteBufAllocator;
import io.netty.util.internal.ObjectUtil;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSessionContext;
/* loaded from: classes6.dex */
public abstract class DelegatingSslContext extends SslContext {
    private final SslContext ctx;

    protected DelegatingSslContext(SslContext sslContext) {
        this.ctx = (SslContext) ObjectUtil.checkNotNull(sslContext, "ctx");
    }

    @Override // io.netty.handler.ssl.SslContext
    public final ApplicationProtocolNegotiator applicationProtocolNegotiator() {
        return this.ctx.applicationProtocolNegotiator();
    }

    @Override // io.netty.handler.ssl.SslContext
    public final List<String> cipherSuites() {
        return this.ctx.cipherSuites();
    }

    protected abstract void initEngine(SSLEngine sSLEngine);

    protected void initHandler(SslHandler sslHandler) {
        initEngine(sslHandler.engine());
    }

    @Override // io.netty.handler.ssl.SslContext
    public final boolean isClient() {
        return this.ctx.isClient();
    }

    @Override // io.netty.handler.ssl.SslContext
    public final SSLEngine newEngine(ByteBufAllocator byteBufAllocator) {
        SSLEngine newEngine = this.ctx.newEngine(byteBufAllocator);
        initEngine(newEngine);
        return newEngine;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.ssl.SslContext
    public final SslHandler newHandler(ByteBufAllocator byteBufAllocator, boolean z4) {
        SslHandler newHandler = this.ctx.newHandler(byteBufAllocator, z4);
        initHandler(newHandler);
        return newHandler;
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionCacheSize() {
        return this.ctx.sessionCacheSize();
    }

    @Override // io.netty.handler.ssl.SslContext
    public final SSLSessionContext sessionContext() {
        return this.ctx.sessionContext();
    }

    @Override // io.netty.handler.ssl.SslContext
    public final long sessionTimeout() {
        return this.ctx.sessionTimeout();
    }

    @Override // io.netty.handler.ssl.SslContext
    public final SSLEngine newEngine(ByteBufAllocator byteBufAllocator, String str, int i4) {
        SSLEngine newEngine = this.ctx.newEngine(byteBufAllocator, str, i4);
        initEngine(newEngine);
        return newEngine;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.ssl.SslContext
    public final SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i4, boolean z4) {
        SslHandler newHandler = this.ctx.newHandler(byteBufAllocator, str, i4, z4);
        initHandler(newHandler);
        return newHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.ssl.SslContext
    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, boolean z4, Executor executor) {
        SslHandler newHandler = this.ctx.newHandler(byteBufAllocator, z4, executor);
        initHandler(newHandler);
        return newHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.ssl.SslContext
    public SslHandler newHandler(ByteBufAllocator byteBufAllocator, String str, int i4, boolean z4, Executor executor) {
        SslHandler newHandler = this.ctx.newHandler(byteBufAllocator, str, i4, z4, executor);
        initHandler(newHandler);
        return newHandler;
    }
}
