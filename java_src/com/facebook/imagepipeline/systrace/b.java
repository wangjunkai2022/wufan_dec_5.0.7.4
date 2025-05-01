package com.facebook.imagepipeline.systrace;

import javax.annotation.Nullable;
/* compiled from: FrescoSystrace.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final InterfaceC0279b f12495a = new c();
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f12496b = null;

    /* compiled from: FrescoSystrace.java */
    /* renamed from: com.facebook.imagepipeline.systrace.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0279b {
        InterfaceC0279b a(String str, Object obj);

        InterfaceC0279b b(String str, long j4);

        InterfaceC0279b c(String str, int i4);

        InterfaceC0279b d(String str, double d5);

        void flush();
    }

    /* compiled from: FrescoSystrace.java */
    /* loaded from: classes2.dex */
    private static final class c implements InterfaceC0279b {
        private c() {
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public InterfaceC0279b a(String str, Object obj) {
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public InterfaceC0279b b(String str, long j4) {
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public InterfaceC0279b c(String str, int i4) {
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public InterfaceC0279b d(String str, double d5) {
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public void flush() {
        }
    }

    /* compiled from: FrescoSystrace.java */
    /* loaded from: classes2.dex */
    public interface d {
        void a(String str);

        InterfaceC0279b b(String str);

        void c();

        boolean d();
    }

    private b() {
    }

    public static void a(String str) {
        d().a(str);
    }

    public static InterfaceC0279b b(String str) {
        return d().b(str);
    }

    public static void c() {
        d().c();
    }

    private static d d() {
        if (f12496b == null) {
            synchronized (b.class) {
                if (f12496b == null) {
                    f12496b = new com.facebook.imagepipeline.systrace.a();
                }
            }
        }
        return f12496b;
    }

    public static boolean e() {
        return d().d();
    }

    public static void f(d dVar) {
        f12496b = dVar;
    }
}
