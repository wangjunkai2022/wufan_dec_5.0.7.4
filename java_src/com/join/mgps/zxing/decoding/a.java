package com.join.mgps.zxing.decoding;

import android.content.Intent;
import android.net.Uri;
import com.google.zxing.BarcodeFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;
/* compiled from: DecodeFormatManager.java */
/* loaded from: classes5.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f55089a = Pattern.compile(",");

    /* renamed from: b  reason: collision with root package name */
    static final Vector<BarcodeFormat> f55090b;

    /* renamed from: c  reason: collision with root package name */
    static final Vector<BarcodeFormat> f55091c;

    /* renamed from: d  reason: collision with root package name */
    static final Vector<BarcodeFormat> f55092d;

    /* renamed from: e  reason: collision with root package name */
    static final Vector<BarcodeFormat> f55093e;

    static {
        Vector<BarcodeFormat> vector = new Vector<>(5);
        f55090b = vector;
        vector.add(BarcodeFormat.UPC_A);
        vector.add(BarcodeFormat.UPC_E);
        vector.add(BarcodeFormat.EAN_13);
        vector.add(BarcodeFormat.EAN_8);
        Vector<BarcodeFormat> vector2 = new Vector<>(vector.size() + 4);
        f55091c = vector2;
        vector2.addAll(vector);
        vector2.add(BarcodeFormat.CODE_39);
        vector2.add(BarcodeFormat.CODE_93);
        vector2.add(BarcodeFormat.CODE_128);
        vector2.add(BarcodeFormat.ITF);
        Vector<BarcodeFormat> vector3 = new Vector<>(1);
        f55092d = vector3;
        vector3.add(BarcodeFormat.QR_CODE);
        Vector<BarcodeFormat> vector4 = new Vector<>(1);
        f55093e = vector4;
        vector4.add(BarcodeFormat.DATA_MATRIX);
    }

    private a() {
    }

    static Vector<BarcodeFormat> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return c(stringExtra != null ? Arrays.asList(f55089a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    static Vector<BarcodeFormat> b(Uri uri) {
        List<String> queryParameters = uri.getQueryParameters("SCAN_FORMATS");
        if (queryParameters != null && queryParameters.size() == 1 && queryParameters.get(0) != null) {
            queryParameters = Arrays.asList(f55089a.split(queryParameters.get(0)));
        }
        return c(queryParameters, uri.getQueryParameter("SCAN_MODE"));
    }

    private static Vector<BarcodeFormat> c(Iterable<String> iterable, String str) {
        if (iterable != null) {
            Vector<BarcodeFormat> vector = new Vector<>();
            try {
                for (String str2 : iterable) {
                    vector.add(BarcodeFormat.valueOf(str2));
                }
                return vector;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            if ("PRODUCT_MODE".equals(str)) {
                return f55090b;
            }
            if ("QR_CODE_MODE".equals(str)) {
                return f55092d;
            }
            if ("DATA_MATRIX_MODE".equals(str)) {
                return f55093e;
            }
            if ("ONE_D_MODE".equals(str)) {
                return f55091c;
            }
            return null;
        }
        return null;
    }
}
