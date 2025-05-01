package com.switfpass.pay.activity.zxing.decoding;

import com.google.zxing.BarcodeFormat;
import java.util.Vector;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private static Vector f61683a;

    /* renamed from: b  reason: collision with root package name */
    static final Vector f61684b;

    /* renamed from: c  reason: collision with root package name */
    static final Vector f61685c;

    /* renamed from: d  reason: collision with root package name */
    static final Vector f61686d;

    static {
        Pattern.compile(",");
        Vector vector = new Vector(5);
        f61683a = vector;
        vector.add(BarcodeFormat.UPC_A);
        f61683a.add(BarcodeFormat.UPC_E);
        f61683a.add(BarcodeFormat.EAN_13);
        f61683a.add(BarcodeFormat.EAN_8);
        f61683a.add(BarcodeFormat.RSS_14);
        Vector vector2 = new Vector(f61683a.size() + 4);
        f61684b = vector2;
        vector2.addAll(f61683a);
        vector2.add(BarcodeFormat.CODE_39);
        vector2.add(BarcodeFormat.CODE_93);
        vector2.add(BarcodeFormat.CODE_128);
        vector2.add(BarcodeFormat.ITF);
        Vector vector3 = new Vector(1);
        f61685c = vector3;
        vector3.add(BarcodeFormat.QR_CODE);
        Vector vector4 = new Vector(1);
        f61686d = vector4;
        vector4.add(BarcodeFormat.DATA_MATRIX);
    }
}
