package com.facebook.imagepipeline.producers;
/* compiled from: ThumbnailSizeChecker.java */
/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f12443a = 1.3333334f;

    /* renamed from: b  reason: collision with root package name */
    private static final int f12444b = 90;

    /* renamed from: c  reason: collision with root package name */
    private static final int f12445c = 270;

    public static int a(int i4) {
        return (int) (i4 * 1.3333334f);
    }

    public static boolean b(int i4, int i5, com.facebook.imagepipeline.common.d dVar) {
        return dVar == null ? ((float) a(i4)) >= 2048.0f && a(i5) >= 2048 : a(i4) >= dVar.f11726a && a(i5) >= dVar.f11727b;
    }

    public static boolean c(com.facebook.imagepipeline.image.e eVar, com.facebook.imagepipeline.common.d dVar) {
        if (eVar == null) {
            return false;
        }
        int v2 = eVar.v();
        if (v2 != 90 && v2 != 270) {
            return b(eVar.B(), eVar.r(), dVar);
        }
        return b(eVar.r(), eVar.B(), dVar);
    }
}
