package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.l0;
import com.coremedia.iso.boxes.o0;
import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.boxes.x0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.SecretKey;
/* compiled from: CencDecryptingTrackImpl.java */
/* loaded from: classes3.dex */
public class f extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e  reason: collision with root package name */
    com.googlecode.mp4parser.boxes.cenc.a f13436e;

    /* renamed from: f  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13437f;

    /* renamed from: g  reason: collision with root package name */
    com.googlecode.mp4parser.util.n<Integer, SecretKey> f13438g;

    public f(g gVar, SecretKey secretKey) {
        this(gVar, Collections.singletonMap(gVar.L(), secretKey));
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13437f.M();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13437f.O();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13437f.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13437f.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        l0 l0Var = (l0) com.googlecode.mp4parser.util.m.e(this.f13437f.o(), "enc./sinf/frma");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f13437f.o().a(Channels.newChannel(byteArrayOutputStream));
            s0 s0Var = (s0) new com.coremedia.iso.f(new com.googlecode.mp4parser.i(byteArrayOutputStream.toByteArray())).t().get(0);
            if (s0Var.C() instanceof com.coremedia.iso.boxes.sampleentry.c) {
                ((com.coremedia.iso.boxes.sampleentry.c) s0Var.C()).m0(l0Var.t());
            } else if (s0Var.C() instanceof com.coremedia.iso.boxes.sampleentry.h) {
                ((com.coremedia.iso.boxes.sampleentry.h) s0Var.C()).Y(l0Var.t());
            } else {
                throw new RuntimeException("I don't know " + s0Var.C().getType());
            }
            LinkedList linkedList = new LinkedList();
            for (com.coremedia.iso.boxes.d dVar : s0Var.C().t()) {
                if (!dVar.getType().equals(o0.f9821o)) {
                    linkedList.add(dVar);
                }
            }
            s0Var.C().b(linkedList);
            return s0Var;
        } catch (IOException unused) {
            throw new RuntimeException("Dumping stsd to memory failed");
        }
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return this.f13437f.q();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13436e;
    }

    public f(g gVar, Map<UUID, SecretKey> map) {
        super("dec(" + gVar.getName() + ")");
        this.f13438g = new com.googlecode.mp4parser.util.n<>();
        this.f13437f = gVar;
        x0 x0Var = (x0) com.googlecode.mp4parser.util.m.e(gVar.o(), "enc./sinf/schm");
        if (!"cenc".equals(x0Var.v()) && !"cbc1".equals(x0Var.v())) {
            throw new RuntimeException("You can only use the CencDecryptingTrackImpl with CENC (cenc or cbc1) encrypted tracks");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> entry : gVar.I().entrySet()) {
            if (entry.getKey() instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) {
                arrayList.add((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) entry.getKey());
            } else {
                I().put(entry.getKey(), entry.getValue());
            }
        }
        int i4 = -1;
        for (int i5 = 0; i5 < gVar.x().size(); i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (Arrays.binarySearch(gVar.I().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) arrayList.get(i7)), i5) >= 0) {
                    i6 = i7 + 1;
                }
            }
            if (i4 != i6) {
                if (i6 == 0) {
                    this.f13438g.put(Integer.valueOf(i5), map.get(gVar.L()));
                } else {
                    int i8 = i6 - 1;
                    if (((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i8)).f()) {
                        SecretKey secretKey = map.get(((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i8)).e());
                        if (secretKey != null) {
                            this.f13438g.put(Integer.valueOf(i5), secretKey);
                        } else {
                            throw new RuntimeException("Key " + ((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i8)).e() + " was not supplied for decryption");
                        }
                    } else {
                        this.f13438g.put(Integer.valueOf(i5), null);
                    }
                }
                i4 = i6;
            }
        }
        this.f13436e = new com.googlecode.mp4parser.boxes.cenc.a(this.f13438g, gVar.x(), gVar.R(), x0Var.v());
    }
}
