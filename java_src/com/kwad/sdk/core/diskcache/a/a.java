package com.kwad.sdk.core.diskcache.a;

import com.kwad.sdk.utils.q;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public final class a implements Closeable {
    static final Pattern auP = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream ave = new OutputStream() { // from class: com.kwad.sdk.core.diskcache.a.a.3
        @Override // java.io.OutputStream
        public final void write(int i4) {
        }
    };
    private final File auQ;
    private final File auR;
    private final File auS;
    private final File auT;
    private final int auU;
    private int auV;
    private final int auW;
    private Writer auY;
    private int ava;
    private long maxSize;
    private long size = 0;
    private int auX = 0;
    private final LinkedHashMap<String, b> auZ = new LinkedHashMap<>(0, 0.75f, true);
    private long avb = 0;
    final ThreadPoolExecutor avc = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.kwad.sdk.core.diskcache.a.a.1
        private final AtomicInteger poolNumber = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ksad-DiskLruCache-" + this.poolNumber.getAndIncrement());
        }
    });
    private final Callable<Void> avd = new Callable<Void>() { // from class: com.kwad.sdk.core.diskcache.a.a.2
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: DC */
        public Void call() {
            synchronized (a.this) {
                if (a.this.auY == null) {
                    return null;
                }
                a.this.trimToSize();
                a.this.DI();
                if (a.this.DH()) {
                    a.this.DF();
                    a.a(a.this, 0);
                }
                return null;
            }
        }
    };

    /* renamed from: com.kwad.sdk.core.diskcache.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C0517a {
        private final b avg;
        private final boolean[] avh;
        private boolean avi;
        private boolean avj;

        /* renamed from: com.kwad.sdk.core.diskcache.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0518a extends FilterOutputStream {
            /* synthetic */ C0518a(C0517a c0517a, OutputStream outputStream, byte b5) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0517a.b(C0517a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0517a.b(C0517a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i4) {
                try {
                    ((FilterOutputStream) this).out.write(i4);
                } catch (IOException unused) {
                    C0517a.b(C0517a.this, true);
                }
            }

            private C0518a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i4, int i5) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i4, i5);
                } catch (IOException unused) {
                    C0517a.b(C0517a.this, true);
                }
            }
        }

        /* synthetic */ C0517a(a aVar, b bVar, byte b5) {
            this(bVar);
        }

        static /* synthetic */ boolean b(C0517a c0517a, boolean z4) {
            c0517a.avi = true;
            return true;
        }

        public final void abort() {
            a.this.a(this, false);
        }

        public final OutputStream cZ(int i4) {
            FileOutputStream fileOutputStream;
            C0518a c0518a;
            synchronized (a.this) {
                if (this.avg.avn == this) {
                    if (!this.avg.avm) {
                        this.avh[0] = true;
                    }
                    File db = this.avg.db(0);
                    try {
                        fileOutputStream = new FileOutputStream(db);
                    } catch (FileNotFoundException unused) {
                        a.this.auQ.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(db);
                        } catch (FileNotFoundException unused2) {
                            return a.ave;
                        }
                    }
                    c0518a = new C0518a(this, fileOutputStream, (byte) 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c0518a;
        }

        public final void commit() {
            if (this.avi) {
                a.this.a(this, false);
                a.this.remove(this.avg.key);
            } else {
                a.this.a(this, true);
            }
            this.avj = true;
        }

        private C0517a(b bVar) {
            this.avg = bVar;
            this.avh = bVar.avm ? null : new boolean[a.this.auW];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class b {
        private final long[] avl;
        private boolean avm;
        private C0517a avn;
        private long avo;
        private final String key;

        /* synthetic */ b(a aVar, String str, byte b5) {
            this(str);
        }

        public final String DK() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j4 : this.avl) {
                sb.append(' ');
                sb.append(j4);
            }
            return sb.toString();
        }

        public final File da(int i4) {
            File file = a.this.auQ;
            return new File(file, this.key + i4);
        }

        public final File db(int i4) {
            File file = a.this.auQ;
            return new File(file, this.key + i4 + ".tmp");
        }

        private b(String str) {
            this.key = str;
            this.avl = new long[a.this.auW];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String[] strArr) {
            if (strArr.length == a.this.auW) {
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    try {
                        this.avl[i4] = Long.parseLong(strArr[i4]);
                    } catch (NumberFormatException unused) {
                        throw c(strArr);
                    }
                }
                return;
            }
            throw c(strArr);
        }

        private static IOException c(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        static /* synthetic */ boolean a(b bVar, boolean z4) {
            bVar.avm = true;
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Closeable {
        private final long[] avl;
        private final long avo;
        private File[] avp;
        private final InputStream[] avq;
        private final String key;

        /* synthetic */ c(a aVar, String str, long j4, File[] fileArr, InputStream[] inputStreamArr, long[] jArr, byte b5) {
            this(str, j4, fileArr, inputStreamArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.avq) {
                com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
            }
        }

        public final File dc(int i4) {
            return this.avp[0];
        }

        private c(String str, long j4, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.avo = j4;
            this.avp = fileArr;
            this.avq = inputStreamArr;
            this.avl = jArr;
        }
    }

    private a(File file, int i4, int i5, long j4, int i6) {
        this.auQ = file;
        this.auU = i4;
        this.auR = new File(file, "journal");
        this.auS = new File(file, "journal.tmp");
        this.auT = new File(file, "journal.bkp");
        this.auW = i5;
        this.maxSize = j4;
        this.auV = i6;
    }

    private void DD() {
        com.kwad.sdk.core.diskcache.a.b bVar = new com.kwad.sdk.core.diskcache.a.b(new FileInputStream(this.auR), com.kwad.sdk.crash.utils.a.US_ASCII);
        try {
            String readLine = bVar.readLine();
            String readLine2 = bVar.readLine();
            String readLine3 = bVar.readLine();
            String readLine4 = bVar.readLine();
            String readLine5 = bVar.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.auU).equals(readLine3) || !Integer.toString(this.auW).equals(readLine4) || !"".equals(readLine5)) {
                throw new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
            }
            int i4 = 0;
            while (true) {
                try {
                    dx(bVar.readLine());
                    i4++;
                } catch (EOFException unused) {
                    this.ava = i4 - this.auZ.size();
                    com.kwad.sdk.crash.utils.b.closeQuietly(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.kwad.sdk.crash.utils.b.closeQuietly(bVar);
            throw th;
        }
    }

    private void DE() {
        p(this.auS);
        Iterator<b> it2 = this.auZ.values().iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            int i4 = 0;
            if (next.avn != null) {
                next.avn = null;
                while (i4 < this.auW) {
                    p(next.da(i4));
                    p(next.db(i4));
                    i4++;
                }
                it2.remove();
            } else {
                while (i4 < this.auW) {
                    this.size += next.avl[i4];
                    this.auX++;
                    i4++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void DF() {
        Writer writer = this.auY;
        if (writer != null) {
            com.kwad.sdk.crash.utils.b.closeQuietly(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.auS), com.kwad.sdk.crash.utils.a.US_ASCII));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.auU));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.auW));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.auZ.values()) {
            if (bVar.avn != null) {
                bufferedWriter.write("DIRTY " + bVar.key + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.key + bVar.DK() + '\n');
            }
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedWriter);
        if (this.auR.exists()) {
            a(this.auR, this.auT, true);
        }
        a(this.auS, this.auR, false);
        this.auT.delete();
        this.auY = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.auR, true), com.kwad.sdk.crash.utils.a.US_ASCII));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean DH() {
        int i4 = this.ava;
        return i4 >= 2000 && i4 >= this.auZ.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DI() {
        while (this.auX > this.auV) {
            remove(this.auZ.entrySet().iterator().next().getKey());
        }
    }

    static /* synthetic */ int a(a aVar, int i4) {
        aVar.ava = 0;
        return 0;
    }

    private void checkNotClosed() {
        if (this.auY == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void dA(String str) {
        if (auP.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + m.a.f71493g);
    }

    private void dx(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i4 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i4);
            if (indexOf2 == -1) {
                substring = str.substring(i4);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.auZ.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i4, indexOf2);
            }
            b bVar = this.auZ.get(substring);
            if (bVar == null) {
                bVar = new b(this, substring, (byte) 0);
                this.auZ.put(substring, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                b.a(bVar, true);
                bVar.avn = null;
                bVar.b(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.avn = new C0517a(this, bVar, (byte) 0);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private static void p(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() {
        while (this.size > this.maxSize) {
            remove(this.auZ.entrySet().iterator().next().getKey());
        }
    }

    public final synchronized int DG() {
        return this.auV;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.auY == null) {
            return;
        }
        Iterator it2 = new ArrayList(this.auZ.values()).iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (bVar.avn != null) {
                bVar.avn.abort();
            }
        }
        trimToSize();
        DI();
        com.kwad.sdk.crash.utils.b.closeQuietly(this.auY);
        this.auY = null;
    }

    public final void delete() {
        close();
        q.deleteContents(this.auQ);
    }

    public final synchronized c dy(String str) {
        if (this.auY == null) {
            return null;
        }
        dA(str);
        b bVar = this.auZ.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar.avm) {
            int i4 = this.auW;
            File[] fileArr = new File[i4];
            InputStream[] inputStreamArr = new InputStream[i4];
            for (int i5 = 0; i5 < this.auW; i5++) {
                try {
                    File da = bVar.da(i5);
                    fileArr[i5] = da;
                    inputStreamArr[i5] = new FileInputStream(da);
                } catch (FileNotFoundException unused) {
                    for (int i6 = 0; i6 < this.auW && inputStreamArr[i6] != null; i6++) {
                        com.kwad.sdk.crash.utils.b.closeQuietly(inputStreamArr[i6]);
                    }
                    return null;
                }
            }
            this.ava++;
            this.auY.append((CharSequence) ("READ " + str + '\n'));
            if (DH()) {
                this.avc.submit(this.avd);
            }
            return new c(this, str, bVar.avo, fileArr, inputStreamArr, bVar.avl, (byte) 0);
        }
        return null;
    }

    public final C0517a dz(String str) {
        return e(str, -1L);
    }

    public final synchronized void flush() {
        checkNotClosed();
        trimToSize();
        DI();
        this.auY.flush();
    }

    public final File getDirectory() {
        return this.auQ;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized boolean remove(String str) {
        checkNotClosed();
        dA(str);
        b bVar = this.auZ.get(str);
        if (bVar != null && bVar.avn == null) {
            for (int i4 = 0; i4 < this.auW; i4++) {
                File da = bVar.da(i4);
                if (da.exists() && !da.delete()) {
                    throw new IOException("failed to delete " + da);
                }
                this.size -= bVar.avl[i4];
                this.auX--;
                bVar.avl[i4] = 0;
            }
            this.ava++;
            this.auY.append((CharSequence) ("REMOVE " + str + '\n'));
            this.auZ.remove(str);
            if (DH()) {
                this.avc.submit(this.avd);
            }
            return true;
        }
        return false;
    }

    private synchronized C0517a e(String str, long j4) {
        checkNotClosed();
        dA(str);
        b bVar = this.auZ.get(str);
        if (bVar != null) {
            if (bVar.avn != null) {
                return null;
            }
        } else {
            bVar = new b(this, str, (byte) 0);
            this.auZ.put(str, bVar);
        }
        C0517a c0517a = new C0517a(this, bVar, (byte) 0);
        bVar.avn = c0517a;
        Writer writer = this.auY;
        writer.write("DIRTY " + str + '\n');
        this.auY.flush();
        return c0517a;
    }

    public static a a(File file, int i4, int i5, long j4) {
        return a(file, 1, 1, 209715200L, Integer.MAX_VALUE);
    }

    public static a a(File file, int i4, int i5, long j4, int i6) {
        if (j4 > 0) {
            if (i6 > 0) {
                if (i5 > 0) {
                    File file2 = new File(file, "journal.bkp");
                    if (file2.exists()) {
                        File file3 = new File(file, "journal");
                        if (file3.exists()) {
                            file2.delete();
                        } else {
                            a(file2, file3, false);
                        }
                    }
                    a aVar = new a(file, i4, i5, j4, i6);
                    if (aVar.auR.exists()) {
                        try {
                            aVar.DD();
                            aVar.DE();
                            aVar.auY = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.auR, true), com.kwad.sdk.crash.utils.a.US_ASCII));
                            return aVar;
                        } catch (IOException e5) {
                            PrintStream printStream = System.out;
                            printStream.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                            aVar.delete();
                        }
                    }
                    file.mkdirs();
                    a aVar2 = new a(file, i4, i5, j4, i6);
                    aVar2.DF();
                    return aVar2;
                }
                throw new IllegalArgumentException("valueCount <= 0");
            }
            throw new IllegalArgumentException("maxFileCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static void a(File file, File file2, boolean z4) {
        if (z4) {
            p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0517a c0517a, boolean z4) {
        b bVar = c0517a.avg;
        if (bVar.avn == c0517a) {
            if (z4 && !bVar.avm) {
                for (int i4 = 0; i4 < this.auW; i4++) {
                    if (c0517a.avh[i4]) {
                        if (!bVar.db(i4).exists()) {
                            c0517a.abort();
                            return;
                        }
                    } else {
                        c0517a.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i4);
                    }
                }
            }
            for (int i5 = 0; i5 < this.auW; i5++) {
                File db = bVar.db(i5);
                if (z4) {
                    if (db.exists()) {
                        File da = bVar.da(i5);
                        db.renameTo(da);
                        long j4 = bVar.avl[i5];
                        long length = da.length();
                        bVar.avl[i5] = length;
                        this.size = (this.size - j4) + length;
                        this.auX++;
                    }
                } else {
                    p(db);
                }
            }
            this.ava++;
            bVar.avn = null;
            if (!(bVar.avm | z4)) {
                this.auZ.remove(bVar.key);
                this.auY.write("REMOVE " + bVar.key + '\n');
            } else {
                b.a(bVar, true);
                this.auY.write("CLEAN " + bVar.key + bVar.DK() + '\n');
                if (z4) {
                    long j5 = this.avb;
                    this.avb = 1 + j5;
                    bVar.avo = j5;
                }
            }
            this.auY.flush();
            if (this.size > this.maxSize || this.auX > this.auV || DH()) {
                this.avc.submit(this.avd);
            }
            return;
        }
        throw new IllegalStateException();
    }
}
