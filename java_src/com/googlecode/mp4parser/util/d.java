package com.googlecode.mp4parser.util;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
/* compiled from: ChannelHelper.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static ByteBuffer f14217a = ByteBuffer.allocate(0).asReadOnlyBuffer();

    public static int a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i4) throws IOException {
        int read;
        int i5 = 0;
        do {
            read = readableByteChannel.read(byteBuffer);
            if (-1 == read) {
                break;
            }
            i5 += read;
        } while (i5 != i4);
        if (read != -1) {
            return i5;
        }
        throw new EOFException("End of file. No more boxes.");
    }

    public static void b(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        a(readableByteChannel, byteBuffer, byteBuffer.remaining());
    }
}
