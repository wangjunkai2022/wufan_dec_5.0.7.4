package com.facebook.imagepipeline.decoder;
/* loaded from: classes2.dex */
public class DecodeException extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.image.e f11882b;

    public DecodeException(String str, com.facebook.imagepipeline.image.e eVar) {
        super(str);
        this.f11882b = eVar;
    }

    public com.facebook.imagepipeline.image.e a() {
        return this.f11882b;
    }

    public DecodeException(String str, Throwable th, com.facebook.imagepipeline.image.e eVar) {
        super(str, th);
        this.f11882b = eVar;
    }
}
