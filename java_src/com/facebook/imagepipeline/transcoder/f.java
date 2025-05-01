package com.facebook.imagepipeline.transcoder;

import javax.annotation.Nullable;
/* compiled from: MultiImageTranscoderFactory.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f12508a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12509b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final d f12510c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final Integer f12511d;

    public f(int i4, boolean z4, @Nullable d dVar, @Nullable Integer num) {
        this.f12508a = i4;
        this.f12509b = z4;
        this.f12510c = dVar;
        this.f12511d = num;
    }

    @Nullable
    private c a(com.facebook.imageformat.c cVar, boolean z4) {
        d dVar = this.f12510c;
        if (dVar == null) {
            return null;
        }
        return dVar.createImageTranscoder(cVar, z4);
    }

    @Nullable
    private c b(com.facebook.imageformat.c cVar, boolean z4) {
        Integer num = this.f12511d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return d(cVar, z4);
            }
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return c(cVar, z4);
    }

    @Nullable
    private c c(com.facebook.imageformat.c cVar, boolean z4) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f12508a, this.f12509b).createImageTranscoder(cVar, z4);
    }

    private c d(com.facebook.imageformat.c cVar, boolean z4) {
        return new h(this.f12508a).createImageTranscoder(cVar, z4);
    }

    @Override // com.facebook.imagepipeline.transcoder.d
    public c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z4) {
        c a5 = a(cVar, z4);
        if (a5 == null) {
            a5 = b(cVar, z4);
        }
        if (a5 == null) {
            a5 = c(cVar, z4);
        }
        return a5 == null ? d(cVar, z4) : a5;
    }
}
