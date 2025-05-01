package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.m;
import com.facebook.soloader.v;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
/* compiled from: ApkSoSource.java */
/* loaded from: classes2.dex */
public class a extends m {
    private static final String C = "ApkSoSource";
    public static final int D = 1;
    private static final byte E = 2;
    private static final byte F = 0;
    private static final byte G = 1;
    private static final byte H = 2;
    private final int B;

    /* compiled from: ApkSoSource.java */
    /* renamed from: com.facebook.soloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    protected class C0286a extends m.c {

        /* renamed from: f  reason: collision with root package name */
        private File f12695f;

        /* renamed from: g  reason: collision with root package name */
        private final int f12696g;

        C0286a(m mVar) throws IOException {
            super(mVar);
            this.f12695f = new File(a.this.f12812n.getApplicationInfo().nativeLibraryDir);
            this.f12696g = a.this.B;
        }

        @Override // com.facebook.soloader.m.c
        protected boolean j(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(a.this.f12813o)) {
                a.this.f12813o = null;
                String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.f12696g & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("allowing consideration of ");
                sb.append(name);
                sb.append(": self-extraction preferred");
            } else {
                File file = new File(this.f12695f, str);
                if (!file.isFile()) {
                    String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("not allowing consideration of ");
                        sb2.append(name);
                        sb2.append(": deferring to libdir");
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public a(Context context, String str, int i4) {
        this(context, new File(context.getApplicationInfo().sourceDir), str, i4);
    }

    @Override // com.facebook.soloader.v
    protected byte[] l() throws IOException {
        File canonicalFile = this.f12778z.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.g(this.f12812n));
            if ((this.B & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f12812n.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.m, com.facebook.soloader.v
    protected v.f o() throws IOException {
        return new C0286a(this);
    }

    public a(Context context, File file, String str, int i4) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.B = i4;
    }
}
