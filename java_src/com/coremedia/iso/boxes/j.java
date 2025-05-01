package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
/* compiled from: Container.java */
/* loaded from: classes2.dex */
public interface j {
    void b(List<d> list);

    <T extends d> List<T> g(Class<T> cls);

    <T extends d> List<T> l(Class<T> cls, boolean z4);

    ByteBuffer r(long j4, long j5) throws IOException;

    List<d> t();

    void u(WritableByteChannel writableByteChannel) throws IOException;
}
