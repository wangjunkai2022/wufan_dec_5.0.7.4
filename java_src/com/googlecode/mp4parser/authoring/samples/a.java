package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.f1;
import com.coremedia.iso.boxes.h0;
import com.coremedia.iso.boxes.j;
import com.coremedia.iso.boxes.t0;
import com.coremedia.iso.boxes.v0;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.util.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DefaultMp4SampleList.java */
/* loaded from: classes3.dex */
public class a extends AbstractList<f> {

    /* renamed from: k  reason: collision with root package name */
    private static final long f13231k = 268435456;

    /* renamed from: b  reason: collision with root package name */
    j f13232b;

    /* renamed from: c  reason: collision with root package name */
    f1 f13233c;

    /* renamed from: d  reason: collision with root package name */
    ByteBuffer[][] f13234d;

    /* renamed from: e  reason: collision with root package name */
    int[] f13235e;

    /* renamed from: f  reason: collision with root package name */
    long[] f13236f;

    /* renamed from: g  reason: collision with root package name */
    long[] f13237g;

    /* renamed from: h  reason: collision with root package name */
    long[][] f13238h;

    /* renamed from: i  reason: collision with root package name */
    t0 f13239i;

    /* renamed from: j  reason: collision with root package name */
    int f13240j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultMp4SampleList.java */
    /* renamed from: com.googlecode.mp4parser.authoring.samples.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0293a implements f {

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ long f13242b;

        /* renamed from: c  reason: collision with root package name */
        private final /* synthetic */ ByteBuffer f13243c;

        /* renamed from: d  reason: collision with root package name */
        private final /* synthetic */ long f13244d;

        C0293a(long j4, ByteBuffer byteBuffer, long j5) {
            this.f13242b = j4;
            this.f13243c = byteBuffer;
            this.f13244d = j5;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            return (ByteBuffer) ((ByteBuffer) this.f13243c.position(c.a(this.f13244d))).slice().limit(c.a(this.f13242b));
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(a());
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f13242b;
        }

