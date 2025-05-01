package com.mp4parser.iso14496.part30;

import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: WebVTTSampleEntry.java */
/* loaded from: classes5.dex */
public class b extends com.coremedia.iso.boxes.sampleentry.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f57242p = "wvtt";

    public b() {
        super(f57242p);
    }

    public a C() {
        return (a) m.e(this, a.f57238p);
    }

    public c D() {
        return (c) m.e(this, c.f57243p);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        u(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        z(eVar, j4, cVar);
    }
}
