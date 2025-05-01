package com.facebook.imagepipeline.decoder;

import com.facebook.imageformat.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ImageDecoderConfig.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<com.facebook.imageformat.c, com.facebook.imagepipeline.decoder.b> f11889a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.a> f11890b;

    /* compiled from: ImageDecoderConfig.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Map<com.facebook.imageformat.c, com.facebook.imagepipeline.decoder.b> f11891a;

        /* renamed from: b  reason: collision with root package name */
        private List<c.a> f11892b;

        public b c(com.facebook.imageformat.c cVar, c.a aVar, com.facebook.imagepipeline.decoder.b bVar) {
            if (this.f11892b == null) {
                this.f11892b = new ArrayList();
            }
            this.f11892b.add(aVar);
            e(cVar, bVar);
            return this;
        }

        public c d() {
            return new c(this);
        }

        public b e(com.facebook.imageformat.c cVar, com.facebook.imagepipeline.decoder.b bVar) {
            if (this.f11891a == null) {
                this.f11891a = new HashMap();
            }
            this.f11891a.put(cVar, bVar);
            return this;
        }
    }

    public static b c() {
        return new b();
    }

    public Map<com.facebook.imageformat.c, com.facebook.imagepipeline.decoder.b> a() {
        return this.f11889a;
    }

    public List<c.a> b() {
        return this.f11890b;
    }

    private c(b bVar) {
        this.f11889a = bVar.f11891a;
        this.f11890b = bVar.f11892b;
    }
}
