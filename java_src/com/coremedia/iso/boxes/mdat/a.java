package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.boxes.d;
import com.coremedia.iso.boxes.j;
import com.coremedia.iso.c;
import com.googlecode.mp4parser.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;
/* compiled from: MediaDataBox.java */
/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: g  reason: collision with root package name */
    private static Logger f9797g = Logger.getLogger(a.class.getName());

    /* renamed from: h  reason: collision with root package name */
    public static final String f9798h = "mdat";

    /* renamed from: b  reason: collision with root package name */
    j f9799b;

    /* renamed from: c  reason: collision with root package name */
    boolean f9800c = false;

    /* renamed from: d  reason: collision with root package name */
    private e f9801d;

    /* renamed from: e  reason: collision with root package name */
    private long f9802e;

    /* renamed from: f  reason: collision with root package name */
    private long f9803f;

    private static void b(e eVar, long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        long j6 = 0;
        while (j6 < j5) {
            j6 += eVar.m(j4 + j6, Math.min(67076096L, j5 - j6), writableByteChannel);
        }
    }

    @Override // com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        b(this.f9801d, this.f9802e, this.f9803f, writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.d
    public j getParent() {
        return this.f9799b;
    }

    @Override // com.coremedia.iso.boxes.d
    public long getSize() {
        return this.f9803f;
    }

    @Override // com.coremedia.iso.boxes.d
    public String getType() {
        return f9798h;
    }

    @Override // com.coremedia.iso.boxes.d
    public long j() {
        return this.f9802e;
    }

    @Override // com.coremedia.iso.boxes.d
    public void k(e eVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        this.f9802e = eVar.position() - byteBuffer.remaining();
        this.f9801d = eVar;
        this.f9803f = byteBuffer.remaining() + j4;
        eVar.G(eVar.position() + j4);
    }

    @Override // com.coremedia.iso.boxes.d
    public void p(j jVar) {
        this.f9799b = jVar;
    }

    public String toString() {
        return "MediaDataBox{size=" + this.f9803f + '}';
    }
}
