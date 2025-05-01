package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.model.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: SeqParameterSet.java */
/* loaded from: classes3.dex */
public class h extends b {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int[] L;
    public i M;
    public g N;
    public int O;

    /* renamed from: a  reason: collision with root package name */
    public int f14145a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14146b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14147c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14148d;

    /* renamed from: e  reason: collision with root package name */
    public int f14149e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14150f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14151g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14152h;

    /* renamed from: i  reason: collision with root package name */
    public c f14153i;

    /* renamed from: j  reason: collision with root package name */
    public int f14154j;

    /* renamed from: k  reason: collision with root package name */
    public int f14155k;

    /* renamed from: l  reason: collision with root package name */
    public int f14156l;

    /* renamed from: m  reason: collision with root package name */
    public int f14157m;

    /* renamed from: n  reason: collision with root package name */
    public int f14158n;

    /* renamed from: o  reason: collision with root package name */
    public int f14159o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14160p;

    /* renamed from: q  reason: collision with root package name */
    public int f14161q;

    /* renamed from: r  reason: collision with root package name */
    public long f14162r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14163s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14164t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14165u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14166v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14167w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14168x;

    /* renamed from: y  reason: collision with root package name */
    public int f14169y;

    /* renamed from: z  reason: collision with root package name */
    public int f14170z;

    private static i b(com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        i iVar = new i();
        boolean p4 = bVar.p("VUI: aspect_ratio_info_present_flag");
        iVar.f14171a = p4;
        if (p4) {
            a a5 = a.a((int) bVar.s(8, "VUI: aspect_ratio"));
            iVar.f14195y = a5;
            if (a5 == a.f14095b) {
                iVar.f14172b = (int) bVar.s(16, "VUI: sar_width");
                iVar.f14173c = (int) bVar.s(16, "VUI: sar_height");
            }
        }
        boolean p5 = bVar.p("VUI: overscan_info_present_flag");
        iVar.f14174d = p5;
        if (p5) {
            iVar.f14175e = bVar.p("VUI: overscan_appropriate_flag");
        }
        boolean p6 = bVar.p("VUI: video_signal_type_present_flag");
        iVar.f14176f = p6;
        if (p6) {
            iVar.f14177g = (int) bVar.s(3, "VUI: video_format");
            iVar.f14178h = bVar.p("VUI: video_full_range_flag");
            boolean p7 = bVar.p("VUI: colour_description_present_flag");
            iVar.f14179i = p7;
            if (p7) {
                iVar.f14180j = (int) bVar.s(8, "VUI: colour_primaries");
                iVar.f14181k = (int) bVar.s(8, "VUI: transfer_characteristics");
                iVar.f14182l = (int) bVar.s(8, "VUI: matrix_coefficients");
            }
        }
        boolean p8 = bVar.p("VUI: chroma_loc_info_present_flag");
        iVar.f14183m = p8;
        if (p8) {
            iVar.f14184n = bVar.y("VUI chroma_sample_loc_type_top_field");
            iVar.f14185o = bVar.y("VUI chroma_sample_loc_type_bottom_field");
        }
        boolean p9 = bVar.p("VUI: timing_info_present_flag");
        iVar.f14186p = p9;
        if (p9) {
            iVar.f14187q = (int) bVar.s(32, "VUI: num_units_in_tick");
            iVar.f14188r = (int) bVar.s(32, "VUI: time_scale");
            iVar.f14189s = bVar.p("VUI: fixed_frame_rate_flag");
        }
        boolean p10 = bVar.p("VUI: nal_hrd_parameters_present_flag");
        if (p10) {
            iVar.f14192v = d(bVar);
        }
        boolean p11 = bVar.p("VUI: vcl_hrd_parameters_present_flag");
        if (p11) {
            iVar.f14193w = d(bVar);
        }
        if (p10 || p11) {
            iVar.f14190t = bVar.p("VUI: low_delay_hrd_flag");
        }
        iVar.f14191u = bVar.p("VUI: pic_struct_present_flag");
        if (bVar.p("VUI: bitstream_restriction_flag")) {
            i.a aVar = new i.a();
            iVar.f14194x = aVar;
            aVar.f14196a = bVar.p("VUI: motion_vectors_over_pic_boundaries_flag");
            iVar.f14194x.f14197b = bVar.y("VUI max_bytes_per_pic_denom");
            iVar.f14194x.f14198c = bVar.y("VUI max_bits_per_mb_denom");
            iVar.f14194x.f14199d = bVar.y("VUI log2_max_mv_length_horizontal");
            iVar.f14194x.f14200e = bVar.y("VUI log2_max_mv_length_vertical");
            iVar.f14194x.f14201f = bVar.y("VUI num_reorder_frames");
            iVar.f14194x.f14202g = bVar.y("VUI max_dec_frame_buffering");
        }
        return iVar;
    }

