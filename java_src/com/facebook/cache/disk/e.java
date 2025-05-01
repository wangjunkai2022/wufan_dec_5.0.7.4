package com.facebook.cache.disk;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.disk.c;
import com.facebook.common.file.FileUtils;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.k;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;
/* compiled from: DynamicDefaultDiskStorage.java */
/* loaded from: classes2.dex */
public class e implements c {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f10799f = e.class;

    /* renamed from: a  reason: collision with root package name */
    private final int f10800a;

    /* renamed from: b  reason: collision with root package name */
    private final k<File> f10801b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10802c;

    /* renamed from: d  reason: collision with root package name */
    private final CacheErrorLogger f10803d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    volatile a f10804e = new a(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicDefaultDiskStorage.java */
    @VisibleForTesting
    /* loaded from: classes.dex */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final c f10805a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final File f10806b;

        @VisibleForTesting
        a(@Nullable File file, @Nullable c cVar) {
            this.f10805a = cVar;
            this.f10806b = file;
        }
    }

    public e(int i4, k<File> kVar, String str, CacheErrorLogger cacheErrorLogger) {
        this.f10800a = i4;
        this.f10803d = cacheErrorLogger;
        this.f10801b = kVar;
        this.f10802c = str;
    }

    private void i() throws IOException {
        File file = new File(this.f10801b.get(), this.f10802c);
        h(file);
        this.f10804e = new a(file, new DefaultDiskStorage(file, this.f10800a, this.f10803d));
    }

    private boolean l() {
        File file;
        a aVar = this.f10804e;
        return aVar.f10805a == null || (file = aVar.f10806b) == null || !file.exists();
    }

    @Override // com.facebook.cache.disk.c
    public c.a a() throws IOException {
        return k().a();
    }

    @Override // com.facebook.cache.disk.c
    public void b() {
        try {
            k().b();
        } catch (IOException e5) {
            com.facebook.common.logging.a.r(f10799f, "purgeUnexpectedResources", e5);
        }
    }

    @Override // com.facebook.cache.disk.c
    public boolean c(String str, Object obj) throws IOException {
        return k().c(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public void clearAll() throws IOException {
        k().clearAll();
    }

    @Override // com.facebook.cache.disk.c
    public long d(c.InterfaceC0251c interfaceC0251c) throws IOException {
        return k().d(interfaceC0251c);
    }

    @Override // com.facebook.cache.disk.c
    public boolean e(String str, Object obj) throws IOException {
        return k().e(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public e0.a f(String str, Object obj) throws IOException {
        return k().f(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public String g() {
        try {
            return k().g();
        } catch (IOException unused) {
            return "";
        }
    }

    @Override // com.facebook.cache.disk.c
    public Collection<c.InterfaceC0251c> getEntries() throws IOException {
        return k().getEntries();
    }

    @VisibleForTesting
    void h(File file) throws IOException {
        try {
            FileUtils.a(file);
            com.facebook.common.logging.a.b(f10799f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e5) {
            this.f10803d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f10799f, "createRootDirectoryIfNecessary", e5);
            throw e5;
        }
    }

    @Override // com.facebook.cache.disk.c
    public c.d insert(String str, Object obj) throws IOException {
        return k().insert(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public boolean isEnabled() {
        try {
            return k().isEnabled();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.cache.disk.c
    public boolean isExternal() {
        try {
            return k().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @VisibleForTesting
    void j() {
        if (this.f10804e.f10805a == null || this.f10804e.f10806b == null) {
            return;
        }
        f0.a.b(this.f10804e.f10806b);
    }

    @VisibleForTesting
    synchronized c k() throws IOException {
        if (l()) {
            j();
            i();
        }
        return (c) com.facebook.common.internal.h.i(this.f10804e.f10805a);
    }

    @Override // com.facebook.cache.disk.c
    public long remove(String str) throws IOException {
        return k().remove(str);
    }
}
