package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import androidx.core.util.Pools;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: ArtDecoder.java */
@ThreadSafe
@TargetApi(21)
/* loaded from: classes2.dex */
public class a extends b {
    public a(com.facebook.imagepipeline.memory.d dVar, int i4, Pools.SynchronizedPool synchronizedPool) {
        super(dVar, i4, synchronizedPool);
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int g(int i4, int i5, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.f(i4, i5, options.inPreferredConfig);
    }
}