        public String toString() {
            return "DefaultMp4Sample(size:" + this.f13242b + ")";
        }
    }

    public a(long j4, j jVar) {
        int i4;
        this.f13233c = null;
        this.f13234d = null;
        int i5 = 0;
        this.f13232b = jVar;
        for (f1 f1Var : ((h0) jVar.g(h0.class).get(0)).g(f1.class)) {
            if (f1Var.E().C() == j4) {
                this.f13233c = f1Var;
            }
        }
        f1 f1Var2 = this.f13233c;
        if (f1Var2 != null) {
            long[] v2 = f1Var2.D().C().v();
            this.f13236f = v2;
            this.f13237g = new long[v2.length];
            this.f13234d = new ByteBuffer[v2.length];
            this.f13238h = new long[v2.length];
            this.f13239i = this.f13233c.D().J();
            List<v0.a> w4 = this.f13233c.D().K().w();
            v0.a[] aVarArr = (v0.a[]) w4.toArray(new v0.a[w4.size()]);
            v0.a aVar = aVarArr[0];
            long a5 = aVar.a();
            int a6 = c.a(aVar.c());
            int size = size();
            int i6 = 0;
            int i7 = 1;
            int i8 = 0;
            int i9 = 1;
            do {
                i6++;
                if (i6 == a5) {
                    if (aVarArr.length > i7) {
                        v0.a aVar2 = aVarArr[i7];
                        i8 = a6;
                        a6 = c.a(aVar2.c());
                        i7++;
                        a5 = aVar2.a();
                    } else {
                        i8 = a6;
                        a6 = -1;
                        a5 = Long.MAX_VALUE;
                    }
                }
                this.f13238h[i6 - 1] = new long[i8];
                i9 += i8;
            } while (i9 <= size);
            this.f13235e = new int[i6 + 1];
            v0.a aVar3 = aVarArr[0];
            long a7 = aVar3.a();
            int a8 = c.a(aVar3.c());
            int i10 = 0;
            int i11 = 1;
            int i12 = 1;
            int i13 = 0;
            while (true) {
                i4 = i10 + 1;
                this.f13235e[i10] = i11;
                if (i4 == a7) {
                    if (aVarArr.length > i12) {
                        v0.a aVar4 = aVarArr[i12];
                        i13 = a8;
                        i12++;
                        a8 = c.a(aVar4.c());
                        a7 = aVar4.a();
                    } else {
                        i13 = a8;
                        a8 = -1;
                        a7 = Long.MAX_VALUE;
                    }
                }
                i11 += i13;
                if (i11 > size) {
                    break;
                }
                i10 = i4;
            }
            this.f13235e[i4] = Integer.MAX_VALUE;
            long j5 = 0;
            for (int i14 = 1; i14 <= this.f13239i.v(); i14++) {
                while (i14 == this.f13235e[i5]) {
                    i5++;
                    j5 = 0;
                }
                long[] jArr = this.f13237g;
                int i15 = i5 - 1;
                int i16 = i14 - 1;
                jArr[i15] = jArr[i15] + this.f13239i.x(i16);
                this.f13238h[i15][i14 - this.f13235e[i15]] = j5;
                j5 += this.f13239i.x(i16);
            }
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j4);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public f get(int i4) {
        ByteBuffer byteBuffer;
        long j4;
        if (i4 < this.f13239i.v()) {
            int b5 = b(i4);
            int i5 = this.f13235e[b5] - 1;
            long j5 = b5;
            long j6 = this.f13236f[c.a(j5)];
            long[] jArr = this.f13238h[c.a(j5)];
            long j7 = jArr[i4 - i5];
            ByteBuffer[] byteBufferArr = this.f13234d[c.a(j5)];
            if (byteBufferArr == null) {
                ArrayList arrayList = new ArrayList();
                long j8 = 0;
                int i6 = 0;
                while (i6 < jArr.length) {
                    try {
                        long j9 = j5;
                        if ((jArr[i6] + this.f13239i.x(i6 + i5)) - j8 > f13231k) {
                            j4 = j7;
                            arrayList.add(this.f13232b.r(j6 + j8, jArr[i6] - j8));
                            j8 = jArr[i6];
                        } else {
                            j4 = j7;
                        }
                        i6++;
                        j7 = j4;
                        j5 = j9;
                    } catch (IOException e5) {
                        throw new IndexOutOfBoundsException(e5.getMessage());
                    }
                }
                arrayList.add(this.f13232b.r(j6 + j8, (-j8) + jArr[jArr.length - 1] + this.f13239i.x((i5 + jArr.length) - 1)));
                byteBufferArr = (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
                this.f13234d[c.a(j5)] = byteBufferArr;
            }
            int length = byteBufferArr.length;
            long j10 = j7;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    byteBuffer = null;
                    break;
                }
                ByteBuffer byteBuffer2 = byteBufferArr[i7];
                if (j10 < byteBuffer2.limit()) {
                    byteBuffer = byteBuffer2;
                    break;
                }
                j10 -= byteBuffer2.limit();
                i7++;
            }
            return new C0293a(this.f13239i.x(i4), byteBuffer, j10);
        }
        throw new IndexOutOfBoundsException();
    }

    synchronized int b(int i4) {
        int i5 = i4 + 1;
        int[] iArr = this.f13235e;
        int i6 = this.f13240j;
        if (i5 >= iArr[i6] && i5 < iArr[i6 + 1]) {
            return i6;
        }
        if (i5 < iArr[i6]) {
            this.f13240j = 0;
            while (true) {
                int[] iArr2 = this.f13235e;
                int i7 = this.f13240j;
                if (iArr2[i7 + 1] > i5) {
                    return i7;
                }
                this.f13240j = i7 + 1;
            }
        } else {
            this.f13240j = i6 + 1;
            while (true) {
                int[] iArr3 = this.f13235e;
                int i8 = this.f13240j;
                if (iArr3[i8 + 1] > i5) {
                    return i8;
                }
                this.f13240j = i8 + 1;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return c.a(this.f13233c.D().J().v());
    }
}
