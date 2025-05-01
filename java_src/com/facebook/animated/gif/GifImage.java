package com.facebook.animated.gif;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.h;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.d;
import com.facebook.imagepipeline.animated.factory.c;
import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.ThreadSafe;
@DoNotStrip
@ThreadSafe
/* loaded from: classes2.dex */
public class GifImage implements d, c {

    /* renamed from: b  reason: collision with root package name */
    private static final int f10693b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final int f10694c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f10695d;
    @DoNotStrip
    private long mNativeContext;

    @DoNotStrip
    public GifImage() {
    }

    public static GifImage j(long j4, int i4) {
        m();
        h.d(j4 != 0);
        return nativeCreateFromNativeMemory(j4, i4);
    }

    public static GifImage k(ByteBuffer byteBuffer) {
        m();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public static GifImage l(byte[] bArr) {
        m();
        h.i(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    private static synchronized void m() {
        synchronized (GifImage.class) {
            if (!f10695d) {
                f10695d = true;
                SoLoader.k("gifimage");
            }
        }
    }

    private static AnimatedDrawableFrameInfo.DisposalMethod n(int i4) {
        if (i4 == 0) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i4 == 1) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i4 == 2) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND;
        }
        if (i4 == 3) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS;
        }
        return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
    }

    @DoNotStrip
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    @DoNotStrip
    private static native GifImage nativeCreateFromNativeMemory(long j4, int i4);

    @DoNotStrip
    private native void nativeDispose();

    @DoNotStrip
    private native void nativeFinalize();

    @DoNotStrip
    private native int nativeGetDuration();

    @DoNotStrip
    private native GifFrame nativeGetFrame(int i4);

    @DoNotStrip
    private native int nativeGetFrameCount();

    @DoNotStrip
    private native int[] nativeGetFrameDurations();

    @DoNotStrip
    private native int nativeGetHeight();

    @DoNotStrip
    private native int nativeGetLoopCount();

    @DoNotStrip
    private native int nativeGetSizeInBytes();

    @DoNotStrip
    private native int nativeGetWidth();

    @Override // com.facebook.imagepipeline.animated.base.d
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public int b() {
        return nativeGetSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public int c() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount != -1) {
            if (nativeGetLoopCount != 0) {
                return nativeGetLoopCount + 1;
            }
            return 0;
        }
        return 1;
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public boolean d() {
        return false;
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public void dispose() {
        nativeDispose();
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public AnimatedDrawableFrameInfo e(int i4) {
        GifFrame f5 = f(i4);
        try {
            return new AnimatedDrawableFrameInfo(i4, f5.c(), f5.d(), f5.getWidth(), f5.getHeight(), AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS, n(f5.e()));
        } finally {
            f5.dispose();
        }
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // com.facebook.imagepipeline.animated.factory.c
    public d g(long j4, int i4) {
        return j(j4, i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public int getDuration() {
        return nativeGetDuration();
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // com.facebook.imagepipeline.animated.factory.c
    public d h(ByteBuffer byteBuffer) {
        return k(byteBuffer);
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    public int[] i() {
        return nativeGetFrameDurations();
    }

    @Override // com.facebook.imagepipeline.animated.base.d
    /* renamed from: o */
    public GifFrame f(int i4) {
        return nativeGetFrame(i4);
    }

    @DoNotStrip
    GifImage(long j4) {
        this.mNativeContext = j4;
    }
}
