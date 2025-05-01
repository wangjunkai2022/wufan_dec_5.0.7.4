package com.facebook.cache.disk;

import android.os.Environment;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.disk.c;
import com.facebook.common.file.FileUtils;
import com.facebook.common.internal.VisibleForTesting;
import com.join.mgps.Util.h0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class DefaultDiskStorage implements com.facebook.cache.disk.c {

    /* renamed from: g  reason: collision with root package name */
    private static final String f10711g = ".cnt";

    /* renamed from: h  reason: collision with root package name */
    private static final String f10712h = ".tmp";

    /* renamed from: i  reason: collision with root package name */
    private static final String f10713i = "v2";

    /* renamed from: j  reason: collision with root package name */
    private static final int f10714j = 100;

    /* renamed from: a  reason: collision with root package name */
    private final File f10716a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10717b;

    /* renamed from: c  reason: collision with root package name */
    private final File f10718c;

    /* renamed from: d  reason: collision with root package name */
    private final CacheErrorLogger f10719d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.common.time.a f10720e;

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f10710f = DefaultDiskStorage.class;

    /* renamed from: k  reason: collision with root package name */
    static final long f10715k = TimeUnit.MINUTES.toMillis(30);

    /* loaded from: classes2.dex */
    public @interface FileType {
        public static final String CONTENT = ".cnt";
        public static final String TEMP = ".tmp";
    }

    /* loaded from: classes2.dex */
    private static class IncompleteFileException extends IOException {

        /* renamed from: b  reason: collision with root package name */
        public final long f10721b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10722c;

        public IncompleteFileException(long j4, long j5) {
            super("File was not written completely. Expected: " + j4 + ", found: " + j5);
            this.f10721b = j4;
            this.f10722c = j5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements f0.b {

        /* renamed from: a  reason: collision with root package name */
        private final List<c.InterfaceC0251c> f10723a;

        private b() {
            this.f10723a = new ArrayList();
        }

        @Override // f0.b
        public void a(File file) {
        }

        @Override // f0.b
        public void b(File file) {
            d u4 = DefaultDiskStorage.this.u(file);
            if (u4 == null || u4.f10729a != ".cnt") {
                return;
            }
            this.f10723a.add(new c(u4.f10730b, file));
        }

        @Override // f0.b
        public void c(File file) {
        }

        public List<c.InterfaceC0251c> d() {
            return Collections.unmodifiableList(this.f10723a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class c implements c.InterfaceC0251c {

        /* renamed from: a  reason: collision with root package name */
        private final String f10725a;

        /* renamed from: b  reason: collision with root package name */
        private final e0.c f10726b;

        /* renamed from: c  reason: collision with root package name */
        private long f10727c;

        /* renamed from: d  reason: collision with root package name */
        private long f10728d;

        @Override // com.facebook.cache.disk.c.InterfaceC0251c
        /* renamed from: b */
        public e0.c a() {
            return this.f10726b;
        }

        @Override // com.facebook.cache.disk.c.InterfaceC0251c
        public String getId() {
            return this.f10725a;
        }

        @Override // com.facebook.cache.disk.c.InterfaceC0251c
        public long getSize() {
            if (this.f10727c < 0) {
                this.f10727c = this.f10726b.size();
            }
            return this.f10727c;
        }

        @Override // com.facebook.cache.disk.c.InterfaceC0251c
        public long getTimestamp() {
            if (this.f10728d < 0) {
                this.f10728d = this.f10726b.c().lastModified();
            }
            return this.f10728d;
        }

        private c(String str, File file) {
            com.facebook.common.internal.h.i(file);
            this.f10725a = (String) com.facebook.common.internal.h.i(str);
            this.f10726b = e0.c.b(file);
            this.f10727c = -1L;
            this.f10728d = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        @FileType

        /* renamed from: a  reason: collision with root package name */
        public final String f10729a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10730b;

        @Nullable
        public static d b(File file) {
            String s4;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0 && (s4 = DefaultDiskStorage.s(name.substring(lastIndexOf))) != null) {
                String substring = name.substring(0, lastIndexOf);
                if (s4.equals(".tmp")) {
                    int lastIndexOf2 = substring.lastIndexOf(46);
                    if (lastIndexOf2 <= 0) {
                        return null;
                    }
                    substring = substring.substring(0, lastIndexOf2);
                }
                return new d(s4, substring);
            }
            return null;
        }

        public File a(File file) throws IOException {
            return File.createTempFile(this.f10730b + h0.f27805a, ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f10730b + this.f10729a;
        }

        public String toString() {
            return this.f10729a + "(" + this.f10730b + ")";
        }

        private d(@FileType String str, String str2) {
            this.f10729a = str;
            this.f10730b = str2;
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    class e implements c.d {

        /* renamed from: a  reason: collision with root package name */
        private final String f10731a;
        @VisibleForTesting

        /* renamed from: b  reason: collision with root package name */
        final File f10732b;

        public e(String str, File file) {
            this.f10731a = str;
            this.f10732b = file;
        }

        @Override // com.facebook.cache.disk.c.d
        public boolean a() {
            return !this.f10732b.exists() || this.f10732b.delete();
        }

        @Override // com.facebook.cache.disk.c.d
        public void b(com.facebook.cache.common.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f10732b);
                try {
                    com.facebook.common.internal.d dVar = new com.facebook.common.internal.d(fileOutputStream);
                    jVar.a(dVar);
                    dVar.flush();
                    long a5 = dVar.a();
                    fileOutputStream.close();
                    if (this.f10732b.length() != a5) {
                        throw new IncompleteFileException(a5, this.f10732b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                DefaultDiskStorage.this.f10719d.a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, DefaultDiskStorage.f10710f, "updateResource", e5);
                throw e5;
            }
        }

        @Override // com.facebook.cache.disk.c.d
        public e0.a c(Object obj) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            File q4 = DefaultDiskStorage.this.q(this.f10731a);
            try {
                FileUtils.b(this.f10732b, q4);
                if (q4.exists()) {
                    q4.setLastModified(DefaultDiskStorage.this.f10720e.now());
                }
                return e0.c.b(q4);
            } catch (FileUtils.RenameException e5) {
                Throwable cause = e5.getCause();
                if (cause != null) {
                    if (!(cause instanceof FileUtils.ParentDirNotFoundException)) {
                        if (cause instanceof FileNotFoundException) {
                            cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                        } else {
                            cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                        }
                    } else {
                        cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    }
                } else {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.this.f10719d.a(cacheErrorCategory, DefaultDiskStorage.f10710f, "commit", e5);
                throw e5;
            }
        }
    }

    /* loaded from: classes2.dex */
    private class f implements f0.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10734a;

        private f() {
        }

        private boolean d(File file) {
            d u4 = DefaultDiskStorage.this.u(file);
            if (u4 == null) {
                return false;
            }
            String str = u4.f10729a;
            if (str == ".tmp") {
                return e(file);
            }
            com.facebook.common.internal.h.o(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > DefaultDiskStorage.this.f10720e.now() - DefaultDiskStorage.f10715k;
        }

        @Override // f0.b
        public void a(File file) {
            if (!DefaultDiskStorage.this.f10716a.equals(file) && !this.f10734a) {
                file.delete();
            }
            if (this.f10734a && file.equals(DefaultDiskStorage.this.f10718c)) {
                this.f10734a = false;
            }
        }

        @Override // f0.b
        public void b(File file) {
            if (this.f10734a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // f0.b
        public void c(File file) {
            if (this.f10734a || !file.equals(DefaultDiskStorage.this.f10718c)) {
                return;
            }
            this.f10734a = true;
        }
    }

    public DefaultDiskStorage(File file, int i4, CacheErrorLogger cacheErrorLogger) {
        com.facebook.common.internal.h.i(file);
        this.f10716a = file;
        this.f10717b = y(file, cacheErrorLogger);
        this.f10718c = new File(file, x(i4));
        this.f10719d = cacheErrorLogger;
        A();
        this.f10720e = com.facebook.common.time.d.a();
    }

    private void A() {
        boolean z4 = true;
        if (this.f10716a.exists()) {
            if (this.f10718c.exists()) {
                z4 = false;
            } else {
                f0.a.b(this.f10716a);
            }
        }
        if (z4) {
            try {
                FileUtils.a(this.f10718c);
            } catch (FileUtils.CreateDirectoryException unused) {
                CacheErrorLogger cacheErrorLogger = this.f10719d;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
                Class<?> cls = f10710f;
                cacheErrorLogger.a(cacheErrorCategory, cls, "version directory could not be created: " + this.f10718c, null);
            }
        }
    }

    private String B(byte[] bArr) {
        return bArr.length >= 2 ? (bArr[0] == -1 && bArr[1] == -40) ? "jpg" : (bArr[0] == -119 && bArr[1] == 80) ? "png" : (bArr[0] == 82 && bArr[1] == 73) ? "webp" : (bArr[0] == 71 && bArr[1] == 73) ? "gif" : "undefined" : "undefined";
    }

    private long o(File file) {
        if (file.exists()) {
            long length = file.length();
            if (file.delete()) {
                return length;
            }
            return -1L;
        }
        return 0L;
    }

    private c.b p(c.InterfaceC0251c interfaceC0251c) throws IOException {
        c cVar = (c) interfaceC0251c;
        byte[] read = cVar.a().read();
        String B = B(read);
        return new c.b(cVar.a().c().getPath(), B, (float) cVar.getSize(), (!B.equals("undefined") || read.length < 4) ? "" : String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", Byte.valueOf(read[0]), Byte.valueOf(read[1]), Byte.valueOf(read[2]), Byte.valueOf(read[3])));
    }

    private boolean query(String str, boolean z4) {
        File q4 = q(str);
        boolean exists = q4.exists();
        if (z4 && exists) {
            q4.setLastModified(this.f10720e.now());
        }
        return exists;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FileType
    @Nullable
    public static String s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String t(String str) {
        d dVar = new d(".cnt", str);
        return dVar.c(w(dVar.f10730b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public d u(File file) {
        d b5 = d.b(file);
        if (b5 != null && v(b5.f10730b).equals(file.getParentFile())) {
            return b5;
        }
        return null;
    }

    private File v(String str) {
        return new File(w(str));
    }

    private String w(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f10718c + File.separator + valueOf;
    }

    @VisibleForTesting
    static String x(int i4) {
        return String.format(null, "%s.ols%d.%d", f10713i, 100, Integer.valueOf(i4));
    }

    private static boolean y(File file, CacheErrorLogger cacheErrorLogger) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                } catch (IOException e5) {
                    e = e5;
                }
                try {
                    return file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException e6) {
                    e = e6;
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.OTHER;
                    Class<?> cls = f10710f;
                    cacheErrorLogger.a(cacheErrorCategory, cls, "failed to read folder to check if external: " + ((String) null), e);
                    return false;
                }
            }
            return false;
        } catch (Exception e7) {
            cacheErrorLogger.a(CacheErrorLogger.CacheErrorCategory.OTHER, f10710f, "failed to get the external storage directory!", e7);
            return false;
        }
    }

    private void z(File file, String str) throws IOException {
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e5) {
            this.f10719d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f10710f, str, e5);
            throw e5;
        }
    }

    @Override // com.facebook.cache.disk.c
    public c.a a() throws IOException {
        List<c.InterfaceC0251c> entries = getEntries();
        c.a aVar = new c.a();
        for (c.InterfaceC0251c interfaceC0251c : entries) {
            c.b p4 = p(interfaceC0251c);
            String str = p4.f10765b;
            if (!aVar.f10763b.containsKey(str)) {
                aVar.f10763b.put(str, 0);
            }
            Map<String, Integer> map = aVar.f10763b;
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            aVar.f10762a.add(p4);
        }
        return aVar;
    }

    @Override // com.facebook.cache.disk.c
    public void b() {
        f0.a.c(this.f10716a, new f());
    }

    @Override // com.facebook.cache.disk.c
    public boolean c(String str, Object obj) {
        return query(str, true);
    }

    @Override // com.facebook.cache.disk.c
    public void clearAll() {
        f0.a.a(this.f10716a);
    }

    @Override // com.facebook.cache.disk.c
    public long d(c.InterfaceC0251c interfaceC0251c) {
        return o(((c) interfaceC0251c).a().c());
    }

    @Override // com.facebook.cache.disk.c
    public boolean e(String str, Object obj) {
        return query(str, false);
    }

    @Override // com.facebook.cache.disk.c
    @Nullable
    public e0.a f(String str, Object obj) {
        File q4 = q(str);
        if (q4.exists()) {
            q4.setLastModified(this.f10720e.now());
            return e0.c.b(q4);
        }
        return null;
    }

    @Override // com.facebook.cache.disk.c
    public String g() {
        String absolutePath = this.f10716a.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }

    @Override // com.facebook.cache.disk.c
    public c.d insert(String str, Object obj) throws IOException {
        d dVar = new d(".tmp", str);
        File v2 = v(dVar.f10730b);
        if (!v2.exists()) {
            z(v2, "insert");
        }
        try {
            return new e(str, dVar.a(v2));
        } catch (IOException e5) {
            this.f10719d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, f10710f, "insert", e5);
            throw e5;
        }
    }

    @Override // com.facebook.cache.disk.c
    public boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.cache.disk.c
    public boolean isExternal() {
        return this.f10717b;
    }

    @VisibleForTesting
    File q(String str) {
        return new File(t(str));
    }

    @Override // com.facebook.cache.disk.c
    /* renamed from: r */
    public List<c.InterfaceC0251c> getEntries() throws IOException {
        b bVar = new b();
        f0.a.c(this.f10718c, bVar);
        return bVar.d();
    }

    @Override // com.facebook.cache.disk.c
    public long remove(String str) {
        return o(q(str));
    }
}
