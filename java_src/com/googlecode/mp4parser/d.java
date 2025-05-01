package com.googlecode.mp4parser;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: BasicContainer.java */
/* loaded from: classes3.dex */
public class d implements com.coremedia.iso.boxes.j, Iterator<com.coremedia.iso.boxes.d>, Closeable {

    /* renamed from: i  reason: collision with root package name */
    private static final com.coremedia.iso.boxes.d f14078i = new a("eof ");

    /* renamed from: j  reason: collision with root package name */
    private static com.googlecode.mp4parser.util.j f14079j = com.googlecode.mp4parser.util.j.a(d.class);

    /* renamed from: b  reason: collision with root package name */
    protected com.coremedia.iso.c f14080b;

    /* renamed from: c  reason: collision with root package name */
    protected e f14081c;

    /* renamed from: d  reason: collision with root package name */
    com.coremedia.iso.boxes.d f14082d = null;

    /* renamed from: e  reason: collision with root package name */
    long f14083e = 0;

    /* renamed from: f  reason: collision with root package name */
    long f14084f = 0;

    /* renamed from: g  reason: collision with root package name */
    long f14085g = 0;

    /* renamed from: h  reason: collision with root package name */
    private List<com.coremedia.iso.boxes.d> f14086h = new ArrayList();

    /* compiled from: BasicContainer.java */
    /* loaded from: classes3.dex */
    class a extends com.googlecode.mp4parser.a {
        a(String str) {
            super(str);
        }

        @Override // com.googlecode.mp4parser.a
        protected void b(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.a
        protected void c(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.a
        protected long e() {
            return 0L;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: A */
    public com.coremedia.iso.boxes.d next() {
        com.coremedia.iso.boxes.d a5;
        com.coremedia.iso.boxes.d dVar = this.f14082d;
        if (dVar != null && dVar != f14078i) {
            this.f14082d = null;
            return dVar;
        }
        e eVar = this.f14081c;
        if (eVar != null && this.f14083e < this.f14085g) {
            try {
                synchronized (eVar) {
                    this.f14081c.G(this.f14083e);
                    a5 = this.f14080b.a(this.f14081c, this);
                    this.f14083e = this.f14081c.position();
                }
                return a5;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.f14082d = f14078i;
        throw new NoSuchElementException();
    }

    @Override // com.coremedia.iso.boxes.j
    public void b(List<com.coremedia.iso.boxes.d> list) {
        this.f14086h = new ArrayList(list);
        this.f14082d = f14078i;
        this.f14081c = null;
    }

    public void close() throws IOException {
        this.f14081c.close();
    }

    @Override // com.coremedia.iso.boxes.j
    public <T extends com.coremedia.iso.boxes.d> List<T> g(Class<T> cls) {
        List<com.coremedia.iso.boxes.d> t4 = t();
        ArrayList arrayList = null;
        com.coremedia.iso.boxes.d dVar = null;
        for (int i4 = 0; i4 < t4.size(); i4++) {
            com.coremedia.iso.boxes.d dVar2 = t4.get(i4);
            if (cls.isInstance(dVar2)) {
                if (dVar == null) {
                    dVar = dVar2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(dVar);
                    }
                    arrayList.add(dVar2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (dVar != null) {
            return Collections.singletonList(dVar);
        }
        return Collections.emptyList();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        com.coremedia.iso.boxes.d dVar = this.f14082d;
        if (dVar == f14078i) {
            return false;
        }
        if (dVar != null) {
            return true;
        }
        try {
            this.f14082d = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f14082d = f14078i;
            return false;
        }
    }

    @Override // com.coremedia.iso.boxes.j
    public <T extends com.coremedia.iso.boxes.d> List<T> l(Class<T> cls, boolean z4) {
        ArrayList arrayList = new ArrayList(2);
        List<com.coremedia.iso.boxes.d> t4 = t();
        for (int i4 = 0; i4 < t4.size(); i4++) {
            com.coremedia.iso.boxes.d dVar = t4.get(i4);
            if (cls.isInstance(dVar)) {
                arrayList.add(dVar);
            }
            if (z4 && (dVar instanceof com.coremedia.iso.boxes.j)) {
                arrayList.addAll(((com.coremedia.iso.boxes.j) dVar).l(cls, z4));
            }
        }
        return arrayList;
    }

    @Override // com.coremedia.iso.boxes.j
    public ByteBuffer r(long j4, long j5) throws IOException {
        ByteBuffer Q;
        e eVar = this.f14081c;
        if (eVar != null) {
            synchronized (eVar) {
                Q = this.f14081c.Q(this.f14084f + j4, j5);
            }
            return Q;
        }
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j5));
        long j6 = j4 + j5;
        long j7 = 0;
        for (com.coremedia.iso.boxes.d dVar : this.f14086h) {
            long size = dVar.getSize() + j7;
            if (size > j4 && j7 < j6) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                dVar.a(newChannel);
                newChannel.close();
                if (j7 >= j4 && size <= j6) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                } else if (j7 < j4 && size > j6) {
                    long j8 = j4 - j7;
                    allocate.put(byteArrayOutputStream.toByteArray(), com.googlecode.mp4parser.util.c.a(j8), com.googlecode.mp4parser.util.c.a((dVar.getSize() - j8) - (size - j6)));
                } else if (j7 < j4 && size <= j6) {
                    long j9 = j4 - j7;
                    allocate.put(byteArrayOutputStream.toByteArray(), com.googlecode.mp4parser.util.c.a(j9), com.googlecode.mp4parser.util.c.a(dVar.getSize() - j9));
                } else if (j7 >= j4 && size > j6) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, com.googlecode.mp4parser.util.c.a(dVar.getSize() - (size - j6)));
                }
            }
            j7 = size;
        }
        return (ByteBuffer) allocate.rewind();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.coremedia.iso.boxes.j
    public List<com.coremedia.iso.boxes.d> t() {
        if (this.f14081c != null && this.f14082d != f14078i) {
            return new com.googlecode.mp4parser.util.i(this.f14086h, this);
        }
        return this.f14086h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i4 = 0; i4 < this.f14086h.size(); i4++) {
            if (i4 > 0) {
                sb.append(";");
            }
            sb.append(this.f14086h.get(i4).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.coremedia.iso.boxes.j
    public final void u(WritableByteChannel writableByteChannel) throws IOException {
        for (com.coremedia.iso.boxes.d dVar : t()) {
            dVar.a(writableByteChannel);
        }
    }

    public void v(com.coremedia.iso.boxes.d dVar) {
        if (dVar != null) {
            this.f14086h = new ArrayList(t());
            dVar.p(this);
            this.f14086h.add(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long y() {
        long j4 = 0;
        for (int i4 = 0; i4 < t().size(); i4++) {
            j4 += this.f14086h.get(i4).getSize();
        }
        return j4;
    }

    public void z(e eVar, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.f14081c = eVar;
        long position = eVar.position();
        this.f14084f = position;
        this.f14083e = position;
        eVar.G(eVar.position() + j4);
        this.f14085g = eVar.position();
        this.f14080b = cVar;
    }
}
