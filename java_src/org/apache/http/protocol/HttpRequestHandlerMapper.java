package org.apache.http.protocol;

import org.apache.http.HttpRequest;
/* loaded from: classes7.dex */
public interface HttpRequestHandlerMapper {
    HttpRequestHandler lookup(HttpRequest httpRequest);
}
