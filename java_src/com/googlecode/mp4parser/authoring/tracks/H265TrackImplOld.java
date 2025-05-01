package com.googlecode.mp4parser.authoring.tracks;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mp4parser.iso14496.part15.d;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class H265TrackImplOld {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 6;
    private static final int D = 7;
    private static final int E = 8;
    private static final int F = 9;
    private static final int G = 16;
    private static final int H = 17;
    private static final int I = 18;
    private static final int J = 19;
    private static final int K = 20;
    private static final int L = 21;
    private static final long M = 1048576;

    /* renamed from: f  reason: collision with root package name */
    public static final int f13336f = 32;

    /* renamed from: g  reason: collision with root package name */
    public static final int f13337g = 33;

    /* renamed from: h  reason: collision with root package name */
    public static final int f13338h = 34;

    /* renamed from: i  reason: collision with root package name */
    public static final int f13339i = 35;

    /* renamed from: j  reason: collision with root package name */
    public static final int f13340j = 39;

    /* renamed from: k  reason: collision with root package name */
    public static final int f13341k = 41;

    /* renamed from: l  reason: collision with root package name */
    public static final int f13342l = 42;

    /* renamed from: m  reason: collision with root package name */
    public static final int f13343m = 43;

    /* renamed from: n  reason: collision with root package name */
    public static final int f13344n = 44;

    /* renamed from: o  reason: collision with root package name */
    public static final int f13345o = 48;

    /* renamed from: p  reason: collision with root package name */
    public static final int f13346p = 49;

    /* renamed from: q  reason: collision with root package name */
    public static final int f13347q = 50;

    /* renamed from: r  reason: collision with root package name */
    public static final int f13348r = 51;

    /* renamed from: s  reason: collision with root package name */
    public static final int f13349s = 52;

    /* renamed from: t  reason: collision with root package name */
    public static final int f13350t = 53;

    /* renamed from: u  reason: collision with root package name */
    public static final int f13351u = 54;

    /* renamed from: v  reason: collision with root package name */
    public static final int f13352v = 55;

    /* renamed from: w  reason: collision with root package name */
    private static final int f13353w = 0;

    /* renamed from: x  reason: collision with root package name */
    private static final int f13354x = 1;

    /* renamed from: y  reason: collision with root package name */
    private static final int f13355y = 2;

    /* renamed from: z  reason: collision with root package name */
    private static final int f13356z = 3;

    /* renamed from: a  reason: collision with root package name */
    LinkedHashMap<Long, ByteBuffer> f13357a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    LinkedHashMap<Long, ByteBuffer> f13358b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    LinkedHashMap<Long, ByteBuffer> f13359c = new LinkedHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    List<Long> f13360d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f13361e = new ArrayList();

    /* loaded from: classes3.dex */
    public enum PARSE_STATE {
        AUD_SEI_SLICE,
        SEI_SLICE,
        SLICE_OES_EOB;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PARSE_STATE[] valuesCustom() {
            PARSE_STATE[] valuesCustom = values();
            int length = valuesCustom.length;
            PARSE_STATE[] parse_stateArr = new PARSE_STATE[length];
            System.arraycopy(valuesCustom, 0, parse_stateArr, 0, length);
            return parse_stateArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        long f13362a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f13363b = 0;

        /* renamed from: c  reason: collision with root package name */
        com.googlecode.mp4parser.e f13364c;

        /* renamed from: d  reason: collision with root package name */
        ByteBuffer f13365d;

        /* renamed from: e  reason: collision with root package name */
        long f13366e;

        a(com.googlecode.mp4parser.e eVar) throws IOException {
            this.f13364c = eVar;
            c();
        }

        void a() {
            this.f13363b++;
        }

        void b() {
            int i4 = this.f13363b + 3;
            this.f13363b = i4;
            this.f13366e = this.f13362a + i4;
        }

        public void c() throws IOException {
            com.googlecode.mp4parser.e eVar = this.f13364c;
            this.f13365d = eVar.Q(this.f13362a, Math.min(eVar.size() - this.f13362a, 1048576L));
        }

        public ByteBuffer d() {
            long j4 = this.f13366e;
            long j5 = this.f13362a;
            if (j4 >= j5) {
                this.f13365d.position((int) (j4 - j5));
                ByteBuffer slice = this.f13365d.slice();
                slice.limit((int) (this.f13363b - (this.f13366e - this.f13362a)));
                return slice;
            }
            throw new RuntimeException("damn! NAL exceeds buffer");
        }

        boolean e() throws IOException {
            int limit = this.f13365d.limit();
            int i4 = this.f13363b;
            if (limit - i4 >= 3) {
                return this.f13365d.get(i4) == 0 && this.f13365d.get(this.f13363b + 1) == 0 && (this.f13365d.get(this.f13363b + 2) == 0 || this.f13365d.get(this.f13363b + 2) == 1);
            } else if (this.f13362a + i4 + 3 > this.f13364c.size()) {
                return this.f13362a + ((long) this.f13363b) == this.f13364c.size();
            } else {
                this.f13362a = this.f13366e;
                this.f13363b = 0;
                c();
                return e();
            }
        }

        boolean f() throws IOException {
            int limit = this.f13365d.limit();
            int i4 = this.f13363b;
            if (limit - i4 >= 3) {
                return this.f13365d.get(i4) == 0 && this.f13365d.get(this.f13363b + 1) == 0 && this.f13365d.get(this.f13363b + 2) == 1;
            } else if (this.f13362a + i4 == this.f13364c.size()) {
                throw new EOFException();
            } else {
                throw new RuntimeException("buffer repositioning require");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f13368a;

        /* renamed from: b  reason: collision with root package name */
        int f13369b;

        /* renamed from: c  reason: collision with root package name */
        int f13370c;

        /* renamed from: d  reason: collision with root package name */
        int f13371d;
    }

    public H265TrackImplOld(com.googlecode.mp4parser.e eVar) throws IOException {
        a aVar = new a(eVar);
        ArrayList arrayList = new ArrayList();
        long j4 = 1;
        long j5 = 1;
        int i4 = 0;
        while (true) {
            ByteBuffer b5 = b(aVar);
            if (b5 == null) {
                System.err.println("");
                com.mp4parser.iso14496.part15.d dVar = new com.mp4parser.iso14496.part15.d();
                dVar.y(c());
                dVar.z(0);
                return;
            }
            b e5 = e(b5);
            switch (e5.f13369b) {
                case 32:
                    this.f13357a.put(Long.valueOf(j5), b5);
                    break;
                case 33:
                    this.f13358b.put(Long.valueOf(j5), b5);
                    break;
                case 34:
                    this.f13359c.put(Long.valueOf(j5), b5);
                    break;
            }
            int i5 = e5.f13369b;
            i4 = i5 < 32 ? i5 : i4;
            if (g(i5, b5, arrayList) && !arrayList.isEmpty()) {
                System.err.println("##########################");
                for (ByteBuffer byteBuffer : arrayList) {
                    b e6 = e(byteBuffer);
                    System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d - size: %3d", Integer.valueOf(e6.f13369b), Integer.valueOf(e6.f13370c), Integer.valueOf(e6.f13371d), Integer.valueOf(byteBuffer.limit())));
                    j4 = 1;
                }
                System.err.println("                          ##########################");
                this.f13361e.add(a(arrayList));
                arrayList.clear();
                j5 += j4;
            }
            arrayList.add(b5);
            if (i4 >= 16 && i4 <= 21) {
                this.f13360d.add(Long.valueOf(j5));
            }
            j4 = 1;
        }
    }

    private ByteBuffer b(a aVar) throws IOException {
        while (!aVar.f()) {
            try {
                aVar.a();
            } catch (EOFException unused) {
                return null;
            }
        }
        aVar.b();
        while (!aVar.e()) {
            aVar.a();
        }
        return aVar.d();
    }

    private List<d.a> c() {
        d.a aVar = new d.a();
        aVar.f57180a = true;
        aVar.f57182c = 32;
        aVar.f57183d = new ArrayList();
        for (ByteBuffer byteBuffer : this.f13357a.values()) {
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.position(0);
            byteBuffer.get(bArr);
            aVar.f57183d.add(bArr);
        }
        d.a aVar2 = new d.a();
        aVar2.f57180a = true;
        aVar2.f57182c = 33;
        aVar2.f57183d = new ArrayList();
        for (ByteBuffer byteBuffer2 : this.f13358b.values()) {
            byte[] bArr2 = new byte[byteBuffer2.limit()];
            byteBuffer2.position(0);
            byteBuffer2.get(bArr2);
            aVar2.f57183d.add(bArr2);
        }
        d.a aVar3 = new d.a();
        aVar3.f57180a = true;
        aVar3.f57182c = 33;
        aVar3.f57183d = new ArrayList();
        for (ByteBuffer byteBuffer3 : this.f13359c.values()) {
            byte[] bArr3 = new byte[byteBuffer3.limit()];
            byteBuffer3.position(0);
            byteBuffer3.get(bArr3);
            aVar3.f57183d.add(bArr3);
        }
        return Arrays.asList(aVar, aVar2, aVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(boolean r12, int r13, com.googlecode.mp4parser.h264.read.b r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.H265TrackImplOld.f(boolean, int, com.googlecode.mp4parser.h264.read.b):void");
    }

    public static void h(String[] strArr) throws IOException {
        new H265TrackImplOld(new com.googlecode.mp4parser.g("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
    }

    protected com.googlecode.mp4parser.authoring.f a(List<ByteBuffer> list) {
        byte[] bArr = new byte[list.size() * 4];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        for (ByteBuffer byteBuffer : list) {
            wrap.putInt(byteBuffer.remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = i4 * 2;
            byteBufferArr[i5] = ByteBuffer.wrap(bArr, i4 * 4, 4);
            byteBufferArr[i5 + 1] = list.get(i4);
        }
        return new com.googlecode.mp4parser.authoring.g(byteBufferArr);
    }

    public int d(ByteBuffer byteBuffer) throws IOException {
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(Channels.newInputStream(new com.googlecode.mp4parser.util.b((ByteBuffer) byteBuffer.position(0))));
        bVar.w(4, "vps_parameter_set_id");
        bVar.w(2, "vps_reserved_three_2bits");
        bVar.w(6, "vps_max_layers_minus1");
        int w4 = bVar.w(3, "vps_max_sub_layers_minus1");
        bVar.p("vps_temporal_id_nesting_flag");
        bVar.w(16, "vps_reserved_0xffff_16bits");
        i(w4, bVar);
        boolean p4 = bVar.p("vps_sub_layer_ordering_info_present_flag");
        int[] iArr = new int[p4 ? 0 : w4];
        int[] iArr2 = new int[p4 ? 0 : w4];
        int[] iArr3 = new int[p4 ? 0 : w4];
        for (int i4 = p4 ? 0 : w4; i4 <= w4; i4++) {
            iArr[i4] = bVar.y("vps_max_dec_pic_buffering_minus1[" + i4 + "]");
            iArr2[i4] = bVar.y("vps_max_dec_pic_buffering_minus1[" + i4 + "]");
            iArr3[i4] = bVar.y("vps_max_dec_pic_buffering_minus1[" + i4 + "]");
        }
        int w5 = bVar.w(6, "vps_max_layer_id");
        int y2 = bVar.y("vps_num_layer_sets_minus1");
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, y2, w5);
        for (int i5 = 1; i5 <= y2; i5++) {
            for (int i6 = 0; i6 <= w5; i6++) {
                boolean[] zArr2 = zArr[i5];
                zArr2[i6] = bVar.p("layer_id_included_flag[" + i5 + "][" + i6 + "]");
            }
        }
        if (bVar.p("vps_timing_info_present_flag")) {
            bVar.w(32, "vps_num_units_in_tick");
            bVar.w(32, "vps_time_scale");
            if (bVar.p("vps_poc_proportional_to_timing_flag")) {
                bVar.y("vps_num_ticks_poc_diff_one_minus1");
            }
            int y4 = bVar.y("vps_num_hrd_parameters");
            int[] iArr4 = new int[y4];
            boolean[] zArr3 = new boolean[y4];
            for (int i7 = 0; i7 < y4; i7++) {
                iArr4[i7] = bVar.y("hrd_layer_set_idx[" + i7 + "]");
                if (i7 > 0) {
                    zArr3[i7] = bVar.p("cprms_present_flag[" + i7 + "]");
                } else {
                    zArr3[0] = true;
                }
                f(zArr3[i7], w4, bVar);
            }
        }
        if (bVar.p("vps_extension_flag")) {
            while (bVar.f()) {
                bVar.p("vps_extension_data_flag");
            }
        }
        bVar.v();
        return 0;
    }

    public b e(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int i4 = com.coremedia.iso.g.i(byteBuffer);
        b bVar = new b();
        bVar.f13368a = (32768 & i4) >> 15;
        bVar.f13369b = (i4 & 32256) >> 9;
        bVar.f13370c = (i4 & TypedValues.PositionType.TYPE_PERCENT_HEIGHT) >> 3;
        bVar.f13371d = i4 & 7;
        return bVar;
    }

    boolean g(int i4, ByteBuffer byteBuffer, List<ByteBuffer> list) {
        if (list.isEmpty()) {
            return true;
        }
        boolean z4 = e(list.get(list.size() - 1)).f13369b <= 31;
        switch (i4) {
            case 32:
            case 33:
            case 34:
            case 35:
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
                if (z4) {
                    return true;
                }
                break;
        }
        switch (i4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                switch (i4) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        return false;
                }
        }
        byteBuffer.position(0);
        byteBuffer.get(new byte[50]);
        byteBuffer.position(2);
        return z4 && (com.coremedia.iso.g.p(byteBuffer) & 128) > 0;
    }

    public void i(int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        int i5 = i4;
        int i6 = 2;
        bVar.w(2, "general_profile_space ");
        bVar.p("general_tier_flag");
        bVar.w(5, "general_profile_idc");
        int i7 = 32;
        boolean[] zArr = new boolean[32];
        char c5 = 0;
        int i8 = 0;
        while (i8 < i7) {
            zArr[i8] = bVar.p("general_profile_compatibility_flag[" + i8 + "]");
            i8++;
            i5 = i4;
            i6 = 2;
            i7 = 32;
            c5 = 0;
        }
        bVar.p("general_progressive_source_flag");
        bVar.p("general_interlaced_source_flag");
        bVar.p("general_non_packed_constraint_flag");
        bVar.p("general_frame_only_constraint_flag");
        bVar.w(44, "general_reserved_zero_44bits");
        int i9 = 8;
        bVar.w(8, "general_level_idc");
        boolean[] zArr2 = new boolean[i5];
        boolean[] zArr3 = new boolean[i5];
        int i10 = 0;
        while (i10 < i5) {
            zArr2[i10] = bVar.p("sub_layer_profile_present_flag[" + i10 + "]");
            zArr3[i10] = bVar.p("sub_layer_level_present_flag[" + i10 + "]");
            i10++;
            i5 = i4;
            i6 = 2;
            i7 = 32;
            c5 = 0;
            i9 = 8;
        }
        if (i5 > 0) {
            for (int i11 = i5; i11 < i9; i11++) {
                bVar.w(i6, "reserved_zero_2bits");
            }
        }
        int[] iArr = new int[i5];
        boolean[] zArr4 = new boolean[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i6];
        iArr3[1] = i7;
        iArr3[c5] = i5;
        boolean[][] zArr5 = (boolean[][]) Array.newInstance(boolean.class, iArr3);
        boolean[] zArr6 = new boolean[i5];
        boolean[] zArr7 = new boolean[i5];
        boolean[] zArr8 = new boolean[i5];
        boolean[] zArr9 = new boolean[i5];
        int[] iArr4 = new int[i5];
        int i12 = 0;
        while (i12 < i5) {
            if (zArr2[i12]) {
                iArr[i12] = bVar.w(2, "sub_layer_profile_space[" + i12 + "]");
                zArr4[i12] = bVar.p("sub_layer_tier_flag[" + i12 + "]");
                iArr2[i12] = bVar.w(5, "sub_layer_profile_idc[" + i12 + "]");
                int i13 = 0;
                while (i13 < 32) {
                    boolean[] zArr10 = zArr5[i12];
                    zArr10[i13] = bVar.p("sub_layer_profile_compatibility_flag[" + i12 + "][" + i13 + "]");
                    i13++;
                    zArr6 = zArr6;
                }
                zArr6[i12] = bVar.p("sub_layer_progressive_source_flag[" + i12 + "]");
                zArr7[i12] = bVar.p("sub_layer_interlaced_source_flag[" + i12 + "]");
                zArr8[i12] = bVar.p("sub_layer_non_packed_constraint_flag[" + i12 + "]");
                zArr9[i12] = bVar.p("sub_layer_frame_only_constraint_flag[" + i12 + "]");
                bVar.s(44, "reserved");
            }
            boolean[] zArr11 = zArr6;
            if (zArr3[i12]) {
                iArr4[i12] = bVar.w(8, "sub_layer_level_idc");
            }
            i12++;
            i5 = i4;
            zArr6 = zArr11;
        }
    }

    void j(int i4, int i5, boolean z4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        boolean[] zArr = new boolean[i5];
        for (int i6 = 0; i6 <= i5; i6++) {
            iArr[i6] = bVar.y("bit_rate_value_minus1[" + i6 + "]");
            iArr2[i6] = bVar.y("cpb_size_value_minus1[" + i6 + "]");
            if (z4) {
                iArr3[i6] = bVar.y("cpb_size_du_value_minus1[" + i6 + "]");
                iArr4[i6] = bVar.y("bit_rate_du_value_minus1[" + i6 + "]");
            }
            zArr[i6] = bVar.p("cbr_flag[" + i6 + "]");
        }
    }
}
