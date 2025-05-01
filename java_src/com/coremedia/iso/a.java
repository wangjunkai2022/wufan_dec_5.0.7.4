package com.coremedia.iso;

import com.coremedia.iso.boxes.k1;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
/* compiled from: AbstractBoxParser.java */
/* loaded from: classes2.dex */
public abstract class a implements c {

    /* renamed from: b  reason: collision with root package name */
    private static Logger f9477b = Logger.getLogger(a.class.getName());

    /* renamed from: a  reason: collision with root package name */
    ThreadLocal<ByteBuffer> f9478a = new C0240a();

    /* compiled from: AbstractBoxParser.java */
    /* renamed from: com.coremedia.iso.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0240a extends ThreadLocal<ByteBuffer> {
        C0240a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }

    @Override // com.coremedia.iso.c
    public com.coremedia.iso.boxes.d a(com.googlecode.mp4parser.e eVar, com.coremedia.iso.boxes.j jVar) throws IOException {
        int read;
        long size;
        byte[] bArr;
        long position = eVar.position();
        this.f9478a.get().rewind().limit(8);
        do {
            read = eVar.read(this.f9478a.get());
            if (read == 8) {
                this.f9478a.get().rewind();
                long l4 = g.l(this.f9478a.get());
                if (l4 < 8 && l4 > 1) {
                    f9477b.severe("Plausibility check failed: size < 8 (size = " + l4 + "). Stop parsing!");
                    return null;
                }
                String b5 = g.b(this.f9478a.get());
                if (l4 == 1) {
                    this.f9478a.get().limit(16);
                    eVar.read(this.f9478a.get());
                    this.f9478a.get().position(8);
                    size = g.o(this.f9478a.get()) - 16;
                } else {
                    size = l4 == 0 ? eVar.size() - eVar.position() : l4 - 8;
                }
                if (k1.f9761p.equals(b5)) {
                    this.f9478a.get().limit(this.f9478a.get().limit() + 16);
                    eVar.read(this.f9478a.get());
                    bArr = new byte[16];
                    for (int position2 = this.f9478a.get().position() - 16; position2 < this.f9478a.get().position(); position2++) {
                        bArr[position2 - (this.f9478a.get().position() - 16)] = this.f9478a.get().get(position2);
                    }
                    size -= 16;
                } else {
                    bArr = null;
                }
                long j4 = size;
                com.coremedia.iso.boxes.d b6 = b(b5, bArr, jVar instanceof com.coremedia.iso.boxes.d ? ((com.coremedia.iso.boxes.d) jVar).getType() : "");
                b6.p(jVar);
                this.f9478a.get().rewind();
                b6.k(eVar, this.f9478a.get(), j4, this);
                return b6;
            }
        } while (read >= 0);
        eVar.G(position);
        throw new EOFException();
    }

    public abstract com.coremedia.iso.boxes.d b(String str, byte[] bArr, String str2);
}
