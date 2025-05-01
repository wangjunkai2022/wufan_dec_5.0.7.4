package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.DoNotStrip;
import javax.annotation.Nullable;
@DoNotStrip
/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements com.facebook.imagepipeline.transcoder.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f12080a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12081b;

    @DoNotStrip
    public NativeJpegTranscoderFactory(int i4, boolean z4) {
        this.f12080a = i4;
        this.f12081b = z4;
    }

    @Override // com.facebook.imagepipeline.transcoder.d
    @DoNotStrip
    @Nullable
    public com.facebook.imagepipeline.transcoder.c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z4) {
        if (cVar != com.facebook.imageformat.b.f11528a) {
            return null;
        }
        return new NativeJpegTranscoder(z4, this.f12080a, this.f12081b);
    }
}
