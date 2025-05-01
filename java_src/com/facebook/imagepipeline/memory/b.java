package com.facebook.imagepipeline.memory;
/* compiled from: BitmapCounterConfig.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final int f11963b = 384;

    /* renamed from: a  reason: collision with root package name */
    private int f11964a;

    /* compiled from: BitmapCounterConfig.java */
    /* renamed from: com.facebook.imagepipeline.memory.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0273b {

        /* renamed from: a  reason: collision with root package name */
        private int f11965a;

        public b a() {
            return new b(this);
        }

        public int b() {
            return this.f11965a;
        }

        public C0273b c(int i4) {
            this.f11965a = i4;
            return this;
        }

        private C0273b() {
            this.f11965a = 384;
        }
    }

    public b(C0273b c0273b) {
        this.f11964a = 384;
        this.f11964a = c0273b.b();
    }

    public static C0273b b() {
        return new C0273b();
    }

    public int a() {
        return this.f11964a;
    }

    public void c(int i4) {
        this.f11964a = i4;
    }
}
