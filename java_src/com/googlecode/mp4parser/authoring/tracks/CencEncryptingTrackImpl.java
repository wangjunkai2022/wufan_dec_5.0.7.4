package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.l0;
import com.coremedia.iso.boxes.o0;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.boxes.w0;
import com.coremedia.iso.boxes.x0;
import com.mp4parser.iso23001.part7.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.SecretKey;
/* loaded from: classes3.dex */
public class CencEncryptingTrackImpl implements g {

    /* renamed from: b  reason: collision with root package name */
    private final String f13261b;

    /* renamed from: c  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13262c;

    /* renamed from: d  reason: collision with root package name */
    Map<UUID, SecretKey> f13263d;

    /* renamed from: e  reason: collision with root package name */
    UUID f13264e;

    /* renamed from: f  reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f13265f;

    /* renamed from: g  reason: collision with root package name */
    List<com.mp4parser.iso23001.part7.a> f13266g;

    /* renamed from: h  reason: collision with root package name */
    boolean f13267h;

    /* renamed from: i  reason: collision with root package name */
    boolean f13268i;

    /* renamed from: j  reason: collision with root package name */
    s0 f13269j;

    /* renamed from: k  reason: collision with root package name */
    com.googlecode.mp4parser.util.n<Integer, SecretKey> f13270k;

    /* renamed from: l  reason: collision with root package name */
    Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> f13271l;

