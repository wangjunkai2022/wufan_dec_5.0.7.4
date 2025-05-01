package org.apache.http.pool;

import java.io.IOException;
/* loaded from: classes7.dex */
public interface ConnFactory<T, C> {
    C create(T t4) throws IOException;
}
