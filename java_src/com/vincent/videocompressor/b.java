package com.vincent.videocompressor;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.c1;
import com.coremedia.iso.boxes.d0;
import com.coremedia.iso.boxes.d1;
import com.coremedia.iso.boxes.e0;
import com.coremedia.iso.boxes.f0;
import com.coremedia.iso.boxes.f1;
import com.coremedia.iso.boxes.g1;
import com.coremedia.iso.boxes.h0;
import com.coremedia.iso.boxes.i0;
import com.coremedia.iso.boxes.j;
import com.coremedia.iso.boxes.n;
import com.coremedia.iso.boxes.o;
import com.coremedia.iso.boxes.s;
import com.coremedia.iso.boxes.t0;
import com.coremedia.iso.boxes.u0;
import com.coremedia.iso.boxes.v0;
import com.coremedia.iso.boxes.x;
import com.coremedia.iso.boxes.z0;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.util.l;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: MP4Builder.java */
@TargetApi(16)
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private C0683b f64761a = null;

    /* renamed from: b  reason: collision with root package name */
    private c f64762b = null;

    /* renamed from: c  reason: collision with root package name */
    private FileOutputStream f64763c = null;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f64764d = null;

    /* renamed from: e  reason: collision with root package name */
    private long f64765e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f64766f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f64767g = true;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<g, long[]> f64768h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private ByteBuffer f64769i = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MP4Builder.java */
    /* renamed from: com.vincent.videocompressor.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C0683b implements com.coremedia.iso.boxes.d {

        /* renamed from: b  reason: collision with root package name */
        private j f64770b;

        /* renamed from: c  reason: collision with root package name */
        private long f64771c;

        /* renamed from: d  reason: collision with root package name */
        private long f64772d;

        private C0683b() {
            this.f64771c = 1073741824L;
            this.f64772d = 0L;
        }

        private boolean c(long j4) {
            return j4 + 8 < IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }

        @Override // com.coremedia.iso.boxes.d
        public void a(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (c(size)) {
                i.i(allocate, size);
            } else {
                i.i(allocate, 1L);
            }
            allocate.put(com.coremedia.iso.f.C(com.coremedia.iso.boxes.mdat.a.f9798h));
            if (c(size)) {
                allocate.put(new byte[8]);
            } else {
                i.l(allocate, size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
        }

        public long b() {
            return this.f64771c;
        }

        public void e(long j4) {
            this.f64771c = j4;
        }

        public void f(long j4) {
            this.f64772d = j4;
        }

        @Override // com.coremedia.iso.boxes.d
        public j getParent() {
            return this.f64770b;
        }

        @Override // com.coremedia.iso.boxes.d
        public long getSize() {
            return this.f64771c + 16;
        }

        @Override // com.coremedia.iso.boxes.d
        public String getType() {
            return com.coremedia.iso.boxes.mdat.a.f9798h;
        }

        @Override // com.coremedia.iso.boxes.d
        public long j() {
            return this.f64772d;
        }

        @Override // com.coremedia.iso.boxes.d
        public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        }

        @Override // com.coremedia.iso.boxes.d
        public void p(j jVar) {
            this.f64770b = jVar;
        }
    }

    private void n() throws Exception {
        long position = this.f64764d.position();
        this.f64764d.position(this.f64761a.j());
        this.f64761a.a(this.f64764d);
        this.f64764d.position(position);
        this.f64761a.f(0L);
        this.f64761a.e(0L);
        this.f64763c.flush();
    }

    public static long o(long j4, long j5) {
        return j5 == 0 ? j4 : o(j5, j4 % j5);
    }

    public int a(MediaFormat mediaFormat, boolean z4) throws Exception {
        return this.f64762b.b(mediaFormat, z4);
    }

    protected s b() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("3gp4");
        return new s("isom", 0L, linkedList);
    }

    public b c(c cVar) throws Exception {
        this.f64762b = cVar;
        FileOutputStream fileOutputStream = new FileOutputStream(cVar.c());
        this.f64763c = fileOutputStream;
        this.f64764d = fileOutputStream.getChannel();
        s b5 = b();
        b5.a(this.f64764d);
        long size = this.f64765e + b5.getSize();
        this.f64765e = size;
        this.f64766f += size;
        this.f64761a = new C0683b();
        this.f64769i = ByteBuffer.allocateDirect(4);
        return this;
    }

    protected h0 d(c cVar) {
        h0 h0Var = new h0();
        i0 i0Var = new i0();
        i0Var.J(new Date());
        i0Var.N(new Date());
        i0Var.M(l.f14234j);
        long p4 = p(cVar);
        Iterator<g> it2 = cVar.f().iterator();
        long j4 = 0;
        while (it2.hasNext()) {
            g next = it2.next();
            long c5 = (next.c() * p4) / next.k();
            if (c5 > j4) {
                j4 = c5;
            }
        }
        i0Var.L(j4);
        i0Var.V(p4);
        i0Var.O(cVar.f().size() + 1);
        h0Var.v(i0Var);
        Iterator<g> it3 = cVar.f().iterator();
        while (it3.hasNext()) {
            h0Var.v(l(it3.next(), cVar));
        }
        return h0Var;
    }

    protected com.coremedia.iso.boxes.d e(g gVar) {
        u0 u0Var = new u0();
        h(gVar, u0Var);
        k(gVar, u0Var);
        i(gVar, u0Var);
        g(gVar, u0Var);
        j(gVar, u0Var);
        f(gVar, u0Var);
        return u0Var;
    }

    protected void f(g gVar, u0 u0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<e> it2 = gVar.i().iterator();
        long j4 = -1;
        while (it2.hasNext()) {
            e next = it2.next();
            long a5 = next.a();
            if (j4 != -1 && j4 != a5) {
                j4 = -1;
            }
            if (j4 == -1) {
                arrayList.add(Long.valueOf(a5));
            }
            j4 = next.b() + a5;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            jArr[i4] = ((Long) arrayList.get(i4)).longValue();
        }
        z0 z0Var = new z0();
        z0Var.w(jArr);
        u0Var.v(z0Var);
    }

    protected void g(g gVar, u0 u0Var) {
        v0 v0Var = new v0();
        v0Var.x(new LinkedList());
        int size = gVar.i().size();
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i5 < size) {
            e eVar = gVar.i().get(i5);
            i6++;
            if (i5 == size + (-1) || eVar.a() + eVar.b() != gVar.i().get(i5 + 1).a()) {
                if (i4 != i6) {
                    v0Var.w().add(new v0.a(i7, i6, 1L));
                    i4 = i6;
                }
                i7++;
                i6 = 0;
            }
            i5++;
        }
        u0Var.v(v0Var);
    }

    protected void h(g gVar, u0 u0Var) {
        u0Var.v(gVar.g());
    }

    protected void i(g gVar, u0 u0Var) {
        long[] j4 = gVar.j();
        if (j4 == null || j4.length <= 0) {
            return;
        }
        c1 c1Var = new c1();
        c1Var.w(j4);
        u0Var.v(c1Var);
    }

    protected void j(g gVar, u0 u0Var) {
        t0 t0Var = new t0();
        t0Var.A(this.f64768h.get(gVar));
        u0Var.v(t0Var);
    }

    protected void k(g gVar, u0 u0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it2 = gVar.h().iterator();
        d1.a aVar = null;
        while (it2.hasNext()) {
            long longValue = it2.next().longValue();
            if (aVar != null && aVar.b() == longValue) {
                aVar.c(aVar.a() + 1);
            } else {
                aVar = new d1.a(1L, longValue);
                arrayList.add(aVar);
            }
        }
        d1 d1Var = new d1();
        d1Var.x(arrayList);
        u0Var.v(d1Var);
    }

    protected f1 l(g gVar, c cVar) {
        f1 f1Var = new f1();
        g1 g1Var = new g1();
        g1Var.M(true);
        g1Var.O(true);
        g1Var.Q(true);
        if (gVar.o()) {
            g1Var.S(l.f14234j);
        } else {
            g1Var.S(cVar.e());
        }
        g1Var.J(0);
        g1Var.K(gVar.b());
        g1Var.L((gVar.c() * p(cVar)) / gVar.k());
        g1Var.N(gVar.e());
        g1Var.W(gVar.n());
        g1Var.R(0);
        g1Var.T(new Date());
        g1Var.U(gVar.l() + 1);
        g1Var.V(gVar.m());
        f1Var.v(g1Var);
        d0 d0Var = new d0();
        f1Var.v(d0Var);
        e0 e0Var = new e0();
        e0Var.A(gVar.b());
        e0Var.B(gVar.c());
        e0Var.E(gVar.k());
        e0Var.C("eng");
        d0Var.v(e0Var);
        x xVar = new x();
        xVar.z(gVar.o() ? "SoundHandle" : "VideoHandle");
        xVar.y(gVar.d());
        d0Var.v(xVar);
        f0 f0Var = new f0();
        f0Var.v(gVar.f());
        n nVar = new n();
        o oVar = new o();
        nVar.v(oVar);
        com.coremedia.iso.boxes.l lVar = new com.coremedia.iso.boxes.l();
        lVar.setFlags(1);
        oVar.v(lVar);
        f0Var.v(nVar);
        f0Var.v(e(gVar));
        d0Var.v(f0Var);
        return f1Var;
    }

    public void m(boolean z4) throws Exception {
        if (this.f64761a.b() != 0) {
            n();
        }
        Iterator<g> it2 = this.f64762b.f().iterator();
        while (it2.hasNext()) {
            g next = it2.next();
            ArrayList<e> i4 = next.i();
            int size = i4.size();
            long[] jArr = new long[size];
            for (int i5 = 0; i5 < size; i5++) {
                jArr[i5] = i4.get(i5).b();
            }
            this.f64768h.put(next, jArr);
        }
        d(this.f64762b).a(this.f64764d);
        this.f64763c.flush();
        this.f64764d.close();
        this.f64763c.close();
    }

    public long p(c cVar) {
        long k4 = !cVar.f().isEmpty() ? cVar.f().iterator().next().k() : 0L;
        Iterator<g> it2 = cVar.f().iterator();
        while (it2.hasNext()) {
            k4 = o(it2.next().k(), k4);
        }
        return k4;
    }

    public boolean q(int i4, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z4) throws Exception {
        if (this.f64767g) {
            this.f64761a.e(0L);
            this.f64761a.a(this.f64764d);
            this.f64761a.f(this.f64765e);
            this.f64765e += 16;
            this.f64766f += 16;
            this.f64767g = false;
        }
        C0683b c0683b = this.f64761a;
        c0683b.e(c0683b.b() + bufferInfo.size);
        long j4 = this.f64766f + bufferInfo.size;
        this.f64766f = j4;
        boolean z5 = true;
        if (j4 >= 32768) {
            n();
            this.f64767g = true;
            this.f64766f -= 32768;
        } else {
            z5 = false;
        }
        this.f64762b.a(i4, this.f64765e, bufferInfo);
        byteBuffer.position(bufferInfo.offset + (z4 ? 0 : 4));
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        if (!z4) {
            this.f64769i.position(0);
            this.f64769i.putInt(bufferInfo.size - 4);
            this.f64769i.position(0);
            this.f64764d.write(this.f64769i);
        }
        this.f64764d.write(byteBuffer);
        this.f64765e += bufferInfo.size;
        if (z5) {
            this.f64763c.flush();
        }
        return z5;
    }
}
