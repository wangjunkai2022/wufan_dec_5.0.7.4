package com.vincent.videocompressor;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.m1;
import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.boxes.y0;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.n;
import com.uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
/* compiled from: Track.java */
@TargetApi(16)
/* loaded from: classes6.dex */
public class g {

    /* renamed from: q  reason: collision with root package name */
    private static Map<Integer, Integer> f64813q;

    /* renamed from: a  reason: collision with root package name */
    private long f64814a;

    /* renamed from: c  reason: collision with root package name */
    private long f64816c;

    /* renamed from: d  reason: collision with root package name */
    private String f64817d;

    /* renamed from: e  reason: collision with root package name */
    private com.coremedia.iso.boxes.a f64818e;

    /* renamed from: f  reason: collision with root package name */
    private s0 f64819f;

    /* renamed from: g  reason: collision with root package name */
    private LinkedList<Integer> f64820g;

    /* renamed from: h  reason: collision with root package name */
    private int f64821h;

    /* renamed from: j  reason: collision with root package name */
    private int f64823j;

    /* renamed from: k  reason: collision with root package name */
    private int f64824k;

    /* renamed from: l  reason: collision with root package name */
    private float f64825l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Long> f64826m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f64827n;

    /* renamed from: o  reason: collision with root package name */
    private long f64828o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f64829p;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<e> f64815b = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private Date f64822i = new Date();

    static {
        HashMap hashMap = new HashMap();
        f64813q = hashMap;
        hashMap.put(96000, 0);
        f64813q.put(88200, 1);
        f64813q.put(64000, 2);
        f64813q.put(48000, 3);
        f64813q.put(44100, 4);
        f64813q.put(Integer.valueOf((int) LogType.UNEXP_KNOWN_REASON), 5);
        f64813q.put(24000, 6);
        f64813q.put(22050, 7);
        f64813q.put(16000, 8);
        f64813q.put(12000, 9);
        f64813q.put(11025, 10);
        f64813q.put(8000, 11);
    }

