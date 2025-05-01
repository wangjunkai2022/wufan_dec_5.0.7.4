package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AbstractH26XTrack.java */
/* loaded from: classes3.dex */
public abstract class c extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: k  reason: collision with root package name */
    static int f13412k = 67107840;

    /* renamed from: e  reason: collision with root package name */
    private com.googlecode.mp4parser.e f13413e;

    /* renamed from: f  reason: collision with root package name */
    protected long[] f13414f;

    /* renamed from: g  reason: collision with root package name */
    protected List<i.a> f13415g;

    /* renamed from: h  reason: collision with root package name */
    protected List<r0.a> f13416h;

    /* renamed from: i  reason: collision with root package name */
    protected List<Integer> f13417i;

    /* renamed from: j  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f13418j;

    /* compiled from: AbstractH26XTrack.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f13419a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f13420b = 0;

        /* renamed from: c  reason: collision with root package name */
        com.googlecode.mp4parser.e f13421c;

        /* renamed from: d  reason: collision with root package name */
        ByteBuffer f13422d;

        /* renamed from: e  reason: collision with root package name */
        long f13423e;

        public a(com.googlecode.mp4parser.e eVar) throws IOException {
            this.f13421c = eVar;
            c();
        }

        public void a() {
            this.f13420b++;
        }

        public void b() {
            int i4 = this.f13420b + 3;
            this.f13420b = i4;
            this.f13423e = this.f13419a + i4;
        }

        public void c() throws IOException {
            com.googlecode.mp4parser.e eVar = this.f13421c;
            this.f13422d = eVar.Q(this.f13419a, Math.min(eVar.size() - this.f13419a, c.f13412k));
        }

        public ByteBuffer d() {
            long j4 = this.f13423e;
            long j5 = this.f13419a;
            if (j4 >= j5) {
                this.f13422d.position((int) (j4 - j5));
                ByteBuffer slice = this.f13422d.slice();
                slice.limit((int) (this.f13420b - (this.f13423e - this.f13419a)));
                return slice;
            }
            throw new RuntimeException("damn! NAL exceeds buffer");
        }

        public boolean e() throws IOException {
            int limit = this.f13422d.limit();
            int i4 = this.f13420b;
            if (limit - i4 >= 3) {
                return this.f13422d.get(i4) == 0 && this.f13422d.get(this.f13420b + 1) == 0 && (this.f13422d.get(this.f13420b + 2) == 0 || this.f13422d.get(this.f13420b + 2) == 1);
            } else if (this.f13419a + i4 + 3 > this.f13421c.size()) {
                return this.f13419a + ((long) this.f13420b) == this.f13421c.size();
            } else {
                this.f13419a = this.f13423e;
                this.f13420b = 0;
                c();
                return e();
            }
        }

        public boolean f() throws IOException {
            int limit = this.f13422d.limit();
            int i4 = this.f13420b;
            if (limit - i4 >= 3) {
                return this.f13422d.get(i4) == 0 && this.f13422d.get(this.f13420b + 1) == 0 && this.f13422d.get(this.f13420b + 2) == 1;
            } else if (this.f13419a + i4 + 3 < this.f13421c.size()) {
                return false;
            } else {
                throw new EOFException();
            }
        }
    }

    public c(com.googlecode.mp4parser.e eVar) {
        super(eVar.toString());
        this.f13415g = new ArrayList();
        this.f13416h = new ArrayList();
        this.f13417i = new ArrayList();
        this.f13418j = new com.googlecode.mp4parser.authoring.i();
        this.f13413e = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputStream a(InputStream inputStream) {
        return new i(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] g(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        int remaining = duplicate.remaining();
        byte[] bArr = new byte[remaining];
        duplicate.get(bArr, 0, remaining);
        return bArr;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13418j;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13414f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13416h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.googlecode.mp4parser.authoring.f b(List<? extends ByteBuffer> list) {
        byte[] bArr = new byte[list.size() * 4];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        for (ByteBuffer byteBuffer : list) {
            wrap.putInt(byteBuffer.remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = i4 * 2;
            byteBufferArr[i5] = ByteBuffer.wrap(bArr, i4 * 4, 4);
            byteBufferArr[i5 + 1] = list.get(i4);
        }
        return new com.googlecode.mp4parser.authoring.g(byteBufferArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13413e.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ByteBuffer d(a aVar) throws IOException {
        while (!aVar.f()) {
            try {
                aVar.a();
            } catch (EOFException unused) {
                return null;
            }
        }
        aVar.b();
        while (!aVar.e()) {
            aVar.a();
        }
        return aVar.d();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return this.f13415g;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        long[] jArr = new long[this.f13417i.size()];
        for (int i4 = 0; i4 < this.f13417i.size(); i4++) {
            jArr[i4] = this.f13417i.get(i4).intValue();
        }
        return jArr;
    }
}
