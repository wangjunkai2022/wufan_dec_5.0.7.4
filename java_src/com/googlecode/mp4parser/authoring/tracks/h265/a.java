package com.googlecode.mp4parser.authoring.tracks.h265;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.boxes.sampleentry.h;
import com.googlecode.mp4parser.authoring.tracks.c;
import com.mp4parser.iso14496.part15.d;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: H265TrackImpl.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.authoring.tracks.c implements c {

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ByteBuffer> f13444l;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ByteBuffer> f13445m;

    /* renamed from: n  reason: collision with root package name */
    ArrayList<ByteBuffer> f13446n;

    /* renamed from: o  reason: collision with root package name */
    ArrayList<com.googlecode.mp4parser.authoring.f> f13447o;

    /* renamed from: p  reason: collision with root package name */
    s0 f13448p;

    public a(com.googlecode.mp4parser.e eVar) throws IOException {
        super(eVar);
        this.f13444l = new ArrayList<>();
        this.f13445m = new ArrayList<>();
        this.f13446n = new ArrayList<>();
        this.f13447o = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        c.a aVar = new c.a(eVar);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = {true};
        while (true) {
            ByteBuffer d5 = d(aVar);
            if (d5 == null) {
                this.f13448p = h();
                this.f13414f = new long[this.f13447o.size()];
                M().s(25L);
                Arrays.fill(this.f13414f, 1L);
                return;
            }
            b j4 = j(d5);
            if (zArr[0]) {
                if (k(j4)) {
                    if ((d5.get(2) & Byte.MIN_VALUE) != 0) {
                        p(arrayList, zArr, zArr2);
                    }
                } else {
                    switch (j4.f13450b) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 39:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                            p(arrayList, zArr, zArr2);
                            break;
                    }
                }
            }
            int i4 = j4.f13450b;
            if (i4 != 39) {
                switch (i4) {
                    case 32:
                        d5.position(2);
                        this.f13446n.add(d5.slice());
                        System.err.println("Stored VPS");
                        break;
                    case 33:
                        d5.position(2);
                        this.f13444l.add(d5.slice());
                        d5.position(1);
                        new f(Channels.newInputStream(new com.googlecode.mp4parser.util.b(d5.slice())));
                        System.err.println("Stored SPS");
                        break;
                    case 34:
                        d5.position(2);
                        this.f13445m.add(d5.slice());
                        System.err.println("Stored PPS");
                        break;
                }
            } else {
                new e(new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(d5.slice()));
            }
            switch (j4.f13450b) {
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    break;
                default:
                    PrintStream printStream = System.err;
                    printStream.println("Adding " + j4.f13450b);
                    arrayList.add(d5);
                    break;
            }
            if (k(j4)) {
                int i5 = j4.f13450b;
                if (i5 == 19 || i5 == 20) {
                    zArr2[0] = zArr2[0] & true;
                } else {
                    zArr2[0] = false;
                }
            }
            zArr[0] = zArr[0] | k(j4);
        }
    }

    private s0 h() {
        this.f13448p = new s0();
        h hVar = new h(h.C);
        hVar.d(1);
        hVar.T(24);
        hVar.V(1);
        hVar.X(72.0d);
        hVar.Z(72.0d);
        hVar.a0(640);
        hVar.W(480);
        hVar.S("HEVC Coding");
        com.mp4parser.iso14496.part15.c cVar = new com.mp4parser.iso14496.part15.c();
        d.a aVar = new d.a();
        aVar.f57180a = true;
        aVar.f57182c = 33;
        aVar.f57183d = new ArrayList();
        Iterator<ByteBuffer> it2 = this.f13444l.iterator();
        while (it2.hasNext()) {
            aVar.f57183d.add(com.googlecode.mp4parser.authoring.tracks.c.g(it2.next()));
        }
        d.a aVar2 = new d.a();
        aVar2.f57180a = true;
        aVar2.f57182c = 34;
        aVar2.f57183d = new ArrayList();
        Iterator<ByteBuffer> it3 = this.f13445m.iterator();
        while (it3.hasNext()) {
            aVar2.f57183d.add(com.googlecode.mp4parser.authoring.tracks.c.g(it3.next()));
        }
        d.a aVar3 = new d.a();
        aVar3.f57180a = true;
        aVar3.f57182c = 34;
        aVar3.f57183d = new ArrayList();
        Iterator<ByteBuffer> it4 = this.f13446n.iterator();
        while (it4.hasNext()) {
            aVar3.f57183d.add(com.googlecode.mp4parser.authoring.tracks.c.g(it4.next()));
        }
        cVar.t().addAll(Arrays.asList(aVar, aVar3, aVar2));
        hVar.v(cVar);
        this.f13448p.v(hVar);
        return this.f13448p;
    }

    public static void l(String[] strArr) throws IOException {
        a aVar = new a(new com.googlecode.mp4parser.g("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
        com.googlecode.mp4parser.authoring.d dVar = new com.googlecode.mp4parser.authoring.d();
        dVar.a(aVar);
        new com.googlecode.mp4parser.authoring.builder.b().a(dVar).u(new FileOutputStream("output.mp4").getChannel());
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "vide";
    }

    public b j(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int i4 = com.coremedia.iso.g.i(byteBuffer);
        b bVar = new b();
        bVar.f13449a = (32768 & i4) >> 15;
        bVar.f13450b = (i4 & 32256) >> 9;
        bVar.f13451c = (i4 & TypedValues.PositionType.TYPE_PERCENT_HEIGHT) >> 3;
        bVar.f13452d = i4 & 7;
        return bVar;
    }

    boolean k(b bVar) {
        int i4 = bVar.f13450b;
        return i4 >= 0 && i4 <= 31;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return null;
    }

    public void p(List<ByteBuffer> list, boolean[] zArr, boolean[] zArr2) {
        this.f13447o.add(b(list));
        PrintStream printStream = System.err;
        printStream.print("Create AU from " + list.size() + " NALs");
        if (zArr2[0]) {
            System.err.println("  IDR");
        } else {
            System.err.println();
        }
        zArr[0] = false;
        zArr2[0] = true;
        list.clear();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13447o;
    }
}