    public g(int i4, MediaFormat mediaFormat, boolean z4) throws Exception {
        this.f64814a = 0L;
        this.f64816c = 0L;
        this.f64818e = null;
        this.f64819f = null;
        this.f64820g = null;
        this.f64825l = 0.0f;
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f64826m = arrayList;
        this.f64827n = false;
        this.f64828o = 0L;
        this.f64829p = true;
        this.f64814a = i4;
        if (!z4) {
            arrayList.add(3015L);
            this.f64816c = 3015L;
            this.f64824k = mediaFormat.getInteger("width");
            this.f64823j = mediaFormat.getInteger("height");
            this.f64821h = 90000;
            this.f64820g = new LinkedList<>();
            this.f64817d = "vide";
            this.f64818e = new m1();
            this.f64819f = new s0();
            String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
            if (string.equals(VideoController.f64740g)) {
                com.coremedia.iso.boxes.sampleentry.h hVar = new com.coremedia.iso.boxes.sampleentry.h(com.coremedia.iso.boxes.sampleentry.h.f9920z);
                hVar.d(1);
                hVar.T(24);
                hVar.V(1);
                hVar.X(72.0d);
                hVar.Z(72.0d);
                hVar.a0(this.f64824k);
                hVar.W(this.f64823j);
                com.mp4parser.iso14496.part15.a aVar = new com.mp4parser.iso14496.part15.a();
                if (mediaFormat.getByteBuffer("csd-0") != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.position(4);
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    arrayList2.add(bArr);
                    ArrayList arrayList3 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.position(4);
                    byte[] bArr2 = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr2);
                    arrayList3.add(bArr2);
                    aVar.T(arrayList2);
                    aVar.Q(arrayList3);
                }
                aVar.I(13);
                aVar.J(100);
                aVar.L(-1);
                aVar.K(-1);
                aVar.M(-1);
                aVar.N(1);
                aVar.P(3);
                aVar.R(0);
                hVar.v(aVar);
                this.f64819f.v(hVar);
                return;
            } else if (string.equals("video/mp4v")) {
                com.coremedia.iso.boxes.sampleentry.h hVar2 = new com.coremedia.iso.boxes.sampleentry.h(com.coremedia.iso.boxes.sampleentry.h.f9918x);
                hVar2.d(1);
                hVar2.T(24);
                hVar2.V(1);
                hVar2.X(72.0d);
                hVar2.Z(72.0d);
                hVar2.a0(this.f64824k);
                hVar2.W(this.f64823j);
                this.f64819f.v(hVar2);
                return;
            } else {
                return;
            }
        }
        arrayList.add(1024L);
        this.f64816c = 1024L;
        this.f64825l = 1.0f;
        this.f64821h = mediaFormat.getInteger("sample-rate");
        this.f64817d = "soun";
        this.f64818e = new y0();
        this.f64819f = new s0();
        com.coremedia.iso.boxes.sampleentry.c cVar = new com.coremedia.iso.boxes.sampleentry.c(com.coremedia.iso.boxes.sampleentry.c.E);
        cVar.c0(mediaFormat.getInteger("channel-count"));
        cVar.h0(mediaFormat.getInteger("sample-rate"));
        cVar.d(1);
        cVar.i0(16);
        com.googlecode.mp4parser.boxes.mp4.b bVar = new com.googlecode.mp4parser.boxes.mp4.b();
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g gVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g();
        gVar.x(0);
        n nVar = new n();
        nVar.j(2);
        gVar.z(nVar);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e eVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e();
        eVar.v(64);
        eVar.w(5);
        eVar.t(1536);
        eVar.u(96000L);
        eVar.s(96000L);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a aVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a();
        aVar2.v(2);
        aVar2.y(f64813q.get(Integer.valueOf((int) cVar.T())).intValue());
        aVar2.w(cVar.J());
        eVar.r(aVar2);
        gVar.v(eVar);
        ByteBuffer t4 = gVar.t();
        bVar.B(gVar);
        bVar.y(t4);
        cVar.v(bVar);
        this.f64819f.v(cVar);
    }

    public void a(long j4, MediaCodec.BufferInfo bufferInfo) {
        boolean z4 = (this.f64827n || (bufferInfo.flags & 1) == 0) ? false : true;
        this.f64815b.add(new e(j4, bufferInfo.size));
        LinkedList<Integer> linkedList = this.f64820g;
        if (linkedList != null && z4) {
            linkedList.add(Integer.valueOf(this.f64815b.size()));
        }
        long j5 = bufferInfo.presentationTimeUs;
        this.f64828o = j5;
        long j6 = (((j5 - this.f64828o) * this.f64821h) + 500000) / 1000000;
        if (!this.f64829p) {
            ArrayList<Long> arrayList = this.f64826m;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j6));
            this.f64816c += j6;
        }
        this.f64829p = false;
    }

    public Date b() {
        return this.f64822i;
    }

    public long c() {
        return this.f64816c;
    }

    public String d() {
        return this.f64817d;
    }

    public int e() {
        return this.f64823j;
    }

    public com.coremedia.iso.boxes.a f() {
        return this.f64818e;
    }

    public s0 g() {
        return this.f64819f;
    }

    public ArrayList<Long> h() {
        return this.f64826m;
    }

    public ArrayList<e> i() {
        return this.f64815b;
    }

    public long[] j() {
        LinkedList<Integer> linkedList = this.f64820g;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.f64820g.size()];
        for (int i4 = 0; i4 < this.f64820g.size(); i4++) {
            jArr[i4] = this.f64820g.get(i4).intValue();
        }
        return jArr;
    }

    public int k() {
        return this.f64821h;
    }

    public long l() {
        return this.f64814a;
    }

    public float m() {
        return this.f64825l;
    }

    public int n() {
        return this.f64824k;
    }

    public boolean o() {
        return this.f64827n;
    }
}
