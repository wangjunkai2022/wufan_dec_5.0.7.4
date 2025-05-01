package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.d1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: CroppedTrack.java */
/* loaded from: classes3.dex */
public class j extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f13483h = false;

    /* renamed from: e  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13484e;

    /* renamed from: f  reason: collision with root package name */
    private int f13485f;

    /* renamed from: g  reason: collision with root package name */
    private int f13486g;

    public j(com.googlecode.mp4parser.authoring.h hVar, long j4, long j5) {
        super("crop(" + hVar.getName() + ")");
        this.f13484e = hVar;
        this.f13485f = (int) j4;
        this.f13486g = (int) j5;
    }

    static List<i.a> a(List<i.a> list, long j4, long j5) {
        i.a next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        long j6 = 0;
        ListIterator<i.a> listIterator = list.listIterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            next = listIterator.next();
            if (next.a() + j6 > j4) {
                break;
            }
            j6 += next.a();
        }
        if (next.a() + j6 >= j5) {
            arrayList.add(new i.a((int) (j5 - j4), next.b()));
            return arrayList;
        }
        arrayList.add(new i.a((int) ((next.a() + j6) - j4), next.b()));
        int a5 = next.a();
        while (true) {
            j6 += a5;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.a() + j6 >= j5) {
                break;
            }
            arrayList.add(next);
            a5 = next.a();
        }
        arrayList.add(new i.a((int) (j5 - j6), next.b()));
        return arrayList;
    }

    static List<d1.a> b(List<d1.a> list, long j4, long j5) {
        d1.a next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        long j6 = 0;
        ListIterator<d1.a> listIterator = list.listIterator();
        LinkedList linkedList = new LinkedList();
        while (true) {
            next = listIterator.next();
            if (next.a() + j6 > j4) {
                break;
            }
            j6 += next.a();
        }
        if (next.a() + j6 >= j5) {
            linkedList.add(new d1.a(j5 - j4, next.b()));
            return linkedList;
        }
        linkedList.add(new d1.a((next.a() + j6) - j4, next.b()));
        long a5 = next.a();
        while (true) {
            j6 += a5;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.a() + j6 >= j5) {
                break;
            }
            linkedList.add(next);
            a5 = next.a();
        }
        linkedList.add(new d1.a(j5 - j6, next.b()));
        return linkedList;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13484e.M();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] O() {
        long[] jArr;
        int i4 = this.f13486g - this.f13485f;
        jArr = new long[i4];
        System.arraycopy(this.f13484e.O(), this.f13485f, jArr, 0, i4);
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        if (this.f13484e.U() == null || this.f13484e.U().isEmpty()) {
            return null;
        }
        return this.f13484e.U().subList(this.f13485f, this.f13486g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13484e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13484e.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return a(this.f13484e.n(), this.f13485f, this.f13486g);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13484e.o();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public synchronized long[] q() {
        if (this.f13484e.q() != null) {
            long[] q4 = this.f13484e.q();
            int length = q4.length;
            int i4 = 0;
            while (i4 < q4.length && q4[i4] < this.f13485f) {
                i4++;
            }
            while (length > 0 && this.f13486g < q4[length - 1]) {
                length--;
            }
            long[] copyOfRange = Arrays.copyOfRange(this.f13484e.q(), i4, length);
            for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                copyOfRange[i5] = copyOfRange[i5] - this.f13485f;
            }
            return copyOfRange;
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13484e.s();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13484e.x().subList(this.f13485f, this.f13486g);
    }
}
