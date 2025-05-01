package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.h;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
@DoNotStrip
/* loaded from: classes.dex */
public class NativeJpegTranscoder implements com.facebook.imagepipeline.transcoder.c {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12076d = "NativeJpegTranscoder";

    /* renamed from: a  reason: collision with root package name */
    private boolean f12077a;

    /* renamed from: b  reason: collision with root package name */
    private int f12078b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12079c;

    static {
        d.a();
    }

    public NativeJpegTranscoder(boolean z4, int i4, boolean z5) {
        this.f12077a = z4;
        this.f12078b = i4;
        this.f12079c = z5;
    }

    @VisibleForTesting
    public static void d(InputStream inputStream, OutputStream outputStream, int i4, int i5, int i6) throws IOException {
        d.a();
        boolean z4 = false;
        h.d(i5 >= 1);
        h.d(i5 <= 16);
        h.d(i6 >= 0);
        h.d(i6 <= 100);
        h.d(com.facebook.imagepipeline.transcoder.e.j(i4));
        h.e((i5 == 8 && i4 == 0) ? true : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) h.i(inputStream), (OutputStream) h.i(outputStream), i4, i5, i6);
    }

    @VisibleForTesting
    public static void e(InputStream inputStream, OutputStream outputStream, int i4, int i5, int i6) throws IOException {
        d.a();
        boolean z4 = false;
        h.d(i5 >= 1);
        h.d(i5 <= 16);
        h.d(i6 >= 0);
        h.d(i6 <= 100);
        h.d(com.facebook.imagepipeline.transcoder.e.i(i4));
        h.e((i5 == 8 && i4 == 1) ? true : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) h.i(inputStream), (OutputStream) h.i(outputStream), i4, i5, i6);
    }

    @DoNotStrip
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i4, int i5, int i6) throws IOException;

    @DoNotStrip
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i4, int i5, int i6) throws IOException;

    @Override // com.facebook.imagepipeline.transcoder.c
    public boolean a(com.facebook.imagepipeline.image.e eVar, @Nullable RotationOptions rotationOptions, @Nullable com.facebook.imagepipeline.common.d dVar) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.a();
        }
        return com.facebook.imagepipeline.transcoder.e.f(rotationOptions, dVar, eVar, this.f12077a) < 8;
    }

    @Override // com.facebook.imagepipeline.transcoder.c
    public com.facebook.imagepipeline.transcoder.b b(com.facebook.imagepipeline.image.e eVar, OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable com.facebook.imagepipeline.common.d dVar, @Nullable com.facebook.imageformat.c cVar, @Nullable Integer num) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.a();
        }
        int b5 = com.facebook.imagepipeline.transcoder.a.b(rotationOptions, dVar, eVar, this.f12078b);
        try {
            int f5 = com.facebook.imagepipeline.transcoder.e.f(rotationOptions, dVar, eVar, this.f12077a);
            int a5 = com.facebook.imagepipeline.transcoder.e.a(b5);
            if (this.f12079c) {
                f5 = a5;
            }
            InputStream u4 = eVar.u();
            if (com.facebook.imagepipeline.transcoder.e.f12506g.contains(Integer.valueOf(eVar.l()))) {
                e(u4, outputStream, com.facebook.imagepipeline.transcoder.e.d(rotationOptions, eVar), f5, num.intValue());
            } else {
                d(u4, outputStream, com.facebook.imagepipeline.transcoder.e.e(rotationOptions, eVar), f5, num.intValue());
            }
            com.facebook.common.internal.c.b(u4);
            return new com.facebook.imagepipeline.transcoder.b(b5 != 1 ? 0 : 1);
        } catch (Throwable th) {
            com.facebook.common.internal.c.b(null);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.transcoder.c
    public boolean c(com.facebook.imageformat.c cVar) {
        return cVar == com.facebook.imageformat.b.f11528a;
    }

    @Override // com.facebook.imagepipeline.transcoder.c
    public String getIdentifier() {
        return f12076d;
    }
}
