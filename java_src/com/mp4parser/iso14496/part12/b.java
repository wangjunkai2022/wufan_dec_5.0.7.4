package com.mp4parser.iso14496.part12;

import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: SampleAuxiliaryInformationOffsetsBox.java */
/* loaded from: classes5.dex */
public class b extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: v  reason: collision with root package name */
    public static final String f57097v = "saio";

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f57098w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f57099x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f57100y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f57101z = null;

    /* renamed from: s  reason: collision with root package name */
    private long[] f57102s;

    /* renamed from: t  reason: collision with root package name */
    private String f57103t;

    /* renamed from: u  reason: collision with root package name */
    private String f57104u;

    static {
        s();
    }

    public b() {
        super(f57097v);
        this.f57102s = new long[0];
    }

    private static /* synthetic */ void s() {
        e eVar = new e("SampleAuxiliaryInformationOffsetsBox.java", b.class);
        f57098w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 107);
        f57099x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        f57100y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 115);
        f57101z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"), 123);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", "void"), 127);
    }

    public void A(long[] jArr) {
        j.b().c(e.w(B, this, this, jArr));
        this.f57102s = jArr;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.f57103t = g.b(byteBuffer);
            this.f57104u = g.b(byteBuffer);
        }
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.f57102s = new long[a5];
        for (int i4 = 0; i4 < a5; i4++) {
            if (getVersion() == 0) {
                this.f57102s[i4] = g.l(byteBuffer);
            } else {
                this.f57102s[i4] = g.o(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(f.C(this.f57103t));
            byteBuffer.put(f.C(this.f57104u));
        }
        i.i(byteBuffer, this.f57102s.length);
        for (long j4 : this.f57102s) {
            Long valueOf = Long.valueOf(j4);
            if (getVersion() == 0) {
                i.i(byteBuffer, valueOf.longValue());
            } else {
                i.l(byteBuffer, valueOf.longValue());
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (getVersion() == 0 ? this.f57102s.length * 4 : this.f57102s.length * 8) + 8 + ((getFlags() & 1) != 1 ? 0 : 8);
    }

    public String v() {
        j.b().c(e.v(f57098w, this, this));
        return this.f57103t;
    }

    public String w() {
        j.b().c(e.v(f57100y, this, this));
        return this.f57104u;
    }

    public long[] x() {
        j.b().c(e.v(A, this, this));
        return this.f57102s;
    }

    public void y(String str) {
        j.b().c(e.w(f57099x, this, this, str));
        this.f57103t = str;
    }

    public void z(String str) {
        j.b().c(e.w(f57101z, this, this, str));
        this.f57104u = str;
    }
}
