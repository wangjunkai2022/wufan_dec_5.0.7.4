package com.facebook.imageutils;

import com.facebook.imagepipeline.common.RotationOptions;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: TiffUtil.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f12540a = e.class;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12541b = 1296891946;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12542c = 1229531648;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12543d = 274;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12544e = 3;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TiffUtil.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f12545a;

        /* renamed from: b  reason: collision with root package name */
        int f12546b;

        /* renamed from: c  reason: collision with root package name */
        int f12547c;

        private b() {
        }
    }

    e() {
    }

    public static int a(int i4) {
        if (i4 != 3) {
            if (i4 != 6) {
                if (i4 != 8) {
                    return 0;
                }
                return RotationOptions.f11694f;
            }
            return 90;
        }
        return 180;
    }

    private static int b(InputStream inputStream, int i4, boolean z4) throws IOException {
        if (i4 >= 10 && d.a(inputStream, 2, z4) == 3 && d.a(inputStream, 4, z4) == 1) {
            int a5 = d.a(inputStream, 2, z4);
            d.a(inputStream, 2, z4);
            return a5;
        }
        return 0;
    }

    private static int c(InputStream inputStream, int i4, boolean z4, int i5) throws IOException {
        if (i4 < 14) {
            return 0;
        }
        int a5 = d.a(inputStream, 2, z4);
        int i6 = i4 - 2;
        while (true) {
            int i7 = a5 - 1;
            if (a5 <= 0 || i6 < 12) {
                break;
            }
            int i8 = i6 - 2;
            if (d.a(inputStream, 2, z4) == i5) {
                return i8;
            }
            inputStream.skip(10L);
            i6 = i8 - 10;
            a5 = i7;
        }
        return 0;
    }

    public static int d(InputStream inputStream, int i4) throws IOException {
        b bVar = new b();
        int e5 = e(inputStream, i4, bVar);
        int i5 = bVar.f12547c - 8;
        if (e5 == 0 || i5 > e5) {
            return 0;
        }
        inputStream.skip(i5);
        return b(inputStream, c(inputStream, e5 - i5, bVar.f12545a, f12543d), bVar.f12545a);
    }

    private static int e(InputStream inputStream, int i4, b bVar) throws IOException {
        if (i4 <= 8) {
            return 0;
        }
        int a5 = d.a(inputStream, 4, false);
        bVar.f12546b = a5;
        int i5 = i4 - 4;
        if (a5 != 1229531648 && a5 != 1296891946) {
            com.facebook.common.logging.a.q(f12540a, "Invalid TIFF header");
            return 0;
        }
        boolean z4 = a5 == 1229531648;
        bVar.f12545a = z4;
        int a6 = d.a(inputStream, 4, z4);
        bVar.f12547c = a6;
        int i6 = i5 - 4;
        if (a6 < 8 || a6 - 8 > i6) {
            com.facebook.common.logging.a.q(f12540a, "Invalid offset");
            return 0;
        }
        return i6;
    }
}
