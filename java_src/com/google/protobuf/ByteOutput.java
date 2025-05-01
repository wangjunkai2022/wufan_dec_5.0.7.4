package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public abstract class ByteOutput {
    public abstract void write(byte b5) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i4, int i5) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i4, int i5) throws IOException;
}
