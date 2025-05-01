package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: ResizeAndRotateProducer.java */
/* loaded from: classes2.dex */
public class p0 implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12329f = "ResizeAndRotateProducer";

    /* renamed from: g  reason: collision with root package name */
    private static final String f12330g = "Image format";

    /* renamed from: h  reason: collision with root package name */
    private static final String f12331h = "Original size";

    /* renamed from: i  reason: collision with root package name */
    private static final String f12332i = "Requested size";

    /* renamed from: j  reason: collision with root package name */
    private static final String f12333j = "Transcoding result";

    /* renamed from: k  reason: collision with root package name */
    private static final String f12334k = "Transcoder id";
    @VisibleForTesting

    /* renamed from: l  reason: collision with root package name */
    static final int f12335l = 100;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12336a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.memory.g f12337b;

    /* renamed from: c  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12338c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12339d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.imagepipeline.transcoder.d f12340e;

    /* compiled from: ResizeAndRotateProducer.java */
    /* loaded from: classes.dex */
    private class a extends m<com.facebook.imagepipeline.image.e, com.facebook.imagepipeline.image.e> {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f12341i;

        /* renamed from: j  reason: collision with root package name */
        private final com.facebook.imagepipeline.transcoder.d f12342j;

        /* renamed from: k  reason: collision with root package name */
        private final k0 f12343k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f12344l;

        /* renamed from: m  reason: collision with root package name */
        private final JobScheduler f12345m;

        /* compiled from: ResizeAndRotateProducer.java */
        /* renamed from: com.facebook.imagepipeline.producers.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0277a implements JobScheduler.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0 f12347a;

            C0277a(p0 p0Var) {
                this.f12347a = p0Var;
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.d
            public void a(com.facebook.imagepipeline.image.e eVar, int i4) {
                a aVar = a.this;
                aVar.w(eVar, i4, (com.facebook.imagepipeline.transcoder.c) com.facebook.common.internal.h.i(aVar.f12342j.createImageTranscoder(eVar.t(), a.this.f12341i)));
            }
        }

        /* compiled from: ResizeAndRotateProducer.java */
        /* loaded from: classes2.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0 f12349a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Consumer f12350b;

            b(p0 p0Var, Consumer consumer) {
                this.f12349a = p0Var;
                this.f12350b = consumer;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void a() {
                if (a.this.f12343k.d()) {
                    a.this.f12345m.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void b() {
                a.this.f12345m.c();
                a.this.f12344l = true;
                this.f12350b.a();
            }
        }

        a(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var, boolean z4, com.facebook.imagepipeline.transcoder.d dVar) {
            super(consumer);
            this.f12344l = false;
            this.f12343k = k0Var;
            Boolean q4 = k0Var.a().q();
            this.f12341i = q4 != null ? q4.booleanValue() : z4;
            this.f12342j = dVar;
            this.f12345m = new JobScheduler(p0.this.f12336a, new C0277a(p0.this), 100);
            k0Var.c(new b(p0.this, consumer));
        }

        @Nullable
        private com.facebook.imagepipeline.image.e A(com.facebook.imagepipeline.image.e eVar) {
            RotationOptions r4 = this.f12343k.a().r();
            return (r4.h() || !r4.g()) ? eVar : y(eVar, r4.f());
        }

        @Nullable
        private com.facebook.imagepipeline.image.e B(com.facebook.imagepipeline.image.e eVar) {
            return (this.f12343k.a().r().c() || eVar.v() == 0 || eVar.v() == -1) ? eVar : y(eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(com.facebook.imagepipeline.image.e eVar, int i4, com.facebook.imagepipeline.transcoder.c cVar) {
            this.f12343k.getListener().b(this.f12343k.getId(), p0.f12329f);
            ImageRequest a5 = this.f12343k.a();
            com.facebook.common.memory.i c5 = p0.this.f12337b.c();
            try {
                com.facebook.imagepipeline.transcoder.b b5 = cVar.b(eVar, c5, a5.r(), a5.p(), null, 85);
                if (b5.a() != 2) {
                    Map<String, String> z4 = z(eVar, a5.p(), b5, cVar.getIdentifier());
                    com.facebook.common.references.a u4 = com.facebook.common.references.a.u(c5.a());
                    try {
                        com.facebook.imagepipeline.image.e eVar2 = new com.facebook.imagepipeline.image.e(u4);
                        eVar2.X(com.facebook.imageformat.b.f11528a);
                        eVar2.K();
                        this.f12343k.getListener().e(this.f12343k.getId(), p0.f12329f, z4);
                        if (b5.a() != 1) {
                            i4 |= 16;
                        }
                        p().b(eVar2, i4);
                        com.facebook.imagepipeline.image.e.d(eVar2);
                        return;
                    } finally {
                        com.facebook.common.references.a.h(u4);
                    }
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e5) {
                this.f12343k.getListener().f(this.f12343k.getId(), p0.f12329f, e5, null);
                if (com.facebook.imagepipeline.producers.b.d(i4)) {
                    p().onFailure(e5);
                }
            } finally {
                c5.close();
            }
        }

        private void x(com.facebook.imagepipeline.image.e eVar, int i4, com.facebook.imageformat.c cVar) {
            com.facebook.imagepipeline.image.e B;
            if (cVar != com.facebook.imageformat.b.f11528a && cVar != com.facebook.imageformat.b.f11538k) {
                B = A(eVar);
            } else {
                B = B(eVar);
            }
            p().b(B, i4);
        }

        @Nullable
        private com.facebook.imagepipeline.image.e y(com.facebook.imagepipeline.image.e eVar, int i4) {
            com.facebook.imagepipeline.image.e b5 = com.facebook.imagepipeline.image.e.b(eVar);
            eVar.close();
            if (b5 != null) {
                b5.Y(i4);
            }
            return b5;
        }

        @Nullable
        private Map<String, String> z(com.facebook.imagepipeline.image.e eVar, @Nullable com.facebook.imagepipeline.common.d dVar, @Nullable com.facebook.imagepipeline.transcoder.b bVar, @Nullable String str) {
            String str2;
            if (this.f12343k.getListener().d(this.f12343k.getId())) {
                String str3 = eVar.B() + "x" + eVar.r();
                if (dVar != null) {
                    str2 = dVar.f11726a + "x" + dVar.f11727b;
                } else {
                    str2 = "Unspecified";
                }
                HashMap hashMap = new HashMap();
                hashMap.put(p0.f12330g, String.valueOf(eVar.t()));
                hashMap.put(p0.f12331h, str3);
                hashMap.put(p0.f12332i, str2);
                hashMap.put("queueTime", String.valueOf(this.f12345m.f()));
                hashMap.put(p0.f12334k, str);
                hashMap.put(p0.f12333j, String.valueOf(bVar));
                return ImmutableMap.a(hashMap);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: C */
        public void h(@Nullable com.facebook.imagepipeline.image.e eVar, int i4) {
            if (this.f12344l) {
                return;
            }
            boolean d5 = com.facebook.imagepipeline.producers.b.d(i4);
            if (eVar == null) {
                if (d5) {
                    p().b(null, 1);
                    return;
                }
                return;
            }
            com.facebook.imageformat.c t4 = eVar.t();
            TriState h4 = p0.h(this.f12343k.a(), eVar, (com.facebook.imagepipeline.transcoder.c) com.facebook.common.internal.h.i(this.f12342j.createImageTranscoder(t4, this.f12341i)));
            if (d5 || h4 != TriState.UNSET) {
                if (h4 != TriState.YES) {
                    x(eVar, i4, t4);
                } else if (this.f12345m.k(eVar, i4)) {
                    if (d5 || this.f12343k.d()) {
                        this.f12345m.h();
                    }
                }
            }
        }
    }

    public p0(Executor executor, com.facebook.common.memory.g gVar, i0<com.facebook.imagepipeline.image.e> i0Var, boolean z4, com.facebook.imagepipeline.transcoder.d dVar) {
        this.f12336a = (Executor) com.facebook.common.internal.h.i(executor);
        this.f12337b = (com.facebook.common.memory.g) com.facebook.common.internal.h.i(gVar);
        this.f12338c = (i0) com.facebook.common.internal.h.i(i0Var);
        this.f12340e = (com.facebook.imagepipeline.transcoder.d) com.facebook.common.internal.h.i(dVar);
        this.f12339d = z4;
    }

    private static boolean f(RotationOptions rotationOptions, com.facebook.imagepipeline.image.e eVar) {
        return !rotationOptions.c() && (com.facebook.imagepipeline.transcoder.e.e(rotationOptions, eVar) != 0 || g(rotationOptions, eVar));
    }

    private static boolean g(RotationOptions rotationOptions, com.facebook.imagepipeline.image.e eVar) {
        if (rotationOptions.g() && !rotationOptions.c()) {
            return com.facebook.imagepipeline.transcoder.e.f12506g.contains(Integer.valueOf(eVar.l()));
        }
        eVar.V(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TriState h(ImageRequest imageRequest, com.facebook.imagepipeline.image.e eVar, com.facebook.imagepipeline.transcoder.c cVar) {
        if (eVar != null && eVar.t() != com.facebook.imageformat.c.f11540c) {
            if (!cVar.c(eVar.t())) {
                return TriState.NO;
            }
            return TriState.valueOf(f(imageRequest.r(), eVar) || cVar.a(eVar, imageRequest.r(), imageRequest.p()));
        }
        return TriState.UNSET;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        this.f12338c.b(new a(consumer, k0Var, this.f12339d, this.f12340e), k0Var);
    }
}
