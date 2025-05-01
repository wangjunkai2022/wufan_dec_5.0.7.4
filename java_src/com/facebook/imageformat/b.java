package com.facebook.imageformat;

import com.facebook.common.internal.ImmutableList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DefaultImageFormats.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f11528a = new c("JPEG", "jpeg");

    /* renamed from: b  reason: collision with root package name */
    public static final c f11529b = new c("PNG", "png");

    /* renamed from: c  reason: collision with root package name */
    public static final c f11530c = new c("GIF", "gif");

    /* renamed from: d  reason: collision with root package name */
    public static final c f11531d = new c("BMP", "bmp");

    /* renamed from: e  reason: collision with root package name */
    public static final c f11532e = new c("ICO", "ico");

    /* renamed from: f  reason: collision with root package name */
    public static final c f11533f = new c("WEBP_SIMPLE", "webp");

    /* renamed from: g  reason: collision with root package name */
    public static final c f11534g = new c("WEBP_LOSSLESS", "webp");

    /* renamed from: h  reason: collision with root package name */
    public static final c f11535h = new c("WEBP_EXTENDED", "webp");

    /* renamed from: i  reason: collision with root package name */
    public static final c f11536i = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j  reason: collision with root package name */
    public static final c f11537j = new c("WEBP_ANIMATED", "webp");

    /* renamed from: k  reason: collision with root package name */
    public static final c f11538k = new c("HEIF", "heif");

    /* renamed from: l  reason: collision with root package name */
    private static ImmutableList<c> f11539l;

    private b() {
    }

    public static List<c> a() {
        if (f11539l == null) {
            ArrayList arrayList = new ArrayList(9);
            arrayList.add(f11528a);
            arrayList.add(f11529b);
            arrayList.add(f11530c);
            arrayList.add(f11531d);
            arrayList.add(f11532e);
            arrayList.add(f11533f);
            arrayList.add(f11534g);
            arrayList.add(f11535h);
            arrayList.add(f11536i);
            arrayList.add(f11537j);
            arrayList.add(f11538k);
            f11539l = ImmutableList.a(arrayList);
        }
        return f11539l;
    }

    public static boolean b(c cVar) {
        return cVar == f11533f || cVar == f11534g || cVar == f11535h || cVar == f11536i;
    }

    public static boolean c(c cVar) {
        return b(cVar) || cVar == f11537j;
    }
}
