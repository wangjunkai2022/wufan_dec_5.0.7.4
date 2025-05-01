package io.netty.handler.codec.http2;

import io.netty.handler.codec.http2.AbstractInboundHttp2ToHttpAdapterBuilder;
import io.netty.handler.codec.http2.InboundHttp2ToHttpAdapter;
import io.netty.util.internal.ObjectUtil;
/* loaded from: classes6.dex */
public abstract class AbstractInboundHttp2ToHttpAdapterBuilder<T extends InboundHttp2ToHttpAdapter, B extends AbstractInboundHttp2ToHttpAdapterBuilder<T, B>> {
    private final Http2Connection connection;
    private int maxContentLength;
    private boolean propagateSettings;
    private boolean validateHttpHeaders;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInboundHttp2ToHttpAdapterBuilder(Http2Connection http2Connection) {
        this.connection = (Http2Connection) ObjectUtil.checkNotNull(http2Connection, "connection");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T build() {
        try {
            T build = build(connection(), maxContentLength(), isValidateHttpHeaders(), isPropagateSettings());
            this.connection.addListener(build);
            return build;
        } catch (Throwable th) {
            throw new IllegalStateException("failed to create a new InboundHttp2ToHttpAdapter", th);
        }
    }

    protected abstract T build(Http2Connection http2Connection, int i4, boolean z4, boolean z5) throws Exception;

    protected Http2Connection connection() {
        return this.connection;
    }

    protected boolean isPropagateSettings() {
        return this.propagateSettings;
    }

    protected boolean isValidateHttpHeaders() {
        return this.validateHttpHeaders;
    }

    protected int maxContentLength() {
        return this.maxContentLength;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public B propagateSettings(boolean z4) {
        this.propagateSettings = z4;
        return self();
    }

    protected final B self() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public B validateHttpHeaders(boolean z4) {
        this.validateHttpHeaders = z4;
        return self();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public B maxContentLength(int i4) {
        this.maxContentLength = i4;
        return self();
    }
}
