package com.facebook.imagepipeline.cache;

import android.app.ActivityManager;
import android.os.Build;
/* compiled from: DefaultBitmapMemoryCacheParamsSupplier.java */
/* loaded from: classes2.dex */
public class i implements com.facebook.common.internal.k<q> {

    /* renamed from: b  reason: collision with root package name */
    private static final int f11670b = 256;

    /* renamed from: c  reason: collision with root package name */
    private static final int f11671c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private static final int f11672d = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private static final int f11673e = Integer.MAX_VALUE;

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f11674a;

    public i(ActivityManager activityManager) {
        this.f11674a = activityManager;
    }

    private int b() {
        int min = Math.min(this.f11674a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    @Override // com.facebook.common.internal.k
    /* renamed from: a */
    public q get() {
        return new q(b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
