package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.imagepipeline.animated.base.e;
import javax.annotation.concurrent.ThreadSafe;
@ThreadSafe
/* loaded from: classes2.dex */
public class GifFrame implements e {
    @DoNotStrip
    private long mNativeContext;

    @DoNotStrip
    GifFrame(long j4) {
        this.mNativeContext = j4;
    }

    @DoNotStrip
    private native void nativeDispose();

    @DoNotStrip
    private native void nativeFinalize();

    @DoNotStrip
    private native int nativeGetDisposalMode();

    @DoNotStrip
    private native int nativeGetDurationMs();

    @DoNotStrip
    private native int nativeGetHeight();

    @DoNotStrip
    private native int nativeGetTransparentPixelColor();

    @DoNotStrip
    private native int nativeGetWidth();

    @DoNotStrip
    private native int nativeGetXOffset();

    @DoNotStrip
    private native int nativeGetYOffset();

    @DoNotStrip
    private native boolean nativeHasTransparency();

    @DoNotStrip
    private native void nativeRenderFrame(int i4, int i5, Bitmap bitmap);

    @Override // com.facebook.imagepipeline.animated.base.e
    public void a(int i4, int i5, Bitmap bitmap) {
        nativeRenderFrame(i4, i5, bitmap);
    }

    @Override // com.facebook.imagepipeline.animated.base.e
    public int b() {
        return nativeGetDurationMs();
    }

    @Override // com.facebook.imagepipeline.animated.base.e
    public int c() {
        return nativeGetXOffset();
    }

    @Override // com.facebook.imagepipeline.animated.base.e
    public int d() {
        return nativeGetYOffset();
    }

    @Override // com.facebook.imagepipeline.animated.base.e
    public void dispose() {
        nativeDispose();
    }

    public int e() {
        return nativeGetDisposalMode();
    }

    public int f() {
        return nativeGetTransparentPixelColor();
    }

    protected void finalize() {
        nativeFinalize();
    }

    public boolean g() {
        return nativeHasTransparency();
    }

    @Override // com.facebook.imagepipeline.animated.base.e
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // com.facebook.imagepipeline.animated.base.e
    public int getWidth() {
        return nativeGetWidth();
    }
}
