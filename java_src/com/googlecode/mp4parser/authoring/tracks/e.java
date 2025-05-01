package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.s0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Avc1ToAvc3TrackImpl.java */
/* loaded from: classes3.dex */
public class e extends com.googlecode.mp4parser.authoring.j {

    /* renamed from: c  reason: collision with root package name */
    s0 f13427c;

    /* renamed from: d  reason: collision with root package name */
    com.mp4parser.iso14496.part15.a f13428d;

    /* renamed from: e  reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f13429e;

    /* compiled from: Avc1ToAvc3TrackImpl.java */
    /* loaded from: classes3.dex */
    private class a extends AbstractList<com.googlecode.mp4parser.authoring.f> {

        /* renamed from: b  reason: collision with root package name */
        List<com.googlecode.mp4parser.authoring.f> f13430b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Avc1ToAvc3TrackImpl.java */
        /* renamed from: com.googlecode.mp4parser.authoring.tracks.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0295a implements com.googlecode.mp4parser.authoring.f {

            /* renamed from: b  reason: collision with root package name */
            private final /* synthetic */ ByteBuffer f13433b;

            /* renamed from: c  reason: collision with root package name */
            private final /* synthetic */ int f13434c;

            /* renamed from: d  reason: collision with root package name */
            private final /* synthetic */ com.googlecode.mp4parser.authoring.f f13435d;

            C0295a(ByteBuffer byteBuffer, int i4, com.googlecode.mp4parser.authoring.f fVar) {
                this.f13433b = byteBuffer;
                this.f13434c = i4;
                this.f13435d = fVar;
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public ByteBuffer a() {
                int i4 = 0;
                for (byte[] bArr : e.this.f13428d.F()) {
                    i4 += this.f13434c + bArr.length;
                }
                for (byte[] bArr2 : e.this.f13428d.E()) {
                    i4 += this.f13434c + bArr2.length;
                }
                for (byte[] bArr3 : e.this.f13428d.B()) {
                    i4 += this.f13434c + bArr3.length;
                }
                ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(this.f13435d.getSize()) + i4);
                for (byte[] bArr4 : e.this.f13428d.F()) {
                    com.coremedia.iso.j.a(bArr4.length, allocate, this.f13434c);
                    allocate.put(bArr4);
                }
                for (byte[] bArr5 : e.this.f13428d.E()) {
                    com.coremedia.iso.j.a(bArr5.length, allocate, this.f13434c);
                    allocate.put(bArr5);
                }
                for (byte[] bArr6 : e.this.f13428d.B()) {
                    com.coremedia.iso.j.a(bArr6.length, allocate, this.f13434c);
                    allocate.put(bArr6);
                }
                allocate.put(this.f13435d.a());
                return (ByteBuffer) allocate.rewind();
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public void b(WritableByteChannel writableByteChannel) throws IOException {
                for (byte[] bArr : e.this.f13428d.F()) {
                    com.coremedia.iso.j.a(bArr.length, (ByteBuffer) this.f13433b.rewind(), this.f13434c);
                    writableByteChannel.write((ByteBuffer) this.f13433b.rewind());
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                }
                for (byte[] bArr2 : e.this.f13428d.E()) {
                    com.coremedia.iso.j.a(bArr2.length, (ByteBuffer) this.f13433b.rewind(), this.f13434c);
                    writableByteChannel.write((ByteBuffer) this.f13433b.rewind());
                    writableByteChannel.write(ByteBuffer.wrap(bArr2));
                }
                for (byte[] bArr3 : e.this.f13428d.B()) {
                    com.coremedia.iso.j.a(bArr3.length, (ByteBuffer) this.f13433b.rewind(), this.f13434c);
                    writableByteChannel.write((ByteBuffer) this.f13433b.rewind());
                    writableByteChannel.write(ByteBuffer.wrap(bArr3));
                }
                this.f13435d.b(writableByteChannel);
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public long getSize() {
                int i4 = 0;
                for (byte[] bArr : e.this.f13428d.F()) {
                    i4 += this.f13434c + bArr.length;
                }
                for (byte[] bArr2 : e.this.f13428d.E()) {
                    i4 += this.f13434c + bArr2.length;
                }
                for (byte[] bArr3 : e.this.f13428d.B()) {
                    i4 += this.f13434c + bArr3.length;
                }
                return this.f13435d.getSize() + i4;
            }
        }

        public a(List<com.googlecode.mp4parser.authoring.f> list) {
            this.f13430b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public com.googlecode.mp4parser.authoring.f get(int i4) {
            if (Arrays.binarySearch(e.this.q(), i4 + 1) >= 0) {
                int z4 = e.this.f13428d.z() + 1;
                return new C0295a(ByteBuffer.allocate(z4), z4, this.f13430b.get(i4));
            }
            return this.f13430b.get(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13430b.size();
        }
    }

    public e(com.googlecode.mp4parser.authoring.h hVar) throws IOException {
        super(hVar);
        if (com.coremedia.iso.boxes.sampleentry.h.f9920z.equals(hVar.o().C().getType())) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            hVar.o().a(Channels.newChannel(byteArrayOutputStream));
            s0 s0Var = (s0) com.googlecode.mp4parser.util.m.d(new com.coremedia.iso.f(new com.googlecode.mp4parser.i(byteArrayOutputStream.toByteArray())), s0.f9868q);
            this.f13427c = s0Var;
            ((com.coremedia.iso.boxes.sampleentry.h) s0Var.C()).Y(com.coremedia.iso.boxes.sampleentry.h.A);
            this.f13428d = (com.mp4parser.iso14496.part15.a) com.googlecode.mp4parser.util.m.e(this.f13427c, "avc./avcC");
            this.f13429e = new a(hVar.x());
            return;
        }
        throw new RuntimeException("Only avc1 tracks can be converted to avc3 tracks");
    }

    @Override // com.googlecode.mp4parser.authoring.j, com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13427c;
    }

    @Override // com.googlecode.mp4parser.authoring.j, com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13429e;
    }
}
