package org.apache.http.io;

import org.apache.http.HttpMessage;
/* loaded from: classes7.dex */
public interface HttpMessageWriterFactory<T extends HttpMessage> {
    HttpMessageWriter create(SessionOutputBuffer sessionOutputBuffer);
}
