package com.facebook.imagepipeline.producers;

import com.facebook.common.util.TriState;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: WebpTranscodeProducer.java */
/* loaded from: classes2.dex */
public class z0 implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12448d = "WebpTranscodeProducer";

    /* renamed from: e  reason: collision with root package name */
    private static final int f12449e = 80;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12450a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.memory.g f12451b;

    /* renamed from: c  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12452c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebpTranscodeProducer.java */
    /* loaded from: classes2.dex */
    public class a extends r0<com.facebook.imagepipeline.image.e> {

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.image.e f12453l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Consumer consumer, m0 m0Var, String str, String str2, com.facebook.imagepipeline.image.e eVar) {
            super(consumer, m0Var, str, str2);
            this.f12453l = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        public void d() {
            com.facebook.imagepipeline.image.e.d(this.f12453l);
            super.d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        public void e(Exception exc) {
            com.facebook.imagepipeline.image.e.d(this.f12453l);
            super.e(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        /* renamed from: j */
        public void b(com.facebook.imagepipeline.image.e eVar) {
            com.facebook.imagepipeline.image.e.d(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.common.executors.h
        /* renamed from: k */
        public com.facebook.imagepipeline.image.e c() throws Exception {
            com.facebook.common.memory.i c5 = z0.this.f12451b.c();
            try {
                z0.g(this.f12453l, c5);
                com.facebook.common.references.a u4 = com.facebook.common.references.a.u(c5.a());
                com.facebook.imagepipeline.image.e eVar = new com.facebook.imagepipeline.image.e(u4);
                eVar.g(this.f12453l);
                com.facebook.common.references.a.h(u4);
                return eVar;
            } finally {
                c5.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        /* renamed from: l */
        public void f(com.facebook.imagepipeline.image.e eVar) {
            com.facebook.imagepipeline.image.e.d(this.f12453l);
            super.f(eVar);
        }
    }

    /* compiled from: WebpTranscodeProducer.java */
    /* loaded from: classes.dex */
    private class b extends m<com.facebook.imagepipeline.image.e, com.facebook.imagepipeline.image.e> {

        /* renamed from: i  reason: collision with root package name */
        private final k0 f12455i;

        /* renamed from: j  reason: collision with root package name */
        private TriState f12456j;

        public b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
            super(consumer);
            this.f12455i = k0Var;
            this.f12456j = TriState.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(@Nullable com.facebook.imagepipeline.image.e eVar, int i4) {
            if (this.f12456j == TriState.UNSET && eVar != null) {
                this.f12456j = z0.h(eVar);
            }
            if (this.f12456j == TriState.NO) {
                p().b(eVar, i4);
            } else if (com.facebook.imagepipeline.producers.b.d(i4)) {
                if (this.f12456j == TriState.YES && eVar != null) {
                    z0.this.i(eVar, p(), this.f12455i);
                } else {
                    p().b(eVar, i4);
                }
            }
        }
    }

    public z0(Executor executor, com.facebook.common.memory.g gVar, i0<com.facebook.imagepipeline.image.e> i0Var) {
        this.f12450a = (Executor) com.facebook.common.internal.h.i(executor);
        this.f12451b = (com.facebook.common.memory.g) com.facebook.common.internal.h.i(gVar);
        this.f12452c = (i0) com.facebook.common.internal.h.i(i0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(com.facebook.imagepipeline.image.e eVar, com.facebook.common.memory.i iVar) throws Exception {
        InputStream u4 = eVar.u();
        com.facebook.imageformat.c d5 = com.facebook.imageformat.d.d(u4);
        if (d5 != com.facebook.imageformat.b.f11533f && d5 != com.facebook.imageformat.b.f11535h) {
            if (d5 != com.facebook.imageformat.b.f11534g && d5 != com.facebook.imageformat.b.f11536i) {
                throw new IllegalArgumentException("Wrong image format");
            }
            com.facebook.imagepipeline.nativecode.f.a().a(u4, iVar);
            eVar.X(com.facebook.imageformat.b.f11529b);
            return;
        }
        com.facebook.imagepipeline.nativecode.f.a().c(u4, iVar, 80);
        eVar.X(com.facebook.imageformat.b.f11528a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TriState h(com.facebook.imagepipeline.image.e eVar) {
        com.facebook.common.internal.h.i(eVar);
        com.facebook.imageformat.c d5 = com.facebook.imageformat.d.d(eVar.u());
        if (com.facebook.imageformat.b.b(d5)) {
            com.facebook.imagepipeline.nativecode.e a5 = com.facebook.imagepipeline.nativecode.f.a();
            if (a5 == null) {
                return TriState.NO;
            }
            return TriState.valueOf(!a5.b(d5));
        } else if (d5 == com.facebook.imageformat.c.f11540c) {
            return TriState.UNSET;
        } else {
            return TriState.NO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(com.facebook.imagepipeline.image.e eVar, Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        com.facebook.common.internal.h.i(eVar);
        this.f12450a.execute(new a(consumer, k0Var.getListener(), f12448d, k0Var.getId(), com.facebook.imagepipeline.image.e.b(eVar)));
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        this.f12452c.b(new b(consumer, k0Var), k0Var);
    }
}
