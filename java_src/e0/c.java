package e0;

import com.facebook.common.internal.e;
import com.facebook.common.internal.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
/* compiled from: FileBinaryResource.java */
/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final File f68830a;

    private c(File file) {
        this.f68830a = (File) h.i(file);
    }

    @Nullable
    public static c b(File file) {
        if (file != null) {
            return new c(file);
        }
        return null;
    }

    @Override // e0.a
    public InputStream a() throws IOException {
        return new FileInputStream(this.f68830a);
    }

    public File c() {
        return this.f68830a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f68830a.equals(((c) obj).f68830a);
    }

    public int hashCode() {
        return this.f68830a.hashCode();
    }

    @Override // e0.a
    public byte[] read() throws IOException {
        return e.b(this.f68830a);
    }

    @Override // e0.a
    public long size() {
        return this.f68830a.length();
    }
}
