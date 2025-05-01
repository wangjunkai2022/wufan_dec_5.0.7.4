package com.googlecode.mp4parser.authoring.tracks.h265;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
/* compiled from: SequenceParameterSetRbsp.java */
/* loaded from: classes3.dex */
public class f {
    public f(InputStream inputStream) throws IOException {
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(inputStream);
        bVar.s(4, "sps_video_parameter_set_id");
        int s4 = (int) bVar.s(3, "sps_max_sub_layers_minus1");
        bVar.p("sps_temporal_id_nesting_flag");
        a(s4, bVar);
        bVar.y("sps_seq_parameter_set_id");
        if (bVar.y("chroma_format_idc") == 3) {
            bVar.h();
            bVar.y("pic_width_in_luma_samples");
            bVar.y("pic_width_in_luma_samples");
            if (bVar.p("conformance_window_flag")) {
                bVar.y("conf_win_left_offset");
                bVar.y("conf_win_right_offset");
                bVar.y("conf_win_top_offset");
                bVar.y("conf_win_bottom_offset");
            }
        }
        bVar.y("bit_depth_luma_minus8");
        bVar.y("bit_depth_chroma_minus8");
        bVar.y("log2_max_pic_order_cnt_lsb_minus4");
        boolean p4 = bVar.p("sps_sub_layer_ordering_info_present_flag");
        int i4 = (s4 - (p4 ? 0 : s4)) + 1;
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        for (int i5 = p4 ? 0 : s4; i5 <= s4; i5++) {
            iArr[i5] = bVar.y("sps_max_dec_pic_buffering_minus1[" + i5 + "]");
            iArr2[i5] = bVar.y("sps_max_num_reorder_pics[" + i5 + "]");
            iArr3[i5] = bVar.y("sps_max_latency_increase_plus1[" + i5 + "]");
        }
        bVar.y("log2_min_luma_coding_block_size_minus3");
        bVar.y("log2_diff_max_min_luma_coding_block_size");
        bVar.y("log2_min_transform_block_size_minus2");
        bVar.y("log2_diff_max_min_transform_block_size");
        bVar.y("max_transform_hierarchy_depth_inter");
        bVar.y("max_transform_hierarchy_depth_intra");
        if (bVar.p("scaling_list_enabled_flag") && bVar.p("sps_scaling_list_data_present_flag")) {
            b(bVar);
        }
        bVar.p("amp_enabled_flag");
        bVar.p("sample_adaptive_offset_enabled_flag");
        if (bVar.p("pcm_enabled_flag")) {
            bVar.s(4, "pcm_sample_bit_depth_luma_minus1");
            bVar.s(4, "pcm_sample_bit_depth_chroma_minus1");
            bVar.y("log2_min_pcm_luma_coding_block_size_minus3");
        }
    }

