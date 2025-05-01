package com.facebook.imageutils;

import com.facebook.common.internal.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: JfifUtil.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12529a = 255;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12530b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12531c = 216;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12532d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12533e = 217;

    /* renamed from: f  reason: collision with root package name */
    public static final int f12534f = 218;

    /* renamed from: g  reason: collision with root package name */
    public static final int f12535g = 225;

    /* renamed from: h  reason: collision with root package name */
    public static final int f12536h = 192;

    /* renamed from: i  reason: collision with root package name */
    public static final int f12537i = 208;

    /* renamed from: j  reason: collision with root package name */
    public static final int f12538j = 215;

    /* renamed from: k  reason: collision with root package name */
    public static final int f12539k = 1165519206;

    private c() {
    }

    public static int a(int i4) {
        return e.a(i4);
    }

    public static int b(InputStream inputStream) {
        try {
            int e5 = e(inputStream);
            if (e5 == 0) {
                return 0;
            }
            return e.d(inputStream, e5);
        } catch (IOException unused) {
            return 0;
        }
    }

    public static int c(byte[] bArr) {
        return b(new ByteArrayInputStream(bArr));
    }

    private static boolean d(int i4) {
        switch (i4) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private static int e(InputStream inputStream) throws IOException {
        int a5;
        if (f(inputStream, 225) && (a5 = d.a(inputStream, 2, false) - 2) > 6) {
            int a6 = d.a(inputStream, 4, false);
            int a7 = d.a(inputStream, 2, false);
            int i4 = (a5 - 4) - 2;
            if (a6 == 1165519206 && a7 == 0) {
                return i4;
            }
        }
        return 0;
    }

    public static boolean f(InputStream inputStream, int i4) throws IOException {
        h.i(inputStream);
        while (d.a(inputStream, 1, false) == 255) {
            int i5 = 255;
            while (i5 == 255) {
                i5 = d.a(inputStream, 1, false);
            }
            if ((i4 != 192 || !d(i5)) && i5 != i4) {
                if (i5 != 216 && i5 != 1) {
                    if (i5 == 217 || i5 == 218) {
                        break;
                    }
                    inputStream.skip(d.a(inputStream, 2, false) - 2);
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
