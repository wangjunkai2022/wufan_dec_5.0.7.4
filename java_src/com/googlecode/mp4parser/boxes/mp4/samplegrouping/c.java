package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
/* compiled from: RateShareEntry.java */
/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: g  reason: collision with root package name */
    public static final String f13988g = "rash";

    /* renamed from: a  reason: collision with root package name */
    private short f13989a;

    /* renamed from: b  reason: collision with root package name */
    private short f13990b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f13991c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    private int f13992d;

    /* renamed from: e  reason: collision with root package name */
    private int f13993e;

    /* renamed from: f  reason: collision with root package name */
    private short f13994f;

    /* compiled from: RateShareEntry.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f13995a;

        /* renamed from: b  reason: collision with root package name */
        short f13996b;

        public a(int i4, short s4) {
            this.f13995a = i4;
            this.f13996b = s4;
        }

        public int a() {
            return this.f13995a;
        }

        public short b() {
            return this.f13996b;
        }

        public void c(int i4) {
            this.f13995a = i4;
        }

        public void d(short s4) {
            this.f13996b = s4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13995a == aVar.f13995a && this.f13996b == aVar.f13996b;
        }

        public int hashCode() {
            return (this.f13995a * 31) + this.f13996b;
        }

        public String toString() {
            return "{availableBitrate=" + this.f13995a + ", targetRateShare=" + ((int) this.f13996b) + '}';
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        short s4 = this.f13989a;
        ByteBuffer allocate = ByteBuffer.allocate(s4 == 1 ? 13 : (s4 * 6) + 11);
        allocate.putShort(this.f13989a);
        if (this.f13989a == 1) {
            allocate.putShort(this.f13990b);
        } else {
            for (a aVar : this.f13991c) {
                allocate.putInt(aVar.a());
                allocate.putShort(aVar.b());
            }
        }
        allocate.putInt(this.f13992d);
        allocate.putInt(this.f13993e);
        com.coremedia.iso.i.m(allocate, this.f13994f);
        allocate.rewind();
        return allocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        short s4 = byteBuffer.getShort();
        this.f13989a = s4;
        if (s4 == 1) {
            this.f13990b = byteBuffer.getShort();
        } else {
            while (true) {
                ?? r12 = s4 - 1;
                if (s4 <= 0) {
                    break;
                }
                this.f13991c.add(new a(com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer)), byteBuffer.getShort()));
                s4 = r12;
            }
        }
        this.f13992d = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f13993e = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f13994f = (short) com.coremedia.iso.g.p(byteBuffer);
    }

    public short d() {
        return this.f13994f;
    }

    public List<a> e() {
        return this.f13991c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13994f == cVar.f13994f && this.f13992d == cVar.f13992d && this.f13993e == cVar.f13993e && this.f13989a == cVar.f13989a && this.f13990b == cVar.f13990b) {
            List<a> list = this.f13991c;
            List<a> list2 = cVar.f13991c;
            return list == null ? list2 == null : list.equals(list2);
        }
        return false;
    }

    public int f() {
        return this.f13992d;
    }

    public int g() {
        return this.f13993e;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f13988g;
    }

    public short h() {
        return this.f13989a;
    }

    public int hashCode() {
        int i4 = ((this.f13989a * 31) + this.f13990b) * 31;
        List<a> list = this.f13991c;
        return ((((((i4 + (list != null ? list.hashCode() : 0)) * 31) + this.f13992d) * 31) + this.f13993e) * 31) + this.f13994f;
    }

    public short i() {
        return this.f13990b;
    }

    public void j(short s4) {
        this.f13994f = s4;
    }

    public void k(List<a> list) {
        this.f13991c = list;
    }

    public void l(int i4) {
        this.f13992d = i4;
    }

    public void m(int i4) {
        this.f13993e = i4;
    }

    public void n(short s4) {
        this.f13989a = s4;
    }

    public void o(short s4) {
        this.f13990b = s4;
    }
}