    public static h c(InputStream inputStream) throws IOException {
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(inputStream);
        h hVar = new h();
        hVar.f14161q = (int) bVar.s(8, "SPS: profile_idc");
        hVar.f14163s = bVar.p("SPS: constraint_set_0_flag");
        hVar.f14164t = bVar.p("SPS: constraint_set_1_flag");
        hVar.f14165u = bVar.p("SPS: constraint_set_2_flag");
        hVar.f14166v = bVar.p("SPS: constraint_set_3_flag");
        hVar.f14167w = bVar.p("SPS: constraint_set_4_flag");
        hVar.f14168x = bVar.p("SPS: constraint_set_5_flag");
        hVar.f14162r = bVar.s(2, "SPS: reserved_zero_2bits");
        hVar.f14169y = (int) bVar.s(8, "SPS: level_idc");
        hVar.f14170z = bVar.y("SPS: seq_parameter_set_id");
        int i4 = hVar.f14161q;
        if (i4 != 100 && i4 != 110 && i4 != 122 && i4 != 144) {
            hVar.f14153i = c.f14098e;
        } else {
            c a5 = c.a(bVar.y("SPS: chroma_format_idc"));
            hVar.f14153i = a5;
            if (a5 == c.f14100g) {
                hVar.A = bVar.p("SPS: residual_color_transform_flag");
            }
            hVar.f14158n = bVar.y("SPS: bit_depth_luma_minus8");
            hVar.f14159o = bVar.y("SPS: bit_depth_chroma_minus8");
            hVar.f14160p = bVar.p("SPS: qpprime_y_zero_transform_bypass_flag");
            if (bVar.p("SPS: seq_scaling_matrix_present_lag")) {
                e(bVar, hVar);
            }
        }
        hVar.f14154j = bVar.y("SPS: log2_max_frame_num_minus4");
        int y2 = bVar.y("SPS: pic_order_cnt_type");
        hVar.f14145a = y2;
        if (y2 == 0) {
            hVar.f14155k = bVar.y("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (y2 == 1) {
            hVar.f14147c = bVar.p("SPS: delta_pic_order_always_zero_flag");
            hVar.B = bVar.t("SPS: offset_for_non_ref_pic");
            hVar.C = bVar.t("SPS: offset_for_top_to_bottom_field");
            int y4 = bVar.y("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            hVar.O = y4;
            hVar.L = new int[y4];
            for (int i5 = 0; i5 < hVar.O; i5++) {
                int[] iArr = hVar.L;
                iArr[i5] = bVar.t("SPS: offsetForRefFrame [" + i5 + "]");
            }
        }
        hVar.D = bVar.y("SPS: num_ref_frames");
        hVar.E = bVar.p("SPS: gaps_in_frame_num_value_allowed_flag");
        hVar.f14157m = bVar.y("SPS: pic_width_in_mbs_minus1");
        hVar.f14156l = bVar.y("SPS: pic_height_in_map_units_minus1");
        boolean p4 = bVar.p("SPS: frame_mbs_only_flag");
        hVar.F = p4;
        if (!p4) {
            hVar.f14151g = bVar.p("SPS: mb_adaptive_frame_field_flag");
        }
        hVar.f14152h = bVar.p("SPS: direct_8x8_inference_flag");
        boolean p5 = bVar.p("SPS: frame_cropping_flag");
        hVar.G = p5;
        if (p5) {
            hVar.H = bVar.y("SPS: frame_crop_left_offset");
            hVar.I = bVar.y("SPS: frame_crop_right_offset");
            hVar.J = bVar.y("SPS: frame_crop_top_offset");
            hVar.K = bVar.y("SPS: frame_crop_bottom_offset");
        }
        if (bVar.p("SPS: vui_parameters_present_flag")) {
            hVar.M = b(bVar);
        }
        bVar.v();
        return hVar;
    }

    private static d d(com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        d dVar = new d();
        dVar.f14104a = bVar.y("SPS: cpb_cnt_minus1");
        dVar.f14105b = (int) bVar.s(4, "HRD: bit_rate_scale");
        dVar.f14106c = (int) bVar.s(4, "HRD: cpb_size_scale");
        int i4 = dVar.f14104a;
        dVar.f14107d = new int[i4 + 1];
        dVar.f14108e = new int[i4 + 1];
        dVar.f14109f = new boolean[i4 + 1];
        for (int i5 = 0; i5 <= dVar.f14104a; i5++) {
            dVar.f14107d[i5] = bVar.y("HRD: bit_rate_value_minus1");
            dVar.f14108e[i5] = bVar.y("HRD: cpb_size_value_minus1");
            dVar.f14109f[i5] = bVar.p("HRD: cbr_flag");
        }
        dVar.f14110g = (int) bVar.s(5, "HRD: initial_cpb_removal_delay_length_minus1");
        dVar.f14111h = (int) bVar.s(5, "HRD: cpb_removal_delay_length_minus1");
        dVar.f14112i = (int) bVar.s(5, "HRD: dpb_output_delay_length_minus1");
        dVar.f14113j = (int) bVar.s(5, "HRD: time_offset_length");
        return dVar;
    }

    private static void e(com.googlecode.mp4parser.h264.read.b bVar, h hVar) throws IOException {
        hVar.N = new g();
        for (int i4 = 0; i4 < 8; i4++) {
            if (bVar.p("SPS: seqScalingListPresentFlag")) {
                g gVar = hVar.N;
                f[] fVarArr = new f[8];
                gVar.f14143a = fVarArr;
                f[] fVarArr2 = new f[8];
                gVar.f14144b = fVarArr2;
                if (i4 < 6) {
                    fVarArr[i4] = f.a(bVar, 16);
                } else {
                    fVarArr2[i4 - 6] = f.a(bVar, 64);
                }
            }
        }
    }

    private void f(d dVar, h1.b bVar) throws IOException {
        bVar.o(dVar.f14104a, "HRD: cpb_cnt_minus1");
        bVar.h(dVar.f14105b, 4, "HRD: bit_rate_scale");
        bVar.h(dVar.f14106c, 4, "HRD: cpb_size_scale");
        for (int i4 = 0; i4 <= dVar.f14104a; i4++) {
            bVar.o(dVar.f14107d[i4], "HRD: ");
            bVar.o(dVar.f14108e[i4], "HRD: ");
            bVar.g(dVar.f14109f[i4], "HRD: ");
        }
        bVar.h(dVar.f14110g, 5, "HRD: initial_cpb_removal_delay_length_minus1");
        bVar.h(dVar.f14111h, 5, "HRD: cpb_removal_delay_length_minus1");
        bVar.h(dVar.f14112i, 5, "HRD: dpb_output_delay_length_minus1");
        bVar.h(dVar.f14113j, 5, "HRD: time_offset_length");
    }

    private void g(i iVar, h1.b bVar) throws IOException {
        bVar.g(iVar.f14171a, "VUI: aspect_ratio_info_present_flag");
        if (iVar.f14171a) {
            bVar.h(iVar.f14195y.b(), 8, "VUI: aspect_ratio");
            if (iVar.f14195y == a.f14095b) {
                bVar.h(iVar.f14172b, 16, "VUI: sar_width");
                bVar.h(iVar.f14173c, 16, "VUI: sar_height");
            }
        }
        bVar.g(iVar.f14174d, "VUI: overscan_info_present_flag");
        if (iVar.f14174d) {
            bVar.g(iVar.f14175e, "VUI: overscan_appropriate_flag");
        }
        bVar.g(iVar.f14176f, "VUI: video_signal_type_present_flag");
        if (iVar.f14176f) {
            bVar.h(iVar.f14177g, 3, "VUI: video_format");
            bVar.g(iVar.f14178h, "VUI: video_full_range_flag");
            bVar.g(iVar.f14179i, "VUI: colour_description_present_flag");
            if (iVar.f14179i) {
                bVar.h(iVar.f14180j, 8, "VUI: colour_primaries");
                bVar.h(iVar.f14181k, 8, "VUI: transfer_characteristics");
                bVar.h(iVar.f14182l, 8, "VUI: matrix_coefficients");
            }
        }
        bVar.g(iVar.f14183m, "VUI: chroma_loc_info_present_flag");
        if (iVar.f14183m) {
            bVar.o(iVar.f14184n, "VUI: chroma_sample_loc_type_top_field");
            bVar.o(iVar.f14185o, "VUI: chroma_sample_loc_type_bottom_field");
        }
        bVar.g(iVar.f14186p, "VUI: timing_info_present_flag");
        if (iVar.f14186p) {
            bVar.h(iVar.f14187q, 32, "VUI: num_units_in_tick");
            bVar.h(iVar.f14188r, 32, "VUI: time_scale");
            bVar.g(iVar.f14189s, "VUI: fixed_frame_rate_flag");
        }
        bVar.g(iVar.f14192v != null, "VUI: ");
        d dVar = iVar.f14192v;
        if (dVar != null) {
            f(dVar, bVar);
        }
        bVar.g(iVar.f14193w != null, "VUI: ");
        d dVar2 = iVar.f14193w;
        if (dVar2 != null) {
            f(dVar2, bVar);
        }
        if (iVar.f14192v != null || iVar.f14193w != null) {
            bVar.g(iVar.f14190t, "VUI: low_delay_hrd_flag");
        }
        bVar.g(iVar.f14191u, "VUI: pic_struct_present_flag");
        bVar.g(iVar.f14194x != null, "VUI: ");
        i.a aVar = iVar.f14194x;
        if (aVar != null) {
            bVar.g(aVar.f14196a, "VUI: motion_vectors_over_pic_boundaries_flag");
            bVar.o(iVar.f14194x.f14197b, "VUI: max_bytes_per_pic_denom");
            bVar.o(iVar.f14194x.f14198c, "VUI: max_bits_per_mb_denom");
            bVar.o(iVar.f14194x.f14199d, "VUI: log2_max_mv_length_horizontal");
            bVar.o(iVar.f14194x.f14200e, "VUI: log2_max_mv_length_vertical");
            bVar.o(iVar.f14194x.f14201f, "VUI: num_reorder_frames");
            bVar.o(iVar.f14194x.f14202g, "VUI: max_dec_frame_buffering");
        }
    }

    @Override // com.googlecode.mp4parser.h264.model.b
    public void a(OutputStream outputStream) throws IOException {
        h1.b bVar = new h1.b(outputStream);
        bVar.h(this.f14161q, 8, "SPS: profile_idc");
        bVar.g(this.f14163s, "SPS: constraint_set_0_flag");
        bVar.g(this.f14164t, "SPS: constraint_set_1_flag");
        bVar.g(this.f14165u, "SPS: constraint_set_2_flag");
        bVar.g(this.f14166v, "SPS: constraint_set_3_flag");
        bVar.h(0L, 4, "SPS: reserved");
        bVar.h(this.f14169y, 8, "SPS: level_idc");
        bVar.o(this.f14170z, "SPS: seq_parameter_set_id");
        int i4 = this.f14161q;
        if (i4 == 100 || i4 == 110 || i4 == 122 || i4 == 144) {
            bVar.o(this.f14153i.b(), "SPS: chroma_format_idc");
            if (this.f14153i == c.f14100g) {
                bVar.g(this.A, "SPS: residual_color_transform_flag");
            }
            bVar.o(this.f14158n, "SPS: ");
            bVar.o(this.f14159o, "SPS: ");
            bVar.g(this.f14160p, "SPS: qpprime_y_zero_transform_bypass_flag");
            bVar.g(this.N != null, "SPS: ");
            if (this.N != null) {
                for (int i5 = 0; i5 < 8; i5++) {
                    if (i5 < 6) {
                        bVar.g(this.N.f14143a[i5] != null, "SPS: ");
                        f[] fVarArr = this.N.f14143a;
                        if (fVarArr[i5] != null) {
                            fVarArr[i5].b(bVar);
                        }
                    } else {
                        int i6 = i5 - 6;
                        bVar.g(this.N.f14144b[i6] != null, "SPS: ");
                        f[] fVarArr2 = this.N.f14144b;
                        if (fVarArr2[i6] != null) {
                            fVarArr2[i6].b(bVar);
                        }
                    }
                }
            }
        }
        bVar.o(this.f14154j, "SPS: log2_max_frame_num_minus4");
        bVar.o(this.f14145a, "SPS: pic_order_cnt_type");
        int i7 = this.f14145a;
        if (i7 == 0) {
            bVar.o(this.f14155k, "SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (i7 == 1) {
            bVar.g(this.f14147c, "SPS: delta_pic_order_always_zero_flag");
            bVar.i(this.B, "SPS: offset_for_non_ref_pic");
            bVar.i(this.C, "SPS: offset_for_top_to_bottom_field");
            bVar.o(this.L.length, "SPS: ");
            int i8 = 0;
            while (true) {
                int[] iArr = this.L;
                if (i8 >= iArr.length) {
                    break;
                }
                bVar.i(iArr[i8], "SPS: ");
                i8++;
            }
        }
        bVar.o(this.D, "SPS: num_ref_frames");
        bVar.g(this.E, "SPS: gaps_in_frame_num_value_allowed_flag");
        bVar.o(this.f14157m, "SPS: pic_width_in_mbs_minus1");
        bVar.o(this.f14156l, "SPS: pic_height_in_map_units_minus1");
        bVar.g(this.F, "SPS: frame_mbs_only_flag");
        if (!this.F) {
            bVar.g(this.f14151g, "SPS: mb_adaptive_frame_field_flag");
        }
        bVar.g(this.f14152h, "SPS: direct_8x8_inference_flag");
        bVar.g(this.G, "SPS: frame_cropping_flag");
        if (this.G) {
            bVar.o(this.H, "SPS: frame_crop_left_offset");
            bVar.o(this.I, "SPS: frame_crop_right_offset");
            bVar.o(this.J, "SPS: frame_crop_top_offset");
            bVar.o(this.K, "SPS: frame_crop_bottom_offset");
        }
        bVar.g(this.M != null, "SPS: ");
        i iVar = this.M;
        if (iVar != null) {
            g(iVar, bVar);
        }
        bVar.k();
    }

    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.f14145a + ", \n        field_pic_flag=" + this.f14146b + ", \n        delta_pic_order_always_zero_flag=" + this.f14147c + ", \n        weighted_pred_flag=" + this.f14148d + ", \n        weighted_bipred_idc=" + this.f14149e + ", \n        entropy_coding_mode_flag=" + this.f14150f + ", \n        mb_adaptive_frame_field_flag=" + this.f14151g + ", \n        direct_8x8_inference_flag=" + this.f14152h + ", \n        chroma_format_idc=" + this.f14153i + ", \n        log2_max_frame_num_minus4=" + this.f14154j + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.f14155k + ", \n        pic_height_in_map_units_minus1=" + this.f14156l + ", \n        pic_width_in_mbs_minus1=" + this.f14157m + ", \n        bit_depth_luma_minus8=" + this.f14158n + ", \n        bit_depth_chroma_minus8=" + this.f14159o + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.f14160p + ", \n        profile_idc=" + this.f14161q + ", \n        constraint_set_0_flag=" + this.f14163s + ", \n        constraint_set_1_flag=" + this.f14164t + ", \n        constraint_set_2_flag=" + this.f14165u + ", \n        constraint_set_3_flag=" + this.f14166v + ", \n        constraint_set_4_flag=" + this.f14167w + ", \n        constraint_set_5_flag=" + this.f14168x + ", \n        level_idc=" + this.f14169y + ", \n        seq_parameter_set_id=" + this.f14170z + ", \n        residual_color_transform_flag=" + this.A + ", \n        offset_for_non_ref_pic=" + this.B + ", \n        offset_for_top_to_bottom_field=" + this.C + ", \n        num_ref_frames=" + this.D + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.E + ", \n        frame_mbs_only_flag=" + this.F + ", \n        frame_cropping_flag=" + this.G + ", \n        frame_crop_left_offset=" + this.H + ", \n        frame_crop_right_offset=" + this.I + ", \n        frame_crop_top_offset=" + this.J + ", \n        frame_crop_bottom_offset=" + this.K + ", \n        offsetForRefFrame=" + this.L + ", \n        vuiParams=" + this.M + ", \n        scalingMatrix=" + this.N + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.O + '}';
    }
}
