package com.mp4parser.iso14496.part15;

import com.android.dx.io.Opcodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
/* compiled from: HevcDecoderConfigurationRecord.java */
/* loaded from: classes5.dex */
public class d {
    boolean A;

    /* renamed from: a  reason: collision with root package name */
    int f57154a;

    /* renamed from: b  reason: collision with root package name */
    int f57155b;

    /* renamed from: c  reason: collision with root package name */
    boolean f57156c;

    /* renamed from: d  reason: collision with root package name */
    int f57157d;

    /* renamed from: e  reason: collision with root package name */
    long f57158e;

    /* renamed from: f  reason: collision with root package name */
    long f57159f;

    /* renamed from: g  reason: collision with root package name */
    int f57160g;

    /* renamed from: i  reason: collision with root package name */
    int f57162i;

    /* renamed from: k  reason: collision with root package name */
    int f57164k;

    /* renamed from: m  reason: collision with root package name */
    int f57166m;

    /* renamed from: o  reason: collision with root package name */
    int f57168o;

    /* renamed from: q  reason: collision with root package name */
    int f57170q;

    /* renamed from: r  reason: collision with root package name */
    int f57171r;

    /* renamed from: s  reason: collision with root package name */
    int f57172s;

    /* renamed from: t  reason: collision with root package name */
    int f57173t;

    /* renamed from: u  reason: collision with root package name */
    boolean f57174u;

    /* renamed from: v  reason: collision with root package name */
    int f57175v;

    /* renamed from: x  reason: collision with root package name */
    boolean f57177x;

    /* renamed from: y  reason: collision with root package name */
    boolean f57178y;

    /* renamed from: z  reason: collision with root package name */
    boolean f57179z;

    /* renamed from: h  reason: collision with root package name */
    int f57161h = 15;

    /* renamed from: j  reason: collision with root package name */
    int f57163j = 63;

    /* renamed from: l  reason: collision with root package name */
    int f57165l = 63;

    /* renamed from: n  reason: collision with root package name */
    int f57167n = 31;

    /* renamed from: p  reason: collision with root package name */
    int f57169p = 31;

    /* renamed from: w  reason: collision with root package name */
    List<a> f57176w = new ArrayList();

    /* compiled from: HevcDecoderConfigurationRecord.java */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f57180a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f57181b;

        /* renamed from: c  reason: collision with root package name */
        public int f57182c;

