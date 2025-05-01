package com.facebook.imagepipeline.core;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.webp.b;
import com.facebook.imagepipeline.cache.p;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
/* compiled from: ImagePipelineExperiments.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11770a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f11771b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11772c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.webp.b f11773d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11774e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11775f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11776g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11777h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11778i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11779j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f11780k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f11781l;

    /* renamed from: m  reason: collision with root package name */
    private final d f11782m;

    /* renamed from: n  reason: collision with root package name */
    private final com.facebook.common.internal.k<Boolean> f11783n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f11784o;

    /* compiled from: ImagePipelineExperiments.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ImagePipelineConfig.Builder f11785a;

        /* renamed from: c  reason: collision with root package name */
        private b.a f11787c;

        /* renamed from: e  reason: collision with root package name */
        private com.facebook.common.webp.b f11789e;

        /* renamed from: n  reason: collision with root package name */
        private d f11798n;

        /* renamed from: o  reason: collision with root package name */
        public com.facebook.common.internal.k<Boolean> f11799o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f11800p;

        /* renamed from: b  reason: collision with root package name */
        private boolean f11786b = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11788d = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11790f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f11791g = false;

        /* renamed from: h  reason: collision with root package name */
        private int f11792h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f11793i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f11794j = false;

        /* renamed from: k  reason: collision with root package name */
        private int f11795k = 2048;

        /* renamed from: l  reason: collision with root package name */
        private boolean f11796l = false;

        /* renamed from: m  reason: collision with root package name */
        private boolean f11797m = false;

        public b(ImagePipelineConfig.Builder builder) {
            this.f11785a = builder;
        }

        public h m() {
            return new h(this);
        }

        public boolean n() {
            return this.f11797m;
        }

        public ImagePipelineConfig.Builder o(boolean z4, int i4, int i5, boolean z5) {
            this.f11791g = z4;
            this.f11792h = i4;
            this.f11793i = i5;
            this.f11794j = z5;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder p(boolean z4) {
            this.f11788d = z4;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder q(boolean z4) {
            this.f11800p = z4;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder r(com.facebook.common.internal.k<Boolean> kVar) {
            this.f11799o = kVar;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder s(int i4) {
            this.f11795k = i4;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder t(boolean z4) {
            this.f11796l = z4;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder u(boolean z4) {
            this.f11797m = z4;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder v(d dVar) {
            this.f11798n = dVar;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder w(boolean z4) {
            this.f11790f = z4;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder x(com.facebook.common.webp.b bVar) {
            this.f11789e = bVar;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder y(b.a aVar) {
            this.f11787c = aVar;
            return this.f11785a;
        }

        public ImagePipelineConfig.Builder z(boolean z4) {
            this.f11786b = z4;
            return this.f11785a;
        }
    }

    /* compiled from: ImagePipelineExperiments.java */
    /* loaded from: classes2.dex */
    public static class c implements d {
        @Override // com.facebook.imagepipeline.core.h.d
        public k a(Context context, com.facebook.common.memory.a aVar, com.facebook.imagepipeline.decoder.b bVar, com.facebook.imagepipeline.decoder.d dVar, boolean z4, boolean z5, boolean z6, e eVar, com.facebook.common.memory.g gVar, p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, p<com.facebook.cache.common.c, PooledByteBuffer> pVar2, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.e eVar3, com.facebook.imagepipeline.cache.f fVar, com.facebook.imagepipeline.bitmaps.f fVar2, int i4, int i5, boolean z7, int i6) {
            return new k(context, aVar, bVar, dVar, z4, z5, z6, eVar, gVar, pVar, pVar2, eVar2, eVar3, fVar, fVar2, i4, i5, z7, i6);
        }
    }

    /* compiled from: ImagePipelineExperiments.java */
    /* loaded from: classes2.dex */
    public interface d {
        k a(Context context, com.facebook.common.memory.a aVar, com.facebook.imagepipeline.decoder.b bVar, com.facebook.imagepipeline.decoder.d dVar, boolean z4, boolean z5, boolean z6, e eVar, com.facebook.common.memory.g gVar, p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, p<com.facebook.cache.common.c, PooledByteBuffer> pVar2, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.e eVar3, com.facebook.imagepipeline.cache.f fVar, com.facebook.imagepipeline.bitmaps.f fVar2, int i4, int i5, boolean z7, int i6);
    }

    public static b p(ImagePipelineConfig.Builder builder) {
        return new b(builder);
    }

    public boolean a() {
        return this.f11778i;
    }

    public int b() {
        return this.f11777h;
    }

    public int c() {
        return this.f11776g;
    }

    public int d() {
        return this.f11779j;
    }

    public d e() {
        return this.f11782m;
    }

    public boolean f() {
        return this.f11775f;
    }

    public boolean g() {
        return this.f11774e;
    }

    public com.facebook.common.webp.b h() {
        return this.f11773d;
    }

    public b.a i() {
        return this.f11771b;
    }

    public boolean j() {
        return this.f11772c;
    }

    public boolean k() {
        return this.f11784o;
    }

    public com.facebook.common.internal.k<Boolean> l() {
        return this.f11783n;
    }

    public boolean m() {
        return this.f11780k;
    }

    public boolean n() {
        return this.f11781l;
    }

    public boolean o() {
        return this.f11770a;
    }

    private h(b bVar) {
        this.f11770a = bVar.f11786b;
        this.f11771b = bVar.f11787c;
        this.f11772c = bVar.f11788d;
        this.f11773d = bVar.f11789e;
        this.f11774e = bVar.f11790f;
        this.f11775f = bVar.f11791g;
        this.f11776g = bVar.f11792h;
        this.f11777h = bVar.f11793i;
        this.f11778i = bVar.f11794j;
        this.f11779j = bVar.f11795k;
        this.f11780k = bVar.f11796l;
        this.f11781l = bVar.f11797m;
        if (bVar.f11798n != null) {
            this.f11782m = bVar.f11798n;
        } else {
            this.f11782m = new c();
        }
        this.f11783n = bVar.f11799o;
        this.f11784o = bVar.f11800p;
    }
}