    public CencEncryptingTrackImpl(com.googlecode.mp4parser.authoring.h hVar, UUID uuid, SecretKey secretKey, boolean z4) {
        this(hVar, uuid, Collections.singletonMap(uuid, secretKey), null, "cenc", z4);
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.g
    public boolean F() {
        return this.f13268i;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> H() {
        return this.f13262c.H();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I() {
        return this.f13271l;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.g
    public UUID L() {
        return this.f13264e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13262c.M();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13262c.O();
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.g
    public List<com.mp4parser.iso23001.part7.a> R() {
        return this.f13266g;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13262c.U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13262c.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        return this.f13262c.getDuration();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13262c.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return "enc(" + this.f13262c.getName() + ")";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return this.f13262c.n();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized s0 o() {
        if (this.f13269j == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                this.f13262c.o().a(Channels.newChannel(byteArrayOutputStream));
                int i4 = 0;
                this.f13269j = (s0) new com.coremedia.iso.f(new com.googlecode.mp4parser.i(byteArrayOutputStream.toByteArray())).t().get(0);
                l0 l0Var = new l0();
                l0Var.u(this.f13269j.C().getType());
                if (this.f13269j.C() instanceof com.coremedia.iso.boxes.sampleentry.c) {
                    ((com.coremedia.iso.boxes.sampleentry.c) this.f13269j.C()).m0(com.coremedia.iso.boxes.sampleentry.c.O);
                } else if (this.f13269j.C() instanceof com.coremedia.iso.boxes.sampleentry.h) {
                    ((com.coremedia.iso.boxes.sampleentry.h) this.f13269j.C()).Y(com.coremedia.iso.boxes.sampleentry.h.E);
                } else {
                    throw new RuntimeException("I don't know how to cenc " + this.f13269j.C().getType());
                }
                o0 o0Var = new o0();
                o0Var.v(l0Var);
                x0 x0Var = new x0();
                x0Var.y(this.f13261b);
                x0Var.A(65536);
                o0Var.v(x0Var);
                w0 w0Var = new w0();
                com.mp4parser.iso23001.part7.c cVar = new com.mp4parser.iso23001.part7.c();
                cVar.z(this.f13264e == null ? 0 : 8);
                if (this.f13264e != null) {
                    i4 = 1;
                }
                cVar.y(i4);
                UUID uuid = this.f13264e;
                if (uuid == null) {
                    uuid = new UUID(0L, 0L);
                }
                cVar.A(uuid);
                w0Var.v(cVar);
                o0Var.v(w0Var);
                this.f13269j.C().v(o0Var);
            } catch (IOException unused) {
                throw new RuntimeException("Dumping stsd to memory failed");
            }
        }
        return this.f13269j;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return this.f13262c.q();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13262c.s();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return new com.googlecode.mp4parser.boxes.cenc.b(this.f13270k, this.f13262c.x(), this.f13266g, this.f13261b);
    }

    public CencEncryptingTrackImpl(com.googlecode.mp4parser.authoring.h hVar, UUID uuid, Map<UUID, SecretKey> map, Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.a, long[]> map2, String str, boolean z4) {
        this(hVar, uuid, map, map2, str, z4, false);
    }

    public CencEncryptingTrackImpl(com.googlecode.mp4parser.authoring.h hVar, UUID uuid, Map<UUID, SecretKey> map, Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.a, long[]> map2, String str, boolean z4, boolean z5) {
        int i4;
        this.f13263d = new HashMap();
        char c5 = 0;
        this.f13267h = false;
        this.f13268i = false;
        SecretKey secretKey = null;
        this.f13269j = null;
        this.f13262c = hVar;
        this.f13263d = map;
        this.f13264e = uuid;
        this.f13267h = z4;
        this.f13261b = str;
        this.f13271l = new HashMap();
        for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> entry : hVar.I().entrySet()) {
            if (!(entry.getKey() instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.a)) {
                this.f13271l.put(entry.getKey(), entry.getValue());
            }
            c5 = 0;
            secretKey = null;
        }
        if (map2 != null) {
            for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.a, long[]> entry2 : map2.entrySet()) {
                this.f13271l.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f13271l = new HashMap<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]>(this.f13271l) { // from class: com.googlecode.mp4parser.authoring.tracks.CencEncryptingTrackImpl.1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            /* renamed from: a */
            public long[] put(com.googlecode.mp4parser.boxes.mp4.samplegrouping.b bVar, long[] jArr) {
                if (!(bVar instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.a)) {
                    return (long[]) super.put(bVar, jArr);
                }
                throw new RuntimeException("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
            }
        };
        this.f13265f = hVar.x();
        this.f13266g = new ArrayList();
        BigInteger bigInteger = new BigInteger("1");
        int i5 = 8;
        byte[] bArr = new byte[8];
        if (!z4) {
            new SecureRandom().nextBytes(bArr);
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        ArrayList arrayList = new ArrayList();
        if (map2 != null) {
            arrayList.addAll(map2.keySet());
        }
        this.f13270k = new com.googlecode.mp4parser.util.n<>();
        int i6 = -1;
        int i7 = 0;
        int i8 = -1;
        while (i7 < hVar.x().size()) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < arrayList.size()) {
                BigInteger bigInteger3 = bigInteger2;
                if (Arrays.binarySearch(I().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) arrayList.get(i9)), i7) >= 0) {
                    i10 = i9 + 1;
                }
                i9++;
                bigInteger2 = bigInteger3;
                secretKey = null;
                i5 = 8;
            }
            if (i8 != i10) {
                if (i10 == 0) {
                    this.f13270k.put(Integer.valueOf(i7), map.get(uuid));
                } else {
                    int i11 = i10 - 1;
                    if (((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i11)).e() != null) {
                        SecretKey secretKey2 = map.get(((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i11)).e());
                        if (secretKey2 != null) {
                            this.f13270k.put(Integer.valueOf(i7), secretKey2);
                        } else {
                            throw new RuntimeException("Key " + ((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i11)).e() + " was not supplied for decryption");
                        }
                    } else {
                        this.f13270k.put(Integer.valueOf(i7), secretKey);
                    }
                }
                i8 = i10;
            }
            i7++;
            c5 = 0;
        }
        for (com.coremedia.iso.boxes.d dVar : hVar.o().C().t()) {
            if (dVar instanceof com.mp4parser.iso14496.part15.a) {
                this.f13268i = true;
                i6 = ((com.mp4parser.iso14496.part15.a) dVar).z() + 1;
            }
            if (dVar instanceof com.mp4parser.iso14496.part15.c) {
                this.f13268i = true;
                i6 = ((com.mp4parser.iso14496.part15.c) dVar).G() + 1;
            }
        }
        for (int i12 = 0; i12 < this.f13265f.size(); i12++) {
            com.googlecode.mp4parser.authoring.f fVar = this.f13265f.get(i12);
            com.mp4parser.iso23001.part7.a aVar = new com.mp4parser.iso23001.part7.a();
            this.f13266g.add(aVar);
            if (this.f13270k.get(Integer.valueOf(i12)) != null) {
                byte[] byteArray = bigInteger2.toByteArray();
                byte[] bArr2 = new byte[i5];
                System.arraycopy(byteArray, byteArray.length - i5 > 0 ? byteArray.length - i5 : 0, bArr2, 8 - byteArray.length < 0 ? 0 : 8 - byteArray.length, byteArray.length > i5 ? 8 : byteArray.length);
                aVar.f57254a = bArr2;
                ByteBuffer byteBuffer = (ByteBuffer) fVar.a().rewind();
                if (this.f13268i) {
                    if (z5) {
                        a.k[] kVarArr = new a.k[1];
                        kVarArr[c5] = aVar.a(byteBuffer.remaining(), 0L);
                        aVar.f57255b = kVarArr;
                    } else {
                        ArrayList arrayList2 = new ArrayList(5);
                        while (byteBuffer.remaining() > 0) {
                            int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.h.a(byteBuffer, i6));
                            int i13 = a5 + i6;
                            arrayList2.add(aVar.a(i13 >= 112 ? (i13 % 16) + 96 : i13, i13 - i4));
                            byteBuffer.position(byteBuffer.position() + a5);
                        }
                        aVar.f57255b = (a.k[]) arrayList2.toArray(new a.k[arrayList2.size()]);
                    }
                }
                bigInteger2 = bigInteger2.add(bigInteger);
            }
        }
        System.err.println("");
    }
}
