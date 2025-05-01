package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;
/* compiled from: DirectorySoSource.java */
/* loaded from: classes.dex */
public class c extends t {

    /* renamed from: l  reason: collision with root package name */
    public static final int f12701l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f12702m = 2;

    /* renamed from: j  reason: collision with root package name */
    protected final File f12703j;

    /* renamed from: k  reason: collision with root package name */
    protected final int f12704k;

    public c(File file, int i4) {
        this.f12703j = file;
        this.f12704k = i4;
    }

    private static String[] f(File file) throws IOException {
        boolean z4 = SoLoader.f12671c;
        if (z4) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[" + file.getName() + "]");
        }
        try {
            String[] a5 = MinElf.a(file);
            if (z4) {
                Api18TraceUtils.b();
            }
            return a5;
        } catch (Throwable th) {
            if (SoLoader.f12671c) {
                Api18TraceUtils.b();
            }
            throw th;
        }
    }

    private void g(File file, int i4, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] f5 = f(file);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading lib dependencies: ");
        sb.append(Arrays.toString(f5));
        for (String str : f5) {
            if (!str.startsWith(net.lingala.zip4j.util.e.F0)) {
                SoLoader.m(str, i4 | 1, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.t
    public void a(Collection<String> collection) {
        collection.add(this.f12703j.getAbsolutePath());
    }

    @Override // com.facebook.soloader.t
    public int c(String str, int i4, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return h(str, i4, this.f12703j, threadPolicy);
    }

    @Override // com.facebook.soloader.t
    @Nullable
    public File e(String str) throws IOException {
        File file = new File(this.f12703j, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int h(String str, int i4, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found on ");
            sb.append(file.getCanonicalPath());
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" found on ");
        sb2.append(file.getCanonicalPath());
        if ((i4 & 1) != 0 && (this.f12704k & 2) != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" loaded implicitly");
            return 2;
        }
        if ((this.f12704k & 1) != 0) {
            g(file2, i4, threadPolicy);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Not resolving dependencies for ");
            sb4.append(str);
        }
        try {
            SoLoader.f12672d.a(file2.getAbsolutePath(), i4);
            return 1;
        } catch (UnsatisfiedLinkError e5) {
            if (e5.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e5;
        }
    }

    @Override // com.facebook.soloader.t
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f12703j.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f12703j.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f12704k + ']';
    }
}
