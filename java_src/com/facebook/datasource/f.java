package com.facebook.datasource;

import com.facebook.common.internal.k;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: FirstAvailableDataSourceSupplier.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class f<T> implements k<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<k<c<T>>> f10962a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirstAvailableDataSourceSupplier.java */
    @ThreadSafe
    /* loaded from: classes.dex */
    public class b extends AbstractDataSource<T> {

        /* renamed from: g  reason: collision with root package name */
        private int f10963g = 0;

        /* renamed from: h  reason: collision with root package name */
        private c<T> f10964h = null;

        /* renamed from: i  reason: collision with root package name */
        private c<T> f10965i = null;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FirstAvailableDataSourceSupplier.java */
        /* loaded from: classes2.dex */
        public class a implements e<T> {
            private a() {
            }

            @Override // com.facebook.datasource.e
            public void a(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void b(c<T> cVar) {
                b.this.z(cVar);
            }

            @Override // com.facebook.datasource.e
            public void c(c<T> cVar) {
                if (cVar.b()) {
                    b.this.A(cVar);
                } else if (cVar.c()) {
                    b.this.z(cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void d(c<T> cVar) {
                b.this.o(Math.max(b.this.getProgress(), cVar.getProgress()));
            }
        }

        public b() {
            if (C()) {
                return;
            }
            m(new RuntimeException("No data source supplier or supplier returned null."));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A(c<T> cVar) {
            y(cVar, cVar.c());
            if (cVar == w()) {
                setResult(null, cVar.c());
            }
        }

        private synchronized boolean B(c<T> cVar) {
            if (isClosed()) {
                return false;
            }
            this.f10964h = cVar;
            return true;
        }

        private boolean C() {
            k<c<T>> x4 = x();
            c<T> cVar = x4 != null ? x4.get() : null;
            if (B(cVar) && cVar != null) {
                cVar.e(new a(), com.facebook.common.executors.a.a());
                return true;
            }
            v(cVar);
            return false;
        }

        private synchronized boolean u(c<T> cVar) {
            if (!isClosed() && cVar == this.f10964h) {
                this.f10964h = null;
                return true;
            }
            return false;
        }

        private void v(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        @Nullable
        private synchronized c<T> w() {
            return this.f10965i;
        }

        @Nullable
        private synchronized k<c<T>> x() {
            if (isClosed() || this.f10963g >= f.this.f10962a.size()) {
                return null;
            }
            List list = f.this.f10962a;
            int i4 = this.f10963g;
            this.f10963g = i4 + 1;
            return (k) list.get(i4);
        }

        private void y(c<T> cVar, boolean z4) {
            c<T> cVar2;
            synchronized (this) {
                if (cVar == this.f10964h && cVar != (cVar2 = this.f10965i)) {
                    if (cVar2 != null && !z4) {
                        cVar2 = null;
                        v(cVar2);
                    }
                    this.f10965i = cVar;
                    v(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(c<T> cVar) {
            if (u(cVar)) {
                if (cVar != w()) {
                    v(cVar);
                }
                if (C()) {
                    return;
                }
                m(cVar.d());
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
        public synchronized boolean b() {
            boolean z4;
            c<T> w4 = w();
            if (w4 != null) {
                z4 = w4.b();
            }
            return z4;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
        public boolean close() {
            synchronized (this) {
                if (super.close()) {
                    c<T> cVar = this.f10964h;
                    this.f10964h = null;
                    c<T> cVar2 = this.f10965i;
                    this.f10965i = null;
                    v(cVar2);
                    v(cVar);
                    return true;
                }
                return false;
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
        @Nullable
        public synchronized T g() {
            c<T> w4;
            w4 = w();
            return w4 != null ? w4.g() : null;
        }
    }

    private f(List<k<c<T>>> list) {
        com.facebook.common.internal.h.e(!list.isEmpty(), "List of suppliers is empty!");
        this.f10962a = list;
    }

    public static <T> f<T> b(List<k<c<T>>> list) {
        return new f<>(list);
    }

    @Override // com.facebook.common.internal.k
    /* renamed from: c */
    public c<T> get() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return com.facebook.common.internal.g.a(this.f10962a, ((f) obj).f10962a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10962a.hashCode();
    }

    public String toString() {
        return com.facebook.common.internal.g.f(this).f("list", this.f10962a).toString();
    }
}
