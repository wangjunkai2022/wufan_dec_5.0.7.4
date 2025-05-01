package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import com.googlecode.mp4parser.authoring.tracks.c;
import com.kwad.sdk.core.response.model.SdkConfigData;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
/* loaded from: classes3.dex */
public class H264TrackImpl extends com.googlecode.mp4parser.authoring.tracks.c {
    private static final Logger F = Logger.getLogger(H264TrackImpl.class.getName());
    private int A;
    private c B;
    int C;
    private boolean D;
    private String E;

    /* renamed from: l  reason: collision with root package name */
    Map<Integer, byte[]> f13273l;

    /* renamed from: m  reason: collision with root package name */
    Map<Integer, com.googlecode.mp4parser.h264.model.h> f13274m;

    /* renamed from: n  reason: collision with root package name */
    Map<Integer, byte[]> f13275n;

    /* renamed from: o  reason: collision with root package name */
    Map<Integer, com.googlecode.mp4parser.h264.model.e> f13276o;

    /* renamed from: p  reason: collision with root package name */
    s0 f13277p;

    /* renamed from: q  reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f13278q;

    /* renamed from: r  reason: collision with root package name */
    com.googlecode.mp4parser.h264.model.h f13279r;

    /* renamed from: s  reason: collision with root package name */
    com.googlecode.mp4parser.h264.model.e f13280s;

    /* renamed from: t  reason: collision with root package name */
    com.googlecode.mp4parser.h264.model.h f13281t;

    /* renamed from: u  reason: collision with root package name */
    com.googlecode.mp4parser.h264.model.e f13282u;

    /* renamed from: v  reason: collision with root package name */
    com.googlecode.mp4parser.util.n<Integer, byte[]> f13283v;

    /* renamed from: w  reason: collision with root package name */
    com.googlecode.mp4parser.util.n<Integer, byte[]> f13284w;

    /* renamed from: x  reason: collision with root package name */
    private int f13285x;

    /* renamed from: y  reason: collision with root package name */
    private int f13286y;

    /* renamed from: z  reason: collision with root package name */
    private long f13287z;

    /* loaded from: classes3.dex */
    public static class SliceHeader {

        /* renamed from: a  reason: collision with root package name */
        public int f13288a;

        /* renamed from: b  reason: collision with root package name */
        public SliceType f13289b;

        /* renamed from: c  reason: collision with root package name */
        public int f13290c;

        /* renamed from: d  reason: collision with root package name */
        public int f13291d;

        /* renamed from: e  reason: collision with root package name */
        public int f13292e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f13293f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f13294g;

        /* renamed from: h  reason: collision with root package name */
        public int f13295h;

        /* renamed from: i  reason: collision with root package name */
        public int f13296i;

        /* renamed from: j  reason: collision with root package name */
        public int f13297j;

        /* renamed from: k  reason: collision with root package name */
        public int f13298k;

        /* renamed from: l  reason: collision with root package name */
        public int f13299l;

        /* loaded from: classes3.dex */
        public enum SliceType {
            P,
            B,
            I,
            SP,
            SI;

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static SliceType[] valuesCustom() {
                SliceType[] valuesCustom = values();
                int length = valuesCustom.length;
                SliceType[] sliceTypeArr = new SliceType[length];
                System.arraycopy(valuesCustom, 0, sliceTypeArr, 0, length);
                return sliceTypeArr;
            }
        }

