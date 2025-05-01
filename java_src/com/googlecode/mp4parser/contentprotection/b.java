package com.googlecode.mp4parser.contentprotection;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.boxes.piff.c;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: PlayReadyHeader.java */
/* loaded from: classes3.dex */
public class b extends c {

    /* renamed from: d  reason: collision with root package name */
    public static UUID f14071d;

    /* renamed from: b  reason: collision with root package name */
    private long f14072b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f14073c;

    /* compiled from: PlayReadyHeader.java */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        int f14074a;

        /* compiled from: PlayReadyHeader.java */
        /* renamed from: com.googlecode.mp4parser.contentprotection.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0304a extends a {

            /* renamed from: b  reason: collision with root package name */
            ByteBuffer f14075b;

            public C0304a(int i4) {
                super(i4);
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public ByteBuffer b() {
                return this.f14075b;
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public void c(ByteBuffer byteBuffer) {
                this.f14075b = byteBuffer.duplicate();
            }
        }

        /* compiled from: PlayReadyHeader.java */
        /* renamed from: com.googlecode.mp4parser.contentprotection.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0305b extends a {

            /* renamed from: b  reason: collision with root package name */
            ByteBuffer f14076b;

            public C0305b() {
                super(3);
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public ByteBuffer b() {
                return this.f14076b;
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public void c(ByteBuffer byteBuffer) {
                this.f14076b = byteBuffer.duplicate();
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public String toString() {
                return "EmeddedLicenseStore{length=" + b().limit() + '}';
            }
        }

        /* compiled from: PlayReadyHeader.java */
        /* loaded from: classes3.dex */
        public static class c extends a {

            /* renamed from: b  reason: collision with root package name */
            String f14077b;

            public c() {
                super(1);
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public ByteBuffer b() {
                try {
                    return ByteBuffer.wrap(this.f14077b.getBytes("UTF-16LE"));
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException(e5);
                }
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public void c(ByteBuffer byteBuffer) {
                try {
                    byte[] bArr = new byte[byteBuffer.slice().limit()];
                    byteBuffer.get(bArr);
                    this.f14077b = new String(bArr, "UTF-16LE");
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException(e5);
                }
            }

            public String d() {
                return this.f14077b;
            }

            public void e(String str) {
                this.f14077b = str;
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public String toString() {
                return "RMHeader{length=" + b().limit() + ", header='" + this.f14077b + "'}";
            }
        }

        public a(int i4) {
            this.f14074a = i4;
        }

        public static List<a> a(ByteBuffer byteBuffer, int i4) {
            a cVar;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int j4 = g.j(byteBuffer);
                int j5 = g.j(byteBuffer);
                if (j4 == 1) {
                    cVar = new c();
                } else if (j4 == 2) {
                    cVar = new C0304a(2);
                } else if (j4 != 3) {
                    cVar = new C0304a(j4);
                } else {
                    cVar = new C0305b();
                }
                cVar.c((ByteBuffer) byteBuffer.slice().limit(j5));
                byteBuffer.position(byteBuffer.position() + j5);
                arrayList.add(cVar);
            }
            return arrayList;
        }

        public abstract ByteBuffer b();

        public abstract void c(ByteBuffer byteBuffer);

        public String toString() {
            return "PlayReadyRecord{type=" + this.f14074a + ", length=" + b().limit() + '}';
        }
    }

    static {
        UUID fromString = UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95");
        f14071d = fromString;
        c.f14025a.put(fromString, b.class);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.c
    public ByteBuffer b() {
        int i4 = 6;
        for (a aVar : this.f14073c) {
            i4 = i4 + 4 + aVar.b().rewind().limit();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i4);
        i.j(allocate, i4);
        i.g(allocate, this.f14073c.size());
        for (a aVar2 : this.f14073c) {
            i.g(allocate, aVar2.f14074a);
            i.g(allocate, aVar2.b().limit());
            allocate.put(aVar2.b());
        }
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.c
    public UUID c() {
        return f14071d;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.c
    public void d(ByteBuffer byteBuffer) {
        this.f14072b = g.m(byteBuffer);
        this.f14073c = a.a(byteBuffer, g.j(byteBuffer));
    }

    public List<a> e() {
        return Collections.unmodifiableList(this.f14073c);
    }

    public void f(List<a> list) {
        this.f14073c = list;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.c
    public String toString() {
        return "PlayReadyHeader{length=" + this.f14072b + ", recordCount=" + this.f14073c.size() + ", records=" + this.f14073c + '}';
    }
}
