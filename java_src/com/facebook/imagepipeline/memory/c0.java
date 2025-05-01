package com.facebook.imagepipeline.memory;

import javax.annotation.concurrent.Immutable;
/* compiled from: PoolConfig.java */
@Immutable
/* loaded from: classes2.dex */
public class c0 {

    /* renamed from: m  reason: collision with root package name */
    public static final int f11972m = 4194304;

    /* renamed from: a  reason: collision with root package name */
    private final e0 f11973a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f11974b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f11975c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.memory.c f11976d;

    /* renamed from: e  reason: collision with root package name */
    private final e0 f11977e;

    /* renamed from: f  reason: collision with root package name */
    private final f0 f11978f;

    /* renamed from: g  reason: collision with root package name */
    private final e0 f11979g;

    /* renamed from: h  reason: collision with root package name */
    private final f0 f11980h;

    /* renamed from: i  reason: collision with root package name */
    private final String f11981i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11982j;

    /* renamed from: k  reason: collision with root package name */
    private final int f11983k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f11984l;

    /* compiled from: PoolConfig.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private e0 f11985a;

        /* renamed from: b  reason: collision with root package name */
        private f0 f11986b;

        /* renamed from: c  reason: collision with root package name */
        private e0 f11987c;

        /* renamed from: d  reason: collision with root package name */
        private com.facebook.common.memory.c f11988d;

        /* renamed from: e  reason: collision with root package name */
        private e0 f11989e;

        /* renamed from: f  reason: collision with root package name */
        private f0 f11990f;

        /* renamed from: g  reason: collision with root package name */
        private e0 f11991g;

        /* renamed from: h  reason: collision with root package name */
        private f0 f11992h;

        /* renamed from: i  reason: collision with root package name */
        private String f11993i;

        /* renamed from: j  reason: collision with root package name */
        private int f11994j;

        /* renamed from: k  reason: collision with root package name */
        private int f11995k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f11996l;

        public c0 m() {
            return new c0(this);
        }

        public b n(int i4) {
            this.f11995k = i4;
            return this;
        }

        public b o(int i4) {
            this.f11994j = i4;
            return this;
        }

        public b p(e0 e0Var) {
            this.f11985a = (e0) com.facebook.common.internal.h.i(e0Var);
            return this;
        }

        public b q(f0 f0Var) {
            this.f11986b = (f0) com.facebook.common.internal.h.i(f0Var);
            return this;
        }

        public b r(String str) {
            this.f11993i = str;
            return this;
        }

        public b s(e0 e0Var) {
            this.f11987c = e0Var;
            return this;
        }

        public b t(com.facebook.common.memory.c cVar) {
            this.f11988d = cVar;
            return this;
        }

        public b u(e0 e0Var) {
            this.f11989e = (e0) com.facebook.common.internal.h.i(e0Var);
            return this;
        }

        public b v(f0 f0Var) {
            this.f11990f = (f0) com.facebook.common.internal.h.i(f0Var);
            return this;
        }

        public void w(boolean z4) {
            this.f11996l = z4;
        }

        public b x(e0 e0Var) {
            this.f11991g = (e0) com.facebook.common.internal.h.i(e0Var);
            return this;
        }

        public b y(f0 f0Var) {
            this.f11992h = (f0) com.facebook.common.internal.h.i(f0Var);
            return this;
        }

        private b() {
        }
    }

    public static b m() {
        return new b();
    }

    public int a() {
        return this.f11983k;
    }

    public int b() {
        return this.f11982j;
    }

    public e0 c() {
        return this.f11973a;
    }

    public f0 d() {
        return this.f11974b;
    }

    public String e() {
        return this.f11981i;
    }

    public e0 f() {
        return this.f11975c;
    }

    public e0 g() {
        return this.f11977e;
    }

    public f0 h() {
        return this.f11978f;
    }

    public com.facebook.common.memory.c i() {
        return this.f11976d;
    }

    public e0 j() {
        return this.f11979g;
    }

    public f0 k() {
        return this.f11980h;
    }

    public boolean l() {
        return this.f11984l;
    }

    private c0(b bVar) {
        e0 e0Var;
        f0 f0Var;
        e0 e0Var2;
        com.facebook.common.memory.c cVar;
        e0 e0Var3;
        f0 f0Var2;
        e0 e0Var4;
        f0 f0Var3;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("PoolConfig()");
        }
        if (bVar.f11985a != null) {
            e0Var = bVar.f11985a;
        } else {
            e0Var = k.a();
        }
        this.f11973a = e0Var;
        if (bVar.f11986b != null) {
            f0Var = bVar.f11986b;
        } else {
            f0Var = z.h();
        }
        this.f11974b = f0Var;
        if (bVar.f11987c != null) {
            e0Var2 = bVar.f11987c;
        } else {
            e0Var2 = m.b();
        }
        this.f11975c = e0Var2;
        if (bVar.f11988d != null) {
            cVar = bVar.f11988d;
        } else {
            cVar = com.facebook.common.memory.d.c();
        }
        this.f11976d = cVar;
        if (bVar.f11989e != null) {
            e0Var3 = bVar.f11989e;
        } else {
            e0Var3 = n.a();
        }
        this.f11977e = e0Var3;
        if (bVar.f11990f != null) {
            f0Var2 = bVar.f11990f;
        } else {
            f0Var2 = z.h();
        }
        this.f11978f = f0Var2;
        if (bVar.f11991g != null) {
            e0Var4 = bVar.f11991g;
        } else {
            e0Var4 = l.a();
        }
        this.f11979g = e0Var4;
        if (bVar.f11992h != null) {
            f0Var3 = bVar.f11992h;
        } else {
            f0Var3 = z.h();
        }
        this.f11980h = f0Var3;
        this.f11981i = bVar.f11993i == null ? "legacy" : bVar.f11993i;
        this.f11982j = bVar.f11994j;
        this.f11983k = bVar.f11995k > 0 ? bVar.f11995k : 4194304;
        this.f11984l = bVar.f11996l;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }
}