        public SliceHeader(InputStream inputStream, Map<Integer, com.googlecode.mp4parser.h264.model.h> map, Map<Integer, com.googlecode.mp4parser.h264.model.e> map2, boolean z4) {
            this.f13293f = false;
            this.f13294g = false;
            try {
                inputStream.read();
                com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(inputStream);
                this.f13288a = bVar.y("SliceHeader: first_mb_in_slice");
                switch (bVar.y("SliceHeader: slice_type")) {
                    case 0:
                    case 5:
                        this.f13289b = SliceType.P;
                        break;
                    case 1:
                    case 6:
                        this.f13289b = SliceType.B;
                        break;
                    case 2:
                    case 7:
                        this.f13289b = SliceType.I;
                        break;
                    case 3:
                    case 8:
                        this.f13289b = SliceType.SP;
                        break;
                    case 4:
                    case 9:
                        this.f13289b = SliceType.SI;
                        break;
                }
                int y2 = bVar.y("SliceHeader: pic_parameter_set_id");
                this.f13290c = y2;
                com.googlecode.mp4parser.h264.model.e eVar = map2.get(Integer.valueOf(y2));
                com.googlecode.mp4parser.h264.model.h hVar = map.get(Integer.valueOf(eVar.f14119f));
                if (hVar.A) {
                    this.f13291d = bVar.w(2, "SliceHeader: colour_plane_id");
                }
                this.f13292e = bVar.w(hVar.f14154j + 4, "SliceHeader: frame_num");
                if (!hVar.F) {
                    boolean p4 = bVar.p("SliceHeader: field_pic_flag");
                    this.f13293f = p4;
                    if (p4) {
                        this.f13294g = bVar.p("SliceHeader: bottom_field_flag");
                    }
                }
                if (z4) {
                    this.f13295h = bVar.y("SliceHeader: idr_pic_id");
                }
                if (hVar.f14145a == 0) {
                    this.f13296i = bVar.w(hVar.f14155k + 4, "SliceHeader: pic_order_cnt_lsb");
                    if (eVar.f14120g && !this.f13293f) {
                        this.f13297j = bVar.t("SliceHeader: delta_pic_order_cnt_bottom");
                    }
                }
                if (hVar.f14145a != 1 || hVar.f14147c) {
                    return;
                }
                this.f13298k = bVar.t("delta_pic_order_cnt_0");
                if (!eVar.f14120g || this.f13293f) {
                    return;
                }
                this.f13299l = bVar.t("delta_pic_order_cnt_1");
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        public String toString() {
            return "SliceHeader{first_mb_in_slice=" + this.f13288a + ", slice_type=" + this.f13289b + ", pic_parameter_set_id=" + this.f13290c + ", colour_plane_id=" + this.f13291d + ", frame_num=" + this.f13292e + ", field_pic_flag=" + this.f13293f + ", bottom_field_flag=" + this.f13294g + ", idr_pic_id=" + this.f13295h + ", pic_order_cnt_lsb=" + this.f13296i + ", delta_pic_order_cnt_bottom=" + this.f13297j + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        int f13300a;

        /* renamed from: b  reason: collision with root package name */
        int f13301b;

        /* renamed from: c  reason: collision with root package name */
        boolean f13302c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13303d;

        /* renamed from: e  reason: collision with root package name */
        int f13304e;

        /* renamed from: f  reason: collision with root package name */
        int f13305f;

        /* renamed from: g  reason: collision with root package name */
        int f13306g;

        /* renamed from: h  reason: collision with root package name */
        int f13307h;

        /* renamed from: i  reason: collision with root package name */
        int f13308i;

        /* renamed from: j  reason: collision with root package name */
        int f13309j;

        /* renamed from: k  reason: collision with root package name */
        boolean f13310k;

        /* renamed from: l  reason: collision with root package name */
        int f13311l;

        public a(ByteBuffer byteBuffer, int i4, int i5) {
            SliceHeader sliceHeader = new SliceHeader(com.googlecode.mp4parser.authoring.tracks.c.a(new b(byteBuffer)), H264TrackImpl.this.f13274m, H264TrackImpl.this.f13276o, i5 == 5);
            this.f13300a = sliceHeader.f13292e;
            int i6 = sliceHeader.f13290c;
            this.f13301b = i6;
            this.f13302c = sliceHeader.f13293f;
            this.f13303d = sliceHeader.f13294g;
            this.f13304e = i4;
            this.f13305f = H264TrackImpl.this.f13274m.get(Integer.valueOf(H264TrackImpl.this.f13276o.get(Integer.valueOf(i6)).f14119f)).f14145a;
            this.f13306g = sliceHeader.f13297j;
            this.f13307h = sliceHeader.f13296i;
            this.f13308i = sliceHeader.f13298k;
            this.f13309j = sliceHeader.f13299l;
            this.f13311l = sliceHeader.f13295h;
        }

        boolean a(a aVar) {
            boolean z4;
            boolean z5;
            boolean z6;
            if (aVar.f13300a == this.f13300a && aVar.f13301b == this.f13301b && (z4 = aVar.f13302c) == this.f13302c) {
                if ((!z4 || aVar.f13303d == this.f13303d) && aVar.f13304e == this.f13304e) {
                    int i4 = aVar.f13305f;
                    if (i4 == 0 && this.f13305f == 0 && (aVar.f13307h != this.f13307h || aVar.f13306g != this.f13306g)) {
                        return true;
                    }
                    if (!(i4 == 1 && this.f13305f == 1 && (aVar.f13308i != this.f13308i || aVar.f13309j != this.f13309j)) && (z5 = aVar.f13310k) == (z6 = this.f13310k)) {
                        return z5 && z6 && aVar.f13311l != this.f13311l;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        int f13315a;

        /* renamed from: b  reason: collision with root package name */
        int f13316b;

        /* renamed from: c  reason: collision with root package name */
        boolean f13317c;

        /* renamed from: d  reason: collision with root package name */
        int f13318d;

        /* renamed from: e  reason: collision with root package name */
        int f13319e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13320f;

        /* renamed from: g  reason: collision with root package name */
        int f13321g;

        /* renamed from: h  reason: collision with root package name */
        int f13322h;

        /* renamed from: i  reason: collision with root package name */
        int f13323i;

        /* renamed from: j  reason: collision with root package name */
        int f13324j;

        /* renamed from: k  reason: collision with root package name */
        int f13325k;

        /* renamed from: l  reason: collision with root package name */
        int f13326l;

        /* renamed from: m  reason: collision with root package name */
        int f13327m;

        /* renamed from: n  reason: collision with root package name */
        int f13328n;

        /* renamed from: o  reason: collision with root package name */
        int f13329o;

        /* renamed from: p  reason: collision with root package name */
        int f13330p;

        /* renamed from: q  reason: collision with root package name */
        int f13331q;

        /* renamed from: r  reason: collision with root package name */
        int f13332r;

        /* renamed from: s  reason: collision with root package name */
        int f13333s;

        /* renamed from: t  reason: collision with root package name */
        com.googlecode.mp4parser.h264.model.h f13334t;

        public c(InputStream inputStream, com.googlecode.mp4parser.h264.model.h hVar) throws IOException {
            int i4;
            boolean z4 = false;
            this.f13315a = 0;
            this.f13316b = 0;
            this.f13334t = hVar;
            inputStream.read();
            int available = inputStream.available();
            int i5 = 0;
            while (i5 < available) {
                this.f13315a = z4 ? 1 : 0;
                this.f13316b = z4 ? 1 : 0;
                int read = inputStream.read();
                int i6 = i5 + 1;
                while (read == 255) {
                    this.f13315a += read;
                    read = inputStream.read();
                    i6++;
                    z4 = false;
                }
                this.f13315a += read;
                int read2 = inputStream.read();
                i5 = i6 + 1;
                while (read2 == 255) {
                    this.f13316b += read2;
                    read2 = inputStream.read();
                    i5++;
                    z4 = false;
                }
                int i7 = this.f13316b + read2;
                this.f13316b = i7;
                if (available - i5 < i7) {
                    i5 = available;
                } else if (this.f13315a == 1) {
                    com.googlecode.mp4parser.h264.model.i iVar = hVar.M;
                    if (iVar != null && (iVar.f14192v != null || iVar.f14193w != null || iVar.f14191u)) {
                        byte[] bArr = new byte[i7];
                        inputStream.read(bArr);
                        i5 += this.f13316b;
                        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(new ByteArrayInputStream(bArr));
                        com.googlecode.mp4parser.h264.model.i iVar2 = hVar.M;
                        com.googlecode.mp4parser.h264.model.d dVar = iVar2.f14192v;
                        if (dVar == null && iVar2.f14193w == null) {
                            this.f13317c = z4;
                        } else {
                            this.f13317c = true;
                            this.f13318d = bVar.w(dVar.f14111h + 1, "SEI: cpb_removal_delay");
                            this.f13319e = bVar.w(hVar.M.f14192v.f14112i + 1, "SEI: dpb_removal_delay");
                        }
                        if (hVar.M.f14191u) {
                            int w4 = bVar.w(4, "SEI: pic_struct");
                            this.f13321g = w4;
                            switch (w4) {
                                case 3:
                                case 4:
                                case 7:
                                    i4 = 2;
                                    break;
                                case 5:
                                case 6:
                                case 8:
                                    i4 = 3;
                                    break;
                                default:
                                    i4 = 1;
                                    break;
                            }
                            for (int i8 = 0; i8 < i4; i8++) {
                                boolean p4 = bVar.p("pic_timing SEI: clock_timestamp_flag[" + i8 + "]");
                                this.f13320f = p4;
                                if (p4) {
                                    this.f13322h = bVar.w(2, "pic_timing SEI: ct_type");
                                    this.f13323i = bVar.w(1, "pic_timing SEI: nuit_field_based_flag");
                                    this.f13324j = bVar.w(5, "pic_timing SEI: counting_type");
                                    this.f13325k = bVar.w(1, "pic_timing SEI: full_timestamp_flag");
                                    this.f13326l = bVar.w(1, "pic_timing SEI: discontinuity_flag");
                                    this.f13327m = bVar.w(1, "pic_timing SEI: cnt_dropped_flag");
                                    this.f13328n = bVar.w(8, "pic_timing SEI: n_frames");
                                    if (this.f13325k == 1) {
                                        this.f13329o = bVar.w(6, "pic_timing SEI: seconds_value");
                                        this.f13330p = bVar.w(6, "pic_timing SEI: minutes_value");
                                        this.f13331q = bVar.w(5, "pic_timing SEI: hours_value");
                                    } else if (bVar.p("pic_timing SEI: seconds_flag")) {
                                        this.f13329o = bVar.w(6, "pic_timing SEI: seconds_value");
                                        if (bVar.p("pic_timing SEI: minutes_flag")) {
                                            this.f13330p = bVar.w(6, "pic_timing SEI: minutes_value");
                                            if (bVar.p("pic_timing SEI: hours_flag")) {
                                                this.f13331q = bVar.w(5, "pic_timing SEI: hours_value");
                                            }
                                        }
                                    }
                                    com.googlecode.mp4parser.h264.model.i iVar3 = hVar.M;
                                    com.googlecode.mp4parser.h264.model.d dVar2 = iVar3.f14192v;
                                    if (dVar2 != null) {
                                        this.f13332r = dVar2.f14113j;
                                    } else {
                                        com.googlecode.mp4parser.h264.model.d dVar3 = iVar3.f14193w;
                                        if (dVar3 != null) {
                                            this.f13332r = dVar3.f14113j;
                                        } else {
                                            this.f13332r = 24;
                                        }
                                    }
                                    this.f13333s = bVar.w(24, "pic_timing SEI: time_offset");
                                }
                            }
                        }
                    } else {
                        for (int i9 = 0; i9 < this.f13316b; i9++) {
                            inputStream.read();
                            i5++;
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < this.f13316b; i10++) {
                        inputStream.read();
                        i5++;
                    }
                }
                H264TrackImpl.F.fine(toString());
                z4 = false;
            }
        }

        public String toString() {
            String str = "SEIMessage{payloadType=" + this.f13315a + ", payloadSize=" + this.f13316b;
            if (this.f13315a == 1) {
                com.googlecode.mp4parser.h264.model.i iVar = this.f13334t.M;
                if (iVar.f14192v != null || iVar.f14193w != null) {
                    str = String.valueOf(str) + ", cpb_removal_delay=" + this.f13318d + ", dpb_removal_delay=" + this.f13319e;
                }
                if (this.f13334t.M.f14191u) {
                    str = String.valueOf(str) + ", pic_struct=" + this.f13321g;
                    if (this.f13320f) {
                        str = String.valueOf(str) + ", ct_type=" + this.f13322h + ", nuit_field_based_flag=" + this.f13323i + ", counting_type=" + this.f13324j + ", full_timestamp_flag=" + this.f13325k + ", discontinuity_flag=" + this.f13326l + ", cnt_dropped_flag=" + this.f13327m + ", n_frames=" + this.f13328n + ", seconds_value=" + this.f13329o + ", minutes_value=" + this.f13330p + ", hours_value=" + this.f13331q + ", time_offset_length=" + this.f13332r + ", time_offset=" + this.f13333s;
                    }
                }
            }
            return String.valueOf(str) + '}';
        }
    }

    public H264TrackImpl(com.googlecode.mp4parser.e eVar, String str, long j4, int i4) throws IOException {
        super(eVar);
        this.f13273l = new HashMap();
        this.f13274m = new HashMap();
        this.f13275n = new HashMap();
        this.f13276o = new HashMap();
        this.f13279r = null;
        this.f13280s = null;
        this.f13281t = null;
        this.f13282u = null;
        this.f13283v = new com.googlecode.mp4parser.util.n<>();
        this.f13284w = new com.googlecode.mp4parser.util.n<>();
        this.C = 0;
        this.D = true;
        this.E = "eng";
        this.E = str;
        this.f13287z = j4;
        this.A = i4;
        if (j4 > 0 && i4 > 0) {
            this.D = false;
        }
        r(new c.a(eVar));
    }

    private void j() {
        if (this.D) {
            com.googlecode.mp4parser.h264.model.i iVar = this.f13279r.M;
            if (iVar != null) {
                long j4 = iVar.f14188r >> 1;
                this.f13287z = j4;
                int i4 = iVar.f14187q;
                this.A = i4;
                if (j4 == 0 || i4 == 0) {
                    System.err.println("Warning: vuiParams contain invalid values: time_scale: " + this.f13287z + " and frame_tick: " + this.A + ". Setting frame rate to 25fps");
                    this.f13287z = 90000L;
                    this.A = SdkConfigData.DEFAULT_REQUEST_INTERVAL;
                    return;
                }
                return;
            }
            System.err.println("Warning: Can't determine frame rate. Guessing 25 fps");
            this.f13287z = 90000L;
            this.A = SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        }
    }

    private void k(List<ByteBuffer> list) throws IOException {
        int i4 = 0;
        boolean z4 = false;
        for (ByteBuffer byteBuffer : list) {
            if ((byteBuffer.get(0) & 31) == 5) {
                z4 = true;
            }
        }
        int i5 = z4 ? 38 : 22;
        if (new SliceHeader(com.googlecode.mp4parser.authoring.tracks.c.a(new b(list.get(list.size() - 1))), this.f13274m, this.f13276o, z4).f13289b == SliceHeader.SliceType.B) {
            i5 += 4;
        }
        com.googlecode.mp4parser.authoring.f b5 = b(list);
        list.clear();
        c cVar = this.B;
        if (cVar == null || cVar.f13328n == 0) {
            this.C = 0;
        }
        if (cVar != null && cVar.f13320f) {
            i4 = cVar.f13328n - this.C;
        } else if (cVar != null && cVar.f13317c) {
            i4 = cVar.f13319e / 2;
        }
        this.f13415g.add(new i.a(1, i4 * this.A));
        this.f13416h.add(new r0.a(i5));
        this.C++;
        this.f13278q.add(b5);
        if (z4) {
            this.f13417i.add(Integer.valueOf(this.f13278q.size()));
        }
    }

    private void l(ByteBuffer byteBuffer) throws IOException {
        b bVar = new b(byteBuffer);
        bVar.read();
        com.googlecode.mp4parser.h264.model.e b5 = com.googlecode.mp4parser.h264.model.e.b(bVar);
        if (this.f13280s == null) {
            this.f13280s = b5;
        }
        this.f13282u = b5;
        byte[] g4 = com.googlecode.mp4parser.authoring.tracks.c.g((ByteBuffer) byteBuffer.rewind());
        byte[] bArr = this.f13275n.get(Integer.valueOf(b5.f14118e));
        if (bArr != null && !Arrays.equals(bArr, g4)) {
            throw new RuntimeException("OMG - I got two SPS with same ID but different settings! (AVC3 is the solution)");
        }
        if (bArr == null) {
            this.f13284w.put(Integer.valueOf(this.f13278q.size()), g4);
        }
        this.f13275n.put(Integer.valueOf(b5.f14118e), g4);
        this.f13276o.put(Integer.valueOf(b5.f14118e), b5);
    }

    private void p(ByteBuffer byteBuffer) throws IOException {
        InputStream a5 = com.googlecode.mp4parser.authoring.tracks.c.a(new b(byteBuffer));
        a5.read();
        com.googlecode.mp4parser.h264.model.h c5 = com.googlecode.mp4parser.h264.model.h.c(a5);
        if (this.f13279r == null) {
            this.f13279r = c5;
            j();
        }
        this.f13281t = c5;
        byte[] g4 = com.googlecode.mp4parser.authoring.tracks.c.g((ByteBuffer) byteBuffer.rewind());
        byte[] bArr = this.f13273l.get(Integer.valueOf(c5.f14170z));
        if (bArr != null && !Arrays.equals(bArr, g4)) {
            throw new RuntimeException("OMG - I got two SPS with same ID but different settings!");
        }
        if (bArr != null) {
            this.f13283v.put(Integer.valueOf(this.f13278q.size()), g4);
        }
        this.f13273l.put(Integer.valueOf(c5.f14170z), g4);
        this.f13274m.put(Integer.valueOf(c5.f14170z), c5);
    }

    private void r(c.a aVar) throws IOException {
        this.f13278q = new LinkedList();
        if (t(aVar)) {
            if (u()) {
                this.f13277p = new s0();
                com.coremedia.iso.boxes.sampleentry.h hVar = new com.coremedia.iso.boxes.sampleentry.h(com.coremedia.iso.boxes.sampleentry.h.f9920z);
                hVar.d(1);
                hVar.T(24);
                hVar.V(1);
                hVar.X(72.0d);
                hVar.Z(72.0d);
                hVar.a0(this.f13285x);
                hVar.W(this.f13286y);
                hVar.S("AVC Coding");
                com.mp4parser.iso14496.part15.a aVar2 = new com.mp4parser.iso14496.part15.a();
                aVar2.T(new ArrayList(this.f13273l.values()));
                aVar2.Q(new ArrayList(this.f13275n.values()));
                aVar2.I(this.f13279r.f14169y);
                aVar2.J(this.f13279r.f14161q);
                aVar2.L(this.f13279r.f14158n);
                aVar2.K(this.f13279r.f14159o);
                aVar2.M(this.f13279r.f14153i.b());
                aVar2.N(1);
                aVar2.P(3);
                com.googlecode.mp4parser.h264.model.h hVar2 = this.f13279r;
                aVar2.R((hVar2.f14163s ? 128 : 0) + (hVar2.f14164t ? 64 : 0) + (hVar2.f14165u ? 32 : 0) + (hVar2.f14166v ? 16 : 0) + (hVar2.f14167w ? 8 : 0) + ((int) (hVar2.f14162r & 3)));
                hVar.v(aVar2);
                this.f13277p.v(hVar);
                this.f13418j.l(new Date());
                this.f13418j.r(new Date());
                this.f13418j.o(this.E);
                this.f13418j.s(this.f13287z);
                this.f13418j.v(this.f13285x);
                this.f13418j.n(this.f13286y);
                return;
            }
            throw new IOException();
        }
        throw new IOException();
    }

    private boolean t(c.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        a aVar2 = null;
        while (true) {
            ByteBuffer d5 = d(aVar);
            if (d5 != null) {
                byte b5 = d5.get(0);
                int i4 = (b5 >> 5) & 3;
                int i5 = b5 & 31;
                switch (i5) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        a aVar3 = new a(d5, i4, i5);
                        if (aVar2 != null) {
                            if (aVar2.a(aVar3)) {
                                k(arrayList);
                            }
                            arrayList.add((ByteBuffer) d5.rewind());
                            break;
                        }
                        aVar2 = aVar3;
                        arrayList.add((ByteBuffer) d5.rewind());
                    case 6:
                        if (aVar2 != null) {
                            k(arrayList);
                            aVar2 = null;
                        }
                        this.B = new c(com.googlecode.mp4parser.authoring.tracks.c.a(new b(d5)), this.f13281t);
                        arrayList.add(d5);
                        break;
                    case 7:
                        if (aVar2 != null) {
                            k(arrayList);
                            aVar2 = null;
                        }
                        p((ByteBuffer) d5.rewind());
                        break;
                    case 8:
                        if (aVar2 != null) {
                            k(arrayList);
                            aVar2 = null;
                        }
                        l((ByteBuffer) d5.rewind());
                        break;
                    case 9:
                        if (aVar2 != null) {
                            k(arrayList);
                            aVar2 = null;
                        }
                        arrayList.add(d5);
                        break;
                    case 10:
                    case 11:
                        break;
                    case 12:
                    default:
                        System.err.println("Unknown NAL unit type: " + i5);
                        break;
                    case 13:
                        throw new RuntimeException("Sequence parameter set extension is not yet handled. Needs TLC.");
                }
            }
        }
        k(arrayList);
        long[] jArr = new long[this.f13278q.size()];
        this.f13414f = jArr;
        Arrays.fill(jArr, this.A);
        return true;
    }

    private boolean u() {
        int i4;
        com.googlecode.mp4parser.h264.model.h hVar = this.f13279r;
        this.f13285x = (hVar.f14157m + 1) * 16;
        int i5 = hVar.F ? 1 : 2;
        this.f13286y = (hVar.f14156l + 1) * 16 * i5;
        if (hVar.G) {
            if ((hVar.A ? 0 : hVar.f14153i.b()) != 0) {
                i4 = this.f13279r.f14153i.d();
                i5 *= this.f13279r.f14153i.c();
            } else {
                i4 = 1;
            }
            int i6 = this.f13285x;
            com.googlecode.mp4parser.h264.model.h hVar2 = this.f13279r;
            this.f13285x = i6 - (i4 * (hVar2.H + hVar2.I));
            this.f13286y -= i5 * (hVar2.J + hVar2.K);
        }
        return true;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "vide";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13277p;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13278q;
    }

    /* loaded from: classes3.dex */
    public class b extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        private final ByteBuffer f13313b;

        public b(ByteBuffer byteBuffer) {
            this.f13313b = byteBuffer.duplicate();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f13313b.hasRemaining()) {
                return this.f13313b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            if (this.f13313b.hasRemaining()) {
                int min = Math.min(i5, this.f13313b.remaining());
                this.f13313b.get(bArr, i4, min);
                return min;
            }
            return -1;
        }
    }

    public H264TrackImpl(com.googlecode.mp4parser.e eVar, String str) throws IOException {
        this(eVar, str, -1L, -1);
    }

    public H264TrackImpl(com.googlecode.mp4parser.e eVar) throws IOException {
        this(eVar, "eng");
    }
}
