package org.apache.http.conn;

import org.apache.http.HttpConnection;
import org.apache.http.config.ConnectionConfig;
/* loaded from: classes7.dex */
public interface HttpConnectionFactory<T, C extends HttpConnection> {
    C create(T t4, ConnectionConfig connectionConfig);
}
