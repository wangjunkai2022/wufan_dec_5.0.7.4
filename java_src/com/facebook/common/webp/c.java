package com.facebook.common.webp;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import javax.annotation.Nullable;
/* compiled from: WebpSupportStatus.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f10932a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f10933b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f10934c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public static b f10935d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f10936e = false;

    /* renamed from: f  reason: collision with root package name */
    private static final String f10937f = "UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==";

    /* renamed from: g  reason: collision with root package name */
    private static final int f10938g = 20;

    /* renamed from: h  reason: collision with root package name */
    private static final int f10939h = 21;

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f10940i;

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f10941j;

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f10942k;

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f10943l;

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f10944m;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f10932a = i4 <= 17;
        f10933b = i4 >= 14;
        f10934c = e();
        f10935d = null;
        f10936e = false;
        f10940i = a("RIFF");
        f10941j = a("WEBP");
        f10942k = a("VP8 ");
        f10943l = a("VP8L");
        f10944m = a("VP8X");
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("ASCII not found!", e5);
        }
    }

    public static boolean b(byte[] bArr, int i4) {
        return k(bArr, i4 + 12, f10944m) && ((bArr[i4 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i4, int i5) {
        return i5 >= 21 && k(bArr, i4 + 12, f10944m);
    }

    public static boolean d(byte[] bArr, int i4) {
        return k(bArr, i4 + 12, f10944m) && ((bArr[i4 + 20] & 16) == 16);
    }

    private static boolean e() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 17) {
            return false;
        }
        if (i4 == 17) {
            byte[] decode = Base64.decode(f10937f, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (options.outHeight != 1 || options.outWidth != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(byte[] bArr, int i4) {
        return k(bArr, i4 + 12, f10943l);
    }

    public static boolean g(byte[] bArr, int i4) {
        return k(bArr, i4 + 12, f10942k);
    }

    public static boolean h(byte[] bArr, int i4, int i5) {
        return i5 >= 20 && k(bArr, i4, f10940i) && k(bArr, i4 + 8, f10941j);
    }

    public static boolean i(byte[] bArr, int i4, int i5) {
        if (g(bArr, i4)) {
            return f10933b;
        }
        if (f(bArr, i4)) {
            return f10934c;
        }
        if (!c(bArr, i4, i5) || b(bArr, i4)) {
            return false;
        }
        return f10934c;
    }

    @Nullable
    public static b j() {
        if (f10936e) {
            return f10935d;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f10936e = true;
        return bVar;
    }

    private static boolean k(byte[] bArr, int i4, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i4 > bArr.length) {
            return false;
        }
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            if (bArr[i5 + i4] != bArr2[i5]) {
                return false;
            }
        }
        return true;
    }
}
