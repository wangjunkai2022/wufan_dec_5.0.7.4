package com.fasterxml.jackson.core.async;

import java.io.IOException;
/* loaded from: classes2.dex */
public interface ByteArrayFeeder extends NonBlockingInputFeeder {
    void feedInput(byte[] bArr, int i4, int i5) throws IOException;
}
