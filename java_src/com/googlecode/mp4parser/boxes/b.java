package com.googlecode.mp4parser.boxes;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.j;
import com.mp4parser.iso23001.part7.a;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AbstractSampleEncryptionBox.java */
/* loaded from: classes3.dex */
public abstract class b extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13733w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13734x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13735y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13736z = null;

    /* renamed from: s  reason: collision with root package name */
    protected int f13737s;

    /* renamed from: t  reason: collision with root package name */
    protected int f13738t;

    /* renamed from: u  reason: collision with root package name */
    protected byte[] f13739u;

    /* renamed from: v  reason: collision with root package name */
    List<com.mp4parser.iso23001.part7.a> f13740v;

    static {
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(String str) {
        super(str);
        this.f13737s = -1;
        this.f13738t = -1;
        this.f13739u = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.f13740v = Collections.emptyList();
    }

    private List<com.mp4parser.iso23001.part7.a> A(ByteBuffer byteBuffer, long j4, int i4) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j5 = j4 - 1;
            if (j4 <= 0) {
                return arrayList;
            }
            try {
                com.mp4parser.iso23001.part7.a aVar = new com.mp4parser.iso23001.part7.a();
                byte[] bArr = new byte[i4];
                aVar.f57254a = bArr;
                byteBuffer.get(bArr);
                if ((getFlags() & 2) > 0) {
                    aVar.f57255b = new a.k[g.i(byteBuffer)];
                    int i5 = 0;
                    while (true) {
                        a.k[] kVarArr = aVar.f57255b;
                        if (i5 >= kVarArr.length) {
                            break;
                        }
                        kVarArr[i5] = aVar.a(g.i(byteBuffer), g.l(byteBuffer));
                        i5++;
                    }
                }
                arrayList.add(aVar);
                j4 = j5;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AbstractSampleEncryptionBox.java", b.class);
        f13733w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", MethodReflectParams.INT), 29);
        f13734x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 89);
        f13735y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 93);
        f13736z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 162);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", TTDownloadField.TT_HASHCODE, "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", MethodReflectParams.INT), 189);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 197);
    }

    public void B(List<com.mp4parser.iso23001.part7.a> list) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13735y, this, this, list));
        this.f13740v = list;
    }

    @DoNotParseDetail
    public void C(boolean z4) {
        if (z4) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }

    @Override // com.googlecode.mp4parser.a, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        super.a(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.f13737s = g.k(byteBuffer);
            this.f13738t = g.p(byteBuffer);
            byte[] bArr = new byte[16];
            this.f13739u = bArr;
            byteBuffer.get(bArr);
        }
        long l4 = g.l(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        List<com.mp4parser.iso23001.part7.a> A2 = A(duplicate, l4, 8);
        this.f13740v = A2;
        if (A2 == null) {
            this.f13740v = A(duplicate2, l4, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate.remaining());
        }
        if (this.f13740v == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        a.k[] kVarArr;
        u(byteBuffer);
        if (y()) {
            i.h(byteBuffer, this.f13737s);
            i.m(byteBuffer, this.f13738t);
            byteBuffer.put(this.f13739u);
        }
        i.i(byteBuffer, this.f13740v.size());
        for (com.mp4parser.iso23001.part7.a aVar : this.f13740v) {
            if (aVar.b() > 0) {
                byte[] bArr = aVar.f57254a;
                if (bArr.length != 8 && bArr.length != 16) {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                byteBuffer.put(bArr);
                if (z()) {
                    i.f(byteBuffer, aVar.f57255b.length);
                    for (a.k kVar : aVar.f57255b) {
                        i.f(byteBuffer, kVar.clear());
                        i.i(byteBuffer, kVar.a());
                    }
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        long length = (y() ? 8 + this.f13739u.length : 4L) + 4;
        for (com.mp4parser.iso23001.part7.a aVar : this.f13740v) {
            length += aVar.b();
        }
        return length;
    }

    public boolean equals(Object obj) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13736z, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13737s == bVar.f13737s && this.f13738t == bVar.f13738t) {
            List<com.mp4parser.iso23001.part7.a> list = this.f13740v;
            if (list == null ? bVar.f13740v == null : list.equals(bVar.f13740v)) {
                return Arrays.equals(this.f13739u, bVar.f13739u);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        int i4 = ((this.f13737s * 31) + this.f13738t) * 31;
        byte[] bArr = this.f13739u;
        int hashCode = (i4 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<com.mp4parser.iso23001.part7.a> list = this.f13740v;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public List<com.mp4parser.iso23001.part7.a> v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13734x, this, this));
        return this.f13740v;
    }

    public List<Short> w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        ArrayList arrayList = new ArrayList(this.f13740v.size());
        for (com.mp4parser.iso23001.part7.a aVar : this.f13740v) {
            short length = (short) aVar.f57254a.length;
            if (z()) {
                length = (short) (((short) (length + 2)) + (aVar.f57255b.length * 6));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13733w, this, this));
        return (getSize() > IjkMediaMeta.AV_CH_WIDE_RIGHT ? 16 : 8) + (y() ? this.f13739u.length + 4 : 0) + 4;
    }

    @DoNotParseDetail
    protected boolean y() {
        return (getFlags() & 1) > 0;
    }

    @DoNotParseDetail
    public boolean z() {
        return (getFlags() & 2) > 0;
    }
}