    private void a(int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        long[] jArr;
        boolean[] zArr;
        int i5 = i4;
        int i6 = 2;
        bVar.w(2, "general_profile_space");
        bVar.p("general_tier_flag");
        bVar.w(5, "general_profile_idc");
        int i7 = 32;
        boolean[] zArr2 = new boolean[32];
        char c5 = 0;
        int i8 = 0;
        while (i8 < i7) {
            zArr2[i8] = bVar.i();
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
        bVar.s(44, "general_reserved_zero_44bits");
        bVar.j();
        boolean[] zArr3 = new boolean[i5];
        boolean[] zArr4 = new boolean[i5];
        int i9 = 0;
        while (i9 < i5) {
            zArr3[i9] = bVar.p("sub_layer_profile_present_flag[" + i9 + "]");
            zArr4[i9] = bVar.p("sub_layer_level_present_flag[" + i9 + "]");
            i9++;
            i5 = i4;
            i6 = 2;
            i7 = 32;
            c5 = 0;
        }
        if (i5 > 0) {
            int[] iArr = new int[8];
            for (int i10 = i5; i10 < 8; i10++) {
                iArr[i10] = bVar.w(i6, "reserved_zero_2bits[" + i10 + "]");
            }
        }
        int[] iArr2 = new int[i5];
        boolean[] zArr5 = new boolean[i5];
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i6];
        iArr4[1] = i7;
        iArr4[c5] = i5;
        boolean[][] zArr6 = (boolean[][]) Array.newInstance(boolean.class, iArr4);
        boolean[] zArr7 = new boolean[i5];
        boolean[] zArr8 = new boolean[i5];
        boolean[] zArr9 = new boolean[i5];
        boolean[] zArr10 = new boolean[i5];
        long[] jArr2 = new long[i5];
        int[] iArr5 = new int[i5];
        int i11 = 0;
        while (i11 < i5) {
            if (zArr3[i11]) {
                zArr = zArr3;
                iArr2[i11] = bVar.w(2, "sub_layer_profile_space[" + i11 + "]");
                zArr5[i11] = bVar.p("sub_layer_tier_flag[" + i11 + "]");
                iArr3[i11] = bVar.w(5, "sub_layer_profile_idc[" + i11 + "]");
                int i12 = 0;
                while (i12 < 32) {
                    boolean[] zArr11 = zArr6[i11];
                    zArr11[i12] = bVar.p("sub_layer_profile_compatibility_flag[" + i11 + "][" + i12 + "]");
                    i12++;
                    jArr2 = jArr2;
                }
                zArr7[i11] = bVar.p("sub_layer_progressive_source_flag[" + i11 + "]");
                zArr8[i11] = bVar.p("sub_layer_interlaced_source_flag[" + i11 + "]");
                zArr9[i11] = bVar.p("sub_layer_non_packed_constraint_flag[" + i11 + "]");
                zArr10[i11] = bVar.p("sub_layer_frame_only_constraint_flag[" + i11 + "]");
                jArr2[i11] = bVar.k(44);
                jArr = jArr2;
            } else {
                jArr = jArr2;
                zArr = zArr3;
            }
            if (zArr4[i11]) {
                iArr5[i11] = bVar.w(8, "sub_layer_level_idc[" + i11 + "]");
            }
            i11++;
            i5 = i4;
            zArr3 = zArr;
            jArr2 = jArr;
        }
    }

    private void b(com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        int i4 = 4;
        boolean[][] zArr = new boolean[4];
        int[][] iArr = new int[4];
        int[][] iArr2 = new int[2];
        int[][][] iArr3 = new int[4][];
        int i5 = 0;
        while (i5 < i4) {
            int i6 = 0;
            while (true) {
                if (i6 >= (i5 == 3 ? 2 : 6)) {
                    break;
                }
                zArr[i5] = new boolean[i5 == 3 ? 2 : 6];
                iArr[i5] = new int[i5 == 3 ? 2 : 6];
                iArr3[i5] = new int[i5 == 3 ? 2 : 6];
                zArr[i5][i6] = bVar.i();
                if (!zArr[i5][i6]) {
                    iArr[i5][i6] = bVar.y("scaling_list_pred_matrix_id_delta[" + i5 + "][" + i6 + "]");
                } else {
                    int min = Math.min(64, 1 << ((i5 << 1) + i4));
                    int i7 = 8;
                    if (i5 > 1) {
                        int i8 = i5 - 2;
                        iArr2[i8][i6] = bVar.t("scaling_list_dc_coef_minus8[" + i5 + "- 2][" + i6 + "]");
                        i7 = 8 + iArr2[i8][i6];
                    }
                    iArr3[i5][i6] = new int[min];
                    for (int i9 = 0; i9 < min; i9++) {
                        i7 = ((i7 + bVar.t("scaling_list_delta_coef ")) + 256) % 256;
                        iArr3[i5][i6][i9] = i7;
                    }
                }
                i6++;
                i4 = 4;
            }
            i5++;
        }
    }
}
