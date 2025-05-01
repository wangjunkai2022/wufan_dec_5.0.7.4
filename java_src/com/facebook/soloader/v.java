package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: UnpackingSoSource.java */
/* loaded from: classes.dex */
public abstract class v extends com.facebook.soloader.c {

    /* renamed from: r  reason: collision with root package name */
    private static final String f12804r = "fb-UnpackingSoSource";

    /* renamed from: s  reason: collision with root package name */
    private static final String f12805s = "dso_state";

    /* renamed from: t  reason: collision with root package name */
    private static final String f12806t = "dso_lock";

    /* renamed from: u  reason: collision with root package name */
    private static final String f12807u = "dso_deps";

    /* renamed from: v  reason: collision with root package name */
    private static final String f12808v = "dso_manifest";

    /* renamed from: w  reason: collision with root package name */
    private static final byte f12809w = 0;

    /* renamed from: x  reason: collision with root package name */
    private static final byte f12810x = 1;

    /* renamed from: y  reason: collision with root package name */
    private static final byte f12811y = 1;

    /* renamed from: n  reason: collision with root package name */
    protected final Context f12812n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    protected String f12813o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private String[] f12814p;

    /* renamed from: q  reason: collision with root package name */
    private final Map<String, Object> f12815q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f12816b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f12817c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f12818d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ File f12819e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n f12820f;

