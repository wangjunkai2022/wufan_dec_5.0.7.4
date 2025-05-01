package com.googlecode.mp4parser.authoring.tracks.mjpeg;

import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.e;
import com.googlecode.mp4parser.authoring.c;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.h;
import com.googlecode.mp4parser.authoring.i;
import com.googlecode.mp4parser.boxes.mp4.b;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.l;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;
/* compiled from: OneJpegPerIframe.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e  reason: collision with root package name */
    File[] f13538e;

    /* renamed from: f  reason: collision with root package name */
    i f13539f;

    /* renamed from: g  reason: collision with root package name */
    long[] f13540g;

    /* renamed from: h  reason: collision with root package name */
    s0 f13541h;

    /* renamed from: i  reason: collision with root package name */
    long[] f13542i;

    /* compiled from: OneJpegPerIframe.java */
    /* renamed from: com.googlecode.mp4parser.authoring.tracks.mjpeg.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0296a extends AbstractList<f> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OneJpegPerIframe.java */
        /* renamed from: com.googlecode.mp4parser.authoring.tracks.mjpeg.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0297a implements f {

            /* renamed from: a  reason: collision with root package name */
            ByteBuffer f13544a = null;

            /* renamed from: c  reason: collision with root package name */
            private final /* synthetic */ int f13546c;

            C0297a(int i4) {
                this.f13546c = i4;
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public ByteBuffer a() {
                if (this.f13544a == null) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(a.this.f13538e[this.f13546c], "r");
                        this.f13544a = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                }
                return this.f13544a;
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public void b(WritableByteChannel writableByteChannel) throws IOException {
                RandomAccessFile randomAccessFile = new RandomAccessFile(a.this.f13538e[this.f13546c], "r");
                randomAccessFile.getChannel().transferTo(0L, randomAccessFile.length(), writableByteChannel);
                randomAccessFile.close();
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public long getSize() {
                return a.this.f13538e[this.f13546c].length();
            }
        }

        C0296a() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public f get(int i4) {
            return new C0297a(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return a.this.f13538e.length;
        }
    }

    public a(String str, File[] fileArr, h hVar) throws IOException {
        super(str);
        this.f13539f = new i();
        this.f13538e = fileArr;
        if (hVar.q().length == fileArr.length) {
            BufferedImage read = ImageIO.read(fileArr[0]);
            this.f13539f.v(read.getWidth());
            this.f13539f.n(read.getHeight());
            this.f13539f.s(hVar.M().h());
            long[] O = hVar.O();
            long[] q4 = hVar.q();
            this.f13540g = new long[q4.length];
            long j4 = 0;
            boolean z4 = true;
            long j5 = 0;
            int i4 = 1;
            for (int i5 = 1; i5 < O.length; i5++) {
                if (i4 < q4.length && i5 == q4[i4]) {
                    this.f13540g[i4 - 1] = j5;
                    i4++;
                    j5 = 0;
                }
                j5 += O[i5];
            }
            long[] jArr = this.f13540g;
            jArr[jArr.length - 1] = j5;
            this.f13541h = new s0();
            com.coremedia.iso.boxes.sampleentry.h hVar2 = new com.coremedia.iso.boxes.sampleentry.h(com.coremedia.iso.boxes.sampleentry.h.f9918x);
            this.f13541h.v(hVar2);
            b bVar = new b();
            bVar.y(ByteBuffer.wrap(e.a("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102")));
            bVar.B((g) l.a(-1, ByteBuffer.wrap(e.a("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102"))));
            hVar2.v(bVar);
            this.f13542i = new long[fileArr.length];
            int i6 = 0;
            while (true) {
                long[] jArr2 = this.f13542i;
                if (i6 >= jArr2.length) {
                    break;
                }
                int i7 = i6 + 1;
                jArr2[i6] = i7;
                i6 = i7;
            }
            double d5 = 0.0d;
            boolean z5 = true;
            for (c cVar : hVar.H()) {
                if (cVar.b() == -1 && !z4) {
                    throw new RuntimeException("Cannot accept edit list for processing (1)");
                }
                if (cVar.b() >= 0 && !z5) {
                    throw new RuntimeException("Cannot accept edit list for processing (2)");
                }
                if (cVar.b() == -1) {
                    d5 += cVar.c();
                } else {
                    double b5 = cVar.b();
                    double d6 = cVar.d();
                    Double.isNaN(b5);
                    Double.isNaN(d6);
                    d5 -= b5 / d6;
                    z5 = false;
                    z4 = false;
                }
            }
            if (hVar.n() != null && hVar.n().size() > 0) {
                int[] copyOfRange = Arrays.copyOfRange(com.coremedia.iso.boxes.i.v(hVar.n()), 0, 50);
                for (int i8 = 0; i8 < copyOfRange.length; i8++) {
                    copyOfRange[i8] = (int) (copyOfRange[i8] + j4);
                    j4 += hVar.O()[i8];
                }
                Arrays.sort(copyOfRange);
                double d7 = copyOfRange[0];
                double h4 = hVar.M().h();
                Double.isNaN(d7);
                Double.isNaN(h4);
                d5 += d7 / h4;
            }
            if (d5 < 0.0d) {
                List<c> H = H();
                double h5 = M().h();
                Double.isNaN(h5);
                long j6 = (long) ((-d5) * h5);
                long h6 = M().h();
                double duration = getDuration();
                double h7 = M().h();
                Double.isNaN(duration);
                Double.isNaN(h7);
                H.add(new c(j6, h6, 1.0d, duration / h7));
                return;
            } else if (d5 > 0.0d) {
                H().add(new c(-1L, M().h(), 1.0d, d5));
                List<c> H2 = H();
                long h8 = M().h();
                double duration2 = getDuration();
                double h9 = M().h();
                Double.isNaN(duration2);
                Double.isNaN(h9);
                H2.add(new c(0L, h8, 1.0d, duration2 / h9));
                return;
            } else {
                return;
            }
        }
        throw new RuntimeException("Number of sync samples doesn't match the number of stills (" + hVar.q().length + " vs. " + fileArr.length + ")");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i M() {
        return this.f13539f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13540g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "vide";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13541h;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return this.f13542i;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> x() {
        return new C0296a();
    }
}
