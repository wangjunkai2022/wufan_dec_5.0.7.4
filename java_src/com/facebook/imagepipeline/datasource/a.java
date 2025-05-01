package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.AbstractDataSource;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: AbstractProducerToDataSourceAdapter.java */
@ThreadSafe
/* loaded from: classes.dex */
public abstract class a<T> extends AbstractDataSource<T> implements com.facebook.imagepipeline.request.c {

    /* renamed from: g  reason: collision with root package name */
    private final q0 f11875g;

    /* renamed from: h  reason: collision with root package name */
    private final v0.c f11876h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractProducerToDataSourceAdapter.java */
    /* renamed from: com.facebook.imagepipeline.datasource.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0270a extends com.facebook.imagepipeline.producers.b<T> {
        C0270a() {
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void f() {
            a.this.w();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void g(Throwable th) {
            a.this.x(th);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(@Nullable T t4, int i4) {
            a.this.y(t4, i4);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void i(float f5) {
            a.this.o(f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(i0<T> i0Var, q0 q0Var, v0.c cVar) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractProducerToDataSourceAdapter()");
        }
        this.f11875g = q0Var;
        this.f11876h = cVar;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        cVar.a(q0Var.a(), q0Var.b(), q0Var.getId(), q0Var.e());
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        i0Var.b(v(), q0Var);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    private Consumer<T> v() {
        return new C0270a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w() {
        com.facebook.common.internal.h.o(isClosed());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Throwable th) {
        if (super.m(th)) {
            this.f11876h.i(this.f11875g.a(), this.f11875g.getId(), th, this.f11875g.e());
        }
    }

    @Override // com.facebook.imagepipeline.request.c
    public ImageRequest a() {
        return this.f11875g.a();
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
    public boolean close() {
        if (super.close()) {
            if (super.c()) {
                return true;
            }
            this.f11876h.k(this.f11875g.getId());
            this.f11875g.k();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(@Nullable T t4, int i4) {
        boolean d5 = com.facebook.imagepipeline.producers.b.d(i4);
        if (super.setResult(t4, d5) && d5) {
            this.f11876h.c(this.f11875g.a(), this.f11875g.getId(), this.f11875g.e());
        }
    }
}
