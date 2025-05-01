package com.googlecode.mp4parser.authoring.tracks.h265;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
/* compiled from: VideoParameterSet.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    ByteBuffer f13479a;

    /* renamed from: b  reason: collision with root package name */
    int f13480b;

    public g(ByteBuffer byteBuffer) throws IOException {
        this.f13479a = byteBuffer;
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(Channels.newInputStream(new com.googlecode.mp4parser.util.b((ByteBuffer) byteBuffer.position(0))));
        this.f13480b = bVar.w(4, "vps_parameter_set_id");
        bVar.w(2, "vps_reserved_three_2bits");
        bVar.w(6, "vps_max_layers_minus1");
        int w4 = bVar.w(3, "vps_max_sub_layers_minus1");
        bVar.p("vps_temporal_id_nesting_flag");
        bVar.w(16, "vps_reserved_0xffff_16bits");
        b(w4, bVar);
        boolean p4 = bVar.p("vps_sub_layer_ordering_info_present_flag");
        int[] iArr = new int[p4 ? 1 : w4 + 1];
        int[] iArr2 = new int[p4 ? 1 : w4 + 1];
        int[] iArr3 = new int[p4 ? 1 : w4 + 1];
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
                a(zArr3[i7], w4, bVar);
            }
        }
        if (bVar.p("vps_extension_flag")) {
            while (bVar.f()) {
                bVar.p("vps_extension_data_flag");
            }
        }
        bVar.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r12, int r13, com.googlecode.mp4parser.h264.read.b r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.h265.g.a(boolean, int, com.googlecode.mp4parser.h264.read.b):void");
    }

    public void b(int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
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

    void c(int i4, int i5, boolean z4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
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

    public ByteBuffer d() {
        return this.f13479a;
    }
}