        /* renamed from: d  reason: collision with root package name */
        public List<byte[]> f57183d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f57180a == aVar.f57180a && this.f57182c == aVar.f57182c && this.f57181b == aVar.f57181b) {
                ListIterator<byte[]> listIterator = this.f57183d.listIterator();
                ListIterator<byte[]> listIterator2 = aVar.f57183d.listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    byte[] next = listIterator.next();
                    byte[] next2 = listIterator2.next();
                    if (next == null) {
                        if (next2 != null) {
                            return false;
                        }
                    } else if (!Arrays.equals(next, next2)) {
                        return false;
                    }
                }
                return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            int i4 = (((((this.f57180a ? 1 : 0) * 31) + (this.f57181b ? 1 : 0)) * 31) + this.f57182c) * 31;
            List<byte[]> list = this.f57183d;
            return i4 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.f57182c + ", reserved=" + this.f57181b + ", array_completeness=" + this.f57180a + ", num_nals=" + this.f57183d.size() + '}';
        }
    }

    public void A(int i4) {
        this.f57170q = i4;
    }

    public void B(int i4) {
        this.f57168o = i4;
    }

    public void C(int i4) {
        this.f57166m = i4;
    }

    public void D(int i4) {
        this.f57154a = i4;
    }

    public void E(int i4) {
        this.f57172s = i4;
    }

    public void F(boolean z4) {
        this.f57177x = z4;
    }

    public void G(long j4) {
        this.f57159f = j4;
    }

    public void H(int i4) {
        this.f57160g = i4;
    }

    public void I(long j4) {
        this.f57158e = j4;
    }

    public void J(int i4) {
        this.f57157d = i4;
    }

    public void K(int i4) {
        this.f57155b = i4;
    }

    public void L(boolean z4) {
        this.f57156c = z4;
    }

    public void M(boolean z4) {
        this.f57179z = z4;
    }

    public void N(int i4) {
        this.f57175v = i4;
    }

    public void O(int i4) {
        this.f57162i = i4;
    }

    public void P(boolean z4) {
        this.f57178y = z4;
    }

    public void Q(int i4) {
        this.f57173t = i4;
    }

    public void R(int i4) {
        this.f57164k = i4;
    }

    public void S(boolean z4) {
        this.A = z4;
    }

    public void T(boolean z4) {
        this.f57174u = z4;
    }

    public void U(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.m(byteBuffer, this.f57154a);
        com.coremedia.iso.i.m(byteBuffer, (this.f57155b << 6) + (this.f57156c ? 32 : 0) + this.f57157d);
        com.coremedia.iso.i.i(byteBuffer, this.f57158e);
        long j4 = this.f57159f;
        if (this.f57177x) {
            j4 |= 140737488355328L;
        }
        if (this.f57178y) {
            j4 |= 70368744177664L;
        }
        if (this.f57179z) {
            j4 |= 35184372088832L;
        }
        if (this.A) {
            j4 |= 17592186044416L;
        }
        com.coremedia.iso.i.k(byteBuffer, j4);
        com.coremedia.iso.i.m(byteBuffer, this.f57160g);
        com.coremedia.iso.i.f(byteBuffer, (this.f57161h << 12) + this.f57162i);
        com.coremedia.iso.i.m(byteBuffer, (this.f57163j << 2) + this.f57164k);
        com.coremedia.iso.i.m(byteBuffer, (this.f57165l << 2) + this.f57166m);
        com.coremedia.iso.i.m(byteBuffer, (this.f57167n << 3) + this.f57168o);
        com.coremedia.iso.i.m(byteBuffer, (this.f57169p << 3) + this.f57170q);
        com.coremedia.iso.i.f(byteBuffer, this.f57171r);
        com.coremedia.iso.i.m(byteBuffer, (this.f57172s << 6) + (this.f57173t << 3) + (this.f57174u ? 4 : 0) + this.f57175v);
        com.coremedia.iso.i.m(byteBuffer, this.f57176w.size());
        for (a aVar : this.f57176w) {
            com.coremedia.iso.i.m(byteBuffer, (aVar.f57180a ? 128 : 0) + (aVar.f57181b ? 64 : 0) + aVar.f57182c);
            com.coremedia.iso.i.f(byteBuffer, aVar.f57183d.size());
            for (byte[] bArr : aVar.f57183d) {
                com.coremedia.iso.i.f(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }

    public List<a> a() {
        return this.f57176w;
    }

    public int b() {
        return this.f57171r;
    }

    public int c() {
        return this.f57170q;
    }

    public int d() {
        return this.f57168o;
    }

    public int e() {
        return this.f57166m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f57171r == dVar.f57171r && this.f57170q == dVar.f57170q && this.f57168o == dVar.f57168o && this.f57166m == dVar.f57166m && this.f57154a == dVar.f57154a && this.f57172s == dVar.f57172s && this.f57159f == dVar.f57159f && this.f57160g == dVar.f57160g && this.f57158e == dVar.f57158e && this.f57157d == dVar.f57157d && this.f57155b == dVar.f57155b && this.f57156c == dVar.f57156c && this.f57175v == dVar.f57175v && this.f57162i == dVar.f57162i && this.f57173t == dVar.f57173t && this.f57164k == dVar.f57164k && this.f57161h == dVar.f57161h && this.f57163j == dVar.f57163j && this.f57165l == dVar.f57165l && this.f57167n == dVar.f57167n && this.f57169p == dVar.f57169p && this.f57174u == dVar.f57174u) {
            List<a> list = this.f57176w;
            List<a> list2 = dVar.f57176w;
            return list == null ? list2 == null : list.equals(list2);
        }
        return false;
    }

    public int f() {
        return this.f57154a;
    }

    public int g() {
        return this.f57172s;
    }

    public long h() {
        return this.f57159f;
    }

    public int hashCode() {
        long j4 = this.f57158e;
        long j5 = this.f57159f;
        int i4 = ((((((((((((((((((((((((((((((((((((((((((this.f57154a * 31) + this.f57155b) * 31) + (this.f57156c ? 1 : 0)) * 31) + this.f57157d) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f57160g) * 31) + this.f57161h) * 31) + this.f57162i) * 31) + this.f57163j) * 31) + this.f57164k) * 31) + this.f57165l) * 31) + this.f57166m) * 31) + this.f57167n) * 31) + this.f57168o) * 31) + this.f57169p) * 31) + this.f57170q) * 31) + this.f57171r) * 31) + this.f57172s) * 31) + this.f57173t) * 31) + (this.f57174u ? 1 : 0)) * 31) + this.f57175v) * 31;
        List<a> list = this.f57176w;
        return i4 + (list != null ? list.hashCode() : 0);
    }

    public int i() {
        return this.f57160g;
    }

    public long j() {
        return this.f57158e;
    }

    public int k() {
        return this.f57157d;
    }

    public int l() {
        return this.f57155b;
    }

    public int m() {
        return this.f57175v;
    }

    public int n() {
        return this.f57162i;
    }

    public int o() {
        return this.f57173t;
    }

    public int p() {
        return this.f57164k;
    }

    public int q() {
        int i4 = 23;
        for (a aVar : this.f57176w) {
            i4 += 3;
            for (byte[] bArr : aVar.f57183d) {
                i4 = i4 + 2 + bArr.length;
            }
        }
        return i4;
    }

    public boolean r() {
        return this.f57177x;
    }

    public boolean s() {
        return this.f57156c;
    }

    public boolean t() {
        return this.f57179z;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.f57154a);
        sb.append(", general_profile_space=");
        sb.append(this.f57155b);
        sb.append(", general_tier_flag=");
        sb.append(this.f57156c);
        sb.append(", general_profile_idc=");
        sb.append(this.f57157d);
        sb.append(", general_profile_compatibility_flags=");
        sb.append(this.f57158e);
        sb.append(", general_constraint_indicator_flags=");
        sb.append(this.f57159f);
        sb.append(", general_level_idc=");
        sb.append(this.f57160g);
        String str5 = "";
        if (this.f57161h != 15) {
            str = ", reserved1=" + this.f57161h;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.f57162i);
        if (this.f57163j != 63) {
            str2 = ", reserved2=" + this.f57163j;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.f57164k);
        if (this.f57165l != 63) {
            str3 = ", reserved3=" + this.f57165l;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.f57166m);
        if (this.f57167n != 31) {
            str4 = ", reserved4=" + this.f57167n;
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.f57168o);
        if (this.f57169p != 31) {
            str5 = ", reserved5=" + this.f57169p;
        }
        sb.append(str5);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.f57170q);
        sb.append(", avgFrameRate=");
        sb.append(this.f57171r);
        sb.append(", constantFrameRate=");
        sb.append(this.f57172s);
        sb.append(", numTemporalLayers=");
        sb.append(this.f57173t);
        sb.append(", temporalIdNested=");
        sb.append(this.f57174u);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.f57175v);
        sb.append(", arrays=");
        sb.append(this.f57176w);
        sb.append('}');
        return sb.toString();
    }

    public boolean u() {
        return this.f57178y;
    }

    public boolean v() {
        return this.A;
    }

    public boolean w() {
        return this.f57174u;
    }

    public void x(ByteBuffer byteBuffer) {
        this.f57154a = com.coremedia.iso.g.p(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f57155b = (p4 & 192) >> 6;
        this.f57156c = (p4 & 32) > 0;
        this.f57157d = p4 & 31;
        this.f57158e = com.coremedia.iso.g.l(byteBuffer);
        long n4 = com.coremedia.iso.g.n(byteBuffer);
        this.f57159f = n4;
        this.f57177x = ((n4 >> 44) & 8) > 0;
        this.f57178y = ((n4 >> 44) & 4) > 0;
        this.f57179z = ((n4 >> 44) & 2) > 0;
        this.A = ((n4 >> 44) & 1) > 0;
        this.f57159f = n4 & 140737488355327L;
        this.f57160g = com.coremedia.iso.g.p(byteBuffer);
        int i4 = com.coremedia.iso.g.i(byteBuffer);
        this.f57161h = (61440 & i4) >> 12;
        this.f57162i = i4 & 4095;
        int p5 = com.coremedia.iso.g.p(byteBuffer);
        this.f57163j = (p5 & Opcodes.INVOKE_CUSTOM) >> 2;
        this.f57164k = p5 & 3;
        int p6 = com.coremedia.iso.g.p(byteBuffer);
        this.f57165l = (p6 & Opcodes.INVOKE_CUSTOM) >> 2;
        this.f57166m = p6 & 3;
        int p7 = com.coremedia.iso.g.p(byteBuffer);
        this.f57167n = (p7 & 248) >> 3;
        this.f57168o = p7 & 7;
        int p8 = com.coremedia.iso.g.p(byteBuffer);
        this.f57169p = (p8 & 248) >> 3;
        this.f57170q = p8 & 7;
        this.f57171r = com.coremedia.iso.g.i(byteBuffer);
        int p9 = com.coremedia.iso.g.p(byteBuffer);
        this.f57172s = (p9 & 192) >> 6;
        this.f57173t = (p9 & 56) >> 3;
        this.f57174u = (p9 & 4) > 0;
        this.f57175v = p9 & 3;
        int p10 = com.coremedia.iso.g.p(byteBuffer);
        this.f57176w = new ArrayList();
        for (int i5 = 0; i5 < p10; i5++) {
            a aVar = new a();
            int p11 = com.coremedia.iso.g.p(byteBuffer);
            aVar.f57180a = (p11 & 128) > 0;
            aVar.f57181b = (p11 & 64) > 0;
            aVar.f57182c = p11 & 63;
            int i6 = com.coremedia.iso.g.i(byteBuffer);
            aVar.f57183d = new ArrayList();
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr = new byte[com.coremedia.iso.g.i(byteBuffer)];
                byteBuffer.get(bArr);
                aVar.f57183d.add(bArr);
            }
            this.f57176w.add(aVar);
        }
    }

    public void y(List<a> list) {
        this.f57176w = list;
    }

    public void z(int i4) {
        this.f57171r = i4;
    }
}
