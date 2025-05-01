package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.v;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
/* compiled from: ExtractFromZipSoSource.java */
/* loaded from: classes2.dex */
public class m extends v {
    protected final String A;

    /* renamed from: z  reason: collision with root package name */
    protected final File f12778z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends v.b implements Comparable {

        /* renamed from: d  reason: collision with root package name */
        final ZipEntry f12779d;

        /* renamed from: e  reason: collision with root package name */
        final int f12780e;

        b(String str, ZipEntry zipEntry, int i4) {
            super(str, d(zipEntry));
            this.f12779d = zipEntry;
            this.f12780e = i4;
        }

        private static String d(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f12822b.compareTo(((b) obj).f12822b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes.dex */
    public class c extends v.f {
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private b[] f12781b;

        /* renamed from: c  reason: collision with root package name */
        private final ZipFile f12782c;

        /* renamed from: d  reason: collision with root package name */
        private final v f12783d;

        /* compiled from: ExtractFromZipSoSource.java */
        /* loaded from: classes2.dex */
        private final class a extends v.e {

            /* renamed from: b  reason: collision with root package name */
            private int f12785b;

            private a() {
            }

            @Override // com.facebook.soloader.v.e
            public boolean a() {
                c.this.h();
                return this.f12785b < c.this.f12781b.length;
            }

            @Override // com.facebook.soloader.v.e
            public v.d b() throws IOException {
                c.this.h();
                b[] bVarArr = c.this.f12781b;
                int i4 = this.f12785b;
                this.f12785b = i4 + 1;
                b bVar = bVarArr[i4];
                InputStream inputStream = c.this.f12782c.getInputStream(bVar.f12779d);
                try {
                    return new v.d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(v vVar) throws IOException {
            this.f12782c = new ZipFile(m.this.f12778z);
            this.f12783d = vVar;
        }

        @Override // com.facebook.soloader.v.f
        protected final v.c a() throws IOException {
            return new v.c(h());
        }

        @Override // com.facebook.soloader.v.f
        protected final v.e b() throws IOException {
            return new a();
        }

        @Override // com.facebook.soloader.v.f, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f12782c.close();
        }

        final b[] h() {
            if (this.f12781b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(m.this.A);
                String[] h4 = SysUtil.h();
                Enumeration<? extends ZipEntry> entries = this.f12782c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int e5 = SysUtil.e(h4, group);
                        if (e5 >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || e5 < bVar.f12780e) {
                                hashMap.put(group2, new b(group2, nextElement, e5));
                            }
                        }
                    }
                }
                this.f12783d.s((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i4 = 0;
                for (int i5 = 0; i5 < bVarArr.length; i5++) {
                    b bVar2 = bVarArr[i5];
                    if (j(bVar2.f12779d, bVar2.f12822b)) {
                        i4++;
                    } else {
                        bVarArr[i5] = null;
                    }
                }
                b[] bVarArr2 = new b[i4];
                int i6 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i6] = bVar3;
                        i6++;
                    }
                }
                this.f12781b = bVarArr2;
            }
            return this.f12781b;
        }

        protected boolean j(ZipEntry zipEntry, String str) {
            return true;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f12778z = file;
        this.A = str2;
    }

    @Override // com.facebook.soloader.v
    protected v.f o() throws IOException {
        return new c(this);
    }
}
