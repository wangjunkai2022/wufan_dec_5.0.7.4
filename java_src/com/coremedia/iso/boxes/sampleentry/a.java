package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: AbstractSampleEntry.java */
/* loaded from: classes2.dex */
public abstract class a extends com.googlecode.mp4parser.b implements f {

    /* renamed from: o  reason: collision with root package name */
    protected int f9871o;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str) {
        super(str);
        this.f9871o = 1;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public abstract void a(WritableByteChannel writableByteChannel) throws IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.f
    public void d(int i4) {
        this.f9871o = i4;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.f
    public int h() {
        return this.f9871o;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public abstract void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException;
}
