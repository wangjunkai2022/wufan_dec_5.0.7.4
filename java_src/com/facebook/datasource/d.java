package com.facebook.datasource;

import com.facebook.common.internal.k;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: DataSources.java */
/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: DataSources.java */
    /* loaded from: classes2.dex */
    static class a<T> implements k<com.facebook.datasource.c<T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f10957a;

        a(Throwable th) {
            this.f10957a = th;
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public com.facebook.datasource.c<T> get() {
            return d.c(this.f10957a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: DataSources.java */
    /* loaded from: classes2.dex */
    static class b<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0256d f10958a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f10959b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0256d f10960c;

        b(C0256d c0256d, CountDownLatch countDownLatch, C0256d c0256d2) {
            this.f10958a = c0256d;
            this.f10959b = countDownLatch;
            this.f10960c = c0256d2;
        }

        @Override // com.facebook.datasource.e
        public void a(com.facebook.datasource.c<T> cVar) {
            this.f10959b.countDown();
        }

        @Override // com.facebook.datasource.e
        public void b(com.facebook.datasource.c<T> cVar) {
            try {
                this.f10960c.f10961a = (T) cVar.d();
            } finally {
                this.f10959b.countDown();
            }
        }

        @Override // com.facebook.datasource.e
        public void c(com.facebook.datasource.c<T> cVar) {
            if (cVar.c()) {
                try {
                    this.f10958a.f10961a = cVar.g();
                } finally {
                    this.f10959b.countDown();
                }
            }
        }

        @Override // com.facebook.datasource.e
        public void d(com.facebook.datasource.c<T> cVar) {
        }
    }

    /* compiled from: DataSources.java */
    /* loaded from: classes2.dex */
    static class c implements Executor {
        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private d() {
    }

    public static <T> k<com.facebook.datasource.c<T>> a(Throwable th) {
        return new a(th);
    }

    public static <T> com.facebook.datasource.c<T> b(T t4) {
        i s4 = i.s();
        s4.setResult(t4);
        return s4;
    }

    public static <T> com.facebook.datasource.c<T> c(Throwable th) {
        i s4 = i.s();
        s4.m(th);
        return s4;
    }

    @Nullable
    public static <T> T d(com.facebook.datasource.c<T> cVar) throws Throwable {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C0256d c0256d = new C0256d(null);
        C0256d c0256d2 = new C0256d(null);
        cVar.e(new b(c0256d, countDownLatch, c0256d2), new c());
        countDownLatch.await();
        T t4 = c0256d2.f10961a;
        if (t4 == null) {
            return c0256d.f10961a;
        }
        throw ((Throwable) t4);
    }

    /* compiled from: DataSources.java */
    /* renamed from: com.facebook.datasource.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0256d<T> {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public T f10961a;

        private C0256d() {
            this.f10961a = null;
        }

        /* synthetic */ C0256d(a aVar) {
            this();
        }
    }
}
