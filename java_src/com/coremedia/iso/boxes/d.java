package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: Box.java */
/* loaded from: classes2.dex */
public interface d {
    void a(WritableByteChannel writableByteChannel) throws IOException;

    j getParent();

    long getSize();

    String getType();

    long j();

    void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException;

    void p(j jVar);
}
