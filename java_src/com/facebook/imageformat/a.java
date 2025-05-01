package com.facebook.imageformat;

import com.facebook.common.internal.f;
import com.facebook.common.internal.h;
import com.facebook.imageformat.c;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import javax.annotation.Nullable;
/* compiled from: DefaultImageFormatChecker.java */
/* loaded from: classes.dex */
public class a implements c.a {

    /* renamed from: b  reason: collision with root package name */
    private static final int f11511b = 20;

    /* renamed from: c  reason: collision with root package name */
    private static final int f11512c = 21;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f11513d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f11514e;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f11515f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f11516g;

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f11517h;

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f11518i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f11519j = 6;

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f11520k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f11521l;

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f11522m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f11523n;

    /* renamed from: o  reason: collision with root package name */
    private static final String f11524o = "ftyp";

    /* renamed from: p  reason: collision with root package name */
    private static final String[] f11525p;

    /* renamed from: q  reason: collision with root package name */
    private static final int f11526q;

    /* renamed from: a  reason: collision with root package name */
    final int f11527a = f.a(21, 20, f11514e, f11516g, 6, f11521l, f11523n, f11526q);

    static {
        byte[] bArr = {-1, -40, -1};
        f11513d = bArr;
        f11514e = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, BinaryMemcacheOpcodes.PREPENDQ, 10};
        f11515f = bArr2;
        f11516g = bArr2.length;
        f11517h = e.a("GIF87a");
        f11518i = e.a("GIF89a");
        byte[] a5 = e.a("BM");
        f11520k = a5;
        f11521l = a5.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f11522m = bArr3;
        f11523n = bArr3.length;
        String[] strArr = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
        f11525p = strArr;
        f11526q = e.a("ftyp" + strArr[0]).length;
    }

    private static c c(byte[] bArr, int i4) {
        h.d(com.facebook.common.webp.c.h(bArr, 0, i4));
        if (com.facebook.common.webp.c.g(bArr, 0)) {
            return b.f11533f;
        }
        if (com.facebook.common.webp.c.f(bArr, 0)) {
            return b.f11534g;
        }
        if (com.facebook.common.webp.c.c(bArr, 0, i4)) {
            if (com.facebook.common.webp.c.b(bArr, 0)) {
                return b.f11537j;
            }
            if (com.facebook.common.webp.c.d(bArr, 0)) {
                return b.f11536i;
            }
            return b.f11535h;
        }
        return c.f11540c;
    }

    private static boolean d(byte[] bArr, int i4) {
        byte[] bArr2 = f11520k;
        if (i4 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean e(byte[] bArr, int i4) {
        if (i4 < 6) {
            return false;
        }
        return e.c(bArr, f11517h) || e.c(bArr, f11518i);
    }

    private static boolean f(byte[] bArr, int i4) {
        String[] strArr;
        if (i4 >= f11526q && bArr[3] >= 8) {
            for (String str : f11525p) {
                if (e.b(bArr, bArr.length, e.a("ftyp" + str), f11526q) > -1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean g(byte[] bArr, int i4) {
        byte[] bArr2 = f11522m;
        if (i4 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean h(byte[] bArr, int i4) {
        byte[] bArr2 = f11513d;
        return i4 >= bArr2.length && e.c(bArr, bArr2);
    }

    private static boolean i(byte[] bArr, int i4) {
        byte[] bArr2 = f11515f;
        return i4 >= bArr2.length && e.c(bArr, bArr2);
    }

    @Override // com.facebook.imageformat.c.a
    @Nullable
    public final c a(byte[] bArr, int i4) {
        h.i(bArr);
        if (com.facebook.common.webp.c.h(bArr, 0, i4)) {
            return c(bArr, i4);
        }
        if (h(bArr, i4)) {
            return b.f11528a;
        }
        if (i(bArr, i4)) {
            return b.f11529b;
        }
        if (e(bArr, i4)) {
            return b.f11530c;
        }
        if (d(bArr, i4)) {
            return b.f11531d;
        }
        if (g(bArr, i4)) {
            return b.f11532e;
        }
        if (f(bArr, i4)) {
            return b.f11538k;
        }
        return c.f11540c;
    }

    @Override // com.facebook.imageformat.c.a
    public int b() {
        return this.f11527a;
    }
}
