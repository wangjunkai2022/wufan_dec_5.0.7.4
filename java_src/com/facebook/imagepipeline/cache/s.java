package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.cache.h;
/* compiled from: NativeMemoryCacheTrimStrategy.java */
/* loaded from: classes2.dex */
public class s implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11686a = "NativeMemoryCacheTrimStrategy";

    /* compiled from: NativeMemoryCacheTrimStrategy.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11687a;

        static {
            int[] iArr = new int[MemoryTrimType.values().length];
            f11687a = iArr;
            try {
                iArr[MemoryTrimType.OnCloseToDalvikHeapLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11687a[MemoryTrimType.OnAppBackgrounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11687a[MemoryTrimType.OnSystemMemoryCriticallyLowWhileAppInForeground.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11687a[MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11687a[MemoryTrimType.OnSystemLowMemoryWhileAppInBackground.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.h.c
    public double a(MemoryTrimType memoryTrimType) {
        int i4 = a.f11687a[memoryTrimType.ordinal()];
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                return 1.0d;
            }
            com.facebook.common.logging.a.y0(f11686a, "unknown trim type: %s", memoryTrimType);
            return 0.0d;
        }
        return 0.0d;
    }
}
