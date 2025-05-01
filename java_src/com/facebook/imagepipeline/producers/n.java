package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
/* compiled from: DiskCacheReadProducer.java */
/* loaded from: classes.dex */
public class n implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12301e = "DiskCacheProducer";

    /* renamed from: f  reason: collision with root package name */
    public static final String f12302f = "cached_value_found";

    /* renamed from: g  reason: collision with root package name */
    public static final String f12303g = "encodedImageSize";

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f12304a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f12305b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f12306c;

    /* renamed from: d  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12307d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskCacheReadProducer.java */
    /* loaded from: classes2.dex */
    public class a implements bolts.g<com.facebook.imagepipeline.image.e, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f12308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Consumer f12310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0 f12311d;

        a(m0 m0Var, String str, Consumer consumer, k0 k0Var) {
            this.f12308a = m0Var;
            this.f12309b = str;
            this.f12310c = consumer;
            this.f12311d = k0Var;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(bolts.h<com.facebook.imagepipeline.image.e> hVar) throws Exception {
            if (n.f(hVar)) {
                this.f12308a.g(this.f12309b, n.f12301e, null);
                this.f12310c.a();
            } else if (hVar.F()) {
                this.f12308a.f(this.f12309b, n.f12301e, hVar.A(), null);
                n.this.f12307d.b(this.f12310c, this.f12311d);
            } else {
                com.facebook.imagepipeline.image.e B = hVar.B();
                if (B != null) {
                    m0 m0Var = this.f12308a;
                    String str = this.f12309b;
                    m0Var.e(str, n.f12301e, n.e(m0Var, str, true, B.z()));
                    this.f12308a.h(this.f12309b, n.f12301e, true);
                    this.f12310c.c(1.0f);
                    this.f12310c.b(B, 1);
                    B.close();
                } else {
                    m0 m0Var2 = this.f12308a;
                    String str2 = this.f12309b;
                    m0Var2.e(str2, n.f12301e, n.e(m0Var2, str2, false, 0));
                    n.this.f12307d.b(this.f12310c, this.f12311d);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskCacheReadProducer.java */
    /* loaded from: classes2.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f12313a;

        b(AtomicBoolean atomicBoolean) {
            this.f12313a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
        public void b() {
            this.f12313a.set(true);
        }
    }

    public n(com.facebook.imagepipeline.cache.e eVar, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.f fVar, i0<com.facebook.imagepipeline.image.e> i0Var) {
        this.f12304a = eVar;
        this.f12305b = eVar2;
        this.f12306c = fVar;
        this.f12307d = i0Var;
    }

    @VisibleForTesting
    @Nullable
    static Map<String, String> e(m0 m0Var, String str, boolean z4, int i4) {
        if (m0Var.d(str)) {
            if (z4) {
                return ImmutableMap.of("cached_value_found", String.valueOf(z4), "encodedImageSize", String.valueOf(i4));
            }
            return ImmutableMap.of("cached_value_found", String.valueOf(z4));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(bolts.h<?> hVar) {
        return hVar.D() || (hVar.F() && (hVar.A() instanceof CancellationException));
    }

    private void g(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        if (k0Var.f().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            consumer.b(null, 1);
        } else {
            this.f12307d.b(consumer, k0Var);
        }
    }

    private bolts.g<com.facebook.imagepipeline.image.e, Void> h(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        return new a(k0Var.getListener(), k0Var.getId(), consumer, k0Var);
    }

    private void i(AtomicBoolean atomicBoolean, k0 k0Var) {
        k0Var.c(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        ImageRequest a5 = k0Var.a();
        if (!a5.w()) {
            g(consumer, k0Var);
            return;
        }
        k0Var.getListener().b(k0Var.getId(), f12301e);
        com.facebook.cache.common.c d5 = this.f12306c.d(a5, k0Var.b());
        com.facebook.imagepipeline.cache.e eVar = a5.f() == ImageRequest.CacheChoice.SMALL ? this.f12305b : this.f12304a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.p(d5, atomicBoolean).m(h(consumer, k0Var));
        i(atomicBoolean, k0Var);
    }
}
