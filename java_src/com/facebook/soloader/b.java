package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;
/* compiled from: ApplicationSoSource.java */
/* loaded from: classes.dex */
public class b extends t {

    /* renamed from: j  reason: collision with root package name */
    private Context f12698j;

    /* renamed from: k  reason: collision with root package name */
    private int f12699k;

    /* renamed from: l  reason: collision with root package name */
    private c f12700l;

    public b(Context context, int i4) {
        Context applicationContext = context.getApplicationContext();
        this.f12698j = applicationContext;
        if (applicationContext == null) {
            this.f12698j = context;
        }
        this.f12699k = i4;
        this.f12700l = new c(new File(this.f12698j.getApplicationInfo().nativeLibraryDir), i4);
    }

    @Override // com.facebook.soloader.t
    public void a(Collection<String> collection) {
        this.f12700l.a(collection);
    }

    @Override // com.facebook.soloader.t
    public int c(String str, int i4, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.f12700l.c(str, i4, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.t
    public void d(int i4) throws IOException {
        this.f12700l.d(i4);
    }

    @Override // com.facebook.soloader.t
    @Nullable
    public File e(String str) throws IOException {
        return this.f12700l.e(str);
    }

    public boolean f() throws IOException {
        try {
            File file = this.f12700l.f12703j;
            Context context = this.f12698j;
            Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Native library directory updated from ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            int i4 = this.f12699k | 1;
            this.f12699k = i4;
            c cVar = new c(file2, i4);
            this.f12700l = cVar;
            cVar.d(this.f12699k);
            this.f12698j = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // com.facebook.soloader.t
    public String toString() {
        return this.f12700l.toString();
    }
}
