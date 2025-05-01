package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.k1;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AbstractBox.java */
/* loaded from: classes3.dex */
public abstract class a implements com.coremedia.iso.boxes.d {

    /* renamed from: m  reason: collision with root package name */
    private static com.googlecode.mp4parser.util.j f13142m = com.googlecode.mp4parser.util.j.a(a.class);

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ boolean f13143n = false;

    /* renamed from: b  reason: collision with root package name */
    protected String f13144b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f13145c;

    /* renamed from: d  reason: collision with root package name */
    private com.coremedia.iso.boxes.j f13146d;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f13149g;

    /* renamed from: h  reason: collision with root package name */
    long f13150h;

    /* renamed from: i  reason: collision with root package name */
    long f13151i;

    /* renamed from: k  reason: collision with root package name */
    e f13153k;

    /* renamed from: j  reason: collision with root package name */
    long f13152j = -1;

    /* renamed from: l  reason: collision with root package name */
    private ByteBuffer f13154l = null;

    /* renamed from: f  reason: collision with root package name */
    boolean f13148f = true;

    /* renamed from: e  reason: collision with root package name */
    boolean f13147e = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str) {
        this.f13144b = str;
    }

    private void f(ByteBuffer byteBuffer) {
        if (m()) {
            com.coremedia.iso.i.i(byteBuffer, getSize());
            byteBuffer.put(com.coremedia.iso.f.C(getType()));
        } else {
            com.coremedia.iso.i.i(byteBuffer, 1L);
            byteBuffer.put(com.coremedia.iso.f.C(getType()));
            com.coremedia.iso.i.l(byteBuffer, getSize());
        }
        if (k1.f9761p.equals(getType())) {
            byteBuffer.put(i());
        }
    }

    private boolean m() {
        int i4 = k1.f9761p.equals(getType()) ? 24 : 8;
        if (!this.f13148f) {
            return this.f13152j + ((long) i4) < IjkMediaMeta.AV_CH_WIDE_RIGHT;
        } else if (!this.f13147e) {
            return ((long) (this.f13149g.limit() + i4)) < IjkMediaMeta.AV_CH_WIDE_RIGHT;
        } else {
            long e5 = e();
            ByteBuffer byteBuffer = this.f13154l;
            return (e5 + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i4) < IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
    }

    private synchronized void o() {
        if (!this.f13148f) {
            try {
                com.googlecode.mp4parser.util.j jVar = f13142m;
                jVar.b("mem mapping " + getType());
                this.f13149g = this.f13153k.Q(this.f13150h, this.f13152j);
                this.f13148f = true;
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    private boolean r(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(e() + (this.f13154l != null ? byteBuffer2.limit() : 0)));
        c(allocate);
        ByteBuffer byteBuffer3 = this.f13154l;
        if (byteBuffer3 != null) {
            byteBuffer3.rewind();
            while (this.f13154l.remaining() > 0) {
                allocate.put(this.f13154l);
            }
        }
        byteBuffer.rewind();
        allocate.rewind();
        if (byteBuffer.remaining() != allocate.remaining()) {
            System.err.print(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + allocate.remaining());
            f13142m.c(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + allocate.remaining());
            return false;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 1;
        int limit2 = allocate.limit() - 1;
        while (limit >= position) {
            byte b5 = byteBuffer.get(limit);
            byte b6 = allocate.get(limit2);
            if (b5 != b6) {
                f13142m.c(String.format("%s: buffers differ at %d: %2X/%2X", getType(), Integer.valueOf(limit), Byte.valueOf(b5), Byte.valueOf(b6)));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[allocate.remaining()];
                byteBuffer.get(bArr);
                allocate.get(bArr2);
                System.err.println("original      : " + com.coremedia.iso.e.c(bArr, 4));
                System.err.println("reconstructed : " + com.coremedia.iso.e.c(bArr2, 4));
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    @Override // com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        if (this.f13148f) {
            if (this.f13147e) {
                ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(getSize()));
                f(allocate);
                c(allocate);
                ByteBuffer byteBuffer = this.f13154l;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    while (this.f13154l.remaining() > 0) {
                        allocate.put(this.f13154l);
                    }
                }
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                return;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate((m() ? 8 : 16) + (k1.f9761p.equals(getType()) ? 16 : 0));
            f(allocate2);
            writableByteChannel.write((ByteBuffer) allocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.f13149g.position(0));
            return;
        }
        ByteBuffer allocate3 = ByteBuffer.allocate((m() ? 8 : 16) + (k1.f9761p.equals(getType()) ? 16 : 0));
        f(allocate3);
        writableByteChannel.write((ByteBuffer) allocate3.rewind());
        this.f13153k.m(this.f13150h, this.f13152j, writableByteChannel);
    }

    protected abstract void b(ByteBuffer byteBuffer);

    protected abstract void c(ByteBuffer byteBuffer);

    protected abstract long e();

    @DoNotParseDetail
    public String g() {
        return m.a(this);
    }

    @Override // com.coremedia.iso.boxes.d
    @DoNotParseDetail
    public com.coremedia.iso.boxes.j getParent() {
        return this.f13146d;
    }

    @Override // com.coremedia.iso.boxes.d
    public long getSize() {
        long j4;
        ByteBuffer byteBuffer;
        if (!this.f13148f) {
            j4 = this.f13152j;
        } else if (this.f13147e) {
            j4 = e();
        } else {
            ByteBuffer byteBuffer2 = this.f13149g;
            j4 = byteBuffer2 != null ? byteBuffer2.limit() : 0;
        }
        return j4 + (j4 >= 4294967288L ? 8 : 0) + 8 + (k1.f9761p.equals(getType()) ? 16 : 0) + (this.f13154l != null ? byteBuffer.limit() : 0);
    }

    @Override // com.coremedia.iso.boxes.d
    @DoNotParseDetail
    public String getType() {
        return this.f13144b;
    }

    @DoNotParseDetail
    public byte[] i() {
        return this.f13145c;
    }

    @Override // com.coremedia.iso.boxes.d
    public long j() {
        return this.f13151i;
    }

    @Override // com.coremedia.iso.boxes.d
    @DoNotParseDetail
    public void k(e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        long position = eVar.position();
        this.f13150h = position;
        this.f13151i = position - byteBuffer.remaining();
        this.f13152j = j4;
        this.f13153k = eVar;
        eVar.G(eVar.position() + j4);
        this.f13148f = false;
        this.f13147e = false;
    }

    public boolean l() {
        return this.f13147e;
    }

    public final synchronized void n() {
        o();
        com.googlecode.mp4parser.util.j jVar = f13142m;
        jVar.b("parsing details of " + getType());
        ByteBuffer byteBuffer = this.f13149g;
        if (byteBuffer != null) {
            this.f13147e = true;
            byteBuffer.rewind();
            b(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f13154l = byteBuffer.slice();
            }
            this.f13149g = null;
        }
    }

    @Override // com.coremedia.iso.boxes.d
    @DoNotParseDetail
    public void p(com.coremedia.iso.boxes.j jVar) {
        this.f13146d = jVar;
    }

    protected void q(ByteBuffer byteBuffer) {
        this.f13154l = byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str, byte[] bArr) {
        this.f13144b = str;
        this.f13145c = bArr;
    }
}
