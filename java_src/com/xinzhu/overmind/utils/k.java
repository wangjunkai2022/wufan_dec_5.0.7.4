package com.xinzhu.overmind.utils;

import android.os.Parcel;
import android.system.ErrnoException;
import android.system.Os;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
/* compiled from: FileUtils.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68366a = "k";

    /* renamed from: b  reason: collision with root package name */
    public static final int f68367b = 448;

    /* renamed from: c  reason: collision with root package name */
    public static final int f68368c = 256;

    /* renamed from: d  reason: collision with root package name */
    public static final int f68369d = 128;

    /* renamed from: e  reason: collision with root package name */
    public static final int f68370e = 64;

    /* renamed from: f  reason: collision with root package name */
    public static final int f68371f = 56;

    /* renamed from: g  reason: collision with root package name */
    public static final int f68372g = 32;

    /* renamed from: h  reason: collision with root package name */
    public static final int f68373h = 16;

    /* renamed from: i  reason: collision with root package name */
    public static final int f68374i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f68375j = 7;

    /* renamed from: k  reason: collision with root package name */
    public static final int f68376k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f68377l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f68378m = 1;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f68379n = true;

    /* renamed from: o  reason: collision with root package name */
    private static final long f68380o = 524288;

    public static void a(String str, int i4) {
        try {
            Os.chmod(str, i4);
        } catch (ErrnoException e5) {
            e5.printStackTrace();
        }
    }

    public static long b(@NonNull File file, @NonNull File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            long f5 = f(fileInputStream, fileOutputStream);
            fileOutputStream.close();
            fileInputStream.close();
            return f5;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long c(@NonNull FileDescriptor fileDescriptor, @NonNull FileDescriptor fileDescriptor2) throws IOException {
        return d(fileDescriptor, fileDescriptor2, Long.MAX_VALUE);
    }

    public static long d(@NonNull FileDescriptor fileDescriptor, @NonNull FileDescriptor fileDescriptor2, long j4) throws IOException {
        return h(fileDescriptor, fileDescriptor2, j4);
    }

    public static long e(InputStream inputStream, File file) throws IOException {
        return f(inputStream, new FileOutputStream(file));
    }

    public static long f(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        if (f68379n && (inputStream instanceof FileInputStream) && (outputStream instanceof FileOutputStream)) {
            return c(((FileInputStream) inputStream).getFD(), ((FileOutputStream) outputStream).getFD());
        }
        return i(inputStream, outputStream);
    }

    public static void g(File file, File file2) throws IOException {
        if (file.equals(file2)) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            com.xinzhu.overmind.b.c(f68366a, "copyDirectory failed, source not exist");
            return;
        }
        p(file2);
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (file3.isDirectory()) {
                g(file3, file4);
            } else {
                b(file3, file4);
            }
        }
    }

    private static long h(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, long j4) throws IOException {
        return i(new FileInputStream(fileDescriptor), new FileOutputStream(fileDescriptor2));
    }

    private static long i(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j4;
            }
            outputStream.write(bArr, 0, read);
            long j6 = read;
            j4 += j6;
            j5 += j6;
            if (j5 >= 524288) {
                j5 = 0;
            }
        }
    }

    public static void j(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        l(file);
    }

    public static void k(String str) {
        j(new File(str));
    }

    static void l(File file) {
        try {
            if (file.isDirectory() && !o(file) && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    l(file2);
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        file.delete();
    }

    public static boolean m(String str) {
        return new File(str).exists();
    }

    public static String n(String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) <= -1 || lastIndexOf >= str.length()) ? str : str.substring(0, lastIndexOf);
    }

    public static boolean o(File file) throws IOException {
        Objects.requireNonNull(file, "File must not be null");
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static boolean p(File file) {
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static Parcel q(File file) throws IOException {
        Parcel obtain = Parcel.obtain();
        byte[] v2 = v(file);
        obtain.unmarshall(v2, 0, v2.length);
        obtain.setDataPosition(0);
        return obtain;
    }

    public static boolean r(File file, File file2) {
        return file.renameTo(file2);
    }

    public static int s(File file, int i4, int i5, int i6) {
        return u(file.getAbsolutePath(), i4, i5, i6);
    }

    public static int t(FileDescriptor fileDescriptor, int i4, int i5, int i6) {
        try {
            Os.fchmod(fileDescriptor, i4);
            if (i5 >= 0 || i6 >= 0) {
                try {
                    Os.fchown(fileDescriptor, i5, i6);
                    return 0;
                } catch (ErrnoException e5) {
                    String str = f68366a;
                    com.xinzhu.overmind.b.l(str, "Failed to fchown(): " + e5);
                    return e5.errno;
                }
            }
            return 0;
        } catch (ErrnoException e6) {
            String str2 = f68366a;
            com.xinzhu.overmind.b.l(str2, "Failed to fchmod(): " + e6);
            return e6.errno;
        }
    }

    public static int u(String str, int i4, int i5, int i6) {
        try {
            Os.chmod(str, i4);
            if (i5 >= 0 || i6 >= 0) {
                try {
                    Os.chown(str, i5, i6);
                    return 0;
                } catch (ErrnoException e5) {
                    String str2 = f68366a;
                    com.xinzhu.overmind.b.l(str2, "Failed to chown(" + str + "): " + e5);
                    return e5.errno;
                }
            }
            return 0;
        } catch (ErrnoException e6) {
            String str3 = f68366a;
            com.xinzhu.overmind.b.l(str3, "Failed to chmod(" + str + "): " + e6);
            return e6.errno;
        }
    }

    public static byte[] v(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return w(fileInputStream);
        } finally {
            m.b(fileInputStream);
        }
    }

    public static byte[] w(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        throw new java.io.FileNotFoundException("Failed to ensure directory: " + r3.getAbsolutePath());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void x(java.io.File r5, java.io.File r6) throws java.io.IOException {
        /*
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r5)
            r1.<init>(r2)
            r0.<init>(r1)
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L7b
        L13:
            java.util.zip.ZipEntry r1 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L77
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r1.isDirectory()     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L2a
            r3 = r2
            goto L2e
        L2a:
            java.io.File r3 = r2.getParentFile()     // Catch: java.lang.Throwable -> L7b
        L2e:
            boolean r4 = r3.isDirectory()     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L56
            boolean r4 = r3.mkdirs()     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L3b
            goto L56
        L3b:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r6.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "Failed to ensure directory: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L7b
            r6.append(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L56:
            boolean r1 = r1.isDirectory()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L5d
            goto L13
        L5d:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7b
        L62:
            int r2 = r0.read(r5)     // Catch: java.lang.Throwable -> L72
            r3 = -1
            if (r2 == r3) goto L6e
            r3 = 0
            r1.write(r5, r3, r2)     // Catch: java.lang.Throwable -> L72
            goto L62
        L6e:
            r1.close()     // Catch: java.lang.Throwable -> L7b
            goto L13
        L72:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L77:
            r0.close()
            return
        L7b:
            r5 = move-exception
            r0.close()
            goto L81
        L80:
            throw r5
        L81:
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.utils.k.x(java.io.File, java.io.File):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa A[Catch: Exception -> 0x00fe, TRY_ENTER, TryCatch #1 {Exception -> 0x00fe, blocks: (B:57:0x00fa, B:61:0x0102, B:63:0x0107, B:65:0x010c, B:36:0x00d3, B:38:0x00d8, B:40:0x00dd, B:41:0x00e0), top: B:85:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102 A[Catch: Exception -> 0x00fe, TryCatch #1 {Exception -> 0x00fe, blocks: (B:57:0x00fa, B:61:0x0102, B:63:0x0107, B:65:0x010c, B:36:0x00d3, B:38:0x00d8, B:40:0x00dd, B:41:0x00e0), top: B:85:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107 A[Catch: Exception -> 0x00fe, TryCatch #1 {Exception -> 0x00fe, blocks: (B:57:0x00fa, B:61:0x0102, B:63:0x0107, B:65:0x010c, B:36:0x00d3, B:38:0x00d8, B:40:0x00dd, B:41:0x00e0), top: B:85:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #1 {Exception -> 0x00fe, blocks: (B:57:0x00fa, B:61:0x0102, B:63:0x0107, B:65:0x010c, B:36:0x00d3, B:38:0x00d8, B:40:0x00dd, B:41:0x00e0), top: B:85:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f A[Catch: Exception -> 0x011b, TryCatch #5 {Exception -> 0x011b, blocks: (B:71:0x0117, B:75:0x011f, B:77:0x0124, B:79:0x0129), top: B:87:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124 A[Catch: Exception -> 0x011b, TryCatch #5 {Exception -> 0x011b, blocks: (B:71:0x0117, B:75:0x011f, B:77:0x0124, B:79:0x0129), top: B:87:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129 A[Catch: Exception -> 0x011b, TRY_LEAVE, TryCatch #5 {Exception -> 0x011b, blocks: (B:71:0x0117, B:75:0x011f, B:77:0x0124, B:79:0x0129), top: B:87:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.utils.k.y(java.lang.String, java.lang.String):void");
    }

    public static void z(Parcel parcel, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write(parcel.marshall());
    }
}
