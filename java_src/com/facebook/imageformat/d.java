package com.facebook.imageformat;

import com.facebook.common.internal.h;
import com.facebook.common.internal.m;
import com.facebook.imageformat.c;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ImageFormatChecker.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static d f11543d;

    /* renamed from: a  reason: collision with root package name */
    private int f11544a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private List<c.a> f11545b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f11546c = new a();

    private d() {
        h();
    }

    public static c b(InputStream inputStream) throws IOException {
        return e().a(inputStream);
    }

    public static c c(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            c b5 = b(fileInputStream);
            com.facebook.common.internal.c.b(fileInputStream);
            return b5;
        } catch (IOException unused2) {
            fileInputStream2 = fileInputStream;
            c cVar = c.f11540c;
            com.facebook.common.internal.c.b(fileInputStream2);
            return cVar;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.facebook.common.internal.c.b(fileInputStream2);
            throw th;
        }
    }

    public static c d(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e5) {
            throw m.d(e5);
        }
    }

    public static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            if (f11543d == null) {
                f11543d = new d();
            }
            dVar = f11543d;
        }
        return dVar;
    }

    private static int f(int i4, InputStream inputStream, byte[] bArr) throws IOException {
        h.i(inputStream);
        h.i(bArr);
        h.d(bArr.length >= i4);
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i4);
                return com.facebook.common.internal.b.b(inputStream, bArr, 0, i4);
            } finally {
                inputStream.reset();
            }
        }
        return com.facebook.common.internal.b.b(inputStream, bArr, 0, i4);
    }

    private void h() {
        this.f11544a = this.f11546c.b();
        List<c.a> list = this.f11545b;
        if (list != null) {
            for (c.a aVar : list) {
                this.f11544a = Math.max(this.f11544a, aVar.b());
            }
        }
    }

    public c a(InputStream inputStream) throws IOException {
        h.i(inputStream);
        int i4 = this.f11544a;
        byte[] bArr = new byte[i4];
        int f5 = f(i4, inputStream, bArr);
        c a5 = this.f11546c.a(bArr, f5);
        if (a5 == null || a5 == c.f11540c) {
            List<c.a> list = this.f11545b;
            if (list != null) {
                for (c.a aVar : list) {
                    c a6 = aVar.a(bArr, f5);
                    if (a6 != null && a6 != c.f11540c) {
                        return a6;
                    }
                }
            }
            return c.f11540c;
        }
        return a5;
    }

    public void g(@Nullable List<c.a> list) {
        this.f11545b = list;
        h();
    }
}