        a(File file, byte[] bArr, c cVar, File file2, n nVar) {
            this.f12816b = file;
            this.f12817c = bArr;
            this.f12818d = cVar;
            this.f12819e = file2;
            this.f12820f = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f12816b, net.lingala.zip4j.util.e.f71861e0);
                try {
                    randomAccessFile.write(this.f12817c);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(v.this.f12703j, v.f12808v), net.lingala.zip4j.util.e.f71861e0);
                    try {
                        this.f12818d.b(randomAccessFile2);
                        randomAccessFile2.close();
                        SysUtil.f(v.this.f12703j);
                        v.t(this.f12819e, (byte) 1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("releasing dso store lock for ");
                        sb.append(v.this.f12703j);
                        sb.append(" (from syncer thread)");
                        this.f12820f.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        public final String f12822b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12823c;

        public b(String str, String str2) {
            this.f12822b = str;
            this.f12823c = str2;
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f12824a;

        public c(b[] bVarArr) {
            this.f12824a = bVarArr;
        }

        static final c a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    b[] bVarArr = new b[readInt];
                    for (int i4 = 0; i4 < readInt; i4++) {
                        bVarArr[i4] = new b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void b(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f12824a.length);
            int i4 = 0;
            while (true) {
                b[] bVarArr = this.f12824a;
                if (i4 >= bVarArr.length) {
                    return;
                }
                dataOutput.writeUTF(bVarArr[i4].f12822b);
                dataOutput.writeUTF(this.f12824a[i4].f12823c);
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static final class d implements Closeable {

        /* renamed from: b  reason: collision with root package name */
        public final b f12825b;

        /* renamed from: c  reason: collision with root package name */
        public final InputStream f12826c;

        public d(b bVar, InputStream inputStream) {
            this.f12825b = bVar;
            this.f12826c = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f12826c.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static abstract class e implements Closeable {
        public abstract boolean a();

        public abstract d b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static abstract class f implements Closeable {
        protected abstract c a() throws IOException;

        protected abstract e b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v(Context context, String str) {
        super(n(context, str), 1);
        this.f12815q = new HashMap();
        this.f12812n = context;
    }

    private void j(b[] bVarArr) throws IOException {
        String[] list = this.f12703j.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(f12805s) && !str.equals(f12806t) && !str.equals(f12807u) && !str.equals(f12808v)) {
                    boolean z4 = false;
                    for (int i4 = 0; !z4 && i4 < bVarArr.length; i4++) {
                        if (bVarArr[i4].f12822b.equals(str)) {
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        File file = new File(this.f12703j, str);
                        StringBuilder sb = new StringBuilder();
                        sb.append("deleting unaccounted-for file ");
                        sb.append(file);
                        SysUtil.c(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f12703j);
    }

    private void k(d dVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        StringBuilder sb = new StringBuilder();
        sb.append("extracting DSO ");
        sb.append(dVar.f12825b.f12822b);
        if (this.f12703j.setWritable(true, true)) {
            File file = new File(this.f12703j, dVar.f12825b.f12822b);
            try {
                randomAccessFile = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error overwriting ");
                sb2.append(file);
                sb2.append(" trying to delete and start over");
                SysUtil.c(file);
                randomAccessFile = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
            }
            try {
                try {
                    int available = dVar.f12826c.available();
                    if (available > 1) {
                        SysUtil.d(randomAccessFile.getFD(), available);
                    }
                    SysUtil.a(randomAccessFile, dVar.f12826c, Integer.MAX_VALUE, bArr);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (file.setExecutable(true, false)) {
                        return;
                    }
                    throw new IOException("cannot make file executable: " + file);
                } catch (IOException e5) {
                    SysUtil.c(file);
                    throw e5;
                }
            } finally {
                randomAccessFile.close();
            }
        }
        throw new IOException("cannot make directory writable for us: " + this.f12703j);
    }

    private Object m(String str) {
        Object obj;
        synchronized (this.f12815q) {
            obj = this.f12815q.get(str);
            if (obj == null) {
                obj = new Object();
                this.f12815q.put(str, obj);
            }
        }
        return obj;
    }

    public static File n(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + net.lingala.zip4j.util.e.F0 + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(com.facebook.soloader.n r11, int r12, byte[] r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.v.q(com.facebook.soloader.n, int, byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #5 {all -> 0x002d, blocks: (B:4:0x0028, B:11:0x0034, B:12:0x003b, B:13:0x0045, B:15:0x004b, B:40:0x0091, B:18:0x0053, B:20:0x0058, B:22:0x0066, B:25:0x0077, B:29:0x007e), top: B:54:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #5 {all -> 0x002d, blocks: (B:4:0x0028, B:11:0x0034, B:12:0x003b, B:13:0x0045, B:15:0x004b, B:40:0x0091, B:18:0x0053, B:20:0x0058, B:22:0x0066, B:25:0x0077, B:29:0x007e), top: B:54:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r(byte r9, com.facebook.soloader.v.c r10, com.facebook.soloader.v.e r11) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.f12703j
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 1
            if (r9 != r0) goto L30
            com.facebook.soloader.v$c r9 = com.facebook.soloader.v.c.a(r1)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            goto L31
        L2d:
            r9 = move-exception
            goto Lae
        L30:
            r9 = 0
        L31:
            r2 = 0
            if (r9 != 0) goto L3b
            com.facebook.soloader.v$c r9 = new com.facebook.soloader.v$c     // Catch: java.lang.Throwable -> L2d
            com.facebook.soloader.v$b[] r3 = new com.facebook.soloader.v.b[r2]     // Catch: java.lang.Throwable -> L2d
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L2d
        L3b:
            com.facebook.soloader.v$b[] r10 = r10.f12824a     // Catch: java.lang.Throwable -> L2d
            r8.j(r10)     // Catch: java.lang.Throwable -> L2d
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L2d
        L45:
            boolean r3 = r11.a()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L95
            com.facebook.soloader.v$d r3 = r11.b()     // Catch: java.lang.Throwable -> L2d
            r4 = 1
            r5 = 0
        L51:
            if (r4 == 0) goto L7c
            com.facebook.soloader.v$b[] r6 = r9.f12824a     // Catch: java.lang.Throwable -> L7a
            int r7 = r6.length     // Catch: java.lang.Throwable -> L7a
            if (r5 >= r7) goto L7c
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.f12822b     // Catch: java.lang.Throwable -> L7a
            com.facebook.soloader.v$b r7 = r3.f12825b     // Catch: java.lang.Throwable -> L7a
            java.lang.String r7 = r7.f12822b     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L77
            com.facebook.soloader.v$b[] r6 = r9.f12824a     // Catch: java.lang.Throwable -> L7a
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.f12823c     // Catch: java.lang.Throwable -> L7a
            com.facebook.soloader.v$b r7 = r3.f12825b     // Catch: java.lang.Throwable -> L7a
            java.lang.String r7 = r7.f12823c     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L77
            r4 = 0
        L77:
            int r5 = r5 + 1
            goto L51
        L7a:
            r9 = move-exception
            goto L82
        L7c:
            if (r4 == 0) goto L8f
            r8.k(r3, r10)     // Catch: java.lang.Throwable -> L7a
            goto L8f
        L82:
            throw r9     // Catch: java.lang.Throwable -> L83
        L83:
            r10 = move-exception
            if (r3 == 0) goto L8e
            r3.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r11 = move-exception
            r9.addSuppressed(r11)     // Catch: java.lang.Throwable -> L2d
        L8e:
            throw r10     // Catch: java.lang.Throwable -> L2d
        L8f:
            if (r3 == 0) goto L45
            r3.close()     // Catch: java.lang.Throwable -> L2d
            goto L45
        L95:
            r1.close()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Finished regenerating DSO store "
            r9.append(r10)
            java.lang.Class r10 = r8.getClass()
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            return
        Lae:
            throw r9     // Catch: java.lang.Throwable -> Laf
        Laf:
            r10 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lb4
            goto Lb8
        Lb4:
            r11 = move-exception
            r9.addSuppressed(r11)
        Lb8:
            goto Lba
        Lb9:
            throw r10
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.v.r(byte, com.facebook.soloader.v$c, com.facebook.soloader.v$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(File file, byte b5) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b5);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // com.facebook.soloader.t
    public String[] b() {
        String[] strArr = this.f12814p;
        return strArr == null ? super.b() : strArr;
    }

    @Override // com.facebook.soloader.c, com.facebook.soloader.t
    public int c(String str, int i4, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int h4;
        synchronized (m(str)) {
            h4 = h(str, i4, this.f12703j, threadPolicy);
        }
        return h4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.t
    public void d(int i4) throws IOException {
        SysUtil.j(this.f12703j);
        n a5 = n.a(new File(this.f12703j, f12806t));
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("locked dso store ");
            sb.append(this.f12703j);
            if (q(a5, i4, l())) {
                a5 = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dso store is up-to-date: ");
                sb2.append(this.f12703j);
            }
        } finally {
            if (a5 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("releasing dso store lock for ");
                sb3.append(this.f12703j);
                a5.close();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("not releasing dso store lock for ");
                sb4.append(this.f12703j);
                sb4.append(" (syncer thread started)");
            }
        }
    }

    protected byte[] l() throws IOException {
        Parcel obtain = Parcel.obtain();
        f o4 = o();
        try {
            b[] bVarArr = o4.a().f12824a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(bVarArr.length);
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                obtain.writeString(bVarArr[i4].f12822b);
                obtain.writeString(bVarArr[i4].f12823c);
            }
            o4.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (o4 != null) {
                    try {
                        o4.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    protected abstract f o() throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void p(String str) throws IOException {
        synchronized (m(str)) {
            this.f12813o = str;
            d(2);
        }
    }

    public void s(String[] strArr) {
        this.f12814p = strArr;
    }

    protected v(Context context, File file) {
        super(file, 1);
        this.f12815q = new HashMap();
        this.f12812n = context;
    }
}
