package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.AbstractDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: ListDataSource.java */
/* loaded from: classes.dex */
public class f<T> extends AbstractDataSource<List<com.facebook.common.references.a<T>>> {

    /* renamed from: g  reason: collision with root package name */
    private final com.facebook.datasource.c<com.facebook.common.references.a<T>>[] f11878g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    private int f11879h = 0;

    /* compiled from: ListDataSource.java */
    /* loaded from: classes2.dex */
    private class b implements com.facebook.datasource.e<com.facebook.common.references.a<T>> {
        @GuardedBy("InternalDataSubscriber.this")

        /* renamed from: a  reason: collision with root package name */
        boolean f11880a;

        private b() {
            this.f11880a = false;
        }

        private synchronized boolean e() {
            if (this.f11880a) {
                return false;
            }
            this.f11880a = true;
            return true;
        }

        @Override // com.facebook.datasource.e
        public void a(com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar) {
            f.this.z();
        }

        @Override // com.facebook.datasource.e
        public void b(com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar) {
            f.this.A(cVar);
        }

        @Override // com.facebook.datasource.e
        public void c(com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar) {
            if (cVar.c() && e()) {
                f.this.B();
            }
        }

        @Override // com.facebook.datasource.e
        public void d(com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar) {
            f.this.C();
        }
    }

    protected f(com.facebook.datasource.c<com.facebook.common.references.a<T>>[] cVarArr) {
        this.f11878g = cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar) {
        m(cVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (y()) {
            setResult(null, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        float f5 = 0.0f;
        for (com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar : this.f11878g) {
            f5 += cVar.getProgress();
        }
        o(f5 / this.f11878g.length);
    }

    public static <T> f<T> w(com.facebook.datasource.c<com.facebook.common.references.a<T>>... cVarArr) {
        com.facebook.common.internal.h.i(cVarArr);
        com.facebook.common.internal.h.o(cVarArr.length > 0);
        f<T> fVar = new f<>(cVarArr);
        for (com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar : cVarArr) {
            if (cVar != null) {
                cVar.e(new b(), com.facebook.common.executors.a.a());
            }
        }
        return fVar;
    }

    private synchronized boolean y() {
        int i4;
        i4 = this.f11879h + 1;
        this.f11879h = i4;
        return i4 == this.f11878g.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        m(new CancellationException());
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
    public synchronized boolean b() {
        boolean z4;
        if (!isClosed()) {
            z4 = this.f11879h == this.f11878g.length;
        }
        return z4;
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
    public boolean close() {
        if (super.close()) {
            for (com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar : this.f11878g) {
                cVar.close();
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
    @Nullable
    /* renamed from: x */
    public synchronized List<com.facebook.common.references.a<T>> g() {
        if (b()) {
            ArrayList arrayList = new ArrayList(this.f11878g.length);
            for (com.facebook.datasource.c<com.facebook.common.references.a<T>> cVar : this.f11878g) {
                arrayList.add(cVar.g());
            }
            return arrayList;
        }
        return null;
    }
}
