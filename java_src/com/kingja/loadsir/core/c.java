package com.kingja.loadsir.core;

import androidx.annotation.NonNull;
import com.kingja.loadsir.callback.Callback;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LoadSir.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f55216b;

    /* renamed from: a  reason: collision with root package name */
    private b f55217a;

    /* compiled from: LoadSir.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private List<Callback> f55218a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private List<k2.b> f55219b;

        /* renamed from: c  reason: collision with root package name */
        private Class<? extends Callback> f55220c;

        public b() {
            ArrayList arrayList = new ArrayList();
            this.f55219b = arrayList;
            arrayList.add(new k2.a());
            this.f55219b.add(new k2.c());
        }

        public b a(@NonNull Callback callback) {
            this.f55218a.add(callback);
            return this;
        }

        public b b(k2.b bVar) {
            this.f55219b.add(bVar);
            return this;
        }

        public c c() {
            return new c(this);
        }

        public void d() {
            c.c().g(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<Callback> e() {
            return this.f55218a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Class<? extends Callback> f() {
            return this.f55220c;
        }

        public List<k2.b> g() {
            return this.f55219b;
        }

        public b h(@NonNull Class<? extends Callback> cls) {
            this.f55220c = cls;
            return this;
        }
    }

    public static b b() {
        return new b();
    }

    public static c c() {
        if (f55216b == null) {
            synchronized (c.class) {
                if (f55216b == null) {
                    f55216b = new c();
                }
            }
        }
        return f55216b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(@NonNull b bVar) {
        this.f55217a = bVar;
    }

    public com.kingja.loadsir.core.b d(@NonNull Object obj) {
        return f(obj, null, null);
    }

    public com.kingja.loadsir.core.b e(Object obj, Callback.OnReloadListener onReloadListener) {
        return f(obj, onReloadListener, null);
    }

    public <T> com.kingja.loadsir.core.b f(Object obj, Callback.OnReloadListener onReloadListener, com.kingja.loadsir.core.a<T> aVar) {
        return new com.kingja.loadsir.core.b(aVar, j2.b.a(obj, this.f55217a.g()).a(obj, onReloadListener), this.f55217a);
    }

    private c() {
        this.f55217a = new b();
    }

    private c(b bVar) {
        this.f55217a = bVar;
    }
}
