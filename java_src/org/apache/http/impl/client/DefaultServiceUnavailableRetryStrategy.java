package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
@Immutable
/* loaded from: classes7.dex */
public class DefaultServiceUnavailableRetryStrategy implements ServiceUnavailableRetryStrategy {
    private final int maxRetries;
    private final long retryInterval;

    public DefaultServiceUnavailableRetryStrategy(int i4, int i5) {
        Args.positive(i4, "Max retries");
        Args.positive(i5, "Retry interval");
        this.maxRetries = i4;
        this.retryInterval = i5;
    }

    @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
    public long getRetryInterval() {
        return this.retryInterval;
    }

    @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
    public boolean retryRequest(HttpResponse httpResponse, int i4, HttpContext httpContext) {
        return i4 <= this.maxRetries && httpResponse.getStatusLine().getStatusCode() == 503;
    }

    public DefaultServiceUnavailableRetryStrategy() {
        this(1, 1000);
    }
}
