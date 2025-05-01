package com.facebook.imagepipeline.image;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.k;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.SharedReference;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
/* compiled from: EncodedImage.java */
@Immutable
/* loaded from: classes.dex */
public class e implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final int f11917m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f11918n = -1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f11919o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f11920p = -1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f11921q = 1;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.references.a<PooledByteBuffer> f11922b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final k<FileInputStream> f11923c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.imageformat.c f11924d;

    /* renamed from: e  reason: collision with root package name */
    private int f11925e;

    /* renamed from: f  reason: collision with root package name */
    private int f11926f;

    /* renamed from: g  reason: collision with root package name */
    private int f11927g;

    /* renamed from: h  reason: collision with root package name */
    private int f11928h;

    /* renamed from: i  reason: collision with root package name */
    private int f11929i;

    /* renamed from: j  reason: collision with root package name */
    private int f11930j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private com.facebook.imagepipeline.common.a f11931k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private ColorSpace f11932l;

    public e(com.facebook.common.references.a<PooledByteBuffer> aVar) {
        this.f11924d = com.facebook.imageformat.c.f11540c;
        this.f11925e = -1;
        this.f11926f = 0;
        this.f11927g = -1;
        this.f11928h = -1;
        this.f11929i = 1;
        this.f11930j = -1;
        com.facebook.common.internal.h.d(com.facebook.common.references.a.t(aVar));
        this.f11922b = aVar.clone();
        this.f11923c = null;
    }

    public static boolean D(e eVar) {
        return eVar.f11925e >= 0 && eVar.f11927g >= 0 && eVar.f11928h >= 0;
    }

    public static boolean J(@Nullable e eVar) {
        return eVar != null && eVar.E();
    }

    private void N() {
        if (this.f11927g < 0 || this.f11928h < 0) {
            K();
        }
    }

    private com.facebook.imageutils.b P() {
        InputStream inputStream;
        try {
            inputStream = u();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            com.facebook.imageutils.b d5 = com.facebook.imageutils.a.d(inputStream);
            this.f11932l = d5.a();
            Pair<Integer, Integer> b5 = d5.b();
            if (b5 != null) {
                this.f11927g = ((Integer) b5.first).intValue();
                this.f11928h = ((Integer) b5.second).intValue();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return d5;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private Pair<Integer, Integer> S() {
        Pair<Integer, Integer> g4 = com.facebook.imageutils.f.g(u());
        if (g4 != null) {
            this.f11927g = ((Integer) g4.first).intValue();
            this.f11928h = ((Integer) g4.second).intValue();
        }
        return g4;
    }

    @Nullable
    public static e b(e eVar) {
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static void d(@Nullable e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    @VisibleForTesting
    @Nullable
    public synchronized SharedReference<PooledByteBuffer> A() {
        com.facebook.common.references.a<PooledByteBuffer> aVar;
        aVar = this.f11922b;
        return aVar != null ? aVar.l() : null;
    }

    public int B() {
        N();
        return this.f11927g;
    }

    public boolean C(int i4) {
        if (this.f11924d == com.facebook.imageformat.b.f11528a && this.f11923c == null) {
            com.facebook.common.internal.h.i(this.f11922b);
            PooledByteBuffer k4 = this.f11922b.k();
            return k4.f(i4 + (-2)) == -1 && k4.f(i4 - 1) == -39;
        }
        return true;
    }

    public synchronized boolean E() {
        boolean z4;
        if (!com.facebook.common.references.a.t(this.f11922b)) {
            z4 = this.f11923c != null;
        }
        return z4;
    }

    public void K() {
        Pair<Integer, Integer> b5;
        com.facebook.imageformat.c d5 = com.facebook.imageformat.d.d(u());
        this.f11924d = d5;
        if (com.facebook.imageformat.b.c(d5)) {
            b5 = S();
        } else {
            b5 = P().b();
        }
        if (d5 == com.facebook.imageformat.b.f11528a && this.f11925e == -1) {
            if (b5 != null) {
                int b6 = com.facebook.imageutils.c.b(u());
                this.f11926f = b6;
                this.f11925e = com.facebook.imageutils.c.a(b6);
            }
        } else if (d5 == com.facebook.imageformat.b.f11538k && this.f11925e == -1) {
            int a5 = HeifExifUtil.a(u());
            this.f11926f = a5;
            this.f11925e = com.facebook.imageutils.c.a(a5);
        } else {
            this.f11925e = 0;
        }
    }

    public void T(@Nullable com.facebook.imagepipeline.common.a aVar) {
        this.f11931k = aVar;
    }

    public void V(int i4) {
        this.f11926f = i4;
    }

    public void W(int i4) {
        this.f11928h = i4;
    }

    public void X(com.facebook.imageformat.c cVar) {
        this.f11924d = cVar;
    }

    public void Y(int i4) {
        this.f11925e = i4;
    }

    public void Z(int i4) {
        this.f11929i = i4;
    }

    @Nullable
    public e a() {
        e eVar;
        k<FileInputStream> kVar = this.f11923c;
        if (kVar != null) {
            eVar = new e(kVar, this.f11930j);
        } else {
            com.facebook.common.references.a d5 = com.facebook.common.references.a.d(this.f11922b);
            if (d5 == null) {
                eVar = null;
            } else {
                try {
                    eVar = new e(d5);
                } finally {
                    com.facebook.common.references.a.h(d5);
                }
            }
        }
        if (eVar != null) {
            eVar.g(this);
        }
        return eVar;
    }

    public void a0(int i4) {
        this.f11930j = i4;
    }

    public void b0(int i4) {
        this.f11927g = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.facebook.common.references.a.h(this.f11922b);
    }

    public void g(e eVar) {
        this.f11924d = eVar.t();
        this.f11927g = eVar.B();
        this.f11928h = eVar.r();
        this.f11925e = eVar.v();
        this.f11926f = eVar.l();
        this.f11929i = eVar.y();
        this.f11930j = eVar.z();
        this.f11931k = eVar.j();
        this.f11932l = eVar.k();
    }

    public com.facebook.common.references.a<PooledByteBuffer> h() {
        return com.facebook.common.references.a.d(this.f11922b);
    }

    @Nullable
    public com.facebook.imagepipeline.common.a j() {
        return this.f11931k;
    }

    @Nullable
    public ColorSpace k() {
        N();
        return this.f11932l;
    }

    public int l() {
        N();
        return this.f11926f;
    }

    public String p(int i4) {
        com.facebook.common.references.a<PooledByteBuffer> h4 = h();
        if (h4 == null) {
            return "";
        }
        int min = Math.min(z(), i4);
        byte[] bArr = new byte[min];
        try {
            PooledByteBuffer k4 = h4.k();
            if (k4 == null) {
                return "";
            }
            k4.c(0, bArr, 0, min);
            h4.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i5 = 0; i5 < min; i5++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i5])));
            }
            return sb.toString();
        } finally {
            h4.close();
        }
    }

    public int r() {
        N();
        return this.f11928h;
    }

    public com.facebook.imageformat.c t() {
        N();
        return this.f11924d;
    }

    @Nullable
    public InputStream u() {
        k<FileInputStream> kVar = this.f11923c;
        if (kVar != null) {
            return kVar.get();
        }
        com.facebook.common.references.a d5 = com.facebook.common.references.a.d(this.f11922b);
        if (d5 != null) {
            try {
                return new com.facebook.common.memory.h((PooledByteBuffer) d5.k());
            } finally {
                com.facebook.common.references.a.h(d5);
            }
        }
        return null;
    }

    public int v() {
        N();
        return this.f11925e;
    }

    public int y() {
        return this.f11929i;
    }

    public int z() {
        com.facebook.common.references.a<PooledByteBuffer> aVar = this.f11922b;
        if (aVar != null && aVar.k() != null) {
            return this.f11922b.k().size();
        }
        return this.f11930j;
    }

    public e(k<FileInputStream> kVar) {
        this.f11924d = com.facebook.imageformat.c.f11540c;
        this.f11925e = -1;
        this.f11926f = 0;
        this.f11927g = -1;
        this.f11928h = -1;
        this.f11929i = 1;
        this.f11930j = -1;
        com.facebook.common.internal.h.i(kVar);
        this.f11922b = null;
        this.f11923c = kVar;
    }

    public e(k<FileInputStream> kVar, int i4) {
        this(kVar);
        this.f11930j = i4;
    }
}
