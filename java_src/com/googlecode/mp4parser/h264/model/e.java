package com.googlecode.mp4parser.h264.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
/* compiled from: PictureParameterSet.java */
/* loaded from: classes3.dex */
public class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14114a;

    /* renamed from: b  reason: collision with root package name */
    public int f14115b;

    /* renamed from: c  reason: collision with root package name */
    public int f14116c;

    /* renamed from: d  reason: collision with root package name */
    public int f14117d;

    /* renamed from: e  reason: collision with root package name */
    public int f14118e;

    /* renamed from: f  reason: collision with root package name */
    public int f14119f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14120g;

    /* renamed from: h  reason: collision with root package name */
    public int f14121h;

    /* renamed from: i  reason: collision with root package name */
    public int f14122i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14123j;

    /* renamed from: k  reason: collision with root package name */
    public int f14124k;

    /* renamed from: l  reason: collision with root package name */
    public int f14125l;

    /* renamed from: m  reason: collision with root package name */
    public int f14126m;

    /* renamed from: n  reason: collision with root package name */
    public int f14127n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14128o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14129p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14130q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f14131r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f14132s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f14133t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14134u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f14135v;

    /* renamed from: w  reason: collision with root package name */
    public a f14136w;

    /* compiled from: PictureParameterSet.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f14137a;

        /* renamed from: b  reason: collision with root package name */
        public g f14138b = new g();

        /* renamed from: c  reason: collision with root package name */
        public int f14139c;

        /* renamed from: d  reason: collision with root package name */
        public boolean[] f14140d;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.f14137a + ", scalindMatrix=" + this.f14138b + ", second_chroma_qp_index_offset=" + this.f14139c + ", pic_scaling_list_present_flag=" + this.f14140d + '}';
        }
    }

    public static e b(InputStream inputStream) throws IOException {
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(inputStream);
        e eVar = new e();
        eVar.f14118e = bVar.y("PPS: pic_parameter_set_id");
        eVar.f14119f = bVar.y("PPS: seq_parameter_set_id");
        eVar.f14114a = bVar.p("PPS: entropy_coding_mode_flag");
        eVar.f14120g = bVar.p("PPS: pic_order_present_flag");
        int y2 = bVar.y("PPS: num_slice_groups_minus1");
        eVar.f14121h = y2;
        if (y2 > 0) {
            int y4 = bVar.y("PPS: slice_group_map_type");
            eVar.f14122i = y4;
            int i4 = eVar.f14121h;
            eVar.f14131r = new int[i4 + 1];
            eVar.f14132s = new int[i4 + 1];
            eVar.f14133t = new int[i4 + 1];
            if (y4 == 0) {
                for (int i5 = 0; i5 <= eVar.f14121h; i5++) {
                    eVar.f14133t[i5] = bVar.y("PPS: run_length_minus1");
                }
            } else if (y4 == 2) {
                for (int i6 = 0; i6 < eVar.f14121h; i6++) {
                    eVar.f14131r[i6] = bVar.y("PPS: top_left");
                    eVar.f14132s[i6] = bVar.y("PPS: bottom_right");
                }
            } else if (y4 == 3 || y4 == 4 || y4 == 5) {
                eVar.f14134u = bVar.p("PPS: slice_group_change_direction_flag");
                eVar.f14117d = bVar.y("PPS: slice_group_change_rate_minus1");
            } else if (y4 == 6) {
                int i7 = i4 + 1 <= 4 ? i4 + 1 > 2 ? 2 : 1 : 3;
                int y5 = bVar.y("PPS: pic_size_in_map_units_minus1");
                eVar.f14135v = new int[y5 + 1];
                for (int i8 = 0; i8 <= y5; i8++) {
                    int[] iArr = eVar.f14135v;
                    iArr[i8] = bVar.w(i7, "PPS: slice_group_id [" + i8 + "]f");
                }
            }
        }
        eVar.f14115b = bVar.y("PPS: num_ref_idx_l0_active_minus1");
        eVar.f14116c = bVar.y("PPS: num_ref_idx_l1_active_minus1");
        eVar.f14123j = bVar.p("PPS: weighted_pred_flag");
        eVar.f14124k = (int) bVar.s(2, "PPS: weighted_bipred_idc");
        eVar.f14125l = bVar.t("PPS: pic_init_qp_minus26");
        eVar.f14126m = bVar.t("PPS: pic_init_qs_minus26");
        eVar.f14127n = bVar.t("PPS: chroma_qp_index_offset");
        eVar.f14128o = bVar.p("PPS: deblocking_filter_control_present_flag");
        eVar.f14129p = bVar.p("PPS: constrained_intra_pred_flag");
        eVar.f14130q = bVar.p("PPS: redundant_pic_cnt_present_flag");
        if (bVar.f()) {
            a aVar = new a();
            eVar.f14136w = aVar;
            aVar.f14137a = bVar.p("PPS: transform_8x8_mode_flag");
            if (bVar.p("PPS: pic_scaling_matrix_present_flag")) {
                for (int i9 = 0; i9 < ((eVar.f14136w.f14137a ? 1 : 0) * 2) + 6; i9++) {
                    if (bVar.p("PPS: pic_scaling_list_present_flag")) {
                        g gVar = eVar.f14136w.f14138b;
                        f[] fVarArr = new f[8];
                        gVar.f14143a = fVarArr;
                        f[] fVarArr2 = new f[8];
                        gVar.f14144b = fVarArr2;
                        if (i9 < 6) {
                            fVarArr[i9] = f.a(bVar, 16);
                        } else {
                            fVarArr2[i9 - 6] = f.a(bVar, 64);
                        }
                    }
                }
            }
            eVar.f14136w.f14139c = bVar.t("PPS: second_chroma_qp_index_offset");
        }
        bVar.v();
        return eVar;
    }

    public static e c(byte[] bArr) throws IOException {
        return b(new ByteArrayInputStream(bArr));
    }

    @Override // com.googlecode.mp4parser.h264.model.b
    public void a(OutputStream outputStream) throws IOException {
        h1.b bVar = new h1.b(outputStream);
        bVar.o(this.f14118e, "PPS: pic_parameter_set_id");
        bVar.o(this.f14119f, "PPS: seq_parameter_set_id");
        bVar.g(this.f14114a, "PPS: entropy_coding_mode_flag");
        bVar.g(this.f14120g, "PPS: pic_order_present_flag");
        bVar.o(this.f14121h, "PPS: num_slice_groups_minus1");
        if (this.f14121h > 0) {
            bVar.o(this.f14122i, "PPS: slice_group_map_type");
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            int i4 = this.f14122i;
            if (i4 == 0) {
                for (int i5 = 0; i5 <= this.f14121h; i5++) {
                    bVar.o(iArr3[i5], "PPS: ");
                }
            } else if (i4 == 2) {
                for (int i6 = 0; i6 < this.f14121h; i6++) {
                    bVar.o(iArr[i6], "PPS: ");
                    bVar.o(iArr2[i6], "PPS: ");
                }
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                bVar.g(this.f14134u, "PPS: slice_group_change_direction_flag");
                bVar.o(this.f14117d, "PPS: slice_group_change_rate_minus1");
            } else if (i4 == 6) {
                int i7 = this.f14121h;
                int i8 = i7 + 1 <= 4 ? i7 + 1 > 2 ? 2 : 1 : 3;
                bVar.o(this.f14135v.length, "PPS: ");
                int i9 = 0;
                while (true) {
                    int[] iArr4 = this.f14135v;
                    if (i9 > iArr4.length) {
                        break;
                    }
                    bVar.l(iArr4[i9], i8);
                    i9++;
                }
            }
        }
        bVar.o(this.f14115b, "PPS: num_ref_idx_l0_active_minus1");
        bVar.o(this.f14116c, "PPS: num_ref_idx_l1_active_minus1");
        bVar.g(this.f14123j, "PPS: weighted_pred_flag");
        bVar.h(this.f14124k, 2, "PPS: weighted_bipred_idc");
        bVar.i(this.f14125l, "PPS: pic_init_qp_minus26");
        bVar.i(this.f14126m, "PPS: pic_init_qs_minus26");
        bVar.i(this.f14127n, "PPS: chroma_qp_index_offset");
        bVar.g(this.f14128o, "PPS: deblocking_filter_control_present_flag");
        bVar.g(this.f14129p, "PPS: constrained_intra_pred_flag");
        bVar.g(this.f14130q, "PPS: redundant_pic_cnt_present_flag");
        a aVar = this.f14136w;
        if (aVar != null) {
            bVar.g(aVar.f14137a, "PPS: transform_8x8_mode_flag");
            bVar.g(this.f14136w.f14138b != null, "PPS: scalindMatrix");
            if (this.f14136w.f14138b != null) {
                int i10 = 0;
                while (true) {
                    a aVar2 = this.f14136w;
                    if (i10 >= ((aVar2.f14137a ? 1 : 0) * 2) + 6) {
                        break;
                    }
                    if (i10 < 6) {
                        bVar.g(aVar2.f14138b.f14143a[i10] != null, "PPS: ");
                        f[] fVarArr = this.f14136w.f14138b.f14143a;
                        if (fVarArr[i10] != null) {
                            fVarArr[i10].b(bVar);
                        }
                    } else {
                        int i11 = i10 - 6;
                        bVar.g(aVar2.f14138b.f14144b[i11] != null, "PPS: ");
                        f[] fVarArr2 = this.f14136w.f14138b.f14144b;
                        if (fVarArr2[i11] != null) {
                            fVarArr2[i11].b(bVar);
                        }
                    }
                    i10++;
                }
            }
            bVar.i(this.f14136w.f14139c, "PPS: ");
        }
        bVar.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (Arrays.equals(this.f14132s, eVar.f14132s) && this.f14127n == eVar.f14127n && this.f14129p == eVar.f14129p && this.f14128o == eVar.f14128o && this.f14114a == eVar.f14114a) {
                a aVar = this.f14136w;
                if (aVar == null) {
                    if (eVar.f14136w != null) {
                        return false;
                    }
                } else if (!aVar.equals(eVar.f14136w)) {
                    return false;
                }
                return this.f14115b == eVar.f14115b && this.f14116c == eVar.f14116c && this.f14121h == eVar.f14121h && this.f14125l == eVar.f14125l && this.f14126m == eVar.f14126m && this.f14120g == eVar.f14120g && this.f14118e == eVar.f14118e && this.f14130q == eVar.f14130q && Arrays.equals(this.f14133t, eVar.f14133t) && this.f14119f == eVar.f14119f && this.f14134u == eVar.f14134u && this.f14117d == eVar.f14117d && Arrays.equals(this.f14135v, eVar.f14135v) && this.f14122i == eVar.f14122i && Arrays.equals(this.f14131r, eVar.f14131r) && this.f14124k == eVar.f14124k && this.f14123j == eVar.f14123j;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((Arrays.hashCode(this.f14132s) + 31) * 31) + this.f14127n) * 31) + (this.f14129p ? 1231 : 1237)) * 31) + (this.f14128o ? 1231 : 1237)) * 31) + (this.f14114a ? 1231 : 1237)) * 31;
        a aVar = this.f14136w;
        return ((((((((((((((((((((((((((((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f14115b) * 31) + this.f14116c) * 31) + this.f14121h) * 31) + this.f14125l) * 31) + this.f14126m) * 31) + (this.f14120g ? 1231 : 1237)) * 31) + this.f14118e) * 31) + (this.f14130q ? 1231 : 1237)) * 31) + Arrays.hashCode(this.f14133t)) * 31) + this.f14119f) * 31) + (this.f14134u ? 1231 : 1237)) * 31) + this.f14117d) * 31) + Arrays.hashCode(this.f14135v)) * 31) + this.f14122i) * 31) + Arrays.hashCode(this.f14131r)) * 31) + this.f14124k) * 31) + (this.f14123j ? 1231 : 1237);
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.f14114a + ",\n       num_ref_idx_l0_active_minus1=" + this.f14115b + ",\n       num_ref_idx_l1_active_minus1=" + this.f14116c + ",\n       slice_group_change_rate_minus1=" + this.f14117d + ",\n       pic_parameter_set_id=" + this.f14118e + ",\n       seq_parameter_set_id=" + this.f14119f + ",\n       pic_order_present_flag=" + this.f14120g + ",\n       num_slice_groups_minus1=" + this.f14121h + ",\n       slice_group_map_type=" + this.f14122i + ",\n       weighted_pred_flag=" + this.f14123j + ",\n       weighted_bipred_idc=" + this.f14124k + ",\n       pic_init_qp_minus26=" + this.f14125l + ",\n       pic_init_qs_minus26=" + this.f14126m + ",\n       chroma_qp_index_offset=" + this.f14127n + ",\n       deblocking_filter_control_present_flag=" + this.f14128o + ",\n       constrained_intra_pred_flag=" + this.f14129p + ",\n       redundant_pic_cnt_present_flag=" + this.f14130q + ",\n       top_left=" + this.f14131r + ",\n       bottom_right=" + this.f14132s + ",\n       run_length_minus1=" + this.f14133t + ",\n       slice_group_change_direction_flag=" + this.f14134u + ",\n       slice_group_id=" + this.f14135v + ",\n       extended=" + this.f14136w + '}';
    }
}
