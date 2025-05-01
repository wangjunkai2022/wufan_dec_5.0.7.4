package com.facebook.imagepipeline.animated.factory;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.bitmaps.f;
import com.facebook.imagepipeline.cache.h;
/* compiled from: AnimatedFactoryProvider.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11573a;

    /* renamed from: b  reason: collision with root package name */
    private static a f11574b;

    public static a a(f fVar, com.facebook.imagepipeline.core.e eVar, h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> hVar) {
        if (!f11573a) {
            try {
                f11574b = (a) AnimatedFactoryV2Impl.class.getConstructor(f.class, com.facebook.imagepipeline.core.e.class, h.class).newInstance(fVar, eVar, hVar);
            } catch (Throwable unused) {
            }
            if (f11574b != null) {
                f11573a = true;
            }
        }
        return f11574b;
    }
}
