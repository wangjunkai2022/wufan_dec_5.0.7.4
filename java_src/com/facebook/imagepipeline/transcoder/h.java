package com.facebook.imagepipeline.transcoder;
/* compiled from: SimpleImageTranscoderFactory.java */
/* loaded from: classes2.dex */
public class h implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f12515a;

    public h(int i4) {
        this.f12515a = i4;
    }

    @Override // com.facebook.imagepipeline.transcoder.d
    public c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z4) {
        return new g(z4, this.f12515a);
    }
}
